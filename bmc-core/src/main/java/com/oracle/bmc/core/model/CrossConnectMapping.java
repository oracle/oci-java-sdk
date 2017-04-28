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

/**
 * Each virtual circuit runs on one or more cross-connects or
 * cross-connect groups owned by the provider. A `CrossConnectMapping`
 * contains the properties for an individual cross-connect or
 * cross-connect group associated with a given virtual circuit.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = CrossConnectMapping.Builder.class)
public class CrossConnectMapping {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("bgpMd5AuthKey")
        private String bgpMd5AuthKey;

        @JsonProperty("crossConnectOrCrossConnectGroupId")
        private String crossConnectOrCrossConnectGroupId;

        @JsonProperty("customerBgpPeeringIp")
        private String customerBgpPeeringIp;

        @JsonProperty("oracleBgpPeeringIp")
        private String oracleBgpPeeringIp;

        @JsonProperty("vlan")
        private Integer vlan;

        public CrossConnectMapping build() {
            return new CrossConnectMapping(
                    bgpMd5AuthKey,
                    crossConnectOrCrossConnectGroupId,
                    customerBgpPeeringIp,
                    oracleBgpPeeringIp,
                    vlan);
        }

        @JsonIgnore
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
    @JsonProperty("bgpMd5AuthKey")
    @Size(min = 1, max = 255)
    String bgpMd5AuthKey;

    /**
     * The OCID of the cross-connect or cross-connect group for this mapping.
     *
     **/
    @JsonProperty("crossConnectOrCrossConnectGroupId")
    @Size(min = 1, max = 255)
    String crossConnectOrCrossConnectGroupId;

    /**
     * The BGP IP address for the router on the other end of the BGP session from
     * Oracle. If the session goes from the customer's CPE to Oracle, this is
     * the BGP IP address for the customer's CPE. If the session goes from the
     * provider's edge router to Oracle, this is the BGP IP address for the
     * provider's router. Must use a /31 or /32 subnet mask.
     * <p>
     * Example: `10.0.0.18/31`
     *
     **/
    @JsonProperty("customerBgpPeeringIp")
    @Size(min = 7, max = 46)
    String customerBgpPeeringIp;

    /**
     * The IP address for Oracle's end of the BPG session. Must use a /31 or /32
     * subnet mask.
     * <p>
     * Example: `10.0.0.19/31`
     *
     **/
    @JsonProperty("oracleBgpPeeringIp")
    @Size(min = 7, max = 46)
    String oracleBgpPeeringIp;

    /**
     * The number of the specific VLAN (on the cross-connect or cross-connect
     * group) that is assigned to this virtual circuit.
     * <p>
     * Example: `200`
     *
     **/
    @JsonProperty("vlan")
    @Min(100)
    @Max(16777216)
    Integer vlan;
}
