package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.AgBorderOptions;
import com.jwebmp.plugins.agcharts.options.legend.AgPadding;

/**
 * Label options for series with itemStyler support.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgSeriesLabelOptions<J extends AgSeriesLabelOptions<J>> extends JavaScriptPart<J> {
    private Integer fontSize;
    private String fontFamily;
    private String fontWeight;
    private String color;

    /** Background fill for the label box: CSS color string or fill object (gradient/pattern/image). */
    private Object fill;
    private Double fillOpacity;

    /** Padding can be a number (uniform) or an object with per-side values. */
    private Object padding;

    /** Border options for the label box. */
    private AgBorderOptions<?> border;

    /** Corner radius for the label box in pixels. */
    private Integer cornerRadius;

    /** Per-item label styler: function(params){ return { color: ..., fontSize: ... }; } */
    @JsonRawValue
    private String itemStyler;

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

    public Object getPadding() {
        return padding;
    }

    /** Set uniform padding (pixels) for all sides. */
    public J setPadding(Integer padding) {
        this.padding = padding;
        return (J) this;
    }

    /** Set per-side padding box. */
    public J setPadding(AgPadding<?> padding) {
        this.padding = padding;
        return (J) this;
    }

    public AgBorderOptions<?> getBorder() {
        return border;
    }

    public J setBorder(AgBorderOptions<?> border) {
        this.border = border;
        return (J) this;
    }

    public String getItemStyler() {
        return itemStyler;
    }

    public J setItemStyler(String itemStyler) {
        this.itemStyler = itemStyler;
        return (J) this;
    }

    // --- Fills & Borders additions ---
    public Object getFill() {
        return fill;
    }

    /** Set fill using a CSS color string. */
    public J setFill(String fill) {
        this.fill = (Object) fill;
        return (J) this;
    }

    /** Set fill using a fill object (gradient/pattern/image). */
    public J setFill(Object fill) {
        this.fill = fill;
        return (J) this;
    }

    public Double getFillOpacity() {
        return fillOpacity;
    }

    public J setFillOpacity(Double fillOpacity) {
        this.fillOpacity = fillOpacity;
        return (J) this;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public J setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
        return (J) this;
    }
}
