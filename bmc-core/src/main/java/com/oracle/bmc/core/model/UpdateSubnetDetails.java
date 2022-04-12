/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateSubnetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateSubnetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlocks")
        private java.util.List<String> ipv6CidrBlocks;

        public Builder ipv6CidrBlocks(java.util.List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            this.__explicitlySet__.add("ipv6CidrBlocks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSubnetDetails build() {
            UpdateSubnetDetails __instance__ =
                    new UpdateSubnetDetails(
                            definedTags,
                            dhcpOptionsId,
                            displayName,
                            freeformTags,
                            routeTableId,
                            securityListIds,
                            cidrBlock,
                            ipv6CidrBlock,
                            ipv6CidrBlocks);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSubnetDetails o) {
            Builder copiedBuilder =
                    definedTags(o.getDefinedTags())
                            .dhcpOptionsId(o.getDhcpOptionsId())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .routeTableId(o.getRouteTableId())
                            .securityListIds(o.getSecurityListIds())
                            .cidrBlock(o.getCidrBlock())
                            .ipv6CidrBlock(o.getIpv6CidrBlock())
                            .ipv6CidrBlocks(o.getIpv6CidrBlocks());

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
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options the subnet will use.
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
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the subnet will use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    String routeTableId;

    /**
     * The OCIDs of the security list or lists the subnet will use. This
     * replaces the entire current set of security lists. Remember that
     * security lists are associated *with the subnet*, but the rules are
     * applied to the individual VNICs in the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
    java.util.List<String> securityListIds;

    /**
     * The CIDR block of the subnet. The new CIDR block must meet the following criteria:
     * <p>
     * - Must be valid.
     * - The CIDR block's IP range must be completely within one of the VCN's CIDR block ranges.
     * - The old and new CIDR block ranges must use the same network address. Example: {@code 10.0.0.0/25} and {@code 10.0.0.0/24}.
     * - Must contain all IP addresses in use in the old CIDR range.
     * - The new CIDR range's broadcast address (last IP address of CIDR range) must not be an IP address in use in the old CIDR range.
     * <p>
     **Note:** If you are changing the CIDR block, you cannot create VNICs or private IPs for this resource while the update is in progress.
     * <p>
     * Example: {@code 172.16.0.0/16}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    String cidrBlock;

    /**
     * This is the IPv6 CIDR block for the subnet's IP address space.
     * The subnet size is always /64.
     * See [IPv6 Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * The provided CIDR must maintain the following rules -
     * <p>
     * a. The IPv6 CIDR block is valid and correctly formatted.
     * b. The IPv6 CIDR is within the parent VCN IPv6 range.
     * <p>
     * Example: {@code 2001:0db8:0123:1111::/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    String ipv6CidrBlock;

    /**
     * The list of all IPv6 CIDR blocks (Oracle allocated IPv6 GUA, ULA or private IPv6 CIDR blocks, BYOIPv6 CIDR blocks) for the subnet that meets the following criteria:
     * - The CIDR blocks must be valid.
     * - Multiple CIDR blocks must not overlap each other or the on-premises network CIDR block.
     * - The number of CIDR blocks must not exceed the limit of IPv6 CIDR blocks allowed to a subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlocks")
    java.util.List<String> ipv6CidrBlocks;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
