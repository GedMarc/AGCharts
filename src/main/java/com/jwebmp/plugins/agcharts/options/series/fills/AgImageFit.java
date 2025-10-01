package com.jwebmp.plugins.agcharts.options.series.fills;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * How the image should fit within the series/marker shape.
 */
public enum AgImageFit {
    CONTAIN("contain"),
    COVER("cover"),
    STRETCH("stretch"),
    NONE("none");

    private final String value;

    AgImageFit(String value) {
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
