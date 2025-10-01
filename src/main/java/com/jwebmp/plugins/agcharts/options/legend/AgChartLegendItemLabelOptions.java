package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Legend item label styling and formatter.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartLegendItemLabelOptions<J extends AgChartLegendItemLabelOptions<J>> extends JavaScriptPart<J> {
    private Integer fontSize;
    private String fontFamily;
    private String fontWeight;
    private String color;

    /** Formatter function as raw JS: function(params){ return params.itemId; } */
    @JsonRawValue
    private String formatter;

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

    public String getFormatter() {
        return formatter;
    }

    public J setFormatter(String formatter) {
        this.formatter = formatter;
        return (J) this;
    }
}
