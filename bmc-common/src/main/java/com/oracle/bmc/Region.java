/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.internal.GuavaUtils;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.auth.AbstractFederationClientAuthenticationDetailsProviderBuilder;
import com.oracle.bmc.internal.EndpointBuilder;

import com.oracle.bmc.model.RegionSchema;
import com.oracle.bmc.model.internal.JsonConverter;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.NameUtils;
import java.util.concurrent.locks.ReentrantLock;
import com.oracle.bmc.util.internal.StringUtils;

import javax.annotation.Nonnull;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.slf4j.Logger;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.locks.ReentrantLock;
import static com.oracle.bmc.auth.AbstractFederationClientAuthenticationDetailsProviderBuilder.AUTHORIZATION_HEADER_VALUE;
import static com.oracle.bmc.auth.AbstractFederationClientAuthenticationDetailsProviderBuilder.METADATA_SERVICE_BASE_URL;
import static com.oracle.bmc.auth.AbstractFederationClientAuthenticationDetailsProviderBuilder.METADATA_URL_OVERRIDE;
import static javax.ws.rs.core.HttpHeaders.AUTHORIZATION;

/**
 * Class containing all of the known Regions that can be contacted.
 * <p>
 * Note, not all services may be available in all regions.
 */
public final class Region implements Serializable, Comparable<Region> {

    // Region metadata env attribute key
    private static final String OCI_REGION_METADATA_ENV_VAR_NAME = "OCI_REGION_METADATA";

    // Default realm metadata env attribute key
    private static final String OCI_DEFAULT_REALM_ENV_VAR_NAME = "OCI_DEFAULT_REALM";

    //The regions-config file path location
    private static final String REGIONS_CONFIG_FILE_PATH = "~/.oci/regions-config.json";

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Region.class);

    private static volatile boolean hasUsedEnvVar = false;
    private static volatile boolean hasUsedConfigFile = false;

    private static final ReentrantLock lock = new ReentrantLock();

    private static volatile boolean hasOptedForInstanceMetadataService = false;
    @VisibleForTesting static volatile boolean hasUsedInstanceMetadataService = false;
    private static volatile boolean hasReceivedInstanceMetadataServiceResponse = false;
    private static volatile boolean hasWarnedAboutValuesWithoutInstanceMetadataService = false;
    private static volatile ClientConfig imdsClientConfiguration = new ClientConfig();

    static {
        imdsClientConfiguration =
                imdsClientConfiguration.property(ClientProperties.CONNECT_TIMEOUT, 30000);
        imdsClientConfiguration =
                imdsClientConfiguration.property(ClientProperties.READ_TIMEOUT, 60000);
    }

    @VisibleForTesting static volatile String defaultRealmEnvVar = getDefaultRealmFromEnv();

    private static String getDefaultRealmFromEnv() {
        final String defaultRealmEnvVar = System.getenv(OCI_DEFAULT_REALM_ENV_VAR_NAME);
        return defaultRealmEnvVar;
    }

    // LinkedHashMap to ensure stable ordering of registered regions
    private static final Map<String, Region> KNOWN_REGIONS = new LinkedHashMap<>();

    // Region registered through the instance metadata service.
    public static volatile Region regionFromImds = null;

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
    public static final Region SA_SANTIAGO_1 = register("sa-santiago-1", Realm.OC1, "scl");
    public static final Region SA_VINHEDO_1 = register("sa-vinhedo-1", Realm.OC1, "vcp");
    public static final Region IL_JERUSALEM_1 = register("il-jerusalem-1", Realm.OC1, "mtz");
    public static final Region EU_MARSEILLE_1 = register("eu-marseille-1", Realm.OC1, "mrs");
    public static final Region AP_SINGAPORE_1 = register("ap-singapore-1", Realm.OC1, "sin");
    public static final Region ME_ABUDHABI_1 = register("me-abudhabi-1", Realm.OC1, "auh");
    public static final Region EU_MILAN_1 = register("eu-milan-1", Realm.OC1, "lin");
    public static final Region EU_STOCKHOLM_1 = register("eu-stockholm-1", Realm.OC1, "arn");
    public static final Region AF_JOHANNESBURG_1 = register("af-johannesburg-1", Realm.OC1, "jnb");
    public static final Region EU_PARIS_1 = register("eu-paris-1", Realm.OC1, "cdg");
    public static final Region MX_QUERETARO_1 = register("mx-queretaro-1", Realm.OC1, "qro");
    public static final Region EU_MADRID_1 = register("eu-madrid-1", Realm.OC1, "mad");
    public static final Region US_CHICAGO_1 = register("us-chicago-1", Realm.OC1, "ord");
    public static final Region MX_MONTERREY_1 = register("mx-monterrey-1", Realm.OC1, "mty");
    public static final Region US_SALTLAKE_2 = register("us-saltlake-2", Realm.OC1, "aga");
    public static final Region SA_BOGOTA_1 = register("sa-bogota-1", Realm.OC1, "bog");
    public static final Region SA_VALPARAISO_1 = register("sa-valparaiso-1", Realm.OC1, "vap");
    public static final Region AP_SINGAPORE_2 = register("ap-singapore-2", Realm.OC1, "xsp");
    public static final Region ME_RIYADH_1 = register("me-riyadh-1", Realm.OC1, "ruh");

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
    public static final Region AP_IBARAKI_1 = register("ap-ibaraki-1", Realm.OC8, "ukb");

    // OC9
    public static final Region ME_DCC_MUSCAT_1 = register("me-dcc-muscat-1", Realm.OC9, "mct");

    // OC10
    public static final Region AP_DCC_CANBERRA_1 = register("ap-dcc-canberra-1", Realm.OC10, "wga");

    // OC14
    public static final Region EU_DCC_MILAN_1 = register("eu-dcc-milan-1", Realm.OC14, "bgy");
    public static final Region EU_DCC_MILAN_2 = register("eu-dcc-milan-2", Realm.OC14, "mxp");
    public static final Region EU_DCC_DUBLIN_2 = register("eu-dcc-dublin-2", Realm.OC14, "snn");
    public static final Region EU_DCC_RATING_2 = register("eu-dcc-rating-2", Realm.OC14, "dtm");
    public static final Region EU_DCC_RATING_1 = register("eu-dcc-rating-1", Realm.OC14, "dus");
    public static final Region EU_DCC_DUBLIN_1 = register("eu-dcc-dublin-1", Realm.OC14, "ork");

    // OC20
    public static final Region EU_JOVANOVAC_1 = register("eu-jovanovac-1", Realm.OC20, "beg");

    // OC19
    public static final Region EU_MADRID_2 = register("eu-madrid-2", Realm.OC19, "vll");
    public static final Region EU_FRANKFURT_2 = register("eu-frankfurt-2", Realm.OC19, "str");

    // OC24
    public static final Region EU_DCC_ZURICH_1 = register("eu-dcc-zurich-1", Realm.OC24, "avz");
    public static final Region EU_CRISSIER_1 = register("eu-crissier-1", Realm.OC24, "avf");

    // OC21
    public static final Region ME_DCC_DOHA_1 = register("me-dcc-doha-1", Realm.OC21, "doh");

    // OC26
    public static final Region ME_ABUDHABI_3 = register("me-abudhabi-3", Realm.OC26, "ahu");
    public static final Region ME_ALAIN_1 = register("me-alain-1", Realm.OC26, "rba");

    // OC15
    public static final Region AP_DCC_GAZIPUR_1 = register("ap-dcc-gazipur-1", Realm.OC15, "dac");

    // OC29
    public static final Region ME_ABUDHABI_2 = register("me-abudhabi-2", Realm.OC29, "rkt");
    public static final Region ME_ABUDHABI_4 = register("me-abudhabi-4", Realm.OC29, "shj");

    // OC23
    public static final Region US_SOMERSET_1 = register("us-somerset-1", Realm.OC23, "ebb");
    public static final Region US_THAMES_1 = register("us-thames-1", Realm.OC23, "ebl");

    // OC35
    public static final Region AP_SEOUL_2 = register("ap-seoul-2", Realm.OC35, "dtz");
    public static final Region AP_SUWON_1 = register("ap-suwon-1", Realm.OC35, "dln");
    public static final Region AP_CHUNCHEON_2 = register("ap-chuncheon-2", Realm.OC35, "bno");

    private static final Map<String, Map<Region, String>> SERVICE_TO_REGION_ENDPOINTS =
            new HashMap<>();

    private static final long serialVersionUID = -905384972L;

    /**
     * The region identifier as defined in https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm
     */
    private final String regionId;

    /**
     * The region key as defined in https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm
     * or null if none.
     *
     * Not using {@code Optional<String>} here, since that is not serializable.
     */
    private final String regionCode;

    /**
     * Get the realm this region belongs to.
     */
    private final Realm realm;

    private Region(
            @Nonnull String regionId, @Nonnull Optional<String> regionCode, @Nonnull Realm realm) {
        if (regionId == null) {
            throw new java.lang.NullPointerException("regionId is marked non-null but is null");
        }
        if (regionCode == null) {
            throw new java.lang.NullPointerException("regionCode is marked non-null but is null");
        }
        if (realm == null) {
            throw new java.lang.NullPointerException("realm is marked non-null but is null");
        }

        this.regionId = regionId;
        this.regionCode = regionCode.orElse(null);
        this.realm = realm;

        synchronized (KNOWN_REGIONS) {
            // The field name is named after the regionId, but follows enum naming convention.
            // For backwards compatibility, we keep track of the enum-named field.
            KNOWN_REGIONS.put(NameUtils.canonicalizeForEnumTypes(regionId), this);
        }
    }

    public static Region getRegionFromImds() {
        return Region.regionFromImds;
    }

    /**
     * Get the region code.
     */
    public String getRegionCode() {
        return regionCode != null ? regionCode : regionId;
    }

    /**
     * Resolves a service name to its endpoint in the region, if available.
     *
     * @param service
     *            The service.
     * @return The endpoint for the given service, or empty if the service
     *         endpoint is not known.
     */
    public com.google.common /*Guava will be removed soon*/.base.Optional<String> getEndpoint(
            Service service) {
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
            return GuavaUtils.adaptToGuava(Optional.ofNullable(endpoint));
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

    // For backward compatibility maintain the enum toString behavior
    @Override
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
    public static Region valueOf(@Nonnull String name) throws IllegalArgumentException {
        if (name == null) {
            throw new java.lang.NullPointerException("name is marked non-null but is null");
        }
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
    public static Region register(@Nonnull String regionId, @Nonnull final Realm realm) {
        if (regionId == null) {
            throw new java.lang.NullPointerException("regionId is marked non-null but is null");
        }
        if (realm == null) {
            throw new java.lang.NullPointerException("realm is marked non-null but is null");
        }
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
            @Nonnull String regionId, @Nonnull final Realm realm, String regionCode) {
        if (regionId == null) {
            throw new java.lang.NullPointerException("regionId is marked non-null but is null");
        }
        if (realm == null) {
            throw new java.lang.NullPointerException("realm is marked non-null but is null");
        }

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
            return new Region(regionId, Optional.ofNullable(regionCode), realm);
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
     * Register all regions and sets status
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
     * Implements decision tree to determine Region.
     */
    private static Optional<Region> getRegionAndRegisterIfNecessary(String regionCodeOrId) {

        if (regionCodeOrId.contains("_")) {
            regionCodeOrId = NameUtils.decanonicalizeFromEnumTypes(regionCodeOrId);
        }

        Optional<Region> maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
        if (maybeRegion.isPresent()) {
            return maybeRegion; // already known
        }

        if (!hasUsedConfigFile) {
            readConfigFile(); // registers region and sets hasUsedConfigFile = true;
            maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
            if (maybeRegion.isPresent()) {
                return maybeRegion;
            }
        }

        if (!hasUsedEnvVar) {
            readEnvVar(); // registers region and sets hasUsedEnvVar = true;
            maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
            if (maybeRegion.isPresent()) {
                return maybeRegion;
            }
        }

        if (hasOptedForInstanceMetadataService && !hasUsedInstanceMetadataService) {
            registerFromInstanceMetadataService(); // registers region and sets hasUsedInstanceMetadataService = true;
            maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
            if (maybeRegion.isPresent()) {
                return maybeRegion;
            }
        }

        if (defaultRealmEnvVar != null && !StringUtils.isBlank(defaultRealmEnvVar)) {
            registerRegionWithDefaultRealm(regionCodeOrId);
            maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
            if (maybeRegion.isPresent()) {
                return maybeRegion;
            }
        }

        return Optional.empty();
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
     * Registers region using regionId and default realm env var
     */
    private static void registerRegionWithDefaultRealm(String regionId) {
        LOG.info(
                "Realm domain component from OCI_DEFAULT_REALM env variable is {}",
                defaultRealmEnvVar);
        final String trimmedDefaultRealm =
                defaultRealmEnvVar.replaceAll("\'", "").replaceAll("\"", "");
        final Realm defaultRealmFromEnvVar =
                Realm.register("defaultRealmFromEnv", trimmedDefaultRealm);
        LOG.info(
                "Unknown regionId '{}', default realm is defined, falling back to '{}'",
                regionId,
                trimmedDefaultRealm);
        if (defaultRealmFromEnvVar != null) {
            register(regionId, defaultRealmFromEnvVar);
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
            /*
             * If this method is called by multiple threads before the metadata service is used
             * to successfully get the region info, all those threads are blocked until the region
             * info is loaded.
             */
            lock.lock();
            //
            // while multiple threads were waiting for the lock, the first thread that entered
            // this block would have successfully loaded the regionInfo. So, perform the check
            // one more time and return the response from here itself, to load region info only
            // once
            //
            if (hasUsedInstanceMetadataService) {
                return hasReceivedInstanceMetadataServiceResponse;
            }

            enableInstanceMetadataService();

            LOG.info(
                    "Requesting region metadata blob from IMDS at {}",
                    getMetadataBaseUrl() + "instance/regionInfo");
            final String REGION_INFO = "regionInfo";
            String regionMetadataSchema =
                    AbstractFederationClientAuthenticationDetailsProviderBuilder.simpleRetry(
                            base ->
                                    base.path(REGION_INFO)
                                            .request(MediaType.APPLICATION_JSON)
                                            .header(AUTHORIZATION, AUTHORIZATION_HEADER_VALUE)
                                            .get(String.class),
                            getMetadataBaseUrl(),
                            REGION_INFO);

            hasReceivedInstanceMetadataServiceResponse = true;
            LOG.info("Region metadata blob from regionInfo service is {}", regionMetadataSchema);

            if (regionMetadataSchema != null && !regionMetadataSchema.isEmpty()) {
                RegionSchema regionSchema =
                        JsonConverter.jsonBlobToObject(regionMetadataSchema, RegionSchema.class);

                if (regionSchema != null && RegionSchema.isValid(regionSchema)) {
                    regionFromImds =
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
            lock.unlock();
            hasUsedInstanceMetadataService = true;
        }
        return hasReceivedInstanceMetadataServiceResponse;
    }

    private static String getMetadataBaseUrl() {
        if (!StringUtils.isBlank(METADATA_URL_OVERRIDE)) {
            LOG.info(
                    "Environment Variable OCI_METADATA_BASE_URL is present. Overriding default base url to: {}",
                    METADATA_URL_OVERRIDE);
            return METADATA_URL_OVERRIDE;
        } else {
            LOG.info(
                    "Environment Variable OCI_METADATA_BASE_URL is not present. Using default base url: {}",
                    METADATA_SERVICE_BASE_URL);
            return METADATA_SERVICE_BASE_URL;
        }
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Region)) return false;
        final Region other = (Region) o;
        final Object this$regionId = this.regionId;
        final Object other$regionId = other.regionId;
        if (this$regionId == null ? other$regionId != null : !this$regionId.equals(other$regionId))
            return false;
        final Object this$regionCode = this.getRegionCode();
        final Object other$regionCode = other.getRegionCode();
        if (this$regionCode == null
                ? other$regionCode != null
                : !this$regionCode.equals(other$regionCode)) return false;
        final Object this$realm = this.realm;
        final Object other$realm = other.realm;
        if (this$realm == null ? other$realm != null : !this$realm.equals(other$realm))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $regionId = this.regionId;
        result = result * PRIME + ($regionId == null ? 43 : $regionId.hashCode());
        final Object $regionCode = this.getRegionCode();
        result = result * PRIME + ($regionCode == null ? 43 : $regionCode.hashCode());
        final Object $realm = this.realm;
        result = result * PRIME + ($realm == null ? 43 : $realm.hashCode());
        return result;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public Realm getRealm() {
        return this.realm;
    }
}
