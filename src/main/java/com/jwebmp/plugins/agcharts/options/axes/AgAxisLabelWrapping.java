package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Wrapping strategies for axis labels.
 */
public enum AgAxisLabelWrapping {
    ON_SPACE("on-space"),
    ALWAYS("always"),
    HYPHENATE("hyphenate"),
    NEVER("never");

    private final String value;

    AgAxisLabelWrapping(String value) {
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
