package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Axis position for AG Charts cartesian axes.
 * top/bottom for horizontal (x) axes, left/right for vertical (y) axes.
 */
public enum AgCartesianAxisPosition {
    TOP("top"),
    BOTTOM("bottom"),
    LEFT("left"),
    RIGHT("right");

    private final String value;

    AgCartesianAxisPosition(String value) {
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
