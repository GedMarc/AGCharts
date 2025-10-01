package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;
import com.jwebmp.plugins.agcharts.options.AgBorderOptions;
import com.jwebmp.plugins.agcharts.options.legend.AgPadding;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgBaseCartesianAxisLabelOptions<J extends AgBaseCartesianAxisLabelOptions<J>> extends JavaScriptPart<J> {
    private Boolean enabled;
    private Integer fontSize;
    private String fontFamily;
    private String fontWeight;
    private String color;

    /** Fixed rotation in degrees. */
    private Integer rotation;

    /**
     * Supports either a String format or a time-unit mapping object for time axes.
     * Example string: "%b %Y"; example object: { day: "%d %b" }
     */
    private Object format;

    /** Collision avoidance master switch (default true in AG Charts). */
    private Boolean avoidCollisions;

    /** Wrapping strategy for labels. */
    private AgAxisLabelWrapping wrapping;

    /** When true, truncate text if it doesn't fit. */
    private Boolean truncate;

    /** Enable auto-rotation when labels would collide. */
    private Boolean autoRotate;

    /** Angle applied when autoRotate triggers (e.g., 335 on category axes by default). */
    private Integer autoRotateAngle;

    /** Minimum gap in pixels between labels before skipping occurs. */
    private Integer minSpacing;

    /** Formatter function as raw JavaScript. e.g., "function(p){ return p.value + '%'; }" */
    @JsonRawValue
    private String formatter;

    /** Item-level styler for axis labels. Raw JS function(params){ return { color: ..., fontSize: ... }; } */
    @JsonRawValue
    private String itemStyler;

    // --- Fills & Borders additions ---
    /** Background fill for the label box. Can be a CSS color string or a fill object (gradient/pattern/image). */
    private Object fill;
    /** Background fill opacity (0..1). */
    private Double fillOpacity;
    /** Border options for the label box. */
    private AgBorderOptions<?> border;
    /** Corner radius in pixels for the label box. */
    private Integer cornerRadius;
    /** Padding for the label box: either a number or a per-side object. */
    private Object padding;

    public Boolean getEnabled() {
        return enabled;
    }

    public J setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public Integer getRotation() {
        return rotation;
    }

    public J setRotation(Integer rotation) {
        this.rotation = rotation;
        return (J) this;
    }

    public Object getFormat() {
        return format;
    }

    public J setFormat(Object format) {
        this.format = format;
        return (J) this;
    }

    public J setFormat(String format) {
        this.format = (Object) format;
        return (J) this;
    }

    public Boolean getAvoidCollisions() {
        return avoidCollisions;
    }

    public J setAvoidCollisions(Boolean avoidCollisions) {
        this.avoidCollisions = avoidCollisions;
        return (J) this;
    }

    public AgAxisLabelWrapping getWrapping() {
        return wrapping;
    }

    public J setWrapping(AgAxisLabelWrapping wrapping) {
        this.wrapping = wrapping;
        return (J) this;
    }

    public Boolean getTruncate() {
        return truncate;
    }

    public J setTruncate(Boolean truncate) {
        this.truncate = truncate;
        return (J) this;
    }

    public Boolean getAutoRotate() {
        return autoRotate;
    }

    public J setAutoRotate(Boolean autoRotate) {
        this.autoRotate = autoRotate;
        return (J) this;
    }

    public Integer getAutoRotateAngle() {
        return autoRotateAngle;
    }

    public J setAutoRotateAngle(Integer autoRotateAngle) {
        this.autoRotateAngle = autoRotateAngle;
        return (J) this;
    }

    public Integer getMinSpacing() {
        return minSpacing;
    }

    public J setMinSpacing(Integer minSpacing) {
        this.minSpacing = minSpacing;
        return (J) this;
    }

    public String getFormatter() {
        return formatter;
    }

    public J setFormatter(String formatter) {
        this.formatter = formatter;
        return (J) this;
    }

    public String getItemStyler() {
        return itemStyler;
    }

    public J setItemStyler(String itemStyler) {
        this.itemStyler = itemStyler;
        return (J) this;
    }

    // --- Fills & Borders getters/setters ---
    public Object getFill() {
        return fill;
    }

    /** Set label background fill using a CSS color string. */
    public J setFill(String fill) {
        this.fill = (Object) fill;
        return (J) this;
    }

    /** Set label background fill using an object (e.g., gradient/pattern/image). */
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

    public AgBorderOptions<?> getBorder() {
        return border;
    }

    public J setBorder(AgBorderOptions<?> border) {
        this.border = border;
        return (J) this;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public J setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
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

    /** Set per-side padding. */
    public J setPadding(AgPadding<?> padding) {
        this.padding = padding;
        return (J) this;
    }
}
