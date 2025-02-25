/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary containing the metadata about the query result set.
 *
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
    builder = QueryResultMetadataSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryResultMetadataSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "queryResultRowTypeSummaries",
        "sourceName",
        "queryResultsGroupedBy",
        "queryResultsOrderedBy",
        "queryResultsTopologyInfo",
        "timeSeriesIntervalInMins"
    })
    public QueryResultMetadataSummary(
            java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries,
            String sourceName,
            java.util.List<QueryResultsGroupedBySummary> queryResultsGroupedBy,
            java.util.List<QueryResultsOrderedBySummary> queryResultsOrderedBy,
            QueryResultsTopologyInfo queryResultsTopologyInfo,
            Integer timeSeriesIntervalInMins) {
        super();
        this.queryResultRowTypeSummaries = queryResultRowTypeSummaries;
        this.sourceName = sourceName;
        this.queryResultsGroupedBy = queryResultsGroupedBy;
        this.queryResultsOrderedBy = queryResultsOrderedBy;
        this.queryResultsTopologyInfo = queryResultsTopologyInfo;
        this.timeSeriesIntervalInMins = timeSeriesIntervalInMins;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A collection of QueryResultRowTypeSummary objects that describe the type and properties of the individual row elements of the query rows
         * being returned.  The i-th element in this list contains the QueryResultRowTypeSummary of the i-th key-value pair in the QueryResultRowData map.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowTypeSummaries")
        private java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries;

        /**
         * A collection of QueryResultRowTypeSummary objects that describe the type and properties of the individual row elements of the query rows
         * being returned.  The i-th element in this list contains the QueryResultRowTypeSummary of the i-th key-value pair in the QueryResultRowData map.
         *
         * @param queryResultRowTypeSummaries the value to set
         * @return this builder
         **/
        public Builder queryResultRowTypeSummaries(
                java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries) {
            this.queryResultRowTypeSummaries = queryResultRowTypeSummaries;
            this.__explicitlySet__.add("queryResultRowTypeSummaries");
            return this;
        }
        /**
         * Source of the query result set (traces, spans, and so on).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        /**
         * Source of the query result set (traces, spans, and so on).
         *
         * @param sourceName the value to set
         * @return this builder
         **/
        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }
        /**
         * Columns or attributes of the query rows  which are group by values.  This is a list of ResultsGroupedBy summary objects,
         * and the list will contain as many elements as the attributes and aggregate functions in the group by clause in the select query.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsGroupedBy")
        private java.util.List<QueryResultsGroupedBySummary> queryResultsGroupedBy;

        /**
         * Columns or attributes of the query rows  which are group by values.  This is a list of ResultsGroupedBy summary objects,
         * and the list will contain as many elements as the attributes and aggregate functions in the group by clause in the select query.
         *
         * @param queryResultsGroupedBy the value to set
         * @return this builder
         **/
        public Builder queryResultsGroupedBy(
                java.util.List<QueryResultsGroupedBySummary> queryResultsGroupedBy) {
            this.queryResultsGroupedBy = queryResultsGroupedBy;
            this.__explicitlySet__.add("queryResultsGroupedBy");
            return this;
        }
        /**
         * Order by which the query results are organized.  This is a list of queryResultsOrderedBy summary objects, and the list
         * will contain more than one OrderedBy summary object, if the sort was multidimensional.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsOrderedBy")
        private java.util.List<QueryResultsOrderedBySummary> queryResultsOrderedBy;

        /**
         * Order by which the query results are organized.  This is a list of queryResultsOrderedBy summary objects, and the list
         * will contain more than one OrderedBy summary object, if the sort was multidimensional.
         *
         * @param queryResultsOrderedBy the value to set
         * @return this builder
         **/
        public Builder queryResultsOrderedBy(
                java.util.List<QueryResultsOrderedBySummary> queryResultsOrderedBy) {
            this.queryResultsOrderedBy = queryResultsOrderedBy;
            this.__explicitlySet__.add("queryResultsOrderedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsTopologyInfo")
        private QueryResultsTopologyInfo queryResultsTopologyInfo;

        public Builder queryResultsTopologyInfo(QueryResultsTopologyInfo queryResultsTopologyInfo) {
            this.queryResultsTopologyInfo = queryResultsTopologyInfo;
            this.__explicitlySet__.add("queryResultsTopologyInfo");
            return this;
        }
        /**
         * Interval for the time series function in minutes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeSeriesIntervalInMins")
        private Integer timeSeriesIntervalInMins;

        /**
         * Interval for the time series function in minutes.
         *
         * @param timeSeriesIntervalInMins the value to set
         * @return this builder
         **/
        public Builder timeSeriesIntervalInMins(Integer timeSeriesIntervalInMins) {
            this.timeSeriesIntervalInMins = timeSeriesIntervalInMins;
            this.__explicitlySet__.add("timeSeriesIntervalInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultMetadataSummary build() {
            QueryResultMetadataSummary model =
                    new QueryResultMetadataSummary(
                            this.queryResultRowTypeSummaries,
                            this.sourceName,
                            this.queryResultsGroupedBy,
                            this.queryResultsOrderedBy,
                            this.queryResultsTopologyInfo,
                            this.timeSeriesIntervalInMins);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultMetadataSummary model) {
            if (model.wasPropertyExplicitlySet("queryResultRowTypeSummaries")) {
                this.queryResultRowTypeSummaries(model.getQueryResultRowTypeSummaries());
            }
            if (model.wasPropertyExplicitlySet("sourceName")) {
                this.sourceName(model.getSourceName());
            }
            if (model.wasPropertyExplicitlySet("queryResultsGroupedBy")) {
                this.queryResultsGroupedBy(model.getQueryResultsGroupedBy());
            }
            if (model.wasPropertyExplicitlySet("queryResultsOrderedBy")) {
                this.queryResultsOrderedBy(model.getQueryResultsOrderedBy());
            }
            if (model.wasPropertyExplicitlySet("queryResultsTopologyInfo")) {
                this.queryResultsTopologyInfo(model.getQueryResultsTopologyInfo());
            }
            if (model.wasPropertyExplicitlySet("timeSeriesIntervalInMins")) {
                this.timeSeriesIntervalInMins(model.getTimeSeriesIntervalInMins());
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
     * A collection of QueryResultRowTypeSummary objects that describe the type and properties of the individual row elements of the query rows
     * being returned.  The i-th element in this list contains the QueryResultRowTypeSummary of the i-th key-value pair in the QueryResultRowData map.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowTypeSummaries")
    private final java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries;

    /**
     * A collection of QueryResultRowTypeSummary objects that describe the type and properties of the individual row elements of the query rows
     * being returned.  The i-th element in this list contains the QueryResultRowTypeSummary of the i-th key-value pair in the QueryResultRowData map.
     *
     * @return the value
     **/
    public java.util.List<QueryResultRowTypeSummary> getQueryResultRowTypeSummaries() {
        return queryResultRowTypeSummaries;
    }

    /**
     * Source of the query result set (traces, spans, and so on).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    private final String sourceName;

    /**
     * Source of the query result set (traces, spans, and so on).
     *
     * @return the value
     **/
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Columns or attributes of the query rows  which are group by values.  This is a list of ResultsGroupedBy summary objects,
     * and the list will contain as many elements as the attributes and aggregate functions in the group by clause in the select query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsGroupedBy")
    private final java.util.List<QueryResultsGroupedBySummary> queryResultsGroupedBy;

    /**
     * Columns or attributes of the query rows  which are group by values.  This is a list of ResultsGroupedBy summary objects,
     * and the list will contain as many elements as the attributes and aggregate functions in the group by clause in the select query.
     *
     * @return the value
     **/
    public java.util.List<QueryResultsGroupedBySummary> getQueryResultsGroupedBy() {
        return queryResultsGroupedBy;
    }

    /**
     * Order by which the query results are organized.  This is a list of queryResultsOrderedBy summary objects, and the list
     * will contain more than one OrderedBy summary object, if the sort was multidimensional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsOrderedBy")
    private final java.util.List<QueryResultsOrderedBySummary> queryResultsOrderedBy;

    /**
     * Order by which the query results are organized.  This is a list of queryResultsOrderedBy summary objects, and the list
     * will contain more than one OrderedBy summary object, if the sort was multidimensional.
     *
     * @return the value
     **/
    public java.util.List<QueryResultsOrderedBySummary> getQueryResultsOrderedBy() {
        return queryResultsOrderedBy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsTopologyInfo")
    private final QueryResultsTopologyInfo queryResultsTopologyInfo;

    public QueryResultsTopologyInfo getQueryResultsTopologyInfo() {
        return queryResultsTopologyInfo;
    }

    /**
     * Interval for the time series function in minutes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSeriesIntervalInMins")
    private final Integer timeSeriesIntervalInMins;

    /**
     * Interval for the time series function in minutes.
     *
     * @return the value
     **/
    public Integer getTimeSeriesIntervalInMins() {
        return timeSeriesIntervalInMins;
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
        sb.append("QueryResultMetadataSummary(");
        sb.append("super=").append(super.toString());
        sb.append("queryResultRowTypeSummaries=")
                .append(String.valueOf(this.queryResultRowTypeSummaries));
        sb.append(", sourceName=").append(String.valueOf(this.sourceName));
        sb.append(", queryResultsGroupedBy=").append(String.valueOf(this.queryResultsGroupedBy));
        sb.append(", queryResultsOrderedBy=").append(String.valueOf(this.queryResultsOrderedBy));
        sb.append(", queryResultsTopologyInfo=")
                .append(String.valueOf(this.queryResultsTopologyInfo));
        sb.append(", timeSeriesIntervalInMins=")
                .append(String.valueOf(this.timeSeriesIntervalInMins));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryResultMetadataSummary)) {
            return false;
        }

        QueryResultMetadataSummary other = (QueryResultMetadataSummary) o;
        return java.util.Objects.equals(
                        this.queryResultRowTypeSummaries, other.queryResultRowTypeSummaries)
                && java.util.Objects.equals(this.sourceName, other.sourceName)
                && java.util.Objects.equals(this.queryResultsGroupedBy, other.queryResultsGroupedBy)
                && java.util.Objects.equals(this.queryResultsOrderedBy, other.queryResultsOrderedBy)
                && java.util.Objects.equals(
                        this.queryResultsTopologyInfo, other.queryResultsTopologyInfo)
                && java.util.Objects.equals(
                        this.timeSeriesIntervalInMins, other.timeSeriesIntervalInMins)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.queryResultRowTypeSummaries == null
                                ? 43
                                : this.queryResultRowTypeSummaries.hashCode());
        result = (result * PRIME) + (this.sourceName == null ? 43 : this.sourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.queryResultsGroupedBy == null
                                ? 43
                                : this.queryResultsGroupedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.queryResultsOrderedBy == null
                                ? 43
                                : this.queryResultsOrderedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.queryResultsTopologyInfo == null
                                ? 43
                                : this.queryResultsTopologyInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSeriesIntervalInMins == null
                                ? 43
                                : this.timeSeriesIntervalInMins.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
