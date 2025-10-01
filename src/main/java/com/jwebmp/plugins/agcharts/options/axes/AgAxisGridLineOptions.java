package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Grid line options for axes, including alternating band shading support.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisGridLineOptions<J extends AgAxisGridLineOptions<J>> extends JavaScriptPart<J> {
    /** Enable or disable grid lines for this axis. */
    private Boolean enabled;
    /** Default width (in pixels) for grid lines. Can be overridden by style[].strokeWidth. */
    private Integer width;
    /** Sequential styles applied to grid lines (loops when exceeding length). */
    private List<AgAxisGridStyle<?>> style;

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }

    public Integer getWidth() {
        return width;
    }

    public J setWidth(Integer width) {
        this.width = width;
        return (J) this;
    }

    public List<AgAxisGridStyle<?>> getStyle() {
        return style;
    }

    public J setStyle(List<AgAxisGridStyle<?>> style) {
        this.style = style;
        return (J) this;
    }
}
