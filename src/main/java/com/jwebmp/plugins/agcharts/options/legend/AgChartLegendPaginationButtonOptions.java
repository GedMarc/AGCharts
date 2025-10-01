package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Button style for legend pagination controls.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendPaginationButtonOptions<J extends AgChartLegendPaginationButtonOptions<J>> extends JavaScriptPart<J> {
    private String fill;
    private String stroke;
    private Integer strokeWidth;
    private Integer size;
    private String color; // icon color if applicable

    public String getFill() {
        return fill;
    }

    public J setFill(String fill) {
        this.fill = fill;
        return (J) this;
    }

    public String getStroke() {
        return stroke;
    }

    public J setStroke(String stroke) {
        this.stroke = stroke;
        return (J) this;
    }

    public Integer getStrokeWidth() {
        return strokeWidth;
    }

    public J setStrokeWidth(Integer strokeWidth) {
        this.strokeWidth = strokeWidth;
        return (J) this;
    }

    public Integer getSize() {
        return size;
    }

    public J setSize(Integer size) {
        this.size = size;
        return (J) this;
    }

    public String getColor() {
        return color;
    }

    public J setColor(String color) {
        this.color = color;
        return (J) this;
    }
}
