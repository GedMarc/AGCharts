package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Minimal Error Bar options for series supporting error bars.
 * Covers most common properties used by AG Charts.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgErrorBarOptions<J extends AgErrorBarOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled;
    private String stroke;
    private Integer strokeWidth;
    private Double strokeOpacity;
    private List<Integer> lineDash;

    /** Cap width in pixels at each end of the error bar. */
    private Integer capWidth;
    /** Cap length in pixels. */
    private Integer capLength;

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

    public List<Integer> getLineDash() {
        return lineDash;
    }

    public J setLineDash(List<Integer> lineDash) {
        this.lineDash = lineDash;
        return (J) this;
    }

    public Integer getCapWidth() {
        return capWidth;
    }

    public J setCapWidth(Integer capWidth) {
        this.capWidth = capWidth;
        return (J) this;
    }

    public Integer getCapLength() {
        return capLength;
    }

    public J setCapLength(Integer capLength) {
        this.capLength = capLength;
        return (J) this;
    }
}
