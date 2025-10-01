package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Grouped Category Axis options.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgGroupedCategoryAxisOptions<J extends AgGroupedCategoryAxisOptions<J>> extends AgCategoryAxisOptions<J> {
    private List<AgGroupedCategoryDepthOptions<?>> depthOptions;

    public AgGroupedCategoryAxisOptions() {
        setType("grouped-category");
    }

    public List<AgGroupedCategoryDepthOptions<?>> getDepthOptions() {
        return depthOptions;
    }

    public J setDepthOptions(List<AgGroupedCategoryDepthOptions<?>> depthOptions) {
        this.depthOptions = depthOptions;
        return (J) this;
    }
}
