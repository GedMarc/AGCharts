package com.jwebmp.plugins.agcharts.options.series.fills;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Image fill configuration. type should be 'image'.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgImageFill<J extends AgImageFill<J>> extends JavaScriptPart<J> {
    private final String type = "image";

    /** Image URL or data URL. */
    private String url;

    /** How to fit the image into the shape. */
    private AgImageFit fit;

    /** Explicit target width/height for the image rendering (pixels). */
    private Integer width;
    private Integer height;

    /** Repeat tiling option: 'repeat', 'repeat-x', 'repeat-y', 'no-repeat'. */
    private String repeat;

    /** Background fill used as fallback and uncovered areas. */
    private String backgroundFill;

    /** Background fill opacity (0..1). */
    private Double backgroundFillOpacity;

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public J setUrl(String url) {
        this.url = url;
        return (J) this;
    }

    public AgImageFit getFit() {
        return fit;
    }

    public J setFit(AgImageFit fit) {
        this.fit = fit;
        return (J) this;
    }

    public Integer getWidth() {
        return width;
    }

    public J setWidth(Integer width) {
        this.width = width;
        return (J) this;
    }

    public Integer getHeight() {
        return height;
    }

    public J setHeight(Integer height) {
        this.height = height;
        return (J) this;
    }

    public String getRepeat() {
        return repeat;
    }

    public J setRepeat(String repeat) {
        this.repeat = repeat;
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
