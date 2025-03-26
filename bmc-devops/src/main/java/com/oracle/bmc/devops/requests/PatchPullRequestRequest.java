/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.requests;

import com.oracle.bmc.devops.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/devops/PatchPullRequestExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PatchPullRequestRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class PatchPullRequestRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.devops.model.PatchPullRequestDetails> {

    /**
     * unique PullRequest identifier
     */
    private String pullRequestId;

    /**
     * unique PullRequest identifier
     */
    public String getPullRequestId() {
        return pullRequestId;
    }
    /**
     * Details for the PullRequest update.
     */
    private com.oracle.bmc.devops.model.PatchPullRequestDetails patchPullRequestDetails;

    /**
     * Details for the PullRequest update.
     */
    public com.oracle.bmc.devops.model.PatchPullRequestDetails getPatchPullRequestDetails() {
        return patchPullRequestDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.devops.model.PatchPullRequestDetails getBody$() {
        return patchPullRequestDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PatchPullRequestRequest, com.oracle.bmc.devops.model.PatchPullRequestDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique PullRequest identifier
         */
        private String pullRequestId = null;

        /**
         * unique PullRequest identifier
         * @param pullRequestId the value to set
         * @return this builder instance
         */
        public Builder pullRequestId(String pullRequestId) {
            this.pullRequestId = pullRequestId;
            return this;
        }

        /**
         * Details for the PullRequest update.
         */
        private com.oracle.bmc.devops.model.PatchPullRequestDetails patchPullRequestDetails = null;

        /**
         * Details for the PullRequest update.
         * @param patchPullRequestDetails the value to set
         * @return this builder instance
         */
        public Builder patchPullRequestDetails(
                com.oracle.bmc.devops.model.PatchPullRequestDetails patchPullRequestDetails) {
            this.patchPullRequestDetails = patchPullRequestDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the etag from a previous GET or POST response for that resource. The resource will be updated or deleted only if the etag you provide matches the resource's current etag value.
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a particular request, provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(PatchPullRequestRequest o) {
            pullRequestId(o.getPullRequestId());
            patchPullRequestDetails(o.getPatchPullRequestDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PatchPullRequestRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PatchPullRequestRequest
         */
        public PatchPullRequestRequest build() {
            PatchPullRequestRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.devops.model.PatchPullRequestDetails body) {
            patchPullRequestDetails(body);
            return this;
        }

        /**
         * Build the instance of PatchPullRequestRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PatchPullRequestRequest
         */
        public PatchPullRequestRequest buildWithoutInvocationCallback() {
            PatchPullRequestRequest request = new PatchPullRequestRequest();
            request.pullRequestId = pullRequestId;
            request.patchPullRequestDetails = patchPullRequestDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new PatchPullRequestRequest(pullRequestId, patchPullRequestDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .pullRequestId(pullRequestId)
                .patchPullRequestDetails(patchPullRequestDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",pullRequestId=").append(String.valueOf(this.pullRequestId));
        sb.append(",patchPullRequestDetails=").append(String.valueOf(this.patchPullRequestDetails));
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
        if (!(o instanceof PatchPullRequestRequest)) {
            return false;
        }

        PatchPullRequestRequest other = (PatchPullRequestRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.pullRequestId, other.pullRequestId)
                && java.util.Objects.equals(
                        this.patchPullRequestDetails, other.patchPullRequestDetails)
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
        result =
                (result * PRIME)
                        + (this.patchPullRequestDetails == null
                                ? 43
                                : this.patchPullRequestDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
