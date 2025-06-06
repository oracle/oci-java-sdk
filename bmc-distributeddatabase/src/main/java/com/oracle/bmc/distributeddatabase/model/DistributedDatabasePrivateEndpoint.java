/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * DistributedDatabasePrivateEndpoint resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DistributedDatabasePrivateEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedDatabasePrivateEndpoint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "subnetId",
        "vcnId",
        "displayName",
        "description",
        "privateIp",
        "nsgIds",
        "globallyDistributedDatabases",
        "globallyDistributedAutonomousDatabases",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "proxyComputeInstanceId",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DistributedDatabasePrivateEndpoint(
            String id,
            String compartmentId,
            String subnetId,
            String vcnId,
            String displayName,
            String description,
            String privateIp,
            java.util.List<String> nsgIds,
            java.util.List<DistributedDatabaseAssociatedWithPrivateEndpoint>
                    globallyDistributedDatabases,
            java.util.List<DistributedAutonomousDatabaseAssociatedWithPrivateEndpoint>
                    globallyDistributedAutonomousDatabases,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String proxyComputeInstanceId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.subnetId = subnetId;
        this.vcnId = vcnId;
        this.displayName = displayName;
        this.description = description;
        this.privateIp = privateIp;
        this.nsgIds = nsgIds;
        this.globallyDistributedDatabases = globallyDistributedDatabases;
        this.globallyDistributedAutonomousDatabases = globallyDistributedAutonomousDatabases;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.proxyComputeInstanceId = proxyComputeInstanceId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The identifier of the Private Endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The identifier of the Private Endpoint.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Identifier of the compartment in which private endpoint exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Identifier of the compartment in which private endpoint exists.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Identifier of the subnet in which private endpoint exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * Identifier of the subnet in which private endpoint exists.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** Identifier of the VCN in which subnet exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * Identifier of the VCN in which subnet exists.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** DistributedDatabasePrivateEndpoint display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * DistributedDatabasePrivateEndpoint display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** DistributedDatabasePrivateEndpoint description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * DistributedDatabasePrivateEndpoint description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** IP address of the Private Endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * IP address of the Private Endpoint.
         *
         * @param privateIp the value to set
         * @return this builder
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /** The OCIDs of the network security groups that the private endpoint belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * The OCIDs of the network security groups that the private endpoint belongs to.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * The details of the non-deleted Globally distributed databases that consumes the given
         * private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("globallyDistributedDatabases")
        private java.util.List<DistributedDatabaseAssociatedWithPrivateEndpoint>
                globallyDistributedDatabases;

        /**
         * The details of the non-deleted Globally distributed databases that consumes the given
         * private endpoint.
         *
         * @param globallyDistributedDatabases the value to set
         * @return this builder
         */
        public Builder globallyDistributedDatabases(
                java.util.List<DistributedDatabaseAssociatedWithPrivateEndpoint>
                        globallyDistributedDatabases) {
            this.globallyDistributedDatabases = globallyDistributedDatabases;
            this.__explicitlySet__.add("globallyDistributedDatabases");
            return this;
        }
        /**
         * The details of the non-deleted Globally distributed autonomous databases that consumes
         * the given private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("globallyDistributedAutonomousDatabases")
        private java.util.List<DistributedAutonomousDatabaseAssociatedWithPrivateEndpoint>
                globallyDistributedAutonomousDatabases;

        /**
         * The details of the non-deleted Globally distributed autonomous databases that consumes
         * the given private endpoint.
         *
         * @param globallyDistributedAutonomousDatabases the value to set
         * @return this builder
         */
        public Builder globallyDistributedAutonomousDatabases(
                java.util.List<DistributedAutonomousDatabaseAssociatedWithPrivateEndpoint>
                        globallyDistributedAutonomousDatabases) {
            this.globallyDistributedAutonomousDatabases = globallyDistributedAutonomousDatabases;
            this.__explicitlySet__.add("globallyDistributedAutonomousDatabases");
            return this;
        }
        /**
         * The time the DistributedDatabasePrivateEndpoint was first created. An RFC3339 formatted
         * datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the DistributedDatabasePrivateEndpoint was first created. An RFC3339 formatted
         * datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the Private Endpoint was last updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Private Endpoint was last updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Lifecycle states for private endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle states for private endpoint.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Detailed message for the lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Detailed message for the lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The identifier of the proxy compute instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("proxyComputeInstanceId")
        private String proxyComputeInstanceId;

        /**
         * The identifier of the proxy compute instance.
         *
         * @param proxyComputeInstanceId the value to set
         * @return this builder
         */
        public Builder proxyComputeInstanceId(String proxyComputeInstanceId) {
            this.proxyComputeInstanceId = proxyComputeInstanceId;
            this.__explicitlySet__.add("proxyComputeInstanceId");
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public DistributedDatabasePrivateEndpoint build() {
            DistributedDatabasePrivateEndpoint model =
                    new DistributedDatabasePrivateEndpoint(
                            this.id,
                            this.compartmentId,
                            this.subnetId,
                            this.vcnId,
                            this.displayName,
                            this.description,
                            this.privateIp,
                            this.nsgIds,
                            this.globallyDistributedDatabases,
                            this.globallyDistributedAutonomousDatabases,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.proxyComputeInstanceId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDatabasePrivateEndpoint model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("globallyDistributedDatabases")) {
                this.globallyDistributedDatabases(model.getGloballyDistributedDatabases());
            }
            if (model.wasPropertyExplicitlySet("globallyDistributedAutonomousDatabases")) {
                this.globallyDistributedAutonomousDatabases(
                        model.getGloballyDistributedAutonomousDatabases());
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
            if (model.wasPropertyExplicitlySet("proxyComputeInstanceId")) {
                this.proxyComputeInstanceId(model.getProxyComputeInstanceId());
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

    /** The identifier of the Private Endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The identifier of the Private Endpoint.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Identifier of the compartment in which private endpoint exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Identifier of the compartment in which private endpoint exists.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Identifier of the subnet in which private endpoint exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * Identifier of the subnet in which private endpoint exists.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** Identifier of the VCN in which subnet exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * Identifier of the VCN in which subnet exists.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** DistributedDatabasePrivateEndpoint display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * DistributedDatabasePrivateEndpoint display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** DistributedDatabasePrivateEndpoint description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * DistributedDatabasePrivateEndpoint description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** IP address of the Private Endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * IP address of the Private Endpoint.
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /** The OCIDs of the network security groups that the private endpoint belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * The OCIDs of the network security groups that the private endpoint belongs to.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * The details of the non-deleted Globally distributed databases that consumes the given private
     * endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("globallyDistributedDatabases")
    private final java.util.List<DistributedDatabaseAssociatedWithPrivateEndpoint>
            globallyDistributedDatabases;

    /**
     * The details of the non-deleted Globally distributed databases that consumes the given private
     * endpoint.
     *
     * @return the value
     */
    public java.util.List<DistributedDatabaseAssociatedWithPrivateEndpoint>
            getGloballyDistributedDatabases() {
        return globallyDistributedDatabases;
    }

    /**
     * The details of the non-deleted Globally distributed autonomous databases that consumes the
     * given private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("globallyDistributedAutonomousDatabases")
    private final java.util.List<DistributedAutonomousDatabaseAssociatedWithPrivateEndpoint>
            globallyDistributedAutonomousDatabases;

    /**
     * The details of the non-deleted Globally distributed autonomous databases that consumes the
     * given private endpoint.
     *
     * @return the value
     */
    public java.util.List<DistributedAutonomousDatabaseAssociatedWithPrivateEndpoint>
            getGloballyDistributedAutonomousDatabases() {
        return globallyDistributedAutonomousDatabases;
    }

    /**
     * The time the DistributedDatabasePrivateEndpoint was first created. An RFC3339 formatted
     * datetime string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the DistributedDatabasePrivateEndpoint was first created. An RFC3339 formatted
     * datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Private Endpoint was last updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Private Endpoint was last updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Lifecycle states for private endpoint. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Failed("FAILED"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Updating("UPDATING"),
        Creating("CREATING"),

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
    /** Lifecycle states for private endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle states for private endpoint.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Detailed message for the lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Detailed message for the lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The identifier of the proxy compute instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("proxyComputeInstanceId")
    private final String proxyComputeInstanceId;

    /**
     * The identifier of the proxy compute instance.
     *
     * @return the value
     */
    public String getProxyComputeInstanceId() {
        return proxyComputeInstanceId;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("DistributedDatabasePrivateEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", globallyDistributedDatabases=")
                .append(String.valueOf(this.globallyDistributedDatabases));
        sb.append(", globallyDistributedAutonomousDatabases=")
                .append(String.valueOf(this.globallyDistributedAutonomousDatabases));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", proxyComputeInstanceId=").append(String.valueOf(this.proxyComputeInstanceId));
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
        if (!(o instanceof DistributedDatabasePrivateEndpoint)) {
            return false;
        }

        DistributedDatabasePrivateEndpoint other = (DistributedDatabasePrivateEndpoint) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(
                        this.globallyDistributedDatabases, other.globallyDistributedDatabases)
                && java.util.Objects.equals(
                        this.globallyDistributedAutonomousDatabases,
                        other.globallyDistributedAutonomousDatabases)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.proxyComputeInstanceId, other.proxyComputeInstanceId)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result =
                (result * PRIME)
                        + (this.globallyDistributedDatabases == null
                                ? 43
                                : this.globallyDistributedDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.globallyDistributedAutonomousDatabases == null
                                ? 43
                                : this.globallyDistributedAutonomousDatabases.hashCode());
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
                        + (this.proxyComputeInstanceId == null
                                ? 43
                                : this.proxyComputeInstanceId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
