/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.HttpResponse;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.internal.SyncFutureWaiter;
import com.oracle.bmc.internal.Alloy;
import com.oracle.bmc.internal.EndpointBuilder;
import com.oracle.bmc.model.RegionAlloySchema;
import com.oracle.bmc.model.RegionSchema;
import com.oracle.bmc.model.internal.JsonConverter;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.util.internal.FileUtils;
import com.oracle.bmc.util.internal.NameUtils;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.waiter.ExponentialBackoffDelayStrategyWithJitter;
import com.oracle.bmc.waiter.WaiterConfiguration;
import org.slf4j.Logger;

import jakarta.annotation.Nonnull;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.Collectors;

import static com.oracle.bmc.auth.AbstractFederationClientAuthenticationDetailsProviderBuilder.AUTHORIZATION_HEADER_VALUE;
import static com.oracle.bmc.auth.AbstractFederationClientAuthenticationDetailsProviderBuilder.METADATA_SERVICE_BASE_URL;
import static com.oracle.bmc.http.internal.HeaderUtils.AUTHORIZATION_HEADER_NAME;
import static com.oracle.bmc.http.internal.HeaderUtils.MEDIA_TYPE_APPLICATION_JSON;

/**
 * Class containing all of the known Regions that can be contacted.
 *
 * <p>Note, not all services may be available in all regions.
 */
public final class Region implements Serializable, Comparable<Region> {
    // Region metadata env attribute key
    private static final String OCI_REGION_METADATA_ENV_VAR_NAME = "OCI_REGION_METADATA";

    // Default realm metadata env attribute key
    private static final String OCI_DEFAULT_REALM_ENV_VAR_NAME = "OCI_DEFAULT_REALM";

    // The regions-config file path location
    private static final String REGIONS_CONFIG_FILE_PATH = "~/.oci/regions-config.json";

    // alloyProvider name from alloy-config.json
    private static volatile String OCI_ALLOY_CONFIG_PROVIDER;

    // Default Oci alloy region coexist
    private static volatile boolean IS_ALLOY_REGION_COEXIST_ENABLED = false;

    // LinkedHashMap to ensure stable ordering of registered regions
    private static final Map<String, Region> KNOWN_REGIONS = new LinkedHashMap<>();

    // LinkedHashMap to ensure stable ordering of registered Alloy regions
    private static final Map<String, Region> ALLOY_REGIONS = new LinkedHashMap<>();

    // LinkedHashMap to ensure stable ordering of the registered regions
    private static final Map<String, Region> ALL_REGIONS = new LinkedHashMap<>();

    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(Region.class);
    private static volatile boolean hasUsedEnvVar = false;
    private static volatile boolean hasUsedConfigFile = false;
    private static volatile boolean hasUsedAlloyConfigFile = false;
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static final Lock readLock = lock.readLock();
    private static final Lock writeLock = lock.writeLock();
    @VisibleForTesting static volatile boolean hasUsedInstanceMetadataService = false;
    private static volatile boolean hasOptedForInstanceMetadataService = false;
    private static volatile boolean hasReceivedInstanceMetadataServiceResponse = false;
    private static volatile boolean hasWarnedAboutValuesWithoutInstanceMetadataService = false;

    @VisibleForTesting static volatile String defaultRealmEnvVar = getDefaultRealmFromEnv();

    private static String getDefaultRealmFromEnv() {
        final String defaultRealmEnvVar = System.getenv(OCI_DEFAULT_REALM_ENV_VAR_NAME);
        return defaultRealmEnvVar;
    }

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

    private static final Map<String, Map<Region, String>> SERVICE_TO_REGION_ENDPOINTS =
            new HashMap<>();

    private static final Set<String> OCI_SDK_ENABLED_SERVICES_SET = new HashSet<>();

    private static final long serialVersionUID = -905384972L;

    /**
     * The region identifier as defined in
     * https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm
     */
    private final String regionId;

    /**
     * The region key as defined in
     * https://docs.cloud.oracle.com/iaas/Content/General/Concepts/regions.htm or null if none.
     *
     * <p>Not using Optional<String> here, since that is not serializable.
     */
    private final String regionCode;

    /** Get the realm this region belongs to. */
    private final Realm realm;

    private Region(
            @Nonnull String regionId, @Nonnull Optional<String> regionCode, @Nonnull Realm realm) {
        this(regionId, regionCode, realm, false);
    }

    private Region(
            @Nonnull String regionId,
            @Nonnull Optional<String> regionCode,
            @Nonnull Realm realm,
            boolean isAlloyRegion) {
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
        writeLock.lock();
        try {
            // The field name is named after the regionId, but follows enum naming convention.
            // For backwards compatibility, we keep track of the enum-named field.
            if (isAlloyRegion) {
                ALLOY_REGIONS.put(NameUtils.canonicalizeForEnumTypes(regionId), this);
            } else {
                KNOWN_REGIONS.put(NameUtils.canonicalizeForEnumTypes(regionId), this);
            }
            ALL_REGIONS.put(NameUtils.canonicalizeForEnumTypes(regionId), this);
        } finally {
            writeLock.unlock();
        }
    }

    public static Region getRegionFromImds() {
        return Region.regionFromImds;
    }

    /** Get the region code. */
    public String getRegionCode() {
        return regionCode != null ? regionCode : regionId;
    }

    /**
     * Resolves a service name to its endpoint in the region, if available.
     *
     * @param service The service.
     * @return The endpoint for the given service, or empty if the service endpoint is not known.
     */
    public Optional<String> getEndpoint(Service service) {
        writeLock.lock();
        try {
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
            return Optional.ofNullable(endpoint);
        } finally {
            writeLock.unlock();
        }
    }

    /**
     * Compares to regions lexicographically based on their regionId.
     *
     * @param other The Region to be compared.
     * @return the value {@code 0} if the regionId of the compared Region is equal to the regionId
     *     of this Region; a value less than {@code 0} if the regionId of this Region is
     *     lexicographically less than the regionId of the compared Region; and a value greater than
     *     {@code 0} if the regionId of this Region is lexicographically greater than the regionId
     *     of the compared Region.
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
     * Return all known Regions in this version of the SDK, except possibly the region returned by
     * IMDS (Instance Metadata Service, only available on OCI instances), since IMDS is not
     * automatically contacted by this method.
     *
     * <p>To ensure that this method also returns the region provided by IMDS, call {@link
     * Region#registerFromInstanceMetadataService()} explicitly before calling {@link
     * Region#values()}.
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
        readLock.lock();
        try {
            if (Alloy.doesAlloyConfigExist()) {
                // Recheck state because another thread might have acquired lock.
                if (Alloy.shouldUseOnlyAlloyRegions()) {
                    return ALLOY_REGIONS.values().toArray(new Region[ALLOY_REGIONS.size()]);
                }
                return ALL_REGIONS.values().toArray(new Region[ALL_REGIONS.size()]);
            }
            return KNOWN_REGIONS.values().toArray(new Region[KNOWN_REGIONS.size()]);
        } finally {
            readLock.unlock();
        }
    }

    /**
     * Returns the Region object matching the specified name. The name must match exactly.
     * (Extraneous whitespace characters are not permitted.)
     *
     * @param name The name of the region
     * @return The Region object matching the specified name, if available.
     * @throws IllegalArgumentException if no region exists with the specified name
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
     *
     * <p>Note, the regionId is not validated against known regions, this just creates a URL that
     * follows the default format.
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
     * <p>Note, the regionId is not validated against known regions, this just creates a URL that
     * follows the default format.
     *
     * <p>This method uses a realm of {@link Realm#OC1} if the region cannot be determined.
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
     * @param regionId The region ID.
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
     * Returns the Region object from the public region code. Throws IllegalArgumentException if the
     * region code is not known.
     *
     * @param regionCode The region code.
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
     * Returns the Region object from the public region code or id. Throws IllegalArgumentException
     * if the region code or id is not known.
     *
     * @param regionCodeOrId The region code or id.
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
     * Register a new region. Used to allow the SDK to be forward compatible with unreleased
     * regions.
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
     * Register a new region. Used to allow the SDK to be forward compatible with unreleased
     * regions.
     *
     * @param regionId The region ID.
     * @param realm The realm of the new region.
     * @param regionCode The 3-letter region code returned by the instance metadata service as the
     *     'region' value, if it differs from regionId. This is only needed for very early regions.
     * @return The registered region (or existing one if found).
     */
    public static Region register(
            @Nonnull String regionId, @Nonnull final Realm realm, String regionCode) {
        return register(regionId, realm, regionCode, false);
    }

    /**
     * Register a new region. Used to allow the SDK to be forward compatible with unreleased
     * regions.
     *
     * @param regionId The region ID.
     * @param realm The realm of the new region.
     * @param regionCode The 3-letter region code returned by the instance metadata service as the
     *     'region' value, if it differs from regionId. This is only needed for very early regions.
     * @param isAlloyRegion 'true' if region is from alloy configuration.
     * @return The registered region (or existing one if found).
     */
    public static Region register(
            @Nonnull String regionId,
            @Nonnull final Realm realm,
            String regionCode,
            boolean isAlloyRegion) {
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

        Region region;
        readLock.lock();
        try {
            region = getRegion(regionId, realm, isAlloyRegion);
            if (region != null) {
                return region;
            }
        } finally {
            readLock.unlock();
        }
        writeLock.lock();
        try {
            // Recheck if the region exists because another thread might have acquired lock.
            region = getRegion(regionId, realm, isAlloyRegion);
            if (region != null) {
                return region;
            }
            if (regionCode != null) {
                regionCode = regionCode.trim().toLowerCase(Locale.US);
                if (regionCode.isEmpty()) {
                    regionCode = null;
                }
            }
            return new Region(regionId, Optional.ofNullable(regionCode), realm, isAlloyRegion);
        } finally {
            writeLock.unlock();
        }
    }

    private static Region getRegion(String regionId, Realm realm, boolean isAlloyRegion) {
        Region region;
        readLock.lock();
        try {
            if (isAlloyRegion) {
                region = getRegionFromMap(ALLOY_REGIONS, regionId, realm);
            } else {
                region = getRegionFromMap(KNOWN_REGIONS, regionId, realm);
            }
            return region;
        } finally {
            readLock.unlock();
        }
    }

    private static Region getRegionFromMap(
            Map<String, Region> regionMap, String regionId, Realm realm) {
        for (Region region : regionMap.values()) {
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
        return null;
    }

    private static java.util.Optional<Region> maybeFromRegionCodeOrIdWithoutRegistering(
            String regionCodeOrId) {
        readLock.lock();
        try {
            return KNOWN_REGIONS.values().stream()
                    .filter(
                            r ->
                                    r.getRegionCode().equalsIgnoreCase(regionCodeOrId)
                                            || r.regionId.equalsIgnoreCase(regionCodeOrId))
                    .findAny();
        } finally {
            readLock.unlock();
        }
    }

    private static java.util.Optional<Region> maybeFromAlloyRegionCodeOrIdWithoutRegistering(
            String regionCodeOrId) {
        readLock.lock();
        try {
            return ALLOY_REGIONS.values().stream()
                    .filter(
                            r ->
                                    r.getRegionCode().equalsIgnoreCase(regionCodeOrId)
                                            || r.regionId.equalsIgnoreCase(regionCodeOrId))
                    .findAny();
        } finally {
            readLock.unlock();
        }
    }

    /** Register all regions and sets status */
    private static void registerAllRegions() {

        if (Alloy.doesAlloyConfigExist()) {
            if (!hasUsedAlloyConfigFile) {
                readAlloyRegionConfigFile();
            }
            // Return with only the registered alloy regions if OCI_ALLOY_REGION_COEXIST is not set
            // to true
            if (!Alloy.isAlloyRegionCoexistEnabled()) {
                return;
            }
        }

        if (!hasUsedConfigFile) {
            readRegionConfigFile();
        }

        if (!hasUsedEnvVar) {
            readEnvVar();
        }
    }

    /** Implements decision tree to determine Region. */
    private static Optional<Region> getRegionAndRegisterIfNecessary(String regionCodeOrId) {

        if (regionCodeOrId.contains("_")) {
            regionCodeOrId = NameUtils.decanonicalizeFromEnumTypes(regionCodeOrId);
        }

        Optional<Region> maybeRegion;
        if (Alloy.doesAlloyConfigExist()) {
            if (!hasUsedAlloyConfigFile) {
                readAlloyRegionConfigFile(); // registers Alloy region and sets
            }
            maybeRegion = maybeFromAlloyRegionCodeOrIdWithoutRegistering(regionCodeOrId);
            if (maybeRegion.isPresent()) {
                return maybeRegion;
            } else if (!Alloy.isAlloyRegionCoexistEnabled()) {
                LOG.error(
                        "The region '{}' you're targeting is not declared in the '{}' Alloy configuration file. Please check if this is the correct region you're targeting or contact the '{}' cloud provider for help. If you want to target both OCI regions and '{}' regions, please set the OCI_PLC_REGION_COEXIST env var to true.",
                        regionCodeOrId,
                        Alloy.getAlloyConfigFilePath(),
                        OCI_ALLOY_CONFIG_PROVIDER,
                        OCI_ALLOY_CONFIG_PROVIDER);
                throw new IllegalArgumentException(
                        "Unknown regionId "
                                + regionCodeOrId
                                + ", region information not defined in Alloy configuration.");
            }
        }

        maybeRegion = maybeFromRegionCodeOrIdWithoutRegistering(regionCodeOrId);
        if (maybeRegion.isPresent()) {
            return maybeRegion; // already known
        }

        if (!hasUsedConfigFile) {
            readRegionConfigFile(); // registers region and sets hasUsedConfigFile = true;
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
            registerFromInstanceMetadataService(); // registers region and sets
            // hasUsedInstanceMetadataService = true;
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

    /** Registers region and sets envVarUsed status to true. */
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

    /** Registers region using regionId and default realm env var */
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

    /** Registers region and sets hasUsedConfigFile status to true. */
    private static void readRegionConfigFile() {
        hasUsedConfigFile = true;

        try {
            String content = getContentFromConfigFile(REGIONS_CONFIG_FILE_PATH);
            if (content == null || content.isEmpty()) {
                return;
            }

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
     * Registers region, sets hasUsedAlloyConfigFile status to true and stores the alloy enabled
     * services to OCI_SDK_ENABLED_SERVICES_SET.
     */
    private static void readAlloyRegionConfigFile() {
        hasUsedAlloyConfigFile = true;

        try {
            String content = getContentFromConfigFile(Alloy.getAlloyConfigFilePath());

            if (content == null || content.isEmpty()) {
                return;
            }

            RegionAlloySchema regionAlloySchema =
                    JsonConverter.jsonBlobToObject(content, RegionAlloySchema.class);

            List<RegionSchema> regionSchemas = regionAlloySchema.getRegions();

            if (regionSchemas != null && regionSchemas.size() != 0) {
                for (RegionSchema regionSchema : regionSchemas) {

                    if (regionSchema != null && RegionSchema.isValid(regionSchema)) {
                        Region.register(
                                regionSchema.getRegionIdentifier(),
                                Realm.register(
                                        regionSchema.getRealmKey(),
                                        regionSchema.getRealmDomainComponent(),
                                        true),
                                regionSchema.getRegionKey(),
                                true);
                    }
                }
            }
            if (regionAlloySchema.getProvider() != null) {
                OCI_ALLOY_CONFIG_PROVIDER = regionAlloySchema.getProvider();
            }
            if (regionAlloySchema.getOciRegionCoexist() != null) {
                IS_ALLOY_REGION_COEXIST_ENABLED =
                        StringUtils.equalsIgnoreCase(
                                regionAlloySchema.getOciRegionCoexist(), "true");
                LOG.info(
                        "ociRegionCoexist is set to '{}' in the Alloy configuration file {}",
                        IS_ALLOY_REGION_COEXIST_ENABLED,
                        Paths.get(FileUtils.expandUserHome(Alloy.getAlloyConfigFilePath())));
            }
            writeLock.lock();
            try {
                OCI_SDK_ENABLED_SERVICES_SET.addAll(
                        regionAlloySchema.getServices().stream()
                                .map(str -> str.toLowerCase())
                                .map(str -> str.replaceAll("[^a-z]", ""))
                                .collect(Collectors.toSet()));
            } finally {
                writeLock.unlock();
            }

        } catch (Exception e) {
            LOG.warn(
                    "Exception in reading or parsing {} to fetch config from the Alloy configuration file ",
                    Paths.get(FileUtils.expandUserHome(Alloy.getAlloyConfigFilePath())),
                    e);
        }
    }

    private static String getContentFromConfigFile(String regionsConfigFilePath) {

        try {
            File file = new File(FileUtils.expandUserHome(regionsConfigFilePath));
            if (!file.isFile()) {
                LOG.info(
                        "Config file not found to fetch regions at {} ",
                        Paths.get(FileUtils.expandUserHome(regionsConfigFilePath)));
                return null;
            }

            String content =
                    new String(
                            Files.readAllBytes(
                                    Paths.get(FileUtils.expandUserHome(regionsConfigFilePath))),
                            StandardCharsets.UTF_8);
            LOG.debug("Region schemas from {} are {}", regionsConfigFilePath, content);
            return content;
        } catch (Exception e) {
            LOG.warn(
                    "Exception in reading or parsing {} to fetch config from the configuration file ",
                    Paths.get(FileUtils.expandUserHome(regionsConfigFilePath)),
                    e);
        }
        return null;
    }

    /**
     * Enables contact to IMDS (Instance Metadata Service, only available on OCI instances) if user
     * decides to opt-in.
     */
    public static void enableInstanceMetadataService() {
        hasOptedForInstanceMetadataService = true;
    }

    /**
     * Instructs the SDK to not contact the IMDS (Instance Metadata Service, only available on OCI
     * instances).
     */
    public static void skipInstanceMetadataService() {
        hasUsedInstanceMetadataService = true;
        hasOptedForInstanceMetadataService = false;
    }

    /**
     * Send request to IMDS (Instance Metadata Service, only available on OCI instances), registers
     * region, and sets hasUsedInstanceMetadataService = true.
     *
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
            writeLock.lock();
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
            Region result = getRegionFromImds(METADATA_SERVICE_BASE_URL);
            if (result != null) {
                regionFromImds = result;
            }
            hasReceivedInstanceMetadataServiceResponse = true;
        } catch (RuntimeException e) {
            LOG.warn("Rest call to get regionInfo from metadata service failed ", e);
        } finally {
            writeLock.unlock();
            hasUsedInstanceMetadataService = true;
        }
        return hasReceivedInstanceMetadataServiceResponse;
    }

    /**
     * If Alloy config exists, read the config and check if service is enabled. If Alloy config
     * doesn't exist, return true.
     *
     * @param serviceName
     * @return true if service is enabled or else false.
     */
    public static boolean isServiceEnabled(String serviceName) {
        writeLock.lock();
        try {
            if (!hasUsedAlloyConfigFile
                    && Alloy.doesAlloyConfigExist()
                    && OCI_SDK_ENABLED_SERVICES_SET.isEmpty()) {
                readAlloyRegionConfigFile();
            }

            if (OCI_SDK_ENABLED_SERVICES_SET.isEmpty()) {
                return true;
            }

            return OCI_SDK_ENABLED_SERVICES_SET.contains(serviceName.toLowerCase());
        } finally {
            writeLock.unlock();
        }
    }

    @InternalSdk
    @VisibleForTesting
    static void resetAlloyConfiguration() {
        writeLock.lock();
        try {
            ALL_REGIONS
                    .keySet()
                    .removeIf(
                            key ->
                                    (ALLOY_REGIONS.containsKey(key)
                                            && !KNOWN_REGIONS.containsKey(key)));
            ALLOY_REGIONS.clear();
            Realm.clearAlloyRealms();
            hasUsedAlloyConfigFile = false;
            OCI_SDK_ENABLED_SERVICES_SET.clear();
            hasUsedEnvVar = false;
            IS_ALLOY_REGION_COEXIST_ENABLED = false;
            Alloy.resetAlloyRegionCoexistStatus();
        } finally {
            writeLock.unlock();
        }
    }

    @InternalSdk
    @VisibleForTesting
    public static Region getRegionFromImds(String metadataServiceBaseUrl) {
        LOG.info(
                "Requesting region metadata blob from IMDS at {}",
                metadataServiceBaseUrl + "instance/regionInfo");

        String regionMetadataSchema = null;
        Throwable lastException = null;
        try (HttpClient client =
                HttpProvider.getDefault()
                        .newBuilder()
                        .property(StandardClientProperties.ASYNC_POOL_SIZE, 1)
                        .property(StandardClientProperties.READ_TIMEOUT, Duration.ofSeconds(60))
                        .property(StandardClientProperties.CONNECT_TIMEOUT, Duration.ofSeconds(30))
                        .baseUri(URI.create(metadataServiceBaseUrl + "instance/"))
                        .build()) {

            ExponentialBackoffDelayStrategyWithJitter strategy =
                    new ExponentialBackoffDelayStrategyWithJitter(TimeUnit.SECONDS.toMillis(100));
            WaiterConfiguration.WaitContext context =
                    new WaiterConfiguration.WaitContext(System.currentTimeMillis());

            for (int retry = 0; retry < 8; retry++) {
                try {
                    SyncFutureWaiter waiter = new SyncFutureWaiter();

                    try (HttpResponse response =
                            waiter.listenForResult(
                                    client.createRequest(Method.GET)
                                            .offloadExecutor(waiter)
                                            .appendPathPart("regionInfo")
                                            .header("Accept", MEDIA_TYPE_APPLICATION_JSON)
                                            .header(
                                                    AUTHORIZATION_HEADER_NAME,
                                                    AUTHORIZATION_HEADER_VALUE)
                                            .execute())) {
                        if (response.status() >= 300) {
                            throw new IOException("Bad response status code " + response.status());
                        }
                        regionMetadataSchema = waiter.listenForResult(response.textBody());
                        break;
                    }
                } catch (Throwable e) {
                    LOG.warn(
                            "Attempt {} - Rest call to get region info from metadata service failed ",
                            (retry + 1),
                            e);
                    lastException = e;
                    try {
                        long waitTime = strategy.nextDelay(context);
                        Thread.sleep(waitTime);
                        context.incrementAttempts();
                        LOG.info(
                                "Exiting retry {} with wait time: {} millis",
                                (retry + 1),
                                waitTime);
                    } catch (InterruptedException interruptedException) {
                        LOG.debug(
                                "Thread interrupted while waiting to make next call to get region info from instance metadata service",
                                interruptedException);
                        Thread.currentThread().interrupt();
                        break;
                    }
                }
            }
        }

        if (regionMetadataSchema == null && lastException != null) {
            if (lastException instanceof RuntimeException) {
                throw (RuntimeException) lastException;
            } else {
                throw new RuntimeException(lastException);
            }
        }

        LOG.info("Region metadata blob from regionInfo service is {}", regionMetadataSchema);

        if (regionMetadataSchema != null && !regionMetadataSchema.isEmpty()) {
            RegionSchema regionSchema =
                    JsonConverter.jsonBlobToObject(regionMetadataSchema, RegionSchema.class);

            if (regionSchema != null && RegionSchema.isValid(regionSchema)) {
                return Region.register(
                        regionSchema.getRegionIdentifier(),
                        Realm.register(
                                regionSchema.getRealmKey(), regionSchema.getRealmDomainComponent()),
                        regionSchema.getRegionKey());
            }
        }
        return null;
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

    /** Return the Alloy region coexist status. */
    public static boolean isAlloyRegionCoexistEnabled() {
        return IS_ALLOY_REGION_COEXIST_ENABLED;
    }
}
