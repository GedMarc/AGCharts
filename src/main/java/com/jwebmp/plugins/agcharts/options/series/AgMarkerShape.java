package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Supported built-in marker shapes for AG Charts.
 */
public enum AgMarkerShape {
    CIRCLE("circle"),
    SQUARE("square"),
    CROSS("cross"),
    PLUS("plus"),
    TRIANGLE("triangle"),
    DIAMOND("diamond");

    private final String value;

    AgMarkerShape(String value) {
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
