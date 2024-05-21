/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.monitoring.requests;

import com.oracle.bmc.monitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/monitoring/PostMetricDataExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PostMetricDataRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180401")
public class PostMetricDataRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.monitoring.model.PostMetricDataDetails> {

    /**
     * An array of metric objects containing raw metric data points to be posted to the Monitoring service.
     *
     */
    private com.oracle.bmc.monitoring.model.PostMetricDataDetails postMetricDataDetails;

    /**
     * An array of metric objects containing raw metric data points to be posted to the Monitoring service.
     *
     */
    public com.oracle.bmc.monitoring.model.PostMetricDataDetails getPostMetricDataDetails() {
        return postMetricDataDetails;
    }
    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a particular
     * request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    /**
     * Customer part of the request identifier token. If you need to contact Oracle about a particular
     * request, please provide the complete request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The optional Content-Encoding header that defines the content encodings that were applied to the payload.
     *
     */
    private String contentEncoding;

    /**
     * The optional Content-Encoding header that defines the content encodings that were applied to the payload.
     *
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.monitoring.model.PostMetricDataDetails getBody$() {
        return postMetricDataDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PostMetricDataRequest, com.oracle.bmc.monitoring.model.PostMetricDataDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * An array of metric objects containing raw metric data points to be posted to the Monitoring service.
         *
         */
        private com.oracle.bmc.monitoring.model.PostMetricDataDetails postMetricDataDetails = null;

        /**
         * An array of metric objects containing raw metric data points to be posted to the Monitoring service.
         *
         * @param postMetricDataDetails the value to set
         * @return this builder instance
         */
        public Builder postMetricDataDetails(
                com.oracle.bmc.monitoring.model.PostMetricDataDetails postMetricDataDetails) {
            this.postMetricDataDetails = postMetricDataDetails;
            return this;
        }

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a particular
         * request, please provide the complete request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Customer part of the request identifier token. If you need to contact Oracle about a particular
         * request, please provide the complete request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The optional Content-Encoding header that defines the content encodings that were applied to the payload.
         *
         */
        private String contentEncoding = null;

        /**
         * The optional Content-Encoding header that defines the content encodings that were applied to the payload.
         *
         * @param contentEncoding the value to set
         * @return this builder instance
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
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
        public Builder copy(PostMetricDataRequest o) {
            postMetricDataDetails(o.getPostMetricDataDetails());
            opcRequestId(o.getOpcRequestId());
            contentEncoding(o.getContentEncoding());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PostMetricDataRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PostMetricDataRequest
         */
        public PostMetricDataRequest build() {
            PostMetricDataRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.monitoring.model.PostMetricDataDetails body) {
            postMetricDataDetails(body);
            return this;
        }

        /**
         * Build the instance of PostMetricDataRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PostMetricDataRequest
         */
        public PostMetricDataRequest buildWithoutInvocationCallback() {
            PostMetricDataRequest request = new PostMetricDataRequest();
            request.postMetricDataDetails = postMetricDataDetails;
            request.opcRequestId = opcRequestId;
            request.contentEncoding = contentEncoding;
            return request;
            // new PostMetricDataRequest(postMetricDataDetails, opcRequestId, contentEncoding);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .postMetricDataDetails(postMetricDataDetails)
                .opcRequestId(opcRequestId)
                .contentEncoding(contentEncoding);
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
        sb.append(",postMetricDataDetails=").append(String.valueOf(this.postMetricDataDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",contentEncoding=").append(String.valueOf(this.contentEncoding));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostMetricDataRequest)) {
            return false;
        }

        PostMetricDataRequest other = (PostMetricDataRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.postMetricDataDetails, other.postMetricDataDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.contentEncoding, other.contentEncoding);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.postMetricDataDetails == null
                                ? 43
                                : this.postMetricDataDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentEncoding == null ? 43 : this.contentEncoding.hashCode());
        return result;
    }
}
