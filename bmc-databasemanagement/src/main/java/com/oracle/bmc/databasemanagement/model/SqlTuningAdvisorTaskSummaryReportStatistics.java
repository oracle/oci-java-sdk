/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Statistics of statements and findings for the SQL Tuning Advisor summary report.
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
    builder = SqlTuningAdvisorTaskSummaryReportStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskSummaryReportStatistics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("statementCounts")
        private SqlTuningAdvisorTaskSummaryReportStatementCounts statementCounts;

        public Builder statementCounts(
                SqlTuningAdvisorTaskSummaryReportStatementCounts statementCounts) {
            this.statementCounts = statementCounts;
            this.__explicitlySet__.add("statementCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("findingCounts")
        private SqlTuningAdvisorTaskSummaryFindingCounts findingCounts;

        public Builder findingCounts(SqlTuningAdvisorTaskSummaryFindingCounts findingCounts) {
            this.findingCounts = findingCounts;
            this.__explicitlySet__.add("findingCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("findingBenefits")
        private SqlTuningAdvisorTaskSummaryFindingBenefits findingBenefits;

        public Builder findingBenefits(SqlTuningAdvisorTaskSummaryFindingBenefits findingBenefits) {
            this.findingBenefits = findingBenefits;
            this.__explicitlySet__.add("findingBenefits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReportStatistics build() {
            SqlTuningAdvisorTaskSummaryReportStatistics __instance__ =
                    new SqlTuningAdvisorTaskSummaryReportStatistics(
                            statementCounts, findingCounts, findingBenefits);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportStatistics o) {
            Builder copiedBuilder =
                    statementCounts(o.getStatementCounts())
                            .findingCounts(o.getFindingCounts())
                            .findingBenefits(o.getFindingBenefits());

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

    @com.fasterxml.jackson.annotation.JsonProperty("statementCounts")
    SqlTuningAdvisorTaskSummaryReportStatementCounts statementCounts;

    @com.fasterxml.jackson.annotation.JsonProperty("findingCounts")
    SqlTuningAdvisorTaskSummaryFindingCounts findingCounts;

    @com.fasterxml.jackson.annotation.JsonProperty("findingBenefits")
    SqlTuningAdvisorTaskSummaryFindingBenefits findingBenefits;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
