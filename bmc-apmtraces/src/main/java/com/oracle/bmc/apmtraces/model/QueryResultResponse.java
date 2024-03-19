/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * A response containing a collection of query rows (selected attributes and aggregations) filtered,
 * grouped and sorted by the specified criteria from the query that is run, and the associated
 * summary describing the corresponding query result metadata. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = QueryResultResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueryResultResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "queryResultMetadataSummary",
        "queryResultRows",
        "queryResultMetadata",
        "queryResultWarnings"
    })
    public QueryResultResponse(
            QueryResultMetadataSummary queryResultMetadataSummary,
            java.util.List<QueryResultRow> queryResultRows,
            java.util.Map<String, Object> queryResultMetadata,
            java.util.List<QueryResultWarning> queryResultWarnings) {
        super();
        this.queryResultMetadataSummary = queryResultMetadataSummary;
        this.queryResultRows = queryResultRows;
        this.queryResultMetadata = queryResultMetadata;
        this.queryResultWarnings = queryResultWarnings;
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
        /**
         * A collection of objects with each object representing an individual row of the query
         * result set. The total number of objects returned in this collection correspond to the
         * total number of rows returned by the actual query that is run against the queried entity.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultRows")
        private java.util.List<QueryResultRow> queryResultRows;

        /**
         * A collection of objects with each object representing an individual row of the query
         * result set. The total number of objects returned in this collection correspond to the
         * total number of rows returned by the actual query that is run against the queried entity.
         *
         * @param queryResultRows the value to set
         * @return this builder
         */
        public Builder queryResultRows(java.util.List<QueryResultRow> queryResultRows) {
            this.queryResultRows = queryResultRows;
            this.__explicitlySet__.add("queryResultRows");
            return this;
        }
        /** A map containing metadata or additional information. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultMetadata")
        private java.util.Map<String, Object> queryResultMetadata;

        /**
         * A map containing metadata or additional information.
         *
         * @param queryResultMetadata the value to set
         * @return this builder
         */
        public Builder queryResultMetadata(java.util.Map<String, Object> queryResultMetadata) {
            this.queryResultMetadata = queryResultMetadata;
            this.__explicitlySet__.add("queryResultMetadata");
            return this;
        }
        /** A structure that provides warnings, if any, along with the query results. */
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultWarnings")
        private java.util.List<QueryResultWarning> queryResultWarnings;

        /**
         * A structure that provides warnings, if any, along with the query results.
         *
         * @param queryResultWarnings the value to set
         * @return this builder
         */
        public Builder queryResultWarnings(java.util.List<QueryResultWarning> queryResultWarnings) {
            this.queryResultWarnings = queryResultWarnings;
            this.__explicitlySet__.add("queryResultWarnings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultResponse build() {
            QueryResultResponse model =
                    new QueryResultResponse(
                            this.queryResultMetadataSummary,
                            this.queryResultRows,
                            this.queryResultMetadata,
                            this.queryResultWarnings);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultResponse model) {
            if (model.wasPropertyExplicitlySet("queryResultMetadataSummary")) {
                this.queryResultMetadataSummary(model.getQueryResultMetadataSummary());
            }
            if (model.wasPropertyExplicitlySet("queryResultRows")) {
                this.queryResultRows(model.getQueryResultRows());
            }
            if (model.wasPropertyExplicitlySet("queryResultMetadata")) {
                this.queryResultMetadata(model.getQueryResultMetadata());
            }
            if (model.wasPropertyExplicitlySet("queryResultWarnings")) {
                this.queryResultWarnings(model.getQueryResultWarnings());
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

    @com.fasterxml.jackson.annotation.JsonProperty("queryResultMetadataSummary")
    private final QueryResultMetadataSummary queryResultMetadataSummary;

    public QueryResultMetadataSummary getQueryResultMetadataSummary() {
        return queryResultMetadataSummary;
    }

    /**
     * A collection of objects with each object representing an individual row of the query result
     * set. The total number of objects returned in this collection correspond to the total number
     * of rows returned by the actual query that is run against the queried entity.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultRows")
    private final java.util.List<QueryResultRow> queryResultRows;

    /**
     * A collection of objects with each object representing an individual row of the query result
     * set. The total number of objects returned in this collection correspond to the total number
     * of rows returned by the actual query that is run against the queried entity.
     *
     * @return the value
     */
    public java.util.List<QueryResultRow> getQueryResultRows() {
        return queryResultRows;
    }

    /** A map containing metadata or additional information. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultMetadata")
    private final java.util.Map<String, Object> queryResultMetadata;

    /**
     * A map containing metadata or additional information.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getQueryResultMetadata() {
        return queryResultMetadata;
    }

    /** A structure that provides warnings, if any, along with the query results. */
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultWarnings")
    private final java.util.List<QueryResultWarning> queryResultWarnings;

    /**
     * A structure that provides warnings, if any, along with the query results.
     *
     * @return the value
     */
    public java.util.List<QueryResultWarning> getQueryResultWarnings() {
        return queryResultWarnings;
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
        sb.append("QueryResultResponse(");
        sb.append("super=").append(super.toString());
        sb.append("queryResultMetadataSummary=")
                .append(String.valueOf(this.queryResultMetadataSummary));
        sb.append(", queryResultRows=").append(String.valueOf(this.queryResultRows));
        sb.append(", queryResultMetadata=").append(String.valueOf(this.queryResultMetadata));
        sb.append(", queryResultWarnings=").append(String.valueOf(this.queryResultWarnings));
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
                && java.util.Objects.equals(this.queryResultMetadata, other.queryResultMetadata)
                && java.util.Objects.equals(this.queryResultWarnings, other.queryResultWarnings)
                && super.equals(other);
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
                        + (this.queryResultMetadata == null
                                ? 43
                                : this.queryResultMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.queryResultWarnings == null
                                ? 43
                                : this.queryResultWarnings.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
