package com.jwebmp.plugins.agcharts.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.axes.AgAxisBaseOptions;
import com.jwebmp.plugins.agcharts.options.legend.AgChartLegendOptions;
import com.jwebmp.plugins.agcharts.options.formatters.AgChartPropertyFormatterFunctions;
import com.jwebmp.plugins.agcharts.options.formatters.AgChartPropertyFormatterFormats;
import com.jwebmp.plugins.agcharts.options.series.AgSeriesBaseOptions;
import com.jwebmp.plugins.agcharts.options.theme.AgChartTheme;
import com.jwebmp.plugins.agcharts.options.locale.AgLocaleOptions;
import com.jwebmp.plugins.agcharts.options.tooltip.AgChartTooltipOptions;

import java.util.List;

/**
 * Root Chart options for AG Charts (Community).
 * <p>
 * Exposes a chart-level {@code formatter} supporting:
 * - Global formatter function (raw JS)
 * - Per-property formatter mapping using functions (raw JS per field)
 * - Per-property formatter mapping using format strings
 * <p>
 * Notes on precedence:
 * - Element-specific formatters (e.g., axes[].label.formatter) take precedence over the chart-level formatter.
 * - If element-specific formatter returns undefined, the chart-level formatter is attempted next, then AG defaults.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class AgChartOptions<J extends AgChartOptions<J>> extends JavaScriptPart<J>
{
    private List<AgAxisBaseOptions<?>> axes;
    private AgChartLegendOptions<?> legend;
    private List<AgSeriesBaseOptions<?>> series;
    private Object theme; // String theme name or AgChartTheme object
    private AgLocaleOptions<?> locale;
    private AgChartTooltipOptions<?> tooltip;
    private AgChartBackground<?> background;
    private AgSeriesAreaOptions<?> seriesArea;
    private com.jwebmp.plugins.agcharts.options.overlays.AgChartOverlaysOptions<?> overlays;

    // Enterprise: Gradient legend (used by heatmap etc.)
    private com.jwebmp.plugins.agcharts.options.legend.gradient.AgGradientLegendOptions<?> gradientLegend;

    // Enterprise: Navigator (zoom/pan with optional Mini Chart)
    private com.jwebmp.plugins.agcharts.options.navigator.AgNavigatorOptions<?> navigator;

    // --- Layout / Sizing ---
    private Integer width;
    private Integer height;
    private Integer minWidth;
    private Integer minHeight;

    /**
     * Chart padding: number (uniform) or per-side object.
     */
    private Object padding;

    /**
     * Captions with spacing.
     */
    private AgChartCaptionOptions<?> title;
    private AgChartCaptionOptions<?> subtitle;
    private AgChartCaptionOptions<?> footnote;

    // --- Chart-level formatter support ---
    /**
     * Global formatter function applied to all textual elements. Raw JS string, e.g.:
     * <pre>function(p){ return p.value + '%'; }</pre>
     */
    @com.fasterxml.jackson.annotation.JsonIgnore
    private String formatterFunction;

    /**
     * Per-property formatter callbacks (as raw JS) for x, y, size, label, etc.
     */
    @com.fasterxml.jackson.annotation.JsonIgnore
    private AgChartPropertyFormatterFunctions<?> formatterFunctions;

    /**
     * Per-property formatter static format strings for x, y, size, label, etc.
     */
    @com.fasterxml.jackson.annotation.JsonIgnore
    private AgChartPropertyFormatterFormats<?> formatterFormats;

    public List<AgAxisBaseOptions<?>> getAxes()
    {
        return axes;
    }

    public J setAxes(List<AgAxisBaseOptions<?>> axes)
    {
        this.axes = axes;
        return (J) this;
    }

    public AgChartLegendOptions<?> getLegend()
    {
        return legend;
    }

    public J setLegend(AgChartLegendOptions<?> legend)
    {
        this.legend = legend;
        return (J) this;
    }

    public List<AgSeriesBaseOptions<?>> getSeries()
    {
        return series;
    }

    public J setSeries(List<AgSeriesBaseOptions<?>> series)
    {
        this.series = series;
        return (J) this;
    }

    public com.jwebmp.plugins.agcharts.options.legend.gradient.AgGradientLegendOptions<?> getGradientLegend()
    {
        return gradientLegend;
    }

    public J setGradientLegend(com.jwebmp.plugins.agcharts.options.legend.gradient.AgGradientLegendOptions<?> gradientLegend)
    {
        this.gradientLegend = gradientLegend;
        return (J) this;
    }

    public com.jwebmp.plugins.agcharts.options.navigator.AgNavigatorOptions<?> getNavigator()
    {
        return navigator;
    }

    public J setNavigator(com.jwebmp.plugins.agcharts.options.navigator.AgNavigatorOptions<?> navigator)
    {
        this.navigator = navigator;
        return (J) this;
    }

    public Object getTheme()
    {
        return theme;
    }

    /**
     * Set theme using a custom theme object.
     */
    public J setTheme(AgChartTheme<?> theme)
    {
        this.theme = theme;
        return (J) this;
    }

    /**
     * Set theme using a stock theme name (e.g., "ag-vivid").
     */
    public J setTheme(String themeName)
    {
        this.theme = themeName;
        return (J) this;
    }

    public AgLocaleOptions<?> getLocale()
    {
        return locale;
    }

    public J setLocale(AgLocaleOptions<?> locale)
    {
        this.locale = locale;
        return (J) this;
    }

    public AgChartTooltipOptions<?> getTooltip()
    {
        return tooltip;
    }

    public J setTooltip(AgChartTooltipOptions<?> tooltip)
    {
        this.tooltip = tooltip;
        return (J) this;
    }

    public AgChartBackground<?> getBackground()
    {
        return background;
    }

    public J setBackground(AgChartBackground<?> background)
    {
        this.background = background;
        return (J) this;
    }

    public AgSeriesAreaOptions<?> getSeriesArea()
    {
        return seriesArea;
    }

    public J setSeriesArea(AgSeriesAreaOptions<?> seriesArea)
    {
        this.seriesArea = seriesArea;
        return (J) this;
    }

    public com.jwebmp.plugins.agcharts.options.overlays.AgChartOverlaysOptions<?> getOverlays()
    {
        return overlays;
    }

    public J setOverlays(com.jwebmp.plugins.agcharts.options.overlays.AgChartOverlaysOptions<?> overlays)
    {
        this.overlays = overlays;
        return (J) this;
    }

    // --- Layout / Sizing getters/setters ---
    public Integer getWidth() {return width;}

    public J setWidth(Integer width)
    {
        this.width = width;
        return (J) this;
    }

    public Integer getHeight() {return height;}

    public J setHeight(Integer height)
    {
        this.height = height;
        return (J) this;
    }

    public Integer getMinWidth() {return minWidth;}

    public J setMinWidth(Integer minWidth)
    {
        this.minWidth = minWidth;
        return (J) this;
    }

    public Integer getMinHeight() {return minHeight;}

    public J setMinHeight(Integer minHeight)
    {
        this.minHeight = minHeight;
        return (J) this;
    }

    public Object getPadding() {return padding;}

    /**
     * Set uniform chart padding in pixels.
     */
    public J setPadding(Integer padding)
    {
        this.padding = padding;
        return (J) this;
    }

    /**
     * Set per-side chart padding.
     */
    public J setPadding(com.jwebmp.plugins.agcharts.options.legend.AgPadding<?> padding)
    {
        this.padding = padding;
        return (J) this;
    }

    public AgChartCaptionOptions<?> getTitle() {return title;}

    public J setTitle(AgChartCaptionOptions<?> title)
    {
        this.title = title;
        return (J) this;
    }

    public AgChartCaptionOptions<?> getSubtitle() {return subtitle;}

    public J setSubtitle(AgChartCaptionOptions<?> subtitle)
    {
        this.subtitle = subtitle;
        return (J) this;
    }

    public AgChartCaptionOptions<?> getFootnote() {return footnote;}

    public J setFootnote(AgChartCaptionOptions<?> footnote)
    {
        this.footnote = footnote;
        return (J) this;
    }

    public String getFormatterFunction()
    {
        return formatterFunction;
    }

    /**
     * Sets a global formatter function (raw JS). This clears any property-based formatter mappings.
     */
    public J setFormatterFunction(String formatterFunction)
    {
        this.formatterFunction = formatterFunction;
        // Ensure only one "formatter" representation is active.
        this.formatterFunctions = null;
        this.formatterFormats = null;
        return (J) this;
    }

    public AgChartPropertyFormatterFunctions<?> getFormatterFunctions()
    {
        return formatterFunctions;
    }

    /**
     * Sets per-property formatter callbacks (raw JS per property). This clears the global formatter and string formats.
     */
    public J setFormatterFunctions(AgChartPropertyFormatterFunctions<?> formatterFunctions)
    {
        this.formatterFunctions = formatterFunctions;
        this.formatterFunction = null;
        this.formatterFormats = null;
        return (J) this;
    }

    public AgChartPropertyFormatterFormats<?> getFormatterFormats()
    {
        return formatterFormats;
    }

    /**
     * Sets per-property formatter format strings. This clears the global formatter and function mappings.
     */
    public J setFormatterFormats(AgChartPropertyFormatterFormats<?> formatterFormats)
    {
        this.formatterFormats = formatterFormats;
        this.formatterFunction = null;
        this.formatterFunctions = null;
        return (J) this;
    }
}
