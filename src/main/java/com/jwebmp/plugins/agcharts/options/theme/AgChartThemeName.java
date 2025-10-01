package com.jwebmp.plugins.agcharts.options.theme;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Built-in AG Charts theme names.
 */
public enum AgChartThemeName {
    AG_DEFAULT("ag-default"),
    AG_DEFAULT_DARK("ag-default-dark"),
    AG_SHEETS("ag-sheets"),
    AG_SHEETS_DARK("ag-sheets-dark"),
    AG_POLYCHROMA("ag-polychroma"),
    AG_POLYCHROMA_DARK("ag-polychroma-dark"),
    AG_VIVID("ag-vivid"),
    AG_VIVID_DARK("ag-vivid-dark"),
    AG_MATERIAL("ag-material"),
    AG_MATERIAL_DARK("ag-material-dark");

    private final String value;

    AgChartThemeName(String value) {
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
