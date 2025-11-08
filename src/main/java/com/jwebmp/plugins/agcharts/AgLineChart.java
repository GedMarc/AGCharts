package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgLineSeriesOptions;
import io.smallrye.mutiny.Uni;

import java.util.List;

/**
 * Convenience Line Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Line series, similar
 * to ChartJS convenience wrappers. You can still override getInitialOptions()
 * if you need to customise axes, legend, tooltip, theme, etc.
 */
public class AgLineChart<J extends AgLineChart<J>> extends AgChart<J>
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
            AgLineSeriesOptions<?> line = new AgLineSeriesOptions<>()
                    .setXKey(xKey)
                    .setYKey(yKey)
                    .setShowInLegend(true);
            if (xName != null) line.setXName(xName);
            if (yName != null) line.setYName(yName);
            if (data != null) line.setData(data);

            return new AgChartOptions<>()
                    .setSeries(java.util.List.of(line));
        });
    }
}
