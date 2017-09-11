/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for creating a backend set in a load balancer.
 * For more information on backend set configuration, see
 * [Managing Backend Sets](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/tasks/managingbackendsets.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateBackendSetDetails.Builder.class
)
public class CreateBackendSetDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backends")
        private java.util.List<BackendDetails> backends;

        @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
        private HealthCheckerDetails healthChecker;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private String policy;

        @com.fasterxml.jackson.annotation.JsonProperty("sessionPersistenceConfiguration")
        private SessionPersistenceConfigurationDetails sessionPersistenceConfiguration;

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfigurationDetails sslConfiguration;

        public CreateBackendSetDetails build() {
            return new CreateBackendSetDetails(
                    backends,
                    healthChecker,
                    name,
                    policy,
                    sessionPersistenceConfiguration,
                    sslConfiguration);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBackendSetDetails o) {
            return backends(o.getBackends())
                    .healthChecker(o.getHealthChecker())
                    .name(o.getName())
                    .policy(o.getPolicy())
                    .sessionPersistenceConfiguration(o.getSessionPersistenceConfiguration())
                    .sslConfiguration(o.getSslConfiguration());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backends")
    java.util.List<BackendDetails> backends;

    @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    HealthCheckerDetails healthChecker;

    /**
     * A friendly name for the backend set. It must be unique and it cannot be changed.
     * <p>
     * Valid backend set names include only alphanumeric characters, dashes, and underscores. Backend set names cannot
     * contain spaces. Avoid entering confidential information.
     * <p>
     * Example: `My_backend_set`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Size(min = 1, max = 32)
    String name;

    /**
     * The load balancer policy for the backend set. The default load balancing policy is 'ROUND_ROBIN'
     * To get a list of available policies, use the {@link #listPolicies(ListPoliciesRequest) listPolicies} operation.
     * <p>
     * Example: `LEAST_CONNECTIONS`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String policy;

    @com.fasterxml.jackson.annotation.JsonProperty("sessionPersistenceConfiguration")
    SessionPersistenceConfigurationDetails sessionPersistenceConfiguration;

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    SSLConfigurationDetails sslConfiguration;
}
