/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.model;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class RegionAlloySchema {

    private final List<RegionSchema> regions;
    private final String alloyProvider;
    private final Set<String> services;
    private final String ociRegionCoexist;

    @java.beans.ConstructorProperties({"regions", "alloyProvider", "services", "ociRegionCoexist"})
    public RegionAlloySchema(
            final List<RegionSchema> regions,
            final String alloyProvider,
            final Set<String> services,
            final String ociRegionCoexist) {
        this.regions = Collections.unmodifiableList(regions);
        this.alloyProvider = alloyProvider;
        this.services = Collections.unmodifiableSet(services);
        this.ociRegionCoexist = ociRegionCoexist;
    }

    public List<RegionSchema> getRegions() {
        return regions;
    }

    public String getProvider() {
        return alloyProvider;
    }

    public Set<String> getServices() {
        return services;
    }

    public String getOciRegionCoexist() {
        return ociRegionCoexist;
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
        final java.lang.Object $ociRegionCoexist = this.getOciRegionCoexist();
        result = result * PRIME + ($ociRegionCoexist == null ? 43 : $ociRegionCoexist.hashCode());
        return result;
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionAlloySchema that = (RegionAlloySchema) o;
        return regions.equals(that.regions)
                && alloyProvider.equals(that.alloyProvider)
                && services.equals(that.services)
                && ociRegionCoexist.equals(that.ociRegionCoexist);
    }

    @java.lang.Override
    public String toString() {
        return "RegionAlloySchema{"
                + "regions = '"
                + regions
                + '\''
                + ",alloyProvider = '"
                + alloyProvider
                + '\''
                + ",services = '"
                + services
                + '\''
                + ",ociRegionCoexist = '"
                + ociRegionCoexist
                + '\''
                + "}";
    }
}
