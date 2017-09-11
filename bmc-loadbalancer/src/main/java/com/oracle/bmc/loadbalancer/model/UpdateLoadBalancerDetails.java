/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Configuration details to update a load balancer.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateLoadBalancerDetails.Builder.class
)
public class UpdateLoadBalancerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public UpdateLoadBalancerDetails build() {
            return new UpdateLoadBalancerDetails(displayName);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLoadBalancerDetails o) {
            return displayName(o.getDisplayName());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The user-friendly display name for the load balancer. It does not have to be unique, and it is changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: `My load balancer`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 1024)
    String displayName;
}
