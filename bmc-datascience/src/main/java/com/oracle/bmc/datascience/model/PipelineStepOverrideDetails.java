/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Override details of the step. Only Step Configuration is allowed to be overridden.
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
    builder = PipelineStepOverrideDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PipelineStepOverrideDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stepName",
        "stepConfigurationDetails",
        "stepContainerConfigurationDetails",
        "stepDataflowConfigurationDetails"
    })
    public PipelineStepOverrideDetails(
            String stepName,
            PipelineStepConfigurationDetails stepConfigurationDetails,
            PipelineContainerConfigurationDetails stepContainerConfigurationDetails,
            PipelineDataflowConfigurationDetails stepDataflowConfigurationDetails) {
        super();
        this.stepName = stepName;
        this.stepConfigurationDetails = stepConfigurationDetails;
        this.stepContainerConfigurationDetails = stepContainerConfigurationDetails;
        this.stepDataflowConfigurationDetails = stepDataflowConfigurationDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the step.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * The name of the step.
         * @param stepName the value to set
         * @return this builder
         **/
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepConfigurationDetails")
        private PipelineStepConfigurationDetails stepConfigurationDetails;

        public Builder stepConfigurationDetails(
                PipelineStepConfigurationDetails stepConfigurationDetails) {
            this.stepConfigurationDetails = stepConfigurationDetails;
            this.__explicitlySet__.add("stepConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepContainerConfigurationDetails")
        private PipelineContainerConfigurationDetails stepContainerConfigurationDetails;

        public Builder stepContainerConfigurationDetails(
                PipelineContainerConfigurationDetails stepContainerConfigurationDetails) {
            this.stepContainerConfigurationDetails = stepContainerConfigurationDetails;
            this.__explicitlySet__.add("stepContainerConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepDataflowConfigurationDetails")
        private PipelineDataflowConfigurationDetails stepDataflowConfigurationDetails;

        public Builder stepDataflowConfigurationDetails(
                PipelineDataflowConfigurationDetails stepDataflowConfigurationDetails) {
            this.stepDataflowConfigurationDetails = stepDataflowConfigurationDetails;
            this.__explicitlySet__.add("stepDataflowConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineStepOverrideDetails build() {
            PipelineStepOverrideDetails model =
                    new PipelineStepOverrideDetails(
                            this.stepName,
                            this.stepConfigurationDetails,
                            this.stepContainerConfigurationDetails,
                            this.stepDataflowConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineStepOverrideDetails model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("stepConfigurationDetails")) {
                this.stepConfigurationDetails(model.getStepConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("stepContainerConfigurationDetails")) {
                this.stepContainerConfigurationDetails(
                        model.getStepContainerConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("stepDataflowConfigurationDetails")) {
                this.stepDataflowConfigurationDetails(model.getStepDataflowConfigurationDetails());
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

    /**
     * The name of the step.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * The name of the step.
     * @return the value
     **/
    public String getStepName() {
        return stepName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stepConfigurationDetails")
    private final PipelineStepConfigurationDetails stepConfigurationDetails;

    public PipelineStepConfigurationDetails getStepConfigurationDetails() {
        return stepConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stepContainerConfigurationDetails")
    private final PipelineContainerConfigurationDetails stepContainerConfigurationDetails;

    public PipelineContainerConfigurationDetails getStepContainerConfigurationDetails() {
        return stepContainerConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stepDataflowConfigurationDetails")
    private final PipelineDataflowConfigurationDetails stepDataflowConfigurationDetails;

    public PipelineDataflowConfigurationDetails getStepDataflowConfigurationDetails() {
        return stepDataflowConfigurationDetails;
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
        sb.append("PipelineStepOverrideDetails(");
        sb.append("super=").append(super.toString());
        sb.append("stepName=").append(String.valueOf(this.stepName));
        sb.append(", stepConfigurationDetails=")
                .append(String.valueOf(this.stepConfigurationDetails));
        sb.append(", stepContainerConfigurationDetails=")
                .append(String.valueOf(this.stepContainerConfigurationDetails));
        sb.append(", stepDataflowConfigurationDetails=")
                .append(String.valueOf(this.stepDataflowConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineStepOverrideDetails)) {
            return false;
        }

        PipelineStepOverrideDetails other = (PipelineStepOverrideDetails) o;
        return java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(
                        this.stepConfigurationDetails, other.stepConfigurationDetails)
                && java.util.Objects.equals(
                        this.stepContainerConfigurationDetails,
                        other.stepContainerConfigurationDetails)
                && java.util.Objects.equals(
                        this.stepDataflowConfigurationDetails,
                        other.stepDataflowConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result =
                (result * PRIME)
                        + (this.stepConfigurationDetails == null
                                ? 43
                                : this.stepConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.stepContainerConfigurationDetails == null
                                ? 43
                                : this.stepContainerConfigurationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.stepDataflowConfigurationDetails == null
                                ? 43
                                : this.stepDataflowConfigurationDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
