/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/UpdatePullRequestCommentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdatePullRequestCommentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class UpdatePullRequestCommentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.UpdatePullRequestCommentDetails> {

    /** unique PullRequest identifier */
    private String pullRequestId;

    /** unique PullRequest identifier */
    public String getPullRequestId() {
        return pullRequestId;
    }
    /** unique PullRequest Comment identifier */
    private String commentId;

    /** unique PullRequest Comment identifier */
    public String getCommentId() {
        return commentId;
    }
    /** The new comment content to be updated. */
    private com.oracle.bmc.devops.model.UpdatePullRequestCommentDetails
            updatePullRequestCommentDetails;

    /** The new comment content to be updated. */
    public com.oracle.bmc.devops.model.UpdatePullRequestCommentDetails
            getUpdatePullRequestCommentDetails() {
        return updatePullRequestCommentDetails;
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
    public com.oracle.bmc.devops.model.UpdatePullRequestCommentDetails getBody$() {
        return updatePullRequestCommentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePullRequestCommentRequest,
                    com.oracle.bmc.devops.model.UpdatePullRequestCommentDetails> {
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

        /** unique PullRequest Comment identifier */
        private String commentId = null;

        /**
         * unique PullRequest Comment identifier
         *
         * @param commentId the value to set
         * @return this builder instance
         */
        public Builder commentId(String commentId) {
            this.commentId = commentId;
            return this;
        }

        /** The new comment content to be updated. */
        private com.oracle.bmc.devops.model.UpdatePullRequestCommentDetails
                updatePullRequestCommentDetails = null;

        /**
         * The new comment content to be updated.
         *
         * @param updatePullRequestCommentDetails the value to set
         * @return this builder instance
         */
        public Builder updatePullRequestCommentDetails(
                com.oracle.bmc.devops.model.UpdatePullRequestCommentDetails
                        updatePullRequestCommentDetails) {
            this.updatePullRequestCommentDetails = updatePullRequestCommentDetails;
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
        public Builder copy(UpdatePullRequestCommentRequest o) {
            pullRequestId(o.getPullRequestId());
            commentId(o.getCommentId());
            updatePullRequestCommentDetails(o.getUpdatePullRequestCommentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePullRequestCommentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdatePullRequestCommentRequest
         */
        public UpdatePullRequestCommentRequest build() {
            UpdatePullRequestCommentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.devops.model.UpdatePullRequestCommentDetails body) {
            updatePullRequestCommentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePullRequestCommentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePullRequestCommentRequest
         */
        public UpdatePullRequestCommentRequest buildWithoutInvocationCallback() {
            UpdatePullRequestCommentRequest request = new UpdatePullRequestCommentRequest();
            request.pullRequestId = pullRequestId;
            request.commentId = commentId;
            request.updatePullRequestCommentDetails = updatePullRequestCommentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdatePullRequestCommentRequest(pullRequestId, commentId,
            // updatePullRequestCommentDetails, ifMatch, opcRequestId);
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
                .commentId(commentId)
                .updatePullRequestCommentDetails(updatePullRequestCommentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",commentId=").append(String.valueOf(this.commentId));
        sb.append(",updatePullRequestCommentDetails=")
                .append(String.valueOf(this.updatePullRequestCommentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePullRequestCommentRequest)) {
            return false;
        }

        UpdatePullRequestCommentRequest other = (UpdatePullRequestCommentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pullRequestId, other.pullRequestId)
                && java.util.Objects.equals(this.commentId, other.commentId)
                && java.util.Objects.equals(
                        this.updatePullRequestCommentDetails, other.updatePullRequestCommentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.pullRequestId == null ? 43 : this.pullRequestId.hashCode());
        result = (result * PRIME) + (this.commentId == null ? 43 : this.commentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePullRequestCommentDetails == null
                                ? 43
                                : this.updatePullRequestCommentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
