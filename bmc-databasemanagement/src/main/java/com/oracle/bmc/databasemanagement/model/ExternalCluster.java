/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExternalCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalCluster extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "componentName",
        "compartmentId",
        "externalDbSystemId",
        "externalConnectorId",
        "gridHome",
        "isFlexCluster",
        "additionalDetails",
        "lifecycleState",
        "lifecycleDetails",
        "networkConfigurations",
        "vipConfigurations",
        "scanConfigurations",
        "ocrFileLocation",
        "timeCreated",
        "timeUpdated",
        "version",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ExternalCluster(
            String id,
            String displayName,
            String componentName,
            String compartmentId,
            String externalDbSystemId,
            String externalConnectorId,
            String gridHome,
            Boolean isFlexCluster,
            java.util.Map<String, String> additionalDetails,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<ExternalClusterNetworkConfiguration> networkConfigurations,
            java.util.List<ExternalClusterVipConfiguration> vipConfigurations,
            java.util.List<ExternalClusterScanListenerConfiguration> scanConfigurations,
            String ocrFileLocation,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String version,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.componentName = componentName;
        this.compartmentId = compartmentId;
        this.externalDbSystemId = externalDbSystemId;
        this.externalConnectorId = externalConnectorId;
        this.gridHome = gridHome;
        this.isFlexCluster = isFlexCluster;
        this.additionalDetails = additionalDetails;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.networkConfigurations = networkConfigurations;
        this.vipConfigurations = vipConfigurations;
        this.scanConfigurations = scanConfigurations;
        this.ocrFileLocation = ocrFileLocation;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.version = version;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external cluster.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The user-friendly name for the external cluster. The name does not have to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the external cluster. The name does not have to be unique.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The name of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        /**
         * The name of the external cluster.
         * @param componentName the value to set
         * @return this builder
         **/
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external DB system that the cluster is a part of.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalDbSystemId")
        private String externalDbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external DB system that the cluster is a part of.
         * @param externalDbSystemId the value to set
         * @return this builder
         **/
        public Builder externalDbSystemId(String externalDbSystemId) {
            this.externalDbSystemId = externalDbSystemId;
            this.__explicitlySet__.add("externalDbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external connector.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalConnectorId")
        private String externalConnectorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external connector.
         * @param externalConnectorId the value to set
         * @return this builder
         **/
        public Builder externalConnectorId(String externalConnectorId) {
            this.externalConnectorId = externalConnectorId;
            this.__explicitlySet__.add("externalConnectorId");
            return this;
        }
        /**
         * The directory in which Oracle Grid Infrastructure is installed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gridHome")
        private String gridHome;

        /**
         * The directory in which Oracle Grid Infrastructure is installed.
         * @param gridHome the value to set
         * @return this builder
         **/
        public Builder gridHome(String gridHome) {
            this.gridHome = gridHome;
            this.__explicitlySet__.add("gridHome");
            return this;
        }
        /**
         * Indicates whether the cluster is Oracle Flex Cluster or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFlexCluster")
        private Boolean isFlexCluster;

        /**
         * Indicates whether the cluster is Oracle Flex Cluster or not.
         * @param isFlexCluster the value to set
         * @return this builder
         **/
        public Builder isFlexCluster(Boolean isFlexCluster) {
            this.isFlexCluster = isFlexCluster;
            this.__explicitlySet__.add("isFlexCluster");
            return this;
        }
        /**
         * The additional details of the external cluster defined in {@code {"key": "value"}} format.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * The additional details of the external cluster defined in {@code {"key": "value"}} format.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param additionalDetails the value to set
         * @return this builder
         **/
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /**
         * The current lifecycle state of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the external cluster.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
         * The list of network address configurations of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkConfigurations")
        private java.util.List<ExternalClusterNetworkConfiguration> networkConfigurations;

        /**
         * The list of network address configurations of the external cluster.
         * @param networkConfigurations the value to set
         * @return this builder
         **/
        public Builder networkConfigurations(
                java.util.List<ExternalClusterNetworkConfiguration> networkConfigurations) {
            this.networkConfigurations = networkConfigurations;
            this.__explicitlySet__.add("networkConfigurations");
            return this;
        }
        /**
         * The list of Virtual IP (VIP) configurations of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vipConfigurations")
        private java.util.List<ExternalClusterVipConfiguration> vipConfigurations;

        /**
         * The list of Virtual IP (VIP) configurations of the external cluster.
         * @param vipConfigurations the value to set
         * @return this builder
         **/
        public Builder vipConfigurations(
                java.util.List<ExternalClusterVipConfiguration> vipConfigurations) {
            this.vipConfigurations = vipConfigurations;
            this.__explicitlySet__.add("vipConfigurations");
            return this;
        }
        /**
         * The list of Single Client Access Name (SCAN) configurations of the external cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scanConfigurations")
        private java.util.List<ExternalClusterScanListenerConfiguration> scanConfigurations;

        /**
         * The list of Single Client Access Name (SCAN) configurations of the external cluster.
         * @param scanConfigurations the value to set
         * @return this builder
         **/
        public Builder scanConfigurations(
                java.util.List<ExternalClusterScanListenerConfiguration> scanConfigurations) {
            this.scanConfigurations = scanConfigurations;
            this.__explicitlySet__.add("scanConfigurations");
            return this;
        }
        /**
         * The location of the Oracle Cluster Registry (OCR).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocrFileLocation")
        private String ocrFileLocation;

        /**
         * The location of the Oracle Cluster Registry (OCR).
         * @param ocrFileLocation the value to set
         * @return this builder
         **/
        public Builder ocrFileLocation(String ocrFileLocation) {
            this.ocrFileLocation = ocrFileLocation;
            this.__explicitlySet__.add("ocrFileLocation");
            return this;
        }
        /**
         * The date and time the external cluster was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the external cluster was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the external cluster was last updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the external cluster was last updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The cluster version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The cluster version.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * System tags can be viewed by users, but can only be created by the system.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public ExternalCluster build() {
            ExternalCluster model =
                    new ExternalCluster(
                            this.id,
                            this.displayName,
                            this.componentName,
                            this.compartmentId,
                            this.externalDbSystemId,
                            this.externalConnectorId,
                            this.gridHome,
                            this.isFlexCluster,
                            this.additionalDetails,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.networkConfigurations,
                            this.vipConfigurations,
                            this.scanConfigurations,
                            this.ocrFileLocation,
                            this.timeCreated,
                            this.timeUpdated,
                            this.version,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalCluster model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("externalDbSystemId")) {
                this.externalDbSystemId(model.getExternalDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("externalConnectorId")) {
                this.externalConnectorId(model.getExternalConnectorId());
            }
            if (model.wasPropertyExplicitlySet("gridHome")) {
                this.gridHome(model.getGridHome());
            }
            if (model.wasPropertyExplicitlySet("isFlexCluster")) {
                this.isFlexCluster(model.getIsFlexCluster());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("networkConfigurations")) {
                this.networkConfigurations(model.getNetworkConfigurations());
            }
            if (model.wasPropertyExplicitlySet("vipConfigurations")) {
                this.vipConfigurations(model.getVipConfigurations());
            }
            if (model.wasPropertyExplicitlySet("scanConfigurations")) {
                this.scanConfigurations(model.getScanConfigurations());
            }
            if (model.wasPropertyExplicitlySet("ocrFileLocation")) {
                this.ocrFileLocation(model.getOcrFileLocation());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external cluster.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The user-friendly name for the external cluster. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the external cluster. The name does not have to be unique.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The name of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * The name of the external cluster.
     * @return the value
     **/
    public String getComponentName() {
        return componentName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external DB system that the cluster is a part of.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDbSystemId")
    private final String externalDbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external DB system that the cluster is a part of.
     * @return the value
     **/
    public String getExternalDbSystemId() {
        return externalDbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external connector.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalConnectorId")
    private final String externalConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external connector.
     * @return the value
     **/
    public String getExternalConnectorId() {
        return externalConnectorId;
    }

    /**
     * The directory in which Oracle Grid Infrastructure is installed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gridHome")
    private final String gridHome;

    /**
     * The directory in which Oracle Grid Infrastructure is installed.
     * @return the value
     **/
    public String getGridHome() {
        return gridHome;
    }

    /**
     * Indicates whether the cluster is Oracle Flex Cluster or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFlexCluster")
    private final Boolean isFlexCluster;

    /**
     * Indicates whether the cluster is Oracle Flex Cluster or not.
     * @return the value
     **/
    public Boolean getIsFlexCluster() {
        return isFlexCluster;
    }

    /**
     * The additional details of the external cluster defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * The additional details of the external cluster defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * The current lifecycle state of the external cluster.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        NotConnected("NOT_CONNECTED"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
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
     * The current lifecycle state of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the external cluster.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
     * The list of network address configurations of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkConfigurations")
    private final java.util.List<ExternalClusterNetworkConfiguration> networkConfigurations;

    /**
     * The list of network address configurations of the external cluster.
     * @return the value
     **/
    public java.util.List<ExternalClusterNetworkConfiguration> getNetworkConfigurations() {
        return networkConfigurations;
    }

    /**
     * The list of Virtual IP (VIP) configurations of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vipConfigurations")
    private final java.util.List<ExternalClusterVipConfiguration> vipConfigurations;

    /**
     * The list of Virtual IP (VIP) configurations of the external cluster.
     * @return the value
     **/
    public java.util.List<ExternalClusterVipConfiguration> getVipConfigurations() {
        return vipConfigurations;
    }

    /**
     * The list of Single Client Access Name (SCAN) configurations of the external cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scanConfigurations")
    private final java.util.List<ExternalClusterScanListenerConfiguration> scanConfigurations;

    /**
     * The list of Single Client Access Name (SCAN) configurations of the external cluster.
     * @return the value
     **/
    public java.util.List<ExternalClusterScanListenerConfiguration> getScanConfigurations() {
        return scanConfigurations;
    }

    /**
     * The location of the Oracle Cluster Registry (OCR).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocrFileLocation")
    private final String ocrFileLocation;

    /**
     * The location of the Oracle Cluster Registry (OCR).
     * @return the value
     **/
    public String getOcrFileLocation() {
        return ocrFileLocation;
    }

    /**
     * The date and time the external cluster was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the external cluster was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the external cluster was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the external cluster was last updated.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The cluster version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The cluster version.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * System tags can be viewed by users, but can only be created by the system.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("ExternalCluster(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", componentName=").append(String.valueOf(this.componentName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", externalDbSystemId=").append(String.valueOf(this.externalDbSystemId));
        sb.append(", externalConnectorId=").append(String.valueOf(this.externalConnectorId));
        sb.append(", gridHome=").append(String.valueOf(this.gridHome));
        sb.append(", isFlexCluster=").append(String.valueOf(this.isFlexCluster));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", networkConfigurations=").append(String.valueOf(this.networkConfigurations));
        sb.append(", vipConfigurations=").append(String.valueOf(this.vipConfigurations));
        sb.append(", scanConfigurations=").append(String.valueOf(this.scanConfigurations));
        sb.append(", ocrFileLocation=").append(String.valueOf(this.ocrFileLocation));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalCluster)) {
            return false;
        }

        ExternalCluster other = (ExternalCluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.componentName, other.componentName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.externalDbSystemId, other.externalDbSystemId)
                && java.util.Objects.equals(this.externalConnectorId, other.externalConnectorId)
                && java.util.Objects.equals(this.gridHome, other.gridHome)
                && java.util.Objects.equals(this.isFlexCluster, other.isFlexCluster)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.networkConfigurations, other.networkConfigurations)
                && java.util.Objects.equals(this.vipConfigurations, other.vipConfigurations)
                && java.util.Objects.equals(this.scanConfigurations, other.scanConfigurations)
                && java.util.Objects.equals(this.ocrFileLocation, other.ocrFileLocation)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
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
                        + (this.componentName == null ? 43 : this.componentName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDbSystemId == null
                                ? 43
                                : this.externalDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalConnectorId == null
                                ? 43
                                : this.externalConnectorId.hashCode());
        result = (result * PRIME) + (this.gridHome == null ? 43 : this.gridHome.hashCode());
        result =
                (result * PRIME)
                        + (this.isFlexCluster == null ? 43 : this.isFlexCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfigurations == null
                                ? 43
                                : this.networkConfigurations.hashCode());
        result =
                (result * PRIME)
                        + (this.vipConfigurations == null ? 43 : this.vipConfigurations.hashCode());
        result =
                (result * PRIME)
                        + (this.scanConfigurations == null
                                ? 43
                                : this.scanConfigurations.hashCode());
        result =
                (result * PRIME)
                        + (this.ocrFileLocation == null ? 43 : this.ocrFileLocation.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
