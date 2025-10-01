package com.jwebmp.plugins.agcharts.options.locale;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.Map;

/**
 * Locale options for AG Charts (community).
 *
 * Supports either providing a map of key/value pairs via {@code localeText},
 * or a raw JavaScript identifier referencing a provided locale object (e.g.,
 * AG_CHARTS_LOCALE_FR_FR from the 'ag-charts-locale' package).
 *
 * A {@code getLocaleText} callback can be used to integrate external i18n frameworks.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgLocaleOptions<J extends AgLocaleOptions<J>> extends JavaScriptPart<J> {
    /**
     * Locale text as a Java Map which serializes to an object of key/value pairs.
     */
    @JsonProperty("localeText")
    private Map<String, String> localeTextMap;

    /**
     * Locale text as a raw JS reference (e.g., AG_CHARTS_LOCALE_EN_US), serialized without quotes.
     */
    @JsonProperty("localeText")
    @JsonRawValue
    private String localeTextJs;

    /**
     * Raw JS callback: function({ key, defaultValue, variables }) { ... }
     */
    @JsonRawValue
    private String getLocaleText;

    // --- getters/setters ---

    public Map<String, String> getLocaleTextMap() {
        return localeTextMap;
    }

    /**
     * Set localeText using a Java Map. Clears any previously set raw JS reference.
     */
    public J setLocaleText(Map<String, String> localeTextMap) {
        this.localeTextMap = localeTextMap;
        this.localeTextJs = null;
        return (J) this;
    }

    public String getLocaleTextJs() {
        return localeTextJs;
    }

    /**
     * Set localeText using a raw JS identifier (e.g., 'AG_CHARTS_LOCALE_FR_FR').
     * This string should NOT be quoted and must be a valid JavaScript expression.
     * Clears any previously set Map.
     */
    public J setLocaleTextJs(String localeTextJs) {
        this.localeTextJs = localeTextJs;
        this.localeTextMap = null;
        return (J) this;
    }

    public String getGetLocaleText() {
        return getLocaleText;
    }

    /**
     * Provide a raw JS function for getLocaleText. Example:
     * "function({ key, defaultValue, variables }) { return i18n.t(key) ?? defaultValue; }"
     */
    public J setGetLocaleText(String getLocaleText) {
        this.getLocaleText = getLocaleText;
        return (J) this;
    }
}
