/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSubnetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSubnetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "dhcpOptionsId",
        "displayName",
        "freeformTags",
        "routeTableId",
        "securityListIds",
        "cidrBlock",
        "ipv6CidrBlock",
        "ipv6CidrBlocks"
    })
    public UpdateSubnetDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String dhcpOptionsId,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String routeTableId,
            java.util.List<String> securityListIds,
            String cidrBlock,
            String ipv6CidrBlock,
            java.util.List<String> ipv6CidrBlocks) {
        super();
        this.definedTags = definedTags;
        this.dhcpOptionsId = dhcpOptionsId;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.routeTableId = routeTableId;
        this.securityListIds = securityListIds;
        this.cidrBlock = cidrBlock;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6CidrBlocks = ipv6CidrBlocks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * set of DHCP options the subnet will use.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
        private String dhcpOptionsId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * set of DHCP options the subnet will use.
         *
         * @param dhcpOptionsId the value to set
         * @return this builder
         */
        public Builder dhcpOptionsId(String dhcpOptionsId) {
            this.dhcpOptionsId = dhcpOptionsId;
            this.__explicitlySet__.add("dhcpOptionsId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the subnet will use.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * route table the subnet will use.
         *
         * @param routeTableId the value to set
         * @return this builder
         */
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * The OCIDs of the security list or lists the subnet will use. This replaces the entire
         * current set of security lists. Remember that security lists are associated *with the
         * subnet*, but the rules are applied to the individual VNICs in the subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
        private java.util.List<String> securityListIds;

        /**
         * The OCIDs of the security list or lists the subnet will use. This replaces the entire
         * current set of security lists. Remember that security lists are associated *with the
         * subnet*, but the rules are applied to the individual VNICs in the subnet.
         *
         * @param securityListIds the value to set
         * @return this builder
         */
        public Builder securityListIds(java.util.List<String> securityListIds) {
            this.securityListIds = securityListIds;
            this.__explicitlySet__.add("securityListIds");
            return this;
        }
        /**
         * The CIDR block of the subnet. The new CIDR block must meet the following criteria:
         *
         * <p>- Must be valid. - The CIDR block's IP range must be completely within one of the
         * VCN's CIDR block ranges. - The old and new CIDR block ranges must use the same network
         * address. Example: {@code 10.0.0.0/25} and {@code 10.0.0.0/24}. - Must contain all IP
         * addresses in use in the old CIDR range. - The new CIDR range's broadcast address (last IP
         * address of CIDR range) must not be an IP address in use in the old CIDR range.
         *
         * <p>*Note:** If you are changing the CIDR block, you cannot create VNICs or private IPs
         * for this resource while the update is in progress.
         *
         * <p>Example: {@code 172.16.0.0/16}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * The CIDR block of the subnet. The new CIDR block must meet the following criteria:
         *
         * <p>- Must be valid. - The CIDR block's IP range must be completely within one of the
         * VCN's CIDR block ranges. - The old and new CIDR block ranges must use the same network
         * address. Example: {@code 10.0.0.0/25} and {@code 10.0.0.0/24}. - Must contain all IP
         * addresses in use in the old CIDR range. - The new CIDR range's broadcast address (last IP
         * address of CIDR range) must not be an IP address in use in the old CIDR range.
         *
         * <p>*Note:** If you are changing the CIDR block, you cannot create VNICs or private IPs
         * for this resource while the update is in progress.
         *
         * <p>Example: {@code 172.16.0.0/16}
         *
         * @param cidrBlock the value to set
         * @return this builder
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * This is the IPv6 prefix for the subnet's IP address space. The subnet size is always /64.
         * See [IPv6 Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm). The
         * provided prefix must maintain the following rules -
         *
         * <p>a. The IPv6 prefix is valid and correctly formatted. b. The IPv6 prefix is within the
         * parent VCN IPv6 range.
         *
         * <p>Example: {@code 2001:0db8:0123:1111::/64}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * This is the IPv6 prefix for the subnet's IP address space. The subnet size is always /64.
         * See [IPv6 Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm). The
         * provided prefix must maintain the following rules -
         *
         * <p>a. The IPv6 prefix is valid and correctly formatted. b. The IPv6 prefix is within the
         * parent VCN IPv6 range.
         *
         * <p>Example: {@code 2001:0db8:0123:1111::/64}
         *
         * @param ipv6CidrBlock the value to set
         * @return this builder
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }
        /**
         * The list of all IPv6 prefixes (Oracle allocated IPv6 GUA, ULA or private IPv6 prefix,
         * BYOIPv6 prefixes) for the subnet that meets the following criteria: - The prefixes must
         * be valid. - Multiple prefixes must not overlap each other or the on-premises network
         * prefix. - The number of prefixes must not exceed the limit of IPv6 prefixes allowed to a
         * subnet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlocks")
        private java.util.List<String> ipv6CidrBlocks;

        /**
         * The list of all IPv6 prefixes (Oracle allocated IPv6 GUA, ULA or private IPv6 prefix,
         * BYOIPv6 prefixes) for the subnet that meets the following criteria: - The prefixes must
         * be valid. - Multiple prefixes must not overlap each other or the on-premises network
         * prefix. - The number of prefixes must not exceed the limit of IPv6 prefixes allowed to a
         * subnet.
         *
         * @param ipv6CidrBlocks the value to set
         * @return this builder
         */
        public Builder ipv6CidrBlocks(java.util.List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            this.__explicitlySet__.add("ipv6CidrBlocks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSubnetDetails build() {
            UpdateSubnetDetails model =
                    new UpdateSubnetDetails(
                            this.definedTags,
                            this.dhcpOptionsId,
                            this.displayName,
                            this.freeformTags,
                            this.routeTableId,
                            this.securityListIds,
                            this.cidrBlock,
                            this.ipv6CidrBlock,
                            this.ipv6CidrBlocks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSubnetDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dhcpOptionsId")) {
                this.dhcpOptionsId(model.getDhcpOptionsId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("securityListIds")) {
                this.securityListIds(model.getSecurityListIds());
            }
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("ipv6CidrBlock")) {
                this.ipv6CidrBlock(model.getIpv6CidrBlock());
            }
            if (model.wasPropertyExplicitlySet("ipv6CidrBlocks")) {
                this.ipv6CidrBlocks(model.getIpv6CidrBlocks());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set
     * of DHCP options the subnet will use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
    private final String dhcpOptionsId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set
     * of DHCP options the subnet will use.
     *
     * @return the value
     */
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the subnet will use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * route table the subnet will use.
     *
     * @return the value
     */
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * The OCIDs of the security list or lists the subnet will use. This replaces the entire current
     * set of security lists. Remember that security lists are associated *with the subnet*, but the
     * rules are applied to the individual VNICs in the subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
    private final java.util.List<String> securityListIds;

    /**
     * The OCIDs of the security list or lists the subnet will use. This replaces the entire current
     * set of security lists. Remember that security lists are associated *with the subnet*, but the
     * rules are applied to the individual VNICs in the subnet.
     *
     * @return the value
     */
    public java.util.List<String> getSecurityListIds() {
        return securityListIds;
    }

    /**
     * The CIDR block of the subnet. The new CIDR block must meet the following criteria:
     *
     * <p>- Must be valid. - The CIDR block's IP range must be completely within one of the VCN's
     * CIDR block ranges. - The old and new CIDR block ranges must use the same network address.
     * Example: {@code 10.0.0.0/25} and {@code 10.0.0.0/24}. - Must contain all IP addresses in use
     * in the old CIDR range. - The new CIDR range's broadcast address (last IP address of CIDR
     * range) must not be an IP address in use in the old CIDR range.
     *
     * <p>*Note:** If you are changing the CIDR block, you cannot create VNICs or private IPs for
     * this resource while the update is in progress.
     *
     * <p>Example: {@code 172.16.0.0/16}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * The CIDR block of the subnet. The new CIDR block must meet the following criteria:
     *
     * <p>- Must be valid. - The CIDR block's IP range must be completely within one of the VCN's
     * CIDR block ranges. - The old and new CIDR block ranges must use the same network address.
     * Example: {@code 10.0.0.0/25} and {@code 10.0.0.0/24}. - Must contain all IP addresses in use
     * in the old CIDR range. - The new CIDR range's broadcast address (last IP address of CIDR
     * range) must not be an IP address in use in the old CIDR range.
     *
     * <p>*Note:** If you are changing the CIDR block, you cannot create VNICs or private IPs for
     * this resource while the update is in progress.
     *
     * <p>Example: {@code 172.16.0.0/16}
     *
     * @return the value
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * This is the IPv6 prefix for the subnet's IP address space. The subnet size is always /64. See
     * [IPv6 Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm). The
     * provided prefix must maintain the following rules -
     *
     * <p>a. The IPv6 prefix is valid and correctly formatted. b. The IPv6 prefix is within the
     * parent VCN IPv6 range.
     *
     * <p>Example: {@code 2001:0db8:0123:1111::/64}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * This is the IPv6 prefix for the subnet's IP address space. The subnet size is always /64. See
     * [IPv6 Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm). The
     * provided prefix must maintain the following rules -
     *
     * <p>a. The IPv6 prefix is valid and correctly formatted. b. The IPv6 prefix is within the
     * parent VCN IPv6 range.
     *
     * <p>Example: {@code 2001:0db8:0123:1111::/64}
     *
     * @return the value
     */
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * The list of all IPv6 prefixes (Oracle allocated IPv6 GUA, ULA or private IPv6 prefix, BYOIPv6
     * prefixes) for the subnet that meets the following criteria: - The prefixes must be valid. -
     * Multiple prefixes must not overlap each other or the on-premises network prefix. - The number
     * of prefixes must not exceed the limit of IPv6 prefixes allowed to a subnet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlocks")
    private final java.util.List<String> ipv6CidrBlocks;

    /**
     * The list of all IPv6 prefixes (Oracle allocated IPv6 GUA, ULA or private IPv6 prefix, BYOIPv6
     * prefixes) for the subnet that meets the following criteria: - The prefixes must be valid. -
     * Multiple prefixes must not overlap each other or the on-premises network prefix. - The number
     * of prefixes must not exceed the limit of IPv6 prefixes allowed to a subnet.
     *
     * @return the value
     */
    public java.util.List<String> getIpv6CidrBlocks() {
        return ipv6CidrBlocks;
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
        sb.append("UpdateSubnetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dhcpOptionsId=").append(String.valueOf(this.dhcpOptionsId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", securityListIds=").append(String.valueOf(this.securityListIds));
        sb.append(", cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", ipv6CidrBlock=").append(String.valueOf(this.ipv6CidrBlock));
        sb.append(", ipv6CidrBlocks=").append(String.valueOf(this.ipv6CidrBlocks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSubnetDetails)) {
            return false;
        }

        UpdateSubnetDetails other = (UpdateSubnetDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dhcpOptionsId, other.dhcpOptionsId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.securityListIds, other.securityListIds)
                && java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.ipv6CidrBlock, other.ipv6CidrBlock)
                && java.util.Objects.equals(this.ipv6CidrBlocks, other.ipv6CidrBlocks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dhcpOptionsId == null ? 43 : this.dhcpOptionsId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityListIds == null ? 43 : this.securityListIds.hashCode());
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlock == null ? 43 : this.ipv6CidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlocks == null ? 43 : this.ipv6CidrBlocks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
