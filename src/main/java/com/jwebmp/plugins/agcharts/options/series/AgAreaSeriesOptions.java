package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Area Series options for AG Charts (community).
 *
 * Supports multiple overlaid or stacked area series with configurable interpolation,
 * markers, labels, shadow, and styling. Aligns with the documented AgAreaSeriesOptions API.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAreaSeriesOptions<J extends AgAreaSeriesOptions<J>> extends AgSeriesBaseOptions<J> {

    // --- Required keys ---
    private String xKey; // DatumKey
    private String yKey; // DatumKey

    // --- Stacking & Normalisation ---
    private Boolean stacked;      // whether to stack areas
    private String stackGroup;    // ID grouping stacked items
    private Number normalizedTo;  // normalise stacks to this value

    // --- Identity & linkage ---
    /** Primary identifier for the series (exposed to callbacks as seriesId). */
    @JsonProperty("id")
    private String id;
    private Object context; // user context object passed to callbacks

    // --- Data/visibility/legend ---
    private List<?> data; // TDatum[]
    private Boolean visible;
    private String cursor; // CSS cursor for hovered nodes
    private Object nodeClickRange; // 'nearest' | 'exact' | number
    private Boolean showInLegend;
    private AgSeriesListeners<?> listeners;

    // --- Names for display ---
    private String xName;
    private String yName;
    private String legendItemName;

    // --- Interpolation, Markers, Labels, Shadow ---
    private AgSeriesInterpolationOptions<?> interpolation; // line interpolation
    private AgSeriesMarkerOptions<?> marker;               // markers config
    // labels are provided via base: setLabel(AgSeriesLabelOptions)
    private AgDropShadowOptions<?> shadow;                 // series drop shadow

    // --- Behaviour ---
    private Boolean connectMissingData; // connect across gaps in data

    // --- Styling ---
    private String stroke;          // series stroke color
    private Integer strokeWidth;    // pixels
    private Double strokeOpacity;   // 0..1
    private Double fillOpacity;     // 0..1 (area fill opacity)
    private java.util.List<Integer> lineDash; // dash pattern
    private Integer lineDashOffset; // pixels

    private Boolean showInMiniChart;

    public AgAreaSeriesOptions() {
        setType("area");
    }

    // --- getters/setters ---
    public String getXKey() { return xKey; }
    public J setXKey(String xKey) { this.xKey = xKey; return (J) this; }

    public String getYKey() { return yKey; }
    public J setYKey(String yKey) { this.yKey = yKey; return (J) this; }

    public Boolean getStacked() { return stacked; }
    public J setStacked(Boolean stacked) { this.stacked = stacked; return (J) this; }

    public String getStackGroup() { return stackGroup; }
    public J setStackGroup(String stackGroup) { this.stackGroup = stackGroup; return (J) this; }

    public Number getNormalizedTo() { return normalizedTo; }
    public J setNormalizedTo(Number normalizedTo) { this.normalizedTo = normalizedTo; return (J) this; }

    public String getId() { return id; }
    /** Also sets the base seriesId for consistency. */
    public J setId(String id) { this.id = id; setSeriesId(id); return (J) this; }

    public Object getContext() { return context; }
    public J setContext(Object context) { this.context = context; return (J) this; }

    public List<?> getData() { return data; }
    public J setData(List<?> data) { this.data = data; return (J) this; }

    public Boolean getVisible() { return visible; }
    public J setVisible(Boolean visible) { this.visible = visible; return (J) this; }

    public String getCursor() { return cursor; }
    public J setCursor(String cursor) { this.cursor = cursor; return (J) this; }

    public Object getNodeClickRange() { return nodeClickRange; }
    public J setNodeClickRange(String range) { this.nodeClickRange = range; return (J) this; }
    public J setNodeClickRange(Integer pixels) { this.nodeClickRange = pixels; return (J) this; }

    public Boolean getShowInLegend() { return showInLegend; }
    public J setShowInLegend(Boolean showInLegend) { this.showInLegend = showInLegend; return (J) this; }

    public AgSeriesListeners<?> getListeners() { return listeners; }
    public J setListeners(AgSeriesListeners<?> listeners) { this.listeners = listeners; return (J) this; }

    public String getXName() { return xName; }
    public J setXName(String xName) { this.xName = xName; return (J) this; }

    public String getYName() { return yName; }
    public J setYName(String yName) { this.yName = yName; return (J) this; }

    public String getLegendItemName() { return legendItemName; }
    public J setLegendItemName(String legendItemName) { this.legendItemName = legendItemName; return (J) this; }

    public AgSeriesInterpolationOptions<?> getInterpolation() { return interpolation; }
    public J setInterpolation(AgSeriesInterpolationOptions<?> interpolation) { this.interpolation = interpolation; return (J) this; }

    public AgSeriesMarkerOptions<?> getMarker() { return marker; }
    public J setMarker(AgSeriesMarkerOptions<?> marker) { this.marker = marker; return (J) this; }

    public AgDropShadowOptions<?> getShadow() { return shadow; }
    public J setShadow(AgDropShadowOptions<?> shadow) { this.shadow = shadow; return (J) this; }

    public Boolean getConnectMissingData() { return connectMissingData; }
    public J setConnectMissingData(Boolean connectMissingData) { this.connectMissingData = connectMissingData; return (J) this; }

    public String getStroke() { return stroke; }
    public J setStroke(String stroke) { this.stroke = stroke; return (J) this; }

    public Integer getStrokeWidth() { return strokeWidth; }
    public J setStrokeWidth(Integer strokeWidth) { this.strokeWidth = strokeWidth; return (J) this; }

    public Double getStrokeOpacity() { return strokeOpacity; }
    public J setStrokeOpacity(Double strokeOpacity) { this.strokeOpacity = strokeOpacity; return (J) this; }

    public Double getFillOpacity() { return fillOpacity; }
    public J setFillOpacity(Double fillOpacity) { this.fillOpacity = fillOpacity; return (J) this; }

    public java.util.List<Integer> getLineDash() { return lineDash; }
    public J setLineDash(java.util.List<Integer> lineDash) { this.lineDash = lineDash; return (J) this; }

    public Integer getLineDashOffset() { return lineDashOffset; }
    public J setLineDashOffset(Integer lineDashOffset) { this.lineDashOffset = lineDashOffset; return (J) this; }

    public Boolean getShowInMiniChart() { return showInMiniChart; }
    public J setShowInMiniChart(Boolean showInMiniChart) { this.showInMiniChart = showInMiniChart; return (J) this; }
}
