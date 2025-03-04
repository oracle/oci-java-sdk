/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListPublishedObjectsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListPublishedObjectsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class ListPublishedObjectsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /** The application key. */
    private String applicationKey;

    /** The application key. */
    public String getApplicationKey() {
        return applicationKey;
    }
    /** Specifies the fields to get for an object. */
    private java.util.List<String> fields;

    /** Specifies the fields to get for an object. */
    public java.util.List<String> getFields() {
        return fields;
    }
    /** Used to filter by the name of the object. */
    private String name;

    /** Used to filter by the name of the object. */
    public String getName() {
        return name;
    }
    /** This parameter can be used to filter objects by the names starting with the given value. */
    private String nameStartsWith;

    /** This parameter can be used to filter objects by the names starting with the given value. */
    public String getNameStartsWith() {
        return nameStartsWith;
    }
    /**
     * This parameter can be used to filter objects by the names that match partially or fully with
     * the given value.
     */
    private String nameContains;

    /**
     * This parameter can be used to filter objects by the names that match partially or fully with
     * the given value.
     */
    public String getNameContains() {
        return nameContains;
    }
    /** Used to filter by the identifier of the published object. */
    private java.util.List<String> identifier;

    /** Used to filter by the identifier of the published object. */
    public java.util.List<String> getIdentifier() {
        return identifier;
    }
    /**
     * Used to filter by the object type of the object. It can be suffixed with an optional filter
     * operator InSubtree. For Data Integration APIs, a filter based on type Task is used.
     */
    private java.util.List<String> type;

    /**
     * Used to filter by the object type of the object. It can be suffixed with an optional filter
     * operator InSubtree. For Data Integration APIs, a filter based on type Task is used.
     */
    public java.util.List<String> getType() {
        return type;
    }
    /**
     * Used in association with type parameter. If value is true, then type all sub types of the
     * given type parameter is considered. If value is false, then sub types are not considered.
     * Default is false.
     */
    private String typeInSubtree;

    /**
     * Used in association with type parameter. If value is true, then type all sub types of the
     * given type parameter is considered. If value is false, then sub types are not considered.
     * Default is false.
     */
    public String getTypeInSubtree() {
        return typeInSubtree;
    }
    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List}
     * call. See [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List}
     * call. See [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code
     * opc-prev-page} response header from the previous {@code List} call. See [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code
     * opc-prev-page} response header from the previous {@code List} call. See [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    private SortOrder sortOrder;

    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
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

    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    private SortBy sortBy;

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("TIME_CREATED"),
        DisplayName("DISPLAY_NAME"),
        TimeUpdated("TIME_UPDATED"),
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

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListPublishedObjectsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The workspace ID. */
        private String workspaceId = null;

        /**
         * The workspace ID.
         *
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /** The application key. */
        private String applicationKey = null;

        /**
         * The application key.
         *
         * @param applicationKey the value to set
         * @return this builder instance
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }

        /** Specifies the fields to get for an object. */
        private java.util.List<String> fields = null;

        /**
         * Specifies the fields to get for an object.
         *
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to get for an object.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(String singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /** Used to filter by the name of the object. */
        private String name = null;

        /**
         * Used to filter by the name of the object.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * This parameter can be used to filter objects by the names starting with the given value.
         */
        private String nameStartsWith = null;

        /**
         * This parameter can be used to filter objects by the names starting with the given value.
         *
         * @param nameStartsWith the value to set
         * @return this builder instance
         */
        public Builder nameStartsWith(String nameStartsWith) {
            this.nameStartsWith = nameStartsWith;
            return this;
        }

        /**
         * This parameter can be used to filter objects by the names that match partially or fully
         * with the given value.
         */
        private String nameContains = null;

        /**
         * This parameter can be used to filter objects by the names that match partially or fully
         * with the given value.
         *
         * @param nameContains the value to set
         * @return this builder instance
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            return this;
        }

        /** Used to filter by the identifier of the published object. */
        private java.util.List<String> identifier = null;

        /**
         * Used to filter by the identifier of the published object.
         *
         * @param identifier the value to set
         * @return this builder instance
         */
        public Builder identifier(java.util.List<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Singular setter. Used to filter by the identifier of the published object.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder identifier(String singularValue) {
            return this.identifier(java.util.Arrays.asList(singularValue));
        }

        /**
         * Used to filter by the object type of the object. It can be suffixed with an optional
         * filter operator InSubtree. For Data Integration APIs, a filter based on type Task is
         * used.
         */
        private java.util.List<String> type = null;

        /**
         * Used to filter by the object type of the object. It can be suffixed with an optional
         * filter operator InSubtree. For Data Integration APIs, a filter based on type Task is
         * used.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(java.util.List<String> type) {
            this.type = type;
            return this;
        }

        /**
         * Singular setter. Used to filter by the object type of the object. It can be suffixed with
         * an optional filter operator InSubtree. For Data Integration APIs, a filter based on type
         * Task is used.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder type(String singularValue) {
            return this.type(java.util.Arrays.asList(singularValue));
        }

        /**
         * Used in association with type parameter. If value is true, then type all sub types of the
         * given type parameter is considered. If value is false, then sub types are not considered.
         * Default is false.
         */
        private String typeInSubtree = null;

        /**
         * Used in association with type parameter. If value is true, then type all sub types of the
         * given type parameter is considered. If value is false, then sub types are not considered.
         * Default is false.
         *
         * @param typeInSubtree the value to set
         * @return this builder instance
         */
        public Builder typeInSubtree(String typeInSubtree) {
            this.typeInSubtree = typeInSubtree;
            return this;
        }

        /**
         * Sets the maximum number of results per page, or items to return in a paginated {@code
         * List} call. See [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * Sets the maximum number of results per page, or items to return in a paginated {@code
         * List} call. See [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the
         * {@code opc-prev-page} response header from the previous {@code List} call. See [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the
         * {@code opc-prev-page} response header from the previous {@code List} call. See [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
         * fields, results are shown in descending order. All other fields default to ascending
         * order. Sorting related parameters are ignored when parameter {@code query} is present
         * (search operation and sorting order is by relevance score in descending order).
         */
        private SortBy sortBy = null;

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
         * fields, results are shown in descending order. All other fields default to ascending
         * order. Sorting related parameters are ignored when parameter {@code query} is present
         * (search operation and sorting order is by relevance score in descending order).
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(ListPublishedObjectsRequest o) {
            workspaceId(o.getWorkspaceId());
            applicationKey(o.getApplicationKey());
            fields(o.getFields());
            name(o.getName());
            nameStartsWith(o.getNameStartsWith());
            nameContains(o.getNameContains());
            identifier(o.getIdentifier());
            type(o.getType());
            typeInSubtree(o.getTypeInSubtree());
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
         * Build the instance of ListPublishedObjectsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListPublishedObjectsRequest
         */
        public ListPublishedObjectsRequest build() {
            ListPublishedObjectsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListPublishedObjectsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListPublishedObjectsRequest
         */
        public ListPublishedObjectsRequest buildWithoutInvocationCallback() {
            ListPublishedObjectsRequest request = new ListPublishedObjectsRequest();
            request.workspaceId = workspaceId;
            request.applicationKey = applicationKey;
            request.fields = fields;
            request.name = name;
            request.nameStartsWith = nameStartsWith;
            request.nameContains = nameContains;
            request.identifier = identifier;
            request.type = type;
            request.typeInSubtree = typeInSubtree;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListPublishedObjectsRequest(workspaceId, applicationKey, fields, name,
            // nameStartsWith, nameContains, identifier, type, typeInSubtree, limit, page,
            // sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .applicationKey(applicationKey)
                .fields(fields)
                .name(name)
                .nameStartsWith(nameStartsWith)
                .nameContains(nameContains)
                .identifier(identifier)
                .type(type)
                .typeInSubtree(typeInSubtree)
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",nameStartsWith=").append(String.valueOf(this.nameStartsWith));
        sb.append(",nameContains=").append(String.valueOf(this.nameContains));
        sb.append(",identifier=").append(String.valueOf(this.identifier));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",typeInSubtree=").append(String.valueOf(this.typeInSubtree));
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
        if (!(o instanceof ListPublishedObjectsRequest)) {
            return false;
        }

        ListPublishedObjectsRequest other = (ListPublishedObjectsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.nameStartsWith, other.nameStartsWith)
                && java.util.Objects.equals(this.nameContains, other.nameContains)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.typeInSubtree, other.typeInSubtree)
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
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.nameStartsWith == null ? 43 : this.nameStartsWith.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.typeInSubtree == null ? 43 : this.typeInSubtree.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
