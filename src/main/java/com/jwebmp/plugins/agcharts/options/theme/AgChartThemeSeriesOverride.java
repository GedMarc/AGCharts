package com.jwebmp.plugins.agcharts.options.theme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Series-level override container supporting a 'styler' callback.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartThemeSeriesOverride<J extends AgChartThemeSeriesOverride<J>> extends JavaScriptPart<J> {
    /** JS function(params) returning an object of series style props. */
    @JsonRawValue
    private String styler;

    /** Highlight configuration to apply to all series of this type via theme overrides. */
    private com.jwebmp.plugins.agcharts.options.series.AgSeriesHighlightOptions<?> highlight;

    public String getStyler() {
        return styler;
    }

    public J setStyler(String styler) {
        this.styler = styler;
        return (J) this;
    }

    public com.jwebmp.plugins.agcharts.options.series.AgSeriesHighlightOptions<?> getHighlight() {
        return highlight;
    }

    public J setHighlight(com.jwebmp.plugins.agcharts.options.series.AgSeriesHighlightOptions<?> highlight) {
        this.highlight = highlight;
        return (J) this;
    }
}
