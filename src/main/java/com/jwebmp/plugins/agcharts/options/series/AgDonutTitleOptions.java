package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Donut series title options with optional showInLegend.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgDonutTitleOptions<J extends AgDonutTitleOptions<J>> extends JavaScriptPart<J> {
    private String text;
    private Boolean showInLegend;

    public String getText() { return text; }
    public J setText(String text) { this.text = text; return (J) this; }

    public Boolean getShowInLegend() { return showInLegend; }
    public J setShowInLegend(Boolean showInLegend) { this.showInLegend = showInLegend; return (J) this; }
}
