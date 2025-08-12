/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Runs a command in the job run to check whether application is healthy or not. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JobExecProbeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "jobProbeCheckType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobExecProbeDetails extends JobProbeDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The commands to run in the target job run to perform the startup probe */
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private java.util.List<String> command;

        /**
         * The commands to run in the target job run to perform the startup probe
         *
         * @param command the value to set
         * @return this builder
         */
        public Builder command(java.util.List<String> command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /** Number of seconds how often the job run should perform a startup probe */
        @com.fasterxml.jackson.annotation.JsonProperty("periodInSeconds")
        private Integer periodInSeconds;

        /**
         * Number of seconds how often the job run should perform a startup probe
         *
         * @param periodInSeconds the value to set
         * @return this builder
         */
        public Builder periodInSeconds(Integer periodInSeconds) {
            this.periodInSeconds = periodInSeconds;
            this.__explicitlySet__.add("periodInSeconds");
            return this;
        }
        /** How many times the job will try before giving up when a probe fails. */
        @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
        private Integer failureThreshold;

        /**
         * How many times the job will try before giving up when a probe fails.
         *
         * @param failureThreshold the value to set
         * @return this builder
         */
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            this.__explicitlySet__.add("failureThreshold");
            return this;
        }
        /** Number of seconds after the job run has started before a startup probe is initiated. */
        @com.fasterxml.jackson.annotation.JsonProperty("initialDelayInSeconds")
        private Integer initialDelayInSeconds;

        /**
         * Number of seconds after the job run has started before a startup probe is initiated.
         *
         * @param initialDelayInSeconds the value to set
         * @return this builder
         */
        public Builder initialDelayInSeconds(Integer initialDelayInSeconds) {
            this.initialDelayInSeconds = initialDelayInSeconds;
            this.__explicitlySet__.add("initialDelayInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobExecProbeDetails build() {
            JobExecProbeDetails model =
                    new JobExecProbeDetails(
                            this.command,
                            this.periodInSeconds,
                            this.failureThreshold,
                            this.initialDelayInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobExecProbeDetails model) {
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("periodInSeconds")) {
                this.periodInSeconds(model.getPeriodInSeconds());
            }
            if (model.wasPropertyExplicitlySet("failureThreshold")) {
                this.failureThreshold(model.getFailureThreshold());
            }
            if (model.wasPropertyExplicitlySet("initialDelayInSeconds")) {
                this.initialDelayInSeconds(model.getInitialDelayInSeconds());
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
    public JobExecProbeDetails(
            java.util.List<String> command,
            Integer periodInSeconds,
            Integer failureThreshold,
            Integer initialDelayInSeconds) {
        super();
        this.command = command;
        this.periodInSeconds = periodInSeconds;
        this.failureThreshold = failureThreshold;
        this.initialDelayInSeconds = initialDelayInSeconds;
    }

    /** The commands to run in the target job run to perform the startup probe */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final java.util.List<String> command;

    /**
     * The commands to run in the target job run to perform the startup probe
     *
     * @return the value
     */
    public java.util.List<String> getCommand() {
        return command;
    }

    /** Number of seconds how often the job run should perform a startup probe */
    @com.fasterxml.jackson.annotation.JsonProperty("periodInSeconds")
    private final Integer periodInSeconds;

    /**
     * Number of seconds how often the job run should perform a startup probe
     *
     * @return the value
     */
    public Integer getPeriodInSeconds() {
        return periodInSeconds;
    }

    /** How many times the job will try before giving up when a probe fails. */
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    private final Integer failureThreshold;

    /**
     * How many times the job will try before giving up when a probe fails.
     *
     * @return the value
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    /** Number of seconds after the job run has started before a startup probe is initiated. */
    @com.fasterxml.jackson.annotation.JsonProperty("initialDelayInSeconds")
    private final Integer initialDelayInSeconds;

    /**
     * Number of seconds after the job run has started before a startup probe is initiated.
     *
     * @return the value
     */
    public Integer getInitialDelayInSeconds() {
        return initialDelayInSeconds;
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
        sb.append("JobExecProbeDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(", periodInSeconds=").append(String.valueOf(this.periodInSeconds));
        sb.append(", failureThreshold=").append(String.valueOf(this.failureThreshold));
        sb.append(", initialDelayInSeconds=").append(String.valueOf(this.initialDelayInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobExecProbeDetails)) {
            return false;
        }

        JobExecProbeDetails other = (JobExecProbeDetails) o;
        return java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.periodInSeconds, other.periodInSeconds)
                && java.util.Objects.equals(this.failureThreshold, other.failureThreshold)
                && java.util.Objects.equals(this.initialDelayInSeconds, other.initialDelayInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result =
                (result * PRIME)
                        + (this.periodInSeconds == null ? 43 : this.periodInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.failureThreshold == null ? 43 : this.failureThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.initialDelayInSeconds == null
                                ? 43
                                : this.initialDelayInSeconds.hashCode());
        return result;
    }
}
