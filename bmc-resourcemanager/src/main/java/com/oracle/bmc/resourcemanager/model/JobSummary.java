/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Returns a listing of all of the specified job's properties and their values.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JobSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stackId")
        private String stackId;

        public Builder stackId(String stackId) {
            this.stackId = stackId;
            this.__explicitlySet__.add("stackId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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
        private JobOperationDetailsSummary jobOperationDetails;

        public Builder jobOperationDetails(JobOperationDetailsSummary jobOperationDetails) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("resolvedPlanJobId")
        private String resolvedPlanJobId;

        public Builder resolvedPlanJobId(String resolvedPlanJobId) {
            this.resolvedPlanJobId = resolvedPlanJobId;
            this.__explicitlySet__.add("resolvedPlanJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Job.LifecycleState lifecycleState;

        public Builder lifecycleState(Job.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public JobSummary build() {
            JobSummary __instance__ =
                    new JobSummary(
                            id,
                            stackId,
                            compartmentId,
                            displayName,
                            operation,
                            jobOperationDetails,
                            applyJobPlanResolution,
                            resolvedPlanJobId,
                            timeCreated,
                            timeFinished,
                            lifecycleState,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .stackId(o.getStackId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .operation(o.getOperation())
                            .jobOperationDetails(o.getJobOperationDetails())
                            .applyJobPlanResolution(o.getApplyJobPlanResolution())
                            .resolvedPlanJobId(o.getResolvedPlanJobId())
                            .timeCreated(o.getTimeCreated())
                            .timeFinished(o.getTimeFinished())
                            .lifecycleState(o.getLifecycleState())
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the stack that is associated with the specified job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stackId")
    String stackId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where the stack of the associated job resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The job's display name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The type of job executing
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    Job.Operation operation;

    @com.fasterxml.jackson.annotation.JsonProperty("jobOperationDetails")
    JobOperationDetailsSummary jobOperationDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("applyJobPlanResolution")
    ApplyJobPlanResolution applyJobPlanResolution;

    /**
     * Deprecated. Use the property {@code executionPlanJobId} in {@code jobOperationDetails} instead.
     * The plan job [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that was used (if this was an apply job and was not auto-approved).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedPlanJobId")
    String resolvedPlanJobId;

    /**
     * The date and time the job was created.
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the job succeeded or failed.
     * Format is defined by RFC3339.
     * Example: {@code 2020-01-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    /**
     * Current state of the specified job.
     * For more information about job lifecycle states in Resource Manager, see
     * [Key Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#JobStates).
     * <p>
     * Allowable values:
     * - ACCEPTED
     * - IN_PROGRESS
     * - FAILED
     * - SUCCEEDED
     * - CANCELING
     * - CANCELED
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    Job.LifecycleState lifecycleState;

    /**
     * Free-form tags associated with this resource. Each tag is a key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
