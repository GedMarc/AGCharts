package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Number Axis options.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgNumberAxisOptions<J extends AgNumberAxisOptions<J>> extends AgAxisBaseOptions<J> {
    private Double min;
    private Double max;
    private AgAxisNumberIntervalOptions<?> interval;

    public AgNumberAxisOptions() {
        setType("number");
    }

    public Double getMin() {
        return min;
    }

    public J setMin(Double min) {
        this.min = min;
        return (J) this;
    }

    public Double getMax() {
        return max;
    }

    public J setMax(Double max) {
        this.max = max;
        return (J) this;
    }

    public AgAxisNumberIntervalOptions<?> getInterval() {
        return interval;
    }

    public J setInterval(AgAxisNumberIntervalOptions<?> interval) {
        this.interval = interval;
        return (J) this;
    }
}
