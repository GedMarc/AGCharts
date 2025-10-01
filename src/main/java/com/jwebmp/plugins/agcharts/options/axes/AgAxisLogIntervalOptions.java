package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Interval options for Log axes. Step controls exponent increments.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisLogIntervalOptions<J extends AgAxisLogIntervalOptions<J>> extends JavaScriptPart<J> {
    /**
     * Step for exponents (e.g., 1 -> 10^0, 10^1, 10^2 ... ; 2 -> 10^0, 10^2, 10^4 ...).
     */
    private Number step;

    /** Explicit list of numeric values to display. */
    private List<Double> values;

    /** Approximate minimum pixel spacing. */
    private Integer minSpacing;

    /** Approximate maximum pixel spacing. */
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
