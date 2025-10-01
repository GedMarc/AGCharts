package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisBaseTickOptions<J extends AgAxisBaseTickOptions<J>> extends JavaScriptPart<J> {
    private Integer minSpacing;
    private Integer maxSpacing;
    private Integer count;

    public Integer getMinSpacing() {
        return minSpacing;
    }

    public J setMinSpacing(Integer minSpacing) {
        this.minSpacing = minSpacing;
        return (J) this;
    }

    public Integer getMaxSpacing() {
        return maxSpacing;
    }

    public J setMaxSpacing(Integer maxSpacing) {
        this.maxSpacing = maxSpacing;
        return (J) this;
    }

    public Integer getCount() {
        return count;
    }

    public J setCount(Integer count) {
        this.count = count;
        return (J) this;
    }
}
