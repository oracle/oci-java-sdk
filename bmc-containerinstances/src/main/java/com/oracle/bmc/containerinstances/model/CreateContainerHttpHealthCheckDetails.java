/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Container Health Check HTTP type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateContainerHttpHealthCheckDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "healthCheckType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateContainerHttpHealthCheckDetails extends CreateContainerHealthCheckDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialDelayInSeconds")
        private Integer initialDelayInSeconds;

        public Builder initialDelayInSeconds(Integer initialDelayInSeconds) {
            this.initialDelayInSeconds = initialDelayInSeconds;
            this.__explicitlySet__.add("initialDelayInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
        private Integer intervalInSeconds;

        public Builder intervalInSeconds(Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            this.__explicitlySet__.add("intervalInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
        private Integer failureThreshold;

        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            this.__explicitlySet__.add("failureThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("successThreshold")
        private Integer successThreshold;

        public Builder successThreshold(Integer successThreshold) {
            this.successThreshold = successThreshold;
            this.__explicitlySet__.add("successThreshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("failureAction")
        private ContainerHealthCheckFailureAction failureAction;

        public Builder failureAction(ContainerHealthCheckFailureAction failureAction) {
            this.failureAction = failureAction;
            this.__explicitlySet__.add("failureAction");
            return this;
        }
        /** Container health check Http's path. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Container health check Http's path.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** Container health check Http's port. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Container health check Http's port.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Container health check Http's headers. */
        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private java.util.List<HealthCheckHttpHeader> headers;

        /**
         * Container health check Http's headers.
         *
         * @param headers the value to set
         * @return this builder
         */
        public Builder headers(java.util.List<HealthCheckHttpHeader> headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateContainerHttpHealthCheckDetails build() {
            CreateContainerHttpHealthCheckDetails model =
                    new CreateContainerHttpHealthCheckDetails(
                            this.name,
                            this.initialDelayInSeconds,
                            this.intervalInSeconds,
                            this.failureThreshold,
                            this.successThreshold,
                            this.timeoutInSeconds,
                            this.failureAction,
                            this.path,
                            this.port,
                            this.headers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContainerHttpHealthCheckDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("initialDelayInSeconds")) {
                this.initialDelayInSeconds(model.getInitialDelayInSeconds());
            }
            if (model.wasPropertyExplicitlySet("intervalInSeconds")) {
                this.intervalInSeconds(model.getIntervalInSeconds());
            }
            if (model.wasPropertyExplicitlySet("failureThreshold")) {
                this.failureThreshold(model.getFailureThreshold());
            }
            if (model.wasPropertyExplicitlySet("successThreshold")) {
                this.successThreshold(model.getSuccessThreshold());
            }
            if (model.wasPropertyExplicitlySet("timeoutInSeconds")) {
                this.timeoutInSeconds(model.getTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("failureAction")) {
                this.failureAction(model.getFailureAction());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("headers")) {
                this.headers(model.getHeaders());
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

    @Deprecated
    public CreateContainerHttpHealthCheckDetails(
            String name,
            Integer initialDelayInSeconds,
            Integer intervalInSeconds,
            Integer failureThreshold,
            Integer successThreshold,
            Integer timeoutInSeconds,
            ContainerHealthCheckFailureAction failureAction,
            String path,
            Integer port,
            java.util.List<HealthCheckHttpHeader> headers) {
        super(
                name,
                initialDelayInSeconds,
                intervalInSeconds,
                failureThreshold,
                successThreshold,
                timeoutInSeconds,
                failureAction);
        this.path = path;
        this.port = port;
        this.headers = headers;
    }

    /** Container health check Http's path. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Container health check Http's path.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** Container health check Http's port. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Container health check Http's port.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Container health check Http's headers. */
    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    private final java.util.List<HealthCheckHttpHeader> headers;

    /**
     * Container health check Http's headers.
     *
     * @return the value
     */
    public java.util.List<HealthCheckHttpHeader> getHeaders() {
        return headers;
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
        sb.append("CreateContainerHttpHealthCheckDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", headers=").append(String.valueOf(this.headers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateContainerHttpHealthCheckDetails)) {
            return false;
        }

        CreateContainerHttpHealthCheckDetails other = (CreateContainerHttpHealthCheckDetails) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.headers, other.headers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.headers == null ? 43 : this.headers.hashCode());
        return result;
    }
}
