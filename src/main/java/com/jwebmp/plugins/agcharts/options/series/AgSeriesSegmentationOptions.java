package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Segmentation options for a series. Defines the axis key and the list of style segments.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesSegmentationOptions<J extends AgSeriesSegmentationOptions<J>> extends JavaScriptPart<J> {
    /** Segmentation axis key: 'x' or 'y'. */
    private AgSegmentationKey key;

    /** Ordered list of segments with style overrides. */
    private List<AgSeriesShapeSegmentOptions<?>> segments;

    public AgSegmentationKey getKey() {
        return key;
    }

    public J setKey(AgSegmentationKey key) {
        this.key = key;
        return (J) this;
    }

    public List<AgSeriesShapeSegmentOptions<?>> getSegments() {
        return segments;
    }

    public J setSegments(List<AgSeriesShapeSegmentOptions<?>> segments) {
        this.segments = segments;
        return (J) this;
    }
}
