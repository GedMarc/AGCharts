package com.jwebmp.plugins.agcharts.options.axes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jwebmp.core.htmlbuilder.javascript.JavaScriptPart;

import java.util.List;

/**
 * Common axis options shared by all cartesian axis types.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgAxisBaseOptions<J extends AgAxisBaseOptions<J>> extends JavaScriptPart<J> {
    private String type; // axis type identifier
    private AgCartesianAxisPosition position;
    private List<String> keys;
    private Boolean reverse;
    /**
     * When true (default in AG Charts), continuous axes extend the domain to nice round numbers
     * aligned with tick intervals. Set to false to use the exact data/domain min/max.
     * Applies to continuous axes; ignored by category axes.
     */
    private Boolean nice;

    private Integer thickness;            // PixelSize
    private Double maxThicknessRatio;     // Ratio

    private AgAxisCaptionOptions<?> title;
    private AgCrosshairOptions<?> crosshair;
    private Object context;

    private AgAxisLineOptions<?> line;
    private AgAxisGridLineOptions<?> gridLine;
    private AgBaseCartesianAxisLabelOptions<?> label;
    private AgAxisBaseTickOptions<?> tick;

    private List<AgCartesianCrossLineOptions<?>> crossLines;

    public String getType() {
        return type;
    }

    public J setType(String type) {
        this.type = type;
        return (J) this;
    }

    public AgCartesianAxisPosition getPosition() {
        return position;
    }

    public J setPosition(AgCartesianAxisPosition position) {
        this.position = position;
        return (J) this;
    }

    public List<String> getKeys() {
        return keys;
    }

    public J setKeys(List<String> keys) {
        this.keys = keys;
        return (J) this;
    }

    public Boolean getReverse() {
        return reverse;
    }

    public J setReverse(Boolean reverse) {
        this.reverse = reverse;
        return (J) this;
    }

    public Boolean getNice() {
        return nice;
    }

    public J setNice(Boolean nice) {
        this.nice = nice;
        return (J) this;
    }

    public Integer getThickness() {
        return thickness;
    }

    public J setThickness(Integer thickness) {
        this.thickness = thickness;
        return (J) this;
    }

    public Double getMaxThicknessRatio() {
        return maxThicknessRatio;
    }

    public J setMaxThicknessRatio(Double maxThicknessRatio) {
        this.maxThicknessRatio = maxThicknessRatio;
        return (J) this;
    }

    public AgAxisCaptionOptions<?> getTitle() {
        return title;
    }

    public J setTitle(AgAxisCaptionOptions<?> title) {
        this.title = title;
        return (J) this;
    }

    public AgCrosshairOptions<?> getCrosshair() {
        return crosshair;
    }

    public J setCrosshair(AgCrosshairOptions<?> crosshair) {
        this.crosshair = crosshair;
        return (J) this;
    }

    public Object getContext() {
        return context;
    }

    public J setContext(Object context) {
        this.context = context;
        return (J) this;
    }

    public AgAxisLineOptions<?> getLine() {
        return line;
    }

    public J setLine(AgAxisLineOptions<?> line) {
        this.line = line;
        return (J) this;
    }

    public AgAxisGridLineOptions<?> getGridLine() {
        return gridLine;
    }

    public J setGridLine(AgAxisGridLineOptions<?> gridLine) {
        this.gridLine = gridLine;
        return (J) this;
    }

    public AgBaseCartesianAxisLabelOptions<?> getLabel() {
        return label;
    }

    public J setLabel(AgBaseCartesianAxisLabelOptions<?> label) {
        this.label = label;
        return (J) this;
    }

    public AgAxisBaseTickOptions<?> getTick() {
        return tick;
    }

    public J setTick(AgAxisBaseTickOptions<?> tick) {
        this.tick = tick;
        return (J) this;
    }

    public List<AgCartesianCrossLineOptions<?>> getCrossLines() {
        return crossLines;
    }

    public J setCrossLines(List<AgCartesianCrossLineOptions<?>> crossLines) {
        this.crossLines = crossLines;
        return (J) this;
    }
}
