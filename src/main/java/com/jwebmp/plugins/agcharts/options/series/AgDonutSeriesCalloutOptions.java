package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Callout line options for Donut series labels.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgDonutSeriesCalloutOptions<J extends AgDonutSeriesCalloutOptions<J>> extends JavaScriptPart<J> {
    private String colors; // AG Charts allows array; keep simple colour string support
    private Integer length;
    private Integer strokeWidth;

    public String getColors() { return colors; }
    public J setColors(String colors) { this.colors = colors; return (J) this; }

    public Integer getLength() { return length; }
    public J setLength(Integer length) { this.length = length; return (J) this; }

    public Integer getStrokeWidth() { return strokeWidth; }
    public J setStrokeWidth(Integer strokeWidth) { this.strokeWidth = strokeWidth; return (J) this; }
}
