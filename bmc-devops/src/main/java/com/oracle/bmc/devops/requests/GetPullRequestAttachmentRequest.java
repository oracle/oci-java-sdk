/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/GetPullRequestAttachmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetPullRequestAttachmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetPullRequestAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** unique PullRequest identifier */
    private String pullRequestId;

    /** unique PullRequest identifier */
    public String getPullRequestId() {
        return pullRequestId;
    }
    /** unique PullRequest attachment identifier */
    private String attachmentId;

    /** unique PullRequest attachment identifier */
    public String getAttachmentId() {
        return attachmentId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetPullRequestAttachmentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique PullRequest identifier */
        private String pullRequestId = null;

        /**
         * unique PullRequest identifier
         *
         * @param pullRequestId the value to set
         * @return this builder instance
         */
        public Builder pullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }

        /** unique PullRequest attachment identifier */
        private String attachmentId = null;

        /**
         * unique PullRequest attachment identifier
         *
         * @param attachmentId the value to set
         * @return this builder instance
         */
        public Builder attachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
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
        public Builder copy(GetPullRequestAttachmentRequest o) {
            pullRequestId(o.getPullRequestId());
            attachmentId(o.getAttachmentId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetPullRequestAttachmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetPullRequestAttachmentRequest
         */
        public GetPullRequestAttachmentRequest build() {
            GetPullRequestAttachmentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetPullRequestAttachmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetPullRequestAttachmentRequest
         */
        public GetPullRequestAttachmentRequest buildWithoutInvocationCallback() {
            GetPullRequestAttachmentRequest request = new GetPullRequestAttachmentRequest();
            request.pullRequestId = pullRequestId;
            request.attachmentId = attachmentId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetPullRequestAttachmentRequest(pullRequestId, attachmentId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pullRequestId(pullRequestId)
                .attachmentId(attachmentId)
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
        sb.append(",pullRequestId=").append(String.valueOf(this.pullRequestId));
        sb.append(",attachmentId=").append(String.valueOf(this.attachmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPullRequestAttachmentRequest)) {
            return false;
        }

        GetPullRequestAttachmentRequest other = (GetPullRequestAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pullRequestId, other.pullRequestId)
                && java.util.Objects.equals(this.attachmentId, other.attachmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.pullRequestId == null ? 43 : this.pullRequestId.hashCode());
        result = (result * PRIME) + (this.attachmentId == null ? 43 : this.attachmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
