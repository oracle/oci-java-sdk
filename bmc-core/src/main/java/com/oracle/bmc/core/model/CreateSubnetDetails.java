/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSubnetDetails.Builder.class
)
public class CreateSubnetDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("prohibitPublicIpOnVnic")
        private Boolean prohibitPublicIpOnVnic;

        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
        private java.util.List<String> securityListIds;

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public CreateSubnetDetails build() {
            return new CreateSubnetDetails(
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String availabilityDomain;

    /**
     * The CIDR IP address range of the subnet.
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
     * The OCID of the compartment to contain the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * The OCID of the set of DHCP options the subnet will use. If you don't
     * provide a value, the subnet will use the VCN's default set of DHCP options.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String dhcpOptionsId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
     * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (e.g., `bminstance-1.subnet123.vcn1.oraclevcn.com`).
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
    @javax.validation.constraints.Size(min = 1, max = 15)
    String dnsLabel;

    /**
     * Whether VNICs within this subnet can have public IP addresses.
     * Defaults to false, which means VNICs created in this subnet will
     * automatically be assigned public IP addresses unless specified
     * otherwise during instance launch or VNIC creation (with the
     * `assignPublicIp` flag in {@link CreateVnicDetails}).
     * If `prohibitPublicIpOnVnic` is set to true, VNICs created in this
     * subnet cannot have public IP addresses (i.e., it's a private
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
    @javax.validation.constraints.Size(min = 1, max = 255)
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
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vcnId;
}
