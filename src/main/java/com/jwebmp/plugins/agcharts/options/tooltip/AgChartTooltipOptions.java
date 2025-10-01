package com.jwebmp.plugins.agcharts.options.tooltip;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.axes.AgAxisLabelWrapping;

/**
 * Chart-level tooltip options. Used unless overridden by series-level options.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartTooltipOptions<J extends AgChartTooltipOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled;
    private AgTooltipMode mode;
    private Boolean showArrow;

    /** Range from point that triggers tooltip: 'nearest' | 'exact' | number (pixels). */
    private Object range;

    /** Position options (anchor/placement/offsets). */
    private AgTooltipPositionOptions<?> position;

    /** Enable pagination when overlapping datapoints exist. */
    private Boolean pagination;

    /** Delay before showing tooltip in milliseconds. */
    private Integer delay;

    /** Text wrapping strategy for tooltip content. */
    private AgAxisLabelWrapping wrapping; // reuse general wrapping enum values

    public Boolean getEnabled() { return enabled; }
    public J setEnabled(Boolean enabled) { this.enabled = enabled; return (J) this; }

    public AgTooltipMode getMode() { return mode; }
    public J setMode(AgTooltipMode mode) { this.mode = mode; return (J) this; }

    public Boolean getShowArrow() { return showArrow; }
    public J setShowArrow(Boolean showArrow) { this.showArrow = showArrow; return (J) this; }

    public Object getRange() { return range; }
    /** Set range using a keyword: 'nearest' or 'exact'. */
    public J setRange(String range) { this.range = range; return (J) this; }
    /** Set range using pixel distance. */
    public J setRange(Integer pixels) { this.range = pixels; return (J) this; }

    public AgTooltipPositionOptions<?> getPosition() { return position; }
    public J setPosition(AgTooltipPositionOptions<?> position) { this.position = position; return (J) this; }

    public Boolean getPagination() { return pagination; }
    public J setPagination(Boolean pagination) { this.pagination = pagination; return (J) this; }

    public Integer getDelay() { return delay; }
    public J setDelay(Integer delay) { this.delay = delay; return (J) this; }

    public AgAxisLabelWrapping getWrapping() { return wrapping; }
    public J setWrapping(AgAxisLabelWrapping wrapping) { this.wrapping = wrapping; return (J) this; }
}
