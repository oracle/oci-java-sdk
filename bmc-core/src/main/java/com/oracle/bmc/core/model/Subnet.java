/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A logical subdivision of a VCN. Each subnet
 * consists of a contiguous range of IP addresses that do not overlap with
 * other subnets in the VCN. Example: 172.16.1.0/24. For more information, see
 * [Overview of the Networking Service](https://docs.cloud.oracle.com/Content/Network/Concepts/overview.htm) and
 * [VCNs and Subnets](https://docs.cloud.oracle.com/Content/Network/Tasks/managingVCNs.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subnet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Subnet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
        private String dhcpOptionsId;

        public Builder dhcpOptionsId(String dhcpOptionsId) {
            this.dhcpOptionsId = dhcpOptionsId;
            this.__explicitlySet__.add("dhcpOptionsId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        public Builder dnsLabel(String dnsLabel) {
            this.dnsLabel = dnsLabel;
            this.__explicitlySet__.add("dnsLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6PublicCidrBlock")
        private String ipv6PublicCidrBlock;

        public Builder ipv6PublicCidrBlock(String ipv6PublicCidrBlock) {
            this.ipv6PublicCidrBlock = ipv6PublicCidrBlock;
            this.__explicitlySet__.add("ipv6PublicCidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6VirtualRouterIp")
        private String ipv6VirtualRouterIp;

        public Builder ipv6VirtualRouterIp(String ipv6VirtualRouterIp) {
            this.ipv6VirtualRouterIp = ipv6VirtualRouterIp;
            this.__explicitlySet__.add("ipv6VirtualRouterIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("prohibitPublicIpOnVnic")
        private Boolean prohibitPublicIpOnVnic;

        public Builder prohibitPublicIpOnVnic(Boolean prohibitPublicIpOnVnic) {
            this.prohibitPublicIpOnVnic = prohibitPublicIpOnVnic;
            this.__explicitlySet__.add("prohibitPublicIpOnVnic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
        private java.util.List<String> securityListIds;

        public Builder securityListIds(java.util.List<String> securityListIds) {
            this.securityListIds = securityListIds;
            this.__explicitlySet__.add("securityListIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetDomainName")
        private String subnetDomainName;

        public Builder subnetDomainName(String subnetDomainName) {
            this.subnetDomainName = subnetDomainName;
            this.__explicitlySet__.add("subnetDomainName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterIp")
        private String virtualRouterIp;

        public Builder virtualRouterIp(String virtualRouterIp) {
            this.virtualRouterIp = virtualRouterIp;
            this.__explicitlySet__.add("virtualRouterIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterMac")
        private String virtualRouterMac;

        public Builder virtualRouterMac(String virtualRouterMac) {
            this.virtualRouterMac = virtualRouterMac;
            this.__explicitlySet__.add("virtualRouterMac");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Subnet build() {
            Subnet __instance__ =
                    new Subnet(
                            availabilityDomain,
                            cidrBlock,
                            compartmentId,
                            definedTags,
                            dhcpOptionsId,
                            displayName,
                            dnsLabel,
                            freeformTags,
                            id,
                            ipv6CidrBlock,
                            ipv6PublicCidrBlock,
                            ipv6VirtualRouterIp,
                            lifecycleState,
                            prohibitPublicIpOnVnic,
                            routeTableId,
                            securityListIds,
                            subnetDomainName,
                            timeCreated,
                            vcnId,
                            virtualRouterIp,
                            virtualRouterMac);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Subnet o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .cidrBlock(o.getCidrBlock())
                            .compartmentId(o.getCompartmentId())
                            .definedTags(o.getDefinedTags())
                            .dhcpOptionsId(o.getDhcpOptionsId())
                            .displayName(o.getDisplayName())
                            .dnsLabel(o.getDnsLabel())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .ipv6CidrBlock(o.getIpv6CidrBlock())
                            .ipv6PublicCidrBlock(o.getIpv6PublicCidrBlock())
                            .ipv6VirtualRouterIp(o.getIpv6VirtualRouterIp())
                            .lifecycleState(o.getLifecycleState())
                            .prohibitPublicIpOnVnic(o.getProhibitPublicIpOnVnic())
                            .routeTableId(o.getRouteTableId())
                            .securityListIds(o.getSecurityListIds())
                            .subnetDomainName(o.getSubnetDomainName())
                            .timeCreated(o.getTimeCreated())
                            .vcnId(o.getVcnId())
                            .virtualRouterIp(o.getVirtualRouterIp())
                            .virtualRouterMac(o.getVirtualRouterMac());

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

    /**
     * The subnet's availability domain. This attribute will be null if this is a regional subnet
     * instead of an AD-specific subnet. Oracle recommends creating regional subnets.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The subnet's CIDR block.
     * <p>
     * Example: `10.0.1.0/24`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    String cidrBlock;

    /**
     * The OCID of the compartment containing the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The OCID of the set of DHCP options that the subnet uses.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
    String dhcpOptionsId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
     * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (for example, `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
     * The value cannot be changed.
     * <p>
     * The absence of this parameter means the Internet and VCN Resolver
     * will not resolve hostnames of instances in this subnet.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `subnet123`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    String dnsLabel;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The subnet's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's private IP address
     * space. The subnet size is always /64. Note that IPv6 addressing is currently supported only
     * in certain regions. See [IPv6 Addresses](https://docs.cloud.oracle.com/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: `2001:0db8:0123:1111::/64`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    String ipv6CidrBlock;

    /**
     * For an IPv6-enabled subnet, this is the IPv6 CIDR block for the subnet's public IP address
     * space. The subnet size is always /64. The left 48 bits are inherited from the
     * `ipv6PublicCidrBlock` of the {@link Vcn},
     * and the remaining 16 bits are from the subnet's `ipv6CidrBlock`.
     * <p>
     * Example: `2001:0db8:0123:1111::/64`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6PublicCidrBlock")
    String ipv6PublicCidrBlock;

    /**
     * For an IPv6-enabled subnet, this is the IPv6 address of the virtual router.
     * <p>
     * Example: `2001:0db8:0123:1111:89ab:cdef:1234:5678`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6VirtualRouterIp")
    String ipv6VirtualRouterIp;
    /**
     * The subnet's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The subnet's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Whether VNICs within this subnet can have public IP addresses.
     * Defaults to false, which means VNICs created in this subnet will
     * automatically be assigned public IP addresses unless specified
     * otherwise during instance launch or VNIC creation (with the
     * `assignPublicIp` flag in
     * {@link CreateVnicDetails}).
     * If `prohibitPublicIpOnVnic` is set to true, VNICs created in this
     * subnet cannot have public IP addresses (that is, it's a private
     * subnet).
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prohibitPublicIpOnVnic")
    Boolean prohibitPublicIpOnVnic;

    /**
     * The OCID of the route table that the subnet uses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    String routeTableId;

    /**
     * The OCIDs of the security list or lists that the subnet uses. Remember
     * that security lists are associated *with the subnet*, but the
     * rules are applied to the individual VNICs in the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
    java.util.List<String> securityListIds;

    /**
     * The subnet's domain name, which consists of the subnet's DNS label,
     * the VCN's DNS label, and the `oraclevcn.com` domain.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `subnet123.vcn1.oraclevcn.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetDomainName")
    String subnetDomainName;

    /**
     * The date and time the subnet was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The OCID of the VCN the subnet is in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    /**
     * The IP address of the virtual router.
     * <p>
     * Example: `10.0.14.1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterIp")
    String virtualRouterIp;

    /**
     * The MAC address of the virtual router.
     * <p>
     * Example: `00:00:00:00:00:01`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterMac")
    String virtualRouterMac;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
