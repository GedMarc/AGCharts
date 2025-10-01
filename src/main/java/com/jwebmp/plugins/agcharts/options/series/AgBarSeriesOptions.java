package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Bar Series options for AG Charts (community).
 *
 * Covers grouping, stacking, normalisation, direction, labels, error bars, and styling.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgBarSeriesOptions<J extends AgBarSeriesOptions<J>> extends AgSeriesBaseOptions<J> {

    // --- Required keys ---
    private String xKey; // DatumKey
    private String yKey; // DatumKey

    // --- Grouping & Stacking ---
    private Boolean grouped;   // whether to group adjacently
    private Boolean stacked;   // whether to stack
    private String stackGroup; // ID grouping stacked items
    private Number normalizedTo; // normalise stacks to this value

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

    // --- Rendering ---
    private AgSeriesDirection direction; // 'horizontal' | 'vertical'
    private Boolean crisp; // align to whole pixels
    private AgDropShadowOptions<?> shadow;

    // --- Labels & Tooltips ---
    private AgBarSeriesLabelOptions<?> label; // bar labels
    // tooltip is inherited from base via setTooltip/getTooltip

    // --- Error Bars ---
    private AgErrorBarOptions<?> errorBar;

    // --- Styling ---
    private Integer cornerRadius; // rounded corners
    private Double fillOpacity;
    private String stroke;
    private Integer strokeWidth;
    private Double strokeOpacity;
    private List<Integer> lineDash;
    private Integer lineDashOffset;

    private Boolean showInMiniChart;

    public AgBarSeriesOptions() {
        setType("bar");
    }

    // --- getters/setters ---
    public String getXKey() { return xKey; }
    public J setXKey(String xKey) { this.xKey = xKey; return (J) this; }

    public String getYKey() { return yKey; }
    public J setYKey(String yKey) { this.yKey = yKey; return (J) this; }

    public Boolean getGrouped() { return grouped; }
    public J setGrouped(Boolean grouped) { this.grouped = grouped; return (J) this; }

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

    public AgSeriesDirection getDirection() { return direction; }
    public J setDirection(AgSeriesDirection direction) { this.direction = direction; return (J) this; }

    public Boolean getCrisp() { return crisp; }
    public J setCrisp(Boolean crisp) { this.crisp = crisp; return (J) this; }

    public AgDropShadowOptions<?> getShadow() { return shadow; }
    public J setShadow(AgDropShadowOptions<?> shadow) { this.shadow = shadow; return (J) this; }

    public AgBarSeriesLabelOptions<?> getLabel() { return label; }
    public J setLabel(AgBarSeriesLabelOptions<?> label) { this.label = label; return (J) this; }

    public AgErrorBarOptions<?> getErrorBar() { return errorBar; }
    public J setErrorBar(AgErrorBarOptions<?> errorBar) { this.errorBar = errorBar; return (J) this; }

    public Integer getCornerRadius() { return cornerRadius; }
    public J setCornerRadius(Integer cornerRadius) { this.cornerRadius = cornerRadius; return (J) this; }

    public Double getFillOpacity() { return fillOpacity; }
    public J setFillOpacity(Double fillOpacity) { this.fillOpacity = fillOpacity; return (J) this; }

    public String getStroke() { return stroke; }
    public J setStroke(String stroke) { this.stroke = stroke; return (J) this; }

    public Integer getStrokeWidth() { return strokeWidth; }
    public J setStrokeWidth(Integer strokeWidth) { this.strokeWidth = strokeWidth; return (J) this; }

    public Double getStrokeOpacity() { return strokeOpacity; }
    public J setStrokeOpacity(Double strokeOpacity) { this.strokeOpacity = strokeOpacity; return (J) this; }

    public List<Integer> getLineDash() { return lineDash; }
    public J setLineDash(List<Integer> lineDash) { this.lineDash = lineDash; return (J) this; }

    public Integer getLineDashOffset() { return lineDashOffset; }
    public J setLineDashOffset(Integer lineDashOffset) { this.lineDashOffset = lineDashOffset; return (J) this; }

    public Boolean getShowInMiniChart() { return showInMiniChart; }
    public J setShowInMiniChart(Boolean showInMiniChart) { this.showInMiniChart = showInMiniChart; return (J) this; }
}
