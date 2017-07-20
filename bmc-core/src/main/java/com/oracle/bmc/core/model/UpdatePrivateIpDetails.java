/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdatePrivateIpDetails.Builder.class
)
public class UpdatePrivateIpDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        public UpdatePrivateIpDetails build() {
            return new UpdatePrivateIpDetails(displayName, hostnameLabel, vnicId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatePrivateIpDetails o) {
            return displayName(o.getDisplayName())
                    .hostnameLabel(o.getHostnameLabel())
                    .vnicId(o.getVnicId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String displayName;

    /**
     * The hostname for the private IP. Used for DNS. The value
     * is the hostname portion of the private IP's fully qualified domain name (FQDN)
     * (for example, `bminstance-1` in FQDN `bminstance-1.subnet123.vcn1.oraclevcn.com`).
     * Must be unique across all VNICs in the subnet and comply with
     * [RFC 952](https://tools.ietf.org/html/rfc952) and
     * [RFC 1123](https://tools.ietf.org/html/rfc1123).
     * <p>
     * For more information, see
     * [DNS in Your Virtual Cloud Network](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/dns.htm).
     * <p>
     * Example: `bminstance-1`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    @javax.validation.constraints.Size(min = 1, max = 63)
    String hostnameLabel;

    /**
     * The OCID of the VNIC to reassign the private IP to. The VNIC must
     * be in the same subnet as the current VNIC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String vnicId;
}
