package com.jwebmp.plugins.agcharts;

import com.jwebmp.plugins.agcharts.options.AgChartOptions;
import com.jwebmp.plugins.agcharts.options.axes.AgAxisBaseOptions;
import com.jwebmp.plugins.agcharts.options.series.AgSeriesBaseOptions;
import io.smallrye.mutiny.Uni;

import java.util.ArrayList;
import java.util.List;

/**
 * Convenience Combination Chart component.
 *
 * Mirrors the ChartJS-style component approach and allows combining heterogeneous
 * series types (bar, line, area, scatter, bubble) in a single chart. You can also
 * provide axis configurations (e.g., set a secondary axis and link via axis.keys).
 *
 * Example usage:
 *   AgCombinationChart chart = new AgCombinationChart("salesCombo")
 *       .addSeries(new AgBarSeriesOptions<>()
 *           .setXKey("year").setYKey("men"))
 *       .addSeries(new AgLineSeriesOptions<>()
 *           .setXKey("year").setYKey("portions"))
 *       .setAxes(List.of(
 *           new AgCategoryAxisOptions<>().setPosition(AgCartesianAxisPosition.BOTTOM),
 *           new AgNumberAxisOptions<>().setPosition(AgCartesianAxisPosition.LEFT).setKeys(List.of("men")),
 *           new AgNumberAxisOptions<>().setPosition(AgCartesianAxisPosition.RIGHT).setKeys(List.of("portions"))
 *       ));
 */
public class AgCombinationChart<J extends AgCombinationChart<J>> extends AgChart<J>
{
    private final List<AgSeriesBaseOptions<?>> series = new ArrayList<>();
    private List<AgAxisBaseOptions<?>> axes; // optional

    public AgCombinationChart(String id)
    {
        super(id);
    }

    /** Add a series of any supported type (bar, line, area, scatter, bubble). */
    public J addSeries(AgSeriesBaseOptions<?> s)
    {
        if (s != null)
        {
            this.series.add(s);
        }
        return (J) this;
    }

    /** Replace the series array entirely. */
    public J setSeries(List<AgSeriesBaseOptions<?>> series)
    {
        this.series.clear();
        if (series != null)
        {
            this.series.addAll(series);
        }
        return (J) this;
    }

    /** Optional: provide axes for primary/secondary configuration and customisation. */
    public J setAxes(List<AgAxisBaseOptions<?>> axes)
    {
        this.axes = axes;
        return (J) this;
    }

    public List<AgSeriesBaseOptions<?>> getSeries()
    {
        return series;
    }

    public List<AgAxisBaseOptions<?>> getAxes()
    {
        return axes;
    }

    @Override
    public Uni<AgChartOptions<?>> getInitialOptions()
    {
        return Uni.createFrom().item(() -> {
            AgChartOptions<?> options = new AgChartOptions<>();
            if (!series.isEmpty())
            {
                options.setSeries(series);
            }
            if (axes != null && !axes.isEmpty())
            {
                options.setAxes(axes);
            }
            return options;
        });
    }
}
