package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.series.fills.AgGradientColor;
import com.jwebmp.plugins.agcharts.options.series.fills.AgImageFill;
import com.jwebmp.plugins.agcharts.options.series.fills.AgPatternFill;

import java.util.List;

/**
 * Marker options with per-item itemStyler support and full API coverage.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesMarkerOptions<J extends AgSeriesMarkerOptions<J>> extends JavaScriptPart<J> {
    /** Whether to show markers. */
    private Boolean enabled;

    /** The size in pixels of the markers. */
    private Integer size;

    /** Marker shape name (e.g. 'circle') OR custom shape function. */
    @JsonProperty("shape")
    private String shapeName;
    /** Custom marker shape function as raw JS. */
    @JsonProperty("shape")
    @JsonRawValue
    private String shapeFunction;

    /** Fill for marker: supports solid color (String) or fill object (gradient/pattern/image). */
    private Object fill;
    /** Opacity of fill color (0..1). */
    private Double fillOpacity;

    /** Stroke color and width. */
    private String stroke;
    private Integer strokeWidth;
    /** Opacity of stroke color (0..1). */
    private Double strokeOpacity;

    /** Dash pattern and offset for marker stroke. */
    private List<Integer> lineDash;
    private Integer lineDashOffset;

    /** Per-item marker styler: function(params){ return { fill: ..., size: ... }; } */
    @JsonRawValue
    private String itemStyler;

    // --- Enabled ---
    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }

    // --- Size ---
    public Integer getSize() {
        return size;
    }

    public J setSize(Integer size) {
        this.size = size;
        return (J) this;
    }

    // --- Shape ---
    public String getShapeName() {
        return shapeName;
    }

    /** Set a built-in marker shape by name (e.g., "circle"). Clears any custom shape function. */
    public J setShape(String shapeName) {
        this.shapeName = shapeName;
        this.shapeFunction = null;
        return (J) this;
    }

    /** Set a built-in marker shape by enum. Clears any custom shape function. */
    public J setShape(AgMarkerShape shape) {
        this.shapeName = shape != null ? shape.toString() : null;
        this.shapeFunction = null;
        return (J) this;
    }

    /** Set a custom marker shape function. Example: "function({x,y,path,size}){ ... }" */
    public J setShapeFunction(String shapeFunction) {
        this.shapeFunction = shapeFunction;
        this.shapeName = null;
        return (J) this;
    }

    public String getShapeFunction() {
        return shapeFunction;
    }

    // --- Fill ---
    public Object getFill() {
        return fill;
    }

    /** Set a solid CSS color string. */
    public J setFill(String fill) {
        this.fill = (Object) fill;
        return (J) this;
    }

    /** Set a gradient fill object. */
    public J setFill(AgGradientColor<?> fill) {
        this.fill = fill;
        return (J) this;
    }

    /** Set a pattern fill object. */
    public J setFill(AgPatternFill<?> fill) {
        this.fill = fill;
        return (J) this;
    }

    /** Set an image fill object. */
    public J setFill(AgImageFill<?> fill) {
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

    // --- Stroke ---
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

    // --- Styler ---
    public String getItemStyler() {
        return itemStyler;
    }

    public J setItemStyler(String itemStyler) {
        this.itemStyler = itemStyler;
        return (J) this;
    }
}
