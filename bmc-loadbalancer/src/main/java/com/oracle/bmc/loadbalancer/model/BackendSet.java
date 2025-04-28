/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration of a load balancer backend set. For more information on backend set
 * configuration, see [Managing Backend
 * Sets](https://docs.oracle.com/iaas/Content/Balance/Tasks/managingbackendsets.htm).
 *
 * <p>*Note:** The {@code sessionPersistenceConfiguration} (application cookie stickiness) and
 * {@code lbCookieSessionPersistenceConfiguration} (LB cookie stickiness) attributes are mutually
 * exclusive. To avoid returning an error, configure only one of these two attributes per backend
 * set.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BackendSet.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BackendSet extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "policy",
        "backends",
        "backendMaxConnections",
        "healthChecker",
        "sslConfiguration",
        "sessionPersistenceConfiguration",
        "lbCookieSessionPersistenceConfiguration"
    })
    public BackendSet(
            String name,
            String policy,
            java.util.List<Backend> backends,
            Integer backendMaxConnections,
            HealthChecker healthChecker,
            SSLConfiguration sslConfiguration,
            SessionPersistenceConfigurationDetails sessionPersistenceConfiguration,
            LBCookieSessionPersistenceConfigurationDetails
                    lbCookieSessionPersistenceConfiguration) {
        super();
        this.name = name;
        this.policy = policy;
        this.backends = backends;
        this.backendMaxConnections = backendMaxConnections;
        this.healthChecker = healthChecker;
        this.sslConfiguration = sslConfiguration;
        this.sessionPersistenceConfiguration = sessionPersistenceConfiguration;
        this.lbCookieSessionPersistenceConfiguration = lbCookieSessionPersistenceConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A friendly name for the backend set. It must be unique and it cannot be changed.
         *
         * <p>Valid backend set names include only alphanumeric characters, dashes, and underscores.
         * Backend set names cannot contain spaces. Avoid entering confidential information.
         *
         * <p>Example: {@code example_backend_set}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A friendly name for the backend set. It must be unique and it cannot be changed.
         *
         * <p>Valid backend set names include only alphanumeric characters, dashes, and underscores.
         * Backend set names cannot contain spaces. Avoid entering confidential information.
         *
         * <p>Example: {@code example_backend_set}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The load balancer policy for the backend set. To get a list of available policies, use
         * the {@link #listPolicies(ListPoliciesRequest) listPolicies} operation.
         *
         * <p>Example: {@code LEAST_CONNECTIONS}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private String policy;

        /**
         * The load balancer policy for the backend set. To get a list of available policies, use
         * the {@link #listPolicies(ListPoliciesRequest) listPolicies} operation.
         *
         * <p>Example: {@code LEAST_CONNECTIONS}
         *
         * @param policy the value to set
         * @return this builder
         */
        public Builder policy(String policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backends")
        private java.util.List<Backend> backends;

        public Builder backends(java.util.List<Backend> backends) {
            this.backends = backends;
            this.__explicitlySet__.add("backends");
            return this;
        }
        /**
         * The maximum number of simultaneous connections the load balancer can make to any backend
         * in the backend set unless the backend has its own maxConnections setting. If this is not
         * set then the number of simultaneous connections the load balancer can make to any backend
         * in the backend set unless the backend has its own maxConnections setting is unlimited.
         *
         * <p>Example: {@code 300}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backendMaxConnections")
        private Integer backendMaxConnections;

        /**
         * The maximum number of simultaneous connections the load balancer can make to any backend
         * in the backend set unless the backend has its own maxConnections setting. If this is not
         * set then the number of simultaneous connections the load balancer can make to any backend
         * in the backend set unless the backend has its own maxConnections setting is unlimited.
         *
         * <p>Example: {@code 300}
         *
         * @param backendMaxConnections the value to set
         * @return this builder
         */
        public Builder backendMaxConnections(Integer backendMaxConnections) {
            this.backendMaxConnections = backendMaxConnections;
            this.__explicitlySet__.add("backendMaxConnections");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
        private HealthChecker healthChecker;

        public Builder healthChecker(HealthChecker healthChecker) {
            this.healthChecker = healthChecker;
            this.__explicitlySet__.add("healthChecker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
        private SSLConfiguration sslConfiguration;

        public Builder sslConfiguration(SSLConfiguration sslConfiguration) {
            this.sslConfiguration = sslConfiguration;
            this.__explicitlySet__.add("sslConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionPersistenceConfiguration")
        private SessionPersistenceConfigurationDetails sessionPersistenceConfiguration;

        public Builder sessionPersistenceConfiguration(
                SessionPersistenceConfigurationDetails sessionPersistenceConfiguration) {
            this.sessionPersistenceConfiguration = sessionPersistenceConfiguration;
            this.__explicitlySet__.add("sessionPersistenceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lbCookieSessionPersistenceConfiguration")
        private LBCookieSessionPersistenceConfigurationDetails
                lbCookieSessionPersistenceConfiguration;

        public Builder lbCookieSessionPersistenceConfiguration(
                LBCookieSessionPersistenceConfigurationDetails
                        lbCookieSessionPersistenceConfiguration) {
            this.lbCookieSessionPersistenceConfiguration = lbCookieSessionPersistenceConfiguration;
            this.__explicitlySet__.add("lbCookieSessionPersistenceConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackendSet build() {
            BackendSet model =
                    new BackendSet(
                            this.name,
                            this.policy,
                            this.backends,
                            this.backendMaxConnections,
                            this.healthChecker,
                            this.sslConfiguration,
                            this.sessionPersistenceConfiguration,
                            this.lbCookieSessionPersistenceConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackendSet model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("policy")) {
                this.policy(model.getPolicy());
            }
            if (model.wasPropertyExplicitlySet("backends")) {
                this.backends(model.getBackends());
            }
            if (model.wasPropertyExplicitlySet("backendMaxConnections")) {
                this.backendMaxConnections(model.getBackendMaxConnections());
            }
            if (model.wasPropertyExplicitlySet("healthChecker")) {
                this.healthChecker(model.getHealthChecker());
            }
            if (model.wasPropertyExplicitlySet("sslConfiguration")) {
                this.sslConfiguration(model.getSslConfiguration());
            }
            if (model.wasPropertyExplicitlySet("sessionPersistenceConfiguration")) {
                this.sessionPersistenceConfiguration(model.getSessionPersistenceConfiguration());
            }
            if (model.wasPropertyExplicitlySet("lbCookieSessionPersistenceConfiguration")) {
                this.lbCookieSessionPersistenceConfiguration(
                        model.getLbCookieSessionPersistenceConfiguration());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A friendly name for the backend set. It must be unique and it cannot be changed.
     *
     * <p>Valid backend set names include only alphanumeric characters, dashes, and underscores.
     * Backend set names cannot contain spaces. Avoid entering confidential information.
     *
     * <p>Example: {@code example_backend_set}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A friendly name for the backend set. It must be unique and it cannot be changed.
     *
     * <p>Valid backend set names include only alphanumeric characters, dashes, and underscores.
     * Backend set names cannot contain spaces. Avoid entering confidential information.
     *
     * <p>Example: {@code example_backend_set}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The load balancer policy for the backend set. To get a list of available policies, use the
     * {@link #listPolicies(ListPoliciesRequest) listPolicies} operation.
     *
     * <p>Example: {@code LEAST_CONNECTIONS}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final String policy;

    /**
     * The load balancer policy for the backend set. To get a list of available policies, use the
     * {@link #listPolicies(ListPoliciesRequest) listPolicies} operation.
     *
     * <p>Example: {@code LEAST_CONNECTIONS}
     *
     * @return the value
     */
    public String getPolicy() {
        return policy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backends")
    private final java.util.List<Backend> backends;

    public java.util.List<Backend> getBackends() {
        return backends;
    }

    /**
     * The maximum number of simultaneous connections the load balancer can make to any backend in
     * the backend set unless the backend has its own maxConnections setting. If this is not set
     * then the number of simultaneous connections the load balancer can make to any backend in the
     * backend set unless the backend has its own maxConnections setting is unlimited.
     *
     * <p>Example: {@code 300}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backendMaxConnections")
    private final Integer backendMaxConnections;

    /**
     * The maximum number of simultaneous connections the load balancer can make to any backend in
     * the backend set unless the backend has its own maxConnections setting. If this is not set
     * then the number of simultaneous connections the load balancer can make to any backend in the
     * backend set unless the backend has its own maxConnections setting is unlimited.
     *
     * <p>Example: {@code 300}
     *
     * @return the value
     */
    public Integer getBackendMaxConnections() {
        return backendMaxConnections;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("healthChecker")
    private final HealthChecker healthChecker;

    public HealthChecker getHealthChecker() {
        return healthChecker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sslConfiguration")
    private final SSLConfiguration sslConfiguration;

    public SSLConfiguration getSslConfiguration() {
        return sslConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionPersistenceConfiguration")
    private final SessionPersistenceConfigurationDetails sessionPersistenceConfiguration;

    public SessionPersistenceConfigurationDetails getSessionPersistenceConfiguration() {
        return sessionPersistenceConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lbCookieSessionPersistenceConfiguration")
    private final LBCookieSessionPersistenceConfigurationDetails
            lbCookieSessionPersistenceConfiguration;

    public LBCookieSessionPersistenceConfigurationDetails
            getLbCookieSessionPersistenceConfiguration() {
        return lbCookieSessionPersistenceConfiguration;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BackendSet(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", policy=").append(String.valueOf(this.policy));
        sb.append(", backends=").append(String.valueOf(this.backends));
        sb.append(", backendMaxConnections=").append(String.valueOf(this.backendMaxConnections));
        sb.append(", healthChecker=").append(String.valueOf(this.healthChecker));
        sb.append(", sslConfiguration=").append(String.valueOf(this.sslConfiguration));
        sb.append(", sessionPersistenceConfiguration=")
                .append(String.valueOf(this.sessionPersistenceConfiguration));
        sb.append(", lbCookieSessionPersistenceConfiguration=")
                .append(String.valueOf(this.lbCookieSessionPersistenceConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackendSet)) {
            return false;
        }

        BackendSet other = (BackendSet) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.backends, other.backends)
                && java.util.Objects.equals(this.backendMaxConnections, other.backendMaxConnections)
                && java.util.Objects.equals(this.healthChecker, other.healthChecker)
                && java.util.Objects.equals(this.sslConfiguration, other.sslConfiguration)
                && java.util.Objects.equals(
                        this.sessionPersistenceConfiguration, other.sessionPersistenceConfiguration)
                && java.util.Objects.equals(
                        this.lbCookieSessionPersistenceConfiguration,
                        other.lbCookieSessionPersistenceConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result = (result * PRIME) + (this.backends == null ? 43 : this.backends.hashCode());
        result =
                (result * PRIME)
                        + (this.backendMaxConnections == null
                                ? 43
                                : this.backendMaxConnections.hashCode());
        result =
                (result * PRIME)
                        + (this.healthChecker == null ? 43 : this.healthChecker.hashCode());
        result =
                (result * PRIME)
                        + (this.sslConfiguration == null ? 43 : this.sslConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.sessionPersistenceConfiguration == null
                                ? 43
                                : this.sessionPersistenceConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.lbCookieSessionPersistenceConfiguration == null
                                ? 43
                                : this.lbCookieSessionPersistenceConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
