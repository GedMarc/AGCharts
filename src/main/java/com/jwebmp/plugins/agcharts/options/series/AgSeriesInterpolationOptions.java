package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Interpolation options for series that draw continuous lines.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesInterpolationOptions<J extends AgSeriesInterpolationOptions<J>> extends JavaScriptPart<J> {
    private AgInterpolationType type;

    public AgInterpolationType getType() {
        return type;
    }

    public J setType(AgInterpolationType type) {
        this.type = type;
        return (J) this;
    }
}
