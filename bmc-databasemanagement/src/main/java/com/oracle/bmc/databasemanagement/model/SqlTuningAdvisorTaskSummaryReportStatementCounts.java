/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The number of statements in the SQL Tuning Advisor summary report. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlTuningAdvisorTaskSummaryReportStatementCounts.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTuningAdvisorTaskSummaryReportStatementCounts
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"distinctSql", "totalSql", "findingCount", "errorCount"})
    public SqlTuningAdvisorTaskSummaryReportStatementCounts(
            Integer distinctSql, Integer totalSql, Integer findingCount, Integer errorCount) {
        super();
        this.distinctSql = distinctSql;
        this.totalSql = totalSql;
        this.findingCount = findingCount;
        this.errorCount = errorCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of distinct SQL statements. */
        @com.fasterxml.jackson.annotation.JsonProperty("distinctSql")
        private Integer distinctSql;

        /**
         * The number of distinct SQL statements.
         *
         * @param distinctSql the value to set
         * @return this builder
         */
        public Builder distinctSql(Integer distinctSql) {
            this.distinctSql = distinctSql;
            this.__explicitlySet__.add("distinctSql");
            return this;
        }
        /** The total number of SQL statements. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSql")
        private Integer totalSql;

        /**
         * The total number of SQL statements.
         *
         * @param totalSql the value to set
         * @return this builder
         */
        public Builder totalSql(Integer totalSql) {
            this.totalSql = totalSql;
            this.__explicitlySet__.add("totalSql");
            return this;
        }
        /** The number of distinct SQL statements with findings. */
        @com.fasterxml.jackson.annotation.JsonProperty("findingCount")
        private Integer findingCount;

        /**
         * The number of distinct SQL statements with findings.
         *
         * @param findingCount the value to set
         * @return this builder
         */
        public Builder findingCount(Integer findingCount) {
            this.findingCount = findingCount;
            this.__explicitlySet__.add("findingCount");
            return this;
        }
        /** The number of distinct SQL statements with errors. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
        private Integer errorCount;

        /**
         * The number of distinct SQL statements with errors.
         *
         * @param errorCount the value to set
         * @return this builder
         */
        public Builder errorCount(Integer errorCount) {
            this.errorCount = errorCount;
            this.__explicitlySet__.add("errorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportStatementCounts build() {
            SqlTuningAdvisorTaskSummaryReportStatementCounts model =
                    new SqlTuningAdvisorTaskSummaryReportStatementCounts(
                            this.distinctSql, this.totalSql, this.findingCount, this.errorCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportStatementCounts model) {
            if (model.wasPropertyExplicitlySet("distinctSql")) {
                this.distinctSql(model.getDistinctSql());
            }
            if (model.wasPropertyExplicitlySet("totalSql")) {
                this.totalSql(model.getTotalSql());
            }
            if (model.wasPropertyExplicitlySet("findingCount")) {
                this.findingCount(model.getFindingCount());
            }
            if (model.wasPropertyExplicitlySet("errorCount")) {
                this.errorCount(model.getErrorCount());
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

    /** The number of distinct SQL statements. */
    @com.fasterxml.jackson.annotation.JsonProperty("distinctSql")
    private final Integer distinctSql;

    /**
     * The number of distinct SQL statements.
     *
     * @return the value
     */
    public Integer getDistinctSql() {
        return distinctSql;
    }

    /** The total number of SQL statements. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSql")
    private final Integer totalSql;

    /**
     * The total number of SQL statements.
     *
     * @return the value
     */
    public Integer getTotalSql() {
        return totalSql;
    }

    /** The number of distinct SQL statements with findings. */
    @com.fasterxml.jackson.annotation.JsonProperty("findingCount")
    private final Integer findingCount;

    /**
     * The number of distinct SQL statements with findings.
     *
     * @return the value
     */
    public Integer getFindingCount() {
        return findingCount;
    }

    /** The number of distinct SQL statements with errors. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
    private final Integer errorCount;

    /**
     * The number of distinct SQL statements with errors.
     *
     * @return the value
     */
    public Integer getErrorCount() {
        return errorCount;
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
        sb.append("SqlTuningAdvisorTaskSummaryReportStatementCounts(");
        sb.append("super=").append(super.toString());
        sb.append("distinctSql=").append(String.valueOf(this.distinctSql));
        sb.append(", totalSql=").append(String.valueOf(this.totalSql));
        sb.append(", findingCount=").append(String.valueOf(this.findingCount));
        sb.append(", errorCount=").append(String.valueOf(this.errorCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummaryReportStatementCounts)) {
            return false;
        }

        SqlTuningAdvisorTaskSummaryReportStatementCounts other =
                (SqlTuningAdvisorTaskSummaryReportStatementCounts) o;
        return java.util.Objects.equals(this.distinctSql, other.distinctSql)
                && java.util.Objects.equals(this.totalSql, other.totalSql)
                && java.util.Objects.equals(this.findingCount, other.findingCount)
                && java.util.Objects.equals(this.errorCount, other.errorCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.distinctSql == null ? 43 : this.distinctSql.hashCode());
        result = (result * PRIME) + (this.totalSql == null ? 43 : this.totalSql.hashCode());
        result = (result * PRIME) + (this.findingCount == null ? 43 : this.findingCount.hashCode());
        result = (result * PRIME) + (this.errorCount == null ? 43 : this.errorCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
