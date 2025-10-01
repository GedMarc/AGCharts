package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgAreaSeriesOptions;

import java.util.List;

/**
 * Convenience Area Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Area series, similar
 * to ChartJS convenience wrappers. You can still override getInitialOptions()
 * if you need to customise axes, legend, tooltip, theme, etc.
 */
public class AgAreaChart extends AgChart<AgAreaChart>
{
    private final String xKey;
    private final String yKey;
    private String xName;
    private String yName;
    private List<?> data; // optional data attached to the series

    public AgAreaChart(String id, String xKey, String yKey)
    {
        super(id);
        this.xKey = xKey;
        this.yKey = yKey;
    }

    /** Optional: attach data directly to the series. */
    public AgAreaChart setData(List<?> data)
    {
        this.data = data;
        return this;
    }

    public AgAreaChart setXName(String xName)
    {
        this.xName = xName;
        return this;
    }

    public AgAreaChart setYName(String yName)
    {
        this.yName = yName;
        return this;
    }

    @Override
    public AgChartOptions<?> getInitialOptions()
    {
        AgAreaSeriesOptions<?> area = new AgAreaSeriesOptions<>()
                .setXKey(xKey)
                .setYKey(yKey)
                .setShowInLegend(true);
        if (xName != null) area.setXName(xName);
        if (yName != null) area.setYName(yName);
        if (data != null) area.setData(data);

        return new AgChartOptions<>()
                .setSeries(java.util.List.of(area));
    }
}
