package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgCrosshairOptions<J extends AgCrosshairOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled;
    private String color;
    private Integer width;

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }

    public String getColor() {
        return color;
    }

    public J setColor(String color) {
        this.color = color;
        return (J) this;
    }

    public Integer getWidth() {
        return width;
    }

    public J setWidth(Integer width) {
        this.width = width;
        return (J) this;
    }
}
