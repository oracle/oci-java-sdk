/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The variable of the task. At least one of the dynamicArguments or output needs to be provided.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskVariable.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TaskVariable extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"inputVariables", "outputVariables"})
    public TaskVariable(
            java.util.List<InputArgument> inputVariables, java.util.List<String> outputVariables) {
        super();
        this.inputVariables = inputVariables;
        this.outputVariables = outputVariables;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The input variables for the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputVariables")
        private java.util.List<InputArgument> inputVariables;

        /**
         * The input variables for the task.
         *
         * @param inputVariables the value to set
         * @return this builder
         */
        public Builder inputVariables(java.util.List<InputArgument> inputVariables) {
            this.inputVariables = inputVariables;
            this.__explicitlySet__.add("inputVariables");
            return this;
        }
        /** The list of output variables. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputVariables")
        private java.util.List<String> outputVariables;

        /**
         * The list of output variables.
         *
         * @param outputVariables the value to set
         * @return this builder
         */
        public Builder outputVariables(java.util.List<String> outputVariables) {
            this.outputVariables = outputVariables;
            this.__explicitlySet__.add("outputVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskVariable build() {
            TaskVariable model = new TaskVariable(this.inputVariables, this.outputVariables);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskVariable model) {
            if (model.wasPropertyExplicitlySet("inputVariables")) {
                this.inputVariables(model.getInputVariables());
            }
            if (model.wasPropertyExplicitlySet("outputVariables")) {
                this.outputVariables(model.getOutputVariables());
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

    /** The input variables for the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputVariables")
    private final java.util.List<InputArgument> inputVariables;

    /**
     * The input variables for the task.
     *
     * @return the value
     */
    public java.util.List<InputArgument> getInputVariables() {
        return inputVariables;
    }

    /** The list of output variables. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputVariables")
    private final java.util.List<String> outputVariables;

    /**
     * The list of output variables.
     *
     * @return the value
     */
    public java.util.List<String> getOutputVariables() {
        return outputVariables;
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
        sb.append("TaskVariable(");
        sb.append("super=").append(super.toString());
        sb.append("inputVariables=").append(String.valueOf(this.inputVariables));
        sb.append(", outputVariables=").append(String.valueOf(this.outputVariables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskVariable)) {
            return false;
        }

        TaskVariable other = (TaskVariable) o;
        return java.util.Objects.equals(this.inputVariables, other.inputVariables)
                && java.util.Objects.equals(this.outputVariables, other.outputVariables)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inputVariables == null ? 43 : this.inputVariables.hashCode());
        result =
                (result * PRIME)
                        + (this.outputVariables == null ? 43 : this.outputVariables.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
