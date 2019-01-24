/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Optional;
import com.oracle.bmc.internal.EndpointBuilder;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Enumeration of all of the known Regions that can be contacted.
 * <p>
 * Note, not all services may be available in all regions.
 */
@Slf4j
@RequiredArgsConstructor
public enum Region {
    // OC1
    CA_TORONTO_1("ca-toronto-1", Realm.OC1),
    // regionCode for FRA shouldn't be needed, but left for backwards compat
    EU_FRANKFURT_1("eu-frankfurt-1", "fra", Realm.OC1),
    // regionCode for LHR shouldn't be needed, but left for backwards compat
    UK_LONDON_1("uk-london-1", "lhr", Realm.OC1),
    US_ASHBURN_1("us-ashburn-1", "iad", Realm.OC1),
    US_PHOENIX_1("us-phoenix-1", "phx", Realm.OC1);

    private static final Map<String, Map<Region, String>> SERVICE_TO_REGION_ENDPOINTS =
            new HashMap<>();

    /**
     * Get the region ID.
     */
    @Getter private final String regionId;

    /**
     * The region code obtained from the 'region' field of instance metadata.  This
     * does not match the regionId in us-phoenix-1 and us-ashburn-1, but does in all
     * other regions.
     */
    @Deprecated private final Optional<String> regionCode;

    /**
     * Get the realm this region belongs to.
     */
    @Getter private final Realm realm;

    private Region(String regionId, Realm realm) {
        this(regionId, Optional.<String>absent(), realm);
    }

    private Region(String regionId, String regionCode, Realm realm) {
        this(regionId, Optional.<String>of(regionCode), realm);
    }

    /**
     * Get the region code.
     * @Deprecated Do not use regionCode anymore.  Use {@link #getRegionId()} to retrieve
     * the canonical region ID.
     */
    @Deprecated
    public String getRegionCode() {
        return regionCode.or(regionId);
    }

    /**
     * Resolves a service name to its endpoint in the region, if available.
     *
     * @param service
     *            The service.
     * @return The endpoint for the given service, or empty if the service
     *         endpoint is not known.
     */
    public synchronized Optional<String> getEndpoint(Service service) {
        if (!SERVICE_TO_REGION_ENDPOINTS.containsKey(service.getServiceName())) {
            HashMap<Region, String> endpoints = new HashMap<>();
            for (Region region : Region.values()) {
                String endpoint = formatDefaultRegionEndpoint(service, region);
                endpoints.put(region, endpoint);
            }
            SERVICE_TO_REGION_ENDPOINTS.put(service.getServiceName(), endpoints);
            LOG.info(
                    "Loaded service '{}' endpoint mappings: {}",
                    service.getServiceName(),
                    endpoints);
        }

        String endpoint = SERVICE_TO_REGION_ENDPOINTS.get(service.getServiceName()).get(this);
        return Optional.fromNullable(endpoint);
    }

    /**
     * Creates a default endpoint URL for the given service in the given region.
     * <p>
     * Note, the regionId is not validated against known regions, this just creates
     * a URL that follows the default format.
     *
     * @param service The service.
     * @param region The region.
     * @return The endpoint.
     */
    public static String formatDefaultRegionEndpoint(Service service, Region region) {
        return EndpointBuilder.createEndpoint(service, region);
    }

    /**
     * Creates a default endpoint URL for the given service in the given region.
     *
     * <p>
     * Note, the regionId is not validated against known regions, this just creates
     * a URL that follows the default format.
     * <p>
     * This method uses a realm of {@link Realm#OC1} if the region cannot be determined.
     *
     * @param service The service.
     * @param regionId The region ID.
     * @return The endpoint.
     */
    public static String formatDefaultRegionEndpoint(Service service, String regionId) {
        // try to get a real region first
        Optional<Region> maybeRegion = maybeFromRegionId(regionId);
        if (maybeRegion.isPresent()) {
            return formatDefaultRegionEndpoint(service, maybeRegion.get());
        }

        // else we need to fall back to OC1 SLD
        LOG.debug("Unknown regionId '{}', will assume it's in Realm OC1", regionId);
        return EndpointBuilder.createEndpoint(service, regionId, Realm.OC1);
    }

    /**
     * Returns the region enum from the canonical public region ID. Throws
     * IllegalArgumentException if the region ID is not known.
     *
     * @param regionId
     *            The region ID.
     * @return The enum value.
     */
    public static Region fromRegionId(String regionId) {
        Optional<Region> maybeRegion = maybeFromRegionId(regionId);
        if (maybeRegion.isPresent()) {
            return maybeRegion.get();
        }
        throw new IllegalArgumentException("Unknown regionId: " + regionId);
    }

    private static Optional<Region> maybeFromRegionId(String regionId) {
        for (Region region : Region.values()) {
            if (region.regionId.equals(regionId)) {
                return Optional.of(region);
            }
        }
        return Optional.absent();
    }

    /**
     * Returns the region enum from the public region code. Throws
     * IllegalArgumentException if the region code is not known.
     *
     * @param regionCode
     *            The region code.
     * @return The enum value.
     * @deprecated use {@link #fromRegionId(String)} and provide the canonical region ID.
     */
    @Deprecated
    public static Region fromRegionCode(String regionCode) {
        for (Region region : Region.values()) {
            if (region.getRegionCode().compareToIgnoreCase(regionCode) == 0) {
                return region;
            }
        }
        throw new IllegalArgumentException("Unknown regionId: " + regionCode);
    }

    /**
     * Returns the region enum from the public region code or id. Throws
     * IllegalArgumentException if the region code or id is not known.
     *
     * @param regionCodeOrId
     *            The region code or id.
     * @return The enum value.
     * @deprecated use {@link #fromRegionId(String)} and provide the canonical region ID.
     */
    @Deprecated
    public static Region fromRegionCodeOrId(String regionCodeOrId) {
        for (Region region : Region.values()) {
            if (region.getRegionCode().compareToIgnoreCase(regionCodeOrId) == 0
                    || region.regionId.compareToIgnoreCase(regionCodeOrId) == 0) {
                return region;
            }
        }
        throw new IllegalArgumentException("Unknown region: " + regionCodeOrId);
    }
}
