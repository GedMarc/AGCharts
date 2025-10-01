package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Legend marker options overriding series-derived marker look if desired.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendItemMarkerOptions<J extends AgChartLegendItemMarkerOptions<J>> extends JavaScriptPart<J> {
    private Integer size;
    private Integer strokeWidth;
    private String shape; // 'circle', 'square', 'cross', 'plus', 'triangle', 'diamond'
    private Integer padding;
    private String fill;
    private String stroke;

    public Integer getSize() {
        return size;
    }

    public J setSize(Integer size) {
        this.size = size;
        return (J) this;
    }

    public Integer getStrokeWidth() {
        return strokeWidth;
    }

    public J setStrokeWidth(Integer strokeWidth) {
        this.strokeWidth = strokeWidth;
        return (J) this;
    }

    public String getShape() {
        return shape;
    }

    public J setShape(String shape) {
        this.shape = shape;
        return (J) this;
    }

    public Integer getPadding() {
        return padding;
    }

    public J setPadding(Integer padding) {
        this.padding = padding;
        return (J) this;
    }

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
}
