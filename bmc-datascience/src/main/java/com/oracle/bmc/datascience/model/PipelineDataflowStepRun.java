/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Detail of each Dataflow Step Run.
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
    builder = PipelineDataflowStepRun.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "stepType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PipelineDataflowStepRun extends PipelineStepRun {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dataflow run triggered for this step run.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataflowRunId")
        private String dataflowRunId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dataflow run triggered for this step run.
         * @param dataflowRunId the value to set
         * @return this builder
         **/
        public Builder dataflowRunId(String dataflowRunId) {
            this.dataflowRunId = dataflowRunId;
            this.__explicitlySet__.add("dataflowRunId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineDataflowStepRun build() {
            PipelineDataflowStepRun model =
                    new PipelineDataflowStepRun(
                            this.timeStarted,
                            this.timeFinished,
                            this.stepName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.dataflowRunId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineDataflowStepRun model) {
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("dataflowRunId")) {
                this.dataflowRunId(model.getDataflowRunId());
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
    public PipelineDataflowStepRun(
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            String stepName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String dataflowRunId) {
        super(timeStarted, timeFinished, stepName, lifecycleState, lifecycleDetails);
        this.dataflowRunId = dataflowRunId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dataflow run triggered for this step run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataflowRunId")
    private final String dataflowRunId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dataflow run triggered for this step run.
     * @return the value
     **/
    public String getDataflowRunId() {
        return dataflowRunId;
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
        sb.append("PipelineDataflowStepRun(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataflowRunId=").append(String.valueOf(this.dataflowRunId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineDataflowStepRun)) {
            return false;
        }

        PipelineDataflowStepRun other = (PipelineDataflowStepRun) o;
        return java.util.Objects.equals(this.dataflowRunId, other.dataflowRunId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dataflowRunId == null ? 43 : this.dataflowRunId.hashCode());
        return result;
    }
}
