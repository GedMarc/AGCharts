package com.jwebmp.plugins.agcharts.options.series.fills;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Pattern fill configuration supporting stock patterns or custom SVG path.
 * type should be 'pattern'.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgPatternFill<J extends AgPatternFill<J>> extends JavaScriptPart<J> {
    private final String type = "pattern";

    /** Name of stock pattern e.g., 'vertical-lines', 'stars', etc. */
    private String pattern;

    /** Custom SVG path data string (value of the <path d="..."> attribute). */
    private String path;

    /** Stroke colour of the pattern path/lines. */
    private String stroke;

    /** Stroke width; set to 0 to hide the stroke. */
    private Integer strokeWidth;

    /** Fill colour of the pattern shapes; set to 'none' for no fill. */
    private String fill;

    /** Background fill used behind the pattern. */
    private String backgroundFill;

    /** Background fill opacity (0..1). */
    private Double backgroundFillOpacity;

    public String getType() {
        return type;
    }

    public String getPattern() {
        return pattern;
    }

    public J setPattern(String pattern) {
        this.pattern = pattern;
        return (J) this;
    }

    public String getPath() {
        return path;
    }

    public J setPath(String path) {
        this.path = path;
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

    public String getFill() {
        return fill;
    }

    public J setFill(String fill) {
        this.fill = fill;
        return (J) this;
    }

    public String getBackgroundFill() {
        return backgroundFill;
    }

    public J setBackgroundFill(String backgroundFill) {
        this.backgroundFill = backgroundFill;
        return (J) this;
    }

    public Double getBackgroundFillOpacity() {
        return backgroundFillOpacity;
    }

    public J setBackgroundFillOpacity(Double backgroundFillOpacity) {
        this.backgroundFillOpacity = backgroundFillOpacity;
        return (J) this;
    }
}
