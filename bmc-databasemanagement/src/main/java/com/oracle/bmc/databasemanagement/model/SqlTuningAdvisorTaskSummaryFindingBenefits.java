/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The benefits of the findings in the SQL Tuning Advisor summary report.
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
    builder = SqlTuningAdvisorTaskSummaryFindingBenefits.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlTuningAdvisorTaskSummaryFindingBenefits {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbTimeBeforeRecommended",
        "dbTimeAfterRecommended",
        "dbTimeAfterImplemented",
        "dbTimeBeforeImplemented"
    })
    public SqlTuningAdvisorTaskSummaryFindingBenefits(
            Integer dbTimeBeforeRecommended,
            Integer dbTimeAfterRecommended,
            Integer dbTimeAfterImplemented,
            Integer dbTimeBeforeImplemented) {
        super();
        this.dbTimeBeforeRecommended = dbTimeBeforeRecommended;
        this.dbTimeAfterRecommended = dbTimeAfterRecommended;
        this.dbTimeAfterImplemented = dbTimeAfterImplemented;
        this.dbTimeBeforeImplemented = dbTimeBeforeImplemented;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dbTimeBeforeRecommended")
        private Integer dbTimeBeforeRecommended;

        public Builder dbTimeBeforeRecommended(Integer dbTimeBeforeRecommended) {
            this.dbTimeBeforeRecommended = dbTimeBeforeRecommended;
            this.__explicitlySet__.add("dbTimeBeforeRecommended");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbTimeAfterRecommended")
        private Integer dbTimeAfterRecommended;

        public Builder dbTimeAfterRecommended(Integer dbTimeAfterRecommended) {
            this.dbTimeAfterRecommended = dbTimeAfterRecommended;
            this.__explicitlySet__.add("dbTimeAfterRecommended");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbTimeAfterImplemented")
        private Integer dbTimeAfterImplemented;

        public Builder dbTimeAfterImplemented(Integer dbTimeAfterImplemented) {
            this.dbTimeAfterImplemented = dbTimeAfterImplemented;
            this.__explicitlySet__.add("dbTimeAfterImplemented");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbTimeBeforeImplemented")
        private Integer dbTimeBeforeImplemented;

        public Builder dbTimeBeforeImplemented(Integer dbTimeBeforeImplemented) {
            this.dbTimeBeforeImplemented = dbTimeBeforeImplemented;
            this.__explicitlySet__.add("dbTimeBeforeImplemented");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryFindingBenefits build() {
            SqlTuningAdvisorTaskSummaryFindingBenefits __instance__ =
                    new SqlTuningAdvisorTaskSummaryFindingBenefits(
                            dbTimeBeforeRecommended,
                            dbTimeAfterRecommended,
                            dbTimeAfterImplemented,
                            dbTimeBeforeImplemented);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryFindingBenefits o) {
            Builder copiedBuilder =
                    dbTimeBeforeRecommended(o.getDbTimeBeforeRecommended())
                            .dbTimeAfterRecommended(o.getDbTimeAfterRecommended())
                            .dbTimeAfterImplemented(o.getDbTimeAfterImplemented())
                            .dbTimeBeforeImplemented(o.getDbTimeBeforeImplemented());

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

    /**
     * The actual database time of the SQL statements for which SQL Tuning Advisor recommendations are not implemented.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeBeforeRecommended")
    private final Integer dbTimeBeforeRecommended;

    public Integer getDbTimeBeforeRecommended() {
        return dbTimeBeforeRecommended;
    }

    /**
     * The estimated database time of the above SQL statements, if SQL Tuning Advisor recommendations are implemented.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeAfterRecommended")
    private final Integer dbTimeAfterRecommended;

    public Integer getDbTimeAfterRecommended() {
        return dbTimeAfterRecommended;
    }

    /**
     * The actual database time of the SQL statements for which SQL Tuning Advisor recommendations are implemented.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeAfterImplemented")
    private final Integer dbTimeAfterImplemented;

    public Integer getDbTimeAfterImplemented() {
        return dbTimeAfterImplemented;
    }

    /**
     * The actual database time of the above SQL statements, before SQL Tuning Advisor recommendations are implemented.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbTimeBeforeImplemented")
    private final Integer dbTimeBeforeImplemented;

    public Integer getDbTimeBeforeImplemented() {
        return dbTimeBeforeImplemented;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlTuningAdvisorTaskSummaryFindingBenefits(");
        sb.append("dbTimeBeforeRecommended=").append(String.valueOf(this.dbTimeBeforeRecommended));
        sb.append(", dbTimeAfterRecommended=").append(String.valueOf(this.dbTimeAfterRecommended));
        sb.append(", dbTimeAfterImplemented=").append(String.valueOf(this.dbTimeAfterImplemented));
        sb.append(", dbTimeBeforeImplemented=")
                .append(String.valueOf(this.dbTimeBeforeImplemented));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlTuningAdvisorTaskSummaryFindingBenefits)) {
            return false;
        }

        SqlTuningAdvisorTaskSummaryFindingBenefits other =
                (SqlTuningAdvisorTaskSummaryFindingBenefits) o;
        return java.util.Objects.equals(this.dbTimeBeforeRecommended, other.dbTimeBeforeRecommended)
                && java.util.Objects.equals(
                        this.dbTimeAfterRecommended, other.dbTimeAfterRecommended)
                && java.util.Objects.equals(
                        this.dbTimeAfterImplemented, other.dbTimeAfterImplemented)
                && java.util.Objects.equals(
                        this.dbTimeBeforeImplemented, other.dbTimeBeforeImplemented)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.dbTimeBeforeRecommended == null
                                ? 43
                                : this.dbTimeBeforeRecommended.hashCode());
        result =
                (result * PRIME)
                        + (this.dbTimeAfterRecommended == null
                                ? 43
                                : this.dbTimeAfterRecommended.hashCode());
        result =
                (result * PRIME)
                        + (this.dbTimeAfterImplemented == null
                                ? 43
                                : this.dbTimeAfterImplemented.hashCode());
        result =
                (result * PRIME)
                        + (this.dbTimeBeforeImplemented == null
                                ? 43
                                : this.dbTimeBeforeImplemented.hashCode());
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
