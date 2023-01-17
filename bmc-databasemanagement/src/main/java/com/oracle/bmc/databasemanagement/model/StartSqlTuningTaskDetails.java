/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The request to start a SQL tuning task. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StartSqlTuningTaskDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class StartSqlTuningTaskDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "taskName",
        "taskDescription",
        "credentialDetails",
        "totalTimeLimitInMinutes",
        "scope",
        "statementTimeLimitInMinutes",
        "sqlTuningSet",
        "sqlDetails",
        "timeStarted",
        "timeEnded"
    })
    public StartSqlTuningTaskDetails(
            String taskName,
            String taskDescription,
            SqlTuningTaskCredentialDetails credentialDetails,
            Integer totalTimeLimitInMinutes,
            Scope scope,
            Integer statementTimeLimitInMinutes,
            SqlTuningSetInput sqlTuningSet,
            java.util.List<SqlTuningTaskSqlDetail> sqlDetails,
            java.util.Date timeStarted,
            java.util.Date timeEnded) {
        super();
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.credentialDetails = credentialDetails;
        this.totalTimeLimitInMinutes = totalTimeLimitInMinutes;
        this.scope = scope;
        this.statementTimeLimitInMinutes = statementTimeLimitInMinutes;
        this.sqlTuningSet = sqlTuningSet;
        this.sqlDetails = sqlDetails;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the SQL tuning task. The name is unique per user in a database, and it is
         * case-sensitive.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("taskName")
        private String taskName;

        /**
         * The name of the SQL tuning task. The name is unique per user in a database, and it is
         * case-sensitive.
         *
         * @param taskName the value to set
         * @return this builder
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            this.__explicitlySet__.add("taskName");
            return this;
        }
        /** The description of the SQL tuning task. */
        @com.fasterxml.jackson.annotation.JsonProperty("taskDescription")
        private String taskDescription;

        /**
         * The description of the SQL tuning task.
         *
         * @param taskDescription the value to set
         * @return this builder
         */
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
        /** The time limit for running the SQL tuning task. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalTimeLimitInMinutes")
        private Integer totalTimeLimitInMinutes;

        /**
         * The time limit for running the SQL tuning task.
         *
         * @param totalTimeLimitInMinutes the value to set
         * @return this builder
         */
        public Builder totalTimeLimitInMinutes(Integer totalTimeLimitInMinutes) {
            this.totalTimeLimitInMinutes = totalTimeLimitInMinutes;
            this.__explicitlySet__.add("totalTimeLimitInMinutes");
            return this;
        }
        /**
         * The scope for the SQL tuning task. For LIMITED scope, the SQL profile recommendation is
         * excluded, so the task is executed faster. For COMPREHENSIVE scope, the SQL profile
         * recommendation is included.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Scope scope;

        /**
         * The scope for the SQL tuning task. For LIMITED scope, the SQL profile recommendation is
         * excluded, so the task is executed faster. For COMPREHENSIVE scope, the SQL profile
         * recommendation is included.
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(Scope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * The time limit per SQL statement (in minutes). This is for a task with the COMPREHENSIVE
         * scope. The time limit per SQL statement should not be more than the total time limit.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("statementTimeLimitInMinutes")
        private Integer statementTimeLimitInMinutes;

        /**
         * The time limit per SQL statement (in minutes). This is for a task with the COMPREHENSIVE
         * scope. The time limit per SQL statement should not be more than the total time limit.
         *
         * @param statementTimeLimitInMinutes the value to set
         * @return this builder
         */
        public Builder statementTimeLimitInMinutes(Integer statementTimeLimitInMinutes) {
            this.statementTimeLimitInMinutes = statementTimeLimitInMinutes;
            this.__explicitlySet__.add("statementTimeLimitInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningSet")
        private SqlTuningSetInput sqlTuningSet;

        public Builder sqlTuningSet(SqlTuningSetInput sqlTuningSet) {
            this.sqlTuningSet = sqlTuningSet;
            this.__explicitlySet__.add("sqlTuningSet");
            return this;
        }
        /**
         * The details of the SQL statement on which tuning is performed. To obtain the details of
         * the SQL statement, you must provide either the sqlTuningSet or the tuple of
         * sqlDetails/timeStarted/timeEnded.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sqlDetails")
        private java.util.List<SqlTuningTaskSqlDetail> sqlDetails;

        /**
         * The details of the SQL statement on which tuning is performed. To obtain the details of
         * the SQL statement, you must provide either the sqlTuningSet or the tuple of
         * sqlDetails/timeStarted/timeEnded.
         *
         * @param sqlDetails the value to set
         * @return this builder
         */
        public Builder sqlDetails(java.util.List<SqlTuningTaskSqlDetail> sqlDetails) {
            this.sqlDetails = sqlDetails;
            this.__explicitlySet__.add("sqlDetails");
            return this;
        }
        /** The start time of the period in which SQL statements are running. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The start time of the period in which SQL statements are running.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The end time of the period in which SQL statements are running. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The end time of the period in which SQL statements are running.
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StartSqlTuningTaskDetails build() {
            StartSqlTuningTaskDetails model =
                    new StartSqlTuningTaskDetails(
                            this.taskName,
                            this.taskDescription,
                            this.credentialDetails,
                            this.totalTimeLimitInMinutes,
                            this.scope,
                            this.statementTimeLimitInMinutes,
                            this.sqlTuningSet,
                            this.sqlDetails,
                            this.timeStarted,
                            this.timeEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StartSqlTuningTaskDetails model) {
            if (model.wasPropertyExplicitlySet("taskName")) {
                this.taskName(model.getTaskName());
            }
            if (model.wasPropertyExplicitlySet("taskDescription")) {
                this.taskDescription(model.getTaskDescription());
            }
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("totalTimeLimitInMinutes")) {
                this.totalTimeLimitInMinutes(model.getTotalTimeLimitInMinutes());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("statementTimeLimitInMinutes")) {
                this.statementTimeLimitInMinutes(model.getStatementTimeLimitInMinutes());
            }
            if (model.wasPropertyExplicitlySet("sqlTuningSet")) {
                this.sqlTuningSet(model.getSqlTuningSet());
            }
            if (model.wasPropertyExplicitlySet("sqlDetails")) {
                this.sqlDetails(model.getSqlDetails());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
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
     * The name of the SQL tuning task. The name is unique per user in a database, and it is
     * case-sensitive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("taskName")
    private final String taskName;

    /**
     * The name of the SQL tuning task. The name is unique per user in a database, and it is
     * case-sensitive.
     *
     * @return the value
     */
    public String getTaskName() {
        return taskName;
    }

    /** The description of the SQL tuning task. */
    @com.fasterxml.jackson.annotation.JsonProperty("taskDescription")
    private final String taskDescription;

    /**
     * The description of the SQL tuning task.
     *
     * @return the value
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final SqlTuningTaskCredentialDetails credentialDetails;

    public SqlTuningTaskCredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /** The time limit for running the SQL tuning task. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTimeLimitInMinutes")
    private final Integer totalTimeLimitInMinutes;

    /**
     * The time limit for running the SQL tuning task.
     *
     * @return the value
     */
    public Integer getTotalTimeLimitInMinutes() {
        return totalTimeLimitInMinutes;
    }

    /**
     * The scope for the SQL tuning task. For LIMITED scope, the SQL profile recommendation is
     * excluded, so the task is executed faster. For COMPREHENSIVE scope, the SQL profile
     * recommendation is included.
     */
    public enum Scope implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The scope for the SQL tuning task. For LIMITED scope, the SQL profile recommendation is
     * excluded, so the task is executed faster. For COMPREHENSIVE scope, the SQL profile
     * recommendation is included.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final Scope scope;

    /**
     * The scope for the SQL tuning task. For LIMITED scope, the SQL profile recommendation is
     * excluded, so the task is executed faster. For COMPREHENSIVE scope, the SQL profile
     * recommendation is included.
     *
     * @return the value
     */
    public Scope getScope() {
        return scope;
    }

    /**
     * The time limit per SQL statement (in minutes). This is for a task with the COMPREHENSIVE
     * scope. The time limit per SQL statement should not be more than the total time limit.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statementTimeLimitInMinutes")
    private final Integer statementTimeLimitInMinutes;

    /**
     * The time limit per SQL statement (in minutes). This is for a task with the COMPREHENSIVE
     * scope. The time limit per SQL statement should not be more than the total time limit.
     *
     * @return the value
     */
    public Integer getStatementTimeLimitInMinutes() {
        return statementTimeLimitInMinutes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningSet")
    private final SqlTuningSetInput sqlTuningSet;

    public SqlTuningSetInput getSqlTuningSet() {
        return sqlTuningSet;
    }

    /**
     * The details of the SQL statement on which tuning is performed. To obtain the details of the
     * SQL statement, you must provide either the sqlTuningSet or the tuple of
     * sqlDetails/timeStarted/timeEnded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sqlDetails")
    private final java.util.List<SqlTuningTaskSqlDetail> sqlDetails;

    /**
     * The details of the SQL statement on which tuning is performed. To obtain the details of the
     * SQL statement, you must provide either the sqlTuningSet or the tuple of
     * sqlDetails/timeStarted/timeEnded.
     *
     * @return the value
     */
    public java.util.List<SqlTuningTaskSqlDetail> getSqlDetails() {
        return sqlDetails;
    }

    /** The start time of the period in which SQL statements are running. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The start time of the period in which SQL statements are running.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The end time of the period in which SQL statements are running. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The end time of the period in which SQL statements are running.
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
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
        sb.append("StartSqlTuningTaskDetails(");
        sb.append("super=").append(super.toString());
        sb.append("taskName=").append(String.valueOf(this.taskName));
        sb.append(", taskDescription=").append(String.valueOf(this.taskDescription));
        sb.append(", credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", totalTimeLimitInMinutes=")
                .append(String.valueOf(this.totalTimeLimitInMinutes));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", statementTimeLimitInMinutes=")
                .append(String.valueOf(this.statementTimeLimitInMinutes));
        sb.append(", sqlTuningSet=").append(String.valueOf(this.sqlTuningSet));
        sb.append(", sqlDetails=").append(String.valueOf(this.sqlDetails));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StartSqlTuningTaskDetails)) {
            return false;
        }

        StartSqlTuningTaskDetails other = (StartSqlTuningTaskDetails) o;
        return java.util.Objects.equals(this.taskName, other.taskName)
                && java.util.Objects.equals(this.taskDescription, other.taskDescription)
                && java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(
                        this.totalTimeLimitInMinutes, other.totalTimeLimitInMinutes)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(
                        this.statementTimeLimitInMinutes, other.statementTimeLimitInMinutes)
                && java.util.Objects.equals(this.sqlTuningSet, other.sqlTuningSet)
                && java.util.Objects.equals(this.sqlDetails, other.sqlDetails)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskName == null ? 43 : this.taskName.hashCode());
        result =
                (result * PRIME)
                        + (this.taskDescription == null ? 43 : this.taskDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.totalTimeLimitInMinutes == null
                                ? 43
                                : this.totalTimeLimitInMinutes.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.statementTimeLimitInMinutes == null
                                ? 43
                                : this.statementTimeLimitInMinutes.hashCode());
        result = (result * PRIME) + (this.sqlTuningSet == null ? 43 : this.sqlTuningSet.hashCode());
        result = (result * PRIME) + (this.sqlDetails == null ? 43 : this.sqlDetails.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
