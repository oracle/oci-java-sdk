/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The type of step where the dataflow application is pre-created by the user. <br>
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
        builder = PipelineDataflowStepUpdateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineDataflowStepUpdateDetails extends PipelineStepUpdateDetails {
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

        public PipelineDataflowStepUpdateDetails build() {
            PipelineDataflowStepUpdateDetails model =
                    new PipelineDataflowStepUpdateDetails(
                            this.stepName,
                            this.description,
                            this.stepConfigurationDetails,
                            this.stepDataflowConfigurationDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineDataflowStepUpdateDetails model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("stepConfigurationDetails")) {
                this.stepConfigurationDetails(model.getStepConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("stepDataflowConfigurationDetails")) {
                this.stepDataflowConfigurationDetails(model.getStepDataflowConfigurationDetails());
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
    public PipelineDataflowStepUpdateDetails(
            String stepName,
            String description,
            PipelineStepConfigurationDetails stepConfigurationDetails,
            PipelineDataflowConfigurationDetails stepDataflowConfigurationDetails) {
        super(stepName, description, stepConfigurationDetails);
        this.stepDataflowConfigurationDetails = stepDataflowConfigurationDetails;
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PipelineDataflowStepUpdateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
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
        if (!(o instanceof PipelineDataflowStepUpdateDetails)) {
            return false;
        }

        PipelineDataflowStepUpdateDetails other = (PipelineDataflowStepUpdateDetails) o;
        return java.util.Objects.equals(
                        this.stepDataflowConfigurationDetails,
                        other.stepDataflowConfigurationDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.stepDataflowConfigurationDetails == null
                                ? 43
                                : this.stepDataflowConfigurationDetails.hashCode());
        return result;
    }
}
