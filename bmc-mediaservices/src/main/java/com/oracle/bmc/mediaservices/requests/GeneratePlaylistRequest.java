/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/GeneratePlaylistExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GeneratePlaylistRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class GeneratePlaylistRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Stream Packaging Configuration identifier.
     */
    private String streamPackagingConfigId;

    /**
     * Unique Stream Packaging Configuration identifier.
     */
    public String getStreamPackagingConfigId() {
        return streamPackagingConfigId;
    }
    /**
     * Unique MediaAsset identifier.
     */
    private String mediaAssetId;

    /**
     * Unique MediaAsset identifier.
     */
    public String getMediaAssetId() {
        return mediaAssetId;
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
     * Streaming session authentication token.
     */
    private String token;

    /**
     * Streaming session authentication token.
     */
    public String getToken() {
        return token;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GeneratePlaylistRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Stream Packaging Configuration identifier.
         */
        private String streamPackagingConfigId = null;

        /**
         * Unique Stream Packaging Configuration identifier.
         * @param streamPackagingConfigId the value to set
         * @return this builder instance
         */
        public Builder streamPackagingConfigId(String streamPackagingConfigId) {
            this.streamPackagingConfigId = streamPackagingConfigId;
            return this;
        }

        /**
         * Unique MediaAsset identifier.
         */
        private String mediaAssetId = null;

        /**
         * Unique MediaAsset identifier.
         * @param mediaAssetId the value to set
         * @return this builder instance
         */
        public Builder mediaAssetId(String mediaAssetId) {
            this.mediaAssetId = mediaAssetId;
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
         * Streaming session authentication token.
         */
        private String token = null;

        /**
         * Streaming session authentication token.
         * @param token the value to set
         * @return this builder instance
         */
        public Builder token(String token) {
            this.token = token;
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
        public Builder copy(GeneratePlaylistRequest o) {
            streamPackagingConfigId(o.getStreamPackagingConfigId());
            mediaAssetId(o.getMediaAssetId());
            opcRequestId(o.getOpcRequestId());
            token(o.getToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GeneratePlaylistRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GeneratePlaylistRequest
         */
        public GeneratePlaylistRequest build() {
            GeneratePlaylistRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GeneratePlaylistRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GeneratePlaylistRequest
         */
        public GeneratePlaylistRequest buildWithoutInvocationCallback() {
            GeneratePlaylistRequest request = new GeneratePlaylistRequest();
            request.streamPackagingConfigId = streamPackagingConfigId;
            request.mediaAssetId = mediaAssetId;
            request.opcRequestId = opcRequestId;
            request.token = token;
            return request;
            // new GeneratePlaylistRequest(streamPackagingConfigId, mediaAssetId, opcRequestId, token);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .streamPackagingConfigId(streamPackagingConfigId)
                .mediaAssetId(mediaAssetId)
                .opcRequestId(opcRequestId)
                .token(token);
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
        sb.append(",streamPackagingConfigId=").append(String.valueOf(this.streamPackagingConfigId));
        sb.append(",mediaAssetId=").append(String.valueOf(this.mediaAssetId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",token=").append(String.valueOf(this.token));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GeneratePlaylistRequest)) {
            return false;
        }

        GeneratePlaylistRequest other = (GeneratePlaylistRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.streamPackagingConfigId, other.streamPackagingConfigId)
                && java.util.Objects.equals(this.mediaAssetId, other.mediaAssetId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.token, other.token);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.streamPackagingConfigId == null
                                ? 43
                                : this.streamPackagingConfigId.hashCode());
        result = (result * PRIME) + (this.mediaAssetId == null ? 43 : this.mediaAssetId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        return result;
    }
}
