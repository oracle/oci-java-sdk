/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The type of step where user provides the step artifact to be executed on an execution engine
 * managed by the pipelines service. <br>
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
        builder = PipelineCustomScriptStepUpdateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
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
        /** The storage mount details to mount to the instance running the pipeline step. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepStorageMountConfigurationDetailsList")
        private java.util.List<StorageMountConfigurationDetails>
                stepStorageMountConfigurationDetailsList;

        /**
         * The storage mount details to mount to the instance running the pipeline step.
         *
         * @param stepStorageMountConfigurationDetailsList the value to set
         * @return this builder
         */
        public Builder stepStorageMountConfigurationDetailsList(
                java.util.List<StorageMountConfigurationDetails>
                        stepStorageMountConfigurationDetailsList) {
            this.stepStorageMountConfigurationDetailsList =
                    stepStorageMountConfigurationDetailsList;
            this.__explicitlySet__.add("stepStorageMountConfigurationDetailsList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepParameters")
        private PipelineStepParameterDetails stepParameters;

        public Builder stepParameters(PipelineStepParameterDetails stepParameters) {
            this.stepParameters = stepParameters;
            this.__explicitlySet__.add("stepParameters");
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
                            this.stepInfrastructureConfigurationDetails,
                            this.stepStorageMountConfigurationDetailsList,
                            this.stepParameters);
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
            if (model.wasPropertyExplicitlySet("stepStorageMountConfigurationDetailsList")) {
                this.stepStorageMountConfigurationDetailsList(
                        model.getStepStorageMountConfigurationDetailsList());
            }
            if (model.wasPropertyExplicitlySet("stepParameters")) {
                this.stepParameters(model.getStepParameters());
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
    public PipelineCustomScriptStepUpdateDetails(
            String stepName,
            String description,
            PipelineStepConfigurationDetails stepConfigurationDetails,
            PipelineInfrastructureConfigurationDetails stepInfrastructureConfigurationDetails,
            java.util.List<StorageMountConfigurationDetails>
                    stepStorageMountConfigurationDetailsList,
            PipelineStepParameterDetails stepParameters) {
        super(stepName, description, stepConfigurationDetails);
        this.stepInfrastructureConfigurationDetails = stepInfrastructureConfigurationDetails;
        this.stepStorageMountConfigurationDetailsList = stepStorageMountConfigurationDetailsList;
        this.stepParameters = stepParameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stepInfrastructureConfigurationDetails")
    private final PipelineInfrastructureConfigurationDetails stepInfrastructureConfigurationDetails;

    public PipelineInfrastructureConfigurationDetails getStepInfrastructureConfigurationDetails() {
        return stepInfrastructureConfigurationDetails;
    }

    /** The storage mount details to mount to the instance running the pipeline step. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepStorageMountConfigurationDetailsList")
    private final java.util.List<StorageMountConfigurationDetails>
            stepStorageMountConfigurationDetailsList;

    /**
     * The storage mount details to mount to the instance running the pipeline step.
     *
     * @return the value
     */
    public java.util.List<StorageMountConfigurationDetails>
            getStepStorageMountConfigurationDetailsList() {
        return stepStorageMountConfigurationDetailsList;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stepParameters")
    private final PipelineStepParameterDetails stepParameters;

    public PipelineStepParameterDetails getStepParameters() {
        return stepParameters;
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
        sb.append("PipelineCustomScriptStepUpdateDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", stepInfrastructureConfigurationDetails=")
                .append(String.valueOf(this.stepInfrastructureConfigurationDetails));
        sb.append(", stepStorageMountConfigurationDetailsList=")
                .append(String.valueOf(this.stepStorageMountConfigurationDetailsList));
        sb.append(", stepParameters=").append(String.valueOf(this.stepParameters));
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
                && java.util.Objects.equals(
                        this.stepStorageMountConfigurationDetailsList,
                        other.stepStorageMountConfigurationDetailsList)
                && java.util.Objects.equals(this.stepParameters, other.stepParameters)
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
        result =
                (result * PRIME)
                        + (this.stepStorageMountConfigurationDetailsList == null
                                ? 43
                                : this.stepStorageMountConfigurationDetailsList.hashCode());
        result =
                (result * PRIME)
                        + (this.stepParameters == null ? 43 : this.stepParameters.hashCode());
        return result;
    }
}
