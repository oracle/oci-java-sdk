/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The configuration details of a step. <br>
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
        builder = PipelineStepConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineStepConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "maximumRuntimeInMinutes",
        "environmentVariables",
        "commandLineArguments"
    })
    public PipelineStepConfigurationDetails(
            Long maximumRuntimeInMinutes,
            java.util.Map<String, String> environmentVariables,
            String commandLineArguments) {
        super();
        this.maximumRuntimeInMinutes = maximumRuntimeInMinutes;
        this.environmentVariables = environmentVariables;
        this.commandLineArguments = commandLineArguments;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A time bound for the execution of the step. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumRuntimeInMinutes")
        private Long maximumRuntimeInMinutes;

        /**
         * A time bound for the execution of the step.
         *
         * @param maximumRuntimeInMinutes the value to set
         * @return this builder
         */
        public Builder maximumRuntimeInMinutes(Long maximumRuntimeInMinutes) {
            this.maximumRuntimeInMinutes = maximumRuntimeInMinutes;
            this.__explicitlySet__.add("maximumRuntimeInMinutes");
            return this;
        }
        /** Environment variables to set for step. */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.Map<String, String> environmentVariables;

        /**
         * Environment variables to set for step.
         *
         * @param environmentVariables the value to set
         * @return this builder
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }
        /** The command line arguments to set for step. */
        @com.fasterxml.jackson.annotation.JsonProperty("commandLineArguments")
        private String commandLineArguments;

        /**
         * The command line arguments to set for step.
         *
         * @param commandLineArguments the value to set
         * @return this builder
         */
        public Builder commandLineArguments(String commandLineArguments) {
            this.commandLineArguments = commandLineArguments;
            this.__explicitlySet__.add("commandLineArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineStepConfigurationDetails build() {
            PipelineStepConfigurationDetails model =
                    new PipelineStepConfigurationDetails(
                            this.maximumRuntimeInMinutes,
                            this.environmentVariables,
                            this.commandLineArguments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineStepConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("maximumRuntimeInMinutes")) {
                this.maximumRuntimeInMinutes(model.getMaximumRuntimeInMinutes());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
            }
            if (model.wasPropertyExplicitlySet("commandLineArguments")) {
                this.commandLineArguments(model.getCommandLineArguments());
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

    /** A time bound for the execution of the step. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumRuntimeInMinutes")
    private final Long maximumRuntimeInMinutes;

    /**
     * A time bound for the execution of the step.
     *
     * @return the value
     */
    public Long getMaximumRuntimeInMinutes() {
        return maximumRuntimeInMinutes;
    }

    /** Environment variables to set for step. */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.Map<String, String> environmentVariables;

    /**
     * Environment variables to set for step.
     *
     * @return the value
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return environmentVariables;
    }

    /** The command line arguments to set for step. */
    @com.fasterxml.jackson.annotation.JsonProperty("commandLineArguments")
    private final String commandLineArguments;

    /**
     * The command line arguments to set for step.
     *
     * @return the value
     */
    public String getCommandLineArguments() {
        return commandLineArguments;
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
        sb.append("PipelineStepConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("maximumRuntimeInMinutes=").append(String.valueOf(this.maximumRuntimeInMinutes));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", commandLineArguments=").append(String.valueOf(this.commandLineArguments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineStepConfigurationDetails)) {
            return false;
        }

        PipelineStepConfigurationDetails other = (PipelineStepConfigurationDetails) o;
        return java.util.Objects.equals(this.maximumRuntimeInMinutes, other.maximumRuntimeInMinutes)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(this.commandLineArguments, other.commandLineArguments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.maximumRuntimeInMinutes == null
                                ? 43
                                : this.maximumRuntimeInMinutes.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
