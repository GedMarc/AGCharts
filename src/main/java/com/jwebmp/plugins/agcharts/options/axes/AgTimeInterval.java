package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Represents a time interval with a unit and optional step and epoch.
 * Example: { unit: 'day', step: 2, epoch: new Date('2024-01-01') }.
 *
 * Backwards compatibility: legacy "count" maps to "step".
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgTimeInterval {
    private AgTimeIntervalUnit unit;
    /** Multiple of the unit to use (a.k.a. legacy "count"). */
    private Integer step; // optional, defaults to 1 in runtime
    /** Optional anchor date for aligning intervals (e.g., start week on Monday). */
    private Date epoch;

    public AgTimeInterval() {
    }

    public AgTimeInterval(AgTimeIntervalUnit unit) {
        this.unit = unit;
    }

    public AgTimeInterval(AgTimeIntervalUnit unit, Integer step) {
        this.unit = unit;
        this.step = step;
    }

    public AgTimeIntervalUnit getUnit() {
        return unit;
    }

    public AgTimeInterval setUnit(AgTimeIntervalUnit unit) {
        this.unit = unit;
        return this;
    }

    public Integer getStep() {
        return step;
    }

    public AgTimeInterval setStep(Integer step) {
        this.step = step;
        return this;
    }

    public Date getEpoch() {
        return epoch;
    }

    public AgTimeInterval setEpoch(Date epoch) {
        this.epoch = epoch;
        return this;
    }

    // --- Backward-compatibility helpers for legacy "count" naming ---
    public Integer getCount() {
        return step;
    }

    public AgTimeInterval setCount(Integer count) {
        this.step = count;
        return this;
    }
}
