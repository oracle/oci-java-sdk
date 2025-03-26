/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/RemoveStreamDistributionChannelLockExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RemoveStreamDistributionChannelLockRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class RemoveStreamDistributionChannelLockRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.mediaservices.model.RemoveLockDetails> {

    /**
     * RemoveResourceLockDetails body parameter
     */
    private com.oracle.bmc.mediaservices.model.RemoveLockDetails removeResourceLockDetails;

    /**
     * RemoveResourceLockDetails body parameter
     */
    public com.oracle.bmc.mediaservices.model.RemoveLockDetails getRemoveResourceLockDetails() {
        return removeResourceLockDetails;
    }
    /**
     * Unique Stream Distribution Channel path identifier.
     */
    private String streamDistributionChannelId;

    /**
     * Unique Stream Distribution Channel path identifier.
     */
    public String getStreamDistributionChannelId() {
        return streamDistributionChannelId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without the risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without the risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.mediaservices.model.RemoveLockDetails getBody$() {
        return removeResourceLockDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveStreamDistributionChannelLockRequest,
                    com.oracle.bmc.mediaservices.model.RemoveLockDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * RemoveResourceLockDetails body parameter
         */
        private com.oracle.bmc.mediaservices.model.RemoveLockDetails removeResourceLockDetails =
                null;

        /**
         * RemoveResourceLockDetails body parameter
         * @param removeResourceLockDetails the value to set
         * @return this builder instance
         */
        public Builder removeResourceLockDetails(
                com.oracle.bmc.mediaservices.model.RemoveLockDetails removeResourceLockDetails) {
            this.removeResourceLockDetails = removeResourceLockDetails;
            return this;
        }

        /**
         * Unique Stream Distribution Channel path identifier.
         */
        private String streamDistributionChannelId = null;

        /**
         * Unique Stream Distribution Channel path identifier.
         * @param streamDistributionChannelId the value to set
         * @return this builder instance
         */
        public Builder streamDistributionChannelId(String streamDistributionChannelId) {
            this.streamDistributionChannelId = streamDistributionChannelId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without the risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without the risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(RemoveStreamDistributionChannelLockRequest o) {
            removeResourceLockDetails(o.getRemoveResourceLockDetails());
            streamDistributionChannelId(o.getStreamDistributionChannelId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveStreamDistributionChannelLockRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RemoveStreamDistributionChannelLockRequest
         */
        public RemoveStreamDistributionChannelLockRequest build() {
            RemoveStreamDistributionChannelLockRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.mediaservices.model.RemoveLockDetails body) {
            removeResourceLockDetails(body);
            return this;
        }

        /**
         * Build the instance of RemoveStreamDistributionChannelLockRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveStreamDistributionChannelLockRequest
         */
        public RemoveStreamDistributionChannelLockRequest buildWithoutInvocationCallback() {
            RemoveStreamDistributionChannelLockRequest request =
                    new RemoveStreamDistributionChannelLockRequest();
            request.removeResourceLockDetails = removeResourceLockDetails;
            request.streamDistributionChannelId = streamDistributionChannelId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new RemoveStreamDistributionChannelLockRequest(removeResourceLockDetails, streamDistributionChannelId, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .removeResourceLockDetails(removeResourceLockDetails)
                .streamDistributionChannelId(streamDistributionChannelId)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",removeResourceLockDetails=")
                .append(String.valueOf(this.removeResourceLockDetails));
        sb.append(",streamDistributionChannelId=")
                .append(String.valueOf(this.streamDistributionChannelId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveStreamDistributionChannelLockRequest)) {
            return false;
        }

        RemoveStreamDistributionChannelLockRequest other =
                (RemoveStreamDistributionChannelLockRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.removeResourceLockDetails, other.removeResourceLockDetails)
                && java.util.Objects.equals(
                        this.streamDistributionChannelId, other.streamDistributionChannelId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.removeResourceLockDetails == null
                                ? 43
                                : this.removeResourceLockDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.streamDistributionChannelId == null
                                ? 43
                                : this.streamDistributionChannelId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
