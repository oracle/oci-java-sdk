/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Object that represents a single row of the query result.  It contains the queryResultRowData object that contains the actual data
 * represented by the elements of the query result row, and a queryResultRowMetadata object that contains the metadata about the data contained in
 * the query result row.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueryResultRow.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QueryResultRow {
    @Deprecated
    @java.beans.ConstructorProperties({"queryResultRowData", "queryResultRowMetadata"})
    public QueryResultRow(
            java.util.Map<String, Object> queryResultRowData,
            java.util.Map<String, Object> queryResultRowMetadata) {
        super();
        this.queryResultRowData = queryResultRowData;
        this.queryResultRowMetadata = queryResultRowMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowData")
        private java.util.Map<String, Object> queryResultRowData;

        public Builder queryResultRowData(java.util.Map<String, Object> queryResultRowData) {
            this.queryResultRowData = queryResultRowData;
            this.__explicitlySet__.add("queryResultRowData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowMetadata")
        private java.util.Map<String, Object> queryResultRowMetadata;

        public Builder queryResultRowMetadata(
                java.util.Map<String, Object> queryResultRowMetadata) {
            this.queryResultRowMetadata = queryResultRowMetadata;
            this.__explicitlySet__.add("queryResultRowMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryResultRow build() {
            QueryResultRow __instance__ =
                    new QueryResultRow(queryResultRowData, queryResultRowMetadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryResultRow o) {
            Builder copiedBuilder =
                    queryResultRowData(o.getQueryResultRowData())
                            .queryResultRowMetadata(o.getQueryResultRowMetadata());

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
     * A map containing the actual data represented by a single row of the query result.
     * The key is the column name or attribute specified in the show clause, or an aggregate function in the show clause.
     * The value is the actual value of that attribute or aggregate function of the corresponding single row of the query result set.
     * If an alias name is specified for an attribute or an aggregate function, then the key will be the alias name specified in the show
     * clause.  If an alias name is not specified for the group by aggregate function in the show clause, then the corresponding key
     * will be the appropriate aggregate_function_name_column_name (For example: count(traces) will be keyed as count_traces).  The datatype of the value
     * is presented in the queryResultRowTypeSummaries list in the queryResultMetadata structure, where the i-th queryResultRowTypeSummary object
     * represents the datatype of the i-th value when this map is iterated in order.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowData")
    private final java.util.Map<String, Object> queryResultRowData;

    public java.util.Map<String, Object> getQueryResultRowData() {
        return queryResultRowData;
    }

    /**
     * A map containing metadata or add-on data for the data presented in the queryResultRowData map.  Data required to present drill down
     * information from the queryResultRowData is presented as key-value pairs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("queryResultRowMetadata")
    private final java.util.Map<String, Object> queryResultRowMetadata;

    public java.util.Map<String, Object> getQueryResultRowMetadata() {
        return queryResultRowMetadata;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QueryResultRow(");
        sb.append("queryResultRowData=").append(String.valueOf(this.queryResultRowData));
        sb.append(", queryResultRowMetadata=").append(String.valueOf(this.queryResultRowMetadata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueryResultRow)) {
            return false;
        }

        QueryResultRow other = (QueryResultRow) o;
        return java.util.Objects.equals(this.queryResultRowData, other.queryResultRowData)
                && java.util.Objects.equals(
                        this.queryResultRowMetadata, other.queryResultRowMetadata)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.queryResultRowData == null
                                ? 43
                                : this.queryResultRowData.hashCode());
        result =
                (result * PRIME)
                        + (this.queryResultRowMetadata == null
                                ? 43
                                : this.queryResultRowMetadata.hashCode());
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
