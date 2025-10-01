package com.jwebmp.plugins.agcharts.options.theme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Aggregates overrides per series type. Expand with other types as needed.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartThemeOverrides<J extends AgChartThemeOverrides<J>> extends JavaScriptPart<J> {
    private AgChartThemeSeriesGroupOverride<?> bar;
    private AgChartThemeSeriesGroupOverride<?> line;
    private AgChartThemeSeriesGroupOverride<?> area;

    public AgChartThemeSeriesGroupOverride<?> getBar() {
        return bar;
    }

    public J setBar(AgChartThemeSeriesGroupOverride<?> bar) {
        this.bar = bar;
        return (J) this;
    }

    public AgChartThemeSeriesGroupOverride<?> getLine() {
        return line;
    }

    public J setLine(AgChartThemeSeriesGroupOverride<?> line) {
        this.line = line;
        return (J) this;
    }

    public AgChartThemeSeriesGroupOverride<?> getArea() {
        return area;
    }

    public J setArea(AgChartThemeSeriesGroupOverride<?> area) {
        this.area = area;
        return (J) this;
    }
}
