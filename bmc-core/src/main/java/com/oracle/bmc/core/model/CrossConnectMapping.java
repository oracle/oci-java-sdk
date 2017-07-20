/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * For use with Oracle Bare Metal Cloud Services FastConnect. Each
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
 * cross-connect group), so you specify all the information in the mapping.
 * <p>
 * If you're a provider, then you own the physical connection that the customer's
 * virtual circuit runs on, so you contribute information about the cross-connect
 * or cross-connect group and VLAN.
 * <p>
 * Who specifies the BGP peering information in the case of customer connection via
 * provider? If the BGP session goes from Oracle to the provider's edge router, then
 * the provider also specifies the BGP peering information. If the BGP session instead
 * goes from Oracle to the customer's edge router, then the customer specifies the BGP
 * peering information.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CrossConnectMapping.Builder.class
)
public class CrossConnectMapping {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bgpMd5AuthKey")
        private String bgpMd5AuthKey;

        @com.fasterxml.jackson.annotation.JsonProperty("crossConnectOrCrossConnectGroupId")
        private String crossConnectOrCrossConnectGroupId;

        @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIp")
        private String customerBgpPeeringIp;

        @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
        private String oracleBgpPeeringIp;

        @com.fasterxml.jackson.annotation.JsonProperty("vlan")
        private Integer vlan;

        public CrossConnectMapping build() {
            return new CrossConnectMapping(
                    bgpMd5AuthKey,
                    crossConnectOrCrossConnectGroupId,
                    customerBgpPeeringIp,
                    oracleBgpPeeringIp,
                    vlan);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrossConnectMapping o) {
            return bgpMd5AuthKey(o.getBgpMd5AuthKey())
                    .crossConnectOrCrossConnectGroupId(o.getCrossConnectOrCrossConnectGroupId())
                    .customerBgpPeeringIp(o.getCustomerBgpPeeringIp())
                    .oracleBgpPeeringIp(o.getOracleBgpPeeringIp())
                    .vlan(o.getVlan());
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
    @javax.validation.constraints.Size(min = 1, max = 255)
    String bgpMd5AuthKey;

    /**
     * The OCID of the cross-connect or cross-connect group for this mapping.
     * Specified by the owner of the cross-connect or cross-connect group (the
     * customer if the customer is colocated with Oracle; the provider if the
     * customer is connecting via provider).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("crossConnectOrCrossConnectGroupId")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String crossConnectOrCrossConnectGroupId;

    /**
     * The BGP IP address for the router on the other end of the BGP session from
     * Oracle. Specified by the owner of that router. If the session goes from Oracle
     * to a customer, this is the BGP IP address of the customer's edge router. If the
     * session goes from Oracle to a provider, this is the BGP IP address of the
     * provider's edge router. Must use a /30 or /31 subnet mask.
     * <p>
     * Example: `10.0.0.18/31`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerBgpPeeringIp")
    @javax.validation.constraints.Size(min = 7, max = 46)
    String customerBgpPeeringIp;

    /**
     * The IP address for Oracle's end of the BPG session. Must use a /30 or /31
     * subnet mask. If the session goes from Oracle to a customer's edge router,
     * the customer specifies this information. If the session goes from Oracle to
     * a provider's edge router, the provider specifies this.
     * <p>
     * Example: `10.0.0.19/31`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleBgpPeeringIp")
    @javax.validation.constraints.Size(min = 7, max = 46)
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
    @javax.validation.constraints.Min(100)
    @javax.validation.constraints.Max(16777216)
    Integer vlan;
}
