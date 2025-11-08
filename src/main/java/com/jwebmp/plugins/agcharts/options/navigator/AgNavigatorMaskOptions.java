package com.jwebmp.plugins.agcharts.options.navigator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Options for the Navigator's visible range mask.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgNavigatorMaskOptions<J extends AgNavigatorMaskOptions<J>> extends JavaScriptPart<J>
{
    private String fill;
    private Double fillOpacity;
    private Integer strokeWidth;

    public String getFill() { return fill; }
    public J setFill(String fill) { this.fill = fill; return (J) this; }

    public Double getFillOpacity() { return fillOpacity; }
    public J setFillOpacity(Double fillOpacity) { this.fillOpacity = fillOpacity; return (J) this; }

    public Integer getStrokeWidth() { return strokeWidth; }
    public J setStrokeWidth(Integer strokeWidth) { this.strokeWidth = strokeWidth; return (J) this; }
}
