/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingPolicyReferentialRelationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListMaskingPolicyReferentialRelationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListMaskingPolicyReferentialRelationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the masking policy. */
    private String maskingPolicyId;

    /** The OCID of the masking policy. */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }
    /** A filter to return only items related to specific schema name. */
    private java.util.List<String> schemaName;

    /** A filter to return only items related to specific schema name. */
    public java.util.List<String> getSchemaName() {
        return schemaName;
    }
    /** A filter to return only items related to a specific object name. */
    private java.util.List<String> objectName;

    /** A filter to return only items related to a specific object name. */
    public java.util.List<String> getObjectName() {
        return objectName;
    }
    /** A filter to return only a specific column based on column name. */
    private java.util.List<String> columnName;

    /** A filter to return only a specific column based on column name. */
    public java.util.List<String> getColumnName() {
        return columnName;
    }
    /**
     * A filter to return columns based on their relationship with their parent columns. If set to
     * NONE, it returns the columns that do not have any parent. The response includes the parent
     * columns as well as the independent columns that are not in any relationship. If set to
     * APP_DEFINED, it returns all the child columns that have application-level (non-dictionary)
     * relationship with their parents. If set to DB_DEFINED, it returns all the child columns that
     * have database-level (dictionary-defined) relationship with their parents.
     */
    private java.util.List<RelationType> relationType;

    /**
     * A filter to return columns based on their relationship with their parent columns. If set to
     * NONE, it returns the columns that do not have any parent. The response includes the parent
     * columns as well as the independent columns that are not in any relationship. If set to
     * APP_DEFINED, it returns all the child columns that have application-level (non-dictionary)
     * relationship with their parents. If set to DB_DEFINED, it returns all the child columns that
     * have database-level (dictionary-defined) relationship with their parents.
     */
    public enum RelationType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),
        ;

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        RelationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RelationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RelationType: " + key);
        }
    };

    /**
     * A filter to return columns based on their relationship with their parent columns. If set to
     * NONE, it returns the columns that do not have any parent. The response includes the parent
     * columns as well as the independent columns that are not in any relationship. If set to
     * APP_DEFINED, it returns all the child columns that have application-level (non-dictionary)
     * relationship with their parents. If set to DB_DEFINED, it returns all the child columns that
     * have database-level (dictionary-defined) relationship with their parents.
     */
    public java.util.List<RelationType> getRelationType() {
        return relationType;
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
    /** The field to sort by. You can specify only one sorting parameter (sortOrder). */
    private SortBy sortBy;

    /** The field to sort by. You can specify only one sorting parameter (sortOrder). */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        RelationType("relationType"),
        SchemaName("schemaName"),
        TableName("tableName"),
        ColumnName("columnName"),
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

    /** The field to sort by. You can specify only one sorting parameter (sortOrder). */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMaskingPolicyReferentialRelationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the masking policy. */
        private String maskingPolicyId = null;

        /**
         * The OCID of the masking policy.
         *
         * @param maskingPolicyId the value to set
         * @return this builder instance
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
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

        /** A filter to return only items related to a specific object name. */
        private java.util.List<String> objectName = null;

        /**
         * A filter to return only items related to a specific object name.
         *
         * @param objectName the value to set
         * @return this builder instance
         */
        public Builder objectName(java.util.List<String> objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to a specific object name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder objectName(String singularValue) {
            return this.objectName(java.util.Arrays.asList(singularValue));
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

        /**
         * A filter to return columns based on their relationship with their parent columns. If set
         * to NONE, it returns the columns that do not have any parent. The response includes the
         * parent columns as well as the independent columns that are not in any relationship. If
         * set to APP_DEFINED, it returns all the child columns that have application-level
         * (non-dictionary) relationship with their parents. If set to DB_DEFINED, it returns all
         * the child columns that have database-level (dictionary-defined) relationship with their
         * parents.
         */
        private java.util.List<RelationType> relationType = null;

        /**
         * A filter to return columns based on their relationship with their parent columns. If set
         * to NONE, it returns the columns that do not have any parent. The response includes the
         * parent columns as well as the independent columns that are not in any relationship. If
         * set to APP_DEFINED, it returns all the child columns that have application-level
         * (non-dictionary) relationship with their parents. If set to DB_DEFINED, it returns all
         * the child columns that have database-level (dictionary-defined) relationship with their
         * parents.
         *
         * @param relationType the value to set
         * @return this builder instance
         */
        public Builder relationType(java.util.List<RelationType> relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * Singular setter. A filter to return columns based on their relationship with their parent
         * columns. If set to NONE, it returns the columns that do not have any parent. The response
         * includes the parent columns as well as the independent columns that are not in any
         * relationship. If set to APP_DEFINED, it returns all the child columns that have
         * application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED,
         * it returns all the child columns that have database-level (dictionary-defined)
         * relationship with their parents.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder relationType(RelationType singularValue) {
            return this.relationType(java.util.Arrays.asList(singularValue));
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

        /** The field to sort by. You can specify only one sorting parameter (sortOrder). */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sorting parameter (sortOrder).
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListMaskingPolicyReferentialRelationsRequest o) {
            maskingPolicyId(o.getMaskingPolicyId());
            schemaName(o.getSchemaName());
            objectName(o.getObjectName());
            columnName(o.getColumnName());
            relationType(o.getRelationType());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMaskingPolicyReferentialRelationsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMaskingPolicyReferentialRelationsRequest
         */
        public ListMaskingPolicyReferentialRelationsRequest build() {
            ListMaskingPolicyReferentialRelationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMaskingPolicyReferentialRelationsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMaskingPolicyReferentialRelationsRequest
         */
        public ListMaskingPolicyReferentialRelationsRequest buildWithoutInvocationCallback() {
            ListMaskingPolicyReferentialRelationsRequest request =
                    new ListMaskingPolicyReferentialRelationsRequest();
            request.maskingPolicyId = maskingPolicyId;
            request.schemaName = schemaName;
            request.objectName = objectName;
            request.columnName = columnName;
            request.relationType = relationType;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListMaskingPolicyReferentialRelationsRequest(maskingPolicyId, schemaName,
            // objectName, columnName, relationType, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .maskingPolicyId(maskingPolicyId)
                .schemaName(schemaName)
                .objectName(objectName)
                .columnName(columnName)
                .relationType(relationType)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(",schemaName=").append(String.valueOf(this.schemaName));
        sb.append(",objectName=").append(String.valueOf(this.objectName));
        sb.append(",columnName=").append(String.valueOf(this.columnName));
        sb.append(",relationType=").append(String.valueOf(this.relationType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMaskingPolicyReferentialRelationsRequest)) {
            return false;
        }

        ListMaskingPolicyReferentialRelationsRequest other =
                (ListMaskingPolicyReferentialRelationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.relationType, other.relationType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.relationType == null ? 43 : this.relationType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
