/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A shape is a template that determines the total pre-provisioned bandwidth (ingress plus egress) for the
 * load balancer.
 * <p>
 * Note that the pre-provisioned maximum capacity applies to aggregated connections, not to a single client
 * attempting to use the full bandwidth.
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LoadBalancerShape.Builder.class
)
public class LoadBalancerShape {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public LoadBalancerShape build() {
            return new LoadBalancerShape(name);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
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
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String name;
}
