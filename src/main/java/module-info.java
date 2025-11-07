import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.agcharts.AgChartsPageConfigurator;
import com.jwebmp.plugins.agcharts.implementations.AgChartsInclusionsModule;

module com.jwebmp.plugins.agcharts {
    exports com.jwebmp.plugins.agcharts;
    exports com.jwebmp.plugins.agcharts.options;
    exports com.jwebmp.plugins.agcharts.options.axes;
    exports com.jwebmp.plugins.agcharts.options.legend;
    exports com.jwebmp.plugins.agcharts.options.legend.gradient;
    exports com.jwebmp.plugins.agcharts.options.formatters;
    exports com.jwebmp.plugins.agcharts.options.series;
    exports com.jwebmp.plugins.agcharts.options.series.fills;
    exports com.jwebmp.plugins.agcharts.options.theme;
    exports com.jwebmp.plugins.agcharts.options.locale;
    exports com.jwebmp.plugins.agcharts.options.tooltip;
    exports com.jwebmp.plugins.agcharts.options.overlays;
    exports com.jwebmp.plugins.agcharts.options.navigator;

    requires com.jwebmp.client;
    requires com.jwebmp.core;
    requires com.jwebmp.core.angular;
    requires com.guicedee.guicedinjection;
    requires com.fasterxml.jackson.annotation;
    requires com.jwebmp.core.base.angular.client;

    provides IPageConfigurator with AgChartsPageConfigurator;
    provides IGuiceScanModuleInclusions with AgChartsInclusionsModule;

    opens com.jwebmp.plugins.agcharts to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.axes to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.legend to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.legend.gradient to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.formatters to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.series to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.series.fills to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.theme to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.locale to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.tooltip to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.overlays to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.options.navigator to com.google.guice, com.fasterxml.jackson.databind, com.jwebmp.core;
    opens com.jwebmp.plugins.agcharts.implementations to com.google.guice;
}
