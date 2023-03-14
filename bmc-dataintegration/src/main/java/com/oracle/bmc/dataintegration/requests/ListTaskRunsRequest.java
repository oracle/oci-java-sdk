/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListTaskRunsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListTaskRunsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class ListTaskRunsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The workspace ID.
     */
    private String workspaceId;

    /**
     * The workspace ID.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * The application key.
     */
    private String applicationKey;

    /**
     * The application key.
     */
    public String getApplicationKey() {
        return applicationKey;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Used to filter by the key of the object.
     */
    private java.util.List<String> key;

    /**
     * Used to filter by the key of the object.
     */
    public java.util.List<String> getKey() {
        return key;
    }
    /**
     * Used to filter by the project or the folder object.
     *
     */
    private String aggregatorKey;

    /**
     * Used to filter by the project or the folder object.
     *
     */
    public String getAggregatorKey() {
        return aggregatorKey;
    }
    /**
     * Specifies the fields to get for an object.
     */
    private java.util.List<String> fields;

    /**
     * Specifies the fields to get for an object.
     */
    public java.util.List<String> getFields() {
        return fields;
    }
    /**
     * Used to filter by the name of the object.
     */
    private String name;

    /**
     * Used to filter by the name of the object.
     */
    public String getName() {
        return name;
    }
    /**
     * Used to filter by the identifier of the object.
     */
    private java.util.List<String> identifier;

    /**
     * Used to filter by the identifier of the object.
     */
    public java.util.List<String> getIdentifier() {
        return identifier;
    }
    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code opc-prev-page} response header from the previous {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code opc-prev-page} response header from the previous {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
     */
    private SortOrder sortOrder;

    /**
     * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
     **/
    public enum SortOrder {
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

    /**
     * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order is by relevance score in descending order).
     */
    private SortBy sortBy;

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order is by relevance score in descending order).
     **/
    public enum SortBy {
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
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order is by relevance score in descending order).
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * This filter parameter can be used to filter by model specific queryable fields of the object <br><br><B>Examples:-</B><br> <ul> <li><B>?filter=status eq Failed</B> returns all objects that have a status field with value Failed</li> </ul>
     */
    private java.util.List<String> filter;

    /**
     * This filter parameter can be used to filter by model specific queryable fields of the object <br><br><B>Examples:-</B><br> <ul> <li><B>?filter=status eq Failed</B> returns all objects that have a status field with value Failed</li> </ul>
     */
    public java.util.List<String> getFilter() {
        return filter;
    }
    /**
     * This parameter can be used to filter objects by the names starting with the given value.
     */
    private String nameStartsWith;

    /**
     * This parameter can be used to filter objects by the names starting with the given value.
     */
    public String getNameStartsWith() {
        return nameStartsWith;
    }
    /**
     * This parameter can be used to filter objects by the names that match partially or fully with the given value.
     */
    private String nameContains;

    /**
     * This parameter can be used to filter objects by the names that match partially or fully with the given value.
     */
    public String getNameContains() {
        return nameContains;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListTaskRunsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The workspace ID.
         */
        private String workspaceId = null;

        /**
         * The workspace ID.
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The application key.
         */
        private String applicationKey = null;

        /**
         * The application key.
         * @param applicationKey the value to set
         * @return this builder instance
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Used to filter by the key of the object.
         */
        private java.util.List<String> key = null;

        /**
         * Used to filter by the key of the object.
         * @param key the value to set
         * @return this builder instance
         */
        public Builder key(java.util.List<String> key) {
            this.key = key;
            return this;
        }

        /**
         * Singular setter. Used to filter by the key of the object.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder key(String singularValue) {
            return this.key(java.util.Arrays.asList(singularValue));
        }

        /**
         * Used to filter by the project or the folder object.
         *
         */
        private String aggregatorKey = null;

        /**
         * Used to filter by the project or the folder object.
         *
         * @param aggregatorKey the value to set
         * @return this builder instance
         */
        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            return this;
        }

        /**
         * Specifies the fields to get for an object.
         */
        private java.util.List<String> fields = null;

        /**
         * Specifies the fields to get for an object.
         * @param fields the value to set
         * @return this builder instance
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to get for an object.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder fields(String singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        /**
         * Used to filter by the name of the object.
         */
        private String name = null;

        /**
         * Used to filter by the name of the object.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Used to filter by the identifier of the object.
         */
        private java.util.List<String> identifier = null;

        /**
         * Used to filter by the identifier of the object.
         * @param identifier the value to set
         * @return this builder instance
         */
        public Builder identifier(java.util.List<String> identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * Singular setter. Used to filter by the identifier of the object.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder identifier(String singularValue) {
            return this.identifier(java.util.Arrays.asList(singularValue));
        }

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code opc-prev-page} response header from the previous {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code opc-prev-page} response header from the previous {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Sets the maximum number of results per page, or items to return in a paginated {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * Sets the maximum number of results per page, or items to return in a paginated {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order is by relevance score in descending order).
         */
        private SortBy sortBy = null;

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order is by relevance score in descending order).
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * This filter parameter can be used to filter by model specific queryable fields of the object <br><br><B>Examples:-</B><br> <ul> <li><B>?filter=status eq Failed</B> returns all objects that have a status field with value Failed</li> </ul>
         */
        private java.util.List<String> filter = null;

        /**
         * This filter parameter can be used to filter by model specific queryable fields of the object <br><br><B>Examples:-</B><br> <ul> <li><B>?filter=status eq Failed</B> returns all objects that have a status field with value Failed</li> </ul>
         * @param filter the value to set
         * @return this builder instance
         */
        public Builder filter(java.util.List<String> filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Singular setter. This filter parameter can be used to filter by model specific queryable fields of the object <br><br><B>Examples:-</B><br> <ul> <li><B>?filter=status eq Failed</B> returns all objects that have a status field with value Failed</li> </ul>
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder filter(String singularValue) {
            return this.filter(java.util.Arrays.asList(singularValue));
        }

        /**
         * This parameter can be used to filter objects by the names starting with the given value.
         */
        private String nameStartsWith = null;

        /**
         * This parameter can be used to filter objects by the names starting with the given value.
         * @param nameStartsWith the value to set
         * @return this builder instance
         */
        public Builder nameStartsWith(String nameStartsWith) {
            this.nameStartsWith = nameStartsWith;
            return this;
        }

        /**
         * This parameter can be used to filter objects by the names that match partially or fully with the given value.
         */
        private String nameContains = null;

        /**
         * This parameter can be used to filter objects by the names that match partially or fully with the given value.
         * @param nameContains the value to set
         * @return this builder instance
         */
        public Builder nameContains(String nameContains) {
            this.nameContains = nameContains;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(ListTaskRunsRequest o) {
            workspaceId(o.getWorkspaceId());
            applicationKey(o.getApplicationKey());
            opcRequestId(o.getOpcRequestId());
            key(o.getKey());
            aggregatorKey(o.getAggregatorKey());
            fields(o.getFields());
            name(o.getName());
            identifier(o.getIdentifier());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            filter(o.getFilter());
            nameStartsWith(o.getNameStartsWith());
            nameContains(o.getNameContains());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListTaskRunsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListTaskRunsRequest
         */
        public ListTaskRunsRequest build() {
            ListTaskRunsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListTaskRunsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListTaskRunsRequest
         */
        public ListTaskRunsRequest buildWithoutInvocationCallback() {
            ListTaskRunsRequest request = new ListTaskRunsRequest();
            request.workspaceId = workspaceId;
            request.applicationKey = applicationKey;
            request.opcRequestId = opcRequestId;
            request.key = key;
            request.aggregatorKey = aggregatorKey;
            request.fields = fields;
            request.name = name;
            request.identifier = identifier;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.filter = filter;
            request.nameStartsWith = nameStartsWith;
            request.nameContains = nameContains;
            return request;
            // new ListTaskRunsRequest(workspaceId, applicationKey, opcRequestId, key, aggregatorKey, fields, name, identifier, page, limit, sortOrder, sortBy, filter, nameStartsWith, nameContains);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .applicationKey(applicationKey)
                .opcRequestId(opcRequestId)
                .key(key)
                .aggregatorKey(aggregatorKey)
                .fields(fields)
                .name(name)
                .identifier(identifier)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .filter(filter)
                .nameStartsWith(nameStartsWith)
                .nameContains(nameContains);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",key=").append(String.valueOf(this.key));
        sb.append(",aggregatorKey=").append(String.valueOf(this.aggregatorKey));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",identifier=").append(String.valueOf(this.identifier));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",filter=").append(String.valueOf(this.filter));
        sb.append(",nameStartsWith=").append(String.valueOf(this.nameStartsWith));
        sb.append(",nameContains=").append(String.valueOf(this.nameContains));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListTaskRunsRequest)) {
            return false;
        }

        ListTaskRunsRequest other = (ListTaskRunsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.aggregatorKey, other.aggregatorKey)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.nameStartsWith, other.nameStartsWith)
                && java.util.Objects.equals(this.nameContains, other.nameContains);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatorKey == null ? 43 : this.aggregatorKey.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result =
                (result * PRIME)
                        + (this.nameStartsWith == null ? 43 : this.nameStartsWith.hashCode());
        result = (result * PRIME) + (this.nameContains == null ? 43 : this.nameContains.hashCode());
        return result;
    }
}
