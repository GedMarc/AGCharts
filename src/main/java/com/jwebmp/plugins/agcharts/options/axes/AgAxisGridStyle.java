package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Style configuration for individual grid lines and the band between them.
 * Used by AgAxisGridLineOptions.style[].
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisGridStyle<J extends AgAxisGridStyle<J>> extends JavaScriptPart<J> {
    /** Stroke color for the grid line. */
    private String stroke;
    /** Stroke width for the grid line; overrides top-level gridLine.width. */
    private Integer strokeWidth;
    /** Dash pattern for the grid line stroke. Example: [10, 5]. */
    private List<Integer> lineDash;
    /** Fill color for the band (area) between grid lines. */
    private String fill;
    /** Fill opacity (0..1) for the band between grid lines. */
    private Double fillOpacity;

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

    public List<Integer> getLineDash() {
        return lineDash;
    }

    public J setLineDash(List<Integer> lineDash) {
        this.lineDash = lineDash;
        return (J) this;
    }

    public String getFill() {
        return fill;
    }

    public J setFill(String fill) {
        this.fill = fill;
        return (J) this;
    }

    public Double getFillOpacity() {
        return fillOpacity;
    }

    public J setFillOpacity(Double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return (J) this;
    }
}
