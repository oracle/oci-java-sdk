/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Contains properties for a VNIC. You use this object when creating the
 * primary VNIC during instance launch or when creating a secondary VNIC.
 * For more information about VNICs, see
 * [Virtual Network Interface Cards (VNICs)](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingVNICs.htm).
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
    builder = CreateVnicDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateVnicDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
        private Boolean assignPublicIp;

        public Builder assignPublicIp(Boolean assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            this.__explicitlySet__.add("assignPublicIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assignPrivateDnsRecord")
        private Boolean assignPrivateDnsRecord;

        public Builder assignPrivateDnsRecord(Boolean assignPrivateDnsRecord) {
            this.assignPrivateDnsRecord = assignPrivateDnsRecord;
            this.__explicitlySet__.add("assignPrivateDnsRecord");
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

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        public Builder privateIp(String privateIp) {
            this.privateIp = privateIp;
            this.__explicitlySet__.add("privateIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
        private Boolean skipSourceDestCheck;

        public Builder skipSourceDestCheck(Boolean skipSourceDestCheck) {
            this.skipSourceDestCheck = skipSourceDestCheck;
            this.__explicitlySet__.add("skipSourceDestCheck");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVnicDetails build() {
            CreateVnicDetails __instance__ =
                    new CreateVnicDetails(
                            assignPublicIp,
                            assignPrivateDnsRecord,
                            definedTags,
                            displayName,
                            freeformTags,
                            hostnameLabel,
                            nsgIds,
                            privateIp,
                            skipSourceDestCheck,
                            subnetId,
                            vlanId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVnicDetails o) {
            Builder copiedBuilder =
                    assignPublicIp(o.getAssignPublicIp())
                            .assignPrivateDnsRecord(o.getAssignPrivateDnsRecord())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .hostnameLabel(o.getHostnameLabel())
                            .nsgIds(o.getNsgIds())
                            .privateIp(o.getPrivateIp())
                            .skipSourceDestCheck(o.getSkipSourceDestCheck())
                            .subnetId(o.getSubnetId())
                            .vlanId(o.getVlanId());

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
     * Whether the VNIC should be assigned a public IP address. Defaults to whether
     * the subnet is public or private. If not set and the VNIC is being created
     * in a private subnet (that is, where `prohibitPublicIpOnVnic` = true in the
     * {@link Subnet}), then no public IP address is assigned.
     * If not set and the subnet is public (`prohibitPublicIpOnVnic` = false), then
     * a public IP address is assigned. If set to true and
     * `prohibitPublicIpOnVnic` = true, an error is returned.
     * <p>
     **Note:** This public IP address is associated with the primary private IP
     * on the VNIC. For more information, see
     * [IP Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingIPaddresses.htm).
     * <p>
     **Note:** There's a limit to the number of {@link PublicIp}
     * a VNIC or instance can have. If you try to create a secondary VNIC
     * with an assigned public IP for an instance that has already
     * reached its public IP limit, an error is returned. For information
     * about the public IP limits, see
     * [Public IP Addresses](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingpublicIPs.htm).
     * <p>
     * Example: `false`
     * <p>
     * If you specify a `vlanId`, then `assignPublicIp` must be set to false. See
     * {@link Vlan}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
    Boolean assignPublicIp;

    /**
     * Whether the VNIC should be assigned a DNS record. If set to false, there will be no DNS record
     * registration for the VNIC. If set to true, the DNS record will be registered. The default
     * value is true.
     * <p>
     * If you specify a `hostnameLabel`, then `assignPrivateDnsRecord` must be set to true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignPrivateDnsRecord")
    Boolean assignPrivateDnsRecord;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name for the VNIC. Does not have to be unique.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The hostname for the VNIC's primary private IP. Used for DNS. The value is the hostname
     * portion of the primary private IP's fully qualified domain name (FQDN)
     * (for example, `bminstance-1` in FQDN `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be unique across all VNICs in the subnet and comply with
     * [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * The value appears in the {@link Vnic} object and also the
     * {@link PrivateIp} object returned by
     * {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and
     * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.cloud.oracle.com/iaas/Content/Network/Concepts/dns.htm).
     * <p>
     * When launching an instance, use this `hostnameLabel` instead
     * of the deprecated `hostnameLabel` in
     * {@link #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}.
     * If you provide both, the values must match.
     * <p>
     * Example: `bminstance-1`
     * <p>
     * If you specify a `vlanId`, the `hostnameLabel` cannot be specified. VNICs on a VLAN
     * can not be assigned a hostname. See {@link Vlan}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    String hostnameLabel;

    /**
     * A list of the OCIDs of the network security groups (NSGs) to add the VNIC to. For more
     * information about NSGs, see
     * {@link NetworkSecurityGroup}.
     * <p>
     * If a `vlanId` is specified, the `nsgIds` cannot be specified. The `vlanId`
     * indicates that the VNIC will belong to a VLAN instead of a subnet. With VLANs,
     * all VNICs in the VLAN belong to the NSGs that are associated with the VLAN.
     * See {@link Vlan}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    java.util.List<String> nsgIds;

    /**
     * A private IP address of your choice to assign to the VNIC. Must be an
     * available IP address within the subnet's CIDR. If you don't specify a
     * value, Oracle automatically assigns a private IP address from the subnet.
     * This is the VNIC's *primary* private IP address. The value appears in
     * the {@link Vnic} object and also the
     * {@link PrivateIp} object returned by
     * {@link #listPrivateIps(ListPrivateIpsRequest) listPrivateIps} and
     * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp}.
     * <p>
     *
     * If you specify a `vlanId`, the `privateIp` cannot be specified.
     * See {@link Vlan}.
     * <p>
     * Example: `10.0.3.3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    String privateIp;

    /**
     * Whether the source/destination check is disabled on the VNIC.
     * Defaults to `false`, which means the check is performed. For information
     * about why you would skip the source/destination check, see
     * [Using a Private IP as a Route Target](https://docs.cloud.oracle.com/iaas/Content/Network/Tasks/managingroutetables.htm#privateip).
     * <p>
     *
     * If you specify a `vlanId`, the `skipSourceDestCheck` cannot be specified because the
     * source/destination check is always disabled for VNICs in a VLAN. See
     * {@link Vlan}.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skipSourceDestCheck")
    Boolean skipSourceDestCheck;

    /**
     * The OCID of the subnet to create the VNIC in. When launching an instance,
     * use this `subnetId` instead of the deprecated `subnetId` in
     * {@link #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}.
     * At least one of them is required; if you provide both, the values must match.
     * <p>
     * If you are an Oracle Cloud VMware Solution customer and creating a secondary
     * VNIC in a VLAN instead of a subnet, provide a `vlanId` instead of a `subnetId`.
     * If you provide both a `vlanId` and `subnetId`, the request fails.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    String subnetId;

    /**
     * Provide this attribute only if you are an Oracle Cloud VMware Solution
     * customer and creating a secondary VNIC in a VLAN. The value is the OCID of the VLAN.
     * See {@link Vlan}.
     * <p>
     * Provide a `vlanId` instead of a `subnetId`. If you provide both a
     * `vlanId` and `subnetId`, the request fails.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    String vlanId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
