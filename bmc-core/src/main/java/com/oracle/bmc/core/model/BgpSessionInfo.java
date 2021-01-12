/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information for establishing a BGP session for the IPSec tunnel.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BgpSessionInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BgpSessionInfo {
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

        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpAsn")
        private String oracleBgpAsn;

        public Builder oracleBgpAsn(String oracleBgpAsn) {
            this.oracleBgpAsn = oracleBgpAsn;
            this.__explicitlySet__.add("oracleBgpAsn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
        private String customerBgpAsn;

        public Builder customerBgpAsn(String customerBgpAsn) {
            this.customerBgpAsn = customerBgpAsn;
            this.__explicitlySet__.add("customerBgpAsn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpState")
        private BgpState bgpState;

        public Builder bgpState(BgpState bgpState) {
            this.bgpState = bgpState;
            this.__explicitlySet__.add("bgpState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BgpSessionInfo build() {
            BgpSessionInfo __instance__ =
                    new BgpSessionInfo(
                            oracleInterfaceIp,
                            customerInterfaceIp,
                            oracleBgpAsn,
                            customerBgpAsn,
                            bgpState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BgpSessionInfo o) {
            Builder copiedBuilder =
                    oracleInterfaceIp(o.getOracleInterfaceIp())
                            .customerInterfaceIp(o.getCustomerInterfaceIp())
                            .oracleBgpAsn(o.getOracleBgpAsn())
                            .customerBgpAsn(o.getCustomerBgpAsn())
                            .bgpState(o.getBgpState());

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
     * If the tunnel's `routing` attribute is set to `BGP`
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is required and used for the tunnel's BGP session.
     * <p>
     * If `routing` is instead set to `STATIC`, this IP address is optional. You can set this IP
     * address so you can troubleshoot or monitor the tunnel.
     * <p>
     * The value must be a /30 or /31.
     * <p>
     * Example: `10.0.0.4/31`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleInterfaceIp")
    String oracleInterfaceIp;

    /**
     * The IP address for the CPE end of the inside tunnel interface.
     * <p>
     * If the tunnel's `routing` attribute is set to `BGP`
     * (see {@link IPSecConnectionTunnel}), this IP address
     * is required and used for the tunnel's BGP session.
     * <p>
     * If `routing` is instead set to `STATIC`, this IP address is optional. You can set this IP
     * address so you can troubleshoot or monitor the tunnel.
     * <p>
     * The value must be a /30 or /31.
     * <p>
     * Example: `10.0.0.5/31`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerInterfaceIp")
    String customerInterfaceIp;

    /**
     * The Oracle BGP ASN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpAsn")
    String oracleBgpAsn;

    /**
     * If the tunnel's `routing` attribute is set to `BGP`
     * (see {@link IPSecConnectionTunnel}), this ASN
     * is required and used for the tunnel's BGP session. This is the ASN of the network on the
     * CPE end of the BGP session. Can be a 2-byte or 4-byte ASN. Uses \"asplain\" format.
     * <p>
     * If the tunnel uses static routing, the `customerBgpAsn` must be null.
     * <p>
     * Example: `12345` (2-byte) or `1587232876` (4-byte)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpAsn")
    String customerBgpAsn;
    /**
     * The state of the BGP session.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BgpState {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BgpState> map;

        static {
            map = new java.util.HashMap<>();
            for (BgpState v : BgpState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BgpState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BgpState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BgpState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the BGP session.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpState")
    BgpState bgpState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
