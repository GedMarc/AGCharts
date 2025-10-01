package com.jwebmp.plugins.agcharts.options;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Background options for AG Charts (community).
 *
 * Controls the chart background visibility and fill color.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartBackground<J extends AgChartBackground<J>> extends JavaScriptPart<J> {
    /** Whether the chart background should be visible. */
    private Boolean visible;
    /** CSS color for the chart background fill. */
    private String fill;

    public Boolean getVisible() {
        return visible;
    }

    public J setVisible(Boolean visible) {
        this.visible = visible;
        return (J) this;
    }

    public String getFill() {
        return fill;
    }

    public J setFill(String fill) {
        this.fill = fill;
        return (J) this;
    }
}
