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
 * Configuration details to update a load balancer.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = UpdateLoadBalancerDetails.Builder.class)
public class UpdateLoadBalancerDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("displayName")
        private String displayName;

        public UpdateLoadBalancerDetails build() {
            return new UpdateLoadBalancerDetails(displayName);
        }

        @JsonIgnore
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
     * <p>
     * Example: `My load balancer`
     *
     **/
    @JsonProperty("displayName")
    @Valid
    @NotNull
    String displayName;
}
