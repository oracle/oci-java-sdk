/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL Statistics
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlStatisticAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlStatisticAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sqlIdentifier",
        "databaseDetails",
        "category",
        "statistics"
    })
    public SqlStatisticAggregation(
            String sqlIdentifier,
            DatabaseDetails databaseDetails,
            java.util.List<String> category,
            SqlStatistics statistics) {
        super();
        this.sqlIdentifier = sqlIdentifier;
        this.databaseDetails = databaseDetails;
        this.category = category;
        this.statistics = statistics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique SQL_ID for a SQL Statement.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
        private String sqlIdentifier;

        /**
         * Unique SQL_ID for a SQL Statement.
         *
         * @param sqlIdentifier the value to set
         * @return this builder
         **/
        public Builder sqlIdentifier(String sqlIdentifier) {
            this.sqlIdentifier = sqlIdentifier;
            this.__explicitlySet__.add("sqlIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
        private DatabaseDetails databaseDetails;

        public Builder databaseDetails(DatabaseDetails databaseDetails) {
            this.databaseDetails = databaseDetails;
            this.__explicitlySet__.add("databaseDetails");
            return this;
        }
        /**
         * SQL belongs to one or more categories based on the insights.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private java.util.List<String> category;

        /**
         * SQL belongs to one or more categories based on the insights.
         *
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(java.util.List<String> category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private SqlStatistics statistics;

        public Builder statistics(SqlStatistics statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStatisticAggregation build() {
            SqlStatisticAggregation __instance__ =
                    new SqlStatisticAggregation(
                            sqlIdentifier, databaseDetails, category, statistics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStatisticAggregation o) {
            Builder copiedBuilder =
                    sqlIdentifier(o.getSqlIdentifier())
                            .databaseDetails(o.getDatabaseDetails())
                            .category(o.getCategory())
                            .statistics(o.getStatistics());

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
     * Unique SQL_ID for a SQL Statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlIdentifier")
    private final String sqlIdentifier;

    /**
     * Unique SQL_ID for a SQL Statement.
     *
     * @return the value
     **/
    public String getSqlIdentifier() {
        return sqlIdentifier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
    private final DatabaseDetails databaseDetails;

    public DatabaseDetails getDatabaseDetails() {
        return databaseDetails;
    }

    /**
     * SQL belongs to one or more categories based on the insights.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final java.util.List<String> category;

    /**
     * SQL belongs to one or more categories based on the insights.
     *
     * @return the value
     **/
    public java.util.List<String> getCategory() {
        return category;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    private final SqlStatistics statistics;

    public SqlStatistics getStatistics() {
        return statistics;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlStatisticAggregation(");
        sb.append("sqlIdentifier=").append(String.valueOf(this.sqlIdentifier));
        sb.append(", databaseDetails=").append(String.valueOf(this.databaseDetails));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", statistics=").append(String.valueOf(this.statistics));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlStatisticAggregation)) {
            return false;
        }

        SqlStatisticAggregation other = (SqlStatisticAggregation) o;
        return java.util.Objects.equals(this.sqlIdentifier, other.sqlIdentifier)
                && java.util.Objects.equals(this.databaseDetails, other.databaseDetails)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.statistics, other.statistics)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sqlIdentifier == null ? 43 : this.sqlIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseDetails == null ? 43 : this.databaseDetails.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.statistics == null ? 43 : this.statistics.hashCode());
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
