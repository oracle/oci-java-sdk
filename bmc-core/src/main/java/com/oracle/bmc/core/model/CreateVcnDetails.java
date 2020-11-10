/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateVcnDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateVcnDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
        private java.util.List<String> cidrBlocks;

        public Builder cidrBlocks(java.util.List<String> cidrBlocks) {
            this.cidrBlocks = cidrBlocks;
            this.__explicitlySet__.add("cidrBlocks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isIpv6Enabled")
        private Boolean isIpv6Enabled;

        public Builder isIpv6Enabled(Boolean isIpv6Enabled) {
            this.isIpv6Enabled = isIpv6Enabled;
            this.__explicitlySet__.add("isIpv6Enabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVcnDetails build() {
            CreateVcnDetails __instance__ =
                    new CreateVcnDetails(
                            cidrBlock,
                            cidrBlocks,
                            compartmentId,
                            ipv6CidrBlock,
                            definedTags,
                            displayName,
                            dnsLabel,
                            freeformTags,
                            isIpv6Enabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVcnDetails o) {
            Builder copiedBuilder =
                    cidrBlock(o.getCidrBlock())
                            .cidrBlocks(o.getCidrBlocks())
                            .compartmentId(o.getCompartmentId())
                            .ipv6CidrBlock(o.getIpv6CidrBlock())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .dnsLabel(o.getDnsLabel())
                            .freeformTags(o.getFreeformTags())
                            .isIpv6Enabled(o.getIsIpv6Enabled());

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
     * Deprecated. Instead use 'cidrBlocks'. It is an error to set both cidrBlock and
     * cidrBlocks.
     * Example: `10.0.0.0/16`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    String cidrBlock;

    /**
     * List of IPv4 CIDR blocks associated with the VCN. The CIDRs must maintain the following
     * rules -
     * <p>
     * a. The list of CIDRs provided are valid
     * b. There is no overlap between different CIDRs
     * c. The number of CIDRs should not exceed the max limit of CIDRs per VCN
     * d. It is an error to set both cidrBlock and cidrBlocks.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlocks")
    java.util.List<String> cidrBlocks;

    /**
     * The OCID of the compartment to contain the VCN.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * If you enable IPv6 for the VCN (see `isIpv6Enabled`), you may optionally provide an IPv6
     * /48 CIDR block from the supported ranges (see [IPv6 Addresses](https://docs.cloud.oracle.com/Content/Network/Concepts/ipv6.htm).
     * The addresses in this block will be considered private and cannot be accessed
     * from the internet. The documentation refers to this as a *custom CIDR* for the VCN.
     * <p>
     * If you don't provide a custom CIDR for the VCN, Oracle assigns the VCN's IPv6 /48 CIDR block.
     * <p>
     * Regardless of whether you or Oracle assigns the `ipv6CidrBlock`,
     * Oracle *also* assigns the VCN an IPv6 CIDR block for the VCN's public IP address space
     * (see the `ipv6PublicCidrBlock` of the {@link Vcn} object). If you do
     * not assign a custom CIDR, Oracle uses the *same* Oracle-assigned CIDR for both the private
     * IP address space (`ipv6CidrBlock` in the `Vcn` object) and the public IP addreses space
     * (`ipv6PublicCidrBlock` in the `Vcn` object). This means that a given VNIC might use the same
     * IPv6 IP address for both private and public (internet) communication. You control whether
     * an IPv6 address can be used for internet communication by using the `isInternetAccessAllowed`
     * attribute in the {@link Ipv6} object.
     * <p>
     * For important details about IPv6 addressing in a VCN, see [IPv6 Addresses](https://docs.cloud.oracle.com/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: `2001:0db8:0123::/48`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    String ipv6CidrBlock;

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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A DNS label for the VCN, used in conjunction with the VNIC's hostname and
     * subnet's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (for example, `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Not required to be unique, but it's a best practice to set unique DNS labels
     * for VCNs in your tenancy. Must be an alphanumeric string that begins with a letter.
     * The value cannot be changed.
     * <p>
     * You must set this value if you want instances to be able to use hostnames to
     * resolve other instances in the VCN. Otherwise the Internet and VCN Resolver
     * will not work.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `vcn1`
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
     * Whether IPv6 is enabled for the VCN. Default is `false`. You cannot change this later.
     * For important details about IPv6 addressing in a VCN, see [IPv6 Addresses](https://docs.cloud.oracle.com/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIpv6Enabled")
    Boolean isIpv6Enabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
