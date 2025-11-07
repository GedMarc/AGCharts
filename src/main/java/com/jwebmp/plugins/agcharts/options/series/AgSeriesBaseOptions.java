package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.series.fills.AgGradientColor;
import com.jwebmp.plugins.agcharts.options.series.fills.AgImageFill;
import com.jwebmp.plugins.agcharts.options.series.fills.AgPatternFill;
import com.jwebmp.plugins.agcharts.options.tooltip.AgSeriesTooltipOptions;

/**
 * Base options for AG Charts series. Provides series-level styler and common nested options.
 *
 * This class is intentionally minimal; concrete series (e.g., line, bar) can extend this and
 * add their specific properties as needed. The primary goal here is to expose Styler hooks.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesBaseOptions<J extends AgSeriesBaseOptions<J>> extends JavaScriptPart<J> {
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private String type;
    private String seriesId;

    /** Fill for the series: supports solid color string, gradient, pattern, or image objects. */
    private Object fill;

    /** Root-level itemStyler for per-datum styling (e.g., fill, stroke, etc.). */
    @JsonRawValue
    private String itemStyler;

    /** Series-level styler applied once per series (via Theme or direct configuration). */
    @JsonRawValue
    private String styler;

    /** Optional nested label options providing an itemStyler for labels. */
    private AgSeriesLabelOptions<?> label;

    /** Optional nested marker options providing an itemStyler for markers (line/scatter, etc.). */
    private AgSeriesMarkerOptions<?> marker;

    /** Per-series tooltip options (renderer, range, position, interaction). */
    private AgSeriesTooltipOptions<?> tooltip;

    /** Style segmentation along an axis for defined ranges. */
    private AgSeriesSegmentationOptions<?> segmentation;

    /** Highlighting configuration for this series (hover behavior). */
    private AgSeriesHighlightOptions<?> highlight;

    public String getType() {
        return type;
    }

    public J setType(String type) {
        this.type = type;
        return (J) this;
    }

    public String getSeriesId() {
        return seriesId;
    }

    public J setSeriesId(String seriesId) {
        this.seriesId = seriesId;
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

    public String getItemStyler() {
        return itemStyler;
    }

    public J setItemStyler(String itemStyler) {
        this.itemStyler = itemStyler;
        return (J) this;
    }

    public String getStyler() {
        return styler;
    }

    public J setStyler(String styler) {
        this.styler = styler;
        return (J) this;
    }

    public AgSeriesLabelOptions<?> getLabel() {
        return label;
    }

    public J setLabel(AgSeriesLabelOptions<?> label) {
        this.label = label;
        return (J) this;
    }

    public AgSeriesMarkerOptions<?> getMarker() {
        return marker;
    }

    public J setMarker(AgSeriesMarkerOptions<?> marker) {
        this.marker = marker;
        return (J) this;
    }

    public AgSeriesTooltipOptions<?> getTooltip() {
        return tooltip;
    }

    public J setTooltip(AgSeriesTooltipOptions<?> tooltip) {
        this.tooltip = tooltip;
        return (J) this;
    }

    public AgSeriesSegmentationOptions<?> getSegmentation() {
        return segmentation;
    }

    public J setSegmentation(AgSeriesSegmentationOptions<?> segmentation) {
        this.segmentation = segmentation;
        return (J) this;
    }

    public AgSeriesHighlightOptions<?> getHighlight() {
        return highlight;
    }

    public J setHighlight(AgSeriesHighlightOptions<?> highlight) {
        this.highlight = highlight;
        return (J) this;
    }
}
