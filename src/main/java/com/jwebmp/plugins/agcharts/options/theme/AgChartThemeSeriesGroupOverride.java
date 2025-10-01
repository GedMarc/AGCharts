package com.jwebmp.plugins.agcharts.options.theme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Holds overrides for a series group type (e.g., bar.series, line.series).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartThemeSeriesGroupOverride<J extends AgChartThemeSeriesGroupOverride<J>> extends JavaScriptPart<J> {
    private AgChartThemeSeriesOverride<?> series;

    public AgChartThemeSeriesOverride<?> getSeries() {
        return series;
    }

    public J setSeries(AgChartThemeSeriesOverride<?> series) {
        this.series = series;
        return (J) this;
    }
}
