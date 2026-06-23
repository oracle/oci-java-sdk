/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class RegionDeveloperToolConfigurationSchema {

    private final List<RegionSchema> regions;
    private final String developerToolConfigurationProvider;
    private final Set<String> services;
    private final String allowOnlyDeveloperToolConfigurationRegions;

    @java.beans.ConstructorProperties({
        "regions",
        "developerToolConfigurationProvider",
        "services",
        "allowOnlyDeveloperToolConfigurationRegions"
    })
    public RegionDeveloperToolConfigurationSchema(
            final List<RegionSchema> regions,
            final String developerToolConfigurationProvider,
            final Set<String> services,
            final String allowOnlyDeveloperToolConfigurationRegions) {
        this.regions = Collections.unmodifiableList(regions);
        this.developerToolConfigurationProvider = developerToolConfigurationProvider;
        this.services = Collections.unmodifiableSet(services);
        this.allowOnlyDeveloperToolConfigurationRegions =
                allowOnlyDeveloperToolConfigurationRegions;
    }

    public List<RegionSchema> getRegions() {
        return regions;
    }

    public String getProvider() {
        return developerToolConfigurationProvider;
    }

    public Set<String> getServices() {
        return services;
    }

    public String getAllowOnlyDeveloperToolConfigurationRegions() {
        return allowOnlyDeveloperToolConfigurationRegions;
    }

    @java.lang.Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $regions = this.getRegions();
        result = result * PRIME + ($regions == null ? 43 : $regions.hashCode());
        final java.lang.Object $provider = this.getProvider();
        result = result * PRIME + ($provider == null ? 43 : $provider.hashCode());
        final java.lang.Object $services = this.getServices();
        result = result * PRIME + ($services == null ? 43 : $services.hashCode());
        final java.lang.Object $allowOnlyDeveloperToolConfigurationRegions =
                this.getAllowOnlyDeveloperToolConfigurationRegions();
        result =
                result * PRIME
                        + ($allowOnlyDeveloperToolConfigurationRegions == null
                                ? 43
                                : $allowOnlyDeveloperToolConfigurationRegions.hashCode());
        return result;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionDeveloperToolConfigurationSchema that = (RegionDeveloperToolConfigurationSchema) o;
        return regions.equals(that.regions)
                && developerToolConfigurationProvider.equals(
                        that.developerToolConfigurationProvider)
                && services.equals(that.services)
                && allowOnlyDeveloperToolConfigurationRegions.equals(
                        that.allowOnlyDeveloperToolConfigurationRegions);
    }

    @java.lang.Override
    public String toString() {
        return "RegionDeveloperToolConfigurationSchema{"
                + "regions = '"
                + regions
                + '\''
                + ",developerToolConfigurationProvider = '"
                + developerToolConfigurationProvider
                + '\''
                + ",services = '"
                + services
                + '\''
                + ",allowOnlyDeveloperToolConfigurationRegions = '"
                + allowOnlyDeveloperToolConfigurationRegions
                + '\''
                + "}";
    }
}
