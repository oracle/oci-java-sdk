/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The type of step where the job is pre-created by the user. <br>
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
        builder = PipelineMLJobStepDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "stepType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineMLJobStepDetails extends PipelineStepDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
        private java.util.List<String> dependsOn;

        public Builder dependsOn(java.util.List<String> dependsOn) {
            this.dependsOn = dependsOn;
            this.__explicitlySet__.add("dependsOn");
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * job to be used as a step.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("jobId")
        private String jobId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * job to be used as a step.
         *
         * @param jobId the value to set
         * @return this builder
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            this.__explicitlySet__.add("jobId");
            return this;
        }
        /** Name used when creating the steprun. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepRunName")
        private String stepRunName;

        /**
         * Name used when creating the steprun.
         *
         * @param stepRunName the value to set
         * @return this builder
         */
        public Builder stepRunName(String stepRunName) {
            this.stepRunName = stepRunName;
            this.__explicitlySet__.add("stepRunName");
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

        public PipelineMLJobStepDetails build() {
            PipelineMLJobStepDetails model =
                    new PipelineMLJobStepDetails(
                            this.stepName,
                            this.description,
                            this.dependsOn,
                            this.stepConfigurationDetails,
                            this.jobId,
                            this.stepRunName,
                            this.stepParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineMLJobStepDetails model) {
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("dependsOn")) {
                this.dependsOn(model.getDependsOn());
            }
            if (model.wasPropertyExplicitlySet("stepConfigurationDetails")) {
                this.stepConfigurationDetails(model.getStepConfigurationDetails());
            }
            if (model.wasPropertyExplicitlySet("jobId")) {
                this.jobId(model.getJobId());
            }
            if (model.wasPropertyExplicitlySet("stepRunName")) {
                this.stepRunName(model.getStepRunName());
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
    public PipelineMLJobStepDetails(
            String stepName,
            String description,
            java.util.List<String> dependsOn,
            PipelineStepConfigurationDetails stepConfigurationDetails,
            String jobId,
            String stepRunName,
            PipelineStepParameterDetails stepParameters) {
        super(stepName, description, dependsOn, stepConfigurationDetails);
        this.jobId = jobId;
        this.stepRunName = stepRunName;
        this.stepParameters = stepParameters;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job
     * to be used as a step.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jobId")
    private final String jobId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job
     * to be used as a step.
     *
     * @return the value
     */
    public String getJobId() {
        return jobId;
    }

    /** Name used when creating the steprun. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepRunName")
    private final String stepRunName;

    /**
     * Name used when creating the steprun.
     *
     * @return the value
     */
    public String getStepRunName() {
        return stepRunName;
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
        sb.append("PipelineMLJobStepDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", jobId=").append(String.valueOf(this.jobId));
        sb.append(", stepRunName=").append(String.valueOf(this.stepRunName));
        sb.append(", stepParameters=").append(String.valueOf(this.stepParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineMLJobStepDetails)) {
            return false;
        }

        PipelineMLJobStepDetails other = (PipelineMLJobStepDetails) o;
        return java.util.Objects.equals(this.jobId, other.jobId)
                && java.util.Objects.equals(this.stepRunName, other.stepRunName)
                && java.util.Objects.equals(this.stepParameters, other.stepParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.jobId == null ? 43 : this.jobId.hashCode());
        result = (result * PRIME) + (this.stepRunName == null ? 43 : this.stepRunName.hashCode());
        result =
                (result * PRIME)
                        + (this.stepParameters == null ? 43 : this.stepParameters.hashCode());
        return result;
    }
}
