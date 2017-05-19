/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CreateVnicDetails.Builder.class)
public class CreateVnicDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("assignPublicIp")
        private Boolean assignPublicIp;

        @JsonProperty("displayName")
        private String displayName;

        @JsonProperty("hostnameLabel")
        private String hostnameLabel;

        @JsonProperty("privateIp")
        private String privateIp;

        @JsonProperty("subnetId")
        private String subnetId;

        public CreateVnicDetails build() {
            return new CreateVnicDetails(
                    assignPublicIp, displayName, hostnameLabel, privateIp, subnetId);
        }

        @JsonIgnore
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
     * in a private subnet (i.e., where `prohibitPublicIpOnVnic`=true in the
     * {@link Subnet}), then no public IP address is assigned.
     * If not set and the subnet is public (`prohibitPublicIpOnVnic`=false), then
     * a public IP address is assigned. If set to true and
     * `prohibitPublicIpOnVnic`=true, an error is returned.
     * <p>
     * Example: `false`
     *
     **/
    @JsonProperty("assignPublicIp")
    Boolean assignPublicIp;

    /**
     * A user-friendly name for the VNIC. Does not have to be unique.
     **/
    @JsonProperty("displayName")
    @Size(min = 1, max = 255)
    String displayName;

    /**
     * The hostname for the VNIC that is created during instance launch.
     * Used for DNS. The value is the hostname portion of the instance's
     * fully qualified domain name (FQDN) (e.g., `bminstance-1` in FQDN
     * `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be unique across all VNICs in the subnet and comply with
     * [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * The value cannot be changed, and it can be retrieved from the
     * {@link Vnic}.
     *
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Use this `hostnameLabel` instead
     * of the deprecated `hostnameLabel` in
     * {@link #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}.
     * If you provide both, the values must match.
     * <p>
     * Example: `bminstance-1`
     *
     **/
    @JsonProperty("hostnameLabel")
    @Size(min = 1, max = 63)
    String hostnameLabel;

    /**
     * A private IP address of your choice to assign to the VNIC. Must be an
     * available IP address within the subnet's CIDR. If no value is specified,
     * a private IP address from the subnet will be automatically assigned.
     * <p>
     * Example: `10.0.3.1`
     *
     **/
    @JsonProperty("privateIp")
    @Size(min = 1, max = 46)
    String privateIp;

    /**
     * The OCID of the subnet to create the VNIC in. Use this `subnetId` instead
     * of the deprecated `subnetId` in
     * {@link #launchInstanceDetails(LaunchInstanceDetailsRequest) launchInstanceDetails}.
     * At least one of them is required; if you provide both, the values must match.
     *
     **/
    @JsonProperty("subnetId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String subnetId;
}
