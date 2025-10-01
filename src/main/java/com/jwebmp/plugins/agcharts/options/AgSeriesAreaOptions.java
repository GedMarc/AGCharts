package com.jwebmp.plugins.agcharts.options;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.legend.AgPadding;

/**
 * Series Area options - applies to the chart's series area container.
 * Supports drawing a border around the series area, corner radius, and padding.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesAreaOptions<J extends AgSeriesAreaOptions<J>> extends JavaScriptPart<J> {
    private AgBorderOptions<?> border;
    private Integer cornerRadius;

    /** Padding may be a number (applies to all sides) or a per-side object. */
    private Object padding;

    public AgBorderOptions<?> getBorder() {
        return border;
    }

    public J setBorder(AgBorderOptions<?> border) {
        this.border = border;
        return (J) this;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public J setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return (J) this;
    }

    public Object getPadding() {
        return padding;
    }

    /** Set uniform padding in pixels on all sides. */
    public J setPadding(Integer padding) {
        this.padding = padding;
        return (J) this;
    }

    /** Set per-side padding. */
    public J setPadding(AgPadding<?> padding) {
        this.padding = padding;
        return (J) this;
    }
}
