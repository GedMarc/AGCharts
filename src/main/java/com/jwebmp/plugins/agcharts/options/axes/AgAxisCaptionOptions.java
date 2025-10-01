package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Axis title/caption options.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisCaptionOptions<J extends AgAxisCaptionOptions<J>> extends JavaScriptPart<J> {
    private String text;
    private Boolean enabled;
    private String color;
    private Integer spacing;

    public String getText() {
        return text;
    }

    public J setText(String text) {
        this.text = text;
        return (J) this;
    }

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

    public Integer getSpacing() {
        return spacing;
    }

    public J setSpacing(Integer spacing) {
        this.spacing = spacing;
        return (J) this;
    }
}
