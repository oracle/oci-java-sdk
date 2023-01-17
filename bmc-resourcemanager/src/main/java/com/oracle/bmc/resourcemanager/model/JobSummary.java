/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Summary information for a job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JobSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "stackId",
        "compartmentId",
        "displayName",
        "operation",
        "jobOperationDetails",
        "applyJobPlanResolution",
        "resolvedPlanJobId",
        "timeCreated",
        "timeFinished",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    public JobSummary(
            String id,
            String stackId,
            String compartmentId,
            String displayName,
            Job.Operation operation,
            JobOperationDetailsSummary jobOperationDetails,
            ApplyJobPlanResolution applyJobPlanResolution,
            String resolvedPlanJobId,
            java.util.Date timeCreated,
            java.util.Date timeFinished,
            Job.LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.stackId = stackId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.operation = operation;
        this.jobOperationDetails = jobOperationDetails;
        this.applyJobPlanResolution = applyJobPlanResolution;
        this.resolvedPlanJobId = resolvedPlanJobId;
        this.timeCreated = timeCreated;
        this.timeFinished = timeFinished;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the job.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the stack that is associated with the specified job.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stackId")
        private String stackId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the stack that is associated with the specified job.
         *
         * @param stackId the value to set
         * @return this builder
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            this.__explicitlySet__.add("stackId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment where the stack of the associated job resides.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment where the stack of the associated job resides.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The job's display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The job's display name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The type of job executing */
        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Job.Operation operation;

        /**
         * The type of job executing
         *
         * @param operation the value to set
         * @return this builder
         */
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
        /**
         * Deprecated. Use the property {@code executionPlanJobId} in {@code jobOperationDetails}
         * instead. The plan job
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * was used (if this was an apply job and was not auto-approved).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resolvedPlanJobId")
        private String resolvedPlanJobId;

        /**
         * Deprecated. Use the property {@code executionPlanJobId} in {@code jobOperationDetails}
         * instead. The plan job
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * was used (if this was an apply job and was not auto-approved).
         *
         * @param resolvedPlanJobId the value to set
         * @return this builder
         */
        public Builder resolvedPlanJobId(String resolvedPlanJobId) {
            this.resolvedPlanJobId = resolvedPlanJobId;
            this.__explicitlySet__.add("resolvedPlanJobId");
            return this;
        }
        /**
         * The date and time the job was created. Format is defined by RFC3339. Example: {@code
         * 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the job was created. Format is defined by RFC3339. Example: {@code
         * 2020-01-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the job succeeded or failed. Format is defined by RFC3339. Example:
         * {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the job succeeded or failed. Format is defined by RFC3339. Example:
         * {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /**
         * Current state of the specified job. For more information about job lifecycle states in
         * Resource Manager, see [Key
         * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__JobStates).
         *
         * <p>Allowable values: - ACCEPTED - IN_PROGRESS - FAILED - SUCCEEDED - CANCELING - CANCELED
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Job.LifecycleState lifecycleState;

        /**
         * Current state of the specified job. For more information about job lifecycle states in
         * Resource Manager, see [Key
         * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__JobStates).
         *
         * <p>Allowable values: - ACCEPTED - IN_PROGRESS - FAILED - SUCCEEDED - CANCELING - CANCELED
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Job.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Free-form tags associated with this resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags associated with this resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobSummary build() {
            JobSummary model =
                    new JobSummary(
                            this.id,
                            this.stackId,
                            this.compartmentId,
                            this.displayName,
                            this.operation,
                            this.jobOperationDetails,
                            this.applyJobPlanResolution,
                            this.resolvedPlanJobId,
                            this.timeCreated,
                            this.timeFinished,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("stackId")) {
                this.stackId(model.getStackId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("operation")) {
                this.operation(model.getOperation());
            }
            if (model.wasPropertyExplicitlySet("jobOperationDetails")) {
                this.jobOperationDetails(model.getJobOperationDetails());
            }
            if (model.wasPropertyExplicitlySet("applyJobPlanResolution")) {
                this.applyJobPlanResolution(model.getApplyJobPlanResolution());
            }
            if (model.wasPropertyExplicitlySet("resolvedPlanJobId")) {
                this.resolvedPlanJobId(model.getResolvedPlanJobId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the job.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the stack that is associated with the specified job.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stackId")
    private final String stackId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the stack that is associated with the specified job.
     *
     * @return the value
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment where the stack of the associated job resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment where the stack of the associated job resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The job's display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The job's display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The type of job executing */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    private final Job.Operation operation;

    /**
     * The type of job executing
     *
     * @return the value
     */
    public Job.Operation getOperation() {
        return operation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("jobOperationDetails")
    private final JobOperationDetailsSummary jobOperationDetails;

    public JobOperationDetailsSummary getJobOperationDetails() {
        return jobOperationDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applyJobPlanResolution")
    private final ApplyJobPlanResolution applyJobPlanResolution;

    public ApplyJobPlanResolution getApplyJobPlanResolution() {
        return applyJobPlanResolution;
    }

    /**
     * Deprecated. Use the property {@code executionPlanJobId} in {@code jobOperationDetails}
     * instead. The plan job
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that was
     * used (if this was an apply job and was not auto-approved).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedPlanJobId")
    private final String resolvedPlanJobId;

    /**
     * Deprecated. Use the property {@code executionPlanJobId} in {@code jobOperationDetails}
     * instead. The plan job
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that was
     * used (if this was an apply job and was not auto-approved).
     *
     * @return the value
     */
    public String getResolvedPlanJobId() {
        return resolvedPlanJobId;
    }

    /**
     * The date and time the job was created. Format is defined by RFC3339. Example: {@code
     * 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the job was created. Format is defined by RFC3339. Example: {@code
     * 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the job succeeded or failed. Format is defined by RFC3339. Example: {@code
     * 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the job succeeded or failed. Format is defined by RFC3339. Example: {@code
     * 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /**
     * Current state of the specified job. For more information about job lifecycle states in
     * Resource Manager, see [Key
     * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__JobStates).
     *
     * <p>Allowable values: - ACCEPTED - IN_PROGRESS - FAILED - SUCCEEDED - CANCELING - CANCELED
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Job.LifecycleState lifecycleState;

    /**
     * Current state of the specified job. For more information about job lifecycle states in
     * Resource Manager, see [Key
     * Concepts](https://docs.cloud.oracle.com/iaas/Content/ResourceManager/Concepts/resourcemanager.htm#concepts__JobStates).
     *
     * <p>Allowable values: - ACCEPTED - IN_PROGRESS - FAILED - SUCCEEDED - CANCELING - CANCELED
     *
     * @return the value
     */
    public Job.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags associated with this resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags associated with this resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("JobSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", stackId=").append(String.valueOf(this.stackId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", operation=").append(String.valueOf(this.operation));
        sb.append(", jobOperationDetails=").append(String.valueOf(this.jobOperationDetails));
        sb.append(", applyJobPlanResolution=").append(String.valueOf(this.applyJobPlanResolution));
        sb.append(", resolvedPlanJobId=").append(String.valueOf(this.resolvedPlanJobId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobSummary)) {
            return false;
        }

        JobSummary other = (JobSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.stackId, other.stackId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.operation, other.operation)
                && java.util.Objects.equals(this.jobOperationDetails, other.jobOperationDetails)
                && java.util.Objects.equals(
                        this.applyJobPlanResolution, other.applyJobPlanResolution)
                && java.util.Objects.equals(this.resolvedPlanJobId, other.resolvedPlanJobId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.stackId == null ? 43 : this.stackId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.resolvedPlanJobId == null ? 43 : this.resolvedPlanJobId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
