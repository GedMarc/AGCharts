package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Represents a single inner label line displayed in the centre of a Donut series.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgDonutInnerLabel<J extends AgDonutInnerLabel<J>> extends JavaScriptPart<J> {
    private String text;
    private Integer spacing; // pixels between this and previous line
    private Integer fontSize;
    private String fontFamily;
    private String fontWeight;
    private String color;

    public String getText() { return text; }
    public J setText(String text) { this.text = text; return (J) this; }

    public Integer getSpacing() { return spacing; }
    public J setSpacing(Integer spacing) { this.spacing = spacing; return (J) this; }

    public Integer getFontSize() { return fontSize; }
    public J setFontSize(Integer fontSize) { this.fontSize = fontSize; return (J) this; }

    public String getFontFamily() { return fontFamily; }
    public J setFontFamily(String fontFamily) { this.fontFamily = fontFamily; return (J) this; }

    public String getFontWeight() { return fontWeight; }
    public J setFontWeight(String fontWeight) { this.fontWeight = fontWeight; return (J) this; }

    public String getColor() { return color; }
    public J setColor(String color) { this.color = color; return (J) this; }
}
