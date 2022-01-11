/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Request to start a SQL tuning task
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
    builder = StartSqlTuningTaskDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StartSqlTuningTaskDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("totalTimeLimitInMinutes")
        private Integer totalTimeLimitInMinutes;

        public Builder totalTimeLimitInMinutes(Integer totalTimeLimitInMinutes) {
            this.totalTimeLimitInMinutes = totalTimeLimitInMinutes;
            this.__explicitlySet__.add("totalTimeLimitInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Scope scope;

        public Builder scope(Scope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statementTimeLimitInMinutes")
        private Integer statementTimeLimitInMinutes;

        public Builder statementTimeLimitInMinutes(Integer statementTimeLimitInMinutes) {
            this.statementTimeLimitInMinutes = statementTimeLimitInMinutes;
            this.__explicitlySet__.add("statementTimeLimitInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlDetails")
        private java.util.List<SqlTuningTaskSqlDetail> sqlDetails;

        public Builder sqlDetails(java.util.List<SqlTuningTaskSqlDetail> sqlDetails) {
            this.sqlDetails = sqlDetails;
            this.__explicitlySet__.add("sqlDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StartSqlTuningTaskDetails build() {
            StartSqlTuningTaskDetails __instance__ =
                    new StartSqlTuningTaskDetails(
                            taskName,
                            taskDescription,
                            credentialDetails,
                            totalTimeLimitInMinutes,
                            scope,
                            statementTimeLimitInMinutes,
                            sqlDetails,
                            timeStarted,
                            timeEnded);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StartSqlTuningTaskDetails o) {
            Builder copiedBuilder =
                    taskName(o.getTaskName())
                            .taskDescription(o.getTaskDescription())
                            .credentialDetails(o.getCredentialDetails())
                            .totalTimeLimitInMinutes(o.getTotalTimeLimitInMinutes())
                            .scope(o.getScope())
                            .statementTimeLimitInMinutes(o.getStatementTimeLimitInMinutes())
                            .sqlDetails(o.getSqlDetails())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded());

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
     * The description of the SQL tuning task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskDescription")
    String taskDescription;

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    SqlTuningTaskCredentialDetails credentialDetails;

    /**
     * The time limit for running the SQL tuning task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalTimeLimitInMinutes")
    Integer totalTimeLimitInMinutes;
    /**
     * The scope for the SQL tuning task. For LIMITED scope, the SQL profile recommendation
     * is excluded, so the task is faster. For COMPREHENSIVE scope, the SQL profile recommendation
     * is included.
     *
     **/
    public enum Scope {
        Limited("LIMITED"),
        Comprehensive("COMPREHENSIVE"),
        ;

        private final String value;
        private static java.util.Map<String, Scope> map;

        static {
            map = new java.util.HashMap<>();
            for (Scope v : Scope.values()) {
                map.put(v.getValue(), v);
            }
        }

        Scope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Scope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Scope: " + key);
        }
    };
    /**
     * The scope for the SQL tuning task. For LIMITED scope, the SQL profile recommendation
     * is excluded, so the task is faster. For COMPREHENSIVE scope, the SQL profile recommendation
     * is included.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    Scope scope;

    /**
     * The time limit per SQL statement in minutes. This is for task with COMPREHENSIVE scope.
     * Per statement time limit should not be larger than the total time limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statementTimeLimitInMinutes")
    Integer statementTimeLimitInMinutes;

    /**
     * The array of the details of SQL statments on which the tuning is performed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlDetails")
    java.util.List<SqlTuningTaskSqlDetail> sqlDetails;

    /**
     * The start time of the period, in which SQL statements are running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The end time of the period, in which SQL statements are running.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    java.util.Date timeEnded;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
