/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Query results. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalCount",
        "totalMatchedCount",
        "arePartialResults",
        "partialResultReason",
        "isContentHidden",
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
            Boolean isContentHidden,
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
        this.isContentHidden = isContentHidden;
        this.columns = columns;
        this.fields = fields;
        this.items = items;
        this.queryExecutionTimeInMs = queryExecutionTimeInMs;
        this.percentComplete = percentComplete;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of rows query retrieved. Up to maxTotalCount limit. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        /**
         * Number of rows query retrieved. Up to maxTotalCount limit.
         *
         * @param totalCount the value to set
         * @return this builder
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }
        /** Number of rows matched by query. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
        private Long totalMatchedCount;

        /**
         * Number of rows matched by query.
         *
         * @param totalMatchedCount the value to set
         * @return this builder
         */
        public Builder totalMatchedCount(Long totalMatchedCount) {
            this.totalMatchedCount = totalMatchedCount;
            this.__explicitlySet__.add("totalMatchedCount");
            return this;
        }
        /** True if query did not complete processing all data. */
        @com.fasterxml.jackson.annotation.JsonProperty("arePartialResults")
        private Boolean arePartialResults;

        /**
         * True if query did not complete processing all data.
         *
         * @param arePartialResults the value to set
         * @return this builder
         */
        public Builder arePartialResults(Boolean arePartialResults) {
            this.arePartialResults = arePartialResults;
            this.__explicitlySet__.add("arePartialResults");
            return this;
        }
        /** Explanation of why results may be partial. Only set if arePartialResults is true. */
        @com.fasterxml.jackson.annotation.JsonProperty("partialResultReason")
        private String partialResultReason;

        /**
         * Explanation of why results may be partial. Only set if arePartialResults is true.
         *
         * @param partialResultReason the value to set
         * @return this builder
         */
        public Builder partialResultReason(String partialResultReason) {
            this.partialResultReason = partialResultReason;
            this.__explicitlySet__.add("partialResultReason");
            return this;
        }
        /** True if the data returned by query is hidden. */
        @com.fasterxml.jackson.annotation.JsonProperty("isContentHidden")
        private Boolean isContentHidden;

        /**
         * True if the data returned by query is hidden.
         *
         * @param isContentHidden the value to set
         * @return this builder
         */
        public Builder isContentHidden(Boolean isContentHidden) {
            this.isContentHidden = isContentHidden;
            this.__explicitlySet__.add("isContentHidden");
            return this;
        }
        /** Query result columns */
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<AbstractColumn> columns;

        /**
         * Query result columns
         *
         * @param columns the value to set
         * @return this builder
         */
        public Builder columns(java.util.List<AbstractColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /** Query result fields */
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<AbstractColumn> fields;

        /**
         * Query result fields
         *
         * @param fields the value to set
         * @return this builder
         */
        public Builder fields(java.util.List<AbstractColumn> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }
        /** Query result data */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<java.util.Map<String, Object>> items;

        /**
         * Query result data
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<java.util.Map<String, Object>> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /** Time ellapsed executing query in milli-seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryExecutionTimeInMs")
        private Long queryExecutionTimeInMs;

        /**
         * Time ellapsed executing query in milli-seconds.
         *
         * @param queryExecutionTimeInMs the value to set
         * @return this builder
         */
        public Builder queryExecutionTimeInMs(Long queryExecutionTimeInMs) {
            this.queryExecutionTimeInMs = queryExecutionTimeInMs;
            this.__explicitlySet__.add("queryExecutionTimeInMs");
            return this;
        }
        /** Percentage progress completion of the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        /**
         * Percentage progress completion of the query.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryAggregation build() {
            QueryAggregation model =
                    new QueryAggregation(
                            this.totalCount,
                            this.totalMatchedCount,
                            this.arePartialResults,
                            this.partialResultReason,
                            this.isContentHidden,
                            this.columns,
                            this.fields,
                            this.items,
                            this.queryExecutionTimeInMs,
                            this.percentComplete);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryAggregation model) {
            if (model.wasPropertyExplicitlySet("totalCount")) {
                this.totalCount(model.getTotalCount());
            }
            if (model.wasPropertyExplicitlySet("totalMatchedCount")) {
                this.totalMatchedCount(model.getTotalMatchedCount());
            }
            if (model.wasPropertyExplicitlySet("arePartialResults")) {
                this.arePartialResults(model.getArePartialResults());
            }
            if (model.wasPropertyExplicitlySet("partialResultReason")) {
                this.partialResultReason(model.getPartialResultReason());
            }
            if (model.wasPropertyExplicitlySet("isContentHidden")) {
                this.isContentHidden(model.getIsContentHidden());
            }
            if (model.wasPropertyExplicitlySet("columns")) {
                this.columns(model.getColumns());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("queryExecutionTimeInMs")) {
                this.queryExecutionTimeInMs(model.getQueryExecutionTimeInMs());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
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

    /** Number of rows query retrieved. Up to maxTotalCount limit. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    /**
     * Number of rows query retrieved. Up to maxTotalCount limit.
     *
     * @return the value
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /** Number of rows matched by query. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMatchedCount")
    private final Long totalMatchedCount;

    /**
     * Number of rows matched by query.
     *
     * @return the value
     */
    public Long getTotalMatchedCount() {
        return totalMatchedCount;
    }

    /** True if query did not complete processing all data. */
    @com.fasterxml.jackson.annotation.JsonProperty("arePartialResults")
    private final Boolean arePartialResults;

    /**
     * True if query did not complete processing all data.
     *
     * @return the value
     */
    public Boolean getArePartialResults() {
        return arePartialResults;
    }

    /** Explanation of why results may be partial. Only set if arePartialResults is true. */
    @com.fasterxml.jackson.annotation.JsonProperty("partialResultReason")
    private final String partialResultReason;

    /**
     * Explanation of why results may be partial. Only set if arePartialResults is true.
     *
     * @return the value
     */
    public String getPartialResultReason() {
        return partialResultReason;
    }

    /** True if the data returned by query is hidden. */
    @com.fasterxml.jackson.annotation.JsonProperty("isContentHidden")
    private final Boolean isContentHidden;

    /**
     * True if the data returned by query is hidden.
     *
     * @return the value
     */
    public Boolean getIsContentHidden() {
        return isContentHidden;
    }

    /** Query result columns */
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<AbstractColumn> columns;

    /**
     * Query result columns
     *
     * @return the value
     */
    public java.util.List<AbstractColumn> getColumns() {
        return columns;
    }

    /** Query result fields */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<AbstractColumn> fields;

    /**
     * Query result fields
     *
     * @return the value
     */
    public java.util.List<AbstractColumn> getFields() {
        return fields;
    }

    /** Query result data */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<java.util.Map<String, Object>> items;

    /**
     * Query result data
     *
     * @return the value
     */
    public java.util.List<java.util.Map<String, Object>> getItems() {
        return items;
    }

    /** Time ellapsed executing query in milli-seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryExecutionTimeInMs")
    private final Long queryExecutionTimeInMs;

    /**
     * Time ellapsed executing query in milli-seconds.
     *
     * @return the value
     */
    public Long getQueryExecutionTimeInMs() {
        return queryExecutionTimeInMs;
    }

    /** Percentage progress completion of the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    /**
     * Percentage progress completion of the query.
     *
     * @return the value
     */
    public Integer getPercentComplete() {
        return percentComplete;
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
        sb.append("QueryAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("totalCount=").append(String.valueOf(this.totalCount));
        sb.append(", totalMatchedCount=").append(String.valueOf(this.totalMatchedCount));
        sb.append(", arePartialResults=").append(String.valueOf(this.arePartialResults));
        sb.append(", partialResultReason=").append(String.valueOf(this.partialResultReason));
        sb.append(", isContentHidden=").append(String.valueOf(this.isContentHidden));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", queryExecutionTimeInMs=").append(String.valueOf(this.queryExecutionTimeInMs));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
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
                && java.util.Objects.equals(this.isContentHidden, other.isContentHidden)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(
                        this.queryExecutionTimeInMs, other.queryExecutionTimeInMs)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && super.equals(other);
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
        result =
                (result * PRIME)
                        + (this.isContentHidden == null ? 43 : this.isContentHidden.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
