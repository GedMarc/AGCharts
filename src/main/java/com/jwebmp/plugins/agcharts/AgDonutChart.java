package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgDonutSeriesOptions;
import io.smallrye.mutiny.Uni;

import java.util.List;

/**
 * Convenience Donut Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Donut series, similar
 * to other convenience components. You can still override getInitialOptions()
 * if you need to customise legend, tooltip, theme, etc.
 */
public class AgDonutChart<J extends AgDonutChart<J>> extends AgChart<J>
{
    private final String angleKey;
    private String calloutLabelKey;
    private String sectorLabelKey;
    private String legendItemKey;

    private List<?> data; // optional data attached to the series

    public AgDonutChart(String id, String angleKey)
    {
        super(id);
        this.angleKey = angleKey;
    }

    /** Optional: attach data directly to the series. */
    public J setData(List<?> data)
    {
        this.data = data;
        return (J) this;
    }

    public J setCalloutLabelKey(String calloutLabelKey)
    {
        this.calloutLabelKey = calloutLabelKey;
        return (J) this;
    }

    public J setSectorLabelKey(String sectorLabelKey)
    {
        this.sectorLabelKey = sectorLabelKey;
        return (J) this;
    }

    public J setLegendItemKey(String legendItemKey)
    {
        this.legendItemKey = legendItemKey;
        return (J) this;
    }

    @Override
    public Uni<AgChartOptions<?>> getInitialOptions()
    {
        return Uni.createFrom().item(() -> {
            AgDonutSeriesOptions<?> donut = new AgDonutSeriesOptions<>()
                    .setAngleKey(angleKey)
                    .setShowInLegend(true);
            if (calloutLabelKey != null) donut.setCalloutLabelKey(calloutLabelKey);
            if (sectorLabelKey != null) donut.setSectorLabelKey(sectorLabelKey);
            if (legendItemKey != null) donut.setLegendItemKey(legendItemKey);
            if (data != null) donut.setData(data);

            return new AgChartOptions<>()
                    .setSeries(java.util.List.of(donut));
        });
    }
}
