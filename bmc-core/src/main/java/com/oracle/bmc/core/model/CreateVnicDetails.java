/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Contains properties for a VNIC. You use this object when creating the
 * primary VNIC during instance launch or when creating a secondary VNIC.
 * For more information about VNICs, see
 * [Managing Virtual Network Interface Cards (VNICs)](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingVNICs.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateVnicDetails.Builder.class
)
public class CreateVnicDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
        private Boolean assignPublicIp;

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
        private String privateIp;

        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        public CreateVnicDetails build() {
            return new CreateVnicDetails(
                    assignPublicIp, displayName, hostnameLabel, privateIp, subnetId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVnicDetails o) {
            return assignPublicIp(o.getAssignPublicIp())
                    .displayName(o.getDisplayName())
                    .hostnameLabel(o.getHostnameLabel())
                    .privateIp(o.getPrivateIp())
                    .subnetId(o.getSubnetId());
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
     * in a private subnet (i.e., where `prohibitPublicIpOnVnic` = true in the
     * {@link Subnet}), then no public IP address is assigned.
     * If not set and the subnet is public (`prohibitPublicIpOnVnic` = false), then
     * a public IP address is assigned. If set to true and
     * `prohibitPublicIpOnVnic` = true, an error is returned.
     * <p>
     **Note:** This public IP address is associated with the primary private IP
     * on the VNIC. Secondary private IPs cannot have public IP
     * addresses associated with them. For more information, see
     * [Managing IP Addresses](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Tasks/managingIPaddresses.htm).
     * <p>
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("assignPublicIp")
    Boolean assignPublicIp;

    /**
     * A user-friendly name for the VNIC. Does not have to be unique.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

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
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * When launching an instance, use this `hostnameLabel` instead
     * of the deprecated `hostnameLabel` in
     * {@link #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}.
     * If you provide both, the values must match.
     * <p>
     * Example: `bminstance-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    @javax.validation.constraints.Size(min = 1, max = 63)
    String hostnameLabel;

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
     * Example: `10.0.3.3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateIp")
    @javax.validation.constraints.Size(min = 1, max = 46)
    String privateIp;

    /**
     * The OCID of the subnet to create the VNIC in. When launching an instance,
     * use this `subnetId` instead of the deprecated `subnetId` in
     * {@link #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}.
     * At least one of them is required; if you provide both, the values must match.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String subnetId;
}
