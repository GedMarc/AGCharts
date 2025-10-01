package com.jwebmp.plugins.agcharts.options.tooltip;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Series-level tooltip options. Can override chart-level defaults.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesTooltipOptions<J extends AgSeriesTooltipOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled; // enable/disable per series

    /** Range from point that triggers tooltip: 'nearest' | 'exact' | number (pixels). */
    private Object range;

    /** Optional per-series position override. */
    private AgTooltipPositionOptions<?> position;

    /** Renderer callback. Return object (heading/title/data) or HTML string. */
    @JsonRawValue
    private String renderer;

    /** Interaction options (enable selecting text / clicking links). */
    private AgTooltipInteractionOptions<?> interaction;

    public Boolean getEnabled() { return enabled; }
    public J setEnabled(Boolean enabled) { this.enabled = enabled; return (J) this; }

    public Object getRange() { return range; }
    public J setRange(String range) { this.range = range; return (J) this; }
    public J setRange(Integer pixels) { this.range = pixels; return (J) this; }

    public AgTooltipPositionOptions<?> getPosition() { return position; }
    public J setPosition(AgTooltipPositionOptions<?> position) { this.position = position; return (J) this; }

    public String getRenderer() { return renderer; }
    public J setRenderer(String renderer) { this.renderer = renderer; return (J) this; }

    public AgTooltipInteractionOptions<?> getInteraction() { return interaction; }
    public J setInteraction(AgTooltipInteractionOptions<?> interaction) { this.interaction = interaction; return (J) this; }
}
