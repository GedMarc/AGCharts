package com.jwebmp.plugins.agcharts.options.legend;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Padding box with per-side pixel sizes.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgPadding<J extends AgPadding<J>> extends JavaScriptPart<J> {
    private Integer top;
    private Integer right;
    private Integer bottom;
    private Integer left;

    public Integer getTop() {
        return top;
    }

    public J setTop(Integer top) {
        this.top = top;
        return (J) this;
    }

    public Integer getRight() {
        return right;
    }

    public J setRight(Integer right) {
        this.right = right;
        return (J) this;
    }

    public Integer getBottom() {
        return bottom;
    }

    public J setBottom(Integer bottom) {
        this.bottom = bottom;
        return (J) this;
    }

    public Integer getLeft() {
        return left;
    }

    public J setLeft(Integer left) {
        this.left = left;
        return (J) this;
    }
}
