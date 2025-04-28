/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/CreatePullRequestAttachmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreatePullRequestAttachmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class CreatePullRequestAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /** unique PullRequest identifier */
    private String pullRequestId;

    /** unique PullRequest identifier */
    public String getPullRequestId() {
        return pullRequestId;
    }
    /**
     * The Content-Disposition response-header field has been proposed as a means for the origin
     * server to suggest a default filename if the user requests that the content is saved to a
     * file.
     */
    private String contentDisposition;

    /**
     * The Content-Disposition response-header field has been proposed as a means for the origin
     * server to suggest a default filename if the user requests that the content is saved to a
     * file.
     */
    public String getContentDisposition() {
        return contentDisposition;
    }
    /** Uploads the content of the attachment. */
    private java.io.InputStream createPullRequestAttachmentBody;

    /** Uploads the content of the attachment. */
    public java.io.InputStream getCreatePullRequestAttachmentBody() {
        return createPullRequestAttachmentBody;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated earlier due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated earlier due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.io.InputStream getBody$() {
        return createPullRequestAttachmentBody;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreatePullRequestAttachmentRequest, java.io.InputStream> {
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

        /**
         * The Content-Disposition response-header field has been proposed as a means for the origin
         * server to suggest a default filename if the user requests that the content is saved to a
         * file.
         */
        private String contentDisposition = null;

        /**
         * The Content-Disposition response-header field has been proposed as a means for the origin
         * server to suggest a default filename if the user requests that the content is saved to a
         * file.
         *
         * @param contentDisposition the value to set
         * @return this builder instance
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /** Uploads the content of the attachment. */
        private java.io.InputStream createPullRequestAttachmentBody = null;

        /**
         * Uploads the content of the attachment.
         *
         * @param createPullRequestAttachmentBody the value to set
         * @return this builder instance
         */
        public Builder createPullRequestAttachmentBody(
                java.io.InputStream createPullRequestAttachmentBody) {
            this.createPullRequestAttachmentBody = createPullRequestAttachmentBody;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated earlier due to conflicting operations. For example, if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated earlier due to conflicting operations. For example, if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreatePullRequestAttachmentRequest o) {
            pullRequestId(o.getPullRequestId());
            contentDisposition(o.getContentDisposition());
            createPullRequestAttachmentBody(o.getCreatePullRequestAttachmentBody());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreatePullRequestAttachmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreatePullRequestAttachmentRequest
         */
        public CreatePullRequestAttachmentRequest build() {
            CreatePullRequestAttachmentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(java.io.InputStream body) {
            createPullRequestAttachmentBody(body);
            return this;
        }

        /**
         * Build the instance of CreatePullRequestAttachmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreatePullRequestAttachmentRequest
         */
        public CreatePullRequestAttachmentRequest buildWithoutInvocationCallback() {
            CreatePullRequestAttachmentRequest request = new CreatePullRequestAttachmentRequest();
            request.pullRequestId = pullRequestId;
            request.contentDisposition = contentDisposition;
            request.createPullRequestAttachmentBody = createPullRequestAttachmentBody;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreatePullRequestAttachmentRequest(pullRequestId, contentDisposition,
            // createPullRequestAttachmentBody, opcRetryToken, opcRequestId);
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
                .contentDisposition(contentDisposition)
                .createPullRequestAttachmentBody(createPullRequestAttachmentBody)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",contentDisposition=").append(String.valueOf(this.contentDisposition));
        sb.append(",createPullRequestAttachmentBody=")
                .append(String.valueOf(this.createPullRequestAttachmentBody));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePullRequestAttachmentRequest)) {
            return false;
        }

        CreatePullRequestAttachmentRequest other = (CreatePullRequestAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pullRequestId, other.pullRequestId)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(
                        this.createPullRequestAttachmentBody, other.createPullRequestAttachmentBody)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.pullRequestId == null ? 43 : this.pullRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result =
                (result * PRIME)
                        + (this.createPullRequestAttachmentBody == null
                                ? 43
                                : this.createPullRequestAttachmentBody.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
