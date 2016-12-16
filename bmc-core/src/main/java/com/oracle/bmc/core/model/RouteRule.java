/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
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
 * A mapping between a destination IP address range and a virtual device to route matching
 * packets to (a target).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@Value
@JsonDeserialize(builder = RouteRule.Builder.class)
public class RouteRule {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("cidrBlock")
        private String cidrBlock;

        @JsonProperty("networkEntityId")
        private String networkEntityId;

        public RouteRule build() {
            return new RouteRule(cidrBlock, networkEntityId);
        }

        @JsonIgnore
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
    @JsonProperty("cidrBlock")
    @Valid
    @NotNull
    @Size(min = 9, max = 18)
    String cidrBlock;

    /**
     * The OCID for the route rule's target.
     **/
    @JsonProperty("networkEntityId")
    @Valid
    @NotNull
    @Size(min = 1, max = 255)
    String networkEntityId;
}
