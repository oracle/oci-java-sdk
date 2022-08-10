/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Database details and SQL performance statistics for a given database
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
    builder = SqlStatisticsTimeSeriesAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlStatisticsTimeSeriesAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseDetails", "statistics"})
    public SqlStatisticsTimeSeriesAggregation(
            DatabaseDetails databaseDetails, java.util.List<SqlStatisticsTimeSeries> statistics) {
        super();
        this.databaseDetails = databaseDetails;
        this.statistics = statistics;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
        private DatabaseDetails databaseDetails;

        public Builder databaseDetails(DatabaseDetails databaseDetails) {
            this.databaseDetails = databaseDetails;
            this.__explicitlySet__.add("databaseDetails");
            return this;
        }
        /**
         * SQL performance statistics for a given database
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private java.util.List<SqlStatisticsTimeSeries> statistics;

        /**
         * SQL performance statistics for a given database
         *
         * @param statistics the value to set
         * @return this builder
         **/
        public Builder statistics(java.util.List<SqlStatisticsTimeSeries> statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlStatisticsTimeSeriesAggregation build() {
            SqlStatisticsTimeSeriesAggregation model =
                    new SqlStatisticsTimeSeriesAggregation(this.databaseDetails, this.statistics);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlStatisticsTimeSeriesAggregation model) {
            if (model.wasPropertyExplicitlySet("databaseDetails")) {
                this.databaseDetails(model.getDatabaseDetails());
            }
            if (model.wasPropertyExplicitlySet("statistics")) {
                this.statistics(model.getStatistics());
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

    @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
    private final DatabaseDetails databaseDetails;

    public DatabaseDetails getDatabaseDetails() {
        return databaseDetails;
    }

    /**
     * SQL performance statistics for a given database
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    private final java.util.List<SqlStatisticsTimeSeries> statistics;

    /**
     * SQL performance statistics for a given database
     *
     * @return the value
     **/
    public java.util.List<SqlStatisticsTimeSeries> getStatistics() {
        return statistics;
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
        sb.append("SqlStatisticsTimeSeriesAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("databaseDetails=").append(String.valueOf(this.databaseDetails));
        sb.append(", statistics=").append(String.valueOf(this.statistics));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlStatisticsTimeSeriesAggregation)) {
            return false;
        }

        SqlStatisticsTimeSeriesAggregation other = (SqlStatisticsTimeSeriesAggregation) o;
        return java.util.Objects.equals(this.databaseDetails, other.databaseDetails)
                && java.util.Objects.equals(this.statistics, other.statistics)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseDetails == null ? 43 : this.databaseDetails.hashCode());
        result = (result * PRIME) + (this.statistics == null ? 43 : this.statistics.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
