package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Category Axis options.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgCategoryAxisOptions<J extends AgCategoryAxisOptions<J>> extends AgAxisBaseOptions<J> {
    private AgAxisCategoryIntervalOptions<?> interval;
    private Double paddingInner;      // Ratio 0..1
    private Double paddingOuter;      // Ratio 0..1
    private Double groupPaddingInner; // Ratio 0..1
    private AgBandHighlightOptions<?> bandHighlight;

    public AgCategoryAxisOptions() {
        setType("category");
    }

    public AgAxisCategoryIntervalOptions<?> getInterval() {
        return interval;
    }

    public J setInterval(AgAxisCategoryIntervalOptions<?> interval) {
        this.interval = interval;
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
