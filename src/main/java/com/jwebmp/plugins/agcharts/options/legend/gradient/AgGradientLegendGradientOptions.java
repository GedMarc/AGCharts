package com.jwebmp.plugins.agcharts.options.legend.gradient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Gradient bar dimension options inside the Gradient Legend.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgGradientLegendGradientOptions<J extends AgGradientLegendGradientOptions<J>> extends JavaScriptPart<J>
{
    /** Thickness of the gradient bar (width if vertical). */
    private Integer thickness;
    /** Preferred initial length of the gradient bar, constrained by container. */
    private Integer preferredLength;

    public Integer getThickness() {return thickness;}
    public J setThickness(Integer thickness) {this.thickness = thickness;return (J) this;}

    public Integer getPreferredLength() {return preferredLength;}
    public J setPreferredLength(Integer preferredLength) {this.preferredLength = preferredLength;return (J) this;}
}
