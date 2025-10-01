package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgPieSeriesOptions;

import java.util.List;

/**
 * Convenience Pie Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Pie series, similar
 * to other ChartJS-style convenience wrappers. You can still override getInitialOptions()
 * if you need to customise legend, tooltip, theme, etc.
 */
public class AgPieChart extends AgChart<AgPieChart>
{
    private final String angleKey;
    private String legendItemKey; // optional
    private String calloutLabelKey; // optional
    private String sectorLabelKey;  // optional

    private String angleName;
    private String calloutLabelName;
    private String sectorLabelName;

    private List<?> data; // optional data attached to the series

    public AgPieChart(String id, String angleKey)
    {
        super(id);
        this.angleKey = angleKey;
    }

    public AgPieChart setLegendItemKey(String legendItemKey)
    {
        this.legendItemKey = legendItemKey;
        return this;
    }

    public AgPieChart setCalloutLabelKey(String calloutLabelKey)
    {
        this.calloutLabelKey = calloutLabelKey;
        return this;
    }

    public AgPieChart setSectorLabelKey(String sectorLabelKey)
    {
        this.sectorLabelKey = sectorLabelKey;
        return this;
    }

    public AgPieChart setAngleName(String angleName)
    {
        this.angleName = angleName;
        return this;
    }

    public AgPieChart setCalloutLabelName(String calloutLabelName)
    {
        this.calloutLabelName = calloutLabelName;
        return this;
    }

    public AgPieChart setSectorLabelName(String sectorLabelName)
    {
        this.sectorLabelName = sectorLabelName;
        return this;
    }

    /** Optional: attach data directly to the series. */
    public AgPieChart setData(List<?> data)
    {
        this.data = data;
        return this;
    }

    @Override
    public AgChartOptions<?> getInitialOptions()
    {
        AgPieSeriesOptions<?> pie = new AgPieSeriesOptions<>()
                .setAngleKey(angleKey)
                .setShowInLegend(true);
        if (legendItemKey != null) pie.setLegendItemKey(legendItemKey);
        if (calloutLabelKey != null) pie.setCalloutLabelKey(calloutLabelKey);
        if (sectorLabelKey != null) pie.setSectorLabelKey(sectorLabelKey);
        if (angleName != null) pie.setAngleName(angleName);
        if (calloutLabelName != null) pie.setCalloutLabelName(calloutLabelName);
        if (sectorLabelName != null) pie.setSectorLabelName(sectorLabelName);
        if (data != null) pie.setData(data);

        return new AgChartOptions<>()
                .setSeries(java.util.List.of(pie));
    }
}
