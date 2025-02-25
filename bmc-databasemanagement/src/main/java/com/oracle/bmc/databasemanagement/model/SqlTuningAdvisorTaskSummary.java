/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of a SQL Tuning Advisor task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningAdvisorTaskSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlTuningAdvisorTaskId",
        "instanceId",
        "name",
        "description",
        "owner",
        "timeCreated",
        "taskStatus",
        "daysToExpire",
        "timeExecutionStarted",
        "timeExecutionEnded",
        "totalSqlStatements",
        "recommendationCount"
    })
    public SqlTuningAdvisorTaskSummary(
            Long sqlTuningAdvisorTaskId,
            Integer instanceId,
            String name,
            String description,
            String owner,
            java.util.Date timeCreated,
            SqlTuningTaskStatusTypes taskStatus,
            Integer daysToExpire,
            java.util.Date timeExecutionStarted,
            java.util.Date timeExecutionEnded,
            Integer totalSqlStatements,
            Integer recommendationCount) {
        super();
        this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
        this.instanceId = instanceId;
        this.name = name;
        this.description = description;
        this.owner = owner;
        this.timeCreated = timeCreated;
        this.taskStatus = taskStatus;
        this.daysToExpire = daysToExpire;
        this.timeExecutionStarted = timeExecutionStarted;
        this.timeExecutionEnded = timeExecutionEnded;
        this.totalSqlStatements = totalSqlStatements;
        this.recommendationCount = recommendationCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
        private Long sqlTuningAdvisorTaskId;

        /**
         * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param sqlTuningAdvisorTaskId the value to set
         * @return this builder
         **/
        public Builder sqlTuningAdvisorTaskId(Long sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            this.__explicitlySet__.add("sqlTuningAdvisorTaskId");
            return this;
        }
        /**
         * The instance ID of the SQL Tuning Advisor task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private Integer instanceId;

        /**
         * The instance ID of the SQL Tuning Advisor task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param instanceId the value to set
         * @return this builder
         **/
        public Builder instanceId(Integer instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * The name of the SQL Tuning Advisor task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the SQL Tuning Advisor task.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The description of the SQL Tuning Advisor task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the SQL Tuning Advisor task.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The owner of the SQL Tuning Advisor task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * The owner of the SQL Tuning Advisor task.
         * @param owner the value to set
         * @return this builder
         **/
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }
        /**
         * The Creation date of the SQL Tuning Advisor task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The Creation date of the SQL Tuning Advisor task.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The status of the SQL Tuning Advisor task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskStatus")
        private SqlTuningTaskStatusTypes taskStatus;

        /**
         * The status of the SQL Tuning Advisor task.
         * @param taskStatus the value to set
         * @return this builder
         **/
        public Builder taskStatus(SqlTuningTaskStatusTypes taskStatus) {
            this.taskStatus = taskStatus;
            this.__explicitlySet__.add("taskStatus");
            return this;
        }
        /**
         * The number of days left before the task expires. If the value equals -1, then the task has no expiration time (UNLIMITED).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("daysToExpire")
        private Integer daysToExpire;

        /**
         * The number of days left before the task expires. If the value equals -1, then the task has no expiration time (UNLIMITED).
         * @param daysToExpire the value to set
         * @return this builder
         **/
        public Builder daysToExpire(Integer daysToExpire) {
            this.daysToExpire = daysToExpire;
            this.__explicitlySet__.add("daysToExpire");
            return this;
        }
        /**
         * The start time of the task execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExecutionStarted")
        private java.util.Date timeExecutionStarted;

        /**
         * The start time of the task execution.
         * @param timeExecutionStarted the value to set
         * @return this builder
         **/
        public Builder timeExecutionStarted(java.util.Date timeExecutionStarted) {
            this.timeExecutionStarted = timeExecutionStarted;
            this.__explicitlySet__.add("timeExecutionStarted");
            return this;
        }
        /**
         * The end time of the task execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeExecutionEnded")
        private java.util.Date timeExecutionEnded;

        /**
         * The end time of the task execution.
         * @param timeExecutionEnded the value to set
         * @return this builder
         **/
        public Builder timeExecutionEnded(java.util.Date timeExecutionEnded) {
            this.timeExecutionEnded = timeExecutionEnded;
            this.__explicitlySet__.add("timeExecutionEnded");
            return this;
        }
        /**
         * The total number of SQL statements related to the SQL Tuning Advisor task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalSqlStatements")
        private Integer totalSqlStatements;

        /**
         * The total number of SQL statements related to the SQL Tuning Advisor task.
         * @param totalSqlStatements the value to set
         * @return this builder
         **/
        public Builder totalSqlStatements(Integer totalSqlStatements) {
            this.totalSqlStatements = totalSqlStatements;
            this.__explicitlySet__.add("totalSqlStatements");
            return this;
        }
        /**
         * The number of recommendations provided for the SQL Tuning Advisor task.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationCount")
        private Integer recommendationCount;

        /**
         * The number of recommendations provided for the SQL Tuning Advisor task.
         * @param recommendationCount the value to set
         * @return this builder
         **/
        public Builder recommendationCount(Integer recommendationCount) {
            this.recommendationCount = recommendationCount;
            this.__explicitlySet__.add("recommendationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummary build() {
            SqlTuningAdvisorTaskSummary model =
                    new SqlTuningAdvisorTaskSummary(
                            this.sqlTuningAdvisorTaskId,
                            this.instanceId,
                            this.name,
                            this.description,
                            this.owner,
                            this.timeCreated,
                            this.taskStatus,
                            this.daysToExpire,
                            this.timeExecutionStarted,
                            this.timeExecutionEnded,
                            this.totalSqlStatements,
                            this.recommendationCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummary model) {
            if (model.wasPropertyExplicitlySet("sqlTuningAdvisorTaskId")) {
                this.sqlTuningAdvisorTaskId(model.getSqlTuningAdvisorTaskId());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("taskStatus")) {
                this.taskStatus(model.getTaskStatus());
            }
            if (model.wasPropertyExplicitlySet("daysToExpire")) {
                this.daysToExpire(model.getDaysToExpire());
            }
            if (model.wasPropertyExplicitlySet("timeExecutionStarted")) {
                this.timeExecutionStarted(model.getTimeExecutionStarted());
            }
            if (model.wasPropertyExplicitlySet("timeExecutionEnded")) {
                this.timeExecutionEnded(model.getTimeExecutionEnded());
            }
            if (model.wasPropertyExplicitlySet("totalSqlStatements")) {
                this.totalSqlStatements(model.getTotalSqlStatements());
            }
            if (model.wasPropertyExplicitlySet("recommendationCount")) {
                this.recommendationCount(model.getRecommendationCount());
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

    /**
     * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlTuningAdvisorTaskId")
    private final Long sqlTuningAdvisorTaskId;

    /**
     * The unique identifier of the SQL Tuning Advisor task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public Long getSqlTuningAdvisorTaskId() {
        return sqlTuningAdvisorTaskId;
    }

    /**
     * The instance ID of the SQL Tuning Advisor task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final Integer instanceId;

    /**
     * The instance ID of the SQL Tuning Advisor task. This is not the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public Integer getInstanceId() {
        return instanceId;
    }

    /**
     * The name of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the SQL Tuning Advisor task.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The description of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the SQL Tuning Advisor task.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The owner of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * The owner of the SQL Tuning Advisor task.
     * @return the value
     **/
    public String getOwner() {
        return owner;
    }

    /**
     * The Creation date of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The Creation date of the SQL Tuning Advisor task.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The status of the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskStatus")
    private final SqlTuningTaskStatusTypes taskStatus;

    /**
     * The status of the SQL Tuning Advisor task.
     * @return the value
     **/
    public SqlTuningTaskStatusTypes getTaskStatus() {
        return taskStatus;
    }

    /**
     * The number of days left before the task expires. If the value equals -1, then the task has no expiration time (UNLIMITED).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("daysToExpire")
    private final Integer daysToExpire;

    /**
     * The number of days left before the task expires. If the value equals -1, then the task has no expiration time (UNLIMITED).
     * @return the value
     **/
    public Integer getDaysToExpire() {
        return daysToExpire;
    }

    /**
     * The start time of the task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExecutionStarted")
    private final java.util.Date timeExecutionStarted;

    /**
     * The start time of the task execution.
     * @return the value
     **/
    public java.util.Date getTimeExecutionStarted() {
        return timeExecutionStarted;
    }

    /**
     * The end time of the task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeExecutionEnded")
    private final java.util.Date timeExecutionEnded;

    /**
     * The end time of the task execution.
     * @return the value
     **/
    public java.util.Date getTimeExecutionEnded() {
        return timeExecutionEnded;
    }

    /**
     * The total number of SQL statements related to the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSqlStatements")
    private final Integer totalSqlStatements;

    /**
     * The total number of SQL statements related to the SQL Tuning Advisor task.
     * @return the value
     **/
    public Integer getTotalSqlStatements() {
        return totalSqlStatements;
    }

    /**
     * The number of recommendations provided for the SQL Tuning Advisor task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationCount")
    private final Integer recommendationCount;

    /**
     * The number of recommendations provided for the SQL Tuning Advisor task.
     * @return the value
     **/
    public Integer getRecommendationCount() {
        return recommendationCount;
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
        sb.append("SqlTuningAdvisorTaskSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sqlTuningAdvisorTaskId=").append(String.valueOf(this.sqlTuningAdvisorTaskId));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", taskStatus=").append(String.valueOf(this.taskStatus));
        sb.append(", daysToExpire=").append(String.valueOf(this.daysToExpire));
        sb.append(", timeExecutionStarted=").append(String.valueOf(this.timeExecutionStarted));
        sb.append(", timeExecutionEnded=").append(String.valueOf(this.timeExecutionEnded));
        sb.append(", totalSqlStatements=").append(String.valueOf(this.totalSqlStatements));
        sb.append(", recommendationCount=").append(String.valueOf(this.recommendationCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummary)) {
            return false;
        }

        SqlTuningAdvisorTaskSummary other = (SqlTuningAdvisorTaskSummary) o;
        return java.util.Objects.equals(this.sqlTuningAdvisorTaskId, other.sqlTuningAdvisorTaskId)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.taskStatus, other.taskStatus)
                && java.util.Objects.equals(this.daysToExpire, other.daysToExpire)
                && java.util.Objects.equals(this.timeExecutionStarted, other.timeExecutionStarted)
                && java.util.Objects.equals(this.timeExecutionEnded, other.timeExecutionEnded)
                && java.util.Objects.equals(this.totalSqlStatements, other.totalSqlStatements)
                && java.util.Objects.equals(this.recommendationCount, other.recommendationCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlTuningAdvisorTaskId == null
                                ? 43
                                : this.sqlTuningAdvisorTaskId.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.taskStatus == null ? 43 : this.taskStatus.hashCode());
        result = (result * PRIME) + (this.daysToExpire == null ? 43 : this.daysToExpire.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExecutionStarted == null
                                ? 43
                                : this.timeExecutionStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeExecutionEnded == null
                                ? 43
                                : this.timeExecutionEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSqlStatements == null
                                ? 43
                                : this.totalSqlStatements.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationCount == null
                                ? 43
                                : this.recommendationCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
