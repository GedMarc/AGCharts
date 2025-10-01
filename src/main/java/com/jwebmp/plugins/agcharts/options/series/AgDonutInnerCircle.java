package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Inner circle configuration (centre area) for a Donut series.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgDonutInnerCircle<J extends AgDonutInnerCircle<J>> extends JavaScriptPart<J> {
    private String fill; // background colour for the centre area

    public String getFill() { return fill; }
    public J setFill(String fill) { this.fill = fill; return (J) this; }
}
