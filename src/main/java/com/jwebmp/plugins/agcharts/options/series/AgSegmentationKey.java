package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Segmentation axis key selector.
 * Use 'x' to segment along the x-axis (xKey), or 'y' to segment along the y-axis (yKey).
 */
public enum AgSegmentationKey {
    X("x"),
    Y("y");

    private final String value;

    AgSegmentationKey(String value) {
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
