/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A logical subdivision of a VCN. Each subnet exists in a single Availability Domain and
 * consists of a contiguous range of IP addresses that do not overlap with
 * other subnets in the VCN. Example: 172.16.1.0/24. For more information, see
 * [Overview of the Networking Service](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/overview.htm) and
 * [VCNs and Subnets](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVCNs.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subnet.Builder.class)
public class Subnet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
        private String dhcpOptionsId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        @com.fasterxml.jackson.annotation.JsonProperty("prohibitPublicIpOnVnic")
        private Boolean prohibitPublicIpOnVnic;

        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
        private java.util.List<String> securityListIds;

        @com.fasterxml.jackson.annotation.JsonProperty("subnetDomainName")
        private String subnetDomainName;

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterIp")
        private String virtualRouterIp;

        @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterMac")
        private String virtualRouterMac;

        public Subnet build() {
            return new Subnet(
                    availabilityDomain,
                    cidrBlock,
                    compartmentId,
                    dhcpOptionsId,
                    displayName,
                    dnsLabel,
                    id,
                    lifecycleState,
                    prohibitPublicIpOnVnic,
                    routeTableId,
                    securityListIds,
                    subnetDomainName,
                    timeCreated,
                    vcnId,
                    virtualRouterIp,
                    virtualRouterMac);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Subnet o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .cidrBlock(o.getCidrBlock())
                    .compartmentId(o.getCompartmentId())
                    .dhcpOptionsId(o.getDhcpOptionsId())
                    .displayName(o.getDisplayName())
                    .dnsLabel(o.getDnsLabel())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .prohibitPublicIpOnVnic(o.getProhibitPublicIpOnVnic())
                    .routeTableId(o.getRouteTableId())
                    .securityListIds(o.getSecurityListIds())
                    .subnetDomainName(o.getSubnetDomainName())
                    .timeCreated(o.getTimeCreated())
                    .vcnId(o.getVcnId())
                    .virtualRouterIp(o.getVirtualRouterIp())
                    .virtualRouterMac(o.getVirtualRouterMac());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The subnet's Availability Domain.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The subnet's CIDR block.
     * <p>
     * Example: `172.16.1.0/24`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 32)
    String cidrBlock;

    /**
     * The OCID of the compartment containing the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID of the set of DHCP options associated with the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String dhcpOptionsId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
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
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `subnet123`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    @javax.validation.constraints.Size(min = 1, max = 15)
    String dnsLabel;

    /**
     * The subnet's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String id;
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
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
     * The OCID of the route table the subnet is using.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String routeTableId;

    /**
     * OCIDs for the security lists to use for VNICs in this subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
    java.util.List<String> securityListIds;

    /**
     * The subnet's domain name, which consists of the subnet's DNS label,
     * the VCN's DNS label, and the `oraclevcn.com` domain.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `subnet123.vcn1.oraclevcn.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetDomainName")
    @javax.validation.constraints.Size(min = 1, max = 253)
    String subnetDomainName;

    /**
     * The date and time the subnet was created, in the format defined by RFC3339.
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vcnId;

    /**
     * The IP address of the virtual router.
     * <p>
     * Example: `10.0.14.1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterIp")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 32)
    String virtualRouterIp;

    /**
     * The MAC address of the virtual router.
     * <p>
     * Example: `00:00:17:B6:4D:DD`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("virtualRouterMac")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 32)
    String virtualRouterMac;
}
