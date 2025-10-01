package com.jwebmp.plugins.agcharts.options.overlays;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Aggregates all chart overlays: loading, noData, noVisibleSeries, unsupportedBrowser.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartOverlaysOptions<J extends AgChartOverlaysOptions<J>> extends JavaScriptPart<J> {
    private AgChartOverlayOptions<?> loading;
    private AgChartOverlayOptions<?> noData;
    private AgChartOverlayOptions<?> noVisibleSeries;
    private AgChartOverlayOptions<?> unsupportedBrowser;

    public AgChartOverlayOptions<?> getLoading() {
        return loading;
    }

    public J setLoading(AgChartOverlayOptions<?> loading) {
        this.loading = loading;
        return (J) this;
    }

    public AgChartOverlayOptions<?> getNoData() {
        return noData;
    }

    public J setNoData(AgChartOverlayOptions<?> noData) {
        this.noData = noData;
        return (J) this;
    }

    public AgChartOverlayOptions<?> getNoVisibleSeries() {
        return noVisibleSeries;
    }

    public J setNoVisibleSeries(AgChartOverlayOptions<?> noVisibleSeries) {
        this.noVisibleSeries = noVisibleSeries;
        return (J) this;
    }

    public AgChartOverlayOptions<?> getUnsupportedBrowser() {
        return unsupportedBrowser;
    }

    public J setUnsupportedBrowser(AgChartOverlayOptions<?> unsupportedBrowser) {
        this.unsupportedBrowser = unsupportedBrowser;
        return (J) this;
    }
}
