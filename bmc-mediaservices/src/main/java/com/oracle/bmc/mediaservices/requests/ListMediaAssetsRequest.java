/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/ListMediaAssetsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMediaAssetsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class ListMediaAssetsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only the resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only the resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
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
    /**
     * A filter to return only the resources with lifecycleState matching the given lifecycleState.
     */
    private com.oracle.bmc.mediaservices.model.LifecycleState lifecycleState;

    /**
     * A filter to return only the resources with lifecycleState matching the given lifecycleState.
     */
    public com.oracle.bmc.mediaservices.model.LifecycleState getLifecycleState() {
        return lifecycleState;
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
    private com.oracle.bmc.mediaservices.model.MediaAssetSortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public com.oracle.bmc.mediaservices.model.MediaAssetSortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Unique DistributionChannel identifier. */
    private String distributionChannelId;

    /** Unique DistributionChannel identifier. */
    public String getDistributionChannelId() {
        return distributionChannelId;
    }
    /** Unique MediaAsset identifier of the asset from which this asset is derived. */
    private String parentMediaAssetId;

    /** Unique MediaAsset identifier of the asset from which this asset is derived. */
    public String getParentMediaAssetId() {
        return parentMediaAssetId;
    }
    /** Unique MediaAsset identifier of the first asset upload. */
    private String masterMediaAssetId;

    /** Unique MediaAsset identifier of the first asset upload. */
    public String getMasterMediaAssetId() {
        return masterMediaAssetId;
    }
    /** Filter MediaAsset by the asset type. */
    private com.oracle.bmc.mediaservices.model.AssetType type;

    /** Filter MediaAsset by the asset type. */
    public com.oracle.bmc.mediaservices.model.AssetType getType() {
        return type;
    }
    /** Filter MediaAsset by the bucket where the object is stored. */
    private String bucketName;

    /** Filter MediaAsset by the bucket where the object is stored. */
    public String getBucketName() {
        return bucketName;
    }
    /** Filter MediaAsset by the name of the object in object storage. */
    private String objectName;

    /** Filter MediaAsset by the name of the object in object storage. */
    public String getObjectName() {
        return objectName;
    }
    /**
     * The ID of the MediaWorkflowJob used to produce this asset, if this parameter is supplied then
     * the workflow ID must also be supplied.
     */
    private String mediaWorkflowJobId;

    /**
     * The ID of the MediaWorkflowJob used to produce this asset, if this parameter is supplied then
     * the workflow ID must also be supplied.
     */
    public String getMediaWorkflowJobId() {
        return mediaWorkflowJobId;
    }
    /** The ID of the MediaWorkflow used to produce this asset. */
    private String sourceMediaWorkflowId;

    /** The ID of the MediaWorkflow used to produce this asset. */
    public String getSourceMediaWorkflowId() {
        return sourceMediaWorkflowId;
    }
    /** The version of the MediaWorkflow used to produce this asset. */
    private Long sourceMediaWorkflowVersion;

    /** The version of the MediaWorkflow used to produce this asset. */
    public Long getSourceMediaWorkflowVersion() {
        return sourceMediaWorkflowVersion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMediaAssetsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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

        /**
         * A filter to return only the resources with lifecycleState matching the given
         * lifecycleState.
         */
        private com.oracle.bmc.mediaservices.model.LifecycleState lifecycleState = null;

        /**
         * A filter to return only the resources with lifecycleState matching the given
         * lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.mediaservices.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        private com.oracle.bmc.mediaservices.model.MediaAssetSortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.mediaservices.model.MediaAssetSortBy sortBy) {
            this.sortBy = sortBy;
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

        /** Unique DistributionChannel identifier. */
        private String distributionChannelId = null;

        /**
         * Unique DistributionChannel identifier.
         *
         * @param distributionChannelId the value to set
         * @return this builder instance
         */
        public Builder distributionChannelId(String distributionChannelId) {
            this.distributionChannelId = distributionChannelId;
            return this;
        }

        /** Unique MediaAsset identifier of the asset from which this asset is derived. */
        private String parentMediaAssetId = null;

        /**
         * Unique MediaAsset identifier of the asset from which this asset is derived.
         *
         * @param parentMediaAssetId the value to set
         * @return this builder instance
         */
        public Builder parentMediaAssetId(String parentMediaAssetId) {
            this.parentMediaAssetId = parentMediaAssetId;
            return this;
        }

        /** Unique MediaAsset identifier of the first asset upload. */
        private String masterMediaAssetId = null;

        /**
         * Unique MediaAsset identifier of the first asset upload.
         *
         * @param masterMediaAssetId the value to set
         * @return this builder instance
         */
        public Builder masterMediaAssetId(String masterMediaAssetId) {
            this.masterMediaAssetId = masterMediaAssetId;
            return this;
        }

        /** Filter MediaAsset by the asset type. */
        private com.oracle.bmc.mediaservices.model.AssetType type = null;

        /**
         * Filter MediaAsset by the asset type.
         *
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(com.oracle.bmc.mediaservices.model.AssetType type) {
            this.type = type;
            return this;
        }

        /** Filter MediaAsset by the bucket where the object is stored. */
        private String bucketName = null;

        /**
         * Filter MediaAsset by the bucket where the object is stored.
         *
         * @param bucketName the value to set
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /** Filter MediaAsset by the name of the object in object storage. */
        private String objectName = null;

        /**
         * Filter MediaAsset by the name of the object in object storage.
         *
         * @param objectName the value to set
         * @return this builder instance
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * The ID of the MediaWorkflowJob used to produce this asset, if this parameter is supplied
         * then the workflow ID must also be supplied.
         */
        private String mediaWorkflowJobId = null;

        /**
         * The ID of the MediaWorkflowJob used to produce this asset, if this parameter is supplied
         * then the workflow ID must also be supplied.
         *
         * @param mediaWorkflowJobId the value to set
         * @return this builder instance
         */
        public Builder mediaWorkflowJobId(String mediaWorkflowJobId) {
            this.mediaWorkflowJobId = mediaWorkflowJobId;
            return this;
        }

        /** The ID of the MediaWorkflow used to produce this asset. */
        private String sourceMediaWorkflowId = null;

        /**
         * The ID of the MediaWorkflow used to produce this asset.
         *
         * @param sourceMediaWorkflowId the value to set
         * @return this builder instance
         */
        public Builder sourceMediaWorkflowId(String sourceMediaWorkflowId) {
            this.sourceMediaWorkflowId = sourceMediaWorkflowId;
            return this;
        }

        /** The version of the MediaWorkflow used to produce this asset. */
        private Long sourceMediaWorkflowVersion = null;

        /**
         * The version of the MediaWorkflow used to produce this asset.
         *
         * @param sourceMediaWorkflowVersion the value to set
         * @return this builder instance
         */
        public Builder sourceMediaWorkflowVersion(Long sourceMediaWorkflowVersion) {
            this.sourceMediaWorkflowVersion = sourceMediaWorkflowVersion;
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
        public Builder copy(ListMediaAssetsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            distributionChannelId(o.getDistributionChannelId());
            parentMediaAssetId(o.getParentMediaAssetId());
            masterMediaAssetId(o.getMasterMediaAssetId());
            type(o.getType());
            bucketName(o.getBucketName());
            objectName(o.getObjectName());
            mediaWorkflowJobId(o.getMediaWorkflowJobId());
            sourceMediaWorkflowId(o.getSourceMediaWorkflowId());
            sourceMediaWorkflowVersion(o.getSourceMediaWorkflowVersion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMediaAssetsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMediaAssetsRequest
         */
        public ListMediaAssetsRequest build() {
            ListMediaAssetsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMediaAssetsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMediaAssetsRequest
         */
        public ListMediaAssetsRequest buildWithoutInvocationCallback() {
            ListMediaAssetsRequest request = new ListMediaAssetsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.distributionChannelId = distributionChannelId;
            request.parentMediaAssetId = parentMediaAssetId;
            request.masterMediaAssetId = masterMediaAssetId;
            request.type = type;
            request.bucketName = bucketName;
            request.objectName = objectName;
            request.mediaWorkflowJobId = mediaWorkflowJobId;
            request.sourceMediaWorkflowId = sourceMediaWorkflowId;
            request.sourceMediaWorkflowVersion = sourceMediaWorkflowVersion;
            return request;
            // new ListMediaAssetsRequest(compartmentId, displayName, limit, page, lifecycleState,
            // sortOrder, sortBy, opcRequestId, distributionChannelId, parentMediaAssetId,
            // masterMediaAssetId, type, bucketName, objectName, mediaWorkflowJobId,
            // sourceMediaWorkflowId, sourceMediaWorkflowVersion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .distributionChannelId(distributionChannelId)
                .parentMediaAssetId(parentMediaAssetId)
                .masterMediaAssetId(masterMediaAssetId)
                .type(type)
                .bucketName(bucketName)
                .objectName(objectName)
                .mediaWorkflowJobId(mediaWorkflowJobId)
                .sourceMediaWorkflowId(sourceMediaWorkflowId)
                .sourceMediaWorkflowVersion(sourceMediaWorkflowVersion);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",distributionChannelId=").append(String.valueOf(this.distributionChannelId));
        sb.append(",parentMediaAssetId=").append(String.valueOf(this.parentMediaAssetId));
        sb.append(",masterMediaAssetId=").append(String.valueOf(this.masterMediaAssetId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",bucketName=").append(String.valueOf(this.bucketName));
        sb.append(",objectName=").append(String.valueOf(this.objectName));
        sb.append(",mediaWorkflowJobId=").append(String.valueOf(this.mediaWorkflowJobId));
        sb.append(",sourceMediaWorkflowId=").append(String.valueOf(this.sourceMediaWorkflowId));
        sb.append(",sourceMediaWorkflowVersion=")
                .append(String.valueOf(this.sourceMediaWorkflowVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMediaAssetsRequest)) {
            return false;
        }

        ListMediaAssetsRequest other = (ListMediaAssetsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.distributionChannelId, other.distributionChannelId)
                && java.util.Objects.equals(this.parentMediaAssetId, other.parentMediaAssetId)
                && java.util.Objects.equals(this.masterMediaAssetId, other.masterMediaAssetId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.mediaWorkflowJobId, other.mediaWorkflowJobId)
                && java.util.Objects.equals(this.sourceMediaWorkflowId, other.sourceMediaWorkflowId)
                && java.util.Objects.equals(
                        this.sourceMediaWorkflowVersion, other.sourceMediaWorkflowVersion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.distributionChannelId == null
                                ? 43
                                : this.distributionChannelId.hashCode());
        result =
                (result * PRIME)
                        + (this.parentMediaAssetId == null
                                ? 43
                                : this.parentMediaAssetId.hashCode());
        result =
                (result * PRIME)
                        + (this.masterMediaAssetId == null
                                ? 43
                                : this.masterMediaAssetId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result =
                (result * PRIME)
                        + (this.mediaWorkflowJobId == null
                                ? 43
                                : this.mediaWorkflowJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceMediaWorkflowId == null
                                ? 43
                                : this.sourceMediaWorkflowId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceMediaWorkflowVersion == null
                                ? 43
                                : this.sourceMediaWorkflowVersion.hashCode());
        return result;
    }
}
