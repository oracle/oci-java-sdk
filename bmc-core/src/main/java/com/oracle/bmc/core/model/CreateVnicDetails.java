/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Contains properties for a VNIC. You use this object when creating the primary VNIC during
 * instance launch or when creating a secondary VNIC. For more information about VNICs, see [Virtual
 * Network Interface Cards
 * (VNICs)](https://docs.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm). <br>
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
        builder = CreateVnicDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVnicDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assignIpv6Ip",
        "assignPublicIp",
        "assignPrivateDnsRecord",
        "definedTags",
        "displayName",
        "freeformTags",
        "securityAttributes",
        "hostnameLabel",
        "ipv6AddressIpv6SubnetCidrPairDetails",
        "subnetCidr",
        "nsgIds",
        "privateIp",
        "skipSourceDestCheck",
        "subnetId",
        "vlanId"
    })
    public CreateVnicDetails(
            Boolean assignIpv6Ip,
            Boolean assignPublicIp,
            Boolean assignPrivateDnsRecord,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> securityAttributes,
            String hostnameLabel,
            java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
                    ipv6AddressIpv6SubnetCidrPairDetails,
            String subnetCidr,
            java.util.List<String> nsgIds,
            String privateIp,
            Boolean skipSourceDestCheck,
            String subnetId,
            String vlanId) {
        super();
        this.assignIpv6Ip = assignIpv6Ip;
        this.assignPublicIp = assignPublicIp;
        this.assignPrivateDnsRecord = assignPrivateDnsRecord;
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.securityAttributes = securityAttributes;
        this.hostnameLabel = hostnameLabel;
        this.ipv6AddressIpv6SubnetCidrPairDetails = ipv6AddressIpv6SubnetCidrPairDetails;
        this.subnetCidr = subnetCidr;
        this.nsgIds = nsgIds;
        this.privateIp = privateIp;
        this.skipSourceDestCheck = skipSourceDestCheck;
        this.subnetId = subnetId;
        this.vlanId = vlanId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
         * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
         * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code
         * ipv6SubnetCidr} is not provided then an IPv6 prefix is chosen for you.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignIpv6Ip")
        private Boolean assignIpv6Ip;

        /**
         * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
         * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
         * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code
         * ipv6SubnetCidr} is not provided then an IPv6 prefix is chosen for you.
         *
         * @param assignIpv6Ip the value to set
         * @return this builder
         */
        public Builder assignIpv6Ip(Boolean assignIpv6Ip) {
            this.assignIpv6Ip = assignIpv6Ip;
            this.__explicitlySet__.add("assignIpv6Ip");
            return this;
        }
        /**
         * Whether the VNIC should be assigned a public IP address. Defaults to whether the subnet
         * is public or private. If not set and the VNIC is being created in a private subnet (that
         * is, where {@code prohibitPublicIpOnVnic} = true in the {@link Subnet}), then no public IP
         * address is assigned. If not set and the subnet is public ({@code prohibitPublicIpOnVnic}
         * = false), then a public IP address is assigned. If set to true and {@code
         * prohibitPublicIpOnVnic} = true, an error is returned.
         *
         * <p>*Note:** This public IP address is associated with the primary private IP on the VNIC.
         * For more information, see [IP
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingIPaddresses.htm).
         *
         * <p>*Note:** There's a limit to the number of {@link PublicIp} a VNIC or instance can
         * have. If you try to create a secondary VNIC with an assigned public IP for an instance
         * that has already reached its public IP limit, an error is returned. For information about
         * the public IP limits, see [Public IP
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
         *
         * <p>Example: {@code false}
         *
         * <p>If you specify a {@code vlanId}, then {@code assignPublicIp} must be set to false. See
         * {@link Vlan}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
        private Boolean assignPublicIp;

        /**
         * Whether the VNIC should be assigned a public IP address. Defaults to whether the subnet
         * is public or private. If not set and the VNIC is being created in a private subnet (that
         * is, where {@code prohibitPublicIpOnVnic} = true in the {@link Subnet}), then no public IP
         * address is assigned. If not set and the subnet is public ({@code prohibitPublicIpOnVnic}
         * = false), then a public IP address is assigned. If set to true and {@code
         * prohibitPublicIpOnVnic} = true, an error is returned.
         *
         * <p>*Note:** This public IP address is associated with the primary private IP on the VNIC.
         * For more information, see [IP
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingIPaddresses.htm).
         *
         * <p>*Note:** There's a limit to the number of {@link PublicIp} a VNIC or instance can
         * have. If you try to create a secondary VNIC with an assigned public IP for an instance
         * that has already reached its public IP limit, an error is returned. For information about
         * the public IP limits, see [Public IP
         * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
         *
         * <p>Example: {@code false}
         *
         * <p>If you specify a {@code vlanId}, then {@code assignPublicIp} must be set to false. See
         * {@link Vlan}.
         *
         * @param assignPublicIp the value to set
         * @return this builder
         */
        public Builder assignPublicIp(Boolean assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            this.__explicitlySet__.add("assignPublicIp");
            return this;
        }
        /**
         * Whether the VNIC should be assigned a DNS record. If set to false, there will be no DNS
         * record registration for the VNIC. If set to true, the DNS record will be registered. The
         * default value is true.
         *
         * <p>If you specify a {@code hostnameLabel}, then {@code assignPrivateDnsRecord} must be
         * set to true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("assignPrivateDnsRecord")
        private Boolean assignPrivateDnsRecord;

        /**
         * Whether the VNIC should be assigned a DNS record. If set to false, there will be no DNS
         * record registration for the VNIC. If set to true, the DNS record will be registered. The
         * default value is true.
         *
         * <p>If you specify a {@code hostnameLabel}, then {@code assignPrivateDnsRecord} must be
         * set to true.
         *
         * @param assignPrivateDnsRecord the value to set
         * @return this builder
         */
        public Builder assignPrivateDnsRecord(Boolean assignPrivateDnsRecord) {
            this.assignPrivateDnsRecord = assignPrivateDnsRecord;
            this.__explicitlySet__.add("assignPrivateDnsRecord");
            return this;
        }
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
         * [Security
         * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
        private java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

        /**
         * [Security
         * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
         * are labels for a resource that can be referenced in a [Zero Trust Packet
         * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm)
         * (ZPR) policy to control access to ZPR-supported resources.
         *
         * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
         * {"value":"42","mode":"audit"}}}}
         *
         * @param securityAttributes the value to set
         * @return this builder
         */
        public Builder securityAttributes(
                java.util.Map<String, java.util.Map<String, Object>> securityAttributes) {
            this.securityAttributes = securityAttributes;
            this.__explicitlySet__.add("securityAttributes");
            return this;
        }
        /**
         * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
         * portion of the primary private IP's fully qualified domain name (FQDN) (for example,
         * {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be
         * unique across all VNICs in the subnet and comply with [RFC
         * 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123). The value appears in the {@link Vnic} object
         * and also the {@link PrivateIp} object returned by {@link
         * #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
         * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>When launching an instance, use this {@code hostnameLabel} instead of the deprecated
         * {@code hostnameLabel} in {@link #launchInstanceDetails(LaunchInstanceDetailsRequest)
         * launchInstanceDetails}. If you provide both, the values must match.
         *
         * <p>Example: {@code bminstance1}
         *
         * <p>If you specify a {@code vlanId}, the {@code hostnameLabel} cannot be specified. VNICs
         * on a VLAN can not be assigned a hostname. See {@link Vlan}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
         * portion of the primary private IP's fully qualified domain name (FQDN) (for example,
         * {@code bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be
         * unique across all VNICs in the subnet and comply with [RFC
         * 952](https://tools.ietf.org/html/rfc952) and [RFC
         * 1123](https://tools.ietf.org/html/rfc1123). The value appears in the {@link Vnic} object
         * and also the {@link PrivateIp} object returned by {@link
         * #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
         * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
         *
         * <p>For more information, see [DNS in Your Virtual Cloud
         * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
         *
         * <p>When launching an instance, use this {@code hostnameLabel} instead of the deprecated
         * {@code hostnameLabel} in {@link #launchInstanceDetails(LaunchInstanceDetailsRequest)
         * launchInstanceDetails}. If you provide both, the values must match.
         *
         * <p>Example: {@code bminstance1}
         *
         * <p>If you specify a {@code vlanId}, the {@code hostnameLabel} cannot be specified. VNICs
         * on a VLAN can not be assigned a hostname. See {@link Vlan}.
         *
         * @param hostnameLabel the value to set
         * @return this builder
         */
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }
        /**
         * A list of IPv6 prefix ranges from which the VNIC is assigned an IPv6 address. You can
         * provide only the prefix ranges from which OCI selects an available address from the
         * range. You can optionally choose to leave the prefix range empty and instead provide the
         * specific IPv6 address within that range to use.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6AddressIpv6SubnetCidrPairDetails")
        private java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
                ipv6AddressIpv6SubnetCidrPairDetails;

        /**
         * A list of IPv6 prefix ranges from which the VNIC is assigned an IPv6 address. You can
         * provide only the prefix ranges from which OCI selects an available address from the
         * range. You can optionally choose to leave the prefix range empty and instead provide the
         * specific IPv6 address within that range to use.
         *
         * @param ipv6AddressIpv6SubnetCidrPairDetails the value to set
         * @return this builder
         */
        public Builder ipv6AddressIpv6SubnetCidrPairDetails(
                java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
                        ipv6AddressIpv6SubnetCidrPairDetails) {
            this.ipv6AddressIpv6SubnetCidrPairDetails = ipv6AddressIpv6SubnetCidrPairDetails;
            this.__explicitlySet__.add("ipv6AddressIpv6SubnetCidrPairDetails");
            return this;
        }
        /**
         * One of the IPv4 CIDR blocks allocated to the subnet. Represents the IP range from which
         * the VNIC's private IP address will be assigned if {@code privateIp} or {@code
         * privateIpId} is not specified. Either this field or the {@code privateIp} (or {@code
         * privateIpId}, if applicable) field must be provided, but not both simultaneously.
         * Example: {@code 192.168.1.0/28}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetCidr")
        private String subnetCidr;

        /**
         * One of the IPv4 CIDR blocks allocated to the subnet. Represents the IP range from which
         * the VNIC's private IP address will be assigned if {@code privateIp} or {@code
         * privateIpId} is not specified. Either this field or the {@code privateIp} (or {@code
         * privateIpId}, if applicable) field must be provided, but not both simultaneously.
         * Example: {@code 192.168.1.0/28}
         *
         * @param subnetCidr the value to set
         * @return this builder
         */
        public Builder subnetCidr(String subnetCidr) {
            this.subnetCidr = subnetCidr;
            this.__explicitlySet__.add("subnetCidr");
            return this;
        }
        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
         * information about NSGs, see {@link NetworkSecurityGroup}.
         *
         * <p>If a {@code vlanId} is specified, the {@code nsgIds} cannot be specified. The {@code
         * vlanId} indicates that the VNIC will belong to a VLAN instead of a subnet. With VLANs,
         * all VNICs in the VLAN belong to the NSGs that are associated with the VLAN. See {@link
         * Vlan}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
         * information about NSGs, see {@link NetworkSecurityGroup}.
         *
         * <p>If a {@code vlanId} is specified, the {@code nsgIds} cannot be specified. The {@code
         * vlanId} indicates that the VNIC will belong to a VLAN instead of a subnet. With VLANs,
         * all VNICs in the VLAN belong to the NSGs that are associated with the VLAN. See {@link
         * Vlan}.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }
        /**
         * A private IP address of your choice to assign to the VNIC. Must be an available IP
         * address within the subnet's CIDR. If you don't specify a value, Oracle automatically
         * assigns a private IP address from the subnet. This is the VNIC's *primary* private IP
         * address. The value appears in the {@link Vnic} object and also the {@link PrivateIp}
         * object returned by {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and
         * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
         *
         * <p>If you specify a {@code vlanId}, the {@code privateIp} cannot be specified. See {@link
         * Vlan}.
         *
         * <p>Example: {@code 10.0.3.3}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        /**
         * A private IP address of your choice to assign to the VNIC. Must be an available IP
         * address within the subnet's CIDR. If you don't specify a value, Oracle automatically
         * assigns a private IP address from the subnet. This is the VNIC's *primary* private IP
         * address. The value appears in the {@link Vnic} object and also the {@link PrivateIp}
         * object returned by {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and
         * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
         *
         * <p>If you specify a {@code vlanId}, the {@code privateIp} cannot be specified. See {@link
         * Vlan}.
         *
         * <p>Example: {@code 10.0.3.3}
         *
         * @param privateIp the value to set
         * @return this builder
         */
        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }
        /**
         * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
         * which means the check is performed. For information about why you would skip the
         * source/destination check, see [Using a Private IP as a Route
         * Target](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
         *
         * <p>If you specify a {@code vlanId}, the {@code skipSourceDestCheck} cannot be specified
         * because the source/destination check is always disabled for VNICs in a VLAN. See {@link
         * Vlan}.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
        private Boolean skipSourceDestCheck;

        /**
         * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
         * which means the check is performed. For information about why you would skip the
         * source/destination check, see [Using a Private IP as a Route
         * Target](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
         *
         * <p>If you specify a {@code vlanId}, the {@code skipSourceDestCheck} cannot be specified
         * because the source/destination check is always disabled for VNICs in a VLAN. See {@link
         * Vlan}.
         *
         * <p>Example: {@code true}
         *
         * @param skipSourceDestCheck the value to set
         * @return this builder
         */
        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = skipSourceDestCheck;
            this.__explicitlySet__.add("skipSourceDestCheck");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet to create the VNIC in. When launching an instance, use this {@code subnetId}
         * instead of the deprecated {@code subnetId} in {@link
         * #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}. At least one
         * of them is required; if you provide both, the values must match.
         *
         * <p>If you are an Oracle Cloud VMware Solution customer and creating a secondary VNIC in a
         * VLAN instead of a subnet, provide a {@code vlanId} instead of a {@code subnetId}. If you
         * provide both a {@code vlanId} and {@code subnetId}, the request fails.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet to create the VNIC in. When launching an instance, use this {@code subnetId}
         * instead of the deprecated {@code subnetId} in {@link
         * #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}. At least one
         * of them is required; if you provide both, the values must match.
         *
         * <p>If you are an Oracle Cloud VMware Solution customer and creating a secondary VNIC in a
         * VLAN instead of a subnet, provide a {@code vlanId} instead of a {@code subnetId}. If you
         * provide both a {@code vlanId} and {@code subnetId}, the request fails.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * Provide this attribute only if you are an Oracle Cloud VMware Solution customer and
         * creating a secondary VNIC in a VLAN. The value is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN. See {@link Vlan}.
         *
         * <p>Provide a {@code vlanId} instead of a {@code subnetId}. If you provide both a {@code
         * vlanId} and {@code subnetId}, the request fails.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * Provide this attribute only if you are an Oracle Cloud VMware Solution customer and
         * creating a secondary VNIC in a VLAN. The value is the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VLAN. See {@link Vlan}.
         *
         * <p>Provide a {@code vlanId} instead of a {@code subnetId}. If you provide both a {@code
         * vlanId} and {@code subnetId}, the request fails.
         *
         * @param vlanId the value to set
         * @return this builder
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVnicDetails build() {
            CreateVnicDetails model =
                    new CreateVnicDetails(
                            this.assignIpv6Ip,
                            this.assignPublicIp,
                            this.assignPrivateDnsRecord,
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.securityAttributes,
                            this.hostnameLabel,
                            this.ipv6AddressIpv6SubnetCidrPairDetails,
                            this.subnetCidr,
                            this.nsgIds,
                            this.privateIp,
                            this.skipSourceDestCheck,
                            this.subnetId,
                            this.vlanId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVnicDetails model) {
            if (model.wasPropertyExplicitlySet("assignIpv6Ip")) {
                this.assignIpv6Ip(model.getAssignIpv6Ip());
            }
            if (model.wasPropertyExplicitlySet("assignPublicIp")) {
                this.assignPublicIp(model.getAssignPublicIp());
            }
            if (model.wasPropertyExplicitlySet("assignPrivateDnsRecord")) {
                this.assignPrivateDnsRecord(model.getAssignPrivateDnsRecord());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("securityAttributes")) {
                this.securityAttributes(model.getSecurityAttributes());
            }
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("ipv6AddressIpv6SubnetCidrPairDetails")) {
                this.ipv6AddressIpv6SubnetCidrPairDetails(
                        model.getIpv6AddressIpv6SubnetCidrPairDetails());
            }
            if (model.wasPropertyExplicitlySet("subnetCidr")) {
                this.subnetCidr(model.getSubnetCidr());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
            }
            if (model.wasPropertyExplicitlySet("privateIp")) {
                this.privateIp(model.getPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("skipSourceDestCheck")) {
                this.skipSourceDestCheck(model.getSkipSourceDestCheck());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
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
     * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
     * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
     * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code ipv6SubnetCidr} is
     * not provided then an IPv6 prefix is chosen for you.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignIpv6Ip")
    private final Boolean assignIpv6Ip;

    /**
     * Whether to allocate an IPv6 address at instance and VNIC creation from an IPv6 enabled
     * subnet. Default: False. When provided you may optionally provide an IPv6 prefix ({@code
     * ipv6SubnetCidr}) of your choice to assign the IPv6 address from. If {@code ipv6SubnetCidr} is
     * not provided then an IPv6 prefix is chosen for you.
     *
     * @return the value
     */
    public Boolean getAssignIpv6Ip() {
        return assignIpv6Ip;
    }

    /**
     * Whether the VNIC should be assigned a public IP address. Defaults to whether the subnet is
     * public or private. If not set and the VNIC is being created in a private subnet (that is,
     * where {@code prohibitPublicIpOnVnic} = true in the {@link Subnet}), then no public IP address
     * is assigned. If not set and the subnet is public ({@code prohibitPublicIpOnVnic} = false),
     * then a public IP address is assigned. If set to true and {@code prohibitPublicIpOnVnic} =
     * true, an error is returned.
     *
     * <p>*Note:** This public IP address is associated with the primary private IP on the VNIC. For
     * more information, see [IP
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingIPaddresses.htm).
     *
     * <p>*Note:** There's a limit to the number of {@link PublicIp} a VNIC or instance can have. If
     * you try to create a secondary VNIC with an assigned public IP for an instance that has
     * already reached its public IP limit, an error is returned. For information about the public
     * IP limits, see [Public IP
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
     *
     * <p>Example: {@code false}
     *
     * <p>If you specify a {@code vlanId}, then {@code assignPublicIp} must be set to false. See
     * {@link Vlan}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
    private final Boolean assignPublicIp;

    /**
     * Whether the VNIC should be assigned a public IP address. Defaults to whether the subnet is
     * public or private. If not set and the VNIC is being created in a private subnet (that is,
     * where {@code prohibitPublicIpOnVnic} = true in the {@link Subnet}), then no public IP address
     * is assigned. If not set and the subnet is public ({@code prohibitPublicIpOnVnic} = false),
     * then a public IP address is assigned. If set to true and {@code prohibitPublicIpOnVnic} =
     * true, an error is returned.
     *
     * <p>*Note:** This public IP address is associated with the primary private IP on the VNIC. For
     * more information, see [IP
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingIPaddresses.htm).
     *
     * <p>*Note:** There's a limit to the number of {@link PublicIp} a VNIC or instance can have. If
     * you try to create a secondary VNIC with an assigned public IP for an instance that has
     * already reached its public IP limit, an error is returned. For information about the public
     * IP limits, see [Public IP
     * Addresses](https://docs.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
     *
     * <p>Example: {@code false}
     *
     * <p>If you specify a {@code vlanId}, then {@code assignPublicIp} must be set to false. See
     * {@link Vlan}.
     *
     * @return the value
     */
    public Boolean getAssignPublicIp() {
        return assignPublicIp;
    }

    /**
     * Whether the VNIC should be assigned a DNS record. If set to false, there will be no DNS
     * record registration for the VNIC. If set to true, the DNS record will be registered. The
     * default value is true.
     *
     * <p>If you specify a {@code hostnameLabel}, then {@code assignPrivateDnsRecord} must be set to
     * true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("assignPrivateDnsRecord")
    private final Boolean assignPrivateDnsRecord;

    /**
     * Whether the VNIC should be assigned a DNS record. If set to false, there will be no DNS
     * record registration for the VNIC. If set to true, the DNS record will be registered. The
     * default value is true.
     *
     * <p>If you specify a {@code hostnameLabel}, then {@code assignPrivateDnsRecord} must be set to
     * true.
     *
     * @return the value
     */
    public Boolean getAssignPrivateDnsRecord() {
        return assignPrivateDnsRecord;
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
     * [Security
     * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm) (ZPR)
     * policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityAttributes")
    private final java.util.Map<String, java.util.Map<String, Object>> securityAttributes;

    /**
     * [Security
     * attributes](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/zpr-artifacts.htm#security-attributes)
     * are labels for a resource that can be referenced in a [Zero Trust Packet
     * Routing](https://docs.oracle.com/iaas/Content/zero-trust-packet-routing/overview.htm) (ZPR)
     * policy to control access to ZPR-supported resources.
     *
     * <p>Example: {@code {"Oracle-DataSecurity-ZPR": {"MaxEgressCount":
     * {"value":"42","mode":"audit"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSecurityAttributes() {
        return securityAttributes;
    }

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN) (for example, {@code
     * bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across
     * all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123). The value appears in the {@link Vnic} object
     * and also the {@link PrivateIp} object returned by {@link
     * #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
     * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>When launching an instance, use this {@code hostnameLabel} instead of the deprecated
     * {@code hostnameLabel} in {@link #launchInstanceDetails(LaunchInstanceDetailsRequest)
     * launchInstanceDetails}. If you provide both, the values must match.
     *
     * <p>Example: {@code bminstance1}
     *
     * <p>If you specify a {@code vlanId}, the {@code hostnameLabel} cannot be specified. VNICs on a
     * VLAN can not be assigned a hostname. See {@link Vlan}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN) (for example, {@code
     * bminstance1} in FQDN {@code bminstance1.subnet123.vcn1.oraclevcn.com}). Must be unique across
     * all VNICs in the subnet and comply with [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123). The value appears in the {@link Vnic} object
     * and also the {@link PrivateIp} object returned by {@link
     * #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
     * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
     *
     * <p>For more information, see [DNS in Your Virtual Cloud
     * Network](https://docs.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     *
     * <p>When launching an instance, use this {@code hostnameLabel} instead of the deprecated
     * {@code hostnameLabel} in {@link #launchInstanceDetails(LaunchInstanceDetailsRequest)
     * launchInstanceDetails}. If you provide both, the values must match.
     *
     * <p>Example: {@code bminstance1}
     *
     * <p>If you specify a {@code vlanId}, the {@code hostnameLabel} cannot be specified. VNICs on a
     * VLAN can not be assigned a hostname. See {@link Vlan}.
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * A list of IPv6 prefix ranges from which the VNIC is assigned an IPv6 address. You can provide
     * only the prefix ranges from which OCI selects an available address from the range. You can
     * optionally choose to leave the prefix range empty and instead provide the specific IPv6
     * address within that range to use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6AddressIpv6SubnetCidrPairDetails")
    private final java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
            ipv6AddressIpv6SubnetCidrPairDetails;

    /**
     * A list of IPv6 prefix ranges from which the VNIC is assigned an IPv6 address. You can provide
     * only the prefix ranges from which OCI selects an available address from the range. You can
     * optionally choose to leave the prefix range empty and instead provide the specific IPv6
     * address within that range to use.
     *
     * @return the value
     */
    public java.util.List<Ipv6AddressIpv6SubnetCidrPairDetails>
            getIpv6AddressIpv6SubnetCidrPairDetails() {
        return ipv6AddressIpv6SubnetCidrPairDetails;
    }

    /**
     * One of the IPv4 CIDR blocks allocated to the subnet. Represents the IP range from which the
     * VNIC's private IP address will be assigned if {@code privateIp} or {@code privateIpId} is not
     * specified. Either this field or the {@code privateIp} (or {@code privateIpId}, if applicable)
     * field must be provided, but not both simultaneously. Example: {@code 192.168.1.0/28}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetCidr")
    private final String subnetCidr;

    /**
     * One of the IPv4 CIDR blocks allocated to the subnet. Represents the IP range from which the
     * VNIC's private IP address will be assigned if {@code privateIp} or {@code privateIpId} is not
     * specified. Either this field or the {@code privateIp} (or {@code privateIpId}, if applicable)
     * field must be provided, but not both simultaneously. Example: {@code 192.168.1.0/28}
     *
     * @return the value
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
     * information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * <p>If a {@code vlanId} is specified, the {@code nsgIds} cannot be specified. The {@code
     * vlanId} indicates that the VNIC will belong to a VLAN instead of a subnet. With VLANs, all
     * VNICs in the VLAN belong to the NSGs that are associated with the VLAN. See {@link Vlan}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
     * information about NSGs, see {@link NetworkSecurityGroup}.
     *
     * <p>If a {@code vlanId} is specified, the {@code nsgIds} cannot be specified. The {@code
     * vlanId} indicates that the VNIC will belong to a VLAN instead of a subnet. With VLANs, all
     * VNICs in the VLAN belong to the NSGs that are associated with the VLAN. See {@link Vlan}.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
    }

    /**
     * A private IP address of your choice to assign to the VNIC. Must be an available IP address
     * within the subnet's CIDR. If you don't specify a value, Oracle automatically assigns a
     * private IP address from the subnet. This is the VNIC's *primary* private IP address. The
     * value appears in the {@link Vnic} object and also the {@link PrivateIp} object returned by
     * {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
     * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
     *
     * <p>If you specify a {@code vlanId}, the {@code privateIp} cannot be specified. See {@link
     * Vlan}.
     *
     * <p>Example: {@code 10.0.3.3}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    private final String privateIp;

    /**
     * A private IP address of your choice to assign to the VNIC. Must be an available IP address
     * within the subnet's CIDR. If you don't specify a value, Oracle automatically assigns a
     * private IP address from the subnet. This is the VNIC's *primary* private IP address. The
     * value appears in the {@link Vnic} object and also the {@link PrivateIp} object returned by
     * {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and {@link
     * #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
     *
     * <p>If you specify a {@code vlanId}, the {@code privateIp} cannot be specified. See {@link
     * Vlan}.
     *
     * <p>Example: {@code 10.0.3.3}
     *
     * @return the value
     */
    public String getPrivateIp() {
        return privateIp;
    }

    /**
     * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
     * which means the check is performed. For information about why you would skip the
     * source/destination check, see [Using a Private IP as a Route
     * Target](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     *
     * <p>If you specify a {@code vlanId}, the {@code skipSourceDestCheck} cannot be specified
     * because the source/destination check is always disabled for VNICs in a VLAN. See {@link
     * Vlan}.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
    private final Boolean skipSourceDestCheck;

    /**
     * Whether the source/destination check is disabled on the VNIC. Defaults to {@code false},
     * which means the check is performed. For information about why you would skip the
     * source/destination check, see [Using a Private IP as a Route
     * Target](https://docs.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     *
     * <p>If you specify a {@code vlanId}, the {@code skipSourceDestCheck} cannot be specified
     * because the source/destination check is always disabled for VNICs in a VLAN. See {@link
     * Vlan}.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getSkipSourceDestCheck() {
        return skipSourceDestCheck;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet to create the VNIC in. When launching an instance, use this {@code subnetId} instead
     * of the deprecated {@code subnetId} in {@link
     * #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}. At least one of
     * them is required; if you provide both, the values must match.
     *
     * <p>If you are an Oracle Cloud VMware Solution customer and creating a secondary VNIC in a
     * VLAN instead of a subnet, provide a {@code vlanId} instead of a {@code subnetId}. If you
     * provide both a {@code vlanId} and {@code subnetId}, the request fails.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet to create the VNIC in. When launching an instance, use this {@code subnetId} instead
     * of the deprecated {@code subnetId} in {@link
     * #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}. At least one of
     * them is required; if you provide both, the values must match.
     *
     * <p>If you are an Oracle Cloud VMware Solution customer and creating a secondary VNIC in a
     * VLAN instead of a subnet, provide a {@code vlanId} instead of a {@code subnetId}. If you
     * provide both a {@code vlanId} and {@code subnetId}, the request fails.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * Provide this attribute only if you are an Oracle Cloud VMware Solution customer and creating
     * a secondary VNIC in a VLAN. The value is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN.
     * See {@link Vlan}.
     *
     * <p>Provide a {@code vlanId} instead of a {@code subnetId}. If you provide both a {@code
     * vlanId} and {@code subnetId}, the request fails.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * Provide this attribute only if you are an Oracle Cloud VMware Solution customer and creating
     * a secondary VNIC in a VLAN. The value is the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VLAN.
     * See {@link Vlan}.
     *
     * <p>Provide a {@code vlanId} instead of a {@code subnetId}. If you provide both a {@code
     * vlanId} and {@code subnetId}, the request fails.
     *
     * @return the value
     */
    public String getVlanId() {
        return vlanId;
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
        sb.append("CreateVnicDetails(");
        sb.append("super=").append(super.toString());
        sb.append("assignIpv6Ip=").append(String.valueOf(this.assignIpv6Ip));
        sb.append(", assignPublicIp=").append(String.valueOf(this.assignPublicIp));
        sb.append(", assignPrivateDnsRecord=").append(String.valueOf(this.assignPrivateDnsRecord));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", securityAttributes=").append(String.valueOf(this.securityAttributes));
        sb.append(", hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", ipv6AddressIpv6SubnetCidrPairDetails=")
                .append(String.valueOf(this.ipv6AddressIpv6SubnetCidrPairDetails));
        sb.append(", subnetCidr=").append(String.valueOf(this.subnetCidr));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(", privateIp=").append(String.valueOf(this.privateIp));
        sb.append(", skipSourceDestCheck=").append(String.valueOf(this.skipSourceDestCheck));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVnicDetails)) {
            return false;
        }

        CreateVnicDetails other = (CreateVnicDetails) o;
        return java.util.Objects.equals(this.assignIpv6Ip, other.assignIpv6Ip)
                && java.util.Objects.equals(this.assignPublicIp, other.assignPublicIp)
                && java.util.Objects.equals(
                        this.assignPrivateDnsRecord, other.assignPrivateDnsRecord)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.securityAttributes, other.securityAttributes)
                && java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(
                        this.ipv6AddressIpv6SubnetCidrPairDetails,
                        other.ipv6AddressIpv6SubnetCidrPairDetails)
                && java.util.Objects.equals(this.subnetCidr, other.subnetCidr)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && java.util.Objects.equals(this.privateIp, other.privateIp)
                && java.util.Objects.equals(this.skipSourceDestCheck, other.skipSourceDestCheck)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assignIpv6Ip == null ? 43 : this.assignIpv6Ip.hashCode());
        result =
                (result * PRIME)
                        + (this.assignPublicIp == null ? 43 : this.assignPublicIp.hashCode());
        result =
                (result * PRIME)
                        + (this.assignPrivateDnsRecord == null
                                ? 43
                                : this.assignPrivateDnsRecord.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributes == null
                                ? 43
                                : this.securityAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6AddressIpv6SubnetCidrPairDetails == null
                                ? 43
                                : this.ipv6AddressIpv6SubnetCidrPairDetails.hashCode());
        result = (result * PRIME) + (this.subnetCidr == null ? 43 : this.subnetCidr.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + (this.privateIp == null ? 43 : this.privateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.skipSourceDestCheck == null
                                ? 43
                                : this.skipSourceDestCheck.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
