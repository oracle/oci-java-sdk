/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Information required to execute query on data objects. Query is given in standard SQL syntax providing flexibility
 * to form complex queries such as queries with joins and nested queries.
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
    builder = DataObjectStandardQuery.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "queryType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataObjectStandardQuery extends DataObjectQuery {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bindParams")
        private java.util.List<DataObjectBindParameter> bindParams;

        public Builder bindParams(java.util.List<DataObjectBindParameter> bindParams) {
            this.bindParams = bindParams;
            this.__explicitlySet__.add("bindParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryExecutionTimeoutInSeconds")
        private Double queryExecutionTimeoutInSeconds;

        public Builder queryExecutionTimeoutInSeconds(Double queryExecutionTimeoutInSeconds) {
            this.queryExecutionTimeoutInSeconds = queryExecutionTimeoutInSeconds;
            this.__explicitlySet__.add("queryExecutionTimeoutInSeconds");
            return this;
        }
        /**
         * SQL query statement with standard Oracle supported SQL syntax.
         * - When Warehouse (e.g: Awr hub) data objects are queried, use the actual names of underlying data objects (e.g: tables, views) in the query.
         * The same query that works through JDBC connection with the OperationsInsightsWarehouseUsers credentials will work here and vice-versa.
         * SCHEMA.VIEW syntax can also be used here.
         * - When OPSI data objects are queried, use name of the respective OPSI data object, just like how views are used in a query.
         * Identifier of the OPSI data object cannot be used in the query.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("statement")
        private String statement;

        /**
         * SQL query statement with standard Oracle supported SQL syntax.
         * - When Warehouse (e.g: Awr hub) data objects are queried, use the actual names of underlying data objects (e.g: tables, views) in the query.
         * The same query that works through JDBC connection with the OperationsInsightsWarehouseUsers credentials will work here and vice-versa.
         * SCHEMA.VIEW syntax can also be used here.
         * - When OPSI data objects are queried, use name of the respective OPSI data object, just like how views are used in a query.
         * Identifier of the OPSI data object cannot be used in the query.
         *
         * @param statement the value to set
         * @return this builder
         **/
        public Builder statement(String statement) {
            this.statement = statement;
            this.__explicitlySet__.add("statement");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFilters")
        private DataObjectQueryTimeFilters timeFilters;

        public Builder timeFilters(DataObjectQueryTimeFilters timeFilters) {
            this.timeFilters = timeFilters;
            this.__explicitlySet__.add("timeFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataObjectStandardQuery build() {
            DataObjectStandardQuery model =
                    new DataObjectStandardQuery(
                            this.bindParams,
                            this.queryExecutionTimeoutInSeconds,
                            this.statement,
                            this.timeFilters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataObjectStandardQuery model) {
            if (model.wasPropertyExplicitlySet("bindParams")) {
                this.bindParams(model.getBindParams());
            }
            if (model.wasPropertyExplicitlySet("queryExecutionTimeoutInSeconds")) {
                this.queryExecutionTimeoutInSeconds(model.getQueryExecutionTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("statement")) {
                this.statement(model.getStatement());
            }
            if (model.wasPropertyExplicitlySet("timeFilters")) {
                this.timeFilters(model.getTimeFilters());
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

    @Deprecated
    public DataObjectStandardQuery(
            java.util.List<DataObjectBindParameter> bindParams,
            Double queryExecutionTimeoutInSeconds,
            String statement,
            DataObjectQueryTimeFilters timeFilters) {
        super(bindParams, queryExecutionTimeoutInSeconds);
        this.statement = statement;
        this.timeFilters = timeFilters;
    }

    /**
     * SQL query statement with standard Oracle supported SQL syntax.
     * - When Warehouse (e.g: Awr hub) data objects are queried, use the actual names of underlying data objects (e.g: tables, views) in the query.
     * The same query that works through JDBC connection with the OperationsInsightsWarehouseUsers credentials will work here and vice-versa.
     * SCHEMA.VIEW syntax can also be used here.
     * - When OPSI data objects are queried, use name of the respective OPSI data object, just like how views are used in a query.
     * Identifier of the OPSI data object cannot be used in the query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statement")
    private final String statement;

    /**
     * SQL query statement with standard Oracle supported SQL syntax.
     * - When Warehouse (e.g: Awr hub) data objects are queried, use the actual names of underlying data objects (e.g: tables, views) in the query.
     * The same query that works through JDBC connection with the OperationsInsightsWarehouseUsers credentials will work here and vice-versa.
     * SCHEMA.VIEW syntax can also be used here.
     * - When OPSI data objects are queried, use name of the respective OPSI data object, just like how views are used in a query.
     * Identifier of the OPSI data object cannot be used in the query.
     *
     * @return the value
     **/
    public String getStatement() {
        return statement;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("timeFilters")
    private final DataObjectQueryTimeFilters timeFilters;

    public DataObjectQueryTimeFilters getTimeFilters() {
        return timeFilters;
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
        sb.append("DataObjectStandardQuery(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", statement=").append(String.valueOf(this.statement));
        sb.append(", timeFilters=").append(String.valueOf(this.timeFilters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataObjectStandardQuery)) {
            return false;
        }

        DataObjectStandardQuery other = (DataObjectStandardQuery) o;
        return java.util.Objects.equals(this.statement, other.statement)
                && java.util.Objects.equals(this.timeFilters, other.timeFilters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.statement == null ? 43 : this.statement.hashCode());
        result = (result * PRIME) + (this.timeFilters == null ? 43 : this.timeFilters.hashCode());
        return result;
    }
}
