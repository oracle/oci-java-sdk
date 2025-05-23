/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/ListStreamPackagingConfigsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListStreamPackagingConfigsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class ListStreamPackagingConfigsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Stream Distribution Channel identifier. */
    private String distributionChannelId;

    /** Unique Stream Distribution Channel identifier. */
    public String getDistributionChannelId() {
        return distributionChannelId;
    }
    /** Unique Stream Packaging Configuration identifier. */
    private String streamPackagingConfigId;

    /** Unique Stream Packaging Configuration identifier. */
    public String getStreamPackagingConfigId() {
        return streamPackagingConfigId;
    }
    /**
     * A filter to return only the resources with lifecycleState matching the given lifecycleState.
     */
    private com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState lifecycleState;

    /**
     * A filter to return only the resources with lifecycleState matching the given lifecycleState.
     */
    public com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only the resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only the resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.mediaservices.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.mediaservices.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    private com.oracle.bmc.mediaservices.model.SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public com.oracle.bmc.mediaservices.model.SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListStreamPackagingConfigsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Stream Distribution Channel identifier. */
        private String distributionChannelId = null;

        /**
         * Unique Stream Distribution Channel identifier.
         *
         * @param distributionChannelId the value to set
         * @return this builder instance
         */
        public Builder distributionChannelId(String distributionChannelId) {
            this.distributionChannelId = distributionChannelId;
            return this;
        }

        /** Unique Stream Packaging Configuration identifier. */
        private String streamPackagingConfigId = null;

        /**
         * Unique Stream Packaging Configuration identifier.
         *
         * @param streamPackagingConfigId the value to set
         * @return this builder instance
         */
        public Builder streamPackagingConfigId(String streamPackagingConfigId) {
            this.streamPackagingConfigId = streamPackagingConfigId;
            return this;
        }

        /**
         * A filter to return only the resources with lifecycleState matching the given
         * lifecycleState.
         */
        private com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only the resources with lifecycleState matching the given
         * lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.mediaservices.model.StreamPackagingConfig.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only the resources that match the entire display name given. */
        private String displayName = null;

        /**
         * A filter to return only the resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.mediaservices.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.mediaservices.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         */
        private com.oracle.bmc.mediaservices.model.SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.mediaservices.model.SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListStreamPackagingConfigsRequest o) {
            distributionChannelId(o.getDistributionChannelId());
            streamPackagingConfigId(o.getStreamPackagingConfigId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListStreamPackagingConfigsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListStreamPackagingConfigsRequest
         */
        public ListStreamPackagingConfigsRequest build() {
            ListStreamPackagingConfigsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListStreamPackagingConfigsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListStreamPackagingConfigsRequest
         */
        public ListStreamPackagingConfigsRequest buildWithoutInvocationCallback() {
            ListStreamPackagingConfigsRequest request = new ListStreamPackagingConfigsRequest();
            request.distributionChannelId = distributionChannelId;
            request.streamPackagingConfigId = streamPackagingConfigId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.page = page;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListStreamPackagingConfigsRequest(distributionChannelId, streamPackagingConfigId,
            // lifecycleState, displayName, sortOrder, sortBy, page, limit, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .distributionChannelId(distributionChannelId)
                .streamPackagingConfigId(streamPackagingConfigId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .page(page)
                .limit(limit)
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
        sb.append(",distributionChannelId=").append(String.valueOf(this.distributionChannelId));
        sb.append(",streamPackagingConfigId=").append(String.valueOf(this.streamPackagingConfigId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListStreamPackagingConfigsRequest)) {
            return false;
        }

        ListStreamPackagingConfigsRequest other = (ListStreamPackagingConfigsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.distributionChannelId, other.distributionChannelId)
                && java.util.Objects.equals(
                        this.streamPackagingConfigId, other.streamPackagingConfigId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.distributionChannelId == null
                                ? 43
                                : this.distributionChannelId.hashCode());
        result =
                (result * PRIME)
                        + (this.streamPackagingConfigId == null
                                ? 43
                                : this.streamPackagingConfigId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
