/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the job.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
        private String managedDatabaseGroupId;

        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            this.__explicitlySet__.add("managedDatabaseGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
        private String managedDatabaseId;

        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            this.__explicitlySet__.add("managedDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
        private DatabaseSubType databaseSubType;

        public Builder databaseSubType(DatabaseSubType databaseSubType) {
            this.databaseSubType = databaseSubType;
            this.__explicitlySet__.add("databaseSubType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private Job.ScheduleType scheduleType;

        public Builder scheduleType(Job.ScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
        private JobScheduleDetails scheduleDetails;

        public Builder scheduleDetails(JobScheduleDetails scheduleDetails) {
            this.scheduleDetails = scheduleDetails;
            this.__explicitlySet__.add("scheduleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobTypes jobType;

        public Builder jobType(JobTypes jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Job.LifecycleState lifecycleState;

        public Builder lifecycleState(Job.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeout")
        private String timeout;

        public Builder timeout(String timeout) {
            this.timeout = timeout;
            this.__explicitlySet__.add("timeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("submissionErrorMessage")
        private String submissionErrorMessage;

        public Builder submissionErrorMessage(String submissionErrorMessage) {
            this.submissionErrorMessage = submissionErrorMessage;
            this.__explicitlySet__.add("submissionErrorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobSummary build() {
            JobSummary __instance__ =
                    new JobSummary(
                            id,
                            compartmentId,
                            name,
                            description,
                            managedDatabaseGroupId,
                            managedDatabaseId,
                            databaseSubType,
                            scheduleType,
                            scheduleDetails,
                            jobType,
                            lifecycleState,
                            timeout,
                            submissionErrorMessage,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .managedDatabaseGroupId(o.getManagedDatabaseGroupId())
                            .managedDatabaseId(o.getManagedDatabaseId())
                            .databaseSubType(o.getDatabaseSubType())
                            .scheduleType(o.getScheduleType())
                            .scheduleDetails(o.getScheduleDetails())
                            .jobType(o.getJobType())
                            .lifecycleState(o.getLifecycleState())
                            .timeout(o.getTimeout())
                            .submissionErrorMessage(o.getSubmissionErrorMessage())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which the job resides.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The display name of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The description of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database Group where the job has to be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseGroupId")
    String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database where the job has to be executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedDatabaseId")
    String managedDatabaseId;

    /**
     * The subtype of the Oracle Database where the job has to be executed. Only applicable when managedDatabaseGroupId is provided.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSubType")
    DatabaseSubType databaseSubType;

    /**
     * The schedule type of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    Job.ScheduleType scheduleType;

    @com.fasterxml.jackson.annotation.JsonProperty("scheduleDetails")
    JobScheduleDetails scheduleDetails;

    /**
     * The type of job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    JobTypes jobType;

    /**
     * The lifecycle state of the job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    Job.LifecycleState lifecycleState;

    /**
     * The job timeout duration, which is expressed like "1h 10m 15s".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    String timeout;

    /**
     * The error message that is returned if the job submission fails. Null is returned in all other scenarios.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("submissionErrorMessage")
    String submissionErrorMessage;

    /**
     * The date and time when the job was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time when the job was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
