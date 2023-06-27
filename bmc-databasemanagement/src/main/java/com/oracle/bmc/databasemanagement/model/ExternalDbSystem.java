/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external DB system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExternalDbSystem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalDbSystem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "dbSystemDiscoveryId",
        "discoveryAgentId",
        "isCluster",
        "homeDirectory",
        "databaseManagementConfig",
        "stackMonitoringConfig",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated"
    })
    public ExternalDbSystem(
            String id,
            String displayName,
            String compartmentId,
            String dbSystemDiscoveryId,
            String discoveryAgentId,
            Boolean isCluster,
            String homeDirectory,
            ExternalDbSystemDatabaseManagementConfigDetails databaseManagementConfig,
            ExternalDbSystemStackMonitoringConfigDetails stackMonitoringConfig,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.dbSystemDiscoveryId = dbSystemDiscoveryId;
        this.discoveryAgentId = discoveryAgentId;
        this.isCluster = isCluster;
        this.homeDirectory = homeDirectory;
        this.databaseManagementConfig = databaseManagementConfig;
        this.stackMonitoringConfig = stackMonitoringConfig;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The user-friendly name for the DB system. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the DB system. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system discovery.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemDiscoveryId")
        private String dbSystemDiscoveryId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system discovery.
         *
         * @param dbSystemDiscoveryId the value to set
         * @return this builder
         */
        public Builder dbSystemDiscoveryId(String dbSystemDiscoveryId) {
            this.dbSystemDiscoveryId = dbSystemDiscoveryId;
            this.__explicitlySet__.add("dbSystemDiscoveryId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * management agent used during the discovery of the DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryAgentId")
        private String discoveryAgentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * management agent used during the discovery of the DB system.
         *
         * @param discoveryAgentId the value to set
         * @return this builder
         */
        public Builder discoveryAgentId(String discoveryAgentId) {
            this.discoveryAgentId = discoveryAgentId;
            this.__explicitlySet__.add("discoveryAgentId");
            return this;
        }
        /** Indicates whether the DB system is a cluster DB system or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
        private Boolean isCluster;

        /**
         * Indicates whether the DB system is a cluster DB system or not.
         *
         * @param isCluster the value to set
         * @return this builder
         */
        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            this.__explicitlySet__.add("isCluster");
            return this;
        }
        /**
         * The Oracle Grid home directory in case of cluster-based DB system and Oracle home
         * directory in case of single instance-based DB system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("homeDirectory")
        private String homeDirectory;

        /**
         * The Oracle Grid home directory in case of cluster-based DB system and Oracle home
         * directory in case of single instance-based DB system.
         *
         * @param homeDirectory the value to set
         * @return this builder
         */
        public Builder homeDirectory(String homeDirectory) {
            this.homeDirectory = homeDirectory;
            this.__explicitlySet__.add("homeDirectory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
        private ExternalDbSystemDatabaseManagementConfigDetails databaseManagementConfig;

        public Builder databaseManagementConfig(
                ExternalDbSystemDatabaseManagementConfigDetails databaseManagementConfig) {
            this.databaseManagementConfig = databaseManagementConfig;
            this.__explicitlySet__.add("databaseManagementConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringConfig")
        private ExternalDbSystemStackMonitoringConfigDetails stackMonitoringConfig;

        public Builder stackMonitoringConfig(
                ExternalDbSystemStackMonitoringConfigDetails stackMonitoringConfig) {
            this.stackMonitoringConfig = stackMonitoringConfig;
            this.__explicitlySet__.add("stackMonitoringConfig");
            return this;
        }
        /** The current lifecycle state of the external DB system resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the external DB system resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
        /** The date and time the external DB system was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the external DB system was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the external DB system was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the external DB system was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalDbSystem build() {
            ExternalDbSystem model =
                    new ExternalDbSystem(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.dbSystemDiscoveryId,
                            this.discoveryAgentId,
                            this.isCluster,
                            this.homeDirectory,
                            this.databaseManagementConfig,
                            this.stackMonitoringConfig,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalDbSystem model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbSystemDiscoveryId")) {
                this.dbSystemDiscoveryId(model.getDbSystemDiscoveryId());
            }
            if (model.wasPropertyExplicitlySet("discoveryAgentId")) {
                this.discoveryAgentId(model.getDiscoveryAgentId());
            }
            if (model.wasPropertyExplicitlySet("isCluster")) {
                this.isCluster(model.getIsCluster());
            }
            if (model.wasPropertyExplicitlySet("homeDirectory")) {
                this.homeDirectory(model.getHomeDirectory());
            }
            if (model.wasPropertyExplicitlySet("databaseManagementConfig")) {
                this.databaseManagementConfig(model.getDatabaseManagementConfig());
            }
            if (model.wasPropertyExplicitlySet("stackMonitoringConfig")) {
                this.stackMonitoringConfig(model.getStackMonitoringConfig());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name for the DB system. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the DB system. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system discovery.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemDiscoveryId")
    private final String dbSystemDiscoveryId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system discovery.
     *
     * @return the value
     */
    public String getDbSystemDiscoveryId() {
        return dbSystemDiscoveryId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * management agent used during the discovery of the DB system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryAgentId")
    private final String discoveryAgentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * management agent used during the discovery of the DB system.
     *
     * @return the value
     */
    public String getDiscoveryAgentId() {
        return discoveryAgentId;
    }

    /** Indicates whether the DB system is a cluster DB system or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
    private final Boolean isCluster;

    /**
     * Indicates whether the DB system is a cluster DB system or not.
     *
     * @return the value
     */
    public Boolean getIsCluster() {
        return isCluster;
    }

    /**
     * The Oracle Grid home directory in case of cluster-based DB system and Oracle home directory
     * in case of single instance-based DB system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("homeDirectory")
    private final String homeDirectory;

    /**
     * The Oracle Grid home directory in case of cluster-based DB system and Oracle home directory
     * in case of single instance-based DB system.
     *
     * @return the value
     */
    public String getHomeDirectory() {
        return homeDirectory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
    private final ExternalDbSystemDatabaseManagementConfigDetails databaseManagementConfig;

    public ExternalDbSystemDatabaseManagementConfigDetails getDatabaseManagementConfig() {
        return databaseManagementConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringConfig")
    private final ExternalDbSystemStackMonitoringConfigDetails stackMonitoringConfig;

    public ExternalDbSystemStackMonitoringConfigDetails getStackMonitoringConfig() {
        return stackMonitoringConfig;
    }

    /** The current lifecycle state of the external DB system resource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Inactive("INACTIVE"),

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
    /** The current lifecycle state of the external DB system resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the external DB system resource.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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

    /** The date and time the external DB system was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the external DB system was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the external DB system was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the external DB system was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ExternalDbSystem(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbSystemDiscoveryId=").append(String.valueOf(this.dbSystemDiscoveryId));
        sb.append(", discoveryAgentId=").append(String.valueOf(this.discoveryAgentId));
        sb.append(", isCluster=").append(String.valueOf(this.isCluster));
        sb.append(", homeDirectory=").append(String.valueOf(this.homeDirectory));
        sb.append(", databaseManagementConfig=")
                .append(String.valueOf(this.databaseManagementConfig));
        sb.append(", stackMonitoringConfig=").append(String.valueOf(this.stackMonitoringConfig));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalDbSystem)) {
            return false;
        }

        ExternalDbSystem other = (ExternalDbSystem) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbSystemDiscoveryId, other.dbSystemDiscoveryId)
                && java.util.Objects.equals(this.discoveryAgentId, other.discoveryAgentId)
                && java.util.Objects.equals(this.isCluster, other.isCluster)
                && java.util.Objects.equals(this.homeDirectory, other.homeDirectory)
                && java.util.Objects.equals(
                        this.databaseManagementConfig, other.databaseManagementConfig)
                && java.util.Objects.equals(this.stackMonitoringConfig, other.stackMonitoringConfig)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemDiscoveryId == null
                                ? 43
                                : this.dbSystemDiscoveryId.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryAgentId == null ? 43 : this.discoveryAgentId.hashCode());
        result = (result * PRIME) + (this.isCluster == null ? 43 : this.isCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.homeDirectory == null ? 43 : this.homeDirectory.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagementConfig == null
                                ? 43
                                : this.databaseManagementConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.stackMonitoringConfig == null
                                ? 43
                                : this.stackMonitoringConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
