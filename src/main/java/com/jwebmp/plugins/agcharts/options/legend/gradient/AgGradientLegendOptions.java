package com.jwebmp.plugins.agcharts.options.legend.gradient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Gradient Legend options for Enterprise series like Heatmap.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgGradientLegendOptions<J extends AgGradientLegendOptions<J>> extends JavaScriptPart<J>
{
    private Boolean enabled;
    private String position; // top|right|bottom|left
    private Boolean reverseOrder;

    private AgGradientLegendGradientOptions<?> gradient;
    private AgGradientLegendScaleOptions<?> scale;

    public Boolean getEnabled() {return enabled;}
    public J setEnabled(Boolean enabled) {this.enabled = enabled;return (J) this;}

    public String getPosition() {return position;}
    public J setPosition(String position) {this.position = position;return (J) this;}

    public Boolean getReverseOrder() {return reverseOrder;}
    public J setReverseOrder(Boolean reverseOrder) {this.reverseOrder = reverseOrder;return (J) this;}

    public AgGradientLegendGradientOptions<?> getGradient() {return gradient;}
    public J setGradient(AgGradientLegendGradientOptions<?> gradient) {this.gradient = gradient;return (J) this;}

    public AgGradientLegendScaleOptions<?> getScale() {return scale;}
    public J setScale(AgGradientLegendScaleOptions<?> scale) {this.scale = scale;return (J) this;}
}
