/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * A network firewall is a security resource that exists in a subnet of your choice and controls
 * incoming and outgoing network traffic based on a set of security rules. Each firewall is
 * associated with a policy. Traffic is routed to and from the firewall from resources such as
 * internet gateways and dynamic routing gateways (DRGs). For more information, see [Overview of
 * Network Firewall](https://docs.oracle.com/iaas/Content/network-firewall/overview.htm) <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NetworkFirewall.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkFirewall
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "subnetId",
        "ipv4Address",
        "ipv6Address",
        "networkFirewallPolicyId",
        "availabilityDomain",
        "natConfiguration",
        "networkSecurityGroupIds",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public NetworkFirewall(
            String id,
            String compartmentId,
            String displayName,
            String subnetId,
            String ipv4Address,
            String ipv6Address,
            String networkFirewallPolicyId,
            String availabilityDomain,
            NatConfigurationResponse natConfiguration,
            java.util.List<String> networkSecurityGroupIds,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.subnetId = subnetId;
        this.ipv4Address = ipv4Address;
        this.ipv6Address = ipv6Address;
        this.networkFirewallPolicyId = networkFirewallPolicyId;
        this.availabilityDomain = availabilityDomain;
        this.natConfiguration = natConfiguration;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Network Firewall resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Network Firewall resource.
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
         * compartment containing the Network Firewall.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the Network Firewall.
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
         * A user-friendly name for the Network Firewall. Does not have to be unique, and it's
         * changeable. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the Network Firewall. Does not have to be unique, and it's
         * changeable. Avoid entering confidential information.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the Network Firewall.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the Network Firewall.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** IPv4 address for the Network Firewall. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4Address")
        private String ipv4Address;

        /**
         * IPv4 address for the Network Firewall.
         *
         * @param ipv4Address the value to set
         * @return this builder
         */
        public Builder ipv4Address(String ipv4Address) {
            this.ipv4Address = ipv4Address;
            this.__explicitlySet__.add("ipv4Address");
            return this;
        }
        /** IPv6 address for the Network Firewall. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
        private String ipv6Address;

        /**
         * IPv6 address for the Network Firewall.
         *
         * @param ipv6Address the value to set
         * @return this builder
         */
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            this.__explicitlySet__.add("ipv6Address");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Network Firewall Policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkFirewallPolicyId")
        private String networkFirewallPolicyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Network Firewall Policy.
         *
         * @param networkFirewallPolicyId the value to set
         * @return this builder
         */
        public Builder networkFirewallPolicyId(String networkFirewallPolicyId) {
            this.networkFirewallPolicyId = networkFirewallPolicyId;
            this.__explicitlySet__.add("networkFirewallPolicyId");
            return this;
        }
        /**
         * Availability Domain where Network Firewall instance is created. To get a list of
         * availability domains for a tenancy, use the {@link
         * #listAvailabilityDomains(ListAvailabilityDomainsRequest) listAvailabilityDomains}
         * operation. Example: {@code kIdk:PHX-AD-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Availability Domain where Network Firewall instance is created. To get a list of
         * availability domains for a tenancy, use the {@link
         * #listAvailabilityDomains(ListAvailabilityDomainsRequest) listAvailabilityDomains}
         * operation. Example: {@code kIdk:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("natConfiguration")
        private NatConfigurationResponse natConfiguration;

        public Builder natConfiguration(NatConfigurationResponse natConfiguration) {
            this.natConfiguration = natConfiguration;
            this.__explicitlySet__.add("natConfiguration");
            return this;
        }
        /**
         * An array of network security groups
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with the Network Firewall.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * An array of network security groups
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated
         * with the Network Firewall.
         *
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         */
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }
        /**
         * The time at which the Network Firewall was created in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time at which the Network Firewall was created in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The time at which the Network Firewall was updated in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time at which the Network Firewall was updated in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the Network Firewall. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Network Firewall.
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
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in 'FAILED' state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, it can be used to
         * provide actionable information for a resource in 'FAILED' state.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        public NetworkFirewall build() {
            NetworkFirewall model =
                    new NetworkFirewall(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.subnetId,
                            this.ipv4Address,
                            this.ipv6Address,
                            this.networkFirewallPolicyId,
                            this.availabilityDomain,
                            this.natConfiguration,
                            this.networkSecurityGroupIds,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkFirewall model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("ipv4Address")) {
                this.ipv4Address(model.getIpv4Address());
            }
            if (model.wasPropertyExplicitlySet("ipv6Address")) {
                this.ipv6Address(model.getIpv6Address());
            }
            if (model.wasPropertyExplicitlySet("networkFirewallPolicyId")) {
                this.networkFirewallPolicyId(model.getNetworkFirewallPolicyId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("natConfiguration")) {
                this.natConfiguration(model.getNatConfiguration());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Network Firewall resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Network Firewall resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Network Firewall.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the Network Firewall.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name for the Network Firewall. Does not have to be unique, and it's
     * changeable. Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the Network Firewall. Does not have to be unique, and it's
     * changeable. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the Network Firewall.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the Network Firewall.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** IPv4 address for the Network Firewall. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4Address")
    private final String ipv4Address;

    /**
     * IPv4 address for the Network Firewall.
     *
     * @return the value
     */
    public String getIpv4Address() {
        return ipv4Address;
    }

    /** IPv6 address for the Network Firewall. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
    private final String ipv6Address;

    /**
     * IPv6 address for the Network Firewall.
     *
     * @return the value
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Network Firewall Policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkFirewallPolicyId")
    private final String networkFirewallPolicyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Network Firewall Policy.
     *
     * @return the value
     */
    public String getNetworkFirewallPolicyId() {
        return networkFirewallPolicyId;
    }

    /**
     * Availability Domain where Network Firewall instance is created. To get a list of availability
     * domains for a tenancy, use the {@link
     * #listAvailabilityDomains(ListAvailabilityDomainsRequest) listAvailabilityDomains} operation.
     * Example: {@code kIdk:PHX-AD-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Availability Domain where Network Firewall instance is created. To get a list of availability
     * domains for a tenancy, use the {@link
     * #listAvailabilityDomains(ListAvailabilityDomainsRequest) listAvailabilityDomains} operation.
     * Example: {@code kIdk:PHX-AD-1}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("natConfiguration")
    private final NatConfigurationResponse natConfiguration;

    public NatConfigurationResponse getNatConfiguration() {
        return natConfiguration;
    }

    /**
     * An array of network security groups
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with
     * the Network Firewall.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * An array of network security groups
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) associated with
     * the Network Firewall.
     *
     * @return the value
     */
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /**
     * The time at which the Network Firewall was created in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time at which the Network Firewall was created in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time at which the Network Firewall was updated in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time at which the Network Firewall was updated in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Network Firewall. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Network Firewall.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in 'FAILED' state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, it can be used to provide
     * actionable information for a resource in 'FAILED' state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("NetworkFirewall(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", ipv4Address=").append(String.valueOf(this.ipv4Address));
        sb.append(", ipv6Address=").append(String.valueOf(this.ipv6Address));
        sb.append(", networkFirewallPolicyId=")
                .append(String.valueOf(this.networkFirewallPolicyId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", natConfiguration=").append(String.valueOf(this.natConfiguration));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof NetworkFirewall)) {
            return false;
        }

        NetworkFirewall other = (NetworkFirewall) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.ipv4Address, other.ipv4Address)
                && java.util.Objects.equals(this.ipv6Address, other.ipv6Address)
                && java.util.Objects.equals(
                        this.networkFirewallPolicyId, other.networkFirewallPolicyId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.natConfiguration, other.natConfiguration)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.ipv4Address == null ? 43 : this.ipv4Address.hashCode());
        result = (result * PRIME) + (this.ipv6Address == null ? 43 : this.ipv6Address.hashCode());
        result =
                (result * PRIME)
                        + (this.networkFirewallPolicyId == null
                                ? 43
                                : this.networkFirewallPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.natConfiguration == null ? 43 : this.natConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
