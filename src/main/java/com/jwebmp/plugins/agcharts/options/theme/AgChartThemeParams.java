package com.jwebmp.plugins.agcharts.options.theme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Theme global parameters for styling chart chrome and typography.
 *
 * This class includes common parameters used in AG Charts themes. Additional parameters
 * may be added later as needed.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartThemeParams<J extends AgChartThemeParams<J>> extends JavaScriptPart<J> {
    private String foregroundColor;
    private String backgroundColor;
    private String accentColor;

    private String chromeBackgroundColor;
    private String chromeTextColor;

    /**
     * Can be a CSS font-family string (e.g., "Georgia, serif") or an array-like structure.
     * We keep this as Object to allow either a String or a JSON array/object mapping
     * such as [{ googleFont: 'DM Serif Text' }, 'Georgia', 'sans-serif'].
     */
    private Object fontFamily;
    private Integer fontSize;

    // Common specific params shown in docs examples
    private String tooltipBackgroundColor;
    private String tooltipTextColor;

    public String getForegroundColor() { return foregroundColor; }
    public J setForegroundColor(String foregroundColor) { this.foregroundColor = foregroundColor; return (J) this; }

    public String getBackgroundColor() { return backgroundColor; }
    public J setBackgroundColor(String backgroundColor) { this.backgroundColor = backgroundColor; return (J) this; }

    public String getAccentColor() { return accentColor; }
    public J setAccentColor(String accentColor) { this.accentColor = accentColor; return (J) this; }

    public String getChromeBackgroundColor() { return chromeBackgroundColor; }
    public J setChromeBackgroundColor(String chromeBackgroundColor) { this.chromeBackgroundColor = chromeBackgroundColor; return (J) this; }

    public String getChromeTextColor() { return chromeTextColor; }
    public J setChromeTextColor(String chromeTextColor) { this.chromeTextColor = chromeTextColor; return (J) this; }

    public Object getFontFamily() { return fontFamily; }
    public J setFontFamily(Object fontFamily) { this.fontFamily = fontFamily; return (J) this; }

    public Integer getFontSize() { return fontSize; }
    public J setFontSize(Integer fontSize) { this.fontSize = fontSize; return (J) this; }

    public String getTooltipBackgroundColor() { return tooltipBackgroundColor; }
    public J setTooltipBackgroundColor(String tooltipBackgroundColor) { this.tooltipBackgroundColor = tooltipBackgroundColor; return (J) this; }

    public String getTooltipTextColor() { return tooltipTextColor; }
    public J setTooltipTextColor(String tooltipTextColor) { this.tooltipTextColor = tooltipTextColor; return (J) this; }
}
