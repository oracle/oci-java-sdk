/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.requests;

import com.oracle.bmc.dataconnectivity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataconnectivity/ListReferenceArtifactsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListReferenceArtifactsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
public class ListReferenceArtifactsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The registry OCID.
     */
    private String registryId;

    /**
     * The registry OCID.
     */
    public String getRegistryId() {
        return registryId;
    }
    /**
     * The ID of a dcms artifact (DataAsset or Endpoint).
     */
    private String dcmsArtifactId;

    /**
     * The ID of a dcms artifact (DataAsset or Endpoint).
     */
    public String getDcmsArtifactId() {
        return dcmsArtifactId;
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
     * Type of the object to filter the results with.
     */
    private String type;

    /**
     * Type of the object to filter the results with.
     */
    public String getType() {
        return type;
    }
    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order are by relevance score in descending order).
     */
    private SortBy sortBy;

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order are by relevance score in descending order).
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

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order are by relevance score in descending order).
     */
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

    /**
     * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
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
     * The types that will be excluded from the list of data assets/connections.
     */
    private java.util.List<String> excludeTypes;

    /**
     * The types that will be excluded from the list of data assets/connections.
     */
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

    /**
     * If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
     */
    public FavoritesQueryParam getFavoritesQueryParam() {
        return favoritesQueryParam;
    }
    /**
     * Unique key of the service.
     */
    private String serviceArtifactId;

    /**
     * Unique key of the service.
     */
    public String getServiceArtifactId() {
        return serviceArtifactId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListReferenceArtifactsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The registry OCID.
         */
        private String registryId = null;

        /**
         * The registry OCID.
         * @param registryId the value to set
         * @return this builder instance
         */
        public Builder registryId(String registryId) {
            this.registryId = registryId;
            return this;
        }

        /**
         * The ID of a dcms artifact (DataAsset or Endpoint).
         */
        private String dcmsArtifactId = null;

        /**
         * The ID of a dcms artifact (DataAsset or Endpoint).
         * @param dcmsArtifactId the value to set
         * @return this builder instance
         */
        public Builder dcmsArtifactId(String dcmsArtifactId) {
            this.dcmsArtifactId = dcmsArtifactId;
            return this;
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
         * Type of the object to filter the results with.
         */
        private String type = null;

        /**
         * Type of the object to filter the results with.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order are by relevance score in descending order).
         */
        private SortBy sortBy = null;

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time fields, results are shown in descending order. All other fields default to ascending order. Sorting related parameters are ignored when parameter {@code query} is present (search operation and sorting order are by relevance score in descending order).
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
         * The types that will be excluded from the list of data assets/connections.
         */
        private java.util.List<String> excludeTypes = null;

        /**
         * The types that will be excluded from the list of data assets/connections.
         * @param excludeTypes the value to set
         * @return this builder instance
         */
        public Builder excludeTypes(java.util.List<String> excludeTypes) {
            this.excludeTypes = excludeTypes;
            return this;
        }

        /**
         * Singular setter. The types that will be excluded from the list of data assets/connections.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder excludeTypes(String singularValue) {
            return this.excludeTypes(java.util.Arrays.asList(singularValue));
        }

        /**
         * If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
         */
        private FavoritesQueryParam favoritesQueryParam = null;

        /**
         * If value is FAVORITES_ONLY, then only objects marked as favorite by the requesting user will be included in result. If value is NON_FAVORITES_ONLY, then objects marked as favorites by the requesting user will be skipped. If value is ALL or if not specified, all objects, irrespective of favorites or not will be returned. Default is ALL.
         * @param favoritesQueryParam the value to set
         * @return this builder instance
         */
        public Builder favoritesQueryParam(FavoritesQueryParam favoritesQueryParam) {
            this.favoritesQueryParam = favoritesQueryParam;
            return this;
        }

        /**
         * Unique key of the service.
         */
        private String serviceArtifactId = null;

        /**
         * Unique key of the service.
         * @param serviceArtifactId the value to set
         * @return this builder instance
         */
        public Builder serviceArtifactId(String serviceArtifactId) {
            this.serviceArtifactId = serviceArtifactId;
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
        public Builder copy(ListReferenceArtifactsRequest o) {
            registryId(o.getRegistryId());
            dcmsArtifactId(o.getDcmsArtifactId());
            page(o.getPage());
            limit(o.getLimit());
            fields(o.getFields());
            type(o.getType());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            name(o.getName());
            opcRequestId(o.getOpcRequestId());
            excludeTypes(o.getExcludeTypes());
            favoritesQueryParam(o.getFavoritesQueryParam());
            serviceArtifactId(o.getServiceArtifactId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListReferenceArtifactsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListReferenceArtifactsRequest
         */
        public ListReferenceArtifactsRequest build() {
            ListReferenceArtifactsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListReferenceArtifactsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListReferenceArtifactsRequest
         */
        public ListReferenceArtifactsRequest buildWithoutInvocationCallback() {
            ListReferenceArtifactsRequest request = new ListReferenceArtifactsRequest();
            request.registryId = registryId;
            request.dcmsArtifactId = dcmsArtifactId;
            request.page = page;
            request.limit = limit;
            request.fields = fields;
            request.type = type;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.name = name;
            request.opcRequestId = opcRequestId;
            request.excludeTypes = excludeTypes;
            request.favoritesQueryParam = favoritesQueryParam;
            request.serviceArtifactId = serviceArtifactId;
            return request;
            // new ListReferenceArtifactsRequest(registryId, dcmsArtifactId, page, limit, fields, type, sortBy, sortOrder, name, opcRequestId, excludeTypes, favoritesQueryParam, serviceArtifactId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .registryId(registryId)
                .dcmsArtifactId(dcmsArtifactId)
                .page(page)
                .limit(limit)
                .fields(fields)
                .type(type)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .name(name)
                .opcRequestId(opcRequestId)
                .excludeTypes(excludeTypes)
                .favoritesQueryParam(favoritesQueryParam)
                .serviceArtifactId(serviceArtifactId);
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
        sb.append(",registryId=").append(String.valueOf(this.registryId));
        sb.append(",dcmsArtifactId=").append(String.valueOf(this.dcmsArtifactId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",fields=").append(String.valueOf(this.fields));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",excludeTypes=").append(String.valueOf(this.excludeTypes));
        sb.append(",favoritesQueryParam=").append(String.valueOf(this.favoritesQueryParam));
        sb.append(",serviceArtifactId=").append(String.valueOf(this.serviceArtifactId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListReferenceArtifactsRequest)) {
            return false;
        }

        ListReferenceArtifactsRequest other = (ListReferenceArtifactsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.registryId, other.registryId)
                && java.util.Objects.equals(this.dcmsArtifactId, other.dcmsArtifactId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.excludeTypes, other.excludeTypes)
                && java.util.Objects.equals(this.favoritesQueryParam, other.favoritesQueryParam)
                && java.util.Objects.equals(this.serviceArtifactId, other.serviceArtifactId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.registryId == null ? 43 : this.registryId.hashCode());
        result =
                (result * PRIME)
                        + (this.dcmsArtifactId == null ? 43 : this.dcmsArtifactId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
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
        result =
                (result * PRIME)
                        + (this.serviceArtifactId == null ? 43 : this.serviceArtifactId.hashCode());
        return result;
    }
}
