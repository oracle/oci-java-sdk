/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the sort and order by attribute based on which the query results are organized. <br>
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
        builder = QueryResultsOrderedBySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class QueryResultsOrderedBySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Attribute by which the query results are sorted. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsOrderedBy")
        private String queryResultsOrderedBy;

        /**
         * Attribute by which the query results are sorted.
         *
         * @param queryResultsOrderedBy the value to set
         * @return this builder
         */
        public Builder queryResultsOrderedBy(String queryResultsOrderedBy) {
            this.queryResultsOrderedBy = queryResultsOrderedBy;
            this.__explicitlySet__.add("queryResultsOrderedBy");
            return this;
        }
        /** The sort order for the attribute, either 'ASC' or 'DESC'. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultsSortOrder")
        private String queryResultsSortOrder;

        /**
         * The sort order for the attribute, either 'ASC' or 'DESC'.
         *
         * @param queryResultsSortOrder the value to set
         * @return this builder
         */
        public Builder queryResultsSortOrder(String queryResultsSortOrder) {
            this.queryResultsSortOrder = queryResultsSortOrder;
            this.__explicitlySet__.add("queryResultsSortOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultsOrderedBySummary build() {
            QueryResultsOrderedBySummary model =
                    new QueryResultsOrderedBySummary(
                            this.queryResultsOrderedBy, this.queryResultsSortOrder);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultsOrderedBySummary model) {
            if (model.wasPropertyExplicitlySet("queryResultsOrderedBy")) {
                this.queryResultsOrderedBy(model.getQueryResultsOrderedBy());
            }
            if (model.wasPropertyExplicitlySet("queryResultsSortOrder")) {
                this.queryResultsSortOrder(model.getQueryResultsSortOrder());
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

    /** Attribute by which the query results are sorted. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsOrderedBy")
    private final String queryResultsOrderedBy;

    /**
     * Attribute by which the query results are sorted.
     *
     * @return the value
     */
    public String getQueryResultsOrderedBy() {
        return queryResultsOrderedBy;
    }

    /** The sort order for the attribute, either 'ASC' or 'DESC'. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultsSortOrder")
    private final String queryResultsSortOrder;

    /**
     * The sort order for the attribute, either 'ASC' or 'DESC'.
     *
     * @return the value
     */
    public String getQueryResultsSortOrder() {
        return queryResultsSortOrder;
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
        sb.append("QueryResultsOrderedBySummary(");
        sb.append("super=").append(super.toString());
        sb.append("queryResultsOrderedBy=").append(String.valueOf(this.queryResultsOrderedBy));
        sb.append(", queryResultsSortOrder=").append(String.valueOf(this.queryResultsSortOrder));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
