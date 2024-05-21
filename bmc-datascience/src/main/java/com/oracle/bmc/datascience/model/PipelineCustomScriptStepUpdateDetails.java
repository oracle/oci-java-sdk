/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The type of step where user provides the step artifact to be executed on an execution engine managed by the pipelines service.
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
    builder = PipelineCustomScriptStepUpdateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "stepType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PipelineCustomScriptStepUpdateDetails extends PipelineStepUpdateDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonProperty("stepInfrastructureConfigurationDetails")
        private PipelineInfrastructureConfigurationDetails stepInfrastructureConfigurationDetails;

        public Builder stepInfrastructureConfigurationDetails(
                PipelineInfrastructureConfigurationDetails stepInfrastructureConfigurationDetails) {
            this.stepInfrastructureConfigurationDetails = stepInfrastructureConfigurationDetails;
            this.__explicitlySet__.add("stepInfrastructureConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineCustomScriptStepUpdateDetails build() {
            PipelineCustomScriptStepUpdateDetails model =
                    new PipelineCustomScriptStepUpdateDetails(
                            this.stepName,
                            this.description,
                            this.stepConfigurationDetails,
                            this.stepInfrastructureConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineCustomScriptStepUpdateDetails model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("stepConfigurationDetails")) {
                this.stepConfigurationDetails(model.getStepConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("stepInfrastructureConfigurationDetails")) {
                this.stepInfrastructureConfigurationDetails(
                        model.getStepInfrastructureConfigurationDetails());
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
    public PipelineCustomScriptStepUpdateDetails(
            String stepName,
            String description,
            PipelineStepConfigurationDetails stepConfigurationDetails,
            PipelineInfrastructureConfigurationDetails stepInfrastructureConfigurationDetails) {
        super(stepName, description, stepConfigurationDetails);
        this.stepInfrastructureConfigurationDetails = stepInfrastructureConfigurationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stepInfrastructureConfigurationDetails")
    private final PipelineInfrastructureConfigurationDetails stepInfrastructureConfigurationDetails;

    public PipelineInfrastructureConfigurationDetails getStepInfrastructureConfigurationDetails() {
        return stepInfrastructureConfigurationDetails;
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
        sb.append("PipelineCustomScriptStepUpdateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", stepInfrastructureConfigurationDetails=")
                .append(String.valueOf(this.stepInfrastructureConfigurationDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineCustomScriptStepUpdateDetails)) {
            return false;
        }

        PipelineCustomScriptStepUpdateDetails other = (PipelineCustomScriptStepUpdateDetails) o;
        return java.util.Objects.equals(
                        this.stepInfrastructureConfigurationDetails,
                        other.stepInfrastructureConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.stepInfrastructureConfigurationDetails == null
                                ? 43
                                : this.stepInfrastructureConfigurationDetails.hashCode());
        return result;
    }
}
