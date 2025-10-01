package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Callout line options used with Pie callout labels.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgPieSeriesCalloutOptions<J extends AgPieSeriesCalloutOptions<J>> extends JavaScriptPart<J> {
    private String stroke;
    private Integer strokeWidth;
    private Integer length;

    public String getStroke() { return stroke; }
    public J setStroke(String stroke) { this.stroke = stroke; return (J) this; }

    public Integer getStrokeWidth() { return strokeWidth; }
    public J setStrokeWidth(Integer strokeWidth) { this.strokeWidth = strokeWidth; return (J) this; }

    public Integer getLength() { return length; }
    public J setLength(Integer length) { this.length = length; return (J) this; }
}
