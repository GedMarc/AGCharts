package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Orientation of legend items.
 */
public enum AgChartLegendOrientation {
    HORIZONTAL("horizontal"),
    VERTICAL("vertical");

    private final String value;

    AgChartLegendOrientation(String value) {
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
