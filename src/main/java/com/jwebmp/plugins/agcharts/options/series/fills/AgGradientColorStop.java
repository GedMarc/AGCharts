package com.jwebmp.plugins.agcharts.options.series.fills;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Represents a single colour stop within a gradient fill.
 * colour: CSS colour string; stop: ratio 0..1 position along the gradient.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgGradientColorStop<J extends AgGradientColorStop<J>> extends JavaScriptPart<J> {
    private String color;
    private Double stop;

    public String getColor() {
        return color;
    }

    public J setColor(String color) {
        this.color = color;
        return (J) this;
    }

    public Double getStop() {
        return stop;
    }

    public J setStop(Double stop) {
        this.stop = stop;
        return (J) this;
    }
}
