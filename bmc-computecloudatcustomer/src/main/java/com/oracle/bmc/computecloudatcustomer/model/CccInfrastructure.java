/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * The Oracle Cloud Infrastructure resource representing the connection to the hardware and software
 * located in a customer's data center running the Compute Cloud@Customer IaaS services. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CccInfrastructure.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CccInfrastructure
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "shortName",
        "displayName",
        "description",
        "compartmentId",
        "subnetId",
        "connectionState",
        "connectionDetails",
        "cccUpgradeScheduleId",
        "provisioningFingerprint",
        "provisioningPin",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "infrastructureInventory",
        "infrastructureNetworkConfiguration",
        "upgradeInformation",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CccInfrastructure(
            String id,
            String shortName,
            String displayName,
            String description,
            String compartmentId,
            String subnetId,
            ConnectionState connectionState,
            String connectionDetails,
            String cccUpgradeScheduleId,
            String provisioningFingerprint,
            String provisioningPin,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            CccInfrastructureInventory infrastructureInventory,
            CccInfrastructureNetworkConfiguration infrastructureNetworkConfiguration,
            CccUpgradeInformation upgradeInformation,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.shortName = shortName;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.subnetId = subnetId;
        this.connectionState = connectionState;
        this.connectionDetails = connectionDetails;
        this.cccUpgradeScheduleId = cccUpgradeScheduleId;
        this.provisioningFingerprint = provisioningFingerprint;
        this.provisioningPin = provisioningPin;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.infrastructureInventory = infrastructureInventory;
        this.infrastructureNetworkConfiguration = infrastructureNetworkConfiguration;
        this.upgradeInformation = upgradeInformation;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Compute Cloud@Customer infrastructure
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). This
         * cannot be changed once created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Compute Cloud@Customer infrastructure
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). This
         * cannot be changed once created.
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
         * The Compute Cloud@Customer infrastructure short name. This cannot be changed once
         * created. The short name is used to refer to the infrastructure in several contexts and is
         * unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shortName")
        private String shortName;

        /**
         * The Compute Cloud@Customer infrastructure short name. This cannot be changed once
         * created. The short name is used to refer to the infrastructure in several contexts and is
         * unique.
         *
         * @param shortName the value to set
         * @return this builder
         */
        public Builder shortName(String shortName) {
            this.shortName = shortName;
            this.__explicitlySet__.add("shortName");
            return this;
        }
        /**
         * The name that will be used to display the Compute Cloud@Customer infrastructure in the
         * Oracle Cloud Infrastructure console. Does not have to be unique and can be changed. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name that will be used to display the Compute Cloud@Customer infrastructure in the
         * Oracle Cloud Infrastructure console. Does not have to be unique and can be changed. Avoid
         * entering confidential information.
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
         * A mutable client-meaningful text description of the Compute Cloud@Customer
         * infrastructure. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A mutable client-meaningful text description of the Compute Cloud@Customer
         * infrastructure. Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The infrastructure compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The infrastructure compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * network subnet that is used to communicate with Compute Cloud@Customer infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * network subnet that is used to communicate with Compute Cloud@Customer infrastructure.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The current connection state of the infrastructure. A user can only update it from
         * REQUEST to READY or from any state back to REJECT. The system automatically handles the
         * REJECT to REQUEST, READY to CONNECTED, or CONNECTED to DISCONNECTED transitions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionState")
        private ConnectionState connectionState;

        /**
         * The current connection state of the infrastructure. A user can only update it from
         * REQUEST to READY or from any state back to REJECT. The system automatically handles the
         * REJECT to REQUEST, READY to CONNECTED, or CONNECTED to DISCONNECTED transitions.
         *
         * @param connectionState the value to set
         * @return this builder
         */
        public Builder connectionState(ConnectionState connectionState) {
            this.connectionState = connectionState;
            this.__explicitlySet__.add("connectionState");
            return this;
        }
        /** A message describing the current connection state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private String connectionDetails;

        /**
         * A message describing the current connection state in more detail.
         *
         * @param connectionDetails the value to set
         * @return this builder
         */
        public Builder connectionDetails(String connectionDetails) {
            this.connectionDetails = connectionDetails;
            this.__explicitlySet__.add("connectionDetails");
            return this;
        }
        /**
         * Schedule used for upgrades. If no schedule is associated with the infrastructure, it can
         * be updated at any time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cccUpgradeScheduleId")
        private String cccUpgradeScheduleId;

        /**
         * Schedule used for upgrades. If no schedule is associated with the infrastructure, it can
         * be updated at any time.
         *
         * @param cccUpgradeScheduleId the value to set
         * @return this builder
         */
        public Builder cccUpgradeScheduleId(String cccUpgradeScheduleId) {
            this.cccUpgradeScheduleId = cccUpgradeScheduleId;
            this.__explicitlySet__.add("cccUpgradeScheduleId");
            return this;
        }
        /**
         * Fingerprint of a Compute Cloud@Customer infrastructure in a data center generated during
         * the initial connection to this resource. The fingerprint should be verified by the
         * administrator when changing the connectionState from REQUEST to READY.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningFingerprint")
        private String provisioningFingerprint;

        /**
         * Fingerprint of a Compute Cloud@Customer infrastructure in a data center generated during
         * the initial connection to this resource. The fingerprint should be verified by the
         * administrator when changing the connectionState from REQUEST to READY.
         *
         * @param provisioningFingerprint the value to set
         * @return this builder
         */
        public Builder provisioningFingerprint(String provisioningFingerprint) {
            this.provisioningFingerprint = provisioningFingerprint;
            this.__explicitlySet__.add("provisioningFingerprint");
            return this;
        }
        /**
         * Code that is required for service personnel to connect a Compute Cloud@Customer
         * infrastructure in a data center to this resource. This code will only be available when
         * the connectionState is REJECT (usually at create time of the Compute Cloud@Customer
         * infrastructure).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningPin")
        private String provisioningPin;

        /**
         * Code that is required for service personnel to connect a Compute Cloud@Customer
         * infrastructure in a data center to this resource. This code will only be available when
         * the connectionState is REJECT (usually at create time of the Compute Cloud@Customer
         * infrastructure).
         *
         * @param provisioningPin the value to set
         * @return this builder
         */
        public Builder provisioningPin(String provisioningPin) {
            this.provisioningPin = provisioningPin;
            this.__explicitlySet__.add("provisioningPin");
            return this;
        }
        /**
         * Compute Cloud@Customer infrastructure creation date and time, using an RFC3339 formatted
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Compute Cloud@Customer infrastructure creation date and time, using an RFC3339 formatted
         * datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Compute Cloud@Customer infrastructure updated date and time, using an RFC3339 formatted
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Compute Cloud@Customer infrastructure updated date and time, using an RFC3339 formatted
         * datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Compute Cloud@Customer infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Compute Cloud@Customer infrastructure.
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
         * A message describing the current lifecycle state in more detail. For example, this can be
         * used to provide actionable information for a resource that is in a Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current lifecycle state in more detail. For example, this can be
         * used to provide actionable information for a resource that is in a Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureInventory")
        private CccInfrastructureInventory infrastructureInventory;

        public Builder infrastructureInventory(CccInfrastructureInventory infrastructureInventory) {
            this.infrastructureInventory = infrastructureInventory;
            this.__explicitlySet__.add("infrastructureInventory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureNetworkConfiguration")
        private CccInfrastructureNetworkConfiguration infrastructureNetworkConfiguration;

        public Builder infrastructureNetworkConfiguration(
                CccInfrastructureNetworkConfiguration infrastructureNetworkConfiguration) {
            this.infrastructureNetworkConfiguration = infrastructureNetworkConfiguration;
            this.__explicitlySet__.add("infrastructureNetworkConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upgradeInformation")
        private CccUpgradeInformation upgradeInformation;

        public Builder upgradeInformation(CccUpgradeInformation upgradeInformation) {
            this.upgradeInformation = upgradeInformation;
            this.__explicitlySet__.add("upgradeInformation");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccInfrastructure build() {
            CccInfrastructure model =
                    new CccInfrastructure(
                            this.id,
                            this.shortName,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.subnetId,
                            this.connectionState,
                            this.connectionDetails,
                            this.cccUpgradeScheduleId,
                            this.provisioningFingerprint,
                            this.provisioningPin,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.infrastructureInventory,
                            this.infrastructureNetworkConfiguration,
                            this.upgradeInformation,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccInfrastructure model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("shortName")) {
                this.shortName(model.getShortName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("connectionState")) {
                this.connectionState(model.getConnectionState());
            }
            if (model.wasPropertyExplicitlySet("connectionDetails")) {
                this.connectionDetails(model.getConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("cccUpgradeScheduleId")) {
                this.cccUpgradeScheduleId(model.getCccUpgradeScheduleId());
            }
            if (model.wasPropertyExplicitlySet("provisioningFingerprint")) {
                this.provisioningFingerprint(model.getProvisioningFingerprint());
            }
            if (model.wasPropertyExplicitlySet("provisioningPin")) {
                this.provisioningPin(model.getProvisioningPin());
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
            if (model.wasPropertyExplicitlySet("infrastructureInventory")) {
                this.infrastructureInventory(model.getInfrastructureInventory());
            }
            if (model.wasPropertyExplicitlySet("infrastructureNetworkConfiguration")) {
                this.infrastructureNetworkConfiguration(
                        model.getInfrastructureNetworkConfiguration());
            }
            if (model.wasPropertyExplicitlySet("upgradeInformation")) {
                this.upgradeInformation(model.getUpgradeInformation());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The Compute Cloud@Customer infrastructure
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). This cannot be
     * changed once created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Compute Cloud@Customer infrastructure
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). This cannot be
     * changed once created.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The Compute Cloud@Customer infrastructure short name. This cannot be changed once created.
     * The short name is used to refer to the infrastructure in several contexts and is unique.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shortName")
    private final String shortName;

    /**
     * The Compute Cloud@Customer infrastructure short name. This cannot be changed once created.
     * The short name is used to refer to the infrastructure in several contexts and is unique.
     *
     * @return the value
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * The name that will be used to display the Compute Cloud@Customer infrastructure in the Oracle
     * Cloud Infrastructure console. Does not have to be unique and can be changed. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name that will be used to display the Compute Cloud@Customer infrastructure in the Oracle
     * Cloud Infrastructure console. Does not have to be unique and can be changed. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A mutable client-meaningful text description of the Compute Cloud@Customer infrastructure.
     * Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A mutable client-meaningful text description of the Compute Cloud@Customer infrastructure.
     * Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The infrastructure compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The infrastructure compartment
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network
     * subnet that is used to communicate with Compute Cloud@Customer infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the network
     * subnet that is used to communicate with Compute Cloud@Customer infrastructure.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The current connection state of the infrastructure. A user can only update it from REQUEST to
     * READY or from any state back to REJECT. The system automatically handles the REJECT to
     * REQUEST, READY to CONNECTED, or CONNECTED to DISCONNECTED transitions.
     */
    public enum ConnectionState implements com.oracle.bmc.http.internal.BmcEnum {
        Reject("REJECT"),
        Request("REQUEST"),
        Ready("READY"),
        Connected("CONNECTED"),
        Disconnected("DISCONNECTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConnectionState.class);

        private final String value;
        private static java.util.Map<String, ConnectionState> map;

        static {
            map = new java.util.HashMap<>();
            for (ConnectionState v : ConnectionState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConnectionState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConnectionState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConnectionState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current connection state of the infrastructure. A user can only update it from REQUEST to
     * READY or from any state back to REJECT. The system automatically handles the REJECT to
     * REQUEST, READY to CONNECTED, or CONNECTED to DISCONNECTED transitions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionState")
    private final ConnectionState connectionState;

    /**
     * The current connection state of the infrastructure. A user can only update it from REQUEST to
     * READY or from any state back to REJECT. The system automatically handles the REJECT to
     * REQUEST, READY to CONNECTED, or CONNECTED to DISCONNECTED transitions.
     *
     * @return the value
     */
    public ConnectionState getConnectionState() {
        return connectionState;
    }

    /** A message describing the current connection state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final String connectionDetails;

    /**
     * A message describing the current connection state in more detail.
     *
     * @return the value
     */
    public String getConnectionDetails() {
        return connectionDetails;
    }

    /**
     * Schedule used for upgrades. If no schedule is associated with the infrastructure, it can be
     * updated at any time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cccUpgradeScheduleId")
    private final String cccUpgradeScheduleId;

    /**
     * Schedule used for upgrades. If no schedule is associated with the infrastructure, it can be
     * updated at any time.
     *
     * @return the value
     */
    public String getCccUpgradeScheduleId() {
        return cccUpgradeScheduleId;
    }

    /**
     * Fingerprint of a Compute Cloud@Customer infrastructure in a data center generated during the
     * initial connection to this resource. The fingerprint should be verified by the administrator
     * when changing the connectionState from REQUEST to READY.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningFingerprint")
    private final String provisioningFingerprint;

    /**
     * Fingerprint of a Compute Cloud@Customer infrastructure in a data center generated during the
     * initial connection to this resource. The fingerprint should be verified by the administrator
     * when changing the connectionState from REQUEST to READY.
     *
     * @return the value
     */
    public String getProvisioningFingerprint() {
        return provisioningFingerprint;
    }

    /**
     * Code that is required for service personnel to connect a Compute Cloud@Customer
     * infrastructure in a data center to this resource. This code will only be available when the
     * connectionState is REJECT (usually at create time of the Compute Cloud@Customer
     * infrastructure).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningPin")
    private final String provisioningPin;

    /**
     * Code that is required for service personnel to connect a Compute Cloud@Customer
     * infrastructure in a data center to this resource. This code will only be available when the
     * connectionState is REJECT (usually at create time of the Compute Cloud@Customer
     * infrastructure).
     *
     * @return the value
     */
    public String getProvisioningPin() {
        return provisioningPin;
    }

    /**
     * Compute Cloud@Customer infrastructure creation date and time, using an RFC3339 formatted
     * datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Compute Cloud@Customer infrastructure creation date and time, using an RFC3339 formatted
     * datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Compute Cloud@Customer infrastructure updated date and time, using an RFC3339 formatted
     * datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Compute Cloud@Customer infrastructure updated date and time, using an RFC3339 formatted
     * datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Compute Cloud@Customer infrastructure. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        NeedsAttention("NEEDS_ATTENTION"),
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
    /** The current state of the Compute Cloud@Customer infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Compute Cloud@Customer infrastructure.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current lifecycle state in more detail. For example, this can be
     * used to provide actionable information for a resource that is in a Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current lifecycle state in more detail. For example, this can be
     * used to provide actionable information for a resource that is in a Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureInventory")
    private final CccInfrastructureInventory infrastructureInventory;

    public CccInfrastructureInventory getInfrastructureInventory() {
        return infrastructureInventory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureNetworkConfiguration")
    private final CccInfrastructureNetworkConfiguration infrastructureNetworkConfiguration;

    public CccInfrastructureNetworkConfiguration getInfrastructureNetworkConfiguration() {
        return infrastructureNetworkConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("upgradeInformation")
    private final CccUpgradeInformation upgradeInformation;

    public CccUpgradeInformation getUpgradeInformation() {
        return upgradeInformation;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("CccInfrastructure(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", shortName=").append(String.valueOf(this.shortName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", connectionState=").append(String.valueOf(this.connectionState));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(", cccUpgradeScheduleId=").append(String.valueOf(this.cccUpgradeScheduleId));
        sb.append(", provisioningFingerprint=")
                .append(String.valueOf(this.provisioningFingerprint));
        sb.append(", provisioningPin=").append(String.valueOf(this.provisioningPin));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", infrastructureInventory=")
                .append(String.valueOf(this.infrastructureInventory));
        sb.append(", infrastructureNetworkConfiguration=")
                .append(String.valueOf(this.infrastructureNetworkConfiguration));
        sb.append(", upgradeInformation=").append(String.valueOf(this.upgradeInformation));
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
        if (!(o instanceof CccInfrastructure)) {
            return false;
        }

        CccInfrastructure other = (CccInfrastructure) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.shortName, other.shortName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.connectionState, other.connectionState)
                && java.util.Objects.equals(this.connectionDetails, other.connectionDetails)
                && java.util.Objects.equals(this.cccUpgradeScheduleId, other.cccUpgradeScheduleId)
                && java.util.Objects.equals(
                        this.provisioningFingerprint, other.provisioningFingerprint)
                && java.util.Objects.equals(this.provisioningPin, other.provisioningPin)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.infrastructureInventory, other.infrastructureInventory)
                && java.util.Objects.equals(
                        this.infrastructureNetworkConfiguration,
                        other.infrastructureNetworkConfiguration)
                && java.util.Objects.equals(this.upgradeInformation, other.upgradeInformation)
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
        result = (result * PRIME) + (this.shortName == null ? 43 : this.shortName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionState == null ? 43 : this.connectionState.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.cccUpgradeScheduleId == null
                                ? 43
                                : this.cccUpgradeScheduleId.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningFingerprint == null
                                ? 43
                                : this.provisioningFingerprint.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningPin == null ? 43 : this.provisioningPin.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureInventory == null
                                ? 43
                                : this.infrastructureInventory.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureNetworkConfiguration == null
                                ? 43
                                : this.infrastructureNetworkConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeInformation == null
                                ? 43
                                : this.upgradeInformation.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
