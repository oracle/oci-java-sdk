/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/ListDataAssetsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDataAssetsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class ListDataAssetsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The registry Ocid.
     */
    private String registryId;

    public String getRegistryId() {
        return registryId;
    }
    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code opc-prev-page} response header from the previous {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    public String getPage() {
        return page;
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
     * DataAsset type which needs to be listed while listing dataAssets
     */
    private java.util.List<String> includeTypes;

    public java.util.List<String> getIncludeTypes() {
        return includeTypes;
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
     * Used to filter by the name of the object.
     */
    private String name;

    public String getName() {
        return name;
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
     * Types which wont be listed while listing dataAsset/Connection
     */
    private java.util.List<String> excludeTypes;

    public java.util.List<String> getExcludeTypes() {
        return excludeTypes;
    }
    /**
     * If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
     */
    private FavoritesQueryParam favoritesQueryParam;

    /**
     * If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
     **/
    public enum FavoritesQueryParam {
        FavoritesOnly("FAVORITES_ONLY"),
        NonFavoritesOnly("NON_FAVORITES_ONLY"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, FavoritesQueryParam> map;

        static {
            map = new java.util.HashMap<>();
            for (FavoritesQueryParam v : FavoritesQueryParam.values()) {
                map.put(v.getValue(), v);
            }
        }

        FavoritesQueryParam(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FavoritesQueryParam create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FavoritesQueryParam: " + key);
        }
    };

    public FavoritesQueryParam getFavoritesQueryParam() {
        return favoritesQueryParam;
    }
    /**
     * Unique key of the folder.
     */
    private String folderId;

    public String getFolderId() {
        return folderId;
    }
    /**
     * Endpoint Ids used for data-plane APIs to filter or prefer specific endpoint.
     */
    private java.util.List<String> endpointIds;

    public java.util.List<String> getEndpointIds() {
        return endpointIds;
    }
    /**
     * Endpoints which will be excluded while listing dataAssets
     */
    private java.util.List<String> excludeEndpointIds;

    public java.util.List<String> getExcludeEndpointIds() {
        return excludeEndpointIds;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDataAssetsRequest, java.lang.Void> {
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

        private String page = null;

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code opc-prev-page} response header from the previous {@code List} call. See [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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

        private java.util.List<String> includeTypes = null;

        /**
         * DataAsset type which needs to be listed while listing dataAssets
         * @return this builder instance
         */
        public Builder includeTypes(java.util.List<String> includeTypes) {
            this.includeTypes = includeTypes;
            return this;
        }

        /**
         * Singular setter. DataAsset type which needs to be listed while listing dataAssets
         * @return this builder instance
         */
        public Builder includeTypes(String singularValue) {
            return this.includeTypes(java.util.Arrays.asList(singularValue));
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

        private String name = null;

        /**
         * Used to filter by the name of the object.
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
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

        private java.util.List<String> excludeTypes = null;

        /**
         * Types which wont be listed while listing dataAsset/Connection
         * @return this builder instance
         */
        public Builder excludeTypes(java.util.List<String> excludeTypes) {
            this.excludeTypes = excludeTypes;
            return this;
        }

        /**
         * Singular setter. Types which wont be listed while listing dataAsset/Connection
         * @return this builder instance
         */
        public Builder excludeTypes(String singularValue) {
            return this.excludeTypes(java.util.Arrays.asList(singularValue));
        }

        private FavoritesQueryParam favoritesQueryParam = null;

        /**
         * If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
         * @return this builder instance
         */
        public Builder favoritesQueryParam(FavoritesQueryParam favoritesQueryParam) {
            this.favoritesQueryParam = favoritesQueryParam;
            return this;
        }

        private String folderId = null;

        /**
         * Unique key of the folder.
         * @return this builder instance
         */
        public Builder folderId(String folderId) {
            this.folderId = folderId;
            return this;
        }

        private java.util.List<String> endpointIds = null;

        /**
         * Endpoint Ids used for data-plane APIs to filter or prefer specific endpoint.
         * @return this builder instance
         */
        public Builder endpointIds(java.util.List<String> endpointIds) {
            this.endpointIds = endpointIds;
            return this;
        }

        /**
         * Singular setter. Endpoint Ids used for data-plane APIs to filter or prefer specific endpoint.
         * @return this builder instance
         */
        public Builder endpointIds(String singularValue) {
            return this.endpointIds(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> excludeEndpointIds = null;

        /**
         * Endpoints which will be excluded while listing dataAssets
         * @return this builder instance
         */
        public Builder excludeEndpointIds(java.util.List<String> excludeEndpointIds) {
            this.excludeEndpointIds = excludeEndpointIds;
            return this;
        }

        /**
         * Singular setter. Endpoints which will be excluded while listing dataAssets
         * @return this builder instance
         */
        public Builder excludeEndpointIds(String singularValue) {
            return this.excludeEndpointIds(java.util.Arrays.asList(singularValue));
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
        public Builder copy(ListDataAssetsRequest o) {
            registryId(o.getRegistryId());
            page(o.getPage());
            limit(o.getLimit());
            fields(o.getFields());
            includeTypes(o.getIncludeTypes());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            name(o.getName());
            opcRequestId(o.getOpcRequestId());
            excludeTypes(o.getExcludeTypes());
            favoritesQueryParam(o.getFavoritesQueryParam());
            folderId(o.getFolderId());
            endpointIds(o.getEndpointIds());
            excludeEndpointIds(o.getExcludeEndpointIds());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDataAssetsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDataAssetsRequest
         */
        public ListDataAssetsRequest build() {
            ListDataAssetsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDataAssetsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDataAssetsRequest
         */
        public ListDataAssetsRequest buildWithoutInvocationCallback() {
            ListDataAssetsRequest request = new ListDataAssetsRequest();
            request.registryId = registryId;
            request.page = page;
            request.limit = limit;
            request.fields = fields;
            request.includeTypes = includeTypes;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.name = name;
            request.opcRequestId = opcRequestId;
            request.excludeTypes = excludeTypes;
            request.favoritesQueryParam = favoritesQueryParam;
            request.folderId = folderId;
            request.endpointIds = endpointIds;
            request.excludeEndpointIds = excludeEndpointIds;
            return request;
            // new ListDataAssetsRequest(registryId, page, limit, fields, includeTypes, sortBy, sortOrder, name, opcRequestId, excludeTypes, favoritesQueryParam, folderId, endpointIds, excludeEndpointIds);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .page(page)
                .limit(limit)
                .fields(fields)
                .includeTypes(includeTypes)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .name(name)
                .opcRequestId(opcRequestId)
                .excludeTypes(excludeTypes)
                .favoritesQueryParam(favoritesQueryParam)
                .folderId(folderId)
                .endpointIds(endpointIds)
                .excludeEndpointIds(excludeEndpointIds);
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
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",includeTypes=").append(String.valueOf(this.includeTypes));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",excludeTypes=").append(String.valueOf(this.excludeTypes));
        sb.append(",favoritesQueryParam=").append(String.valueOf(this.favoritesQueryParam));
        sb.append(",folderId=").append(String.valueOf(this.folderId));
        sb.append(",endpointIds=").append(String.valueOf(this.endpointIds));
        sb.append(",excludeEndpointIds=").append(String.valueOf(this.excludeEndpointIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDataAssetsRequest)) {
            return false;
        }

        ListDataAssetsRequest other = (ListDataAssetsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.includeTypes, other.includeTypes)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.excludeTypes, other.excludeTypes)
                && java.util.Objects.equals(this.favoritesQueryParam, other.favoritesQueryParam)
                && java.util.Objects.equals(this.folderId, other.folderId)
                && java.util.Objects.equals(this.endpointIds, other.endpointIds)
                && java.util.Objects.equals(this.excludeEndpointIds, other.excludeEndpointIds);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.includeTypes == null ? 43 : this.includeTypes.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.excludeTypes == null ? 43 : this.excludeTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.favoritesQueryParam == null
                                ? 43
                                : this.favoritesQueryParam.hashCode());
        result = (result * PRIME) + (this.folderId == null ? 43 : this.folderId.hashCode());
        result = (result * PRIME) + (this.endpointIds == null ? 43 : this.endpointIds.hashCode());
        result =
                (result * PRIME)
                        + (this.excludeEndpointIds == null
                                ? 43
                                : this.excludeEndpointIds.hashCode());
        return result;
    }
}
