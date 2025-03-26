/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/ListMediaAssetDistributionChannelAttachmentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMediaAssetDistributionChannelAttachmentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class ListMediaAssetDistributionChannelAttachmentsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique MediaAsset identifier
     */
    private String mediaAssetId;

    /**
     * Unique MediaAsset identifier
     */
    public String getMediaAssetId() {
        return mediaAssetId;
    }
    /**
     * A filter to return only the resources that match the entire display name given.
     */
    private String displayName;

    /**
     * A filter to return only the resources that match the entire display name given.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from the
     * {@code opc-next-page} header field of a previous response.
     *
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from the
     * {@code opc-next-page} header field of a previous response.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.mediaservices.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.mediaservices.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     */
    private com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachmentSortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     */
    public com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachmentSortBy
            getSortBy() {
        return sortBy;
    }
    /**
     * Unique DistributionChannel identifier.
     */
    private String distributionChannelId;

    /**
     * Unique DistributionChannel identifier.
     */
    public String getDistributionChannelId() {
        return distributionChannelId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMediaAssetDistributionChannelAttachmentsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique MediaAsset identifier
         */
        private String mediaAssetId = null;

        /**
         * Unique MediaAsset identifier
         * @param mediaAssetId the value to set
         * @return this builder instance
         */
        public Builder mediaAssetId(String mediaAssetId) {
            this.mediaAssetId = mediaAssetId;
            return this;
        }

        /**
         * A filter to return only the resources that match the entire display name given.
         */
        private String displayName = null;

        /**
         * A filter to return only the resources that match the entire display name given.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come from the
         * {@code opc-next-page} header field of a previous response.
         *
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come from the
         * {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.mediaservices.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.mediaservices.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
         *
         */
        private com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachmentSortBy
                sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(
                com.oracle.bmc.mediaservices.model.MediaAssetDistributionChannelAttachmentSortBy
                        sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique DistributionChannel identifier.
         */
        private String distributionChannelId = null;

        /**
         * Unique DistributionChannel identifier.
         * @param distributionChannelId the value to set
         * @return this builder instance
         */
        public Builder distributionChannelId(String distributionChannelId) {
            this.distributionChannelId = distributionChannelId;
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
        public Builder copy(ListMediaAssetDistributionChannelAttachmentsRequest o) {
            mediaAssetId(o.getMediaAssetId());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            distributionChannelId(o.getDistributionChannelId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMediaAssetDistributionChannelAttachmentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListMediaAssetDistributionChannelAttachmentsRequest
         */
        public ListMediaAssetDistributionChannelAttachmentsRequest build() {
            ListMediaAssetDistributionChannelAttachmentsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMediaAssetDistributionChannelAttachmentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMediaAssetDistributionChannelAttachmentsRequest
         */
        public ListMediaAssetDistributionChannelAttachmentsRequest
                buildWithoutInvocationCallback() {
            ListMediaAssetDistributionChannelAttachmentsRequest request =
                    new ListMediaAssetDistributionChannelAttachmentsRequest();
            request.mediaAssetId = mediaAssetId;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.distributionChannelId = distributionChannelId;
            return request;
            // new ListMediaAssetDistributionChannelAttachmentsRequest(mediaAssetId, displayName, limit, page, opcRequestId, sortOrder, sortBy, distributionChannelId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .mediaAssetId(mediaAssetId)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .distributionChannelId(distributionChannelId);
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
        sb.append(",mediaAssetId=").append(String.valueOf(this.mediaAssetId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",distributionChannelId=").append(String.valueOf(this.distributionChannelId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMediaAssetDistributionChannelAttachmentsRequest)) {
            return false;
        }

        ListMediaAssetDistributionChannelAttachmentsRequest other =
                (ListMediaAssetDistributionChannelAttachmentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.mediaAssetId, other.mediaAssetId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(
                        this.distributionChannelId, other.distributionChannelId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mediaAssetId == null ? 43 : this.mediaAssetId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.distributionChannelId == null
                                ? 43
                                : this.distributionChannelId.hashCode());
        return result;
    }
}
