package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgLineSeriesOptions;

import java.util.List;

/**
 * Convenience Line Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Line series, similar
 * to ChartJS convenience wrappers. You can still override getInitialOptions()
 * if you need to customise axes, legend, tooltip, theme, etc.
 */
public class AgLineChart extends AgChart<AgLineChart>
{
    private final String xKey;
    private final String yKey;
    private String xName;
    private String yName;
    private List<?> data; // optional data attached to the series

    public AgLineChart(String id, String xKey, String yKey)
    {
        super(id);
        this.xKey = xKey;
        this.yKey = yKey;
    }

    /** Optional: attach data directly to the series. */
    public AgLineChart setData(List<?> data)
    {
        this.data = data;
        return this;
    }

    public AgLineChart setXName(String xName)
    {
        this.xName = xName;
        return this;
    }

    public AgLineChart setYName(String yName)
    {
        this.yName = yName;
        return this;
    }

    @Override
    public AgChartOptions<?> getInitialOptions()
    {
        AgLineSeriesOptions<?> line = new AgLineSeriesOptions<>()
                .setXKey(xKey)
                .setYKey(yKey)
                .setShowInLegend(true);
        if (xName != null) line.setXName(xName);
        if (yName != null) line.setYName(yName);
        if (data != null) line.setData(data);

        return new AgChartOptions<>()
                .setSeries(java.util.List.of(line));
    }
}
