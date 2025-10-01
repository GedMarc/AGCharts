package com.jwebmp.plugins.agcharts.options.theme;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Chart theme options wrapper with support for baseTheme, palette, params and overrides.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartTheme<J extends AgChartTheme<J>> extends JavaScriptPart<J> {
    /** Base theme name to inherit from (defaults to 'ag-default' in runtime). */
    private Object baseTheme; // String or AgChartThemeName

    /** Palette for series fills and strokes. */
    private AgChartThemePalette<?> palette;

    /** Global theme parameters (colors, fonts, etc.). */
    private AgChartThemeParams<?> params;

    /** Overrides applied on top of the base theme. */
    private AgChartThemeOverrides<?> overrides;

    // --- getters/setters ---
    public Object getBaseTheme() { return baseTheme; }
    /** Set baseTheme using a string (e.g., "ag-vivid"). */
    public J setBaseTheme(String baseTheme) { this.baseTheme = baseTheme; return (J) this; }
    /** Set baseTheme using an enum value. */
    public J setBaseTheme(AgChartThemeName baseTheme) { this.baseTheme = baseTheme != null ? baseTheme.toString() : null; return (J) this; }

    public AgChartThemePalette<?> getPalette() { return palette; }
    public J setPalette(AgChartThemePalette<?> palette) { this.palette = palette; return (J) this; }

    public AgChartThemeParams<?> getParams() { return params; }
    public J setParams(AgChartThemeParams<?> params) { this.params = params; return (J) this; }

    public AgChartThemeOverrides<?> getOverrides() { return overrides; }
    public J setOverrides(AgChartThemeOverrides<?> overrides) { this.overrides = overrides; return (J) this; }
}
