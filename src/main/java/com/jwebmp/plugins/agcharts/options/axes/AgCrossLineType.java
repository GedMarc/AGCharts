package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of Cross Line to render.
 */
public enum AgCrossLineType {
    LINE("line"),
    RANGE("range");

    private final String value;

    AgCrossLineType(String value) {
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
