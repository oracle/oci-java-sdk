/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.google.common.base.Optional;

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
    US_PHOENIX_1("us-phoenix-1", "phx"),
    US_ASHBURN_1("us-ashburn-1", "iad"),
    EU_FRANKFURT_1("eu-frankfurt-1", "fra"),
    UK_LONDON_1("uk-london-1", "lhr");

    private static final Map<String, Map<Region, String>> SERVICE_TO_REGION_ENDPOINTS =
            new HashMap<>();

    private static final String DEFAULT_ENDPOINT_FORMAT;

    static {
        Properties properties = new Properties();
        try (InputStream propertyStream =
                Region.class
                        .getClassLoader()
                        .getResourceAsStream("com/oracle/bmc/sdk.properties")) {
            properties.load(propertyStream);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to load required properties file", e);
        }

        DEFAULT_ENDPOINT_FORMAT = properties.getProperty("endpoint.defaultFormat");
        if (DEFAULT_ENDPOINT_FORMAT == null) {
            throw new IllegalStateException("Default endpoint format must be available");
        }

        LOG.info("Using default endpoint format of '{}'", DEFAULT_ENDPOINT_FORMAT);
    }

    /**
     * Get the region ID.
     */
    @Getter private final String regionId;

    /**
     * Get the region code.
     */
    @Getter private final String regionCode;

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
                String endpoint = formatDefaultRegionEndpoint(service, region.regionId);
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
     * @param regionId The region ID.
     * @return The endpoint.
     */
    public static String formatDefaultRegionEndpoint(Service service, String regionId) {
        return String.format(DEFAULT_ENDPOINT_FORMAT, service.getServiceEndpointPrefix(), regionId);
    }

    /**
     * Returns the region enum from the public region ID. Throws
     * IllegalArgumentException if the region ID is not known.
     *
     * @param regionId
     *            The region ID.
     * @return The enum value.
     */
    public static Region fromRegionId(String regionId) {
        for (Region region : Region.values()) {
            if (region.regionId.equals(regionId)) {
                return region;
            }
        }
        throw new IllegalArgumentException("Unknown regionId: " + regionId);
    }

    /**
     * Returns the region enum from the public region code. Throws
     * IllegalArgumentException if the region code is not known.
     *
     * @param regionCode
     *            The region code.
     * @return The enum value.
     */
    public static Region fromRegionCode(String regionCode) {
        for (Region region : Region.values()) {
            if (region.regionCode.compareToIgnoreCase(regionCode) == 0) {
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
     */
    public static Region fromRegionCodeOrId(String regionCodeOrId) {
        for (Region region : Region.values()) {
            if (region.regionCode.compareToIgnoreCase(regionCodeOrId) == 0
                    || region.regionId.compareToIgnoreCase(regionCodeOrId) == 0) {
                return region;
            }
        }
        throw new IllegalArgumentException("Unknown region: " + regionCodeOrId);
    }
}
