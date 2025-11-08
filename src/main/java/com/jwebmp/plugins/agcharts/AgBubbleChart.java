package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgBubbleSeriesOptions;
import io.smallrye.mutiny.Uni;

import java.util.List;

/**
 * Convenience Bubble Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Bubble series.
 */
public class AgBubbleChart<J extends AgBubbleChart<J>> extends AgChart<J>
{
    private final String xKey;
    private final String yKey;
    private final String sizeKey;

    private String xName;
    private String yName;
    private String sizeName;
    private List<?> data; // optional data attached to the series

    public AgBubbleChart(String id, String xKey, String yKey, String sizeKey)
    {
        super(id);
        this.xKey = xKey;
        this.yKey = yKey;
        this.sizeKey = sizeKey;
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

    public J setSizeName(String sizeName)
    {
        this.sizeName = sizeName;
        return (J) this;
    }

    @Override
    public io.smallrye.mutiny.Uni<AgChartOptions<?>> getInitialOptions()
    {
        return io.smallrye.mutiny.Uni.createFrom().item(() -> {
            AgBubbleSeriesOptions<?> bubble = new AgBubbleSeriesOptions<>()
                    .setXKey(xKey)
                    .setYKey(yKey)
                    .setSizeKey(sizeKey)
                    .setShowInLegend(true);
            if (xName != null) bubble.setXName(xName);
            if (yName != null) bubble.setYName(yName);
            if (sizeName != null) bubble.setSizeName(sizeName);
            if (data != null) bubble.setData(data);

            return new AgChartOptions<>()
                    .setSeries(java.util.List.of(bubble));
        });
    }
}
