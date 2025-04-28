/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The statistics of the statements and findings in the SQL Tuning Advisor summary report. <br>
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
        builder = SqlTuningAdvisorTaskSummaryReportStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SqlTuningAdvisorTaskSummaryReportStatistics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"statementCounts", "findingCounts", "findingBenefits"})
    public SqlTuningAdvisorTaskSummaryReportStatistics(
            SqlTuningAdvisorTaskSummaryReportStatementCounts statementCounts,
            SqlTuningAdvisorTaskSummaryFindingCounts findingCounts,
            SqlTuningAdvisorTaskSummaryFindingBenefits findingBenefits) {
        super();
        this.statementCounts = statementCounts;
        this.findingCounts = findingCounts;
        this.findingBenefits = findingBenefits;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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
            SqlTuningAdvisorTaskSummaryReportStatistics model =
                    new SqlTuningAdvisorTaskSummaryReportStatistics(
                            this.statementCounts, this.findingCounts, this.findingBenefits);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReportStatistics model) {
            if (model.wasPropertyExplicitlySet("statementCounts")) {
                this.statementCounts(model.getStatementCounts());
            }
            if (model.wasPropertyExplicitlySet("findingCounts")) {
                this.findingCounts(model.getFindingCounts());
            }
            if (model.wasPropertyExplicitlySet("findingBenefits")) {
                this.findingBenefits(model.getFindingBenefits());
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

    @com.fasterxml.jackson.annotation.JsonProperty("statementCounts")
    private final SqlTuningAdvisorTaskSummaryReportStatementCounts statementCounts;

    public SqlTuningAdvisorTaskSummaryReportStatementCounts getStatementCounts() {
        return statementCounts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("findingCounts")
    private final SqlTuningAdvisorTaskSummaryFindingCounts findingCounts;

    public SqlTuningAdvisorTaskSummaryFindingCounts getFindingCounts() {
        return findingCounts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("findingBenefits")
    private final SqlTuningAdvisorTaskSummaryFindingBenefits findingBenefits;

    public SqlTuningAdvisorTaskSummaryFindingBenefits getFindingBenefits() {
        return findingBenefits;
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
        sb.append("SqlTuningAdvisorTaskSummaryReportStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("statementCounts=").append(String.valueOf(this.statementCounts));
        sb.append(", findingCounts=").append(String.valueOf(this.findingCounts));
        sb.append(", findingBenefits=").append(String.valueOf(this.findingBenefits));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummaryReportStatistics)) {
            return false;
        }

        SqlTuningAdvisorTaskSummaryReportStatistics other =
                (SqlTuningAdvisorTaskSummaryReportStatistics) o;
        return java.util.Objects.equals(this.statementCounts, other.statementCounts)
                && java.util.Objects.equals(this.findingCounts, other.findingCounts)
                && java.util.Objects.equals(this.findingBenefits, other.findingBenefits)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.statementCounts == null ? 43 : this.statementCounts.hashCode());
        result =
                (result * PRIME)
                        + (this.findingCounts == null ? 43 : this.findingCounts.hashCode());
        result =
                (result * PRIME)
                        + (this.findingBenefits == null ? 43 : this.findingBenefits.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
