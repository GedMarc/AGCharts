package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgBarSeriesOptions;
import io.smallrye.mutiny.Uni;

import java.util.List;

/**
 * Convenience Bar Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Bar series, similar
 * to ChartJS convenience wrappers. You can still override getInitialOptions()
 * if you need to customise axes, legend, tooltip, theme, etc.
 */
public class AgBarChart<J extends AgBarChart<J>> extends AgChart<J>
{
    private final String xKey;
    private final String yKey;
    private String xName;
    private String yName;
    private List<?> data; // optional data attached to the series

    public AgBarChart(String id, String xKey, String yKey)
    {
        super(id);
        this.xKey = xKey;
        this.yKey = yKey;
    }

    /** Optional: attach data directly to the series. */
    public J setData(List<?> data)
    {
        this.data = data;
        return (J) this;
    }

    public J setXName(String xName)
    {
        this.xName = xName;
        return (J) this;
    }

    public J setYName(String yName)
    {
        this.yName = yName;
        return (J) this;
    }

    @Override
    public Uni<AgChartOptions<?>> getInitialOptions()
    {
        return Uni.createFrom().item(() -> {
            AgBarSeriesOptions<?> bar = new AgBarSeriesOptions<>()
                    .setXKey(xKey)
                    .setYKey(yKey)
                    .setShowInLegend(true);
            if (xName != null) bar.setXName(xName);
            if (yName != null) bar.setYName(yName);
            if (data != null) bar.setData(data);

            return new AgChartOptions<>()
                    .setSeries(java.util.List.of(bar));
        });
    }
}
