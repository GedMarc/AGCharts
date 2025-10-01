package com.jwebmp.plugins.agcharts.options.theme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Theme palette configuration: arrays of fills and strokes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartThemePalette<J extends AgChartThemePalette<J>> extends JavaScriptPart<J> {
    private List<String> fills;
    private List<String> strokes;

    public List<String> getFills() {
        return fills;
    }

    public J setFills(List<String> fills) {
        this.fills = fills;
        return (J) this;
    }

    public List<String> getStrokes() {
        return strokes;
    }

    public J setStrokes(List<String> strokes) {
        this.strokes = strokes;
        return (J) this;
    }
}
