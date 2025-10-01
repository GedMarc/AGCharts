package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Legend options for AG Charts (community).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendOptions<J extends AgChartLegendOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled;

    /** Accepts a string preset (e.g., "bottom") or a position object with floating/offsets. */
    private Object position;

    private AgChartLegendOrientation orientation;

    private Integer maxWidth;
    private Integer maxHeight;

    private AgLegendBorderOptions<?> border;
    private Integer cornerRadius;
    private AgPadding<?> padding;

    /** Spacing outside the legend (ignored when floating=true). */
    private Integer spacing;

    private AgChartLegendItemOptions<?> item;

    private Boolean reverseOrder;
    private AgChartLegendListeners<?> listeners;
    private AgChartLegendPaginationOptions<?> pagination;

    private Boolean preventHidingAll;
    private Boolean toggleSeries;

    private String fill;
    private Double fillOpacity;

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }

    public Object getPosition() {
        return position;
    }

    /** Set a simple preset position string, e.g., "bottom", "right-top". */
    public J setPosition(String position) {
        this.position = position;
        return (J) this;
    }

    /** Set an advanced position object with floating and offsets. */
    public J setPosition(AgChartLegendPositionOptions<?> position) {
        this.position = position;
        return (J) this;
    }

    public AgChartLegendOrientation getOrientation() {
        return orientation;
    }

    public J setOrientation(AgChartLegendOrientation orientation) {
        this.orientation = orientation;
        return (J) this;
    }

    public Integer getMaxWidth() {
        return maxWidth;
    }

    public J setMaxWidth(Integer maxWidth) {
        this.maxWidth = maxWidth;
        return (J) this;
    }

    public Integer getMaxHeight() {
        return maxHeight;
    }

    public J setMaxHeight(Integer maxHeight) {
        this.maxHeight = maxHeight;
        return (J) this;
    }

    public AgLegendBorderOptions<?> getBorder() {
        return border;
    }

    public J setBorder(AgLegendBorderOptions<?> border) {
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

    public AgPadding<?> getPadding() {
        return padding;
    }

    public J setPadding(AgPadding<?> padding) {
        this.padding = padding;
        return (J) this;
    }

    /** Convenience overload to set uniform padding for all sides. */
    public J setPadding(Integer padding) {
        AgPadding<?> p = new AgPadding<>().setTop(padding).setRight(padding).setBottom(padding).setLeft(padding);
        this.padding = p;
        return (J) this;
    }

    public Integer getSpacing() {
        return spacing;
    }

    public J setSpacing(Integer spacing) {
        this.spacing = spacing;
        return (J) this;
    }

    public AgChartLegendItemOptions<?> getItem() {
        return item;
    }

    public J setItem(AgChartLegendItemOptions<?> item) {
        this.item = item;
        return (J) this;
    }

    public Boolean getReverseOrder() {
        return reverseOrder;
    }

    public J setReverseOrder(Boolean reverseOrder) {
        this.reverseOrder = reverseOrder;
        return (J) this;
    }

    public AgChartLegendListeners<?> getListeners() {
        return listeners;
    }

    public J setListeners(AgChartLegendListeners<?> listeners) {
        this.listeners = listeners;
        return (J) this;
    }

    public AgChartLegendPaginationOptions<?> getPagination() {
        return pagination;
    }

    public J setPagination(AgChartLegendPaginationOptions<?> pagination) {
        this.pagination = pagination;
        return (J) this;
    }

    public Boolean getPreventHidingAll() {
        return preventHidingAll;
    }

    public J setPreventHidingAll(Boolean preventHidingAll) {
        this.preventHidingAll = preventHidingAll;
        return (J) this;
    }

    public Boolean getToggleSeries() {
        return toggleSeries;
    }

    public J setToggleSeries(Boolean toggleSeries) {
        this.toggleSeries = toggleSeries;
        return (J) this;
    }

    public String getFill() {
        return fill;
    }

    public J setFill(String fill) {
        this.fill = fill;
        return (J) this;
    }

    public Double getFillOpacity() {
        return fillOpacity;
    }

    public J setFillOpacity(Double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return (J) this;
    }
}
