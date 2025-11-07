package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;

import java.util.List;

/**
 * Bubble Series options for AG Charts (community).
 *
 * Extends the scatter-like capabilities by introducing sizeKey to encode
 * the third numeric variable as marker size. Supports manual size domain,
 * min/max marker size, and series-level marker styling.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgBubbleSeriesOptions<J extends AgBubbleSeriesOptions<J>> extends AgSeriesBaseOptions<J> {

    // --- Required keys ---
    private String xKey; // DatumKey
    private String yKey; // DatumKey
    private String sizeKey; // DatumKey - determines bubble size

    // --- Optional value used for labels ---
    private String labelKey; // DatumKey

    // --- Identity & linkage ---
    /** Primary identifier for the series (exposed to callbacks as seriesId). */
    @JsonProperty("id")
    private String id;
    private Object context; // user-provided context object

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
    private String sizeName;
    private String labelName;
    private String legendItemName;

    // --- Display title (defaults to yName or yKey) ---
    private String title;

    // --- Error Bars (optional support, parity with scatter/line/bar where applicable) ---
    private AgErrorBarOptions<?> errorBar;

    // --- Max rendered items / Mini chart ---
    private Integer maxRenderedItems;
    private Boolean showInMiniChart;

    // --- Labels ---
    private AgBubbleSeriesLabelOptions<?> label;

    // --- Bubble size configuration ---
    /** Smallest marker size in pixels (defaults to AG Charts default, e.g., 7). */
    private Integer size;
    /** Largest marker size in pixels (defaults to AG Charts default, e.g., 30). */
    private Integer maxSize;
    /** Explicit size domain for sizeKey values, e.g., [0, 100]. */
    private List<Number> domain;

    // --- Marker-like styling directly on series (for convenience) ---
    private Object fill;         // String or fill object
    private Double fillOpacity;  // 0..1

    private String stroke;
    private Integer strokeWidth;
    private Double strokeOpacity; // 0..1

    private List<Integer> lineDash;
    private Integer lineDashOffset;

    /** Marker shape name (e.g., 'circle') OR custom shape function. */
    @JsonProperty("shape")
    private String shapeName;
    @JsonProperty("shape")
    @JsonRawValue
    private String shapeFunction;

    public AgBubbleSeriesOptions() {
        setType("bubble");
    }

    // --- getters/setters ---
    public String getXKey() { return xKey; }
    public J setXKey(String xKey) { this.xKey = xKey; return (J) this; }

    public String getYKey() { return yKey; }
    public J setYKey(String yKey) { this.yKey = yKey; return (J) this; }

    public String getSizeKey() { return sizeKey; }
    public J setSizeKey(String sizeKey) { this.sizeKey = sizeKey; return (J) this; }

    public String getLabelKey() { return labelKey; }
    public J setLabelKey(String labelKey) { this.labelKey = labelKey; return (J) this; }

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

    public String getSizeName() { return sizeName; }
    public J setSizeName(String sizeName) { this.sizeName = sizeName; return (J) this; }

    public String getLabelName() { return labelName; }
    public J setLabelName(String labelName) { this.labelName = labelName; return (J) this; }

    public String getLegendItemName() { return legendItemName; }
    public J setLegendItemName(String legendItemName) { this.legendItemName = legendItemName; return (J) this; }

    public String getTitle() { return title; }
    public J setTitle(String title) { this.title = title; return (J) this; }

    public AgErrorBarOptions<?> getErrorBar() { return errorBar; }
    public J setErrorBar(AgErrorBarOptions<?> errorBar) { this.errorBar = errorBar; return (J) this; }

    public Integer getMaxRenderedItems() { return maxRenderedItems; }
    public J setMaxRenderedItems(Integer maxRenderedItems) { this.maxRenderedItems = maxRenderedItems; return (J) this; }

    public Boolean getShowInMiniChart() { return showInMiniChart; }
    public J setShowInMiniChart(Boolean showInMiniChart) { this.showInMiniChart = showInMiniChart; return (J) this; }

    public AgBubbleSeriesLabelOptions<?> getLabel() { return label; }
    public J setLabel(AgBubbleSeriesLabelOptions<?> label) { this.label = label; return (J) this; }

    public Integer getSize() { return size; }
    public J setSize(Integer size) { this.size = size; return (J) this; }

    public Integer getMaxSize() { return maxSize; }
    public J setMaxSize(Integer maxSize) { this.maxSize = maxSize; return (J) this; }

    public List<Number> getDomain() { return domain; }
    public J setDomain(List<Number> domain) { this.domain = domain; return (J) this; }

    // --- Styling ---
    public Object getFill() { return fill; }
    public J setFill(String fill) { this.fill = (Object) fill; return (J) this; }
    public J setFill(com.jwebmp.plugins.agcharts.options.series.fills.AgGradientColor<?> fill) { this.fill = fill; return (J) this; }
    public J setFill(com.jwebmp.plugins.agcharts.options.series.fills.AgPatternFill<?> fill) { this.fill = fill; return (J) this; }
    public J setFill(com.jwebmp.plugins.agcharts.options.series.fills.AgImageFill<?> fill) { this.fill = fill; return (J) this; }

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

    public String getShapeName() { return shapeName; }
    /** Set a built-in marker shape by name (e.g., "circle"). Clears any custom shape function. */
    public J setShape(String shapeName) { this.shapeName = shapeName; this.shapeFunction = null; return (J) this; }
    /** Set a built-in marker shape by enum. Clears any custom shape function. */
    public J setShape(AgMarkerShape shape) { this.shapeName = shape != null ? shape.toString() : null; this.shapeFunction = null; return (J) this; }
    /** Provide a custom marker shape function: "function({x,y,path,size}){ ... }" */
    public J setShapeFunction(String shapeFunction) { this.shapeFunction = shapeFunction; this.shapeName = null; return (J) this; }
    public String getShapeFunction() { return shapeFunction; }
}
