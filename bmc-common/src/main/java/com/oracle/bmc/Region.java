/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import java.io.File;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Optional;
import com.oracle.bmc.internal.EndpointBuilder;

import com.oracle.bmc.model.RegionSchema;
import com.oracle.bmc.model.internal.JsonConverter;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.NameUtils;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import static javax.ws.rs.core.HttpHeaders.AUTHORIZATION;

/**
 * Class containing all of the known Regions that can be contacted.
 * <p>
 * Note, not all services may be available in all regions.
 */
@Slf4j
@EqualsAndHashCode
public final class Region implements Serializable, Comparable<Region> {

    // Region metadata env attribute key
    private final static String OCI_REGION_METADATA_ENV_VAR_NAME = "OCI_REGION_METADATA";

    //Default base url of metadata service.
    private final static String METADATA_SERVICE_BASE_URL = "http://169.254.169.254/opc/v2/";

    //The Authorization header value to be sent for requests to the metadata service.
    private static final String AUTHORIZATION_HEADER_VALUE = "Bearer Oracle";

    //The regions-config file path location
    private static final String REGIONS_CONFIG_FILE_PATH = "~/.oci/regions-config.json";

    private static volatile boolean hasUsedEnvVar = false;
    private static volatile boolean hasUsedConfigFile = false;

    private static volatile boolean hasOptedForInstanceMetadataService = false;
    @VisibleForTesting static volatile boolean hasUsedInstanceMetadataService = false;
    private static volatile boolean hasReceivedInstanceMetadataServiceResponse = false;
    private static volatile boolean hasWarnedAboutValuesWithoutInstanceMetadataService = false;
    private static volatile ClientConfig imdsClientConfiguration = new ClientConfig();

    static {
        imdsClientConfiguration =
                imdsClientConfiguration.property(ClientProperties.CONNECT_TIMEOUT, 10000);
        imdsClientConfiguration =
                imdsClientConfiguration.property(ClientProperties.READ_TIMEOUT, 60000);
    }

    // LinkedHashMap to ensure stable ordering of registered regions
    private static final Map<String, Region> KNOWN_REGIONS = new LinkedHashMap<>();

    // OC1
    public static final Region AP_CHUNCHEON_1 = register("ap-chuncheon-1", Realm.OC1, "yny");
    public static final Region AP_MELBOURNE_1 = register("ap-melbourne-1", Realm.OC1, "mel");
    public static final Region AP_HYDERABAD_1 = register("ap-hyderabad-1", Realm.OC1, "hyd");
    public static final Region AP_MUMBAI_1 = register("ap-mumbai-1", Realm.OC1, "bom");
    public static final Region AP_OSAKA_1 = register("ap-osaka-1", Realm.OC1, "kix");
    public static final Region AP_SEOUL_1 = register("ap-seoul-1", Realm.OC1, "icn");
    public static final Region AP_SYDNEY_1 = register("ap-sydney-1", Realm.OC1, "syd");
    public static final Region AP_TOKYO_1 = register("ap-tokyo-1", Realm.OC1, "nrt");
    public static final Region CA_MONTREAL_1 = register("ca-montreal-1", Realm.OC1, "yul");
    public static final Region CA_TORONTO_1 = register("ca-toronto-1", Realm.OC1, "yyz");
    public static final Region EU_AMSTERDAM_1 = register("eu-amsterdam-1", Realm.OC1, "ams");
    public static final Region EU_FRANKFURT_1 = register("eu-frankfurt-1", Realm.OC1, "fra");
    public static final Region EU_ZURICH_1 = register("eu-zurich-1", Realm.OC1, "zrh");
    public static final Region ME_JEDDAH_1 = register("me-jeddah-1", Realm.OC1, "jed");
    public static final Region ME_DUBAI_1 = register("me-dubai-1", Realm.OC1, "dxb");
    public static final Region SA_SAOPAULO_1 = register("sa-saopaulo-1", Realm.OC1, "gru");
    public static final Region UK_LONDON_1 = register("uk-london-1", Realm.OC1, "lhr");
    public static final Region US_ASHBURN_1 = register("us-ashburn-1", Realm.OC1, "iad");
    public static final Region US_PHOENIX_1 = register("us-phoenix-1", Realm.OC1, "phx");
    public static final Region US_SANJOSE_1 = register("us-sanjose-1", Realm.OC1, "sjc");
    public static final Region UK_CARDIFF_1 = register("uk-cardiff-1", Realm.OC1, "cwl");

    // OC2
    public static final Region US_LANGLEY_1 = register("us-langley-1", Realm.OC2, "lfi");
    public static final Region US_LUKE_1 = register("us-luke-1", Realm.OC2, "luf");

    // OC3
    public static final Region US_GOV_ASHBURN_1 = register("us-gov-ashburn-1", Realm.OC3, "ric");
    public static final Region US_GOV_CHICAGO_1 = register("us-gov-chicago-1", Realm.OC3, "pia");
    public static final Region US_GOV_PHOENIX_1 = register("us-gov-phoenix-1", Realm.OC3, "tus");

    // OC4
    public static final Region UK_GOV_LONDON_1 = register("uk-gov-london-1", Realm.OC4, "ltn");
    public static final Region UK_GOV_CARDIFF_1 = register("uk-gov-cardiff-1", Realm.OC4, "brs");

    // OC8
    public static final Region AP_CHIYODA_1 = register("ap-chiyoda-1", Realm.OC8, "nja");

    private static final Map<String, Map<Region, String>> SERVICE_TO_REGION_ENDPOINTS =
            new HashMap<>();

    private static final long serialVersionUID = -905384971L;

    /**
     * The region identifier as defined in https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm
     */
    @Getter private final String regionId;

    /**
     * The region key as defined in https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm
     */
    private final Optional<String> regionCode;

    /**
     * Get the realm this region belongs to.
     */
    @Getter private final Realm realm;

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
     */
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
     * Return all known Regions in this version of the SDK, except possibly the region returned by IMDS (Instance Metadata
     * Service, only available on OCI instances), since IMDS is not automatically contacted by this method.
     *
     * To ensure that this method also returns the region provided by IMDS, call {@link Region#registerFromInstanceMetadataService()}
     * explicitly before calling {@link Region#values()}.
     *
     * @return Known regions
     */
    public static Region[] values() {
        if (!hasUsedInstanceMetadataService
                && !hasWarnedAboutValuesWithoutInstanceMetadataService) {
            LOG.warn(
                    "Call to Regions.values() without having contacted IMDS (Instance Metadata Service, only "
                            + "available on OCI instances); if you do need the region from IMDS, call "
                            + "Region.registerFromInstanceMetadataService before calling Region.values()");
            hasWarnedAboutValuesWithoutInstanceMetadataService = true;
        }
        registerAllRegions();
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
        Optional<Region> maybeRegion = getRegionAndRegisterIfNecessary(name);
        if (!maybeRegion.isPresent()) {
            throw new IllegalArgumentException("Unknown region " + name);
        }
        return maybeRegion.get();
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
        return getRegionAndRegisterIfNecessary(regionId);
    }

    /**
     * Returns the Region object from the public region code. Throws
     * IllegalArgumentException if the region code is not known.
     *
     * @param regionCode
     *            The region code.
     * @return The Region object.
     */
    public static Region fromRegionCode(String regionCode) {
        Optional<Region> maybeRegion = getRegionAndRegisterIfNecessary(regionCode);
        if (!maybeRegion.isPresent()) {
            throw new IllegalArgumentException("Unknown regionCode: " + regionCode);
        }
        return maybeRegion.get();
    }

    /**
     * Returns the Region object from the public region code or id. Throws
     * IllegalArgumentException if the region code or id is not known.
     *
     * @param regionCodeOrId
     *            The region code or id.
     * @return The Region object.
     */
    public static Region fromRegionCodeOrId(String regionCodeOrId) {
        Optional<Region> maybeRegion = getRegionAndRegisterIfNecessary(regionCodeOrId);
        if (!maybeRegion.isPresent()) {
            throw new IllegalArgumentException("Unknown regionCodeOrId: " + regionCodeOrId);
        }
        return maybeRegion.get();
    }

    /**
     * Register a new region. Used to allow the SDK to be forward compatible with unreleased regions.
     *
     * @param regionId The region ID.
     * @param realm The realm of the new region.
     * @return The registered region (or existing one if found).
     */
    public static Region register(@NonNull String regionId, @NonNull final Realm realm) {
        return register(regionId, realm, null);
    }

    /**
     * Register a new region. Used to allow the SDK to be forward compatible with unreleased regions.
     *
     * @param regionId The region ID.
     * @param realm The realm of the new region.
     * @param regionCode The 3-letter region code returned by the instance metadata service as the 'region'
     *        value, if it differs from regionId.  This is only needed for very early regions.
     * @return The registered region (or existing one if found).
     */
    public static Region register(
            @NonNull String regionId, @NonNull final Realm realm, String regionCode) {
        regionId = regionId.trim().toLowerCase(Locale.US);
        if (regionId.isEmpty()) {
            throw new IllegalArgumentException("Cannot have empty regionId");
        }
        synchronized (KNOWN_REGIONS) {
            for (Region region : KNOWN_REGIONS.values()) {
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
            if (regionCode != null) {
                regionCode = regionCode.trim().toLowerCase(Locale.US);
                if (regionCode.isEmpty()) {
                    regionCode = null;
                }
            }
            return new Region(regionId, Optional.fromNullable(regionCode), realm);
        }
    }

    private static java.util.Optional<Region> maybeFromRegionCodeOrIdWithoutRegistering(
            String regionCodeOrId) {
        synchronized (KNOWN_REGIONS) {
            return KNOWN_REGIONS
                    .values()
                    .stream()
                    .filter(
                            r ->
                                    r.getRegionCode().equalsIgnoreCase(regionCodeOrId)
                                            || r.regionId.equalsIgnoreCase(regionCodeOrId))
                    .findAny();
        }
    }

    /**
     *  Register all regions and sets status
     */
    private static void registerAllRegions() {

        if (!hasUsedConfigFile) {
            readConfigFile();
        }

        if (!hasUsedEnvVar) {
            readEnvVar();
        }
    }

    /**
     *  Implements decision tree to determine Region.
     */
    private static Optional<Region> getRegionAndRegisterIfNecessary(String regionCodeOrId) {

        if (regionCodeOrId.contains("_")) {
            regionCodeOrId = NameUtils.decanonicalizeFromEnumTypes(regionCodeOrId);
        }

        java.util.Optional<Region> maybeRegion =
                maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
        if (maybeRegion.isPresent()) {
            return Optional.fromNullable(maybeRegion.get()); // already known
        }

        if (!hasUsedConfigFile) {
            readConfigFile(); // registers region and sets hasUsedConfigFile = true;
            maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
            if (maybeRegion.isPresent()) {
                return Optional.fromNullable(maybeRegion.get());
            }
        }

        if (!hasUsedEnvVar) {
            readEnvVar(); // registers region and sets hasUsedEnvVar = true;
            maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
            if (maybeRegion.isPresent()) {
                return Optional.fromNullable(maybeRegion.get());
            }
        }

        if (hasOptedForInstanceMetadataService && !hasUsedInstanceMetadataService) {
            registerFromInstanceMetadataService(); // registers region and sets hasUsedInstanceMetadataService = true;
            maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
            if (maybeRegion.isPresent()) {
                return Optional.fromNullable(maybeRegion.get());
            }
        }

        return Optional.absent();
    }

    /**
     * Registers region and sets envVarUsed status to true.
     */
    private static void readEnvVar() {
        final String envVar = System.getenv(OCI_REGION_METADATA_ENV_VAR_NAME);
        RegionSchema regionSchema = null;

        LOG.info("Region metadata schema from OCI_REGION_METADATA env variable is {}", envVar);
        hasUsedEnvVar = true;
        if (envVar != null) {
            regionSchema = JsonConverter.jsonBlobToObject(envVar, RegionSchema.class);
        }

        if (regionSchema != null && RegionSchema.isValid(regionSchema)) {
            register(
                    regionSchema.getRegionIdentifier(),
                    Realm.register(
                            regionSchema.getRealmKey(), regionSchema.getRealmDomainComponent()),
                    regionSchema.getRegionKey());
        }
    }

    /**
     * Registers region and sets hasUsedConfigFile status to true.
     */
    private static void readConfigFile() {
        hasUsedConfigFile = true;

        try {
            File file = new File(FileUtils.expandUserHome(REGIONS_CONFIG_FILE_PATH));
            if (!file.isFile()) {
                LOG.info(
                        "Region config file not found to fetch regions at {} ",
                        Paths.get(FileUtils.expandUserHome(REGIONS_CONFIG_FILE_PATH)));
                return;
            }

            String content =
                    new String(
                            Files.readAllBytes(
                                    Paths.get(FileUtils.expandUserHome(REGIONS_CONFIG_FILE_PATH))),
                            StandardCharsets.UTF_8);
            LOG.info("Region schemas from regions-config.json are {}", content);

            if (content.isEmpty()) return;
            RegionSchema[] regionSchemas =
                    JsonConverter.jsonBlobToObject(content, RegionSchema[].class);

            if (regionSchemas != null && regionSchemas.length != 0) {
                for (RegionSchema regionSchema : regionSchemas) {

                    if (regionSchema != null && RegionSchema.isValid(regionSchema)) {
                        Region.register(
                                regionSchema.getRegionIdentifier(),
                                Realm.register(
                                        regionSchema.getRealmKey(),
                                        regionSchema.getRealmDomainComponent()),
                                regionSchema.getRegionKey());
                    }
                }
            }

        } catch (Exception e) {
            LOG.warn(
                    "Exception in reading or parsing {} to fetch regions ",
                    Paths.get(FileUtils.expandUserHome(REGIONS_CONFIG_FILE_PATH)),
                    e);
        }
    }

    /**
     * Set the client configuration used to contact IMDS (Instance Metadata Service, only available on OCI instances).
     *
     * The default configuration uses a 10 second connect timeout and a 60 second read timeout.
     *
     * @param clientConfig configuration used to contact IMDS.
     */
    public static void setInstanceMetadataServiceClientConfig(ClientConfig clientConfig) {
        imdsClientConfiguration = clientConfig;
    }

    /**
     * Enables contact to IMDS (Instance Metadata Service, only available on OCI instances) if user decides to opt-in.
     */
    public static void enableInstanceMetadataService() {
        hasOptedForInstanceMetadataService = true;
    }

    /**
     * Instructs the SDK to not contact the IMDS (Instance Metadata Service, only available on OCI instances).
     */
    public static void skipInstanceMetadataService() {
        hasUsedInstanceMetadataService = true;
        hasOptedForInstanceMetadataService = false;
    }

    /**
     * Send request to IMDS (Instance Metadata Service, only available on OCI instances), registers region, and sets
     * hasUsedInstanceMetadataService = true.
     * @return true if response from IMDS was received
     */
    public static boolean registerFromInstanceMetadataService() {
        if (hasUsedInstanceMetadataService) {
            // only read once
            return hasReceivedInstanceMetadataServiceResponse;
        }

        try {
            Client client = ClientBuilder.newClient(imdsClientConfiguration);
            WebTarget base = client.target(METADATA_SERVICE_BASE_URL + "instance/");
            enableInstanceMetadataService();
            hasUsedInstanceMetadataService = true;

            LOG.info(
                    "Requesting region metadata blob from IMDS at {}",
                    METADATA_SERVICE_BASE_URL + "instance/regionInfo");
            String regionMetadataSchema =
                    base.path("regionInfo")
                            .request(MediaType.APPLICATION_JSON)
                            .header(AUTHORIZATION, AUTHORIZATION_HEADER_VALUE)
                            .get(String.class);

            hasReceivedInstanceMetadataServiceResponse = true;
            LOG.info("Region metadata blob from regionInfo service is {}", regionMetadataSchema);

            if (regionMetadataSchema != null && !regionMetadataSchema.isEmpty()) {
                RegionSchema regionSchema =
                        JsonConverter.jsonBlobToObject(regionMetadataSchema, RegionSchema.class);

                if (regionSchema != null && RegionSchema.isValid(regionSchema)) {
                    Region.register(
                            regionSchema.getRegionIdentifier(),
                            Realm.register(
                                    regionSchema.getRealmKey(),
                                    regionSchema.getRealmDomainComponent()),
                            regionSchema.getRegionKey());
                }
            }
        } catch (RuntimeException e) {
            LOG.warn("Rest call to get regionInfo from metadata service failed ", e);
        } finally {
            return hasReceivedInstanceMetadataServiceResponse;
        }
    }
}
