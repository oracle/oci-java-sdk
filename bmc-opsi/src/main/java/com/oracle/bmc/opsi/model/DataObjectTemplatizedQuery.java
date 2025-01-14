/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Information required in a structured template to form and execute query on a data object. <br>
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
        builder = DataObjectTemplatizedQuery.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "queryType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataObjectTemplatizedQuery extends DataObjectQuery {
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
         * List of items to be added into the SELECT clause of the query; items will be added with
         * comma separation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("selectList")
        private java.util.List<String> selectList;

        /**
         * List of items to be added into the SELECT clause of the query; items will be added with
         * comma separation.
         *
         * @param selectList the value to set
         * @return this builder
         */
        public Builder selectList(java.util.List<String> selectList) {
            this.selectList = selectList;
            this.__explicitlySet__.add("selectList");
            return this;
        }
        /**
         * Unique data object name that will be added into the FROM clause of the query, just like a
         * view name in FROM clause. - Use actual name of the data objects (e.g: tables, views) in
         * case of Warehouse (e.g: Awr hub) data objects query. SCHEMA.VIEW name syntax can also be
         * used here. e.g: SYS.DBA_HIST_SNAPSHOT or DBA_HIST_SNAPSHOT - Use name of the data object
         * (e.g: SQL_STATS_DO) in case of OPSI data objects. Identifier of the OPSI data object
         * cannot be used here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fromClause")
        private String fromClause;

        /**
         * Unique data object name that will be added into the FROM clause of the query, just like a
         * view name in FROM clause. - Use actual name of the data objects (e.g: tables, views) in
         * case of Warehouse (e.g: Awr hub) data objects query. SCHEMA.VIEW name syntax can also be
         * used here. e.g: SYS.DBA_HIST_SNAPSHOT or DBA_HIST_SNAPSHOT - Use name of the data object
         * (e.g: SQL_STATS_DO) in case of OPSI data objects. Identifier of the OPSI data object
         * cannot be used here.
         *
         * @param fromClause the value to set
         * @return this builder
         */
        public Builder fromClause(String fromClause) {
            this.fromClause = fromClause;
            this.__explicitlySet__.add("fromClause");
            return this;
        }
        /**
         * List of items to be added into the WHERE clause of the query; items will be added with
         * AND separation. Item can contain a single condition or multiple conditions. Single
         * condition e.g: "optimizer_mode='mode1'" Multiple conditions e.g: (module='module1' OR
         * module='module2')
         */
        @com.fasterxml.jackson.annotation.JsonProperty("whereConditionsList")
        private java.util.List<String> whereConditionsList;

        /**
         * List of items to be added into the WHERE clause of the query; items will be added with
         * AND separation. Item can contain a single condition or multiple conditions. Single
         * condition e.g: "optimizer_mode='mode1'" Multiple conditions e.g: (module='module1' OR
         * module='module2')
         *
         * @param whereConditionsList the value to set
         * @return this builder
         */
        public Builder whereConditionsList(java.util.List<String> whereConditionsList) {
            this.whereConditionsList = whereConditionsList;
            this.__explicitlySet__.add("whereConditionsList");
            return this;
        }
        /**
         * List of items to be added into the GROUP BY clause of the query; items will be added with
         * comma separation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupByList")
        private java.util.List<String> groupByList;

        /**
         * List of items to be added into the GROUP BY clause of the query; items will be added with
         * comma separation.
         *
         * @param groupByList the value to set
         * @return this builder
         */
        public Builder groupByList(java.util.List<String> groupByList) {
            this.groupByList = groupByList;
            this.__explicitlySet__.add("groupByList");
            return this;
        }
        /**
         * List of items to be added into the HAVING clause of the query; items will be added with
         * AND separation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("havingConditionsList")
        private java.util.List<String> havingConditionsList;

        /**
         * List of items to be added into the HAVING clause of the query; items will be added with
         * AND separation.
         *
         * @param havingConditionsList the value to set
         * @return this builder
         */
        public Builder havingConditionsList(java.util.List<String> havingConditionsList) {
            this.havingConditionsList = havingConditionsList;
            this.__explicitlySet__.add("havingConditionsList");
            return this;
        }
        /**
         * List of items to be added into the ORDER BY clause of the query; items will be added with
         * comma separation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("orderByList")
        private java.util.List<String> orderByList;

        /**
         * List of items to be added into the ORDER BY clause of the query; items will be added with
         * comma separation.
         *
         * @param orderByList the value to set
         * @return this builder
         */
        public Builder orderByList(java.util.List<String> orderByList) {
            this.orderByList = orderByList;
            this.__explicitlySet__.add("orderByList");
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

        public DataObjectTemplatizedQuery build() {
            DataObjectTemplatizedQuery model =
                    new DataObjectTemplatizedQuery(
                            this.bindParams,
                            this.queryExecutionTimeoutInSeconds,
                            this.selectList,
                            this.fromClause,
                            this.whereConditionsList,
                            this.groupByList,
                            this.havingConditionsList,
                            this.orderByList,
                            this.timeFilters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataObjectTemplatizedQuery model) {
            if (model.wasPropertyExplicitlySet("bindParams")) {
                this.bindParams(model.getBindParams());
            }
            if (model.wasPropertyExplicitlySet("queryExecutionTimeoutInSeconds")) {
                this.queryExecutionTimeoutInSeconds(model.getQueryExecutionTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("selectList")) {
                this.selectList(model.getSelectList());
            }
            if (model.wasPropertyExplicitlySet("fromClause")) {
                this.fromClause(model.getFromClause());
            }
            if (model.wasPropertyExplicitlySet("whereConditionsList")) {
                this.whereConditionsList(model.getWhereConditionsList());
            }
            if (model.wasPropertyExplicitlySet("groupByList")) {
                this.groupByList(model.getGroupByList());
            }
            if (model.wasPropertyExplicitlySet("havingConditionsList")) {
                this.havingConditionsList(model.getHavingConditionsList());
            }
            if (model.wasPropertyExplicitlySet("orderByList")) {
                this.orderByList(model.getOrderByList());
            }
            if (model.wasPropertyExplicitlySet("timeFilters")) {
                this.timeFilters(model.getTimeFilters());
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

    @Deprecated
    public DataObjectTemplatizedQuery(
            java.util.List<DataObjectBindParameter> bindParams,
            Double queryExecutionTimeoutInSeconds,
            java.util.List<String> selectList,
            String fromClause,
            java.util.List<String> whereConditionsList,
            java.util.List<String> groupByList,
            java.util.List<String> havingConditionsList,
            java.util.List<String> orderByList,
            DataObjectQueryTimeFilters timeFilters) {
        super(bindParams, queryExecutionTimeoutInSeconds);
        this.selectList = selectList;
        this.fromClause = fromClause;
        this.whereConditionsList = whereConditionsList;
        this.groupByList = groupByList;
        this.havingConditionsList = havingConditionsList;
        this.orderByList = orderByList;
        this.timeFilters = timeFilters;
    }

    /**
     * List of items to be added into the SELECT clause of the query; items will be added with comma
     * separation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selectList")
    private final java.util.List<String> selectList;

    /**
     * List of items to be added into the SELECT clause of the query; items will be added with comma
     * separation.
     *
     * @return the value
     */
    public java.util.List<String> getSelectList() {
        return selectList;
    }

    /**
     * Unique data object name that will be added into the FROM clause of the query, just like a
     * view name in FROM clause. - Use actual name of the data objects (e.g: tables, views) in case
     * of Warehouse (e.g: Awr hub) data objects query. SCHEMA.VIEW name syntax can also be used
     * here. e.g: SYS.DBA_HIST_SNAPSHOT or DBA_HIST_SNAPSHOT - Use name of the data object (e.g:
     * SQL_STATS_DO) in case of OPSI data objects. Identifier of the OPSI data object cannot be used
     * here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fromClause")
    private final String fromClause;

    /**
     * Unique data object name that will be added into the FROM clause of the query, just like a
     * view name in FROM clause. - Use actual name of the data objects (e.g: tables, views) in case
     * of Warehouse (e.g: Awr hub) data objects query. SCHEMA.VIEW name syntax can also be used
     * here. e.g: SYS.DBA_HIST_SNAPSHOT or DBA_HIST_SNAPSHOT - Use name of the data object (e.g:
     * SQL_STATS_DO) in case of OPSI data objects. Identifier of the OPSI data object cannot be used
     * here.
     *
     * @return the value
     */
    public String getFromClause() {
        return fromClause;
    }

    /**
     * List of items to be added into the WHERE clause of the query; items will be added with AND
     * separation. Item can contain a single condition or multiple conditions. Single condition e.g:
     * "optimizer_mode='mode1'" Multiple conditions e.g: (module='module1' OR module='module2')
     */
    @com.fasterxml.jackson.annotation.JsonProperty("whereConditionsList")
    private final java.util.List<String> whereConditionsList;

    /**
     * List of items to be added into the WHERE clause of the query; items will be added with AND
     * separation. Item can contain a single condition or multiple conditions. Single condition e.g:
     * "optimizer_mode='mode1'" Multiple conditions e.g: (module='module1' OR module='module2')
     *
     * @return the value
     */
    public java.util.List<String> getWhereConditionsList() {
        return whereConditionsList;
    }

    /**
     * List of items to be added into the GROUP BY clause of the query; items will be added with
     * comma separation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupByList")
    private final java.util.List<String> groupByList;

    /**
     * List of items to be added into the GROUP BY clause of the query; items will be added with
     * comma separation.
     *
     * @return the value
     */
    public java.util.List<String> getGroupByList() {
        return groupByList;
    }

    /**
     * List of items to be added into the HAVING clause of the query; items will be added with AND
     * separation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("havingConditionsList")
    private final java.util.List<String> havingConditionsList;

    /**
     * List of items to be added into the HAVING clause of the query; items will be added with AND
     * separation.
     *
     * @return the value
     */
    public java.util.List<String> getHavingConditionsList() {
        return havingConditionsList;
    }

    /**
     * List of items to be added into the ORDER BY clause of the query; items will be added with
     * comma separation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderByList")
    private final java.util.List<String> orderByList;

    /**
     * List of items to be added into the ORDER BY clause of the query; items will be added with
     * comma separation.
     *
     * @return the value
     */
    public java.util.List<String> getOrderByList() {
        return orderByList;
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
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DataObjectTemplatizedQuery(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", selectList=").append(String.valueOf(this.selectList));
        sb.append(", fromClause=").append(String.valueOf(this.fromClause));
        sb.append(", whereConditionsList=").append(String.valueOf(this.whereConditionsList));
        sb.append(", groupByList=").append(String.valueOf(this.groupByList));
        sb.append(", havingConditionsList=").append(String.valueOf(this.havingConditionsList));
        sb.append(", orderByList=").append(String.valueOf(this.orderByList));
        sb.append(", timeFilters=").append(String.valueOf(this.timeFilters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataObjectTemplatizedQuery)) {
            return false;
        }

        DataObjectTemplatizedQuery other = (DataObjectTemplatizedQuery) o;
        return java.util.Objects.equals(this.selectList, other.selectList)
                && java.util.Objects.equals(this.fromClause, other.fromClause)
                && java.util.Objects.equals(this.whereConditionsList, other.whereConditionsList)
                && java.util.Objects.equals(this.groupByList, other.groupByList)
                && java.util.Objects.equals(this.havingConditionsList, other.havingConditionsList)
                && java.util.Objects.equals(this.orderByList, other.orderByList)
                && java.util.Objects.equals(this.timeFilters, other.timeFilters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.selectList == null ? 43 : this.selectList.hashCode());
        result = (result * PRIME) + (this.fromClause == null ? 43 : this.fromClause.hashCode());
        result =
                (result * PRIME)
                        + (this.whereConditionsList == null
                                ? 43
                                : this.whereConditionsList.hashCode());
        result = (result * PRIME) + (this.groupByList == null ? 43 : this.groupByList.hashCode());
        result =
                (result * PRIME)
                        + (this.havingConditionsList == null
                                ? 43
                                : this.havingConditionsList.hashCode());
        result = (result * PRIME) + (this.orderByList == null ? 43 : this.orderByList.hashCode());
        result = (result * PRIME) + (this.timeFilters == null ? 43 : this.timeFilters.hashCode());
        return result;
    }
}
