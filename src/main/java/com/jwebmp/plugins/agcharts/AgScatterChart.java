package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgScatterSeriesOptions;

import java.util.List;

/**
 * Convenience Scatter Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Scatter series, similar
 * to ChartJS convenience wrappers. You can still override getInitialOptions()
 * if you need to customise axes, legend, tooltip, theme, etc.
 */
public class AgScatterChart extends AgChart<AgScatterChart>
{
    private final String xKey;
    private final String yKey;
    private String xName;
    private String yName;
    private List<?> data; // optional data attached to the series

    public AgScatterChart(String id, String xKey, String yKey)
    {
        super(id);
        this.xKey = xKey;
        this.yKey = yKey;
    }

    /** Optional: attach data directly to the series. */
    public AgScatterChart setData(List<?> data)
    {
        this.data = data;
        return this;
    }

    public AgScatterChart setXName(String xName)
    {
        this.xName = xName;
        return this;
    }

    public AgScatterChart setYName(String yName)
    {
        this.yName = yName;
        return this;
    }

    @Override
    public AgChartOptions<?> getInitialOptions()
    {
        AgScatterSeriesOptions<?> scatter = new AgScatterSeriesOptions<>()
                .setXKey(xKey)
                .setYKey(yKey)
                .setShowInLegend(true);
        if (xName != null) scatter.setXName(xName);
        if (yName != null) scatter.setYName(yName);
        if (data != null) scatter.setData(data);

        return new AgChartOptions<>()
                .setSeries(java.util.List.of(scatter));
    }
}
