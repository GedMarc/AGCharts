package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Unit Time Axis options - allocates a band per unit (e.g., per day/month).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgUnitTimeAxisOptions<J extends AgUnitTimeAxisOptions<J>> extends AgAxisBaseOptions<J> {
    private Date min;
    private Date max;
    private AgAxisTimeIntervalOptions<?> interval;

    /** Defines the band unit: either a unit enum or a full interval with step/epoch. */
    private Object unit;

    /** Parent level configuration (enabled by default in runtime). */
    private AgTimeAxisParentLevel<?> parentLevel;

    // Banded axis padding options (like category axes)
    private Double paddingInner;      // Ratio 0..1
    private Double paddingOuter;      // Ratio 0..1
    private Double groupPaddingInner; // Ratio 0..1
    private AgBandHighlightOptions<?> bandHighlight;

    public AgUnitTimeAxisOptions() {
        setType("unit-time");
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

    public Object getUnit() {
        return unit;
    }

    public J setUnit(AgTimeIntervalUnit unit) {
        this.unit = unit;
        return (J) this;
    }

    public J setUnit(AgTimeInterval unit) {
        this.unit = unit;
        return (J) this;
    }

    public AgTimeAxisParentLevel<?> getParentLevel() {
        return parentLevel;
    }

    public J setParentLevel(AgTimeAxisParentLevel<?> parentLevel) {
        this.parentLevel = parentLevel;
        return (J) this;
    }

    public Double getPaddingInner() {
        return paddingInner;
    }

    public J setPaddingInner(Double paddingInner) {
        this.paddingInner = paddingInner;
        return (J) this;
    }

    public Double getPaddingOuter() {
        return paddingOuter;
    }

    public J setPaddingOuter(Double paddingOuter) {
        this.paddingOuter = paddingOuter;
        return (J) this;
    }

    public Double getGroupPaddingInner() {
        return groupPaddingInner;
    }

    public J setGroupPaddingInner(Double groupPaddingInner) {
        this.groupPaddingInner = groupPaddingInner;
        return (J) this;
    }

    public AgBandHighlightOptions<?> getBandHighlight() {
        return bandHighlight;
    }

    public J setBandHighlight(AgBandHighlightOptions<?> bandHighlight) {
        this.bandHighlight = bandHighlight;
        return (J) this;
    }
}
