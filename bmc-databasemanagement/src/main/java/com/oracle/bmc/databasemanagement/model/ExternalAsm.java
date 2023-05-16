/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external ASM. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExternalAsm.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalAsm extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "componentName",
        "compartmentId",
        "externalDbSystemId",
        "externalConnectorId",
        "gridHome",
        "isCluster",
        "isFlexEnabled",
        "lifecycleState",
        "lifecycleDetails",
        "servicedDatabases",
        "additionalDetails",
        "timeCreated",
        "timeUpdated",
        "version"
    })
    public ExternalAsm(
            String id,
            String displayName,
            String componentName,
            String compartmentId,
            String externalDbSystemId,
            String externalConnectorId,
            String gridHome,
            Boolean isCluster,
            Boolean isFlexEnabled,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<ExternalAsmServicedDatabase> servicedDatabases,
            java.util.Map<String, String> additionalDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String version) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.componentName = componentName;
        this.compartmentId = compartmentId;
        this.externalDbSystemId = externalDbSystemId;
        this.externalConnectorId = externalConnectorId;
        this.gridHome = gridHome;
        this.isCluster = isCluster;
        this.isFlexEnabled = isFlexEnabled;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.servicedDatabases = servicedDatabases;
        this.additionalDetails = additionalDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external ASM.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external ASM.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The user-friendly name for the external ASM. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the external ASM. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The name of the external ASM. */
        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        /**
         * The name of the external ASM.
         *
         * @param componentName the value to set
         * @return this builder
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
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
         * external DB system that the ASM is a part of.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDbSystemId")
        private String externalDbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external DB system that the ASM is a part of.
         *
         * @param externalDbSystemId the value to set
         * @return this builder
         */
        public Builder externalDbSystemId(String externalDbSystemId) {
            this.externalDbSystemId = externalDbSystemId;
            this.__explicitlySet__.add("externalDbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external connector.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalConnectorId")
        private String externalConnectorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * external connector.
         *
         * @param externalConnectorId the value to set
         * @return this builder
         */
        public Builder externalConnectorId(String externalConnectorId) {
            this.externalConnectorId = externalConnectorId;
            this.__explicitlySet__.add("externalConnectorId");
            return this;
        }
        /**
         * The directory in which ASM is installed. This is the same directory in which Oracle Grid
         * Infrastructure is installed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gridHome")
        private String gridHome;

        /**
         * The directory in which ASM is installed. This is the same directory in which Oracle Grid
         * Infrastructure is installed.
         *
         * @param gridHome the value to set
         * @return this builder
         */
        public Builder gridHome(String gridHome) {
            this.gridHome = gridHome;
            this.__explicitlySet__.add("gridHome");
            return this;
        }
        /** Indicates whether the ASM is a cluster ASM or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
        private Boolean isCluster;

        /**
         * Indicates whether the ASM is a cluster ASM or not.
         *
         * @param isCluster the value to set
         * @return this builder
         */
        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            this.__explicitlySet__.add("isCluster");
            return this;
        }
        /** Indicates whether Oracle Flex ASM is enabled or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFlexEnabled")
        private Boolean isFlexEnabled;

        /**
         * Indicates whether Oracle Flex ASM is enabled or not.
         *
         * @param isFlexEnabled the value to set
         * @return this builder
         */
        public Builder isFlexEnabled(Boolean isFlexEnabled) {
            this.isFlexEnabled = isFlexEnabled;
            this.__explicitlySet__.add("isFlexEnabled");
            return this;
        }
        /** The current lifecycle state of the external ASM. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the external ASM.
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
        /** The list of databases that are serviced by the ASM. */
        @com.fasterxml.jackson.annotation.JsonProperty("servicedDatabases")
        private java.util.List<ExternalAsmServicedDatabase> servicedDatabases;

        /**
         * The list of databases that are serviced by the ASM.
         *
         * @param servicedDatabases the value to set
         * @return this builder
         */
        public Builder servicedDatabases(
                java.util.List<ExternalAsmServicedDatabase> servicedDatabases) {
            this.servicedDatabases = servicedDatabases;
            this.__explicitlySet__.add("servicedDatabases");
            return this;
        }
        /**
         * The additional details of the external ASM defined in {@code {"key": "value"}} format.
         * Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * The additional details of the external ASM defined in {@code {"key": "value"}} format.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param additionalDetails the value to set
         * @return this builder
         */
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /** The date and time the external ASM was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the external ASM was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the external ASM was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the external ASM was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The ASM version. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The ASM version.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalAsm build() {
            ExternalAsm model =
                    new ExternalAsm(
                            this.id,
                            this.displayName,
                            this.componentName,
                            this.compartmentId,
                            this.externalDbSystemId,
                            this.externalConnectorId,
                            this.gridHome,
                            this.isCluster,
                            this.isFlexEnabled,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.servicedDatabases,
                            this.additionalDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalAsm model) {
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
            if (model.wasPropertyExplicitlySet("isCluster")) {
                this.isCluster(model.getIsCluster());
            }
            if (model.wasPropertyExplicitlySet("isFlexEnabled")) {
                this.isFlexEnabled(model.getIsFlexEnabled());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("servicedDatabases")) {
                this.servicedDatabases(model.getServicedDatabases());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
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
     * external ASM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external ASM.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The user-friendly name for the external ASM. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the external ASM. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The name of the external ASM. */
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * The name of the external ASM.
     *
     * @return the value
     */
    public String getComponentName() {
        return componentName;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system that the ASM is a part of.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDbSystemId")
    private final String externalDbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external DB system that the ASM is a part of.
     *
     * @return the value
     */
    public String getExternalDbSystemId() {
        return externalDbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external connector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalConnectorId")
    private final String externalConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * external connector.
     *
     * @return the value
     */
    public String getExternalConnectorId() {
        return externalConnectorId;
    }

    /**
     * The directory in which ASM is installed. This is the same directory in which Oracle Grid
     * Infrastructure is installed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gridHome")
    private final String gridHome;

    /**
     * The directory in which ASM is installed. This is the same directory in which Oracle Grid
     * Infrastructure is installed.
     *
     * @return the value
     */
    public String getGridHome() {
        return gridHome;
    }

    /** Indicates whether the ASM is a cluster ASM or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isCluster")
    private final Boolean isCluster;

    /**
     * Indicates whether the ASM is a cluster ASM or not.
     *
     * @return the value
     */
    public Boolean getIsCluster() {
        return isCluster;
    }

    /** Indicates whether Oracle Flex ASM is enabled or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFlexEnabled")
    private final Boolean isFlexEnabled;

    /**
     * Indicates whether Oracle Flex ASM is enabled or not.
     *
     * @return the value
     */
    public Boolean getIsFlexEnabled() {
        return isFlexEnabled;
    }

    /** The current lifecycle state of the external ASM. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        NotConnected("NOT_CONNECTED"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
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
    /** The current lifecycle state of the external ASM. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the external ASM.
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

    /** The list of databases that are serviced by the ASM. */
    @com.fasterxml.jackson.annotation.JsonProperty("servicedDatabases")
    private final java.util.List<ExternalAsmServicedDatabase> servicedDatabases;

    /**
     * The list of databases that are serviced by the ASM.
     *
     * @return the value
     */
    public java.util.List<ExternalAsmServicedDatabase> getServicedDatabases() {
        return servicedDatabases;
    }

    /**
     * The additional details of the external ASM defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * The additional details of the external ASM defined in {@code {"key": "value"}} format.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /** The date and time the external ASM was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the external ASM was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the external ASM was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the external ASM was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The ASM version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The ASM version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
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
        sb.append("ExternalAsm(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", componentName=").append(String.valueOf(this.componentName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", externalDbSystemId=").append(String.valueOf(this.externalDbSystemId));
        sb.append(", externalConnectorId=").append(String.valueOf(this.externalConnectorId));
        sb.append(", gridHome=").append(String.valueOf(this.gridHome));
        sb.append(", isCluster=").append(String.valueOf(this.isCluster));
        sb.append(", isFlexEnabled=").append(String.valueOf(this.isFlexEnabled));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", servicedDatabases=").append(String.valueOf(this.servicedDatabases));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalAsm)) {
            return false;
        }

        ExternalAsm other = (ExternalAsm) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.componentName, other.componentName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.externalDbSystemId, other.externalDbSystemId)
                && java.util.Objects.equals(this.externalConnectorId, other.externalConnectorId)
                && java.util.Objects.equals(this.gridHome, other.gridHome)
                && java.util.Objects.equals(this.isCluster, other.isCluster)
                && java.util.Objects.equals(this.isFlexEnabled, other.isFlexEnabled)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.servicedDatabases, other.servicedDatabases)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.version, other.version)
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
        result = (result * PRIME) + (this.isCluster == null ? 43 : this.isCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.isFlexEnabled == null ? 43 : this.isFlexEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.servicedDatabases == null ? 43 : this.servicedDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
