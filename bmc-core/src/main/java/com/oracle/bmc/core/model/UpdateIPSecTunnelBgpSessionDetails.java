/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * Details to modify an IPSec Tunnel's BGP session paramaters.
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
    builder = UpdateIPSecTunnelBgpSessionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateIPSecTunnelBgpSessionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIp")
        private String oracleInterfaceIp;

        public Builder oracleInterfaceIp(String oracleInterfaceIp) {
            this.oracleInterfaceIp = oracleInterfaceIp;
            this.__explicitlySet__.add("oracleInterfaceIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIp")
        private String customerInterfaceIp;

        public Builder customerInterfaceIp(String customerInterfaceIp) {
            this.customerInterfaceIp = customerInterfaceIp;
            this.__explicitlySet__.add("customerInterfaceIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private String customerBgpAsn;

        public Builder customerBgpAsn(String customerBgpAsn) {
            this.customerBgpAsn = customerBgpAsn;
            this.__explicitlySet__.add("customerBgpAsn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIPSecTunnelBgpSessionDetails build() {
            UpdateIPSecTunnelBgpSessionDetails __instance__ =
                    new UpdateIPSecTunnelBgpSessionDetails(
                            oracleInterfaceIp, customerInterfaceIp, customerBgpAsn);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIPSecTunnelBgpSessionDetails o) {
            Builder copiedBuilder =
                    oracleInterfaceIp(o.getOracleInterfaceIp())
                            .customerInterfaceIp(o.getCustomerInterfaceIp())
                            .customerBgpAsn(o.getCustomerBgpAsn());

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
     * The IPv4 Address used in the BGP peering session for the Oracle router. Example: 10.0.0.1/31.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIp")
    String oracleInterfaceIp;

    /**
     * The IPv4 Address used in the BGP peering session for the non-Oracle router. Example: 10.0.0.2/31.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIp")
    String customerInterfaceIp;

    /**
     * The value of the remote BGP ASN in asplain format, as a string. Example: 1587232876 (4 byte ASN) or 12345 (2 byte ASN).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    String customerBgpAsn;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
