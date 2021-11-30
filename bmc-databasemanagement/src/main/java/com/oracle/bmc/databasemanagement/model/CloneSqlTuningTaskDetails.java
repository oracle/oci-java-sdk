/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Request to clone and run a SQL tuning task. The new task uses same inputs as the one being cloned.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CloneSqlTuningTaskDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CloneSqlTuningTaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("taskName")
        private String taskName;

        public Builder taskName(String taskName) {
            this.taskName = taskName;
            this.__explicitlySet__.add("taskName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalTaskId")
        private Long originalTaskId;

        public Builder originalTaskId(Long originalTaskId) {
            this.originalTaskId = originalTaskId;
            this.__explicitlySet__.add("originalTaskId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taskDescription")
        private String taskDescription;

        public Builder taskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
            this.__explicitlySet__.add("taskDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private SqlTuningTaskCredentialDetails credentialDetails;

        public Builder credentialDetails(SqlTuningTaskCredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloneSqlTuningTaskDetails build() {
            CloneSqlTuningTaskDetails __instance__ =
                    new CloneSqlTuningTaskDetails(
                            taskName, originalTaskId, taskDescription, credentialDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloneSqlTuningTaskDetails o) {
            Builder copiedBuilder =
                    taskName(o.getTaskName())
                            .originalTaskId(o.getOriginalTaskId())
                            .taskDescription(o.getTaskDescription())
                            .credentialDetails(o.getCredentialDetails());

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
     * The name of the SQL tuning task. The name is unique per user in a database, and it is case sensitive.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskName")
    String taskName;

    /**
     * The identifier of the task being cloned. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     * It can be retrieved from the following endpoint
     * {@link #listSqlTuningAdvisorTasks(ListSqlTuningAdvisorTasksRequest) listSqlTuningAdvisorTasks}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalTaskId")
    Long originalTaskId;

    /**
     * The description of the SQL tuning task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskDescription")
    String taskDescription;

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    SqlTuningTaskCredentialDetails credentialDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
