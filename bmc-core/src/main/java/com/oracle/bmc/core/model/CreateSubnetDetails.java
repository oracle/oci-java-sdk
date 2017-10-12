/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSubnetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateSubnetDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSubnetDetails build() {
            CreateSubnetDetails __instance__ =
                    new CreateSubnetDetails(
                            availabilityDomain,
                            cidrBlock,
                            compartmentId,
                            dhcpOptionsId,
                            displayName,
                            dnsLabel,
                            prohibitPublicIpOnVnic,
                            routeTableId,
                            securityListIds,
                            vcnId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSubnetDetails o) {
            return availabilityDomain(o.getAvailabilityDomain())
                    .cidrBlock(o.getCidrBlock())
                    .compartmentId(o.getCompartmentId())
                    .dhcpOptionsId(o.getDhcpOptionsId())
                    .displayName(o.getDisplayName())
                    .dnsLabel(o.getDnsLabel())
                    .prohibitPublicIpOnVnic(o.getProhibitPublicIpOnVnic())
                    .routeTableId(o.getRouteTableId())
                    .securityListIds(o.getSecurityListIds())
                    .vcnId(o.getVcnId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Availability Domain to contain the subnet.
     * <p>
     * Example: `Uocm:PHX-AD-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The CIDR IP address range of the subnet.
     * <p>
     * Example: `172.16.1.0/24`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    String cidrBlock;

    /**
     * The OCID of the compartment to contain the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the set of DHCP options the subnet will use. If you don't
     * provide a value, the subnet will use the VCN's default set of DHCP options.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
    String dhcpOptionsId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
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
     * This value must be set if you want to use the Internet and VCN Resolver to resolve the
     * hostnames of instances in the subnet. It can only be set if the VCN itself
     * was created with a DNS label.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `subnet123`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    String dnsLabel;

    /**
     * Whether VNICs within this subnet can have public IP addresses.
     * Defaults to false, which means VNICs created in this subnet will
     * automatically be assigned public IP addresses unless specified
     * otherwise during instance launch or VNIC creation (with the
     * `assignPublicIp` flag in {@link CreateVnicDetails}).
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
     * The OCID of the route table the subnet will use. If you don't provide a value,
     * the subnet will use the VCN's default route table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    String routeTableId;

    /**
     * OCIDs for the security lists to associate with the subnet. If you don't
     * provide a value, the VCN's default security list will be associated with
     * the subnet. Remember that security lists are associated at the subnet
     * level, but the rules are applied to the individual VNICs in the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
    java.util.List<String> securityListIds;

    /**
     * The OCID of the VCN to contain the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
