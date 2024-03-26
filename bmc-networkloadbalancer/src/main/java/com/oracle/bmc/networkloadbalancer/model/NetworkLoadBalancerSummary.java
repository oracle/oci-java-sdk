/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * Network load balancer object to be used for list operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NetworkLoadBalancerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkLoadBalancerSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "lifecycleDetails",
        "nlbIpVersion",
        "timeCreated",
        "timeUpdated",
        "ipAddresses",
        "isPrivate",
        "isPreserveSourceDestination",
        "isSymmetricHashEnabled",
        "subnetId",
        "networkSecurityGroupIds",
        "listeners",
        "backendSets",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public NetworkLoadBalancerSummary(
            String id,
            String compartmentId,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            NlbIpVersion nlbIpVersion,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<IpAddress> ipAddresses,
            Boolean isPrivate,
            Boolean isPreserveSourceDestination,
            Boolean isSymmetricHashEnabled,
            String subnetId,
            java.util.List<String> networkSecurityGroupIds,
            java.util.Map<String, Listener> listeners,
            java.util.Map<String, BackendSet> backendSets,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.nlbIpVersion = nlbIpVersion;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.ipAddresses = ipAddresses;
        this.isPrivate = isPrivate;
        this.isPreserveSourceDestination = isPreserveSourceDestination;
        this.isSymmetricHashEnabled = isSymmetricHashEnabled;
        this.subnetId = subnetId;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.listeners = listeners;
        this.backendSets = backendSets;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network load balancer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * network load balancer.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the network load balancer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the network load balancer.
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
         * A user-friendly name, which does not have to be unique, and can be changed.
         *
         * <p>Example: {@code example_load_balancer}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name, which does not have to be unique, and can be changed.
         *
         * <p>Example: {@code example_load_balancer}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The current state of the network load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the network load balancer.
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
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** IP version associated with the NLB. */
        @com.fasterxml.jackson.annotation.JsonProperty("nlbIpVersion")
        private NlbIpVersion nlbIpVersion;

        /**
         * IP version associated with the NLB.
         *
         * @param nlbIpVersion the value to set
         * @return this builder
         */
        public Builder nlbIpVersion(NlbIpVersion nlbIpVersion) {
            this.nlbIpVersion = nlbIpVersion;
            this.__explicitlySet__.add("nlbIpVersion");
            return this;
        }
        /**
         * The date and time the network load balancer was created, in the format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2020-05-01T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the network load balancer was created, in the format defined by
         * RFC3339.
         *
         * <p>Example: {@code 2020-05-01T21:10:29.600Z}
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
         * The time the network load balancer was updated. An RFC3339 formatted date-time string.
         *
         * <p>Example: {@code 2020-05-01T22:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the network load balancer was updated. An RFC3339 formatted date-time string.
         *
         * <p>Example: {@code 2020-05-01T22:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** An array of IP addresses. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
        private java.util.List<IpAddress> ipAddresses;

        /**
         * An array of IP addresses.
         *
         * @param ipAddresses the value to set
         * @return this builder
         */
        public Builder ipAddresses(java.util.List<IpAddress> ipAddresses) {
            this.ipAddresses = ipAddresses;
            this.__explicitlySet__.add("ipAddresses");
            return this;
        }
        /**
         * Whether the network load balancer has a virtual cloud network-local (private) IP address.
         *
         * <p>If "true", then the service assigns a private IP address to the network load balancer.
         *
         * <p>If "false", then the service assigns a public IP address to the network load balancer.
         *
         * <p>A public network load balancer is accessible from the internet, depending the
         * [security list
         * rules](https://docs.cloud.oracle.com/Content/network/Concepts/securitylists.htm) for your
         * virtual cloudn network. For more information about public and private network load
         * balancers, see [How Network Load Balancing
         * Works](https://docs.cloud.oracle.com/Content/NetworkLoadBalancer/overview.htm). This
         * value is true by default.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
        private Boolean isPrivate;

        /**
         * Whether the network load balancer has a virtual cloud network-local (private) IP address.
         *
         * <p>If "true", then the service assigns a private IP address to the network load balancer.
         *
         * <p>If "false", then the service assigns a public IP address to the network load balancer.
         *
         * <p>A public network load balancer is accessible from the internet, depending the
         * [security list
         * rules](https://docs.cloud.oracle.com/Content/network/Concepts/securitylists.htm) for your
         * virtual cloudn network. For more information about public and private network load
         * balancers, see [How Network Load Balancing
         * Works](https://docs.cloud.oracle.com/Content/NetworkLoadBalancer/overview.htm). This
         * value is true by default.
         *
         * <p>Example: {@code true}
         *
         * @param isPrivate the value to set
         * @return this builder
         */
        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            this.__explicitlySet__.add("isPrivate");
            return this;
        }
        /**
         * When enabled, the skipSourceDestinationCheck parameter is automatically enabled on the
         * load balancer VNIC. Packets are sent to the backend set without any changes to the source
         * and destination IP.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
        private Boolean isPreserveSourceDestination;

        /**
         * When enabled, the skipSourceDestinationCheck parameter is automatically enabled on the
         * load balancer VNIC. Packets are sent to the backend set without any changes to the source
         * and destination IP.
         *
         * @param isPreserveSourceDestination the value to set
         * @return this builder
         */
        public Builder isPreserveSourceDestination(Boolean isPreserveSourceDestination) {
            this.isPreserveSourceDestination = isPreserveSourceDestination;
            this.__explicitlySet__.add("isPreserveSourceDestination");
            return this;
        }
        /**
         * This can only be enabled when NLB is working in transparent mode with source destination
         * header preservation enabled. This removes the additional dependency from NLB
         * backends(like Firewalls) to perform SNAT.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricHashEnabled")
        private Boolean isSymmetricHashEnabled;

        /**
         * This can only be enabled when NLB is working in transparent mode with source destination
         * header preservation enabled. This removes the additional dependency from NLB
         * backends(like Firewalls) to perform SNAT.
         *
         * @param isSymmetricHashEnabled the value to set
         * @return this builder
         */
        public Builder isSymmetricHashEnabled(Boolean isSymmetricHashEnabled) {
            this.isSymmetricHashEnabled = isSymmetricHashEnabled;
            this.__explicitlySet__.add("isSymmetricHashEnabled");
            return this;
        }
        /**
         * The subnet in which the network load balancer is spawned
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)."
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The subnet in which the network load balancer is spawned
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)."
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
         * An array of network security groups
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * associated with the network load balancer.
         *
         * <p>During the creation of the network load balancer, the service adds the new load
         * balancer to the specified network security groups.
         *
         * <p>The benefits of associating the network load balancer with network security groups
         * include:
         *
         * <p>Network security groups define network security rules to govern ingress and egress
         * traffic for the network load balancer.
         *
         * <p>The network security rules of other resources can reference the network security
         * groups associated with the network load balancer to ensure access.
         *
         * <p>Example: ["ocid1.nsg.oc1.phx.unique_ID"]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * An array of network security groups
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         * associated with the network load balancer.
         *
         * <p>During the creation of the network load balancer, the service adds the new load
         * balancer to the specified network security groups.
         *
         * <p>The benefits of associating the network load balancer with network security groups
         * include:
         *
         * <p>Network security groups define network security rules to govern ingress and egress
         * traffic for the network load balancer.
         *
         * <p>The network security rules of other resources can reference the network security
         * groups associated with the network load balancer to ensure access.
         *
         * <p>Example: ["ocid1.nsg.oc1.phx.unique_ID"]
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         */
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }
        /** Listeners associated with the network load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.Map<String, Listener> listeners;

        /**
         * Listeners associated with the network load balancer.
         *
         * @param listeners the value to set
         * @return this builder
         */
        public Builder listeners(java.util.Map<String, Listener> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }
        /** Backend sets associated with the network load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
        private java.util.Map<String, BackendSet> backendSets;

        /**
         * Backend sets associated with the network load balancer.
         *
         * @param backendSets the value to set
         * @return this builder
         */
        public Builder backendSets(java.util.Map<String, BackendSet> backendSets) {
            this.backendSets = backendSets;
            this.__explicitlySet__.add("backendSets");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * Key-value pair representing system tags' keys and values scoped to a namespace. Example:
         * {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Key-value pair representing system tags' keys and values scoped to a namespace. Example:
         * {@code {"bar-key": "value"}}
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

        public NetworkLoadBalancerSummary build() {
            NetworkLoadBalancerSummary model =
                    new NetworkLoadBalancerSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.nlbIpVersion,
                            this.timeCreated,
                            this.timeUpdated,
                            this.ipAddresses,
                            this.isPrivate,
                            this.isPreserveSourceDestination,
                            this.isSymmetricHashEnabled,
                            this.subnetId,
                            this.networkSecurityGroupIds,
                            this.listeners,
                            this.backendSets,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkLoadBalancerSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("nlbIpVersion")) {
                this.nlbIpVersion(model.getNlbIpVersion());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("ipAddresses")) {
                this.ipAddresses(model.getIpAddresses());
            }
            if (model.wasPropertyExplicitlySet("isPrivate")) {
                this.isPrivate(model.getIsPrivate());
            }
            if (model.wasPropertyExplicitlySet("isPreserveSourceDestination")) {
                this.isPreserveSourceDestination(model.getIsPreserveSourceDestination());
            }
            if (model.wasPropertyExplicitlySet("isSymmetricHashEnabled")) {
                this.isSymmetricHashEnabled(model.getIsSymmetricHashEnabled());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
            }
            if (model.wasPropertyExplicitlySet("listeners")) {
                this.listeners(model.getListeners());
            }
            if (model.wasPropertyExplicitlySet("backendSets")) {
                this.backendSets(model.getBackendSets());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * network load balancer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * network load balancer.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the network load balancer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the network load balancer.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name, which does not have to be unique, and can be changed.
     *
     * <p>Example: {@code example_load_balancer}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name, which does not have to be unique, and can be changed.
     *
     * <p>Example: {@code example_load_balancer}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The current state of the network load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the network load balancer.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** IP version associated with the NLB. */
    @com.fasterxml.jackson.annotation.JsonProperty("nlbIpVersion")
    private final NlbIpVersion nlbIpVersion;

    /**
     * IP version associated with the NLB.
     *
     * @return the value
     */
    public NlbIpVersion getNlbIpVersion() {
        return nlbIpVersion;
    }

    /**
     * The date and time the network load balancer was created, in the format defined by RFC3339.
     *
     * <p>Example: {@code 2020-05-01T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the network load balancer was created, in the format defined by RFC3339.
     *
     * <p>Example: {@code 2020-05-01T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the network load balancer was updated. An RFC3339 formatted date-time string.
     *
     * <p>Example: {@code 2020-05-01T22:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the network load balancer was updated. An RFC3339 formatted date-time string.
     *
     * <p>Example: {@code 2020-05-01T22:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** An array of IP addresses. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddresses")
    private final java.util.List<IpAddress> ipAddresses;

    /**
     * An array of IP addresses.
     *
     * @return the value
     */
    public java.util.List<IpAddress> getIpAddresses() {
        return ipAddresses;
    }

    /**
     * Whether the network load balancer has a virtual cloud network-local (private) IP address.
     *
     * <p>If "true", then the service assigns a private IP address to the network load balancer.
     *
     * <p>If "false", then the service assigns a public IP address to the network load balancer.
     *
     * <p>A public network load balancer is accessible from the internet, depending the [security
     * list rules](https://docs.cloud.oracle.com/Content/network/Concepts/securitylists.htm) for
     * your virtual cloudn network. For more information about public and private network load
     * balancers, see [How Network Load Balancing
     * Works](https://docs.cloud.oracle.com/Content/NetworkLoadBalancer/overview.htm). This value is
     * true by default.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
    private final Boolean isPrivate;

    /**
     * Whether the network load balancer has a virtual cloud network-local (private) IP address.
     *
     * <p>If "true", then the service assigns a private IP address to the network load balancer.
     *
     * <p>If "false", then the service assigns a public IP address to the network load balancer.
     *
     * <p>A public network load balancer is accessible from the internet, depending the [security
     * list rules](https://docs.cloud.oracle.com/Content/network/Concepts/securitylists.htm) for
     * your virtual cloudn network. For more information about public and private network load
     * balancers, see [How Network Load Balancing
     * Works](https://docs.cloud.oracle.com/Content/NetworkLoadBalancer/overview.htm). This value is
     * true by default.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * When enabled, the skipSourceDestinationCheck parameter is automatically enabled on the load
     * balancer VNIC. Packets are sent to the backend set without any changes to the source and
     * destination IP.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
    private final Boolean isPreserveSourceDestination;

    /**
     * When enabled, the skipSourceDestinationCheck parameter is automatically enabled on the load
     * balancer VNIC. Packets are sent to the backend set without any changes to the source and
     * destination IP.
     *
     * @return the value
     */
    public Boolean getIsPreserveSourceDestination() {
        return isPreserveSourceDestination;
    }

    /**
     * This can only be enabled when NLB is working in transparent mode with source destination
     * header preservation enabled. This removes the additional dependency from NLB backends(like
     * Firewalls) to perform SNAT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricHashEnabled")
    private final Boolean isSymmetricHashEnabled;

    /**
     * This can only be enabled when NLB is working in transparent mode with source destination
     * header preservation enabled. This removes the additional dependency from NLB backends(like
     * Firewalls) to perform SNAT.
     *
     * @return the value
     */
    public Boolean getIsSymmetricHashEnabled() {
        return isSymmetricHashEnabled;
    }

    /**
     * The subnet in which the network load balancer is spawned
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)."
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The subnet in which the network load balancer is spawned
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)."
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * An array of network security groups
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated
     * with the network load balancer.
     *
     * <p>During the creation of the network load balancer, the service adds the new load balancer
     * to the specified network security groups.
     *
     * <p>The benefits of associating the network load balancer with network security groups
     * include:
     *
     * <p>Network security groups define network security rules to govern ingress and egress traffic
     * for the network load balancer.
     *
     * <p>The network security rules of other resources can reference the network security groups
     * associated with the network load balancer to ensure access.
     *
     * <p>Example: ["ocid1.nsg.oc1.phx.unique_ID"]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of network security groups
     * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated
     * with the network load balancer.
     *
     * <p>During the creation of the network load balancer, the service adds the new load balancer
     * to the specified network security groups.
     *
     * <p>The benefits of associating the network load balancer with network security groups
     * include:
     *
     * <p>Network security groups define network security rules to govern ingress and egress traffic
     * for the network load balancer.
     *
     * <p>The network security rules of other resources can reference the network security groups
     * associated with the network load balancer to ensure access.
     *
     * <p>Example: ["ocid1.nsg.oc1.phx.unique_ID"]
     *
     * @return the value
     */
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /** Listeners associated with the network load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    private final java.util.Map<String, Listener> listeners;

    /**
     * Listeners associated with the network load balancer.
     *
     * @return the value
     */
    public java.util.Map<String, Listener> getListeners() {
        return listeners;
    }

    /** Backend sets associated with the network load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
    private final java.util.Map<String, BackendSet> backendSets;

    /**
     * Backend sets associated with the network load balancer.
     *
     * @return the value
     */
    public java.util.Map<String, BackendSet> getBackendSets() {
        return backendSets;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Key-value pair representing system tags' keys and values scoped to a namespace. Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Key-value pair representing system tags' keys and values scoped to a namespace. Example:
     * {@code {"bar-key": "value"}}
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
        sb.append("NetworkLoadBalancerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", nlbIpVersion=").append(String.valueOf(this.nlbIpVersion));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", ipAddresses=").append(String.valueOf(this.ipAddresses));
        sb.append(", isPrivate=").append(String.valueOf(this.isPrivate));
        sb.append(", isPreserveSourceDestination=")
                .append(String.valueOf(this.isPreserveSourceDestination));
        sb.append(", isSymmetricHashEnabled=").append(String.valueOf(this.isSymmetricHashEnabled));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", listeners=").append(String.valueOf(this.listeners));
        sb.append(", backendSets=").append(String.valueOf(this.backendSets));
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
        if (!(o instanceof NetworkLoadBalancerSummary)) {
            return false;
        }

        NetworkLoadBalancerSummary other = (NetworkLoadBalancerSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.nlbIpVersion, other.nlbIpVersion)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.ipAddresses, other.ipAddresses)
                && java.util.Objects.equals(this.isPrivate, other.isPrivate)
                && java.util.Objects.equals(
                        this.isPreserveSourceDestination, other.isPreserveSourceDestination)
                && java.util.Objects.equals(
                        this.isSymmetricHashEnabled, other.isSymmetricHashEnabled)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.listeners, other.listeners)
                && java.util.Objects.equals(this.backendSets, other.backendSets)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.nlbIpVersion == null ? 43 : this.nlbIpVersion.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.ipAddresses == null ? 43 : this.ipAddresses.hashCode());
        result = (result * PRIME) + (this.isPrivate == null ? 43 : this.isPrivate.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreserveSourceDestination == null
                                ? 43
                                : this.isPreserveSourceDestination.hashCode());
        result =
                (result * PRIME)
                        + (this.isSymmetricHashEnabled == null
                                ? 43
                                : this.isSymmetricHashEnabled.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + (this.listeners == null ? 43 : this.listeners.hashCode());
        result = (result * PRIME) + (this.backendSets == null ? 43 : this.backendSets.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
