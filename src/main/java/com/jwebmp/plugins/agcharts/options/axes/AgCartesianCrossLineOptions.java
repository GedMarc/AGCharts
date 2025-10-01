package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Cross Line options for axes (Cartesian and Polar compatible).
 * Supports both line and range cross-lines with styling and labels.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgCartesianCrossLineOptions<J extends AgCartesianCrossLineOptions<J>> extends JavaScriptPart<J> {
    /** Type of cross line to render. Defaults to line in runtime. */
    private AgCrossLineType type;
    /** Whether the cross line is enabled. */
    private Boolean enabled;

    /** Axis value at which the line should be positioned (used for type=line). */
    private Object value;
    /** Range of axis values [start, end] for shaded area (used for type=range). */
    private List<Object> range;

    /** Fill color for range shading. */
    private String fill;
    /** Fill opacity for range shading. */
    private Double fillOpacity;

    /** Stroke color for lines. */
    private String stroke;
    /** Stroke width in pixels for lines. */
    private Integer strokeWidth;
    /** Stroke opacity for lines. */
    private Double strokeOpacity;
    /** Dash pattern for line stroke. */
    private List<Integer> lineDash;

    /** Label configuration for the cross line. */
    private AgCartesianCrossLineLabelOptions<?> label;

    public AgCrossLineType getType() {
        return type;
    }

    public J setType(AgCrossLineType type) {
        this.type = type;
        return (J) this;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }

    public Object getValue() {
        return value;
    }

    public J setValue(Object value) {
        this.value = value;
        return (J) this;
    }

    public List<Object> getRange() {
        return range;
    }

    public J setRange(List<Object> range) {
        this.range = range;
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

    public AgCartesianCrossLineLabelOptions<?> getLabel() {
        return label;
    }

    public J setLabel(AgCartesianCrossLineLabelOptions<?> label) {
        this.label = label;
        return (J) this;
    }
}
