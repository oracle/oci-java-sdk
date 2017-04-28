/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * A shape is a template that determines the total pre-provisioned bandwidth (ingress plus egress) for the
 * load balancer.
 * <p>
 * Note that the pre-provisioned maximum capacity applies to aggregated connections, not to a single client
 * attempting to use the full bandwidth.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = LoadBalancerShape.Builder.class)
public class LoadBalancerShape {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("name")
        private String name;

        public LoadBalancerShape build() {
            return new LoadBalancerShape(name);
        }

        @JsonIgnore
        public Builder copy(LoadBalancerShape o) {
            return name(o.getName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the shape.
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;
}
