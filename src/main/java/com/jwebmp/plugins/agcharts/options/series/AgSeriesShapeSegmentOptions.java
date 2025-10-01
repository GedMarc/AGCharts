package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.series.fills.AgGradientColor;
import com.jwebmp.plugins.agcharts.options.series.fills.AgImageFill;
import com.jwebmp.plugins.agcharts.options.series.fills.AgPatternFill;

import java.util.List;

/**
 * Style overrides for a series over a specified axis range (segment).
 *
 * Bounds:
 *  - start: axis value where the segment styling starts (inclusive). Omit for axis/domain minimum or previous stop.
 *  - stop:  axis value where the segment styling stops (exclusive). Omit for axis/domain maximum or next start.
 *
 * Style properties mirror series options; unspecified properties fall back to the series defaults.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesShapeSegmentOptions<J extends AgSeriesShapeSegmentOptions<J>> extends JavaScriptPart<J> {
    /** Segment start axis value (number, date, or category string). */
    private Object start;
    /** Segment stop axis value (number, date, or category string). */
    private Object stop;

    // Stroke options
    private String stroke;
    private Integer strokeWidth;
    private Double strokeOpacity;
    private List<Integer> lineDash;
    private Integer lineDashOffset;

    // Fill options (supports solid color, gradient, pattern, image)
    private Object fill;
    private Double fillOpacity;

    public Object getStart() {
        return start;
    }

    public J setStart(Object start) {
        this.start = start;
        return (J) this;
    }

    public Object getStop() {
        return stop;
    }

    public J setStop(Object stop) {
        this.stop = stop;
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
}
