/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The default job configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DefaultJobConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "jobType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DefaultJobConfigurationDetails extends JobConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.Map<String, String> environmentVariables;

        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commandLineArguments")
        private String commandLineArguments;

        public Builder commandLineArguments(String commandLineArguments) {
            this.commandLineArguments = commandLineArguments;
            this.__explicitlySet__.add("commandLineArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maximumRuntimeInMinutes")
        private Long maximumRuntimeInMinutes;

        public Builder maximumRuntimeInMinutes(Long maximumRuntimeInMinutes) {
            this.maximumRuntimeInMinutes = maximumRuntimeInMinutes;
            this.__explicitlySet__.add("maximumRuntimeInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultJobConfigurationDetails build() {
            DefaultJobConfigurationDetails __instance__ =
                    new DefaultJobConfigurationDetails(
                            environmentVariables, commandLineArguments, maximumRuntimeInMinutes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultJobConfigurationDetails o) {
            Builder copiedBuilder =
                    environmentVariables(o.getEnvironmentVariables())
                            .commandLineArguments(o.getCommandLineArguments())
                            .maximumRuntimeInMinutes(o.getMaximumRuntimeInMinutes());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
    public DefaultJobConfigurationDetails(
            java.util.Map<String, String> environmentVariables,
            String commandLineArguments,
            Long maximumRuntimeInMinutes) {
        super();
        this.environmentVariables = environmentVariables;
        this.commandLineArguments = commandLineArguments;
        this.maximumRuntimeInMinutes = maximumRuntimeInMinutes;
    }

    /**
     * Environment variables to set for the job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * The arguments to pass to the job.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commandLineArguments")
    private final String commandLineArguments;

    public String getCommandLineArguments() {
        return commandLineArguments;
    }

    /**
     * A time bound for the execution of the job. Timer starts when the job becomes active.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumRuntimeInMinutes")
    private final Long maximumRuntimeInMinutes;

    public Long getMaximumRuntimeInMinutes() {
        return maximumRuntimeInMinutes;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DefaultJobConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", commandLineArguments=").append(String.valueOf(this.commandLineArguments));
        sb.append(", maximumRuntimeInMinutes=")
                .append(String.valueOf(this.maximumRuntimeInMinutes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultJobConfigurationDetails)) {
            return false;
        }

        DefaultJobConfigurationDetails other = (DefaultJobConfigurationDetails) o;
        return java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(this.commandLineArguments, other.commandLineArguments)
                && java.util.Objects.equals(
                        this.maximumRuntimeInMinutes, other.maximumRuntimeInMinutes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        result =
                (result * PRIME)
                        + (this.commandLineArguments == null
                                ? 43
                                : this.commandLineArguments.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumRuntimeInMinutes == null
                                ? 43
                                : this.maximumRuntimeInMinutes.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
