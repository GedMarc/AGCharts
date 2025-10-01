package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.Date;
import java.util.List;

/**
 * Interval options for Time axes.
 * Supports step as either AgTimeIntervalUnit or AgTimeInterval object.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisTimeIntervalOptions<J extends AgAxisTimeIntervalOptions<J>> extends JavaScriptPart<J> {
    /**
     * Step can be either a unit (e.g., DAY) or an object { unit, count }.
     */
    private Object step;

    /** Explicit list of datetimes to display. */
    private List<Date> values;

    /** Approximate minimum pixel spacing. */
    private Integer minSpacing;

    /** Approximate maximum pixel spacing. */
    private Integer maxSpacing;

    /** Placement for banded time axes (unit/ordinal). */
    private AgAxisIntervalPlacement placement;

    public Object getStep() {
        return step;
    }

    public J setStep(AgTimeIntervalUnit unit) {
        this.step = unit;
        return (J) this;
    }

    public J setStep(AgTimeInterval interval) {
        this.step = interval;
        return (J) this;
    }

    public List<Date> getValues() {
        return values;
    }

    public J setValues(List<Date> values) {
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

    public AgAxisIntervalPlacement getPlacement() {
        return placement;
    }

    public J setPlacement(AgAxisIntervalPlacement placement) {
        this.placement = placement;
        return (J) this;
    }
}
