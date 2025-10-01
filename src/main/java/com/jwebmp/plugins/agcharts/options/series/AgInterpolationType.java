package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Supported interpolation types for line/area series.
 */
public enum AgInterpolationType {
    LINEAR("linear"),
    SMOOTH("smooth");

    private final String value;

    AgInterpolationType(String value) {
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
