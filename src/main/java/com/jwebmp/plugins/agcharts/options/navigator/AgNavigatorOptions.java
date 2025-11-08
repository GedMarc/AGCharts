package com.jwebmp.plugins.agcharts.options.navigator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Navigator options (Enterprise): enables zoom/pan with optional Mini Chart.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgNavigatorOptions<J extends AgNavigatorOptions<J>> extends JavaScriptPart<J>
{
    private Boolean enabled;
    private Integer height;        // PixelSize
    private Integer cornerRadius;  // px
    private Integer spacing;       // PixelSize distance to bottom axis

    private AgNavigatorMaskOptions<?> mask;
    private AgNavigatorHandleOptions<?> minHandle;
    private AgNavigatorHandleOptions<?> maxHandle;
    private AgNavigatorMiniChartOptions<?> miniChart;

    public Boolean getEnabled() { return enabled; }
    public J setEnabled(Boolean enabled) { this.enabled = enabled; return (J) this; }

    public Integer getHeight() { return height; }
    public J setHeight(Integer height) { this.height = height; return (J) this; }

    public Integer getCornerRadius() { return cornerRadius; }
    public J setCornerRadius(Integer cornerRadius) { this.cornerRadius = cornerRadius; return (J) this; }

    public Integer getSpacing() { return spacing; }
    public J setSpacing(Integer spacing) { this.spacing = spacing; return (J) this; }

    public AgNavigatorMaskOptions<?> getMask() { return mask; }
    public J setMask(AgNavigatorMaskOptions<?> mask) { this.mask = mask; return (J) this; }

    public AgNavigatorHandleOptions<?> getMinHandle() { return minHandle; }
    public J setMinHandle(AgNavigatorHandleOptions<?> minHandle) { this.minHandle = minHandle; return (J) this; }

    public AgNavigatorHandleOptions<?> getMaxHandle() { return maxHandle; }
    public J setMaxHandle(AgNavigatorHandleOptions<?> maxHandle) { this.maxHandle = maxHandle; return (J) this; }

    public AgNavigatorMiniChartOptions<?> getMiniChart() { return miniChart; }
    public J setMiniChart(AgNavigatorMiniChartOptions<?> miniChart) { this.miniChart = miniChart; return (J) this; }
}
