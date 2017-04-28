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
 * The configuration of a load balancer backend set.
 * For more information on backend set configuration, see
 * [Managing Backend Sets](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/tasks/managingbackendsets.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = BackendSet.Builder.class)
public class BackendSet {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("backends")
        private List<Backend> backends;

        @JsonProperty("healthChecker")
        private HealthChecker healthChecker;

        @JsonProperty("name")
        private String name;

        @JsonProperty("policy")
        private String policy;

        @JsonProperty("sslConfiguration")
        private SSLConfiguration sslConfiguration;

        public BackendSet build() {
            return new BackendSet(backends, healthChecker, name, policy, sslConfiguration);
        }

        @JsonIgnore
        public Builder copy(BackendSet o) {
            return backends(o.getBackends())
                    .healthChecker(o.getHealthChecker())
                    .name(o.getName())
                    .policy(o.getPolicy())
                    .sslConfiguration(o.getSslConfiguration());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @JsonProperty("backends")
    @Valid
    @NotNull
    List<Backend> backends;

    @JsonProperty("healthChecker")
    @Valid
    @NotNull
    HealthChecker healthChecker;

    /**
     * A friendly name for the backend set. It must be unique and it cannot be changed.
     * <p>
     * Example: `My backend set`
     *
     **/
    @JsonProperty("name")
    @Valid
    @NotNull
    String name;

    /**
     * The load balancer policy for the backend set. The default load balancing policy is 'ROUND_ROBIN'
     * To get a list of available policies, use the {@link #listPolicies(ListPoliciesRequest) listPolicies}
     * operation.
     * <p>
     * Example: `LEAST_CONNECTIONS`
     *
     **/
    @JsonProperty("policy")
    @Valid
    @NotNull
    String policy;

    @JsonProperty("sslConfiguration")
    SSLConfiguration sslConfiguration;
}
