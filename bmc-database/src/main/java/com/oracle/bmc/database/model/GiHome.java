/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the Grid Infrastructure Home.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GiHome.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GiHome extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "isDefaultCreated",
        "isActive",
        "lifecycleState",
        "timeCreated",
        "homePath",
        "availableActions",
        "availableType",
        "lifecycleDetails",
        "giVersion",
        "giImageId",
        "timeUpdated",
        "dbSystemId",
        "definedTags",
        "freeformTags",
        "systemTags"
    })
    public GiHome(
            String id,
            String compartmentId,
            String displayName,
            Boolean isDefaultCreated,
            Boolean isActive,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String homePath,
            java.util.List<AvailableActions> availableActions,
            AvailableType availableType,
            String lifecycleDetails,
            String giVersion,
            String giImageId,
            java.util.Date timeUpdated,
            String dbSystemId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.isDefaultCreated = isDefaultCreated;
        this.isActive = isActive;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.homePath = homePath;
        this.availableActions = availableActions;
        this.availableType = availableType;
        this.lifecycleDetails = lifecycleDetails;
        this.giVersion = giVersion;
        this.giImageId = giImageId;
        this.timeUpdated = timeUpdated;
        this.dbSystemId = dbSystemId;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Grid Infrastructure Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Grid Infrastructure Home.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The user-provided name for the Grid Infrastructure Home. The name does not need to be unique and gets dynamically generated if null.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-provided name for the Grid Infrastructure Home. The name does not need to be unique and gets dynamically generated if null.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Indicates whether the grid infrastructure home is created by default.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultCreated")
        private Boolean isDefaultCreated;

        /**
         * Indicates whether the grid infrastructure home is created by default.
         * @param isDefaultCreated the value to set
         * @return this builder
         **/
        public Builder isDefaultCreated(Boolean isDefaultCreated) {
            this.isDefaultCreated = isDefaultCreated;
            this.__explicitlySet__.add("isDefaultCreated");
            return this;
        }
        /**
         * Indicates whether the Grid Infrastructure Home is currently active for the cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        /**
         * Indicates whether the Grid Infrastructure Home is currently active for the cluster.
         * @param isActive the value to set
         * @return this builder
         **/
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            this.__explicitlySet__.add("isActive");
            return this;
        }
        /**
         * The current state of the Grid Infrastructure Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Grid Infrastructure Home.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The time and date as an RFC3339 formatted string, e.g., 2024-04-11T01:59:07.032Z, when the grid infrastructure home was created
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time and date as an RFC3339 formatted string, e.g., 2024-04-11T01:59:07.032Z, when the grid infrastructure home was created
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The path of the Grid Infrastructure Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("homePath")
        private String homePath;

        /**
         * The path of the Grid Infrastructure Home.
         * @param homePath the value to set
         * @return this builder
         **/
        public Builder homePath(String homePath) {
            this.homePath = homePath;
            this.__explicitlySet__.add("homePath");
            return this;
        }
        /**
         * The possible Grid Infrastructure update actions that can be performed using this Grid Infrastructure Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableActions")
        private java.util.List<AvailableActions> availableActions;

        /**
         * The possible Grid Infrastructure update actions that can be performed using this Grid Infrastructure Home.
         * @param availableActions the value to set
         * @return this builder
         **/
        public Builder availableActions(java.util.List<AvailableActions> availableActions) {
            this.availableActions = availableActions;
            this.__explicitlySet__.add("availableActions");
            return this;
        }
        /**
         * The type of update that the Grid Infrastructure Home can be used for.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableType")
        private AvailableType availableType;

        /**
         * The type of update that the Grid Infrastructure Home can be used for.
         * @param availableType the value to set
         * @return this builder
         **/
        public Builder availableType(AvailableType availableType) {
            this.availableType = availableType;
            this.__explicitlySet__.add("availableType");
            return this;
        }
        /**
         * Additional information about the current lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
        private String giVersion;

        /**
         * A valid Oracle Grid Infrastructure (GI) software version.
         * @param giVersion the value to set
         * @return this builder
         **/
        public Builder giVersion(String giVersion) {
            this.giVersion = giVersion;
            this.__explicitlySet__.add("giVersion");
            return this;
        }
        /**
         * The grid infrastructure home image [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("giImageId")
        private String giImageId;

        /**
         * The grid infrastructure home image [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * @param giImageId the value to set
         * @return this builder
         **/
        public Builder giImageId(String giImageId) {
            this.giImageId = giImageId;
            this.__explicitlySet__.add("giImageId");
            return this;
        }
        /**
         * The time and date as an RFC3339 formatted string, e.g., 2024-04-11T01:59:07.032Z, when the grid infrastructure home was updated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time and date as an RFC3339 formatted string, e.g., 2024-04-11T01:59:07.032Z, when the grid infrastructure home was updated
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB system.
         * @param dbSystemId the value to set
         * @return this builder
         **/
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GiHome build() {
            GiHome model =
                    new GiHome(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.isDefaultCreated,
                            this.isActive,
                            this.lifecycleState,
                            this.timeCreated,
                            this.homePath,
                            this.availableActions,
                            this.availableType,
                            this.lifecycleDetails,
                            this.giVersion,
                            this.giImageId,
                            this.timeUpdated,
                            this.dbSystemId,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GiHome model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isDefaultCreated")) {
                this.isDefaultCreated(model.getIsDefaultCreated());
            }
            if (model.wasPropertyExplicitlySet("isActive")) {
                this.isActive(model.getIsActive());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("homePath")) {
                this.homePath(model.getHomePath());
            }
            if (model.wasPropertyExplicitlySet("availableActions")) {
                this.availableActions(model.getAvailableActions());
            }
            if (model.wasPropertyExplicitlySet("availableType")) {
                this.availableType(model.getAvailableType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("giVersion")) {
                this.giVersion(model.getGiVersion());
            }
            if (model.wasPropertyExplicitlySet("giImageId")) {
                this.giImageId(model.getGiImageId());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Grid Infrastructure Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Grid Infrastructure Home.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The user-provided name for the Grid Infrastructure Home. The name does not need to be unique and gets dynamically generated if null.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-provided name for the Grid Infrastructure Home. The name does not need to be unique and gets dynamically generated if null.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Indicates whether the grid infrastructure home is created by default.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultCreated")
    private final Boolean isDefaultCreated;

    /**
     * Indicates whether the grid infrastructure home is created by default.
     * @return the value
     **/
    public Boolean getIsDefaultCreated() {
        return isDefaultCreated;
    }

    /**
     * Indicates whether the Grid Infrastructure Home is currently active for the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    private final Boolean isActive;

    /**
     * Indicates whether the Grid Infrastructure Home is currently active for the cluster.
     * @return the value
     **/
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * The current state of the Grid Infrastructure Home.
     **/
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        Inactive("INACTIVE"),

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
     * The current state of the Grid Infrastructure Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Grid Infrastructure Home.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The time and date as an RFC3339 formatted string, e.g., 2024-04-11T01:59:07.032Z, when the grid infrastructure home was created
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time and date as an RFC3339 formatted string, e.g., 2024-04-11T01:59:07.032Z, when the grid infrastructure home was created
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The path of the Grid Infrastructure Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("homePath")
    private final String homePath;

    /**
     * The path of the Grid Infrastructure Home.
     * @return the value
     **/
    public String getHomePath() {
        return homePath;
    }

    /**
     **/
    public enum AvailableActions {
        Precheck("PRECHECK"),
        RollingApply("ROLLING_APPLY"),
        Retry("RETRY"),
        Rollback("ROLLBACK"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AvailableActions.class);

        private final String value;
        private static java.util.Map<String, AvailableActions> map;

        static {
            map = new java.util.HashMap<>();
            for (AvailableActions v : AvailableActions.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AvailableActions(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AvailableActions create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AvailableActions', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The possible Grid Infrastructure update actions that can be performed using this Grid Infrastructure Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableActions")
    private final java.util.List<AvailableActions> availableActions;

    /**
     * The possible Grid Infrastructure update actions that can be performed using this Grid Infrastructure Home.
     * @return the value
     **/
    public java.util.List<AvailableActions> getAvailableActions() {
        return availableActions;
    }

    /**
     * The type of update that the Grid Infrastructure Home can be used for.
     **/
    public enum AvailableType {
        GiUpgrade("GI_UPGRADE"),
        GiPatch("GI_PATCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AvailableType.class);

        private final String value;
        private static java.util.Map<String, AvailableType> map;

        static {
            map = new java.util.HashMap<>();
            for (AvailableType v : AvailableType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AvailableType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AvailableType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AvailableType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of update that the Grid Infrastructure Home can be used for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableType")
    private final AvailableType availableType;

    /**
     * The type of update that the Grid Infrastructure Home can be used for.
     * @return the value
     **/
    public AvailableType getAvailableType() {
        return availableType;
    }

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
    private final String giVersion;

    /**
     * A valid Oracle Grid Infrastructure (GI) software version.
     * @return the value
     **/
    public String getGiVersion() {
        return giVersion;
    }

    /**
     * The grid infrastructure home image [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("giImageId")
    private final String giImageId;

    /**
     * The grid infrastructure home image [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * @return the value
     **/
    public String getGiImageId() {
        return giImageId;
    }

    /**
     * The time and date as an RFC3339 formatted string, e.g., 2024-04-11T01:59:07.032Z, when the grid infrastructure home was updated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time and date as an RFC3339 formatted string, e.g., 2024-04-11T01:59:07.032Z, when the grid infrastructure home was updated
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB system.
     * @return the value
     **/
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("GiHome(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isDefaultCreated=").append(String.valueOf(this.isDefaultCreated));
        sb.append(", isActive=").append(String.valueOf(this.isActive));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", homePath=").append(String.valueOf(this.homePath));
        sb.append(", availableActions=").append(String.valueOf(this.availableActions));
        sb.append(", availableType=").append(String.valueOf(this.availableType));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(", giImageId=").append(String.valueOf(this.giImageId));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GiHome)) {
            return false;
        }

        GiHome other = (GiHome) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isDefaultCreated, other.isDefaultCreated)
                && java.util.Objects.equals(this.isActive, other.isActive)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.homePath, other.homePath)
                && java.util.Objects.equals(this.availableActions, other.availableActions)
                && java.util.Objects.equals(this.availableType, other.availableType)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.giImageId, other.giImageId)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultCreated == null ? 43 : this.isDefaultCreated.hashCode());
        result = (result * PRIME) + (this.isActive == null ? 43 : this.isActive.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.homePath == null ? 43 : this.homePath.hashCode());
        result =
                (result * PRIME)
                        + (this.availableActions == null ? 43 : this.availableActions.hashCode());
        result =
                (result * PRIME)
                        + (this.availableType == null ? 43 : this.availableType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result = (result * PRIME) + (this.giImageId == null ? 43 : this.giImageId.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
