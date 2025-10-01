package com.jwebmp.plugins.agcharts.options.tooltip;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Tooltip position options: anchor target, placement(s) and pixel offsets.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgTooltipPositionOptions<J extends AgTooltipPositionOptions<J>> extends JavaScriptPart<J> {
    private AgTooltipAnchorTo anchorTo; // 'node' | 'pointer' | 'chart'

    /** placement can be a single string (e.g., 'top') or an array for fallbacks (e.g., ['left','right']). */
    private Object placement;

    private Integer xOffset;
    private Integer yOffset;

    public AgTooltipAnchorTo getAnchorTo() {
        return anchorTo;
    }

    public J setAnchorTo(AgTooltipAnchorTo anchorTo) {
        this.anchorTo = anchorTo;
        return (J) this;
    }

    public Object getPlacement() {
        return placement;
    }

    /** Set a single placement string. */
    public J setPlacement(String placement) {
        this.placement = placement;
        return (J) this;
    }

    /** Set fallbacks by providing a list of placement strings. */
    public J setPlacement(List<String> placements) {
        this.placement = placements;
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
