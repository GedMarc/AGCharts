package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Interval configuration for Category/Grouped Category axes.
 * Supports step, explicit values, responsive spacing, and placement.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisCategoryIntervalOptions<J extends AgAxisCategoryIntervalOptions<J>> extends JavaScriptPart<J> {
    /**
     * Fixed interval step - render every Nth category.
     */
    private Integer step;

    /**
     * Explicit list of category values to display.
     */
    private List<String> values;

    /**
     * Minimum pixel spacing between rendered items (approximate).
     */
    private Integer minSpacing;

    /**
     * Maximum pixel spacing between rendered items (approximate).
     * Note: Not supported by category axes in AG Charts; included for API completeness and ignored by runtime.
     */
    private Integer maxSpacing;

    /**
     * Placement of ticks/gridlines relative to bands. Defaults to 'on'.
     */
    private AgAxisIntervalPlacement placement;

    public Integer getStep() {
        return step;
    }

    public J setStep(Integer step) {
        this.step = step;
        return (J) this;
    }

    public List<String> getValues() {
        return values;
    }

    public J setValues(List<String> values) {
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
