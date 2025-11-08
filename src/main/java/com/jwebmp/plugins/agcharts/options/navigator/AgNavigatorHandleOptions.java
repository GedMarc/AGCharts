package com.jwebmp.plugins.agcharts.options.navigator;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Options for Navigator drag handles (min/max).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgNavigatorHandleOptions<J extends AgNavigatorHandleOptions<J>> extends JavaScriptPart<J>
{
    private String fill;
    private String stroke;
    private Integer width;       // px
    private Integer height;      // px
    private Integer strokeWidth; // px

    /** Length of grip lines inside handle. */
    private Integer gripLineLength;
    /** Gap between grip lines. */
    private Integer gripLineGap;

    public String getFill() { return fill; }
    public J setFill(String fill) { this.fill = fill; return (J) this; }

    public String getStroke() { return stroke; }
    public J setStroke(String stroke) { this.stroke = stroke; return (J) this; }

    public Integer getWidth() { return width; }
    public J setWidth(Integer width) { this.width = width; return (J) this; }

    public Integer getHeight() { return height; }
    public J setHeight(Integer height) { this.height = height; return (J) this; }

    public Integer getStrokeWidth() { return strokeWidth; }
    public J setStrokeWidth(Integer strokeWidth) { this.strokeWidth = strokeWidth; return (J) this; }

    public Integer getGripLineLength() { return gripLineLength; }
    public J setGripLineLength(Integer gripLineLength) { this.gripLineLength = gripLineLength; return (J) this; }

    public Integer getGripLineGap() { return gripLineGap; }
    public J setGripLineGap(Integer gripLineGap) { this.gripLineGap = gripLineGap; return (J) this; }
}
