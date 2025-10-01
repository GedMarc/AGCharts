package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Legend line sample (series stroke) options.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendItemLineOptions<J extends AgChartLegendItemLineOptions<J>> extends JavaScriptPart<J> {
    private Integer strokeWidth;
    private Integer length;

    public Integer getStrokeWidth() {
        return strokeWidth;
    }

    public J setStrokeWidth(Integer strokeWidth) {
        this.strokeWidth = strokeWidth;
        return (J) this;
    }

    public Integer getLength() {
        return length;
    }

    public J setLength(Integer length) {
        this.length = length;
        return (J) this;
    }
}
