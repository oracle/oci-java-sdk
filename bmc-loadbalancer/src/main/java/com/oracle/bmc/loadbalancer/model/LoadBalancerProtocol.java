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
 * The protocol that defines the type of traffic accepted by a listener.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = LoadBalancerProtocol.Builder.class)
public class LoadBalancerProtocol {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("name")
        private String name;

        public LoadBalancerProtocol build() {
            return new LoadBalancerProtocol(name);
        }

        @JsonIgnore
        public Builder copy(LoadBalancerProtocol o) {
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
     * The name of the protocol.
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;
}
