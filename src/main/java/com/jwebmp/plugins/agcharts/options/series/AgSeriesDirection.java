package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Rendering direction for bar-like series.
 */
public enum AgSeriesDirection {
    HORIZONTAL("horizontal"),
    VERTICAL("vertical");

    private final String value;

    AgSeriesDirection(String value) {
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
