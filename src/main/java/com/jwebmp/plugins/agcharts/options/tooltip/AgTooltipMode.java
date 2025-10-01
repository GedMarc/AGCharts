package com.jwebmp.plugins.agcharts.options.tooltip;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Tooltip display mode.
 */
public enum AgTooltipMode {
    SINGLE("single"),
    SHARED("shared"),
    COMPACT("compact");

    private final String value;

    AgTooltipMode(String value) {
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
