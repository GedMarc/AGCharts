package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.series.AgPieSeriesOptions;
import io.smallrye.mutiny.Uni;

import java.util.List;

/**
 * Convenience Pie Chart component.
 *
 * Provides an easy way to instantiate a chart with a single Pie series, similar
 * to other ChartJS-style convenience wrappers. You can still override getInitialOptions()
 * if you need to customise legend, tooltip, theme, etc.
 */
public class AgPieChart<J extends AgPieChart<J>> extends AgChart<J>
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

    public J setLegendItemKey(String legendItemKey)
    {
        this.legendItemKey = legendItemKey;
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

    public J setAngleName(String angleName)
    {
        this.angleName = angleName;
        return (J) this;
    }

    public J setCalloutLabelName(String calloutLabelName)
    {
        this.calloutLabelName = calloutLabelName;
        return (J) this;
    }

    public J setSectorLabelName(String sectorLabelName)
    {
        this.sectorLabelName = sectorLabelName;
        return (J) this;
    }

    /** Optional: attach data directly to the series. */
    public J setData(List<?> data)
    {
        this.data = data;
        return (J) this;
    }

    @Override
    public Uni<AgChartOptions<?>> getInitialOptions()
    {
        return Uni.createFrom().item(() -> {
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
        });
    }
}
