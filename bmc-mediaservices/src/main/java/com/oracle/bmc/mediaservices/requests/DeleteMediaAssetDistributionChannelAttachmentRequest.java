/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/DeleteMediaAssetDistributionChannelAttachmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DeleteMediaAssetDistributionChannelAttachmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class DeleteMediaAssetDistributionChannelAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique MediaAsset identifier */
    private String mediaAssetId;

    /** Unique MediaAsset identifier */
    public String getMediaAssetId() {
        return mediaAssetId;
    }
    /** Unique DistributionChannel identifier. */
    private String distributionChannelId;

    /** Unique DistributionChannel identifier. */
    public String getDistributionChannelId() {
        return distributionChannelId;
    }
    /** Whether to override locks (if any exist). */
    private Boolean isLockOverride;

    /** Whether to override locks (if any exist). */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Version of the attachment. */
    private Long version;

    /** Version of the attachment. */
    public Long getVersion() {
        return version;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteMediaAssetDistributionChannelAttachmentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique MediaAsset identifier */
        private String mediaAssetId = null;

        /**
         * Unique MediaAsset identifier
         *
         * @param mediaAssetId the value to set
         * @return this builder instance
         */
        public Builder mediaAssetId(String mediaAssetId) {
            this.mediaAssetId = mediaAssetId;
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

        /** Whether to override locks (if any exist). */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         *
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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

        /** Version of the attachment. */
        private Long version = null;

        /**
         * Version of the attachment.
         *
         * @param version the value to set
         * @return this builder instance
         */
        public Builder version(Long version) {
            this.version = version;
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
        public Builder copy(DeleteMediaAssetDistributionChannelAttachmentRequest o) {
            mediaAssetId(o.getMediaAssetId());
            distributionChannelId(o.getDistributionChannelId());
            isLockOverride(o.getIsLockOverride());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            version(o.getVersion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteMediaAssetDistributionChannelAttachmentRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteMediaAssetDistributionChannelAttachmentRequest
         */
        public DeleteMediaAssetDistributionChannelAttachmentRequest build() {
            DeleteMediaAssetDistributionChannelAttachmentRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteMediaAssetDistributionChannelAttachmentRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteMediaAssetDistributionChannelAttachmentRequest
         */
        public DeleteMediaAssetDistributionChannelAttachmentRequest
                buildWithoutInvocationCallback() {
            DeleteMediaAssetDistributionChannelAttachmentRequest request =
                    new DeleteMediaAssetDistributionChannelAttachmentRequest();
            request.mediaAssetId = mediaAssetId;
            request.distributionChannelId = distributionChannelId;
            request.isLockOverride = isLockOverride;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.version = version;
            return request;
            // new DeleteMediaAssetDistributionChannelAttachmentRequest(mediaAssetId,
            // distributionChannelId, isLockOverride, ifMatch, opcRequestId, version);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .mediaAssetId(mediaAssetId)
                .distributionChannelId(distributionChannelId)
                .isLockOverride(isLockOverride)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .version(version);
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
        sb.append(",mediaAssetId=").append(String.valueOf(this.mediaAssetId));
        sb.append(",distributionChannelId=").append(String.valueOf(this.distributionChannelId));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteMediaAssetDistributionChannelAttachmentRequest)) {
            return false;
        }

        DeleteMediaAssetDistributionChannelAttachmentRequest other =
                (DeleteMediaAssetDistributionChannelAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.mediaAssetId, other.mediaAssetId)
                && java.util.Objects.equals(this.distributionChannelId, other.distributionChannelId)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.version, other.version);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.mediaAssetId == null ? 43 : this.mediaAssetId.hashCode());
        result =
                (result * PRIME)
                        + (this.distributionChannelId == null
                                ? 43
                                : this.distributionChannelId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        return result;
    }
}
