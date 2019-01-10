/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * For use with Oracle Cloud Infrastructure FastConnect. Each
 * {@link VirtualCircuit} runs on one or
 * more cross-connects or cross-connect groups. A `CrossConnectMapping`
 * contains the properties for an individual cross-connect or cross-connect group
 * associated with a given virtual circuit.
 * <p>
 * The mapping includes information about the cross-connect or
 * cross-connect group, the VLAN, and the BGP peering session.
 * <p>
 * If you're a customer who is colocated with Oracle, that means you own both
 * the virtual circuit and the physical connection it runs on (cross-connect or
 * cross-connect group), so you specify all the information in the mapping. There's
 * one exception: for a public virtual circuit, Oracle specifies the BGP IPv4
 * addresses.
 * <p>
 * If you're a provider, then you own the physical connection that the customer's
 * virtual circuit runs on, so you contribute information about the cross-connect
 * or cross-connect group and VLAN.
 * <p>
 * Who specifies the BGP peering information in the case of customer connection via
 * provider? If the BGP session goes from Oracle to the provider's edge router, then
 * the provider also specifies the BGP peering information. If the BGP session instead
 * goes from Oracle to the customer's edge router, then the customer specifies the BGP
 * peering information. There's one exception: for a public virtual circuit, Oracle
 * specifies the BGP IPv4 addresses.
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
    builder = CrossConnectMapping.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CrossConnectMapping {
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

        @com.fasterxml.jackson.annotation.JsonProperty("vlan")
        private Integer vlan;

        public Builder vlan(Integer vlan) {
            this.vlan = vlan;
            this.__explicitlySet__.add("vlan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrossConnectMapping build() {
            CrossConnectMapping __instance__ =
                    new CrossConnectMapping(
                            bgpMd5AuthKey,
                            crossConnectOrCrossConnectGroupId,
                            customerBgpPeeringIp,
                            oracleBgpPeeringIp,
                            vlan);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectMapping o) {
            Builder copiedBuilder =
                    bgpMd5AuthKey(o.getBgpMd5AuthKey())
                            .crossConnectOrCrossConnectGroupId(
                                    o.getCrossConnectOrCrossConnectGroupId())
                            .customerBgpPeeringIp(o.getCustomerBgpPeeringIp())
                            .oracleBgpPeeringIp(o.getOracleBgpPeeringIp())
                            .vlan(o.getVlan());

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
     * The OCID of the cross-connect or cross-connect group for this mapping.
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
     * Example: `10.0.0.18/31`
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
     * Example: `10.0.0.19/31`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
    String oracleBgpPeeringIp;

    /**
     * The number of the specific VLAN (on the cross-connect or cross-connect group)
     * that is assigned to this virtual circuit. Specified by the owner of the cross-connect
     * or cross-connect group (the customer if the customer is colocated with Oracle, or
     * the provider if the customer is connecting via provider).
     * <p>
     * Example: `200`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vlan")
    Integer vlan;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
