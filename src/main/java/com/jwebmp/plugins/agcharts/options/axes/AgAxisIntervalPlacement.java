package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Placement of ticks and grid lines relative to category/time bands.
 */
public enum AgAxisIntervalPlacement {
    ON("on"),
    BETWEEN("between");

    private final String value;

    AgAxisIntervalPlacement(String value) {
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
