package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Parent level options for time axes. Controls display of parent level ticks/labels
 * (e.g., showing months above days, or years above months).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgTimeAxisParentLevel<J extends AgTimeAxisParentLevel<J>> extends JavaScriptPart<J> {
    private Boolean enabled;
    private AgAxisBaseTickOptions<?> tick;
    private AgBaseCartesianAxisLabelOptions<?> label;

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }

    public AgAxisBaseTickOptions<?> getTick() {
        return tick;
    }

    public J setTick(AgAxisBaseTickOptions<?> tick) {
        this.tick = tick;
        return (J) this;
    }

    public AgBaseCartesianAxisLabelOptions<?> getLabel() {
        return label;
    }

    public J setLabel(AgBaseCartesianAxisLabelOptions<?> label) {
        this.label = label;
        return (J) this;
    }
}
