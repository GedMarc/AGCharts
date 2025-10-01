package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Series Highlighting configuration.
 *
 * Configure how items and series appear when hovered (highlighted) or dimmed (unhighlighted).
 * Includes a bringToFront option to render the highlighted series above others.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesHighlightOptions<J extends AgSeriesHighlightOptions<J>> extends JavaScriptPart<J> {
    /** When true, the highlighted series is rendered above others. */
    private Boolean bringToFront;

    /** Styles for the currently highlighted item (e.g., marker under cursor). */
    private AgSeriesHighlightStyleOptions<?> highlightedItem;
    /** Styles for non-hovered items within the highlighted series. */
    private AgSeriesHighlightStyleOptions<?> unhighlightedItem;

    /** Styles for the series that contains the highlighted item. */
    private AgSeriesHighlightStyleOptions<?> highlightedSeries;
    /** Styles for all other series when one is highlighted. */
    private AgSeriesHighlightStyleOptions<?> unhighlightedSeries;

    public Boolean getBringToFront() {
        return bringToFront;
    }

    public J setBringToFront(Boolean bringToFront) {
        this.bringToFront = bringToFront;
        return (J) this;
    }

    public AgSeriesHighlightStyleOptions<?> getHighlightedItem() {
        return highlightedItem;
    }

    public J setHighlightedItem(AgSeriesHighlightStyleOptions<?> highlightedItem) {
        this.highlightedItem = highlightedItem;
        return (J) this;
    }

    public AgSeriesHighlightStyleOptions<?> getUnhighlightedItem() {
        return unhighlightedItem;
    }

    public J setUnhighlightedItem(AgSeriesHighlightStyleOptions<?> unhighlightedItem) {
        this.unhighlightedItem = unhighlightedItem;
        return (J) this;
    }

    public AgSeriesHighlightStyleOptions<?> getHighlightedSeries() {
        return highlightedSeries;
    }

    public J setHighlightedSeries(AgSeriesHighlightStyleOptions<?> highlightedSeries) {
        this.highlightedSeries = highlightedSeries;
        return (J) this;
    }

    public AgSeriesHighlightStyleOptions<?> getUnhighlightedSeries() {
        return unhighlightedSeries;
    }

    public J setUnhighlightedSeries(AgSeriesHighlightStyleOptions<?> unhighlightedSeries) {
        this.unhighlightedSeries = unhighlightedSeries;
        return (J) this;
    }
}
