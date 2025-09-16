/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the Exadata Database Storage Vault. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExascaleDbStorageVault.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExascaleDbStorageVault
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "availabilityDomain",
        "lifecycleState",
        "displayName",
        "description",
        "timeCreated",
        "lifecycleDetails",
        "timeZone",
        "vmClusterIds",
        "vmClusterCount",
        "freeformTags",
        "definedTags",
        "exadataInfrastructureId",
        "systemTags",
        "highCapacityDatabaseStorage",
        "additionalFlashCacheInPercent",
        "clusterPlacementGroupId",
        "subscriptionId",
        "isAutoscaleEnabled",
        "autoscaleLimitInGBs",
        "attachedShapeAttributes"
    })
    public ExascaleDbStorageVault(
            String id,
            String compartmentId,
            String availabilityDomain,
            LifecycleState lifecycleState,
            String displayName,
            String description,
            java.util.Date timeCreated,
            String lifecycleDetails,
            String timeZone,
            java.util.List<String> vmClusterIds,
            Integer vmClusterCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String exadataInfrastructureId,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            ExascaleDbStorageDetails highCapacityDatabaseStorage,
            Integer additionalFlashCacheInPercent,
            String clusterPlacementGroupId,
            String subscriptionId,
            Boolean isAutoscaleEnabled,
            Integer autoscaleLimitInGBs,
            java.util.List<AttachedShapeAttributes> attachedShapeAttributes) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.lifecycleDetails = lifecycleDetails;
        this.timeZone = timeZone;
        this.vmClusterIds = vmClusterIds;
        this.vmClusterCount = vmClusterCount;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.exadataInfrastructureId = exadataInfrastructureId;
        this.systemTags = systemTags;
        this.highCapacityDatabaseStorage = highCapacityDatabaseStorage;
        this.additionalFlashCacheInPercent = additionalFlashCacheInPercent;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.subscriptionId = subscriptionId;
        this.isAutoscaleEnabled = isAutoscaleEnabled;
        this.autoscaleLimitInGBs = autoscaleLimitInGBs;
        this.attachedShapeAttributes = attachedShapeAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata Database Storage Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata Database Storage Vault.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name of the availability domain in which the Exadata Database Storage Vault is
         * located.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain in which the Exadata Database Storage Vault is
         * located.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** The current state of the Exadata Database Storage Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Exadata Database Storage Vault.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The user-friendly name for the Exadata Database Storage Vault. The name does not need to
         * be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the Exadata Database Storage Vault. The name does not need to
         * be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Exadata Database Storage Vault description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Exadata Database Storage Vault description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The date and time that the Exadata Database Storage Vault was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the Exadata Database Storage Vault was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time zone that you want to use for the Exadata Database Storage Vault. For details,
         * see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone that you want to use for the Exadata Database Storage Vault. For details,
         * see [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }
        /**
         * The List of Exadata VM cluster on Exascale Infrastructure
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) **Note:**
         * If Exadata Database Storage Vault is not used for any Exadata VM cluster on Exascale
         * Infrastructure, this list is empty.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterIds")
        private java.util.List<String> vmClusterIds;

        /**
         * The List of Exadata VM cluster on Exascale Infrastructure
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) **Note:**
         * If Exadata Database Storage Vault is not used for any Exadata VM cluster on Exascale
         * Infrastructure, this list is empty.
         *
         * @param vmClusterIds the value to set
         * @return this builder
         */
        public Builder vmClusterIds(java.util.List<String> vmClusterIds) {
            this.vmClusterIds = vmClusterIds;
            this.__explicitlySet__.add("vmClusterIds");
            return this;
        }
        /** The number of Exadata VM clusters used the Exadata Database Storage Vault. */
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterCount")
        private Integer vmClusterCount;

        /**
         * The number of Exadata VM clusters used the Exadata Database Storage Vault.
         *
         * @param vmClusterCount the value to set
         * @return this builder
         */
        public Builder vmClusterCount(Integer vmClusterCount) {
            this.vmClusterCount = vmClusterCount;
            this.__explicitlySet__.add("vmClusterCount");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata infrastructure.
         *
         * @param exadataInfrastructureId the value to set
         * @return this builder
         */
        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("highCapacityDatabaseStorage")
        private ExascaleDbStorageDetails highCapacityDatabaseStorage;

        public Builder highCapacityDatabaseStorage(
                ExascaleDbStorageDetails highCapacityDatabaseStorage) {
            this.highCapacityDatabaseStorage = highCapacityDatabaseStorage;
            this.__explicitlySet__.add("highCapacityDatabaseStorage");
            return this;
        }
        /** The size of additional Flash Cache in percentage of High Capacity database storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalFlashCacheInPercent")
        private Integer additionalFlashCacheInPercent;

        /**
         * The size of additional Flash Cache in percentage of High Capacity database storage.
         *
         * @param additionalFlashCacheInPercent the value to set
         * @return this builder
         */
        public Builder additionalFlashCacheInPercent(Integer additionalFlashCacheInPercent) {
            this.additionalFlashCacheInPercent = additionalFlashCacheInPercent;
            this.__explicitlySet__.add("additionalFlashCacheInPercent");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group of the Exadata Infrastructure or Db System.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cluster placement group of the Exadata Infrastructure or Db System.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * Indicates if autoscale feature is enabled for the Database Storage Vault. The default
         * value is {@code FALSE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoscaleEnabled")
        private Boolean isAutoscaleEnabled;

        /**
         * Indicates if autoscale feature is enabled for the Database Storage Vault. The default
         * value is {@code FALSE}.
         *
         * @param isAutoscaleEnabled the value to set
         * @return this builder
         */
        public Builder isAutoscaleEnabled(Boolean isAutoscaleEnabled) {
            this.isAutoscaleEnabled = isAutoscaleEnabled;
            this.__explicitlySet__.add("isAutoscaleEnabled");
            return this;
        }
        /**
         * Maximum limit storage size in gigabytes, that is applicable for the Database Storage
         * Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoscaleLimitInGBs")
        private Integer autoscaleLimitInGBs;

        /**
         * Maximum limit storage size in gigabytes, that is applicable for the Database Storage
         * Vault.
         *
         * @param autoscaleLimitInGBs the value to set
         * @return this builder
         */
        public Builder autoscaleLimitInGBs(Integer autoscaleLimitInGBs) {
            this.autoscaleLimitInGBs = autoscaleLimitInGBs;
            this.__explicitlySet__.add("autoscaleLimitInGBs");
            return this;
        }
        /**
         * The shapeAttribute of the Exadata VM cluster(s) associated with the Exadata Database
         * Storage Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attachedShapeAttributes")
        private java.util.List<AttachedShapeAttributes> attachedShapeAttributes;

        /**
         * The shapeAttribute of the Exadata VM cluster(s) associated with the Exadata Database
         * Storage Vault.
         *
         * @param attachedShapeAttributes the value to set
         * @return this builder
         */
        public Builder attachedShapeAttributes(
                java.util.List<AttachedShapeAttributes> attachedShapeAttributes) {
            this.attachedShapeAttributes = attachedShapeAttributes;
            this.__explicitlySet__.add("attachedShapeAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExascaleDbStorageVault build() {
            ExascaleDbStorageVault model =
                    new ExascaleDbStorageVault(
                            this.id,
                            this.compartmentId,
                            this.availabilityDomain,
                            this.lifecycleState,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.lifecycleDetails,
                            this.timeZone,
                            this.vmClusterIds,
                            this.vmClusterCount,
                            this.freeformTags,
                            this.definedTags,
                            this.exadataInfrastructureId,
                            this.systemTags,
                            this.highCapacityDatabaseStorage,
                            this.additionalFlashCacheInPercent,
                            this.clusterPlacementGroupId,
                            this.subscriptionId,
                            this.isAutoscaleEnabled,
                            this.autoscaleLimitInGBs,
                            this.attachedShapeAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExascaleDbStorageVault model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("vmClusterIds")) {
                this.vmClusterIds(model.getVmClusterIds());
            }
            if (model.wasPropertyExplicitlySet("vmClusterCount")) {
                this.vmClusterCount(model.getVmClusterCount());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("exadataInfrastructureId")) {
                this.exadataInfrastructureId(model.getExadataInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("highCapacityDatabaseStorage")) {
                this.highCapacityDatabaseStorage(model.getHighCapacityDatabaseStorage());
            }
            if (model.wasPropertyExplicitlySet("additionalFlashCacheInPercent")) {
                this.additionalFlashCacheInPercent(model.getAdditionalFlashCacheInPercent());
            }
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("isAutoscaleEnabled")) {
                this.isAutoscaleEnabled(model.getIsAutoscaleEnabled());
            }
            if (model.wasPropertyExplicitlySet("autoscaleLimitInGBs")) {
                this.autoscaleLimitInGBs(model.getAutoscaleLimitInGBs());
            }
            if (model.wasPropertyExplicitlySet("attachedShapeAttributes")) {
                this.attachedShapeAttributes(model.getAttachedShapeAttributes());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Database Storage Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata Database Storage Vault.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name of the availability domain in which the Exadata Database Storage Vault is located.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain in which the Exadata Database Storage Vault is located.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** The current state of the Exadata Database Storage Vault. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The current state of the Exadata Database Storage Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Exadata Database Storage Vault.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The user-friendly name for the Exadata Database Storage Vault. The name does not need to be
     * unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the Exadata Database Storage Vault. The name does not need to be
     * unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Exadata Database Storage Vault description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Exadata Database Storage Vault description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The date and time that the Exadata Database Storage Vault was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the Exadata Database Storage Vault was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time zone that you want to use for the Exadata Database Storage Vault. For details, see
     * [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone that you want to use for the Exadata Database Storage Vault. For details, see
     * [Time Zones](https://docs.oracle.com/iaas/Content/Database/References/timezones.htm).
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * The List of Exadata VM cluster on Exascale Infrastructure
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) **Note:** If
     * Exadata Database Storage Vault is not used for any Exadata VM cluster on Exascale
     * Infrastructure, this list is empty.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterIds")
    private final java.util.List<String> vmClusterIds;

    /**
     * The List of Exadata VM cluster on Exascale Infrastructure
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) **Note:** If
     * Exadata Database Storage Vault is not used for any Exadata VM cluster on Exascale
     * Infrastructure, this list is empty.
     *
     * @return the value
     */
    public java.util.List<String> getVmClusterIds() {
        return vmClusterIds;
    }

    /** The number of Exadata VM clusters used the Exadata Database Storage Vault. */
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterCount")
    private final Integer vmClusterCount;

    /**
     * The number of Exadata VM clusters used the Exadata Database Storage Vault.
     *
     * @return the value
     */
    public Integer getVmClusterCount() {
        return vmClusterCount;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    private final String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata infrastructure.
     *
     * @return the value
     */
    public String getExadataInfrastructureId() {
        return exadataInfrastructureId;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("highCapacityDatabaseStorage")
    private final ExascaleDbStorageDetails highCapacityDatabaseStorage;

    public ExascaleDbStorageDetails getHighCapacityDatabaseStorage() {
        return highCapacityDatabaseStorage;
    }

    /** The size of additional Flash Cache in percentage of High Capacity database storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalFlashCacheInPercent")
    private final Integer additionalFlashCacheInPercent;

    /**
     * The size of additional Flash Cache in percentage of High Capacity database storage.
     *
     * @return the value
     */
    public Integer getAdditionalFlashCacheInPercent() {
        return additionalFlashCacheInPercent;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group of the Exadata Infrastructure or Db System.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cluster placement group of the Exadata Infrastructure or Db System.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Indicates if autoscale feature is enabled for the Database Storage Vault. The default value
     * is {@code FALSE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoscaleEnabled")
    private final Boolean isAutoscaleEnabled;

    /**
     * Indicates if autoscale feature is enabled for the Database Storage Vault. The default value
     * is {@code FALSE}.
     *
     * @return the value
     */
    public Boolean getIsAutoscaleEnabled() {
        return isAutoscaleEnabled;
    }

    /**
     * Maximum limit storage size in gigabytes, that is applicable for the Database Storage Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoscaleLimitInGBs")
    private final Integer autoscaleLimitInGBs;

    /**
     * Maximum limit storage size in gigabytes, that is applicable for the Database Storage Vault.
     *
     * @return the value
     */
    public Integer getAutoscaleLimitInGBs() {
        return autoscaleLimitInGBs;
    }

    /** */
    public enum AttachedShapeAttributes implements com.oracle.bmc.http.internal.BmcEnum {
        SmartStorage("SMART_STORAGE"),
        BlockStorage("BLOCK_STORAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AttachedShapeAttributes.class);

        private final String value;
        private static java.util.Map<String, AttachedShapeAttributes> map;

        static {
            map = new java.util.HashMap<>();
            for (AttachedShapeAttributes v : AttachedShapeAttributes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AttachedShapeAttributes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttachedShapeAttributes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttachedShapeAttributes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The shapeAttribute of the Exadata VM cluster(s) associated with the Exadata Database Storage
     * Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedShapeAttributes")
    private final java.util.List<AttachedShapeAttributes> attachedShapeAttributes;

    /**
     * The shapeAttribute of the Exadata VM cluster(s) associated with the Exadata Database Storage
     * Vault.
     *
     * @return the value
     */
    public java.util.List<AttachedShapeAttributes> getAttachedShapeAttributes() {
        return attachedShapeAttributes;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExascaleDbStorageVault(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", vmClusterIds=").append(String.valueOf(this.vmClusterIds));
        sb.append(", vmClusterCount=").append(String.valueOf(this.vmClusterCount));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", exadataInfrastructureId=")
                .append(String.valueOf(this.exadataInfrastructureId));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", highCapacityDatabaseStorage=")
                .append(String.valueOf(this.highCapacityDatabaseStorage));
        sb.append(", additionalFlashCacheInPercent=")
                .append(String.valueOf(this.additionalFlashCacheInPercent));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", isAutoscaleEnabled=").append(String.valueOf(this.isAutoscaleEnabled));
        sb.append(", autoscaleLimitInGBs=").append(String.valueOf(this.autoscaleLimitInGBs));
        sb.append(", attachedShapeAttributes=")
                .append(String.valueOf(this.attachedShapeAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExascaleDbStorageVault)) {
            return false;
        }

        ExascaleDbStorageVault other = (ExascaleDbStorageVault) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.vmClusterIds, other.vmClusterIds)
                && java.util.Objects.equals(this.vmClusterCount, other.vmClusterCount)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.exadataInfrastructureId, other.exadataInfrastructureId)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(
                        this.highCapacityDatabaseStorage, other.highCapacityDatabaseStorage)
                && java.util.Objects.equals(
                        this.additionalFlashCacheInPercent, other.additionalFlashCacheInPercent)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.isAutoscaleEnabled, other.isAutoscaleEnabled)
                && java.util.Objects.equals(this.autoscaleLimitInGBs, other.autoscaleLimitInGBs)
                && java.util.Objects.equals(
                        this.attachedShapeAttributes, other.attachedShapeAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.vmClusterIds == null ? 43 : this.vmClusterIds.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterCount == null ? 43 : this.vmClusterCount.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInfrastructureId == null
                                ? 43
                                : this.exadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.highCapacityDatabaseStorage == null
                                ? 43
                                : this.highCapacityDatabaseStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalFlashCacheInPercent == null
                                ? 43
                                : this.additionalFlashCacheInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoscaleEnabled == null
                                ? 43
                                : this.isAutoscaleEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.autoscaleLimitInGBs == null
                                ? 43
                                : this.autoscaleLimitInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.attachedShapeAttributes == null
                                ? 43
                                : this.attachedShapeAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
