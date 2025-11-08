package com.jwebmp.plugins.agcharts.options.legend.gradient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.series.AgSeriesLabelOptions;

/**
 * Scale options for Gradient Legend, including label formatting and padding.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgGradientLegendScaleOptions<J extends AgGradientLegendScaleOptions<J>> extends JavaScriptPart<J>
{
    private AgSeriesLabelOptions<?> label;
    private Integer padding;

    public AgSeriesLabelOptions<?> getLabel() {return label;}
    public J setLabel(AgSeriesLabelOptions<?> label) {this.label = label;return (J) this;}

    public Integer getPadding() {return padding;}
    public J setPadding(Integer padding) {this.padding = padding;return (J) this;}
}
