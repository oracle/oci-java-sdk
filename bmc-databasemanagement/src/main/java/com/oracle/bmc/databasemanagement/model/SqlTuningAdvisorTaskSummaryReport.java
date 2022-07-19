/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The content of the SQL Tuning Advisor summary report.
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
    builder = SqlTuningAdvisorTaskSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningAdvisorTaskSummaryReport {
    @Deprecated
    @java.beans.ConstructorProperties({
        "taskInfo",
        "statistics",
        "objectStatFindings",
        "indexFindings"
    })
    public SqlTuningAdvisorTaskSummaryReport(
            SqlTuningAdvisorTaskSummaryReportTaskInfo taskInfo,
            SqlTuningAdvisorTaskSummaryReportStatistics statistics,
            java.util.List<SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary>
                    objectStatFindings,
            java.util.List<SqlTuningAdvisorTaskSummaryReportIndexFindingSummary> indexFindings) {
        super();
        this.taskInfo = taskInfo;
        this.statistics = statistics;
        this.objectStatFindings = objectStatFindings;
        this.indexFindings = indexFindings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("taskInfo")
        private SqlTuningAdvisorTaskSummaryReportTaskInfo taskInfo;

        public Builder taskInfo(SqlTuningAdvisorTaskSummaryReportTaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            this.__explicitlySet__.add("taskInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private SqlTuningAdvisorTaskSummaryReportStatistics statistics;

        public Builder statistics(SqlTuningAdvisorTaskSummaryReportStatistics statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
            return this;
        }
        /**
         * The list of object findings related to statistics.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatFindings")
        private java.util.List<SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary>
                objectStatFindings;

        /**
         * The list of object findings related to statistics.
         * @param objectStatFindings the value to set
         * @return this builder
         **/
        public Builder objectStatFindings(
                java.util.List<SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary>
                        objectStatFindings) {
            this.objectStatFindings = objectStatFindings;
            this.__explicitlySet__.add("objectStatFindings");
            return this;
        }
        /**
         * The list of object findings related to indexes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("indexFindings")
        private java.util.List<SqlTuningAdvisorTaskSummaryReportIndexFindingSummary> indexFindings;

        /**
         * The list of object findings related to indexes.
         * @param indexFindings the value to set
         * @return this builder
         **/
        public Builder indexFindings(
                java.util.List<SqlTuningAdvisorTaskSummaryReportIndexFindingSummary>
                        indexFindings) {
            this.indexFindings = indexFindings;
            this.__explicitlySet__.add("indexFindings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReport build() {
            SqlTuningAdvisorTaskSummaryReport __instance__ =
                    new SqlTuningAdvisorTaskSummaryReport(
                            taskInfo, statistics, objectStatFindings, indexFindings);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReport o) {
            Builder copiedBuilder =
                    taskInfo(o.getTaskInfo())
                            .statistics(o.getStatistics())
                            .objectStatFindings(o.getObjectStatFindings())
                            .indexFindings(o.getIndexFindings());

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

    @com.fasterxml.jackson.annotation.JsonProperty("taskInfo")
    private final SqlTuningAdvisorTaskSummaryReportTaskInfo taskInfo;

    public SqlTuningAdvisorTaskSummaryReportTaskInfo getTaskInfo() {
        return taskInfo;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    private final SqlTuningAdvisorTaskSummaryReportStatistics statistics;

    public SqlTuningAdvisorTaskSummaryReportStatistics getStatistics() {
        return statistics;
    }

    /**
     * The list of object findings related to statistics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatFindings")
    private final java.util.List<SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary>
            objectStatFindings;

    /**
     * The list of object findings related to statistics.
     * @return the value
     **/
    public java.util.List<SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary>
            getObjectStatFindings() {
        return objectStatFindings;
    }

    /**
     * The list of object findings related to indexes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexFindings")
    private final java.util.List<SqlTuningAdvisorTaskSummaryReportIndexFindingSummary>
            indexFindings;

    /**
     * The list of object findings related to indexes.
     * @return the value
     **/
    public java.util.List<SqlTuningAdvisorTaskSummaryReportIndexFindingSummary> getIndexFindings() {
        return indexFindings;
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
        sb.append("SqlTuningAdvisorTaskSummaryReport(");
        sb.append("taskInfo=").append(String.valueOf(this.taskInfo));
        sb.append(", statistics=").append(String.valueOf(this.statistics));
        sb.append(", objectStatFindings=").append(String.valueOf(this.objectStatFindings));
        sb.append(", indexFindings=").append(String.valueOf(this.indexFindings));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummaryReport)) {
            return false;
        }

        SqlTuningAdvisorTaskSummaryReport other = (SqlTuningAdvisorTaskSummaryReport) o;
        return java.util.Objects.equals(this.taskInfo, other.taskInfo)
                && java.util.Objects.equals(this.statistics, other.statistics)
                && java.util.Objects.equals(this.objectStatFindings, other.objectStatFindings)
                && java.util.Objects.equals(this.indexFindings, other.indexFindings)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taskInfo == null ? 43 : this.taskInfo.hashCode());
        result = (result * PRIME) + (this.statistics == null ? 43 : this.statistics.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStatFindings == null
                                ? 43
                                : this.objectStatFindings.hashCode());
        result =
                (result * PRIME)
                        + (this.indexFindings == null ? 43 : this.indexFindings.hashCode());
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
