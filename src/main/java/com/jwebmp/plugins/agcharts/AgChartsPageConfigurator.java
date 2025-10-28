package com.jwebmp.plugins.agcharts;

import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;
import jakarta.validation.constraints.NotNull;

/**
 * AG Charts community configurator
 */
@PluginInformation(
        pluginName = "AG Charts",
        pluginUniqueName = "ag-charts",
        pluginDescription = "AG Charts is a powerful charting and data visualization library with Angular support.",
        pluginVersion = "12.2.0",
        pluginCategories = "charts, graphing, data-viz, web ui",
        pluginSubtitle = "Charting for the modern web",
        pluginSourceUrl = "https://www.ag-grid.com/charts/",
        pluginWikiUrl = "https://github.com/JWebMP/JWebMP-AgGrid/wiki",
        pluginGitUrl = "https://github.com/JWebMP/JWebMP",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "https://www.ag-grid.com/charts/",
        pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins/agcharts",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "agcharts",
        pluginModuleName = "com.jwebmp.plugins.agcharts",
        pluginLastUpdatedDate = "2025-09-23",
        pluginStatus = PluginStatus.Released
)

@TsDependency(value = "ag-charts-community", version = "^12.2.0")
@TsDependency(value = "ag-charts-enterprise", version = "^12.2.0")
@TsDependency(value = "ag-charts-angular", version = "^12.2.0")
@TsDependency(value = "ag-charts-locale", version = "^12.2.0")
public class AgChartsPageConfigurator implements IPageConfigurator<AgChartsPageConfigurator>, com.jwebmp.core.base.angular.client.services.TypescriptIndexPageConfigurator<AgChartsPageConfigurator>
{
    private static boolean enabled = true;

    public static boolean isEnabled()
    {
        return enabled;
    }

    public static void setEnabled(boolean mustEnable)
    {
        enabled = mustEnable;
    }

    @NotNull
    @Override
    public IPage<?> configure(IPage<?> page)
    {
        // Angular handles resource loading via dependencies
        return page;
    }

    @Override
    public boolean enabled()
    {
        return enabled;
    }
}
