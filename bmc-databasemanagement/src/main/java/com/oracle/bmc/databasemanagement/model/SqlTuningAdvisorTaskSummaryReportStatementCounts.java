/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The statement counts data for the SQL Tuning Advisor summary report.
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
    builder = SqlTuningAdvisorTaskSummaryReportStatementCounts.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskSummaryReportStatementCounts {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("distinctSql")
        private Integer distinctSql;

        public Builder distinctSql(Integer distinctSql) {
            this.distinctSql = distinctSql;
            this.__explicitlySet__.add("distinctSql");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSql")
        private Integer totalSql;

        public Builder totalSql(Integer totalSql) {
            this.totalSql = totalSql;
            this.__explicitlySet__.add("totalSql");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("findingCount")
        private Integer findingCount;

        public Builder findingCount(Integer findingCount) {
            this.findingCount = findingCount;
            this.__explicitlySet__.add("findingCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
        private Integer errorCount;

        public Builder errorCount(Integer errorCount) {
            this.errorCount = errorCount;
            this.__explicitlySet__.add("errorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportStatementCounts build() {
            SqlTuningAdvisorTaskSummaryReportStatementCounts __instance__ =
                    new SqlTuningAdvisorTaskSummaryReportStatementCounts(
                            distinctSql, totalSql, findingCount, errorCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportStatementCounts o) {
            Builder copiedBuilder =
                    distinctSql(o.getDistinctSql())
                            .totalSql(o.getTotalSql())
                            .findingCount(o.getFindingCount())
                            .errorCount(o.getErrorCount());

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
     * The count of distinct SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("distinctSql")
    Integer distinctSql;

    /**
     * The total count of SQL statements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSql")
    Integer totalSql;

    /**
     * The count of distinct SQL statements with findings.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("findingCount")
    Integer findingCount;

    /**
     * The count of distinct SQL statements with errors.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
    Integer errorCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
