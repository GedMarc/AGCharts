package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Label options for Cross Lines (Cartesian and Polar).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgCartesianCrossLineLabelOptions<J extends AgCartesianCrossLineLabelOptions<J>> extends JavaScriptPart<J> {
    /** The label text to display. */
    private String text;
    /** Position relative to the cross line (e.g., top, bottom, left, right). */
    private String position;
    /** Rotation angle in degrees for the label text. */
    private Integer rotation;
    /** Font size in pixels. */
    private Integer fontSize;
    private String fontFamily;
    private String fontWeight;
    private String color;
    /** Padding around the label in pixels. */
    private Integer padding;
    /** For polar charts: angle (degrees) to position the label around the circle. */
    private Integer positionAngle;

    public String getText() {
        return text;
    }

    public J setText(String text) {
        this.text = text;
        return (J) this;
    }

    public String getPosition() {
        return position;
    }

    public J setPosition(String position) {
        this.position = position;
        return (J) this;
    }

    public Integer getRotation() {
        return rotation;
    }

    public J setRotation(Integer rotation) {
        this.rotation = rotation;
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

    public Integer getPadding() {
        return padding;
    }

    public J setPadding(Integer padding) {
        this.padding = padding;
        return (J) this;
    }

    public Integer getPositionAngle() {
        return positionAngle;
    }

    public J setPositionAngle(Integer positionAngle) {
        this.positionAngle = positionAngle;
        return (J) this;
    }
}
