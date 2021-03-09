/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryResultMetadataSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class QueryResultMetadataSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowTypeSummaries")
        private java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries;

        public Builder queryResultRowTypeSummaries(
                java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries) {
            this.queryResultRowTypeSummaries = queryResultRowTypeSummaries;
            this.__explicitlySet__.add("queryResultRowTypeSummaries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsGroupedBy")
        private java.util.List<QueryResultsGroupedBySummary> queryResultsGroupedBy;

        public Builder queryResultsGroupedBy(
                java.util.List<QueryResultsGroupedBySummary> queryResultsGroupedBy) {
            this.queryResultsGroupedBy = queryResultsGroupedBy;
            this.__explicitlySet__.add("queryResultsGroupedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsOrderedBy")
        private java.util.List<QueryResultsOrderedBySummary> queryResultsOrderedBy;

        public Builder queryResultsOrderedBy(
                java.util.List<QueryResultsOrderedBySummary> queryResultsOrderedBy) {
            this.queryResultsOrderedBy = queryResultsOrderedBy;
            this.__explicitlySet__.add("queryResultsOrderedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeSeriesIntervalInMins")
        private Integer timeSeriesIntervalInMins;

        public Builder timeSeriesIntervalInMins(Integer timeSeriesIntervalInMins) {
            this.timeSeriesIntervalInMins = timeSeriesIntervalInMins;
            this.__explicitlySet__.add("timeSeriesIntervalInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultMetadataSummary build() {
            QueryResultMetadataSummary __instance__ =
                    new QueryResultMetadataSummary(
                            queryResultRowTypeSummaries,
                            sourceName,
                            queryResultsGroupedBy,
                            queryResultsOrderedBy,
                            timeSeriesIntervalInMins);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultMetadataSummary o) {
            Builder copiedBuilder =
                    queryResultRowTypeSummaries(o.getQueryResultRowTypeSummaries())
                            .sourceName(o.getSourceName())
                            .queryResultsGroupedBy(o.getQueryResultsGroupedBy())
                            .queryResultsOrderedBy(o.getQueryResultsOrderedBy())
                            .timeSeriesIntervalInMins(o.getTimeSeriesIntervalInMins());

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
     * A collection of QueryResultRowTypeSummary objects that describe the type and properties of the individual row elements of the query rows
     * being returned.  The ith element in this list contains the QueryResultRowTypeSummary of the ith key value pair in the QueryResultRowData map.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowTypeSummaries")
    java.util.List<QueryResultRowTypeSummary> queryResultRowTypeSummaries;

    /**
     * Source of the query result set (traces, spans, etc).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    String sourceName;

    /**
     * Columns or attributes of the query rows  which are group by values.  This is a list of ResultsGroupedBy summary objects,
     * and the list will contain as many elements as the attributes and aggregate functions in the group by clause in the select query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsGroupedBy")
    java.util.List<QueryResultsGroupedBySummary> queryResultsGroupedBy;

    /**
     * Order by which the query results are organized.  This is a list of queryResultsOrderedBy summary objects, and the list
     * will contain more than one OrderedBy summary object, if the sort was multidimensional.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsOrderedBy")
    java.util.List<QueryResultsOrderedBySummary> queryResultsOrderedBy;

    /**
     * Interval for the time series function in minutes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeSeriesIntervalInMins")
    Integer timeSeriesIntervalInMins;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
