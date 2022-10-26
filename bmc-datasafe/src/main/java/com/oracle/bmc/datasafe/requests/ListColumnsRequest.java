/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListColumnsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListColumnsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListColumnsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the Data Safe target database. */
    private String targetDatabaseId;

    /** The OCID of the Data Safe target database. */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** A filter to return only items related to specific schema name. */
    private java.util.List<String> schemaName;

    /** A filter to return only items related to specific schema name. */
    public java.util.List<String> getSchemaName() {
        return schemaName;
    }
    /** A filter to return only items related to specific table name. */
    private java.util.List<String> tableName;

    /** A filter to return only items related to specific table name. */
    public java.util.List<String> getTableName() {
        return tableName;
    }
    /** A filter to return only a specific column based on column name. */
    private java.util.List<String> columnName;

    /** A filter to return only a specific column based on column name. */
    public java.util.List<String> getColumnName() {
        return columnName;
    }
    /** A filter to return only items related to specific datatype. */
    private java.util.List<String> datatype;

    /** A filter to return only items related to specific datatype. */
    public java.util.List<String> getDatatype() {
        return datatype;
    }
    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The field used for sorting. Only one sorting order (sortOrder) can be specified. */
    private SortBy sortBy;

    /** The field used for sorting. Only one sorting order (sortOrder) can be specified. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Schemaname("SCHEMANAME"),
        Tablename("TABLENAME"),
        Columnname("COLUMNNAME"),
        Datatype("DATATYPE"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /** The field used for sorting. Only one sorting order (sortOrder) can be specified. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** A filter to return only items if schema name contains a specific string. */
    private String schemaNameContains;

    /** A filter to return only items if schema name contains a specific string. */
    public String getSchemaNameContains() {
        return schemaNameContains;
    }
    /** A filter to return only items if table name contains a specific string. */
    private String tableNameContains;

    /** A filter to return only items if table name contains a specific string. */
    public String getTableNameContains() {
        return tableNameContains;
    }
    /** A filter to return only items if column name contains a specific string. */
    private String columnNameContains;

    /** A filter to return only items if column name contains a specific string. */
    public String getColumnNameContains() {
        return columnNameContains;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListColumnsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Data Safe target database. */
        private String targetDatabaseId = null;

        /**
         * The OCID of the Data Safe target database.
         *
         * @param targetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** A filter to return only items related to specific schema name. */
        private java.util.List<String> schemaName = null;

        /**
         * A filter to return only items related to specific schema name.
         *
         * @param schemaName the value to set
         * @return this builder instance
         */
        public Builder schemaName(java.util.List<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to specific schema name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder schemaName(String singularValue) {
            return this.schemaName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only items related to specific table name. */
        private java.util.List<String> tableName = null;

        /**
         * A filter to return only items related to specific table name.
         *
         * @param tableName the value to set
         * @return this builder instance
         */
        public Builder tableName(java.util.List<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to specific table name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder tableName(String singularValue) {
            return this.tableName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only a specific column based on column name. */
        private java.util.List<String> columnName = null;

        /**
         * A filter to return only a specific column based on column name.
         *
         * @param columnName the value to set
         * @return this builder instance
         */
        public Builder columnName(java.util.List<String> columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * Singular setter. A filter to return only a specific column based on column name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder columnName(String singularValue) {
            return this.columnName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only items related to specific datatype. */
        private java.util.List<String> datatype = null;

        /**
         * A filter to return only items related to specific datatype.
         *
         * @param datatype the value to set
         * @return this builder instance
         */
        public Builder datatype(java.util.List<String> datatype) {
            this.datatype = datatype;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to specific datatype.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder datatype(String singularValue) {
            return this.datatype(java.util.Arrays.asList(singularValue));
        }

        /** The sort order to use, either ascending (ASC) or descending (DESC). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The field used for sorting. Only one sorting order (sortOrder) can be specified. */
        private SortBy sortBy = null;

        /**
         * The field used for sorting. Only one sorting order (sortOrder) can be specified.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** A filter to return only items if schema name contains a specific string. */
        private String schemaNameContains = null;

        /**
         * A filter to return only items if schema name contains a specific string.
         *
         * @param schemaNameContains the value to set
         * @return this builder instance
         */
        public Builder schemaNameContains(String schemaNameContains) {
            this.schemaNameContains = schemaNameContains;
            return this;
        }

        /** A filter to return only items if table name contains a specific string. */
        private String tableNameContains = null;

        /**
         * A filter to return only items if table name contains a specific string.
         *
         * @param tableNameContains the value to set
         * @return this builder instance
         */
        public Builder tableNameContains(String tableNameContains) {
            this.tableNameContains = tableNameContains;
            return this;
        }

        /** A filter to return only items if column name contains a specific string. */
        private String columnNameContains = null;

        /**
         * A filter to return only items if column name contains a specific string.
         *
         * @param columnNameContains the value to set
         * @return this builder instance
         */
        public Builder columnNameContains(String columnNameContains) {
            this.columnNameContains = columnNameContains;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListColumnsRequest o) {
            targetDatabaseId(o.getTargetDatabaseId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            schemaName(o.getSchemaName());
            tableName(o.getTableName());
            columnName(o.getColumnName());
            datatype(o.getDatatype());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            schemaNameContains(o.getSchemaNameContains());
            tableNameContains(o.getTableNameContains());
            columnNameContains(o.getColumnNameContains());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListColumnsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListColumnsRequest
         */
        public ListColumnsRequest build() {
            ListColumnsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListColumnsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListColumnsRequest
         */
        public ListColumnsRequest buildWithoutInvocationCallback() {
            ListColumnsRequest request = new ListColumnsRequest();
            request.targetDatabaseId = targetDatabaseId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.schemaName = schemaName;
            request.tableName = tableName;
            request.columnName = columnName;
            request.datatype = datatype;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.schemaNameContains = schemaNameContains;
            request.tableNameContains = tableNameContains;
            request.columnNameContains = columnNameContains;
            return request;
            // new ListColumnsRequest(targetDatabaseId, opcRequestId, limit, page, schemaName,
            // tableName, columnName, datatype, sortOrder, sortBy, schemaNameContains,
            // tableNameContains, columnNameContains);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetDatabaseId(targetDatabaseId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .schemaName(schemaName)
                .tableName(tableName)
                .columnName(columnName)
                .datatype(datatype)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .schemaNameContains(schemaNameContains)
                .tableNameContains(tableNameContains)
                .columnNameContains(columnNameContains);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",schemaName=").append(String.valueOf(this.schemaName));
        sb.append(",tableName=").append(String.valueOf(this.tableName));
        sb.append(",columnName=").append(String.valueOf(this.columnName));
        sb.append(",datatype=").append(String.valueOf(this.datatype));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",schemaNameContains=").append(String.valueOf(this.schemaNameContains));
        sb.append(",tableNameContains=").append(String.valueOf(this.tableNameContains));
        sb.append(",columnNameContains=").append(String.valueOf(this.columnNameContains));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListColumnsRequest)) {
            return false;
        }

        ListColumnsRequest other = (ListColumnsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.tableName, other.tableName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.datatype, other.datatype)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.schemaNameContains, other.schemaNameContains)
                && java.util.Objects.equals(this.tableNameContains, other.tableNameContains)
                && java.util.Objects.equals(this.columnNameContains, other.columnNameContains);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.tableName == null ? 43 : this.tableName.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.datatype == null ? 43 : this.datatype.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaNameContains == null
                                ? 43
                                : this.schemaNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.tableNameContains == null ? 43 : this.tableNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.columnNameContains == null
                                ? 43
                                : this.columnNameContains.hashCode());
        return result;
    }
}
