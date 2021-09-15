/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * A job run.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobRun.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class JobRun {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobId")
        private String jobId;

        public Builder jobId(String jobId) {
            this.jobId = jobId;
            this.__explicitlySet__.add("jobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationOverrideDetails")
        private JobConfigurationDetails jobConfigurationOverrideDetails;

        public Builder jobConfigurationOverrideDetails(
                JobConfigurationDetails jobConfigurationOverrideDetails) {
            this.jobConfigurationOverrideDetails = jobConfigurationOverrideDetails;
            this.__explicitlySet__.add("jobConfigurationOverrideDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobInfrastructureConfigurationDetails")
        private JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails;

        public Builder jobInfrastructureConfigurationDetails(
                JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails) {
            this.jobInfrastructureConfigurationDetails = jobInfrastructureConfigurationDetails;
            this.__explicitlySet__.add("jobInfrastructureConfigurationDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobLogConfigurationOverrideDetails")
        private JobLogConfigurationDetails jobLogConfigurationOverrideDetails;

        public Builder jobLogConfigurationOverrideDetails(
                JobLogConfigurationDetails jobLogConfigurationOverrideDetails) {
            this.jobLogConfigurationOverrideDetails = jobLogConfigurationOverrideDetails;
            this.__explicitlySet__.add("jobLogConfigurationOverrideDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logDetails")
        private JobRunLogDetails logDetails;

        public Builder logDetails(JobRunLogDetails logDetails) {
            this.logDetails = logDetails;
            this.__explicitlySet__.add("logDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private JobRunLifecycleState lifecycleState;

        public Builder lifecycleState(JobRunLifecycleState lifecycleState) {
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

        public JobRun build() {
            JobRun __instance__ =
                    new JobRun(
                            id,
                            timeAccepted,
                            timeStarted,
                            timeFinished,
                            createdBy,
                            projectId,
                            compartmentId,
                            jobId,
                            displayName,
                            jobConfigurationOverrideDetails,
                            jobInfrastructureConfigurationDetails,
                            jobLogConfigurationOverrideDetails,
                            logDetails,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobRun o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .timeAccepted(o.getTimeAccepted())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .createdBy(o.getCreatedBy())
                            .projectId(o.getProjectId())
                            .compartmentId(o.getCompartmentId())
                            .jobId(o.getJobId())
                            .displayName(o.getDisplayName())
                            .jobConfigurationOverrideDetails(o.getJobConfigurationOverrideDetails())
                            .jobInfrastructureConfigurationDetails(
                                    o.getJobInfrastructureConfigurationDetails())
                            .jobLogConfigurationOverrideDetails(
                                    o.getJobLogConfigurationOverrideDetails())
                            .logDetails(o.getLogDetails())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The date and time the job run was accepted in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    java.util.Date timeAccepted;

    /**
     * The date and time the job run request was started in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The date and time the job run request was finished in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the user who created the job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    String createdBy;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate the job with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    String projectId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment where you want to create the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobId")
    String jobId;

    /**
     * A user-friendly display name for the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    @com.fasterxml.jackson.annotation.JsonProperty("jobConfigurationOverrideDetails")
    JobConfigurationDetails jobConfigurationOverrideDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("jobInfrastructureConfigurationDetails")
    JobInfrastructureConfigurationDetails jobInfrastructureConfigurationDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("jobLogConfigurationOverrideDetails")
    JobLogConfigurationDetails jobLogConfigurationOverrideDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("logDetails")
    JobRunLogDetails logDetails;

    /**
     * The state of the job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    JobRunLifecycleState lifecycleState;

    /**
     * Details of the state of the job run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. See [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
