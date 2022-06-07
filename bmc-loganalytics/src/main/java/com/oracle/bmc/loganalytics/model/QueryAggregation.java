/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryAggregation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalCount",
        "totalMatchedCount",
        "arePartialResults",
        "partialResultReason",
        "columns",
        "fields",
        "items",
        "queryExecutionTimeInMs",
        "percentComplete"
    })
    public QueryAggregation(
            Integer totalCount,
            Long totalMatchedCount,
            Boolean arePartialResults,
            String partialResultReason,
            java.util.List<AbstractColumn> columns,
            java.util.List<AbstractColumn> fields,
            java.util.List<java.util.Map<String, Object>> items,
            Long queryExecutionTimeInMs,
            Integer percentComplete) {
        super();
        this.totalCount = totalCount;
        this.totalMatchedCount = totalMatchedCount;
        this.arePartialResults = arePartialResults;
        this.partialResultReason = partialResultReason;
        this.columns = columns;
        this.fields = fields;
        this.items = items;
        this.queryExecutionTimeInMs = queryExecutionTimeInMs;
        this.percentComplete = percentComplete;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Number of rows query retrieved. Up to maxTotalCount limit.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Number of rows matched by query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
    private final Long totalMatchedCount;

    public Long getTotalMatchedCount() {
        return totalMatchedCount;
    }

    /**
     * True if query did not complete processing all data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arePartialResults")
    private final Boolean arePartialResults;

    public Boolean getArePartialResults() {
        return arePartialResults;
    }

    /**
     * Explanation of why results may be partial. Only set if arePartialResults is true.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partialResultReason")
    private final String partialResultReason;

    public String getPartialResultReason() {
        return partialResultReason;
    }

    /**
     * Query result columns
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<AbstractColumn> columns;

    public java.util.List<AbstractColumn> getColumns() {
        return columns;
    }

    /**
     * Query result fields
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<AbstractColumn> fields;

    public java.util.List<AbstractColumn> getFields() {
        return fields;
    }

    /**
     * Query result data
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<java.util.Map<String, Object>> items;

    public java.util.List<java.util.Map<String, Object>> getItems() {
        return items;
    }

    /**
     * Time ellapsed executing query in milli-seconds.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryExecutionTimeInMs")
    private final Long queryExecutionTimeInMs;

    public Long getQueryExecutionTimeInMs() {
        return queryExecutionTimeInMs;
    }

    /**
     * Percentage progress completion of the query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    public Integer getPercentComplete() {
        return percentComplete;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryAggregation(");
        sb.append("totalCount=").append(String.valueOf(this.totalCount));
        sb.append(", totalMatchedCount=").append(String.valueOf(this.totalMatchedCount));
        sb.append(", arePartialResults=").append(String.valueOf(this.arePartialResults));
        sb.append(", partialResultReason=").append(String.valueOf(this.partialResultReason));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", queryExecutionTimeInMs=").append(String.valueOf(this.queryExecutionTimeInMs));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryAggregation)) {
            return false;
        }

        QueryAggregation other = (QueryAggregation) o;
        return java.util.Objects.equals(this.totalCount, other.totalCount)
                && java.util.Objects.equals(this.totalMatchedCount, other.totalMatchedCount)
                && java.util.Objects.equals(this.arePartialResults, other.arePartialResults)
                && java.util.Objects.equals(this.partialResultReason, other.partialResultReason)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(
                        this.queryExecutionTimeInMs, other.queryExecutionTimeInMs)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMatchedCount == null ? 43 : this.totalMatchedCount.hashCode());
        result =
                (result * PRIME)
                        + (this.arePartialResults == null ? 43 : this.arePartialResults.hashCode());
        result =
                (result * PRIME)
                        + (this.partialResultReason == null
                                ? 43
                                : this.partialResultReason.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.queryExecutionTimeInMs == null
                                ? 43
                                : this.queryExecutionTimeInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
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
