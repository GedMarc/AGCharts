package com.jwebmp.plugins.agcharts.options.formatters;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

/**
 * Per-property formatter callbacks (as raw JS functions) for the chart-level formatter.
 * Each field should be set to a JavaScript function string, e.g.:
 * <pre>"function(p){ return p.value + '%'; }"</pre>
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgChartPropertyFormatterFunctions<J extends AgChartPropertyFormatterFunctions<J>> extends JavaScriptPart<J>
{
    @JsonRawValue private String x;
    @JsonRawValue private String y;
    @JsonRawValue private String angle;
    @JsonRawValue private String radius;
    @JsonRawValue private String size;
    @JsonRawValue private String color;
    @JsonRawValue private String label;
    @JsonRawValue private String secondaryLabel;
    @JsonRawValue private String calloutLabel;
    @JsonRawValue private String sectorLabel;

    public String getX() { return x; }
    public J setX(String x) { this.x = x; return (J) this; }

    public String getY() { return y; }
    public J setY(String y) { this.y = y; return (J) this; }

    public String getAngle() { return angle; }
    public J setAngle(String angle) { this.angle = angle; return (J) this; }

    public String getRadius() { return radius; }
    public J setRadius(String radius) { this.radius = radius; return (J) this; }

    public String getSize() { return size; }
    public J setSize(String size) { this.size = size; return (J) this; }

    public String getColor() { return color; }
    public J setColor(String color) { this.color = color; return (J) this; }

    public String getLabel() { return label; }
    public J setLabel(String label) { this.label = label; return (J) this; }

    public String getSecondaryLabel() { return secondaryLabel; }
    public J setSecondaryLabel(String secondaryLabel) { this.secondaryLabel = secondaryLabel; return (J) this; }

    public String getCalloutLabel() { return calloutLabel; }
    public J setCalloutLabel(String calloutLabel) { this.calloutLabel = calloutLabel; return (J) this; }

    public String getSectorLabel() { return sectorLabel; }
    public J setSectorLabel(String sectorLabel) { this.sectorLabel = sectorLabel; return (J) this; }
}
