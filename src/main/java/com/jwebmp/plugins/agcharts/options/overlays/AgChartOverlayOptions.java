package com.jwebmp.plugins.agcharts.options.overlays;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Single overlay configuration options.
 *
 * Supports either simple text via {@code text}, or a fully custom renderer via {@code renderer}.
 * The renderer may return an HTML string or a DOM Node/Element and is provided as raw JavaScript.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartOverlayOptions<J extends AgChartOverlayOptions<J>> extends JavaScriptPart<J> {
    /** Text to display in the overlay. */
    private String text;

    /**
     * Custom renderer callback as raw JavaScript.
     * Example returning HTML string:
     * <pre>"function(){ return '<em>Loading...</em>'; }"</pre>
     * Example returning a DOM node:
     * <pre>"function(){ const div=document.createElement('div'); div.textContent='Loading'; return div; }"</pre>
     */
    @JsonRawValue
    private String renderer;

    public String getText() {
        return text;
    }

    public J setText(String text) {
        this.text = text;
        return (J) this;
    }

    public String getRenderer() {
        return renderer;
    }

    public J setRenderer(String renderer) {
        this.renderer = renderer;
        return (J) this;
    }
}
