package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Interval options for Number axes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisNumberIntervalOptions<J extends AgAxisNumberIntervalOptions<J>> extends JavaScriptPart<J> {
    /**
     * Fixed interval step in axis units.
     */
    private Number step;

    /**
     * Explicit list of numeric values to display.
     */
    private List<Double> values;

    /** Approximate minimum pixel spacing between rendered items. */
    private Integer minSpacing;

    /** Approximate maximum pixel spacing between rendered items. */
    private Integer maxSpacing;

    public Number getStep() {
        return step;
    }

    public J setStep(Number step) {
        this.step = step;
        return (J) this;
    }

    public List<Double> getValues() {
        return values;
    }

    public J setValues(List<Double> values) {
        this.values = values;
        return (J) this;
    }

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
}
