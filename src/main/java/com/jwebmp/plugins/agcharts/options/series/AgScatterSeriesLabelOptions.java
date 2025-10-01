package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Scatter series specific label options. Inherits generic label options and
 * acts as a placeholder for any future scatter-specific label properties.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgScatterSeriesLabelOptions<J extends AgScatterSeriesLabelOptions<J>> extends AgSeriesLabelOptions<J> {
}
