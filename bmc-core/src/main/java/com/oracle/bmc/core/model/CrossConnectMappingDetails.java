/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect. Each
 * {@link VirtualCircuit} runs on one or
 * more cross-connects or cross-connect groups. A {@code CrossConnectMappingDetails}
 * contains the properties for an individual cross-connect or cross-connect group
 * associated with a given virtual circuit.
 * <p>
 * The details includes information about the cross-connect or
 * cross-connect group, the VLAN, and the BGP peering session.
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
    builder = CrossConnectMappingDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CrossConnectMappingDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bgpMd5AuthKey")
        private String bgpMd5AuthKey;

        public Builder bgpMd5AuthKey(String bgpMd5AuthKey) {
            this.bgpMd5AuthKey = bgpMd5AuthKey;
            this.__explicitlySet__.add("bgpMd5AuthKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectOrCrossConnectGroupId")
        private String crossConnectOrCrossConnectGroupId;

        public Builder crossConnectOrCrossConnectGroupId(String crossConnectOrCrossConnectGroupId) {
            this.crossConnectOrCrossConnectGroupId = crossConnectOrCrossConnectGroupId;
            this.__explicitlySet__.add("crossConnectOrCrossConnectGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIp")
        private String customerBgpPeeringIp;

        public Builder customerBgpPeeringIp(String customerBgpPeeringIp) {
            this.customerBgpPeeringIp = customerBgpPeeringIp;
            this.__explicitlySet__.add("customerBgpPeeringIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
        private String oracleBgpPeeringIp;

        public Builder oracleBgpPeeringIp(String oracleBgpPeeringIp) {
            this.oracleBgpPeeringIp = oracleBgpPeeringIp;
            this.__explicitlySet__.add("oracleBgpPeeringIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIpv6")
        private String customerBgpPeeringIpv6;

        public Builder customerBgpPeeringIpv6(String customerBgpPeeringIpv6) {
            this.customerBgpPeeringIpv6 = customerBgpPeeringIpv6;
            this.__explicitlySet__.add("customerBgpPeeringIpv6");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIpv6")
        private String oracleBgpPeeringIpv6;

        public Builder oracleBgpPeeringIpv6(String oracleBgpPeeringIpv6) {
            this.oracleBgpPeeringIpv6 = oracleBgpPeeringIpv6;
            this.__explicitlySet__.add("oracleBgpPeeringIpv6");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vlan")
        private Integer vlan;

        public Builder vlan(Integer vlan) {
            this.vlan = vlan;
            this.__explicitlySet__.add("vlan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv4BgpStatus")
        private Ipv4BgpStatus ipv4BgpStatus;

        public Builder ipv4BgpStatus(Ipv4BgpStatus ipv4BgpStatus) {
            this.ipv4BgpStatus = ipv4BgpStatus;
            this.__explicitlySet__.add("ipv4BgpStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ipv6BgpStatus")
        private Ipv6BgpStatus ipv6BgpStatus;

        public Builder ipv6BgpStatus(Ipv6BgpStatus ipv6BgpStatus) {
            this.ipv6BgpStatus = ipv6BgpStatus;
            this.__explicitlySet__.add("ipv6BgpStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectMappingDetails build() {
            CrossConnectMappingDetails __instance__ =
                    new CrossConnectMappingDetails(
                            bgpMd5AuthKey,
                            crossConnectOrCrossConnectGroupId,
                            customerBgpPeeringIp,
                            oracleBgpPeeringIp,
                            customerBgpPeeringIpv6,
                            oracleBgpPeeringIpv6,
                            vlan,
                            ipv4BgpStatus,
                            ipv6BgpStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectMappingDetails o) {
            Builder copiedBuilder =
                    bgpMd5AuthKey(o.getBgpMd5AuthKey())
                            .crossConnectOrCrossConnectGroupId(
                                    o.getCrossConnectOrCrossConnectGroupId())
                            .customerBgpPeeringIp(o.getCustomerBgpPeeringIp())
                            .oracleBgpPeeringIp(o.getOracleBgpPeeringIp())
                            .customerBgpPeeringIpv6(o.getCustomerBgpPeeringIpv6())
                            .oracleBgpPeeringIpv6(o.getOracleBgpPeeringIpv6())
                            .vlan(o.getVlan())
                            .ipv4BgpStatus(o.getIpv4BgpStatus())
                            .ipv6BgpStatus(o.getIpv6BgpStatus());

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
     * The key for BGP MD5 authentication. Only applicable if your system
     * requires MD5 authentication. If empty or not set (null), that
     * means you don't use BGP MD5 authentication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bgpMd5AuthKey")
    String bgpMd5AuthKey;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the cross-connect or cross-connect group for this mapping.
     * Specified by the owner of the cross-connect or cross-connect group (the
     * customer if the customer is colocated with Oracle, or the provider if the
     * customer is connecting via provider).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectOrCrossConnectGroupId")
    String crossConnectOrCrossConnectGroupId;

    /**
     * The BGP IPv4 address for the router on the other end of the BGP session from
     * Oracle. Specified by the owner of that router. If the session goes from Oracle
     * to a customer, this is the BGP IPv4 address of the customer's edge router. If the
     * session goes from Oracle to a provider, this is the BGP IPv4 address of the
     * provider's edge router. Must use a /30 or /31 subnet mask.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
     * <p>
     * Example: {@code 10.0.0.18/31}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIp")
    String customerBgpPeeringIp;

    /**
     * The IPv4 address for Oracle's end of the BGP session. Must use a /30 or /31
     * subnet mask. If the session goes from Oracle to a customer's edge router,
     * the customer specifies this information. If the session goes from Oracle to
     * a provider's edge router, the provider specifies this.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv4 addresses.
     * <p>
     * Example: {@code 10.0.0.19/31}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
    String oracleBgpPeeringIp;

    /**
     * The BGP IPv6 address for the router on the other end of the BGP session from
     * Oracle. Specified by the owner of that router. If the session goes from Oracle
     * to a customer, this is the BGP IPv6 address of the customer's edge router. If the
     * session goes from Oracle to a provider, this is the BGP IPv6 address of the
     * provider's edge router. Only subnet masks from /64 up to /127 are allowed.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
     * <p>
     * Example: {@code 2001:db8::1/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIpv6")
    String customerBgpPeeringIpv6;

    /**
     * The IPv6 address for Oracle's end of the BGP session. Only subnet masks from /64 up to /127 are allowed.
     * If the session goes from Oracle to a customer's edge router,
     * the customer specifies this information. If the session goes from Oracle to
     * a provider's edge router, the provider specifies this.
     * <p>
     * There's one exception: for a public virtual circuit, Oracle specifies the BGP IPv6 addresses.
     * <p>
     * Example: {@code 2001:db8::2/64}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIpv6")
    String oracleBgpPeeringIpv6;

    /**
     * The number of the specific VLAN (on the cross-connect or cross-connect group)
     * that is assigned to this virtual circuit. Specified by the owner of the cross-connect
     * or cross-connect group (the customer if the customer is colocated with Oracle, or
     * the provider if the customer is connecting via provider).
     * <p>
     * Example: {@code 200}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlan")
    Integer vlan;
    /**
     * The state of the Ipv4 BGP session.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Ipv4BgpStatus {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Ipv4BgpStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (Ipv4BgpStatus v : Ipv4BgpStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Ipv4BgpStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Ipv4BgpStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Ipv4BgpStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the Ipv4 BGP session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4BgpStatus")
    Ipv4BgpStatus ipv4BgpStatus;
    /**
     * The state of the Ipv6 BGP session.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Ipv6BgpStatus {
        Up("UP"),
        Down("DOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Ipv6BgpStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (Ipv6BgpStatus v : Ipv6BgpStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Ipv6BgpStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Ipv6BgpStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Ipv6BgpStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The state of the Ipv6 BGP session.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6BgpStatus")
    Ipv6BgpStatus ipv6BgpStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
