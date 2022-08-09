/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Description of FusionEnvironment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FusionEnvironment.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FusionEnvironment extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "maintenancePolicy",
        "timeUpcomingMaintenance",
        "compartmentId",
        "fusionEnvironmentFamilyId",
        "subscriptionIds",
        "fusionEnvironmentType",
        "kmsKeyId",
        "kmsKeyInfo",
        "domainId",
        "idcsDomainUrl",
        "appliedPatchBundles",
        "version",
        "publicUrl",
        "dnsPrefix",
        "additionalLanguagePacks",
        "refresh",
        "rules",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "systemName",
        "freeformTags",
        "definedTags"
    })
    public FusionEnvironment(
            String id,
            String displayName,
            GetMaintenancePolicyDetails maintenancePolicy,
            java.util.Date timeUpcomingMaintenance,
            String compartmentId,
            String fusionEnvironmentFamilyId,
            java.util.List<String> subscriptionIds,
            FusionEnvironmentType fusionEnvironmentType,
            String kmsKeyId,
            Object kmsKeyInfo,
            String domainId,
            String idcsDomainUrl,
            java.util.List<String> appliedPatchBundles,
            String version,
            String publicUrl,
            String dnsPrefix,
            java.util.List<String> additionalLanguagePacks,
            RefreshDetails refresh,
            java.util.List<Rule> rules,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String systemName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.maintenancePolicy = maintenancePolicy;
        this.timeUpcomingMaintenance = timeUpcomingMaintenance;
        this.compartmentId = compartmentId;
        this.fusionEnvironmentFamilyId = fusionEnvironmentFamilyId;
        this.subscriptionIds = subscriptionIds;
        this.fusionEnvironmentType = fusionEnvironmentType;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyInfo = kmsKeyInfo;
        this.domainId = domainId;
        this.idcsDomainUrl = idcsDomainUrl;
        this.appliedPatchBundles = appliedPatchBundles;
        this.version = version;
        this.publicUrl = publicUrl;
        this.dnsPrefix = dnsPrefix;
        this.additionalLanguagePacks = additionalLanguagePacks;
        this.refresh = refresh;
        this.rules = rules;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.systemName = systemName;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier that is immutable on creation
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier that is immutable on creation
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * FusionEnvironment Identifier, can be renamed
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * FusionEnvironment Identifier, can be renamed
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenancePolicy")
        private GetMaintenancePolicyDetails maintenancePolicy;

        public Builder maintenancePolicy(GetMaintenancePolicyDetails maintenancePolicy) {
            this.maintenancePolicy = maintenancePolicy;
            this.__explicitlySet__.add("maintenancePolicy");
            return this;
        }
        /**
         * The next maintenance for this environment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpcomingMaintenance")
        private java.util.Date timeUpcomingMaintenance;

        /**
         * The next maintenance for this environment
         * @param timeUpcomingMaintenance the value to set
         * @return this builder
         **/
        public Builder timeUpcomingMaintenance(java.util.Date timeUpcomingMaintenance) {
            this.timeUpcomingMaintenance = timeUpcomingMaintenance;
            this.__explicitlySet__.add("timeUpcomingMaintenance");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * FusionEnvironmentFamily Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentFamilyId")
        private String fusionEnvironmentFamilyId;

        /**
         * FusionEnvironmentFamily Identifier
         * @param fusionEnvironmentFamilyId the value to set
         * @return this builder
         **/
        public Builder fusionEnvironmentFamilyId(String fusionEnvironmentFamilyId) {
            this.fusionEnvironmentFamilyId = fusionEnvironmentFamilyId;
            this.__explicitlySet__.add("fusionEnvironmentFamilyId");
            return this;
        }
        /**
         * List of subscription IDs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
        private java.util.List<String> subscriptionIds;

        /**
         * List of subscription IDs.
         * @param subscriptionIds the value to set
         * @return this builder
         **/
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.subscriptionIds = subscriptionIds;
            this.__explicitlySet__.add("subscriptionIds");
            return this;
        }
        /**
         * Type of the FusionEnvironment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentType")
        private FusionEnvironmentType fusionEnvironmentType;

        /**
         * Type of the FusionEnvironment.
         * @param fusionEnvironmentType the value to set
         * @return this builder
         **/
        public Builder fusionEnvironmentType(FusionEnvironmentType fusionEnvironmentType) {
            this.fusionEnvironmentType = fusionEnvironmentType;
            this.__explicitlySet__.add("fusionEnvironmentType");
            return this;
        }
        /**
         * BYOK key id
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * BYOK key id
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * BYOK key info
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyInfo")
        private Object kmsKeyInfo;

        /**
         * BYOK key info
         * @param kmsKeyInfo the value to set
         * @return this builder
         **/
        public Builder kmsKeyInfo(Object kmsKeyInfo) {
            this.kmsKeyInfo = kmsKeyInfo;
            this.__explicitlySet__.add("kmsKeyInfo");
            return this;
        }
        /**
         * The IDCS domain created for the fusion instance
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainId")
        private String domainId;

        /**
         * The IDCS domain created for the fusion instance
         * @param domainId the value to set
         * @return this builder
         **/
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            this.__explicitlySet__.add("domainId");
            return this;
        }
        /**
         * The IDCS Domain URL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("idcsDomainUrl")
        private String idcsDomainUrl;

        /**
         * The IDCS Domain URL
         * @param idcsDomainUrl the value to set
         * @return this builder
         **/
        public Builder idcsDomainUrl(String idcsDomainUrl) {
            this.idcsDomainUrl = idcsDomainUrl;
            this.__explicitlySet__.add("idcsDomainUrl");
            return this;
        }
        /**
         * Patch bundle names
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appliedPatchBundles")
        private java.util.List<String> appliedPatchBundles;

        /**
         * Patch bundle names
         * @param appliedPatchBundles the value to set
         * @return this builder
         **/
        public Builder appliedPatchBundles(java.util.List<String> appliedPatchBundles) {
            this.appliedPatchBundles = appliedPatchBundles;
            this.__explicitlySet__.add("appliedPatchBundles");
            return this;
        }
        /**
         * Version of Fusion Apps used by this environment
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version of Fusion Apps used by this environment
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Public URL
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publicUrl")
        private String publicUrl;

        /**
         * Public URL
         * @param publicUrl the value to set
         * @return this builder
         **/
        public Builder publicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            this.__explicitlySet__.add("publicUrl");
            return this;
        }
        /**
         * DNS prefix
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsPrefix")
        private String dnsPrefix;

        /**
         * DNS prefix
         * @param dnsPrefix the value to set
         * @return this builder
         **/
        public Builder dnsPrefix(String dnsPrefix) {
            this.dnsPrefix = dnsPrefix;
            this.__explicitlySet__.add("dnsPrefix");
            return this;
        }
        /**
         * Language packs
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalLanguagePacks")
        private java.util.List<String> additionalLanguagePacks;

        /**
         * Language packs
         * @param additionalLanguagePacks the value to set
         * @return this builder
         **/
        public Builder additionalLanguagePacks(java.util.List<String> additionalLanguagePacks) {
            this.additionalLanguagePacks = additionalLanguagePacks;
            this.__explicitlySet__.add("additionalLanguagePacks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("refresh")
        private RefreshDetails refresh;

        public Builder refresh(RefreshDetails refresh) {
            this.refresh = refresh;
            this.__explicitlySet__.add("refresh");
            return this;
        }
        /**
         * Network Access Control Rules
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<Rule> rules;

        /**
         * Network Access Control Rules
         * @param rules the value to set
         * @return this builder
         **/
        public Builder rules(java.util.List<Rule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }
        /**
         * The time the the FusionEnvironment was created. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the FusionEnvironment was created. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the FusionEnvironment was updated. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the FusionEnvironment was updated. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the ServiceInstance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the ServiceInstance.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Environment Specific Guid/ System Name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemName")
        private String systemName;

        /**
         * Environment Specific Guid/ System Name
         * @param systemName the value to set
         * @return this builder
         **/
        public Builder systemName(String systemName) {
            this.systemName = systemName;
            this.__explicitlySet__.add("systemName");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FusionEnvironment build() {
            FusionEnvironment model =
                    new FusionEnvironment(
                            this.id,
                            this.displayName,
                            this.maintenancePolicy,
                            this.timeUpcomingMaintenance,
                            this.compartmentId,
                            this.fusionEnvironmentFamilyId,
                            this.subscriptionIds,
                            this.fusionEnvironmentType,
                            this.kmsKeyId,
                            this.kmsKeyInfo,
                            this.domainId,
                            this.idcsDomainUrl,
                            this.appliedPatchBundles,
                            this.version,
                            this.publicUrl,
                            this.dnsPrefix,
                            this.additionalLanguagePacks,
                            this.refresh,
                            this.rules,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.systemName,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FusionEnvironment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("maintenancePolicy")) {
                this.maintenancePolicy(model.getMaintenancePolicy());
            }
            if (model.wasPropertyExplicitlySet("timeUpcomingMaintenance")) {
                this.timeUpcomingMaintenance(model.getTimeUpcomingMaintenance());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fusionEnvironmentFamilyId")) {
                this.fusionEnvironmentFamilyId(model.getFusionEnvironmentFamilyId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionIds")) {
                this.subscriptionIds(model.getSubscriptionIds());
            }
            if (model.wasPropertyExplicitlySet("fusionEnvironmentType")) {
                this.fusionEnvironmentType(model.getFusionEnvironmentType());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyInfo")) {
                this.kmsKeyInfo(model.getKmsKeyInfo());
            }
            if (model.wasPropertyExplicitlySet("domainId")) {
                this.domainId(model.getDomainId());
            }
            if (model.wasPropertyExplicitlySet("idcsDomainUrl")) {
                this.idcsDomainUrl(model.getIdcsDomainUrl());
            }
            if (model.wasPropertyExplicitlySet("appliedPatchBundles")) {
                this.appliedPatchBundles(model.getAppliedPatchBundles());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("publicUrl")) {
                this.publicUrl(model.getPublicUrl());
            }
            if (model.wasPropertyExplicitlySet("dnsPrefix")) {
                this.dnsPrefix(model.getDnsPrefix());
            }
            if (model.wasPropertyExplicitlySet("additionalLanguagePacks")) {
                this.additionalLanguagePacks(model.getAdditionalLanguagePacks());
            }
            if (model.wasPropertyExplicitlySet("refresh")) {
                this.refresh(model.getRefresh());
            }
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("systemName")) {
                this.systemName(model.getSystemName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier that is immutable on creation
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * FusionEnvironment Identifier, can be renamed
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * FusionEnvironment Identifier, can be renamed
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenancePolicy")
    private final GetMaintenancePolicyDetails maintenancePolicy;

    public GetMaintenancePolicyDetails getMaintenancePolicy() {
        return maintenancePolicy;
    }

    /**
     * The next maintenance for this environment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpcomingMaintenance")
    private final java.util.Date timeUpcomingMaintenance;

    /**
     * The next maintenance for this environment
     * @return the value
     **/
    public java.util.Date getTimeUpcomingMaintenance() {
        return timeUpcomingMaintenance;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * FusionEnvironmentFamily Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentFamilyId")
    private final String fusionEnvironmentFamilyId;

    /**
     * FusionEnvironmentFamily Identifier
     * @return the value
     **/
    public String getFusionEnvironmentFamilyId() {
        return fusionEnvironmentFamilyId;
    }

    /**
     * List of subscription IDs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionIds")
    private final java.util.List<String> subscriptionIds;

    /**
     * List of subscription IDs.
     * @return the value
     **/
    public java.util.List<String> getSubscriptionIds() {
        return subscriptionIds;
    }

    /**
     * Type of the FusionEnvironment.
     **/
    public enum FusionEnvironmentType {
        Production("PRODUCTION"),
        Test("TEST"),
        Development("DEVELOPMENT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FusionEnvironmentType.class);

        private final String value;
        private static java.util.Map<String, FusionEnvironmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (FusionEnvironmentType v : FusionEnvironmentType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FusionEnvironmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FusionEnvironmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FusionEnvironmentType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of the FusionEnvironment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fusionEnvironmentType")
    private final FusionEnvironmentType fusionEnvironmentType;

    /**
     * Type of the FusionEnvironment.
     * @return the value
     **/
    public FusionEnvironmentType getFusionEnvironmentType() {
        return fusionEnvironmentType;
    }

    /**
     * BYOK key id
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * BYOK key id
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * BYOK key info
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyInfo")
    private final Object kmsKeyInfo;

    /**
     * BYOK key info
     * @return the value
     **/
    public Object getKmsKeyInfo() {
        return kmsKeyInfo;
    }

    /**
     * The IDCS domain created for the fusion instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainId")
    private final String domainId;

    /**
     * The IDCS domain created for the fusion instance
     * @return the value
     **/
    public String getDomainId() {
        return domainId;
    }

    /**
     * The IDCS Domain URL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsDomainUrl")
    private final String idcsDomainUrl;

    /**
     * The IDCS Domain URL
     * @return the value
     **/
    public String getIdcsDomainUrl() {
        return idcsDomainUrl;
    }

    /**
     * Patch bundle names
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appliedPatchBundles")
    private final java.util.List<String> appliedPatchBundles;

    /**
     * Patch bundle names
     * @return the value
     **/
    public java.util.List<String> getAppliedPatchBundles() {
        return appliedPatchBundles;
    }

    /**
     * Version of Fusion Apps used by this environment
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version of Fusion Apps used by this environment
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Public URL
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicUrl")
    private final String publicUrl;

    /**
     * Public URL
     * @return the value
     **/
    public String getPublicUrl() {
        return publicUrl;
    }

    /**
     * DNS prefix
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsPrefix")
    private final String dnsPrefix;

    /**
     * DNS prefix
     * @return the value
     **/
    public String getDnsPrefix() {
        return dnsPrefix;
    }

    /**
     * Language packs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalLanguagePacks")
    private final java.util.List<String> additionalLanguagePacks;

    /**
     * Language packs
     * @return the value
     **/
    public java.util.List<String> getAdditionalLanguagePacks() {
        return additionalLanguagePacks;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("refresh")
    private final RefreshDetails refresh;

    public RefreshDetails getRefresh() {
        return refresh;
    }

    /**
     * Network Access Control Rules
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<Rule> rules;

    /**
     * Network Access Control Rules
     * @return the value
     **/
    public java.util.List<Rule> getRules() {
        return rules;
    }

    /**
     * The time the the FusionEnvironment was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the FusionEnvironment was created. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the FusionEnvironment was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the FusionEnvironment was updated. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the ServiceInstance.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the ServiceInstance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the ServiceInstance.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Environment Specific Guid/ System Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemName")
    private final String systemName;

    /**
     * Environment Specific Guid/ System Name
     * @return the value
     **/
    public String getSystemName() {
        return systemName;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FusionEnvironment(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", maintenancePolicy=").append(String.valueOf(this.maintenancePolicy));
        sb.append(", timeUpcomingMaintenance=")
                .append(String.valueOf(this.timeUpcomingMaintenance));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fusionEnvironmentFamilyId=")
                .append(String.valueOf(this.fusionEnvironmentFamilyId));
        sb.append(", subscriptionIds=").append(String.valueOf(this.subscriptionIds));
        sb.append(", fusionEnvironmentType=").append(String.valueOf(this.fusionEnvironmentType));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyInfo=").append(String.valueOf(this.kmsKeyInfo));
        sb.append(", domainId=").append(String.valueOf(this.domainId));
        sb.append(", idcsDomainUrl=").append(String.valueOf(this.idcsDomainUrl));
        sb.append(", appliedPatchBundles=").append(String.valueOf(this.appliedPatchBundles));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", publicUrl=").append(String.valueOf(this.publicUrl));
        sb.append(", dnsPrefix=").append(String.valueOf(this.dnsPrefix));
        sb.append(", additionalLanguagePacks=")
                .append(String.valueOf(this.additionalLanguagePacks));
        sb.append(", refresh=").append(String.valueOf(this.refresh));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", systemName=").append(String.valueOf(this.systemName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FusionEnvironment)) {
            return false;
        }

        FusionEnvironment other = (FusionEnvironment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.maintenancePolicy, other.maintenancePolicy)
                && java.util.Objects.equals(
                        this.timeUpcomingMaintenance, other.timeUpcomingMaintenance)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.fusionEnvironmentFamilyId, other.fusionEnvironmentFamilyId)
                && java.util.Objects.equals(this.subscriptionIds, other.subscriptionIds)
                && java.util.Objects.equals(this.fusionEnvironmentType, other.fusionEnvironmentType)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyInfo, other.kmsKeyInfo)
                && java.util.Objects.equals(this.domainId, other.domainId)
                && java.util.Objects.equals(this.idcsDomainUrl, other.idcsDomainUrl)
                && java.util.Objects.equals(this.appliedPatchBundles, other.appliedPatchBundles)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.publicUrl, other.publicUrl)
                && java.util.Objects.equals(this.dnsPrefix, other.dnsPrefix)
                && java.util.Objects.equals(
                        this.additionalLanguagePacks, other.additionalLanguagePacks)
                && java.util.Objects.equals(this.refresh, other.refresh)
                && java.util.Objects.equals(this.rules, other.rules)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.systemName, other.systemName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenancePolicy == null ? 43 : this.maintenancePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpcomingMaintenance == null
                                ? 43
                                : this.timeUpcomingMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentFamilyId == null
                                ? 43
                                : this.fusionEnvironmentFamilyId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionIds == null ? 43 : this.subscriptionIds.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentType == null
                                ? 43
                                : this.fusionEnvironmentType.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result = (result * PRIME) + (this.kmsKeyInfo == null ? 43 : this.kmsKeyInfo.hashCode());
        result = (result * PRIME) + (this.domainId == null ? 43 : this.domainId.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsDomainUrl == null ? 43 : this.idcsDomainUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.appliedPatchBundles == null
                                ? 43
                                : this.appliedPatchBundles.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.publicUrl == null ? 43 : this.publicUrl.hashCode());
        result = (result * PRIME) + (this.dnsPrefix == null ? 43 : this.dnsPrefix.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalLanguagePacks == null
                                ? 43
                                : this.additionalLanguagePacks.hashCode());
        result = (result * PRIME) + (this.refresh == null ? 43 : this.refresh.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.systemName == null ? 43 : this.systemName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
