/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Container Health Check is using for checking container status and taking appropriate actions on
 * behalf of customers. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "healthCheckType",
        defaultImpl = CreateContainerHealthCheckDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateContainerTcpHealthCheckDetails.class,
            name = "TCP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateContainerHttpHealthCheckDetails.class,
            name = "HTTP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreateContainerCommandHealthCheckDetails.class,
            name = "COMMAND")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class CreateContainerHealthCheckDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "initialDelayInSeconds",
        "intervalInSeconds",
        "failureThreshold",
        "successThreshold",
        "timeoutInSeconds",
        "failureAction"
    })
    protected CreateContainerHealthCheckDetails(
            String name,
            Integer initialDelayInSeconds,
            Integer intervalInSeconds,
            Integer failureThreshold,
            Integer successThreshold,
            Integer timeoutInSeconds,
            ContainerHealthCheckFailureAction failureAction) {
        super();
        this.name = name;
        this.initialDelayInSeconds = initialDelayInSeconds;
        this.intervalInSeconds = intervalInSeconds;
        this.failureThreshold = failureThreshold;
        this.successThreshold = successThreshold;
        this.timeoutInSeconds = timeoutInSeconds;
        this.failureAction = failureAction;
    }

    /** Health check name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Health check name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The initial delay in seconds before start checking container health status. */
    @com.fasterxml.jackson.annotation.JsonProperty("initialDelayInSeconds")
    private final Integer initialDelayInSeconds;

    /**
     * The initial delay in seconds before start checking container health status.
     *
     * @return the value
     */
    public Integer getInitialDelayInSeconds() {
        return initialDelayInSeconds;
    }

    /** Number of seconds between two consecutive runs for checking container health. */
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInSeconds")
    private final Integer intervalInSeconds;

    /**
     * Number of seconds between two consecutive runs for checking container health.
     *
     * @return the value
     */
    public Integer getIntervalInSeconds() {
        return intervalInSeconds;
    }

    /** Number of consecutive failures at which we consider the check failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    private final Integer failureThreshold;

    /**
     * Number of consecutive failures at which we consider the check failed.
     *
     * @return the value
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /**
     * Number of consecutive successes at which we consider the check succeeded again after it was
     * in failure state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("successThreshold")
    private final Integer successThreshold;

    /**
     * Number of consecutive successes at which we consider the check succeeded again after it was
     * in failure state.
     *
     * @return the value
     */
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    /** Length of waiting time in seconds before marking health check failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * Length of waiting time in seconds before marking health check failed.
     *
     * @return the value
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * The action will be triggered when the container health check fails. There are two types of
     * action: KILL or NONE. The default action is KILL. If failure action is KILL, the container
     * will be subject to the container restart policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureAction")
    private final ContainerHealthCheckFailureAction failureAction;

    /**
     * The action will be triggered when the container health check fails. There are two types of
     * action: KILL or NONE. The default action is KILL. If failure action is KILL, the container
     * will be subject to the container restart policy.
     *
     * @return the value
     */
    public ContainerHealthCheckFailureAction getFailureAction() {
        return failureAction;
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
        sb.append("CreateContainerHealthCheckDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", initialDelayInSeconds=").append(String.valueOf(this.initialDelayInSeconds));
        sb.append(", intervalInSeconds=").append(String.valueOf(this.intervalInSeconds));
        sb.append(", failureThreshold=").append(String.valueOf(this.failureThreshold));
        sb.append(", successThreshold=").append(String.valueOf(this.successThreshold));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", failureAction=").append(String.valueOf(this.failureAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateContainerHealthCheckDetails)) {
            return false;
        }

        CreateContainerHealthCheckDetails other = (CreateContainerHealthCheckDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.initialDelayInSeconds, other.initialDelayInSeconds)
                && java.util.Objects.equals(this.intervalInSeconds, other.intervalInSeconds)
                && java.util.Objects.equals(this.failureThreshold, other.failureThreshold)
                && java.util.Objects.equals(this.successThreshold, other.successThreshold)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(this.failureAction, other.failureAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.initialDelayInSeconds == null
                                ? 43
                                : this.initialDelayInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalInSeconds == null ? 43 : this.intervalInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.failureThreshold == null ? 43 : this.failureThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.successThreshold == null ? 43 : this.successThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.failureAction == null ? 43 : this.failureAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
