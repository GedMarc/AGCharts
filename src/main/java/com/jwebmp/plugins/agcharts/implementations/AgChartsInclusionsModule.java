package com.jwebmp.plugins.agcharts.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

/**
 * Module inclusions for AG Charts
 */
public class AgChartsInclusionsModule implements IGuiceScanModuleInclusions<AgChartsInclusionsModule>
{
    @Override
    public @NotNull Set<String> includeModules()
    {
        Set<String> strings = new HashSet<>();
        strings.add("com.jwebmp.plugins.agcharts");
        return strings;
    }
}
