package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Legend pagination configuration (label + buttons).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendPaginationOptions<J extends AgChartLegendPaginationOptions<J>> extends JavaScriptPart<J> {
    private AgChartLegendPaginationLabelOptions<?> label;
    private AgChartLegendPaginationButtonOptions<?> button;

    public AgChartLegendPaginationLabelOptions<?> getLabel() {
        return label;
    }

    public J setLabel(AgChartLegendPaginationLabelOptions<?> label) {
        this.label = label;
        return (J) this;
    }

    public AgChartLegendPaginationButtonOptions<?> getButton() {
        return button;
    }

    public J setButton(AgChartLegendPaginationButtonOptions<?> button) {
        this.button = button;
        return (J) this;
    }
}
