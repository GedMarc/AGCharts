package com.jwebmp.plugins.agcharts.options;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Generic border options used across chart elements (labels, series area, etc.).
 *
 * Matches AG Charts naming: stroke, strokeWidth, strokeOpacity, with an enabled flag.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgBorderOptions<J extends AgBorderOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled;
    private String stroke;
    private Integer strokeWidth;
    private Double strokeOpacity;

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }

    public String getStroke() {
        return stroke;
    }

    public J setStroke(String stroke) {
        this.stroke = stroke;
        return (J) this;
    }

    public Integer getStrokeWidth() {
        return strokeWidth;
    }

    public J setStrokeWidth(Integer strokeWidth) {
        this.strokeWidth = strokeWidth;
        return (J) this;
    }

    public Double getStrokeOpacity() {
        return strokeOpacity;
    }

    public J setStrokeOpacity(Double strokeOpacity) {
        this.strokeOpacity = strokeOpacity;
        return (J) this;
    }
}
