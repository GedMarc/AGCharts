package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Legend item configuration (marker + label + optional line sample).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendItemOptions<J extends AgChartLegendItemOptions<J>> extends JavaScriptPart<J> {
    private Integer maxWidth;
    private Integer paddingX;
    private Integer paddingY;
    private Boolean showSeriesStroke;

    private AgChartLegendItemMarkerOptions<?> marker;
    private AgChartLegendItemLabelOptions<?> label;
    private AgChartLegendItemLineOptions<?> line;

    public Integer getMaxWidth() {
        return maxWidth;
    }

    public J setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
        return (J) this;
    }

    public Integer getPaddingX() {
        return paddingX;
    }

    public J setPaddingX(Integer paddingX) {
        this.paddingX = paddingX;
        return (J) this;
    }

    public Integer getPaddingY() {
        return paddingY;
    }

    public J setPaddingY(Integer paddingY) {
        this.paddingY = paddingY;
        return (J) this;
    }

    public Boolean getShowSeriesStroke() {
        return showSeriesStroke;
    }

    public J setShowSeriesStroke(Boolean showSeriesStroke) {
        this.showSeriesStroke = showSeriesStroke;
        return (J) this;
    }

    public AgChartLegendItemMarkerOptions<?> getMarker() {
        return marker;
    }

    public J setMarker(AgChartLegendItemMarkerOptions<?> marker) {
        this.marker = marker;
        return (J) this;
    }

    public AgChartLegendItemLabelOptions<?> getLabel() {
        return label;
    }

    public J setLabel(AgChartLegendItemLabelOptions<?> label) {
        this.label = label;
        return (J) this;
    }

    public AgChartLegendItemLineOptions<?> getLine() {
        return line;
    }

    public J setLine(AgChartLegendItemLineOptions<?> line) {
        this.line = line;
        return (J) this;
    }
}
