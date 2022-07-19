/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The properties that define a network load balancer. For more information, see
 * [Managing a network load balancer](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingloadbalancer.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized, then
 * contact an administrator. If you are an administrator who writes policies to give users access, then see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about endpoints and signing API requests, see
 * [About the API](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
 * [SDKS and Other Tools](https://docs.cloud.oracle.com/Content/API/Concepts/sdks.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateNetworkLoadBalancerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateNetworkLoadBalancerDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "isPreserveSourceDestination",
        "reservedIps",
        "isPrivate",
        "subnetId",
        "networkSecurityGroupIds",
        "nlbIpVersion",
        "listeners",
        "backendSets",
        "freeformTags",
        "definedTags"
    })
    public CreateNetworkLoadBalancerDetails(
            String compartmentId,
            String displayName,
            Boolean isPreserveSourceDestination,
            java.util.List<ReservedIP> reservedIps,
            Boolean isPrivate,
            String subnetId,
            java.util.List<String> networkSecurityGroupIds,
            NlbIpVersion nlbIpVersion,
            java.util.Map<String, ListenerDetails> listeners,
            java.util.Map<String, BackendSetDetails> backendSets,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.isPreserveSourceDestination = isPreserveSourceDestination;
        this.reservedIps = reservedIps;
        this.isPrivate = isPrivate;
        this.subnetId = subnetId;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.nlbIpVersion = nlbIpVersion;
        this.listeners = listeners;
        this.backendSets = backendSets;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the network load balancer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the network load balancer.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Network load balancer identifier, which can be renamed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Network load balancer identifier, which can be renamed.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * This parameter can be enabled only if backends are compute OCIDs. When enabled, the skipSourceDestinationCheck parameter is automatically
         * enabled on the load balancer VNIC, and packets are sent to the backend with the entire IP header intact.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
        private Boolean isPreserveSourceDestination;

        /**
         * This parameter can be enabled only if backends are compute OCIDs. When enabled, the skipSourceDestinationCheck parameter is automatically
         * enabled on the load balancer VNIC, and packets are sent to the backend with the entire IP header intact.
         *
         * @param isPreserveSourceDestination the value to set
         * @return this builder
         **/
        public Builder isPreserveSourceDestination(Boolean isPreserveSourceDestination) {
            this.isPreserveSourceDestination = isPreserveSourceDestination;
            this.__explicitlySet__.add("isPreserveSourceDestination");
            return this;
        }
        /**
         * An array of reserved Ips.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reservedIps")
        private java.util.List<ReservedIP> reservedIps;

        /**
         * An array of reserved Ips.
         *
         * @param reservedIps the value to set
         * @return this builder
         **/
        public Builder reservedIps(java.util.List<ReservedIP> reservedIps) {
            this.reservedIps = reservedIps;
            this.__explicitlySet__.add("reservedIps");
            return this;
        }
        /**
         * Whether the network load balancer has a virtual cloud network-local (private) IP address.
         * <p>
         * If "true", then the service assigns a private IP address to the network load balancer.
         * <p>
         * If "false", then the service assigns a public IP address to the network load balancer.
         * <p>
         * A public network load balancer is accessible from the internet, depending on the
         * [security list rules](https://docs.cloud.oracle.com/Content/network/Concepts/securitylists.htm) for your virtual cloud network. For more information about public and
         * private network load balancers,
         * see [How Network Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-network-load-balancing-works).
         * This value is true by default.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
        private Boolean isPrivate;

        /**
         * Whether the network load balancer has a virtual cloud network-local (private) IP address.
         * <p>
         * If "true", then the service assigns a private IP address to the network load balancer.
         * <p>
         * If "false", then the service assigns a public IP address to the network load balancer.
         * <p>
         * A public network load balancer is accessible from the internet, depending on the
         * [security list rules](https://docs.cloud.oracle.com/Content/network/Concepts/securitylists.htm) for your virtual cloud network. For more information about public and
         * private network load balancers,
         * see [How Network Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-network-load-balancing-works).
         * This value is true by default.
         * <p>
         * Example: {@code true}
         *
         * @param isPrivate the value to set
         * @return this builder
         **/
        public Builder isPrivate(Boolean isPrivate) {
            this.isPrivate = isPrivate;
            this.__explicitlySet__.add("isPrivate");
            return this;
        }
        /**
         * The subnet in which the network load balancer is spawned [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The subnet in which the network load balancer is spawned [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * An array of network security groups [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the network load
         * balancer.
         * <p>
         * During the creation of the network load balancer, the service adds the new load balancer to the specified network security groups.
         * <p>
         * The benefits of associating the network load balancer with network security groups include:
         * <p>
         *  Network security groups define network security rules to govern ingress and egress traffic for the network load balancer.
         * <p>
         *  The network security rules of other resources can reference the network security groups associated with the network load balancer
         *    to ensure access.
         * <p>
         * Example: ["ocid1.nsg.oc1.phx.unique_ID"]
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * An array of network security groups [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the network load
         * balancer.
         * <p>
         * During the creation of the network load balancer, the service adds the new load balancer to the specified network security groups.
         * <p>
         * The benefits of associating the network load balancer with network security groups include:
         * <p>
         *  Network security groups define network security rules to govern ingress and egress traffic for the network load balancer.
         * <p>
         *  The network security rules of other resources can reference the network security groups associated with the network load balancer
         *    to ensure access.
         * <p>
         * Example: ["ocid1.nsg.oc1.phx.unique_ID"]
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         **/
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }
        /**
         * IP version associated with the NLB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nlbIpVersion")
        private NlbIpVersion nlbIpVersion;

        /**
         * IP version associated with the NLB.
         * @param nlbIpVersion the value to set
         * @return this builder
         **/
        public Builder nlbIpVersion(NlbIpVersion nlbIpVersion) {
            this.nlbIpVersion = nlbIpVersion;
            this.__explicitlySet__.add("nlbIpVersion");
            return this;
        }
        /**
         * Listeners associated with the network load balancer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.Map<String, ListenerDetails> listeners;

        /**
         * Listeners associated with the network load balancer.
         * @param listeners the value to set
         * @return this builder
         **/
        public Builder listeners(java.util.Map<String, ListenerDetails> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }
        /**
         * Backend sets associated with the network load balancer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
        private java.util.Map<String, BackendSetDetails> backendSets;

        /**
         * Backend sets associated with the network load balancer.
         * @param backendSets the value to set
         * @return this builder
         **/
        public Builder backendSets(java.util.Map<String, BackendSetDetails> backendSets) {
            this.backendSets = backendSets;
            this.__explicitlySet__.add("backendSets");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
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

        public CreateNetworkLoadBalancerDetails build() {
            CreateNetworkLoadBalancerDetails __instance__ =
                    new CreateNetworkLoadBalancerDetails(
                            compartmentId,
                            displayName,
                            isPreserveSourceDestination,
                            reservedIps,
                            isPrivate,
                            subnetId,
                            networkSecurityGroupIds,
                            nlbIpVersion,
                            listeners,
                            backendSets,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNetworkLoadBalancerDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .isPreserveSourceDestination(o.getIsPreserveSourceDestination())
                            .reservedIps(o.getReservedIps())
                            .isPrivate(o.getIsPrivate())
                            .subnetId(o.getSubnetId())
                            .networkSecurityGroupIds(o.getNetworkSecurityGroupIds())
                            .nlbIpVersion(o.getNlbIpVersion())
                            .listeners(o.getListeners())
                            .backendSets(o.getBackendSets())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the network load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the network load balancer.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Network load balancer identifier, which can be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Network load balancer identifier, which can be renamed.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This parameter can be enabled only if backends are compute OCIDs. When enabled, the skipSourceDestinationCheck parameter is automatically
     * enabled on the load balancer VNIC, and packets are sent to the backend with the entire IP header intact.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
    private final Boolean isPreserveSourceDestination;

    /**
     * This parameter can be enabled only if backends are compute OCIDs. When enabled, the skipSourceDestinationCheck parameter is automatically
     * enabled on the load balancer VNIC, and packets are sent to the backend with the entire IP header intact.
     *
     * @return the value
     **/
    public Boolean getIsPreserveSourceDestination() {
        return isPreserveSourceDestination;
    }

    /**
     * An array of reserved Ips.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reservedIps")
    private final java.util.List<ReservedIP> reservedIps;

    /**
     * An array of reserved Ips.
     *
     * @return the value
     **/
    public java.util.List<ReservedIP> getReservedIps() {
        return reservedIps;
    }

    /**
     * Whether the network load balancer has a virtual cloud network-local (private) IP address.
     * <p>
     * If "true", then the service assigns a private IP address to the network load balancer.
     * <p>
     * If "false", then the service assigns a public IP address to the network load balancer.
     * <p>
     * A public network load balancer is accessible from the internet, depending on the
     * [security list rules](https://docs.cloud.oracle.com/Content/network/Concepts/securitylists.htm) for your virtual cloud network. For more information about public and
     * private network load balancers,
     * see [How Network Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-network-load-balancing-works).
     * This value is true by default.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivate")
    private final Boolean isPrivate;

    /**
     * Whether the network load balancer has a virtual cloud network-local (private) IP address.
     * <p>
     * If "true", then the service assigns a private IP address to the network load balancer.
     * <p>
     * If "false", then the service assigns a public IP address to the network load balancer.
     * <p>
     * A public network load balancer is accessible from the internet, depending on the
     * [security list rules](https://docs.cloud.oracle.com/Content/network/Concepts/securitylists.htm) for your virtual cloud network. For more information about public and
     * private network load balancers,
     * see [How Network Load Balancing Works](https://docs.cloud.oracle.com/Content/Balance/Concepts/balanceoverview.htm#how-network-load-balancing-works).
     * This value is true by default.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * The subnet in which the network load balancer is spawned [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The subnet in which the network load balancer is spawned [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * An array of network security groups [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the network load
     * balancer.
     * <p>
     * During the creation of the network load balancer, the service adds the new load balancer to the specified network security groups.
     * <p>
     * The benefits of associating the network load balancer with network security groups include:
     * <p>
     *  Network security groups define network security rules to govern ingress and egress traffic for the network load balancer.
     * <p>
     *  The network security rules of other resources can reference the network security groups associated with the network load balancer
     *    to ensure access.
     * <p>
     * Example: ["ocid1.nsg.oc1.phx.unique_ID"]
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of network security groups [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) associated with the network load
     * balancer.
     * <p>
     * During the creation of the network load balancer, the service adds the new load balancer to the specified network security groups.
     * <p>
     * The benefits of associating the network load balancer with network security groups include:
     * <p>
     *  Network security groups define network security rules to govern ingress and egress traffic for the network load balancer.
     * <p>
     *  The network security rules of other resources can reference the network security groups associated with the network load balancer
     *    to ensure access.
     * <p>
     * Example: ["ocid1.nsg.oc1.phx.unique_ID"]
     *
     * @return the value
     **/
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /**
     * IP version associated with the NLB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nlbIpVersion")
    private final NlbIpVersion nlbIpVersion;

    /**
     * IP version associated with the NLB.
     * @return the value
     **/
    public NlbIpVersion getNlbIpVersion() {
        return nlbIpVersion;
    }

    /**
     * Listeners associated with the network load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    private final java.util.Map<String, ListenerDetails> listeners;

    /**
     * Listeners associated with the network load balancer.
     * @return the value
     **/
    public java.util.Map<String, ListenerDetails> getListeners() {
        return listeners;
    }

    /**
     * Backend sets associated with the network load balancer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
    private final java.util.Map<String, BackendSetDetails> backendSets;

    /**
     * Backend sets associated with the network load balancer.
     * @return the value
     **/
    public java.util.Map<String, BackendSetDetails> getBackendSets() {
        return backendSets;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for cross-compatibility only.
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
        sb.append("CreateNetworkLoadBalancerDetails(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isPreserveSourceDestination=")
                .append(String.valueOf(this.isPreserveSourceDestination));
        sb.append(", reservedIps=").append(String.valueOf(this.reservedIps));
        sb.append(", isPrivate=").append(String.valueOf(this.isPrivate));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", nlbIpVersion=").append(String.valueOf(this.nlbIpVersion));
        sb.append(", listeners=").append(String.valueOf(this.listeners));
        sb.append(", backendSets=").append(String.valueOf(this.backendSets));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNetworkLoadBalancerDetails)) {
            return false;
        }

        CreateNetworkLoadBalancerDetails other = (CreateNetworkLoadBalancerDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.isPreserveSourceDestination, other.isPreserveSourceDestination)
                && java.util.Objects.equals(this.reservedIps, other.reservedIps)
                && java.util.Objects.equals(this.isPrivate, other.isPrivate)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.nlbIpVersion, other.nlbIpVersion)
                && java.util.Objects.equals(this.listeners, other.listeners)
                && java.util.Objects.equals(this.backendSets, other.backendSets)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isPreserveSourceDestination == null
                                ? 43
                                : this.isPreserveSourceDestination.hashCode());
        result = (result * PRIME) + (this.reservedIps == null ? 43 : this.reservedIps.hashCode());
        result = (result * PRIME) + (this.isPrivate == null ? 43 : this.isPrivate.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + (this.nlbIpVersion == null ? 43 : this.nlbIpVersion.hashCode());
        result = (result * PRIME) + (this.listeners == null ? 43 : this.listeners.hashCode());
        result = (result * PRIME) + (this.backendSets == null ? 43 : this.backendSets.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
