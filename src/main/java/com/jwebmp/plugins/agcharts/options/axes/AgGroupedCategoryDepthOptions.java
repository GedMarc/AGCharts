package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgGroupedCategoryDepthOptions<J extends AgGroupedCategoryDepthOptions<J>> extends JavaScriptPart<J> {
    private AgBaseCartesianAxisLabelOptions<?> label;

    public AgBaseCartesianAxisLabelOptions<?> getLabel() {
        return label;
    }

    public J setLabel(AgBaseCartesianAxisLabelOptions<?> label) {
        this.label = label;
        return (J) this;
    }
}
