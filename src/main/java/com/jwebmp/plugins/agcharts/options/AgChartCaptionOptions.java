package com.jwebmp.plugins.agcharts.options;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Chart caption options for title, subtitle and footnote.
 * Supports spacing and basic font styling.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartCaptionOptions<J extends AgChartCaptionOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled;
    private String text;
    private Integer spacing; // pixels between caption and next element

    private Integer fontSize;
    private String fontFamily;
    private String fontWeight;
    private String color;

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return (J) this;
    }

    public String getText() {
        return text;
    }

    public J setText(String text) {
        this.text = text;
        return (J) this;
    }

    public Integer getSpacing() {
        return spacing;
    }

    public J setSpacing(Integer spacing) {
        this.spacing = spacing;
        return (J) this;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public J setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return (J) this;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public J setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return (J) this;
    }

    public String getFontWeight() {
        return fontWeight;
    }

    public J setFontWeight(String fontWeight) {
        this.fontWeight = fontWeight;
        return (J) this;
    }

    public String getColor() {
        return color;
    }

    public J setColor(String color) {
        this.color = color;
        return (J) this;
    }
}
