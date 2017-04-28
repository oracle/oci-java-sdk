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
 * The configuration details for updating a load balancer backend set.
 * For more information on backend set configuration, see
 * [Managing Backend Sets](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/tasks/managingbackendsets.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = UpdateBackendSetDetails.Builder.class)
public class UpdateBackendSetDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("backends")
        private List<BackendDetails> backends;

        @JsonProperty("healthChecker")
        private HealthCheckerDetails healthChecker;

        @JsonProperty("policy")
        private String policy;

        @JsonProperty("sslConfiguration")
        private SSLConfigurationDetails sslConfiguration;

        public UpdateBackendSetDetails build() {
            return new UpdateBackendSetDetails(backends, healthChecker, policy, sslConfiguration);
        }

        @JsonIgnore
        public Builder copy(UpdateBackendSetDetails o) {
            return backends(o.getBackends())
                    .healthChecker(o.getHealthChecker())
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
    List<BackendDetails> backends;

    @JsonProperty("healthChecker")
    @Valid
    @NotNull
    HealthCheckerDetails healthChecker;

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
    SSLConfigurationDetails sslConfiguration;
}
