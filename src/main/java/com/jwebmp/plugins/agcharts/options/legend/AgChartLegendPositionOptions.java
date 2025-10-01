package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Flexible legend position object allowing floating and pixel offsets.
 * Example:
 * { placement: 'right-top', floating: true, xOffset: -50, yOffset: 75 }
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendPositionOptions<J extends AgChartLegendPositionOptions<J>> extends JavaScriptPart<J> {
    /** One of the preset placements, e.g., 'top', 'bottom', 'right', 'left', 'top-right', 'right-top', ... */
    private String placement;
    /** If true, legend floats above the series area (does not affect layout spacing). */
    private Boolean floating;
    /** Horizontal pixel offset from computed position. */
    private Integer xOffset;
    /** Vertical pixel offset from computed position. */
    private Integer yOffset;

    public String getPlacement() {
        return placement;
    }

    public J setPlacement(String placement) {
        this.placement = placement;
        return (J) this;
    }

    public Boolean getFloating() {
        return floating;
    }

    public J setFloating(Boolean floating) {
        this.floating = floating;
        return (J) this;
    }

    public Integer getXOffset() {
        return xOffset;
    }

    public J setXOffset(Integer xOffset) {
        this.xOffset = xOffset;
        return (J) this;
    }

    public Integer getYOffset() {
        return yOffset;
    }

    public J setYOffset(Integer yOffset) {
        this.yOffset = yOffset;
        return (J) this;
    }
}
