package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Simple border options for the legend container.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgLegendBorderOptions<J extends AgLegendBorderOptions<J>> extends JavaScriptPart<J> {
    private String color;
    private Integer width;
    private Double opacity;

    public String getColor() {
        return color;
    }

    public J setColor(String color) {
        this.color = color;
        return (J) this;
    }

    public Integer getWidth() {
        return width;
    }

    public J setWidth(Integer width) {
        this.width = width;
        return (J) this;
    }

    public Double getOpacity() {
        return opacity;
    }

    public J setOpacity(Double opacity) {
        this.opacity = opacity;
        return (J) this;
    }
}
