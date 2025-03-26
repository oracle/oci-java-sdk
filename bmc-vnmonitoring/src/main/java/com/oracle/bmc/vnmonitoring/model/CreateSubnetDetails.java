/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSubnetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSubnetDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "cidrBlock",
        "compartmentId",
        "definedTags",
        "dhcpOptionsId",
        "displayName",
        "dnsLabel",
        "freeformTags",
        "ipv6CidrBlock",
        "ipv6CidrBlocks",
        "prohibitInternetIngress",
        "prohibitPublicIpOnVnic",
        "routeTableId",
        "securityListIds",
        "vcnId"
    })
    public CreateSubnetDetails(
            String availabilityDomain,
            String cidrBlock,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String dhcpOptionsId,
            String displayName,
            String dnsLabel,
            java.util.Map<String, String> freeformTags,
            String ipv6CidrBlock,
            java.util.List<String> ipv6CidrBlocks,
            Boolean prohibitInternetIngress,
            Boolean prohibitPublicIpOnVnic,
            String routeTableId,
            java.util.List<String> securityListIds,
            String vcnId) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.cidrBlock = cidrBlock;
        this.compartmentId = compartmentId;
        this.definedTags = definedTags;
        this.dhcpOptionsId = dhcpOptionsId;
        this.displayName = displayName;
        this.dnsLabel = dnsLabel;
        this.freeformTags = freeformTags;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6CidrBlocks = ipv6CidrBlocks;
        this.prohibitInternetIngress = prohibitInternetIngress;
        this.prohibitPublicIpOnVnic = prohibitPublicIpOnVnic;
        this.routeTableId = routeTableId;
        this.securityListIds = securityListIds;
        this.vcnId = vcnId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Controls whether the subnet is regional or specific to an availability domain. Oracle
         * recommends creating regional subnets because they're more flexible and make it easier to
         * implement failover across availability domains. Originally, AD-specific subnets were the
         * only kind available to use.
         * <p>
         * To create a regional subnet, omit this attribute. Then any resources later created in this
         * subnet (such as a Compute instance) can be created in any availability domain in the region.
         * <p>
         * To instead create an AD-specific subnet, set this attribute to the availability domain you
         * want this subnet to be in. Then any resources later created in this subnet can only be
         * created in that availability domain.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Controls whether the subnet is regional or specific to an availability domain. Oracle
         * recommends creating regional subnets because they're more flexible and make it easier to
         * implement failover across availability domains. Originally, AD-specific subnets were the
         * only kind available to use.
         * <p>
         * To create a regional subnet, omit this attribute. Then any resources later created in this
         * subnet (such as a Compute instance) can be created in any availability domain in the region.
         * <p>
         * To instead create an AD-specific subnet, set this attribute to the availability domain you
         * want this subnet to be in. Then any resources later created in this subnet can only be
         * created in that availability domain.
         * <p>
         * Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The CIDR IP address range of the subnet. The CIDR must maintain the following rules -
         * <p>
         * a. The CIDR block is valid and correctly formatted.
         * b. The new range is within one of the parent VCN ranges.
         * <p>
         * Example: {@code 10.0.1.0/24}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * The CIDR IP address range of the subnet. The CIDR must maintain the following rules -
         * <p>
         * a. The CIDR block is valid and correctly formatted.
         * b. The new range is within one of the parent VCN ranges.
         * <p>
         * Example: {@code 10.0.1.0/24}
         *
         * @param cidrBlock the value to set
         * @return this builder
         **/
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the subnet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the subnet.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options the subnet will use. If you don't
         * provide a value, the subnet uses the VCN's default set of DHCP options.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
        private String dhcpOptionsId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options the subnet will use. If you don't
         * provide a value, the subnet uses the VCN's default set of DHCP options.
         *
         * @param dhcpOptionsId the value to set
         * @return this builder
         **/
        public Builder dhcpOptionsId(String dhcpOptionsId) {
            this.dhcpOptionsId = dhcpOptionsId;
            this.__explicitlySet__.add("dhcpOptionsId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
         * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
         * within this subnet (for example, {@code bminstance1.subnet123.vcn1.oraclevcn.com}).
         * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
         * The value cannot be changed.
         * <p>
         * This value must be set if you want to use the Internet and VCN Resolver to resolve the
         * hostnames of instances in the subnet. It can only be set if the VCN itself
         * was created with a DNS label.
         * <p>
         * For more information, see
         * [DNS in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         * <p>
         * Example: {@code subnet123}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
        private String dnsLabel;

        /**
         * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
         * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
         * within this subnet (for example, {@code bminstance1.subnet123.vcn1.oraclevcn.com}).
         * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
         * The value cannot be changed.
         * <p>
         * This value must be set if you want to use the Internet and VCN Resolver to resolve the
         * hostnames of instances in the subnet. It can only be set if the VCN itself
         * was created with a DNS label.
         * <p>
         * For more information, see
         * [DNS in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         * <p>
         * Example: {@code subnet123}
         *
         * @param dnsLabel the value to set
         * @return this builder
         **/
        public Builder dnsLabel(String dnsLabel) {
            this.dnsLabel = dnsLabel;
            this.__explicitlySet__.add("dnsLabel");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Use this to enable IPv6 addressing for this subnet. The VCN must be enabled for IPv6.
         * You can't change this subnet characteristic later. All subnets are /64 in size. The subnet
         * portion of the IPv6 address is the fourth hextet from the left (1111 in the following example).
         * <p>
         * For important details about IPv6 addressing in a VCN, see [IPv6 Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * Example: {@code 2001:0db8:0123:1111::/64}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
        private String ipv6CidrBlock;

        /**
         * Use this to enable IPv6 addressing for this subnet. The VCN must be enabled for IPv6.
         * You can't change this subnet characteristic later. All subnets are /64 in size. The subnet
         * portion of the IPv6 address is the fourth hextet from the left (1111 in the following example).
         * <p>
         * For important details about IPv6 addressing in a VCN, see [IPv6 Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
         * <p>
         * Example: {@code 2001:0db8:0123:1111::/64}
         *
         * @param ipv6CidrBlock the value to set
         * @return this builder
         **/
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            this.__explicitlySet__.add("ipv6CidrBlock");
            return this;
        }
        /**
         * The list of all IPv6 CIDR blocks (Oracle allocated IPv6 GUA, ULA or private IPv6 CIDR blocks, BYOIPv6 CIDR blocks) for the subnet that meets the following criteria:
         * - The CIDR blocks must be valid.
         * - Multiple CIDR blocks must not overlap each other or the on-premises network CIDR block.
         * - The number of CIDR blocks must not exceed the limit of IPv6 CIDR blocks allowed to a subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlocks")
        private java.util.List<String> ipv6CidrBlocks;

        /**
         * The list of all IPv6 CIDR blocks (Oracle allocated IPv6 GUA, ULA or private IPv6 CIDR blocks, BYOIPv6 CIDR blocks) for the subnet that meets the following criteria:
         * - The CIDR blocks must be valid.
         * - Multiple CIDR blocks must not overlap each other or the on-premises network CIDR block.
         * - The number of CIDR blocks must not exceed the limit of IPv6 CIDR blocks allowed to a subnet.
         *
         * @param ipv6CidrBlocks the value to set
         * @return this builder
         **/
        public Builder ipv6CidrBlocks(java.util.List<String> ipv6CidrBlocks) {
            this.ipv6CidrBlocks = ipv6CidrBlocks;
            this.__explicitlySet__.add("ipv6CidrBlocks");
            return this;
        }
        /**
         * Whether to disallow ingress internet traffic to VNICs within this subnet. Defaults to false.
         * <p>
         * For IPv6, if {@code prohibitInternetIngress} is set to {@code true}, internet access is not allowed for any
         * IPv6s assigned to VNICs in the subnet. Otherwise, ingress internet traffic is allowed by default.
         * <p>
         * {@code prohibitPublicIpOnVnic} will be set to the value of {@code prohibitInternetIngress} to dictate IPv4
         * behavior in this subnet. Only one or the other flag should be specified.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prohibitInternetIngress")
        private Boolean prohibitInternetIngress;

        /**
         * Whether to disallow ingress internet traffic to VNICs within this subnet. Defaults to false.
         * <p>
         * For IPv6, if {@code prohibitInternetIngress} is set to {@code true}, internet access is not allowed for any
         * IPv6s assigned to VNICs in the subnet. Otherwise, ingress internet traffic is allowed by default.
         * <p>
         * {@code prohibitPublicIpOnVnic} will be set to the value of {@code prohibitInternetIngress} to dictate IPv4
         * behavior in this subnet. Only one or the other flag should be specified.
         * <p>
         * Example: {@code true}
         *
         * @param prohibitInternetIngress the value to set
         * @return this builder
         **/
        public Builder prohibitInternetIngress(Boolean prohibitInternetIngress) {
            this.prohibitInternetIngress = prohibitInternetIngress;
            this.__explicitlySet__.add("prohibitInternetIngress");
            return this;
        }
        /**
         * Whether VNICs within this subnet can have public IP addresses.
         * Defaults to false, which means VNICs created in this subnet will
         * automatically be assigned public IP addresses unless specified
         * otherwise during instance launch or VNIC creation (with the
         * {@code assignPublicIp} flag in {@link CreateVnicDetails}).
         * If {@code prohibitPublicIpOnVnic} is set to true, VNICs created in this
         * subnet cannot have public IP addresses (that is, it's a private
         * subnet).
         * <p>
         * If you intend to use an IPv6 CIDR block, you should use the flag {@code prohibitInternetIngress} to
         * specify ingress internet traffic behavior of the subnet.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("prohibitPublicIpOnVnic")
        private Boolean prohibitPublicIpOnVnic;

        /**
         * Whether VNICs within this subnet can have public IP addresses.
         * Defaults to false, which means VNICs created in this subnet will
         * automatically be assigned public IP addresses unless specified
         * otherwise during instance launch or VNIC creation (with the
         * {@code assignPublicIp} flag in {@link CreateVnicDetails}).
         * If {@code prohibitPublicIpOnVnic} is set to true, VNICs created in this
         * subnet cannot have public IP addresses (that is, it's a private
         * subnet).
         * <p>
         * If you intend to use an IPv6 CIDR block, you should use the flag {@code prohibitInternetIngress} to
         * specify ingress internet traffic behavior of the subnet.
         * <p>
         * Example: {@code true}
         *
         * @param prohibitPublicIpOnVnic the value to set
         * @return this builder
         **/
        public Builder prohibitPublicIpOnVnic(Boolean prohibitPublicIpOnVnic) {
            this.prohibitPublicIpOnVnic = prohibitPublicIpOnVnic;
            this.__explicitlySet__.add("prohibitPublicIpOnVnic");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the subnet will use. If you don't provide a value,
         * the subnet uses the VCN's default route table.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
        private String routeTableId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the subnet will use. If you don't provide a value,
         * the subnet uses the VCN's default route table.
         *
         * @param routeTableId the value to set
         * @return this builder
         **/
        public Builder routeTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            this.__explicitlySet__.add("routeTableId");
            return this;
        }
        /**
         * The OCIDs of the security list or lists the subnet will use. If you don't
         * provide a value, the subnet uses the VCN's default security list.
         * Remember that security lists are associated *with the subnet*, but the
         * rules are applied to the individual VNICs in the subnet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
        private java.util.List<String> securityListIds;

        /**
         * The OCIDs of the security list or lists the subnet will use. If you don't
         * provide a value, the subnet uses the VCN's default security list.
         * Remember that security lists are associated *with the subnet*, but the
         * rules are applied to the individual VNICs in the subnet.
         *
         * @param securityListIds the value to set
         * @return this builder
         **/
        public Builder securityListIds(java.util.List<String> securityListIds) {
            this.securityListIds = securityListIds;
            this.__explicitlySet__.add("securityListIds");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN to contain the subnet.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN to contain the subnet.
         * @param vcnId the value to set
         * @return this builder
         **/
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSubnetDetails build() {
            CreateSubnetDetails model =
                    new CreateSubnetDetails(
                            this.availabilityDomain,
                            this.cidrBlock,
                            this.compartmentId,
                            this.definedTags,
                            this.dhcpOptionsId,
                            this.displayName,
                            this.dnsLabel,
                            this.freeformTags,
                            this.ipv6CidrBlock,
                            this.ipv6CidrBlocks,
                            this.prohibitInternetIngress,
                            this.prohibitPublicIpOnVnic,
                            this.routeTableId,
                            this.securityListIds,
                            this.vcnId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSubnetDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("dhcpOptionsId")) {
                this.dhcpOptionsId(model.getDhcpOptionsId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dnsLabel")) {
                this.dnsLabel(model.getDnsLabel());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("ipv6CidrBlock")) {
                this.ipv6CidrBlock(model.getIpv6CidrBlock());
            }
            if (model.wasPropertyExplicitlySet("ipv6CidrBlocks")) {
                this.ipv6CidrBlocks(model.getIpv6CidrBlocks());
            }
            if (model.wasPropertyExplicitlySet("prohibitInternetIngress")) {
                this.prohibitInternetIngress(model.getProhibitInternetIngress());
            }
            if (model.wasPropertyExplicitlySet("prohibitPublicIpOnVnic")) {
                this.prohibitPublicIpOnVnic(model.getProhibitPublicIpOnVnic());
            }
            if (model.wasPropertyExplicitlySet("routeTableId")) {
                this.routeTableId(model.getRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("securityListIds")) {
                this.securityListIds(model.getSecurityListIds());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Controls whether the subnet is regional or specific to an availability domain. Oracle
     * recommends creating regional subnets because they're more flexible and make it easier to
     * implement failover across availability domains. Originally, AD-specific subnets were the
     * only kind available to use.
     * <p>
     * To create a regional subnet, omit this attribute. Then any resources later created in this
     * subnet (such as a Compute instance) can be created in any availability domain in the region.
     * <p>
     * To instead create an AD-specific subnet, set this attribute to the availability domain you
     * want this subnet to be in. Then any resources later created in this subnet can only be
     * created in that availability domain.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Controls whether the subnet is regional or specific to an availability domain. Oracle
     * recommends creating regional subnets because they're more flexible and make it easier to
     * implement failover across availability domains. Originally, AD-specific subnets were the
     * only kind available to use.
     * <p>
     * To create a regional subnet, omit this attribute. Then any resources later created in this
     * subnet (such as a Compute instance) can be created in any availability domain in the region.
     * <p>
     * To instead create an AD-specific subnet, set this attribute to the availability domain you
     * want this subnet to be in. Then any resources later created in this subnet can only be
     * created in that availability domain.
     * <p>
     * Example: {@code Uocm:PHX-AD-1}
     *
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The CIDR IP address range of the subnet. The CIDR must maintain the following rules -
     * <p>
     * a. The CIDR block is valid and correctly formatted.
     * b. The new range is within one of the parent VCN ranges.
     * <p>
     * Example: {@code 10.0.1.0/24}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * The CIDR IP address range of the subnet. The CIDR must maintain the following rules -
     * <p>
     * a. The CIDR block is valid and correctly formatted.
     * b. The new range is within one of the parent VCN ranges.
     * <p>
     * Example: {@code 10.0.1.0/24}
     *
     * @return the value
     **/
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to contain the subnet.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options the subnet will use. If you don't
     * provide a value, the subnet uses the VCN's default set of DHCP options.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dhcpOptionsId")
    private final String dhcpOptionsId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the set of DHCP options the subnet will use. If you don't
     * provide a value, the subnet uses the VCN's default set of DHCP options.
     *
     * @return the value
     **/
    public String getDhcpOptionsId() {
        return dhcpOptionsId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
     * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (for example, {@code bminstance1.subnet123.vcn1.oraclevcn.com}).
     * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
     * The value cannot be changed.
     * <p>
     * This value must be set if you want to use the Internet and VCN Resolver to resolve the
     * hostnames of instances in the subnet. It can only be set if the VCN itself
     * was created with a DNS label.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: {@code subnet123}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dnsLabel")
    private final String dnsLabel;

    /**
     * A DNS label for the subnet, used in conjunction with the VNIC's hostname and
     * VCN's DNS label to form a fully qualified domain name (FQDN) for each VNIC
     * within this subnet (for example, {@code bminstance1.subnet123.vcn1.oraclevcn.com}).
     * Must be an alphanumeric string that begins with a letter and is unique within the VCN.
     * The value cannot be changed.
     * <p>
     * This value must be set if you want to use the Internet and VCN Resolver to resolve the
     * hostnames of instances in the subnet. It can only be set if the VCN itself
     * was created with a DNS label.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: {@code subnet123}
     *
     * @return the value
     **/
    public String getDnsLabel() {
        return dnsLabel;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Use this to enable IPv6 addressing for this subnet. The VCN must be enabled for IPv6.
     * You can't change this subnet characteristic later. All subnets are /64 in size. The subnet
     * portion of the IPv6 address is the fourth hextet from the left (1111 in the following example).
     * <p>
     * For important details about IPv6 addressing in a VCN, see [IPv6 Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:0db8:0123:1111::/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlock")
    private final String ipv6CidrBlock;

    /**
     * Use this to enable IPv6 addressing for this subnet. The VCN must be enabled for IPv6.
     * You can't change this subnet characteristic later. All subnets are /64 in size. The subnet
     * portion of the IPv6 address is the fourth hextet from the left (1111 in the following example).
     * <p>
     * For important details about IPv6 addressing in a VCN, see [IPv6 Addresses](https://docs.oracle.com/iaas/Content/Network/Concepts/ipv6.htm).
     * <p>
     * Example: {@code 2001:0db8:0123:1111::/64}
     *
     * @return the value
     **/
    public String getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * The list of all IPv6 CIDR blocks (Oracle allocated IPv6 GUA, ULA or private IPv6 CIDR blocks, BYOIPv6 CIDR blocks) for the subnet that meets the following criteria:
     * - The CIDR blocks must be valid.
     * - Multiple CIDR blocks must not overlap each other or the on-premises network CIDR block.
     * - The number of CIDR blocks must not exceed the limit of IPv6 CIDR blocks allowed to a subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6CidrBlocks")
    private final java.util.List<String> ipv6CidrBlocks;

    /**
     * The list of all IPv6 CIDR blocks (Oracle allocated IPv6 GUA, ULA or private IPv6 CIDR blocks, BYOIPv6 CIDR blocks) for the subnet that meets the following criteria:
     * - The CIDR blocks must be valid.
     * - Multiple CIDR blocks must not overlap each other or the on-premises network CIDR block.
     * - The number of CIDR blocks must not exceed the limit of IPv6 CIDR blocks allowed to a subnet.
     *
     * @return the value
     **/
    public java.util.List<String> getIpv6CidrBlocks() {
        return ipv6CidrBlocks;
    }

    /**
     * Whether to disallow ingress internet traffic to VNICs within this subnet. Defaults to false.
     * <p>
     * For IPv6, if {@code prohibitInternetIngress} is set to {@code true}, internet access is not allowed for any
     * IPv6s assigned to VNICs in the subnet. Otherwise, ingress internet traffic is allowed by default.
     * <p>
     * {@code prohibitPublicIpOnVnic} will be set to the value of {@code prohibitInternetIngress} to dictate IPv4
     * behavior in this subnet. Only one or the other flag should be specified.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prohibitInternetIngress")
    private final Boolean prohibitInternetIngress;

    /**
     * Whether to disallow ingress internet traffic to VNICs within this subnet. Defaults to false.
     * <p>
     * For IPv6, if {@code prohibitInternetIngress} is set to {@code true}, internet access is not allowed for any
     * IPv6s assigned to VNICs in the subnet. Otherwise, ingress internet traffic is allowed by default.
     * <p>
     * {@code prohibitPublicIpOnVnic} will be set to the value of {@code prohibitInternetIngress} to dictate IPv4
     * behavior in this subnet. Only one or the other flag should be specified.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getProhibitInternetIngress() {
        return prohibitInternetIngress;
    }

    /**
     * Whether VNICs within this subnet can have public IP addresses.
     * Defaults to false, which means VNICs created in this subnet will
     * automatically be assigned public IP addresses unless specified
     * otherwise during instance launch or VNIC creation (with the
     * {@code assignPublicIp} flag in {@link CreateVnicDetails}).
     * If {@code prohibitPublicIpOnVnic} is set to true, VNICs created in this
     * subnet cannot have public IP addresses (that is, it's a private
     * subnet).
     * <p>
     * If you intend to use an IPv6 CIDR block, you should use the flag {@code prohibitInternetIngress} to
     * specify ingress internet traffic behavior of the subnet.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("prohibitPublicIpOnVnic")
    private final Boolean prohibitPublicIpOnVnic;

    /**
     * Whether VNICs within this subnet can have public IP addresses.
     * Defaults to false, which means VNICs created in this subnet will
     * automatically be assigned public IP addresses unless specified
     * otherwise during instance launch or VNIC creation (with the
     * {@code assignPublicIp} flag in {@link CreateVnicDetails}).
     * If {@code prohibitPublicIpOnVnic} is set to true, VNICs created in this
     * subnet cannot have public IP addresses (that is, it's a private
     * subnet).
     * <p>
     * If you intend to use an IPv6 CIDR block, you should use the flag {@code prohibitInternetIngress} to
     * specify ingress internet traffic behavior of the subnet.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getProhibitPublicIpOnVnic() {
        return prohibitPublicIpOnVnic;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the subnet will use. If you don't provide a value,
     * the subnet uses the VCN's default route table.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeTableId")
    private final String routeTableId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the route table the subnet will use. If you don't provide a value,
     * the subnet uses the VCN's default route table.
     *
     * @return the value
     **/
    public String getRouteTableId() {
        return routeTableId;
    }

    /**
     * The OCIDs of the security list or lists the subnet will use. If you don't
     * provide a value, the subnet uses the VCN's default security list.
     * Remember that security lists are associated *with the subnet*, but the
     * rules are applied to the individual VNICs in the subnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityListIds")
    private final java.util.List<String> securityListIds;

    /**
     * The OCIDs of the security list or lists the subnet will use. If you don't
     * provide a value, the subnet uses the VCN's default security list.
     * Remember that security lists are associated *with the subnet*, but the
     * rules are applied to the individual VNICs in the subnet.
     *
     * @return the value
     **/
    public java.util.List<String> getSecurityListIds() {
        return securityListIds;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN to contain the subnet.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN to contain the subnet.
     * @return the value
     **/
    public String getVcnId() {
        return vcnId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateSubnetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", dhcpOptionsId=").append(String.valueOf(this.dhcpOptionsId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dnsLabel=").append(String.valueOf(this.dnsLabel));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", ipv6CidrBlock=").append(String.valueOf(this.ipv6CidrBlock));
        sb.append(", ipv6CidrBlocks=").append(String.valueOf(this.ipv6CidrBlocks));
        sb.append(", prohibitInternetIngress=")
                .append(String.valueOf(this.prohibitInternetIngress));
        sb.append(", prohibitPublicIpOnVnic=").append(String.valueOf(this.prohibitPublicIpOnVnic));
        sb.append(", routeTableId=").append(String.valueOf(this.routeTableId));
        sb.append(", securityListIds=").append(String.valueOf(this.securityListIds));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSubnetDetails)) {
            return false;
        }

        CreateSubnetDetails other = (CreateSubnetDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.dhcpOptionsId, other.dhcpOptionsId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dnsLabel, other.dnsLabel)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.ipv6CidrBlock, other.ipv6CidrBlock)
                && java.util.Objects.equals(this.ipv6CidrBlocks, other.ipv6CidrBlocks)
                && java.util.Objects.equals(
                        this.prohibitInternetIngress, other.prohibitInternetIngress)
                && java.util.Objects.equals(
                        this.prohibitPublicIpOnVnic, other.prohibitPublicIpOnVnic)
                && java.util.Objects.equals(this.routeTableId, other.routeTableId)
                && java.util.Objects.equals(this.securityListIds, other.securityListIds)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.dhcpOptionsId == null ? 43 : this.dhcpOptionsId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dnsLabel == null ? 43 : this.dnsLabel.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlock == null ? 43 : this.ipv6CidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6CidrBlocks == null ? 43 : this.ipv6CidrBlocks.hashCode());
        result =
                (result * PRIME)
                        + (this.prohibitInternetIngress == null
                                ? 43
                                : this.prohibitInternetIngress.hashCode());
        result =
                (result * PRIME)
                        + (this.prohibitPublicIpOnVnic == null
                                ? 43
                                : this.prohibitPublicIpOnVnic.hashCode());
        result = (result * PRIME) + (this.routeTableId == null ? 43 : this.routeTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.securityListIds == null ? 43 : this.securityListIds.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
