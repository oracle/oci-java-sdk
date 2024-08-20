/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The details of the output variable that will be used for mapping. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OutputVariableDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OutputVariableDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"stepName", "outputVariableName"})
    public OutputVariableDetails(String stepName, String outputVariableName) {
        super();
        this.stepName = stepName;
        this.outputVariableName = outputVariableName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the task step the output variable belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * The name of the task step the output variable belongs to.
         *
         * @param stepName the value to set
         * @return this builder
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /** The name of the output variable whose value that has to be mapped. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputVariableName")
        private String outputVariableName;

        /**
         * The name of the output variable whose value that has to be mapped.
         *
         * @param outputVariableName the value to set
         * @return this builder
         */
        public Builder outputVariableName(String outputVariableName) {
            this.outputVariableName = outputVariableName;
            this.__explicitlySet__.add("outputVariableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OutputVariableDetails build() {
            OutputVariableDetails model =
                    new OutputVariableDetails(this.stepName, this.outputVariableName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OutputVariableDetails model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("outputVariableName")) {
                this.outputVariableName(model.getOutputVariableName());
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

    /** The name of the task step the output variable belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * The name of the task step the output variable belongs to.
     *
     * @return the value
     */
    public String getStepName() {
        return stepName;
    }

    /** The name of the output variable whose value that has to be mapped. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputVariableName")
    private final String outputVariableName;

    /**
     * The name of the output variable whose value that has to be mapped.
     *
     * @return the value
     */
    public String getOutputVariableName() {
        return outputVariableName;
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
        sb.append("OutputVariableDetails(");
        sb.append("super=").append(super.toString());
        sb.append("stepName=").append(String.valueOf(this.stepName));
        sb.append(", outputVariableName=").append(String.valueOf(this.outputVariableName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OutputVariableDetails)) {
            return false;
        }

        OutputVariableDetails other = (OutputVariableDetails) o;
        return java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.outputVariableName, other.outputVariableName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result =
                (result * PRIME)
                        + (this.outputVariableName == null
                                ? 43
                                : this.outputVariableName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
