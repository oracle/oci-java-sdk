/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The properties that define a network load balancer. For more information, see [Introduction to
 * Network Load
 * Balancer](https://docs.oracle.com/iaas/Content/NetworkLoadBalancer/introduction.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you are not
 * authorized, then contact an administrator. If you are an administrator who writes policies to
 * give users access, then see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <p>For information about endpoints and signing API requests, see [About the
 * API](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm). For information about
 * available SDKs and tools, see [SDKS and Other
 * Tools](https://docs.oracle.com/iaas/Content/API/Concepts/sdks.htm). <br>
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
        builder = CreateNetworkLoadBalancerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateNetworkLoadBalancerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "isPreserveSourceDestination",
        "isSymmetricHashEnabled",
        "reservedIps",
        "isPrivate",
        "subnetId",
        "networkSecurityGroupIds",
        "nlbIpVersion",
        "subnetIpv6Cidr",
        "assignedPrivateIpv4",
        "assignedIpv6",
        "listeners",
        "backendSets",
        "freeformTags",
        "definedTags",
        "securityAttributes"
    })
    public CreateNetworkLoadBalancerDetails(
            String compartmentId,
            String displayName,
            Boolean isPreserveSourceDestination,
            Boolean isSymmetricHashEnabled,
            java.util.List<ReservedIP> reservedIps,
            Boolean isPrivate,
            String subnetId,
            java.util.List<String> networkSecurityGroupIds,
            NlbIpVersion nlbIpVersion,
            String subnetIpv6Cidr,
            String assignedPrivateIpv4,
            String assignedIpv6,
            java.util.Map<String, ListenerDetails> listeners,
            java.util.Map<String, BackendSetDetails> backendSets,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.isPreserveSourceDestination = isPreserveSourceDestination;
        this.isSymmetricHashEnabled = isSymmetricHashEnabled;
        this.reservedIps = reservedIps;
        this.isPrivate = isPrivate;
        this.subnetId = subnetId;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.nlbIpVersion = nlbIpVersion;
        this.subnetIpv6Cidr = subnetIpv6Cidr;
        this.assignedPrivateIpv4 = assignedPrivateIpv4;
        this.assignedIpv6 = assignedIpv6;
        this.listeners = listeners;
        this.backendSets = backendSets;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.securityAttributes = securityAttributes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the network load balancer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
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
        /** Network load balancer identifier, which can be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Network load balancer identifier, which can be renamed.
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
         * This parameter can be enabled only if backends are compute OCIDs. When enabled, the
         * skipSourceDestinationCheck parameter is automatically enabled on the load balancer VNIC,
         * and packets are sent to the backend with the entire IP header intact.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
        private Boolean isPreserveSourceDestination;

        /**
         * This parameter can be enabled only if backends are compute OCIDs. When enabled, the
         * skipSourceDestinationCheck parameter is automatically enabled on the load balancer VNIC,
         * and packets are sent to the backend with the entire IP header intact.
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
        /** An array of reserved Ips. */
        @com.fasterxml.jackson.annotation.JsonProperty("reservedIps")
        private java.util.List<ReservedIP> reservedIps;

        /**
         * An array of reserved Ips.
         *
         * @param reservedIps the value to set
         * @return this builder
         */
        public Builder reservedIps(java.util.List<ReservedIP> reservedIps) {
            this.reservedIps = reservedIps;
            this.__explicitlySet__.add("reservedIps");
            return this;
        }
        /**
         * Whether the network load balancer has a virtual cloud network-local (private) IP address.
         *
         * <p>If "true", then the service assigns a private IP address to the network load balancer.
         *
         * <p>If "false", then the service assigns a public IP address to the network load balancer.
         *
         * <p>A public network load balancer is accessible from the internet, depending on the
         * [security list
         * rules](https://docs.oracle.com/iaas/Content/network/Concepts/securitylists.htm) for your
         * virtual cloud network. For more information about public and private network load
         * balancers, see [Network Load Balancer
         * Types](https://docs.oracle.com/iaas/Content/NetworkLoadBalancer/introduction.htm#NetworkLoadBalancerTypes).
         * This value is true by default.
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
         * <p>A public network load balancer is accessible from the internet, depending on the
         * [security list
         * rules](https://docs.oracle.com/iaas/Content/network/Concepts/securitylists.htm) for your
         * virtual cloud network. For more information about public and private network load
         * balancers, see [Network Load Balancer
         * Types](https://docs.oracle.com/iaas/Content/NetworkLoadBalancer/introduction.htm#NetworkLoadBalancerTypes).
         * This value is true by default.
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
         * The subnet in which the network load balancer is spawned
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The subnet in which the network load balancer is spawned
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with the network load balancer.
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
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with the network load balancer.
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
         * IPv6 subnet prefix selection. If Ipv6 subnet prefix is passed, Nlb Ipv6 Address would be
         * assign within the cidr block. NLB has to be dual or single stack ipv6 to support this.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetIpv6Cidr")
        private String subnetIpv6Cidr;

        /**
         * IPv6 subnet prefix selection. If Ipv6 subnet prefix is passed, Nlb Ipv6 Address would be
         * assign within the cidr block. NLB has to be dual or single stack ipv6 to support this.
         *
         * @param subnetIpv6Cidr the value to set
         * @return this builder
         */
        public Builder subnetIpv6Cidr(String subnetIpv6Cidr) {
            this.subnetIpv6Cidr = subnetIpv6Cidr;
            this.__explicitlySet__.add("subnetIpv6Cidr");
            return this;
        }
        /**
         * Private IP address to be assigned to the network load balancer being created. This IP
         * address has to be in the CIDR range of the subnet where network load balancer is being
         * created Example: "10.0.0.1"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignedPrivateIpv4")
        private String assignedPrivateIpv4;

        /**
         * Private IP address to be assigned to the network load balancer being created. This IP
         * address has to be in the CIDR range of the subnet where network load balancer is being
         * created Example: "10.0.0.1"
         *
         * @param assignedPrivateIpv4 the value to set
         * @return this builder
         */
        public Builder assignedPrivateIpv4(String assignedPrivateIpv4) {
            this.assignedPrivateIpv4 = assignedPrivateIpv4;
            this.__explicitlySet__.add("assignedPrivateIpv4");
            return this;
        }
        /**
         * IPv6 address to be assigned to the network load balancer being created. This IP address
         * has to be part of one of the prefixes supported by the subnet. Example:
         * "2607:9b80:9a0a:9a7e:abcd:ef01:2345:6789"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignedIpv6")
        private String assignedIpv6;

        /**
         * IPv6 address to be assigned to the network load balancer being created. This IP address
         * has to be part of one of the prefixes supported by the subnet. Example:
         * "2607:9b80:9a0a:9a7e:abcd:ef01:2345:6789"
         *
         * @param assignedIpv6 the value to set
         * @return this builder
         */
        public Builder assignedIpv6(String assignedIpv6) {
            this.assignedIpv6 = assignedIpv6;
            this.__explicitlySet__.add("assignedIpv6");
            return this;
        }
        /** Listeners associated with the network load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("listeners")
        private java.util.Map<String, ListenerDetails> listeners;

        /**
         * Listeners associated with the network load balancer.
         *
         * @param listeners the value to set
         * @return this builder
         */
        public Builder listeners(java.util.Map<String, ListenerDetails> listeners) {
            this.listeners = listeners;
            this.__explicitlySet__.add("listeners");
            return this;
        }
        /** Backend sets associated with the network load balancer. */
        @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
        private java.util.Map<String, BackendSetDetails> backendSets;

        /**
         * Backend sets associated with the network load balancer.
         *
         * @param backendSets the value to set
         * @return this builder
         */
        public Builder backendSets(java.util.Map<String, BackendSetDetails> backendSets) {
            this.backendSets = backendSets;
            this.__explicitlySet__.add("backendSets");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
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
         * ZPR tags for this resource. Each tag is a simple key-value pair with no predefined name,
         * type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * ZPR tags for this resource. Each tag is a simple key-value pair with no predefined name,
         * type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNetworkLoadBalancerDetails build() {
            CreateNetworkLoadBalancerDetails model =
                    new CreateNetworkLoadBalancerDetails(
                            this.compartmentId,
                            this.displayName,
                            this.isPreserveSourceDestination,
                            this.isSymmetricHashEnabled,
                            this.reservedIps,
                            this.isPrivate,
                            this.subnetId,
                            this.networkSecurityGroupIds,
                            this.nlbIpVersion,
                            this.subnetIpv6Cidr,
                            this.assignedPrivateIpv4,
                            this.assignedIpv6,
                            this.listeners,
                            this.backendSets,
                            this.freeformTags,
                            this.definedTags,
                            this.securityAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNetworkLoadBalancerDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isPreserveSourceDestination")) {
                this.isPreserveSourceDestination(model.getIsPreserveSourceDestination());
            }
            if (model.wasPropertyExplicitlySet("isSymmetricHashEnabled")) {
                this.isSymmetricHashEnabled(model.getIsSymmetricHashEnabled());
            }
            if (model.wasPropertyExplicitlySet("reservedIps")) {
                this.reservedIps(model.getReservedIps());
            }
            if (model.wasPropertyExplicitlySet("isPrivate")) {
                this.isPrivate(model.getIsPrivate());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
            }
            if (model.wasPropertyExplicitlySet("nlbIpVersion")) {
                this.nlbIpVersion(model.getNlbIpVersion());
            }
            if (model.wasPropertyExplicitlySet("subnetIpv6Cidr")) {
                this.subnetIpv6Cidr(model.getSubnetIpv6Cidr());
            }
            if (model.wasPropertyExplicitlySet("assignedPrivateIpv4")) {
                this.assignedPrivateIpv4(model.getAssignedPrivateIpv4());
            }
            if (model.wasPropertyExplicitlySet("assignedIpv6")) {
                this.assignedIpv6(model.getAssignedIpv6());
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
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
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
     * compartment containing the network load balancer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the network load balancer.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Network load balancer identifier, which can be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Network load balancer identifier, which can be renamed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This parameter can be enabled only if backends are compute OCIDs. When enabled, the
     * skipSourceDestinationCheck parameter is automatically enabled on the load balancer VNIC, and
     * packets are sent to the backend with the entire IP header intact.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPreserveSourceDestination")
    private final Boolean isPreserveSourceDestination;

    /**
     * This parameter can be enabled only if backends are compute OCIDs. When enabled, the
     * skipSourceDestinationCheck parameter is automatically enabled on the load balancer VNIC, and
     * packets are sent to the backend with the entire IP header intact.
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

    /** An array of reserved Ips. */
    @com.fasterxml.jackson.annotation.JsonProperty("reservedIps")
    private final java.util.List<ReservedIP> reservedIps;

    /**
     * An array of reserved Ips.
     *
     * @return the value
     */
    public java.util.List<ReservedIP> getReservedIps() {
        return reservedIps;
    }

    /**
     * Whether the network load balancer has a virtual cloud network-local (private) IP address.
     *
     * <p>If "true", then the service assigns a private IP address to the network load balancer.
     *
     * <p>If "false", then the service assigns a public IP address to the network load balancer.
     *
     * <p>A public network load balancer is accessible from the internet, depending on the [security
     * list rules](https://docs.oracle.com/iaas/Content/network/Concepts/securitylists.htm) for your
     * virtual cloud network. For more information about public and private network load balancers,
     * see [Network Load Balancer
     * Types](https://docs.oracle.com/iaas/Content/NetworkLoadBalancer/introduction.htm#NetworkLoadBalancerTypes).
     * This value is true by default.
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
     * <p>A public network load balancer is accessible from the internet, depending on the [security
     * list rules](https://docs.oracle.com/iaas/Content/network/Concepts/securitylists.htm) for your
     * virtual cloud network. For more information about public and private network load balancers,
     * see [Network Load Balancer
     * Types](https://docs.oracle.com/iaas/Content/NetworkLoadBalancer/introduction.htm#NetworkLoadBalancerTypes).
     * This value is true by default.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsPrivate() {
        return isPrivate;
    }

    /**
     * The subnet in which the network load balancer is spawned
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The subnet in which the network load balancer is spawned
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * An array of network security groups
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
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
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
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
     * IPv6 subnet prefix selection. If Ipv6 subnet prefix is passed, Nlb Ipv6 Address would be
     * assign within the cidr block. NLB has to be dual or single stack ipv6 to support this.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIpv6Cidr")
    private final String subnetIpv6Cidr;

    /**
     * IPv6 subnet prefix selection. If Ipv6 subnet prefix is passed, Nlb Ipv6 Address would be
     * assign within the cidr block. NLB has to be dual or single stack ipv6 to support this.
     *
     * @return the value
     */
    public String getSubnetIpv6Cidr() {
        return subnetIpv6Cidr;
    }

    /**
     * Private IP address to be assigned to the network load balancer being created. This IP address
     * has to be in the CIDR range of the subnet where network load balancer is being created
     * Example: "10.0.0.1"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignedPrivateIpv4")
    private final String assignedPrivateIpv4;

    /**
     * Private IP address to be assigned to the network load balancer being created. This IP address
     * has to be in the CIDR range of the subnet where network load balancer is being created
     * Example: "10.0.0.1"
     *
     * @return the value
     */
    public String getAssignedPrivateIpv4() {
        return assignedPrivateIpv4;
    }

    /**
     * IPv6 address to be assigned to the network load balancer being created. This IP address has
     * to be part of one of the prefixes supported by the subnet. Example:
     * "2607:9b80:9a0a:9a7e:abcd:ef01:2345:6789"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignedIpv6")
    private final String assignedIpv6;

    /**
     * IPv6 address to be assigned to the network load balancer being created. This IP address has
     * to be part of one of the prefixes supported by the subnet. Example:
     * "2607:9b80:9a0a:9a7e:abcd:ef01:2345:6789"
     *
     * @return the value
     */
    public String getAssignedIpv6() {
        return assignedIpv6;
    }

    /** Listeners associated with the network load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    private final java.util.Map<String, ListenerDetails> listeners;

    /**
     * Listeners associated with the network load balancer.
     *
     * @return the value
     */
    public java.util.Map<String, ListenerDetails> getListeners() {
        return listeners;
    }

    /** Backend sets associated with the network load balancer. */
    @com.fasterxml.jackson.annotation.JsonProperty("backendSets")
    private final java.util.Map<String, BackendSetDetails> backendSets;

    /**
     * Backend sets associated with the network load balancer.
     *
     * @return the value
     */
    public java.util.Map<String, BackendSetDetails> getBackendSets() {
        return backendSets;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
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
     * ZPR tags for this resource. Each tag is a simple key-value pair with no predefined name,
     * type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * ZPR tags for this resource. Each tag is a simple key-value pair with no predefined name,
     * type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"oracle-zpr": {"td": {"value": "42", "mode": "audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
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
        sb.append("CreateNetworkLoadBalancerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isPreserveSourceDestination=")
                .append(String.valueOf(this.isPreserveSourceDestination));
        sb.append(", isSymmetricHashEnabled=").append(String.valueOf(this.isSymmetricHashEnabled));
        sb.append(", reservedIps=").append(String.valueOf(this.reservedIps));
        sb.append(", isPrivate=").append(String.valueOf(this.isPrivate));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", nlbIpVersion=").append(String.valueOf(this.nlbIpVersion));
        sb.append(", subnetIpv6Cidr=").append(String.valueOf(this.subnetIpv6Cidr));
        sb.append(", assignedPrivateIpv4=").append(String.valueOf(this.assignedPrivateIpv4));
        sb.append(", assignedIpv6=").append(String.valueOf(this.assignedIpv6));
        sb.append(", listeners=").append(String.valueOf(this.listeners));
        sb.append(", backendSets=").append(String.valueOf(this.backendSets));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
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
                && java.util.Objects.equals(
                        this.isSymmetricHashEnabled, other.isSymmetricHashEnabled)
                && java.util.Objects.equals(this.reservedIps, other.reservedIps)
                && java.util.Objects.equals(this.isPrivate, other.isPrivate)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.nlbIpVersion, other.nlbIpVersion)
                && java.util.Objects.equals(this.subnetIpv6Cidr, other.subnetIpv6Cidr)
                && java.util.Objects.equals(this.assignedPrivateIpv4, other.assignedPrivateIpv4)
                && java.util.Objects.equals(this.assignedIpv6, other.assignedIpv6)
                && java.util.Objects.equals(this.listeners, other.listeners)
                && java.util.Objects.equals(this.backendSets, other.backendSets)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && super.equals(other);
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
        result =
                (result * PRIME)
                        + (this.isSymmetricHashEnabled == null
                                ? 43
                                : this.isSymmetricHashEnabled.hashCode());
        result = (result * PRIME) + (this.reservedIps == null ? 43 : this.reservedIps.hashCode());
        result = (result * PRIME) + (this.isPrivate == null ? 43 : this.isPrivate.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + (this.nlbIpVersion == null ? 43 : this.nlbIpVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.subnetIpv6Cidr == null ? 43 : this.subnetIpv6Cidr.hashCode());
        result =
                (result * PRIME)
                        + (this.assignedPrivateIpv4 == null
                                ? 43
                                : this.assignedPrivateIpv4.hashCode());
        result = (result * PRIME) + (this.assignedIpv6 == null ? 43 : this.assignedIpv6.hashCode());
        result = (result * PRIME) + (this.listeners == null ? 43 : this.listeners.hashCode());
        result = (result * PRIME) + (this.backendSets == null ? 43 : this.backendSets.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
