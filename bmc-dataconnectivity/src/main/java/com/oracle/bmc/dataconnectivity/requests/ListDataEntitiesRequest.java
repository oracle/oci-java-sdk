/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/ListDataEntitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDataEntitiesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class ListDataEntitiesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The registry Ocid.
     */
    private String registryId;

    public String getRegistryId() {
        return registryId;
    }
    /**
     * The connection key.
     */
    private String connectionKey;

    public String getConnectionKey() {
        return connectionKey;
    }
    /**
     * The schema resource name used for retrieving schemas.
     */
    private String schemaResourceName;

    public String getSchemaResourceName() {
        return schemaResourceName;
    }
    /**
     * Used to filter by the name of the object.
     */
    private String name;

    public String getName() {
        return name;
    }
    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code opc-prev-page} response header from the previous {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * Type of the object to filter the results with.
     */
    private String type;

    public String getType() {
        return type;
    }
    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    public Integer getLimit() {
        return limit;
    }
    /**
     * Specifies the fields to get for an object.
     */
    private java.util.List<String> fields;

    public java.util.List<String> getFields() {
        return fields;
    }
    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order is by relevance score in descending order).
     */
    private SortBy sortBy;

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order is by relevance score in descending order).
     **/
    public enum SortBy {
        Id("id"),
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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

    public SortBy getSortBy() {
        return sortBy;
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

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * This parameter can be used to set the api response type to preview.
     */
    private ApiMode apiMode;

    /**
     * This parameter can be used to set the api response type to preview.
     **/
    public enum ApiMode {
        Preview("PREVIEW"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, ApiMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ApiMode v : ApiMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ApiMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ApiMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ApiMode: " + key);
        }
    };

    public ApiMode getApiMode() {
        return apiMode;
    }
    /**
     * Used to filter by the name of the object.
     */
    private java.util.List<String> nameList;

    public java.util.List<String> getNameList() {
        return nameList;
    }
    /**
     * This parameter can be used to specify whether entity search type is pattern search or not.
     */
    private Boolean isPattern;

    public Boolean getIsPattern() {
        return isPattern;
    }
    /**
     * Endpoint Id used for getDataAssetFullDetails.
     */
    private String endpointId;

    public String getEndpointId() {
        return endpointId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDataEntitiesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String registryId = null;

        /**
         * The registry Ocid.
         * @return this builder instance
         */
        public Builder registryId(String registryId) {
            this.registryId = registryId;
            return this;
        }

        private String connectionKey = null;

        /**
         * The connection key.
         * @return this builder instance
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            return this;
        }

        private String schemaResourceName = null;

        /**
         * The schema resource name used for retrieving schemas.
         * @return this builder instance
         */
        public Builder schemaResourceName(String schemaResourceName) {
            this.schemaResourceName = schemaResourceName;
            return this;
        }

        private String name = null;

        /**
         * Used to filter by the name of the object.
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        private String page = null;

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code opc-prev-page} response header from the previous {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private String type = null;

        /**
         * Type of the object to filter the results with.
         * @return this builder instance
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        private Integer limit = null;

        /**
         * Sets the maximum number of results per page, or items to return in a paginated {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        private java.util.List<String> fields = null;

        /**
         * Specifies the fields to get for an object.
         * @return this builder instance
         */
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Singular setter. Specifies the fields to get for an object.
         * @return this builder instance
         */
        public Builder fields(String singularValue) {
            return this.fields(java.util.Arrays.asList(singularValue));
        }

        private SortBy sortBy = null;

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order is by relevance score in descending order).
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        private SortOrder sortOrder = null;

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private ApiMode apiMode = null;

        /**
         * This parameter can be used to set the api response type to preview.
         * @return this builder instance
         */
        public Builder apiMode(ApiMode apiMode) {
            this.apiMode = apiMode;
            return this;
        }

        private java.util.List<String> nameList = null;

        /**
         * Used to filter by the name of the object.
         * @return this builder instance
         */
        public Builder nameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }

        /**
         * Singular setter. Used to filter by the name of the object.
         * @return this builder instance
         */
        public Builder nameList(String singularValue) {
            return this.nameList(java.util.Arrays.asList(singularValue));
        }

        private Boolean isPattern = null;

        /**
         * This parameter can be used to specify whether entity search type is pattern search or not.
         * @return this builder instance
         */
        public Builder isPattern(Boolean isPattern) {
            this.isPattern = isPattern;
            return this;
        }

        private String endpointId = null;

        /**
         * Endpoint Id used for getDataAssetFullDetails.
         * @return this builder instance
         */
        public Builder endpointId(String endpointId) {
            this.endpointId = endpointId;
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
        public Builder copy(ListDataEntitiesRequest o) {
            registryId(o.getRegistryId());
            connectionKey(o.getConnectionKey());
            schemaResourceName(o.getSchemaResourceName());
            name(o.getName());
            page(o.getPage());
            type(o.getType());
            limit(o.getLimit());
            fields(o.getFields());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            apiMode(o.getApiMode());
            nameList(o.getNameList());
            isPattern(o.getIsPattern());
            endpointId(o.getEndpointId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDataEntitiesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDataEntitiesRequest
         */
        public ListDataEntitiesRequest build() {
            ListDataEntitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDataEntitiesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDataEntitiesRequest
         */
        public ListDataEntitiesRequest buildWithoutInvocationCallback() {
            ListDataEntitiesRequest request = new ListDataEntitiesRequest();
            request.registryId = registryId;
            request.connectionKey = connectionKey;
            request.schemaResourceName = schemaResourceName;
            request.name = name;
            request.page = page;
            request.type = type;
            request.limit = limit;
            request.fields = fields;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.apiMode = apiMode;
            request.nameList = nameList;
            request.isPattern = isPattern;
            request.endpointId = endpointId;
            return request;
            // new ListDataEntitiesRequest(registryId, connectionKey, schemaResourceName, name, page, type, limit, fields, sortBy, sortOrder, opcRequestId, apiMode, nameList, isPattern, endpointId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .connectionKey(connectionKey)
                .schemaResourceName(schemaResourceName)
                .name(name)
                .page(page)
                .type(type)
                .limit(limit)
                .fields(fields)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .apiMode(apiMode)
                .nameList(nameList)
                .isPattern(isPattern)
                .endpointId(endpointId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",registryId=").append(String.valueOf(this.registryId));
        sb.append(",connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(",schemaResourceName=").append(String.valueOf(this.schemaResourceName));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",apiMode=").append(String.valueOf(this.apiMode));
        sb.append(",nameList=").append(String.valueOf(this.nameList));
        sb.append(",isPattern=").append(String.valueOf(this.isPattern));
        sb.append(",endpointId=").append(String.valueOf(this.endpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDataEntitiesRequest)) {
            return false;
        }

        ListDataEntitiesRequest other = (ListDataEntitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.schemaResourceName, other.schemaResourceName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.apiMode, other.apiMode)
                && java.util.Objects.equals(this.nameList, other.nameList)
                && java.util.Objects.equals(this.isPattern, other.isPattern)
                && java.util.Objects.equals(this.endpointId, other.endpointId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.schemaResourceName == null
                                ? 43
                                : this.schemaResourceName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.apiMode == null ? 43 : this.apiMode.hashCode());
        result = (result * PRIME) + (this.nameList == null ? 43 : this.nameList.hashCode());
        result = (result * PRIME) + (this.isPattern == null ? 43 : this.isPattern.hashCode());
        result = (result * PRIME) + (this.endpointId == null ? 43 : this.endpointId.hashCode());
        return result;
    }
}
