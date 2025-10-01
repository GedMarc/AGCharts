package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Legend event listener callbacks. Provide JS functions as raw strings.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendListeners<J extends AgChartLegendListeners<J>> extends JavaScriptPart<J> {
    /** JS function(params, event) */
    @JsonRawValue
    private String legendItemClick;
    /** JS function(params, event) */
    @JsonRawValue
    private String legendItemDoubleClick;

    public String getLegendItemClick() {
        return legendItemClick;
    }

    public J setLegendItemClick(String legendItemClick) {
        this.legendItemClick = legendItemClick;
        return (J) this;
    }

    public String getLegendItemDoubleClick() {
        return legendItemDoubleClick;
    }

    public J setLegendItemDoubleClick(String legendItemDoubleClick) {
        this.legendItemDoubleClick = legendItemDoubleClick;
        return (J) this;
    }
}
