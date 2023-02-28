/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL performance statistics for a given plan <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SqlStatisticsTimeSeriesByPlanAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SqlStatisticsTimeSeriesByPlanAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"planHash", "statistics"})
    public SqlStatisticsTimeSeriesByPlanAggregation(
            Long planHash, java.util.List<SqlStatisticsTimeSeries> statistics) {
        super();
        this.planHash = planHash;
        this.statistics = statistics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Plan hash value for the SQL Execution Plan */
        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private Long planHash;

        /**
         * Plan hash value for the SQL Execution Plan
         *
         * @param planHash the value to set
         * @return this builder
         */
        public Builder planHash(Long planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }
        /** SQL performance statistics for a given plan */
        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private java.util.List<SqlStatisticsTimeSeries> statistics;

        /**
         * SQL performance statistics for a given plan
         *
         * @param statistics the value to set
         * @return this builder
         */
        public Builder statistics(java.util.List<SqlStatisticsTimeSeries> statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStatisticsTimeSeriesByPlanAggregation build() {
            SqlStatisticsTimeSeriesByPlanAggregation model =
                    new SqlStatisticsTimeSeriesByPlanAggregation(this.planHash, this.statistics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStatisticsTimeSeriesByPlanAggregation model) {
            if (model.wasPropertyExplicitlySet("planHash")) {
                this.planHash(model.getPlanHash());
            }
            if (model.wasPropertyExplicitlySet("statistics")) {
                this.statistics(model.getStatistics());
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

    /** Plan hash value for the SQL Execution Plan */
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    private final Long planHash;

    /**
     * Plan hash value for the SQL Execution Plan
     *
     * @return the value
     */
    public Long getPlanHash() {
        return planHash;
    }

    /** SQL performance statistics for a given plan */
    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    private final java.util.List<SqlStatisticsTimeSeries> statistics;

    /**
     * SQL performance statistics for a given plan
     *
     * @return the value
     */
    public java.util.List<SqlStatisticsTimeSeries> getStatistics() {
        return statistics;
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
        sb.append("SqlStatisticsTimeSeriesByPlanAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("planHash=").append(String.valueOf(this.planHash));
        sb.append(", statistics=").append(String.valueOf(this.statistics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlStatisticsTimeSeriesByPlanAggregation)) {
            return false;
        }

        SqlStatisticsTimeSeriesByPlanAggregation other =
                (SqlStatisticsTimeSeriesByPlanAggregation) o;
        return java.util.Objects.equals(this.planHash, other.planHash)
                && java.util.Objects.equals(this.statistics, other.statistics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planHash == null ? 43 : this.planHash.hashCode());
        result = (result * PRIME) + (this.statistics == null ? 43 : this.statistics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
