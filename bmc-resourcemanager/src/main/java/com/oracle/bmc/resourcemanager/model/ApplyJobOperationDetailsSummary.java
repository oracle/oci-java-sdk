/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Job details that are specific to apply operations.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplyJobOperationDetailsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "operation"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplyJobOperationDetailsSummary extends JobOperationDetailsSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies the source of the execution plan to apply.
         * Use {@code AUTO_APPROVED} to run the job without an execution plan.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
        private ApplyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

        /**
         * Specifies the source of the execution plan to apply.
         * Use {@code AUTO_APPROVED} to run the job without an execution plan.
         *
         * @param executionPlanStrategy the value to set
         * @return this builder
         **/
        public Builder executionPlanStrategy(
                ApplyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy) {
            this.executionPlanStrategy = executionPlanStrategy;
            this.__explicitlySet__.add("executionPlanStrategy");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the plan job that contains the execution plan used for this job,
         * or {@code null} if no execution plan was used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionPlanJobId")
        private String executionPlanJobId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the plan job that contains the execution plan used for this job,
         * or {@code null} if no execution plan was used.
         *
         * @param executionPlanJobId the value to set
         * @return this builder
         **/
        public Builder executionPlanJobId(String executionPlanJobId) {
            this.executionPlanJobId = executionPlanJobId;
            this.__explicitlySet__.add("executionPlanJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplyJobOperationDetailsSummary build() {
            ApplyJobOperationDetailsSummary model =
                    new ApplyJobOperationDetailsSummary(
                            this.executionPlanStrategy, this.executionPlanJobId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplyJobOperationDetailsSummary model) {
            if (model.wasPropertyExplicitlySet("executionPlanStrategy")) {
                this.executionPlanStrategy(model.getExecutionPlanStrategy());
            }
            if (model.wasPropertyExplicitlySet("executionPlanJobId")) {
                this.executionPlanJobId(model.getExecutionPlanJobId());
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
    public ApplyJobOperationDetailsSummary(
            ApplyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy,
            String executionPlanJobId) {
        super();
        this.executionPlanStrategy = executionPlanStrategy;
        this.executionPlanJobId = executionPlanJobId;
    }

    /**
     * Specifies the source of the execution plan to apply.
     * Use {@code AUTO_APPROVED} to run the job without an execution plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanStrategy")
    private final ApplyJobOperationDetails.ExecutionPlanStrategy executionPlanStrategy;

    /**
     * Specifies the source of the execution plan to apply.
     * Use {@code AUTO_APPROVED} to run the job without an execution plan.
     *
     * @return the value
     **/
    public ApplyJobOperationDetails.ExecutionPlanStrategy getExecutionPlanStrategy() {
        return executionPlanStrategy;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the plan job that contains the execution plan used for this job,
     * or {@code null} if no execution plan was used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionPlanJobId")
    private final String executionPlanJobId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the plan job that contains the execution plan used for this job,
     * or {@code null} if no execution plan was used.
     *
     * @return the value
     **/
    public String getExecutionPlanJobId() {
        return executionPlanJobId;
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
        sb.append("ApplyJobOperationDetailsSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", executionPlanStrategy=").append(String.valueOf(this.executionPlanStrategy));
        sb.append(", executionPlanJobId=").append(String.valueOf(this.executionPlanJobId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplyJobOperationDetailsSummary)) {
            return false;
        }

        ApplyJobOperationDetailsSummary other = (ApplyJobOperationDetailsSummary) o;
        return java.util.Objects.equals(this.executionPlanStrategy, other.executionPlanStrategy)
                && java.util.Objects.equals(this.executionPlanJobId, other.executionPlanJobId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.executionPlanStrategy == null
                                ? 43
                                : this.executionPlanStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.executionPlanJobId == null
                                ? 43
                                : this.executionPlanJobId.hashCode());
        return result;
    }
}
