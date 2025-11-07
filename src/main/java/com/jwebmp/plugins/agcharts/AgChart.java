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
import com.jwebmp.core.base.angular.client.services.EventBusService;
import com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.angular.implementations.WebSocketAbstractCallReceiver;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.agcharts.options.AgChartOptions;

import java.util.ArrayList;
import java.util.List;

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
@NgField("private chartOpts: any; // holds the current chart options")
@NgField("readonly handlerId : string;")
@NgConstructorBody("this.handlerId = this.generateHandlerId();")
@NgField("private subscriptionOptions?: Subscription;")

// Expose options getter for the template binding.
@NgMethod("chartOptions() { return this.chartOpts; }")

// Allow host to check configuration readiness (compat with existing pattern).
@NgMethod("chartConfiguration() { return this.chartOpts != null; }")

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
        "    this.chartOpts = options;\n" +
        "  } catch (e) {\n" +
        "    console.error('[AgChart] Failed to parse options payload', e, data);\n" +
        "  }\n" +
        "}")

// Request initial options from the server via the event bus (WebSocket behind the scenes).
@NgMethod("fetchData() {\n" +
        "  this.eventBusService.send(this.listenerName + 'Options', {\n" +
        "    className: this.clazzName,\n" +
        "    listenerName: this.listenerName + 'Options'\n" +
        "  }, this.listenerName + 'Options');\n" +
        "}")

@NgAfterViewInit("this.initializeOptionsListener(); this.fetchData();")
@NgOnDestroy("this.subscriptionOptions?.unsubscribe(); this.eventBusService.unregisterListener(this.listenerName + 'Options', this.handlerId);")

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
        addAttribute("*ngIf", "chartConfiguration() && chartOptions()");

        addConfiguration(AnnotationUtils.getNgField("readonly listenerName = '" + getID() + "';"));
        addConfiguration(AnnotationUtils.getNgField("readonly clazzName = '" + getClass().getCanonicalName() + "';"));
        registerWebSocketListeners();
    }

    /**
     * Server-side: provide the initial chart options.
     */
    public abstract AgChartOptions<?> getInitialOptions();

    protected String getListenerName()
    {
        return getID();
    }

    protected String getListenerNameOptions()
    {
        return getID() + "Options";
    }

    protected void registerWebSocketListeners()
    {
        if (!IGuicedWebSocket.isWebSocketReceiverRegistered(getListenerNameOptions()))
        {
            IGuicedWebSocket.addWebSocketMessageReceiver(new InitialOptionsReceiver(getListenerNameOptions(), getClass()));
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
    private static class InitialOptionsReceiver extends WebSocketAbstractCallReceiver
    {
        private String listenerName;
        private Class<? extends AgChart> actionClass;

        public InitialOptionsReceiver() {}

        public InitialOptionsReceiver(String listenerName, Class<? extends AgChart> actionClass)
        {
            this.listenerName = listenerName;
            this.actionClass = actionClass;
        }

        @Override
        public String getMessageDirector()
        {
            return listenerName;
        }

        @Override
        public AjaxResponse<?> action(AjaxCall<?> call, AjaxResponse<?> response)
        {
            try
            {
                // Resolve the concrete component class and listener name from the call
                actionClass = (Class<? extends AgChart>) Class.forName(call.getClassName());
                Object ln = call.getUnknownFields() != null ? call.getUnknownFields()
                                                                  .get("listenerName") : null;
                if (ln != null)
                {
                    listenerName = ln.toString();
                }
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }

            AgChartOptions<?> initial = IGuiceContext.get(actionClass)
                                                     .getInitialOptions();
            if (initial == null)
            {
                return null;
            }
            response.addDataResponse(listenerName, initial);
            return response;
        }
    }

}
