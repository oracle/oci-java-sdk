/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
    builder = UpdateIPSecTunnelBgpSessionDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIpv6")
        private String oracleInterfaceIpv6;

        public Builder oracleInterfaceIpv6(String oracleInterfaceIpv6) {
            this.oracleInterfaceIpv6 = oracleInterfaceIpv6;
            this.__explicitlySet__.add("oracleInterfaceIpv6");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIpv6")
        private String customerInterfaceIpv6;

        public Builder customerInterfaceIpv6(String customerInterfaceIpv6) {
            this.customerInterfaceIpv6 = customerInterfaceIpv6;
            this.__explicitlySet__.add("customerInterfaceIpv6");
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
                            oracleInterfaceIp,
                            customerInterfaceIp,
                            oracleInterfaceIpv6,
                            customerInterfaceIpv6,
                            customerBgpAsn);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIPSecTunnelBgpSessionDetails o) {
            Builder copiedBuilder =
                    oracleInterfaceIp(o.getOracleInterfaceIp())
                            .customerInterfaceIp(o.getCustomerInterfaceIp())
                            .oracleInterfaceIpv6(o.getOracleInterfaceIpv6())
                            .customerInterfaceIpv6(o.getCustomerInterfaceIpv6())
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
     * The IP address for the Oracle end of the inside tunnel interface.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link #updateIPSecConnectionTunnelDetails(UpdateIPSecConnectionTunnelDetailsRequest) updateIPSecConnectionTunnelDetails}), this IP address
     * is used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, you can set this IP address to troubleshoot or
     * monitor the tunnel.
     * <p>
     * The value must be a /30 or /31.
     * <p>
     * If you are switching the tunnel from using BGP dynamic routing to static routing and want
     * to remove the value for {@code oracleInterfaceIp}, you can set the value to an empty string.
     * <p>
     * Example: {@code 10.0.0.4/31}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIp")
    String oracleInterfaceIp;

    /**
     * The IP address for the CPE end of the inside tunnel interface.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link #updateIPSecConnectionTunnelDetails(UpdateIPSecConnectionTunnelDetailsRequest) updateIPSecConnectionTunnelDetails}), this IP address
     * is used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, you can set this IP address to troubleshoot or
     * monitor the tunnel.
     * <p>
     * The value must be a /30 or /31.
     * <p>
     * If you are switching the tunnel from using BGP dynamic routing to static routing and want
     * to remove the value for {@code customerInterfaceIp}, you can set the value to an empty string.
     * <p>
     * Example: {@code 10.0.0.5/31}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIp")
    String customerInterfaceIp;

    /**
     * The IPv6 address for the Oracle end of the inside tunnel interface. This IP address is optional.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, you can set this IP
     * address to troubleshoot or monitor the tunnel.
     * <p>
     * Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIpv6")
    String oracleInterfaceIpv6;

    /**
     * The IPv6 address for the CPE end of the inside tunnel interface. This IP address is optional.
     * <p>
     * If the tunnel's {@code routing} attribute is set to {@code BGP}
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is used for the tunnel's BGP session.
     * <p>
     * If {@code routing} is instead set to {@code STATIC}, you can set this IP
     * address to troubleshoot or monitor the tunnel.
     * <p>
     * Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIpv6")
    String customerInterfaceIpv6;

    /**
     * The BGP ASN of the network on the CPE end of the BGP session. Can be a 2-byte or 4-byte ASN.
     * Uses "asplain" format.
     * <p>
     * If you are switching the tunnel from using BGP dynamic routing to static routing, the
     * {@code customerBgpAsn} must be null.
     * <p>
     * Example: {@code 12345} (2-byte) or {@code 1587232876} (4-byte)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    String customerBgpAsn;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
