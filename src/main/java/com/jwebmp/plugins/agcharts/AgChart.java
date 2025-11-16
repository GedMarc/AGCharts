package com.jwebmp.plugins.agcharts;

import com.guicedee.client.IGuiceContext;
import com.guicedee.guicedservlets.websockets.options.IGuicedWebSocket;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.angular.client.DynamicData;
import com.jwebmp.core.base.angular.client.annotations.constructors.NgConstructorBody;
import com.jwebmp.core.base.angular.client.annotations.functions.NgAfterViewInit;
import com.jwebmp.core.base.angular.client.annotations.functions.NgOnDestroy;
import com.jwebmp.core.base.angular.client.annotations.references.NgComponentReference;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.annotations.structures.NgField;
import com.jwebmp.core.base.angular.client.annotations.structures.NgMethod;
import com.jwebmp.core.base.angular.client.annotations.structures.NgSignal;
import com.jwebmp.core.base.angular.client.services.EventBusService;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.angular.implementations.WebSocketAbstractCallReceiver;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import io.smallrye.mutiny.Uni;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Base AG Charts component for JWebMP.
 * <p>
 * Renders the ag-charts-angular component and binds a single [options] input.
 * Behaviour mirrors the ChartJS integration pattern: options are loaded via
 * the EventBus/WebSocket pipeline.
 */
@NgComponentReference(EventBusService.class)
@NgComponentReference(DynamicData.class)

@NgImportReference(value = "AgCharts", reference = "ag-charts-angular")
@NgImportModule("AgCharts")

@NgImportReference(value = "v4 as uuidv4", reference = "uuid")


// Angular glue - holds runtime state and behaviour.
@NgSignal(type = "any | undefined", referenceName = "chartOptions", value = "undefined")
@NgField("readonly handlerId : string;")
@NgConstructorBody("this.handlerId = this.generateHandlerId();")
@NgField("private subscriptionOptions?: Subscription;")
@NgField("private subscriptionData?: Subscription;")
@NgField("chartData: any; // optional separate data payload")
@NgField("readonly chartReady = computed(()=>!!this.chartOptions());")

// Subscribe to EventBus for options updates.
@NgMethod("initializeOptionsListener() {\n" +
        "  const observer = {\n" +
        "    next: (data: any) => this.handleOptionsEvent(data),\n" +
        "    error: (err: any) => console.error('[AgChart] options listener error:', err),\n" +
        "    complete: () => console.log('[AgChart] options listener completed'),\n" +
        "  };\n" +
        "  this.subscriptionOptions = this.eventBusService\n" +
        "    .listen(this.listenerName + 'Options', this.handlerId)\n" +
        "    .subscribe(observer);\n" +
        "}")

// Apply options payloads (supports JSON string or object).
@NgMethod("handleOptionsEvent(data: any) {\n" +
        "  try {\n" +
        "    const payload = typeof data === 'string' ? JSON.parse(data) : data;\n" +
        "    // Some servers wrap in { out: [...] }\n" +
        "    const options = payload && payload.out && payload.out[0] ? payload.out[0] : payload;\n" +
        "    this.chartOptions.set(options);\n" +
        "  } catch (e) {\n" +
        "    console.error('[AgChart] Failed to parse options payload', e, data);\n" +
        "  }\n" +
        "}")

// Request initial options from the server via the event bus (WebSocket behind the scenes).
@NgMethod("fetchOptions() {\n" +
        "  this.eventBusService.send(this.listenerName + 'Options', {\n" +
        "    className: this.clazzName,\n" +
        "    listenerName: this.listenerName + 'Options'\n" +
        "  }, this.listenerName + 'Options');\n" +
        "}")

// Listen for server-pushed data updates
@NgMethod("initializeDataListener() {\n" +
        "  const observer = {\n" +
        "    next: (data: any) => this.handleDataEvent(data),\n" +
        "    error: (err: any) => console.error('[AgChart] data listener error:', err),\n" +
        "    complete: () => console.log('[AgChart] data listener completed'),\n" +
        "  };\n" +
        "  this.subscriptionData = this.eventBusService\n" +
        "    .listen(this.listenerName + 'Data', this.handlerId)\n" +
        "    .subscribe(observer);\n" +
        "}")

// Apply incoming data into options structure without overwriting other config
@NgMethod("handleDataEvent(data: any) {\n" +
        "  try {\n" +
        "    const payload = typeof data === 'string' ? JSON.parse(data) : data;\n" +
        "    const value = payload && payload.out && payload.out[0] ? payload.out[0] : payload;\n" +
        "    this.chartData = value;\n" +
        "    const current = this.chartOptions();\n" +
        "    if (!current) { return; }\n" +
        "    let updated;\n" +
        "    if (Array.isArray(current.series) && current.series.length > 0) {\n" +
        "      // Common case: first series data\n" +
        "      updated = { ...current, series: [ { ...current.series[0], data: value }, ...current.series.slice(1) ] };\n" +
        "    } else {\n" +
        "      // Fallback: place on options.data\n" +
        "      updated = { ...current, data: value };\n" +
        "    }\n" +
        "    this.chartOptions.set(updated);\n" +
        "  } catch (e) {\n" +
        "    console.error('[AgChart] Failed to parse data payload', e, data);\n" +
        "  }\n" +
        "}")

// Request initial data from server
@NgMethod("fetchDataChannel() {\n" +
        "  this.eventBusService.send(this.listenerName + 'Data', {\n" +
        "    className: this.clazzName,\n" +
        "    listenerName: this.listenerName + 'Data'\n" +
        "  }, this.listenerName + 'Data');\n" +
        "}")

@NgAfterViewInit("this.initializeOptionsListener(); this.initializeDataListener(); this.fetchOptions(); this.fetchDataChannel();")
@NgOnDestroy("this.subscriptionOptions?.unsubscribe(); this.subscriptionData?.unsubscribe(); this.eventBusService.unregisterListener(this.listenerName + 'Options', this.handlerId); this.eventBusService.unregisterListener(this.listenerName + 'Data', this.handlerId);")

@NgImportReference(value = "Subscription", reference = "rxjs")
@NgMethod("""
        private generateHandlerId(): string {
            return `${this.listenerName}-${uuidv4()}`;
        }
        """)


public abstract class AgChart<J extends AgChart<J>> extends DivSimple<J> implements INgComponent<J>
{
    public AgChart()
    {
        super();
    }

    public AgChart(String id)
    {
        setID(id);
        setTag("ag-charts");
        addAttribute("[options]", "chartOptions()");
        addAttribute("*ngIf", "chartReady() && chartOptions()");

        addConfiguration(AnnotationUtils.getNgField("readonly listenerName = '" + getID() + "';"));
        addConfiguration(AnnotationUtils.getNgField("readonly clazzName = '" + getClass().getCanonicalName() + "';"));
        registerWebSocketListeners();
    }

    /**
     * Server-side: provide the initial chart options, reactively.
     */
    public abstract Uni<AgChartOptions<?>> getInitialOptions();

    /**
     * Server-side: provide initial chart data separately from options (optional), reactively.
     * If the emitted item is null, no data message will be sent unless the server pushes later.
     */
    public Uni<Object> getInitialData()
    {
        return Uni.createFrom()
                  .nullItem();
    }

    protected String getListenerName()
    {
        return getID();
    }

    protected String getListenerNameOptions()
    {
        return getID() + "Options";
    }

    protected String getListenerNameData()
    {
        return getID() + "Data";
    }

    protected void registerWebSocketListeners()
    {
        if (!IGuicedWebSocket.isWebSocketReceiverRegistered(getListenerNameOptions()))
        {
            IGuicedWebSocket.addWebSocketMessageReceiver(new InitialOptionsReceiver(getListenerNameOptions(), getClass()));
        }
        if (!IGuicedWebSocket.isWebSocketReceiverRegistered(getListenerNameData()))
        {
            IGuicedWebSocket.addWebSocketMessageReceiver(new DataReceiver(getListenerNameData(), getClass()));
        }
    }

    @Override
    public List<String> styles()
    {
        List<String> out = INgComponent.super.styles();
        out.add(":host { display: block; position: relative; }");
        return out;
    }

    /**
     * Receives initial options over WebSocket and returns them to the client.
     */
    private static class InitialOptionsReceiver extends WebSocketAbstractCallReceiver<InitialOptionsReceiver>
    {
        private String listenerName;
        private Class<? extends AgChart> actionClass;

        public InitialOptionsReceiver() {}

        public InitialOptionsReceiver(String listenerName, Class<? extends AgChart> actionClass)
        {
            this.listenerName = listenerName;
            this.actionClass = actionClass;
        }

        public Set<String> messageNames()
        {
            return Set.of(listenerName);
        }


        @Override
        public String getMessageDirector()
        {
            return listenerName;
        }

        @Override
        public io.smallrye.mutiny.Uni<AjaxResponse<?>> action(AjaxCall<?> call, AjaxResponse<?> response)
        {
            return IGuiceContext.get(actionClass)
                                .getInitialOptions()
                                .onItem()
                                .transform(initial -> {
                                    if (initial == null)
                                    {
                                        return null;
                                    }
                                    response.addDataResponse(listenerName, (com.jwebmp.plugins.agcharts.options.AgChartOptions<?>) initial);
                                    return response;
                                });
        }
    }

    /**
     * Receives initial data over WebSocket and returns them to the client.
     */
    private static class DataReceiver extends WebSocketAbstractCallReceiver<DataReceiver>
    {
        private String listenerName;
        private Class<? extends AgChart> actionClass;

        public DataReceiver() {}

        public DataReceiver(String listenerName, Class<? extends AgChart> actionClass)
        {
            this.listenerName = listenerName;
            this.actionClass = actionClass;
        }

        public Set<String> messageNames()
        {
            return Set.of(listenerName);
        }


        @Override
        public String getMessageDirector()
        {
            return listenerName;
        }

        @Override
        public io.smallrye.mutiny.Uni<AjaxResponse<?>> action(AjaxCall<?> call, AjaxResponse<?> response)
        {
            return IGuiceContext.get(actionClass)
                                .getInitialData()
                                .onItem()
                                .transform(data -> {
                                    DynamicData dd = new DynamicData().addData(data);
                                    response.addDataResponse(listenerName, dd);
                                    return response;
                                });
        }
    }

}
