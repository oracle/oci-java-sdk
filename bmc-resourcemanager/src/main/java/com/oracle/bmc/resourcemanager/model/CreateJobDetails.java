/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Defines the requirements and properties of a job to create and run against the specified stack.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CreateJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateJobDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "stackId",
        "displayName",
        "operation",
        "jobOperationDetails",
        "applyJobPlanResolution",
        "freeformTags",
        "definedTags"
    })
    public CreateJobDetails(
            String stackId,
            String displayName,
            Job.Operation operation,
            CreateJobOperationDetails jobOperationDetails,
            ApplyJobPlanResolution applyJobPlanResolution,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.stackId = stackId;
        this.displayName = displayName;
        this.operation = operation;
        this.jobOperationDetails = jobOperationDetails;
        this.applyJobPlanResolution = applyJobPlanResolution;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stackId")
        private String stackId;

        public Builder stackId(String stackId) {
            this.stackId = stackId;
            this.__explicitlySet__.add("stackId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Job.Operation operation;

        public Builder operation(Job.Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobOperationDetails")
        private CreateJobOperationDetails jobOperationDetails;

        public Builder jobOperationDetails(CreateJobOperationDetails jobOperationDetails) {
            this.jobOperationDetails = jobOperationDetails;
            this.__explicitlySet__.add("jobOperationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyJobPlanResolution")
        private ApplyJobPlanResolution applyJobPlanResolution;

        public Builder applyJobPlanResolution(ApplyJobPlanResolution applyJobPlanResolution) {
            this.applyJobPlanResolution = applyJobPlanResolution;
            this.__explicitlySet__.add("applyJobPlanResolution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateJobDetails build() {
            CreateJobDetails __instance__ =
                    new CreateJobDetails(
                            stackId,
                            displayName,
                            operation,
                            jobOperationDetails,
                            applyJobPlanResolution,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobDetails o) {
            Builder copiedBuilder =
                    stackId(o.getStackId())
                            .displayName(o.getDisplayName())
                            .operation(o.getOperation())
                            .jobOperationDetails(o.getJobOperationDetails())
                            .applyJobPlanResolution(o.getApplyJobPlanResolution())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the stack that is associated with the current job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stackId")
    private final String stackId;

    public String getStackId() {
        return stackId;
    }

    /**
     * Description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Terraform-specific operation to execute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Job.Operation operation;

    public Job.Operation getOperation() {
        return operation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobOperationDetails")
    private final CreateJobOperationDetails jobOperationDetails;

    public CreateJobOperationDetails getJobOperationDetails() {
        return jobOperationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applyJobPlanResolution")
    private final ApplyJobPlanResolution applyJobPlanResolution;

    public ApplyJobPlanResolution getApplyJobPlanResolution() {
        return applyJobPlanResolution;
    }

    /**
     * Free-form tags associated with this resource. Each tag is a key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateJobDetails(");
        sb.append("stackId=").append(String.valueOf(this.stackId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", jobOperationDetails=").append(String.valueOf(this.jobOperationDetails));
        sb.append(", applyJobPlanResolution=").append(String.valueOf(this.applyJobPlanResolution));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJobDetails)) {
            return false;
        }

        CreateJobDetails other = (CreateJobDetails) o;
        return java.util.Objects.equals(this.stackId, other.stackId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.jobOperationDetails, other.jobOperationDetails)
                && java.util.Objects.equals(
                        this.applyJobPlanResolution, other.applyJobPlanResolution)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stackId == null ? 43 : this.stackId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.operation == null ? 43 : this.operation.hashCode());
        result =
                (result * PRIME)
                        + (this.jobOperationDetails == null
                                ? 43
                                : this.jobOperationDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.applyJobPlanResolution == null
                                ? 43
                                : this.applyJobPlanResolution.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
