/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A mapping between a destination IP address range and a virtual device to route matching
 * packets to (a target).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RouteRule.Builder.class)
public class RouteRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        @com.fasterxml.jackson.annotation.JsonProperty("networkEntityId")
        private String networkEntityId;

        public RouteRule build() {
            return new RouteRule(cidrBlock, networkEntityId);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RouteRule o) {
            return cidrBlock(o.getCidrBlock()).networkEntityId(o.getNetworkEntityId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * A destination IP address range in CIDR notation. Matching packets will
     * be routed to the indicated network entity (the target).
     * <p>
     * Example: `0.0.0.0/0`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 9, max = 18)
    String cidrBlock;

    /**
     * The OCID for the route rule's target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkEntityId")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 255)
    String networkEntityId;
}
