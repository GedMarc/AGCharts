package com.jwebmp.plugins.agcharts.options.tooltip;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Interaction options for tooltips (e.g., enabling link clicks and text selection).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgTooltipInteractionOptions<J extends AgTooltipInteractionOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled;

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }
}
