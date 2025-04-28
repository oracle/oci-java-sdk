/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.requests;

import com.oracle.bmc.apigateway.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apigateway/ListSdksExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSdksRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
public class ListSdksRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ocid of the SDK. */
    private String sdkId;

    /** The ocid of the SDK. */
    public String getSdkId() {
        return sdkId;
    }
    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * <p>Example: {@code My new resource}
     */
    private String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * <p>Example: {@code My new resource}
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return only resources that match the given lifecycle state.
     *
     * <p>Example: {@code ACTIVE} or {@code DELETED}
     */
    private com.oracle.bmc.apigateway.model.Sdk.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state.
     *
     * <p>Example: {@code ACTIVE} or {@code DELETED}
     */
    public com.oracle.bmc.apigateway.model.Sdk.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'. The default order depends on the sortBy value.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'. The default order depends on the sortBy value.
     */
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

    /**
     * The sort order to use, either 'asc' or 'desc'. The default order depends on the sortBy value.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * {@code timeCreated} is descending. Default order for {@code displayName} is ascending. The
     * {@code displayName} sort order is case sensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * {@code timeCreated} is descending. Default order for {@code displayName} is ascending. The
     * {@code displayName} sort order is case sensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * {@code timeCreated} is descending. Default order for {@code displayName} is ascending. The
     * {@code displayName} sort order is case sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The ocid of the API. */
    private String apiId;

    /** The ocid of the API. */
    public String getApiId() {
        return apiId;
    }
    /** The client request id for tracing. */
    private String opcRequestId;

    /** The client request id for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListSdksRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ocid of the SDK. */
        private String sdkId = null;

        /**
         * The ocid of the SDK.
         *
         * @param sdkId the value to set
         * @return this builder instance
         */
        public Builder sdkId(String sdkId) {
            this.sdkId = sdkId;
            return this;
        }

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         *
         * <p>Example: {@code My new resource}
         */
        private String displayName = null;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         *
         * <p>Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state.
         *
         * <p>Example: {@code ACTIVE} or {@code DELETED}
         */
        private com.oracle.bmc.apigateway.model.Sdk.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state.
         *
         * <p>Example: {@code ACTIVE} or {@code DELETED}
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.apigateway.model.Sdk.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'. The default order depends on the sortBy
         * value.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'. The default order depends on the sortBy
         * value.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for {@code timeCreated} is descending. Default order for {@code displayName} is
         * ascending. The {@code displayName} sort order is case sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for {@code timeCreated} is descending. Default order for {@code displayName} is
         * ascending. The {@code displayName} sort order is case sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The ocid of the API. */
        private String apiId = null;

        /**
         * The ocid of the API.
         *
         * @param apiId the value to set
         * @return this builder instance
         */
        public Builder apiId(String apiId) {
            this.apiId = apiId;
            return this;
        }

        /** The client request id for tracing. */
        private String opcRequestId = null;

        /**
         * The client request id for tracing.
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
        public Builder copy(ListSdksRequest o) {
            sdkId(o.getSdkId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            apiId(o.getApiId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSdksRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSdksRequest
         */
        public ListSdksRequest build() {
            ListSdksRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSdksRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSdksRequest
         */
        public ListSdksRequest buildWithoutInvocationCallback() {
            ListSdksRequest request = new ListSdksRequest();
            request.sdkId = sdkId;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.apiId = apiId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSdksRequest(sdkId, displayName, lifecycleState, limit, page, sortOrder,
            // sortBy, apiId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sdkId(sdkId)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .apiId(apiId)
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
        sb.append(",sdkId=").append(String.valueOf(this.sdkId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",apiId=").append(String.valueOf(this.apiId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSdksRequest)) {
            return false;
        }

        ListSdksRequest other = (ListSdksRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sdkId, other.sdkId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.apiId, other.apiId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sdkId == null ? 43 : this.sdkId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.apiId == null ? 43 : this.apiId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
