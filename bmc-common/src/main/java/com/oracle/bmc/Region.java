/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import com.google.common.base.Optional;
import com.oracle.bmc.internal.EndpointBuilder;

import com.oracle.bmc.util.internal.NameUtils;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/**
 * Class containing all of the known Regions that can be contacted.
 * <p>
 * Note, not all services may be available in all regions.
 */
@Slf4j
@EqualsAndHashCode
public final class Region implements Serializable, Comparable<Region> {
    // LinkedHashMap to ensure stable ordering of registered regions
    private static final Map<String, Region> KNOWN_REGIONS = new LinkedHashMap<>();

    // OC1
    public static final Region CA_TORONTO_1 = new Region("ca-toronto-1", Realm.OC1);
    // regionCode for FRA shouldn't be needed, but left for backwards compatibility
    public static final Region EU_FRANKFURT_1 = new Region("eu-frankfurt-1", "fra", Realm.OC1);
    // regionCode for LHR shouldn't be needed, but left for backwards compatibility
    public static final Region UK_LONDON_1 = new Region("uk-london-1", "lhr", Realm.OC1);
    public static final Region US_ASHBURN_1 = new Region("us-ashburn-1", "iad", Realm.OC1);
    public static final Region US_PHOENIX_1 = new Region("us-phoenix-1", "phx", Realm.OC1);

    // OC2
    public static final Region US_LANGLEY_1 = new Region("us-langley-1", Realm.OC2);
    public static final Region US_LUKE_1 = new Region("us-luke-1", Realm.OC2);

    // OC3
    public static final Region US_GOV_ASHBURN_1 = new Region("us-gov-ashburn-1", Realm.OC3);
    public static final Region US_GOV_CHICAGO_1 = new Region("us-gov-chicago-1", Realm.OC3);
    public static final Region US_GOV_PHOENIX_1 = new Region("us-gov-phoenix-1", Realm.OC3);

    private static final Map<String, Map<Region, String>> SERVICE_TO_REGION_ENDPOINTS =
            new HashMap<>();

    private static final long serialVersionUID = -905384971L;

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

    private Region(
            @NonNull String regionId, @NonNull Optional<String> regionCode, @NonNull Realm realm) {
        this.regionId = regionId;
        this.regionCode = regionCode;
        this.realm = realm;

        synchronized (KNOWN_REGIONS) {
            // The field name is named after the regionId, but follows enum naming convention.
            // For backwards compatibility, we keep track of the enum-named field.
            KNOWN_REGIONS.put(NameUtils.canonicalizeForEnumTypes(regionId), this);
        }
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
    public Optional<String> getEndpoint(Service service) {
        synchronized (SERVICE_TO_REGION_ENDPOINTS) {
            if (!SERVICE_TO_REGION_ENDPOINTS.containsKey(service.getServiceName())) {
                HashMap<Region, String> endpoints = new HashMap<>();
                endpoints.put(this, formatDefaultRegionEndpoint(service, this));

                SERVICE_TO_REGION_ENDPOINTS.put(service.getServiceName(), endpoints);
                LOG.info(
                        "Loaded service '{}' endpoint mappings: {}",
                        service.getServiceName(),
                        endpoints);
            }

            final Map<Region, String> endpoints =
                    SERVICE_TO_REGION_ENDPOINTS.get(service.getServiceName());
            if (!endpoints.containsKey(this)) {
                endpoints.put(this, formatDefaultRegionEndpoint(service, this));
                LOG.info(
                        "Loaded service '{}' endpoint mappings: {}",
                        service.getServiceName(),
                        endpoints);
            }
            String endpoint = SERVICE_TO_REGION_ENDPOINTS.get(service.getServiceName()).get(this);
            return Optional.fromNullable(endpoint);
        }
    }

    /**
     * Compares to regions lexicographically based on their regionId.
     *
     * @param other The Region to be compared.
     * @return the value {@code 0} if the regionId of the compared Region is
     *  equal to the regionId of this Region; a value less than {@code 0} if
     *  the regionId of this Region is lexicographically less than the regionId
     *  of the compared Region; and a value greater than {@code 0} if the
     *  regionId of this Region is lexicographically greater than the regionId
     *  of the compared Region.
     */
    public int compareTo(Region other) {
        return regionId.compareTo(other.regionId);
    }

    @Override
    // For backward compatibility maintain the enum toString behavior
    public String toString() {
        return NameUtils.canonicalizeForEnumTypes(getRegionId());
    }

    /**
     * All known Regions in this version of the SDK
     *
     * @return Known regions
     */
    public static Region[] values() {
        synchronized (KNOWN_REGIONS) {
            return KNOWN_REGIONS.values().toArray(new Region[0]);
        }
    }

    /**
     * Returns the Region object matching the specified name. The name must
     * match exactly. (Extraneous whitespace characters are not permitted.)
     *
     * @param name The name of the region
     * @return The Region object matching the specified name, if available.
     * @throws IllegalArgumentException if no region exists with the specified
     * name
     */
    public static Region valueOf(@NonNull String name) throws IllegalArgumentException {
        Region region;

        synchronized (KNOWN_REGIONS) {
            region = KNOWN_REGIONS.get(name);
        }

        if (region == null) {
            throw new IllegalArgumentException("Unknown region " + name);
        }
        return region;
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
     * Returns the Region object from the canonical public region ID. Throws
     * IllegalArgumentException if the region ID is not known.
     *
     * @param regionId
     *            The region ID.
     * @return The Region object.
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
     * Returns the Region object from the public region code. Throws
     * IllegalArgumentException if the region code is not known.
     *
     * @param regionCode
     *            The region code.
     * @return The Region object.
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
     * Returns the Region object from the public region code or id. Throws
     * IllegalArgumentException if the region code or id is not known.
     *
     * @param regionCodeOrId
     *            The region code or id.
     * @return The Region object.
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

    /**
     * Register a new region. Used to allow the SDK to be forward compatible with unreleased regions.
     *
     * @param regionId The region ID.
     * @param realm The realm of the new region.
     * @return The registered region (or existing one if found).
     */
    public static Region register(@NonNull String regionId, @NonNull final Realm realm) {
        regionId = regionId.toLowerCase(Locale.US);
        synchronized (KNOWN_REGIONS) {
            for (Region region : Region.values()) {
                if (region.getRegionId().equals(regionId)) {
                    if (!region.getRealm().equals(realm)) {
                        throw new IllegalArgumentException(
                                "Region : "
                                        + regionId
                                        + " is already registered with "
                                        + region.getRealm()
                                        + ". It cannot be re-registered with a different realm.");
                    }
                    return region;
                }
            }

            return new Region(regionId, realm);
        }
    }
}
