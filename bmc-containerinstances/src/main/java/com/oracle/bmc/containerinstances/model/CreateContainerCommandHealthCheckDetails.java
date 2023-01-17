/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Container Health Check Command type.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateContainerCommandHealthCheckDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "healthCheckType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateContainerCommandHealthCheckDetails
        extends CreateContainerHealthCheckDetails {
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
        /**
         * The list of strings which will be concatenated to a single command for checking container's status.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private java.util.List<String> command;

        /**
         * The list of strings which will be concatenated to a single command for checking container's status.
         *
         * @param command the value to set
         * @return this builder
         **/
        public Builder command(java.util.List<String> command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateContainerCommandHealthCheckDetails build() {
            CreateContainerCommandHealthCheckDetails model =
                    new CreateContainerCommandHealthCheckDetails(
                            this.name,
                            this.initialDelayInSeconds,
                            this.intervalInSeconds,
                            this.failureThreshold,
                            this.successThreshold,
                            this.timeoutInSeconds,
                            this.failureAction,
                            this.command);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContainerCommandHealthCheckDetails model) {
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
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateContainerCommandHealthCheckDetails(
            String name,
            Integer initialDelayInSeconds,
            Integer intervalInSeconds,
            Integer failureThreshold,
            Integer successThreshold,
            Integer timeoutInSeconds,
            ContainerHealthCheckFailureAction failureAction,
            java.util.List<String> command) {
        super(
                name,
                initialDelayInSeconds,
                intervalInSeconds,
                failureThreshold,
                successThreshold,
                timeoutInSeconds,
                failureAction);
        this.command = command;
    }

    /**
     * The list of strings which will be concatenated to a single command for checking container's status.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final java.util.List<String> command;

    /**
     * The list of strings which will be concatenated to a single command for checking container's status.
     *
     * @return the value
     **/
    public java.util.List<String> getCommand() {
        return command;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateContainerCommandHealthCheckDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateContainerCommandHealthCheckDetails)) {
            return false;
        }

        CreateContainerCommandHealthCheckDetails other =
                (CreateContainerCommandHealthCheckDetails) o;
        return java.util.Objects.equals(this.command, other.command) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        return result;
    }
}
