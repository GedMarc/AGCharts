package com.jwebmp.plugins.agcharts.options.navigator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.series.AgSeriesLabelOptions;

/**
 * Mini Chart options inside the Navigator.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgNavigatorMiniChartOptions<J extends AgNavigatorMiniChartOptions<J>> extends JavaScriptPart<J>
{
    private Boolean enabled;
    private AgSeriesLabelOptions<?> label;

    public Boolean getEnabled() { return enabled; }
    public J setEnabled(Boolean enabled) { this.enabled = enabled; return (J) this; }

    public AgSeriesLabelOptions<?> getLabel() { return label; }
    public J setLabel(AgSeriesLabelOptions<?> label) { this.label = label; return (J) this; }
}
