/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the sort and order by attribute based on which the query results are organized.
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
    builder = QueryResultsOrderedBySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryResultsOrderedBySummary {
    @Deprecated
    @java.beans.ConstructorProperties({"queryResultsOrderedBy", "queryResultsSortOrder"})
    public QueryResultsOrderedBySummary(
            String queryResultsOrderedBy, String queryResultsSortOrder) {
        super();
        this.queryResultsOrderedBy = queryResultsOrderedBy;
        this.queryResultsSortOrder = queryResultsSortOrder;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsOrderedBy")
        private String queryResultsOrderedBy;

        public Builder queryResultsOrderedBy(String queryResultsOrderedBy) {
            this.queryResultsOrderedBy = queryResultsOrderedBy;
            this.__explicitlySet__.add("queryResultsOrderedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsSortOrder")
        private String queryResultsSortOrder;

        public Builder queryResultsSortOrder(String queryResultsSortOrder) {
            this.queryResultsSortOrder = queryResultsSortOrder;
            this.__explicitlySet__.add("queryResultsSortOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultsOrderedBySummary build() {
            QueryResultsOrderedBySummary __instance__ =
                    new QueryResultsOrderedBySummary(queryResultsOrderedBy, queryResultsSortOrder);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultsOrderedBySummary o) {
            Builder copiedBuilder =
                    queryResultsOrderedBy(o.getQueryResultsOrderedBy())
                            .queryResultsSortOrder(o.getQueryResultsSortOrder());

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
     * Attribute by which the query results are sorted.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsOrderedBy")
    private final String queryResultsOrderedBy;

    public String getQueryResultsOrderedBy() {
        return queryResultsOrderedBy;
    }

    /**
     * The sort order for the attribute, either 'ASC' or 'DESC'.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsSortOrder")
    private final String queryResultsSortOrder;

    public String getQueryResultsSortOrder() {
        return queryResultsSortOrder;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryResultsOrderedBySummary(");
        sb.append("queryResultsOrderedBy=").append(String.valueOf(this.queryResultsOrderedBy));
        sb.append(", queryResultsSortOrder=").append(String.valueOf(this.queryResultsSortOrder));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryResultsOrderedBySummary)) {
            return false;
        }

        QueryResultsOrderedBySummary other = (QueryResultsOrderedBySummary) o;
        return java.util.Objects.equals(this.queryResultsOrderedBy, other.queryResultsOrderedBy)
                && java.util.Objects.equals(this.queryResultsSortOrder, other.queryResultsSortOrder)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.queryResultsOrderedBy == null
                                ? 43
                                : this.queryResultsOrderedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.queryResultsSortOrder == null
                                ? 43
                                : this.queryResultsSortOrder.hashCode());
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
