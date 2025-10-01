package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Logarithmic Axis options.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgLogAxisOptions<J extends AgLogAxisOptions<J>> extends AgAxisBaseOptions<J> {
    private Double base; // logarithm base, default 10
    private Integer minSpacing; // legacy convenience, prefer interval.minSpacing
    private Double min;
    private Double max;
    private AgAxisLogIntervalOptions<?> interval;

    public AgLogAxisOptions() {
        setType("log");
    }

    public Double getBase() {
        return base;
    }

    public J setBase(Double base) {
        this.base = base;
        return (J) this;
    }

    public Integer getMinSpacing() {
        return minSpacing;
    }

    public J setMinSpacing(Integer minSpacing) {
        this.minSpacing = minSpacing;
        return (J) this;
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

    public AgAxisLogIntervalOptions<?> getInterval() {
        return interval;
    }

    public J setInterval(AgAxisLogIntervalOptions<?> interval) {
        this.interval = interval;
        return (J) this;
    }
}
