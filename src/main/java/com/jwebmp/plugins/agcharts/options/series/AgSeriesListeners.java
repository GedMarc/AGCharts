package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Minimal series listeners, exposing node click events.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesListeners<J extends AgSeriesListeners<J>> extends JavaScriptPart<J> {
    /** JS function(params, event) */
    @JsonRawValue
    private String nodeClick;
    /** JS function(params, event) */
    @JsonRawValue
    private String nodeDoubleClick;

    public String getNodeClick() {
        return nodeClick;
    }

    public J setNodeClick(String nodeClick) {
        this.nodeClick = nodeClick;
        return (J) this;
    }

    public String getNodeDoubleClick() {
        return nodeDoubleClick;
    }

    public J setNodeDoubleClick(String nodeDoubleClick) {
        this.nodeDoubleClick = nodeDoubleClick;
        return (J) this;
    }
}
