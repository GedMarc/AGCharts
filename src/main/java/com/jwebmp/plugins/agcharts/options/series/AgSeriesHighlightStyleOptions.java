package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Style options used for series/item highlighting states.
 * Applies to either a single item (e.g., hovered marker) or a whole series when highlighted/unhighlighted.
 *
 * Only the specified properties are applied; unspecified ones fall back to the series defaults.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesHighlightStyleOptions<J extends AgSeriesHighlightStyleOptions<J>> extends JavaScriptPart<J> {
    // Generic shape/marker styling
    private Object fill;          // CSS color or fill object (gradient/pattern/image)
    private Double fillOpacity;   // 0..1

    private String stroke;        // CSS color
    private Integer strokeWidth;  // pixels
    private Double strokeOpacity; // 0..1

    private List<Integer> lineDash;      // [dash, gap, ...]
    private Integer lineDashOffset;      // pixels

    private Integer size;         // marker size, where applicable
    private Double opacity;       // overall opacity for series/markers

    public Object getFill() {
        return fill;
    }

    public J setFill(Object fill) {
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

    public Double getStrokeOpacity() {
        return strokeOpacity;
    }

    public J setStrokeOpacity(Double strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
        return (J) this;
    }

    public List<Integer> getLineDash() {
        return lineDash;
    }

    public J setLineDash(List<Integer> lineDash) {
        this.lineDash = lineDash;
        return (J) this;
    }

    public Integer getLineDashOffset() {
        return lineDashOffset;
    }

    public J setLineDashOffset(Integer lineDashOffset) {
        this.lineDashOffset = lineDashOffset;
        return (J) this;
    }

    public Integer getSize() {
        return size;
    }

    public J setSize(Integer size) {
        this.size = size;
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
