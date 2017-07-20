/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateVcnDetails.Builder.class)
public class CreateVcnDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        public CreateVcnDetails build() {
            return new CreateVcnDetails(cidrBlock, compartmentId, displayName, dnsLabel);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVcnDetails o) {
            return cidrBlock(o.getCidrBlock())
                    .compartmentId(o.getCompartmentId())
                    .displayName(o.getDisplayName())
                    .dnsLabel(o.getDnsLabel());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The CIDR IP address block of the VCN.
     * <p>
     * Example: `172.16.0.0/16`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 32)
    String cidrBlock;

    /**
     * The OCID of the compartment to contain the VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String compartmentId;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * A DNS label for the VCN, used in conjunction with the VNIC's hostname and
     * subnet's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (e.g., `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Not required to be unique, but it's a best practice to set unique DNS labels
     * for VCNs in your tenancy. Must be an alphanumeric string that begins with a letter.
     * The value cannot be changed.
     * <p>
     * You must set this value if you want instances to be able to use hostnames to
     * resolve other instances in the VCN. Otherwise the Internet and VCN Resolver
     * will not work.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `vcn1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    @javax.validation.constraints.Size(min = 1, max = 15)
    String dnsLabel;
}
