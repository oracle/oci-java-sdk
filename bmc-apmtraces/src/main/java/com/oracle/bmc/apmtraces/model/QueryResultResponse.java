/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * A response containing a collection of query rows (selected attributes and aggregations) filtered, grouped and
 * sorted by the specified criteria from the query that is run, and the associated summary describing the corresponding
 * query result metadata.
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
    builder = QueryResultResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryResultResponse {
    @Deprecated
    @java.beans.ConstructorProperties({"queryResultMetadataSummary", "queryResultRows"})
    public QueryResultResponse(
            QueryResultMetadataSummary queryResultMetadataSummary,
            java.util.List<QueryResultRow> queryResultRows) {
        super();
        this.queryResultMetadataSummary = queryResultMetadataSummary;
        this.queryResultRows = queryResultRows;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultMetadataSummary")
        private QueryResultMetadataSummary queryResultMetadataSummary;

        public Builder queryResultMetadataSummary(
                QueryResultMetadataSummary queryResultMetadataSummary) {
            this.queryResultMetadataSummary = queryResultMetadataSummary;
            this.__explicitlySet__.add("queryResultMetadataSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryResultRows")
        private java.util.List<QueryResultRow> queryResultRows;

        public Builder queryResultRows(java.util.List<QueryResultRow> queryResultRows) {
            this.queryResultRows = queryResultRows;
            this.__explicitlySet__.add("queryResultRows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultResponse build() {
            QueryResultResponse __instance__ =
                    new QueryResultResponse(queryResultMetadataSummary, queryResultRows);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultResponse o) {
            Builder copiedBuilder =
                    queryResultMetadataSummary(o.getQueryResultMetadataSummary())
                            .queryResultRows(o.getQueryResultRows());

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

    @com.fasterxml.jackson.annotation.JsonProperty("queryResultMetadataSummary")
    private final QueryResultMetadataSummary queryResultMetadataSummary;

    public QueryResultMetadataSummary getQueryResultMetadataSummary() {
        return queryResultMetadataSummary;
    }

    /**
     * A collection of objects with each object representing an individual row of the query result set.  The total number of objects
     * returned in this collection correspond to the total number of rows returned by the actual query that is run against
     * the queried entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultRows")
    private final java.util.List<QueryResultRow> queryResultRows;

    public java.util.List<QueryResultRow> getQueryResultRows() {
        return queryResultRows;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryResultResponse(");
        sb.append("queryResultMetadataSummary=")
                .append(String.valueOf(this.queryResultMetadataSummary));
        sb.append(", queryResultRows=").append(String.valueOf(this.queryResultRows));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryResultResponse)) {
            return false;
        }

        QueryResultResponse other = (QueryResultResponse) o;
        return java.util.Objects.equals(
                        this.queryResultMetadataSummary, other.queryResultMetadataSummary)
                && java.util.Objects.equals(this.queryResultRows, other.queryResultRows)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.queryResultMetadataSummary == null
                                ? 43
                                : this.queryResultMetadataSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.queryResultRows == null ? 43 : this.queryResultRows.hashCode());
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
