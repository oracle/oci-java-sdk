/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Query results.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class QueryAggregation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
        private Long totalMatchedCount;

        public Builder totalMatchedCount(Long totalMatchedCount) {
            this.totalMatchedCount = totalMatchedCount;
            this.__explicitlySet__.add("totalMatchedCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("arePartialResults")
        private Boolean arePartialResults;

        public Builder arePartialResults(Boolean arePartialResults) {
            this.arePartialResults = arePartialResults;
            this.__explicitlySet__.add("arePartialResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partialResultReason")
        private String partialResultReason;

        public Builder partialResultReason(String partialResultReason) {
            this.partialResultReason = partialResultReason;
            this.__explicitlySet__.add("partialResultReason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<AbstractColumn> columns;

        public Builder columns(java.util.List<AbstractColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<AbstractColumn> fields;

        public Builder fields(java.util.List<AbstractColumn> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<java.util.Map<String, Object>> items;

        public Builder items(java.util.List<java.util.Map<String, Object>> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryExecutionTimeInMs")
        private Long queryExecutionTimeInMs;

        public Builder queryExecutionTimeInMs(Long queryExecutionTimeInMs) {
            this.queryExecutionTimeInMs = queryExecutionTimeInMs;
            this.__explicitlySet__.add("queryExecutionTimeInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryAggregation build() {
            QueryAggregation __instance__ =
                    new QueryAggregation(
                            totalCount,
                            totalMatchedCount,
                            arePartialResults,
                            partialResultReason,
                            columns,
                            fields,
                            items,
                            queryExecutionTimeInMs,
                            percentComplete);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryAggregation o) {
            Builder copiedBuilder =
                    totalCount(o.getTotalCount())
                            .totalMatchedCount(o.getTotalMatchedCount())
                            .arePartialResults(o.getArePartialResults())
                            .partialResultReason(o.getPartialResultReason())
                            .columns(o.getColumns())
                            .fields(o.getFields())
                            .items(o.getItems())
                            .queryExecutionTimeInMs(o.getQueryExecutionTimeInMs())
                            .percentComplete(o.getPercentComplete());

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
     * Number of rows query retrieved. Up to maxTotalCount limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    Integer totalCount;

    /**
     * Number of rows matched by query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
    Long totalMatchedCount;

    /**
     * True if query did not complete processing all data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arePartialResults")
    Boolean arePartialResults;

    /**
     * Explanation of why results may be partial. Only set if arePartialResults is true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partialResultReason")
    String partialResultReason;

    /**
     * Query result columns
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    java.util.List<AbstractColumn> columns;

    /**
     * Query result fields
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    java.util.List<AbstractColumn> fields;

    /**
     * Query result data
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<java.util.Map<String, Object>> items;

    /**
     * Time ellapsed executing query in milli-seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryExecutionTimeInMs")
    Long queryExecutionTimeInMs;

    /**
     * Percentage progress completion of the query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    Integer percentComplete;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
