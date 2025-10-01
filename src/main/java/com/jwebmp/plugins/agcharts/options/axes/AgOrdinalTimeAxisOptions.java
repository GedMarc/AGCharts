package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Ordinal Time Axis options - only provided values are shown.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgOrdinalTimeAxisOptions<J extends AgOrdinalTimeAxisOptions<J>> extends AgAxisBaseOptions<J> {
    private Date min;
    private Date max;
    private AgAxisTimeIntervalOptions<?> interval;

    /** Optional parent level (e.g., months above days). */
    private AgTimeAxisParentLevel<?> parentLevel;

    public AgOrdinalTimeAxisOptions() {
        setType("ordinal-time");
    }

    public Date getMin() {
        return min;
    }

    public J setMin(Date min) {
        this.min = min;
        return (J) this;
    }

    public Date getMax() {
        return max;
    }

    public J setMax(Date max) {
        this.max = max;
        return (J) this;
    }

    public AgAxisTimeIntervalOptions<?> getInterval() {
        return interval;
    }

    public J setInterval(AgAxisTimeIntervalOptions<?> interval) {
        this.interval = interval;
        return (J) this;
    }

    public AgTimeAxisParentLevel<?> getParentLevel() {
        return parentLevel;
    }

    public J setParentLevel(AgTimeAxisParentLevel<?> parentLevel) {
        this.parentLevel = parentLevel;
        return (J) this;
    }
}
