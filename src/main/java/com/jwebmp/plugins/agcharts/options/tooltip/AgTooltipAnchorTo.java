package com.jwebmp.plugins.agcharts.options.tooltip;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * What element the tooltip should anchor to.
 */
public enum AgTooltipAnchorTo {
    NODE("node"),
    POINTER("pointer"),
    CHART("chart");

    private final String value;

    AgTooltipAnchorTo(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
