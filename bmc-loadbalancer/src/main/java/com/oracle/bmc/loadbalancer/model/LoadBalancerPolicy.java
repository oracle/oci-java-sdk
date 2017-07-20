/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A policy that determines how traffic is distributed among backend servers.
 * For more information on load balancing policies, see
 * [How Load Balancing Policies Work](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Reference/lbpolicies.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LoadBalancerPolicy.Builder.class
)
public class LoadBalancerPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public LoadBalancerPolicy build() {
            return new LoadBalancerPolicy(name);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoadBalancerPolicy o) {
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
     * The name of the load balancing policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String name;
}
