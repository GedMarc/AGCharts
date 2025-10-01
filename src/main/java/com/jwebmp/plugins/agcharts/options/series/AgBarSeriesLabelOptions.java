package com.jwebmp.plugins.agcharts.options.series;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Bar series specific label options. Inherits generic label options and
 * acts as a placeholder for any future bar-specific label properties.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AgBarSeriesLabelOptions<J extends AgBarSeriesLabelOptions<J>> extends AgSeriesLabelOptions<J> {
}
