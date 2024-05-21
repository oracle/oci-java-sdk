/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.requests;

import com.oracle.bmc.mediaservices.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/mediaservices/UpdateStreamDistributionChannelExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateStreamDistributionChannelRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
public class UpdateStreamDistributionChannelRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.mediaservices.model.UpdateStreamDistributionChannelDetails> {

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
     * The information to be updated.
     */
    private com.oracle.bmc.mediaservices.model.UpdateStreamDistributionChannelDetails
            updateStreamDistributionChannelDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.mediaservices.model.UpdateStreamDistributionChannelDetails
            getUpdateStreamDistributionChannelDetails() {
        return updateStreamDistributionChannelDetails;
    }
    /**
     * Whether to override locks (if any exist).
     */
    private Boolean isLockOverride;

    /**
     * Whether to override locks (if any exist).
     */
    public Boolean getIsLockOverride() {
        return isLockOverride;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.mediaservices.model.UpdateStreamDistributionChannelDetails getBody$() {
        return updateStreamDistributionChannelDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateStreamDistributionChannelRequest,
                    com.oracle.bmc.mediaservices.model.UpdateStreamDistributionChannelDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
         * The information to be updated.
         */
        private com.oracle.bmc.mediaservices.model.UpdateStreamDistributionChannelDetails
                updateStreamDistributionChannelDetails = null;

        /**
         * The information to be updated.
         * @param updateStreamDistributionChannelDetails the value to set
         * @return this builder instance
         */
        public Builder updateStreamDistributionChannelDetails(
                com.oracle.bmc.mediaservices.model.UpdateStreamDistributionChannelDetails
                        updateStreamDistributionChannelDetails) {
            this.updateStreamDistributionChannelDetails = updateStreamDistributionChannelDetails;
            return this;
        }

        /**
         * Whether to override locks (if any exist).
         */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
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
        public Builder copy(UpdateStreamDistributionChannelRequest o) {
            streamDistributionChannelId(o.getStreamDistributionChannelId());
            updateStreamDistributionChannelDetails(o.getUpdateStreamDistributionChannelDetails());
            isLockOverride(o.getIsLockOverride());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateStreamDistributionChannelRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateStreamDistributionChannelRequest
         */
        public UpdateStreamDistributionChannelRequest build() {
            UpdateStreamDistributionChannelRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.mediaservices.model.UpdateStreamDistributionChannelDetails body) {
            updateStreamDistributionChannelDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateStreamDistributionChannelRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateStreamDistributionChannelRequest
         */
        public UpdateStreamDistributionChannelRequest buildWithoutInvocationCallback() {
            UpdateStreamDistributionChannelRequest request =
                    new UpdateStreamDistributionChannelRequest();
            request.streamDistributionChannelId = streamDistributionChannelId;
            request.updateStreamDistributionChannelDetails = updateStreamDistributionChannelDetails;
            request.isLockOverride = isLockOverride;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateStreamDistributionChannelRequest(streamDistributionChannelId, updateStreamDistributionChannelDetails, isLockOverride, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .streamDistributionChannelId(streamDistributionChannelId)
                .updateStreamDistributionChannelDetails(updateStreamDistributionChannelDetails)
                .isLockOverride(isLockOverride)
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
        sb.append(",streamDistributionChannelId=")
                .append(String.valueOf(this.streamDistributionChannelId));
        sb.append(",updateStreamDistributionChannelDetails=")
                .append(String.valueOf(this.updateStreamDistributionChannelDetails));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
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
        if (!(o instanceof UpdateStreamDistributionChannelRequest)) {
            return false;
        }

        UpdateStreamDistributionChannelRequest other = (UpdateStreamDistributionChannelRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.streamDistributionChannelId, other.streamDistributionChannelId)
                && java.util.Objects.equals(
                        this.updateStreamDistributionChannelDetails,
                        other.updateStreamDistributionChannelDetails)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.streamDistributionChannelId == null
                                ? 43
                                : this.streamDistributionChannelId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateStreamDistributionChannelDetails == null
                                ? 43
                                : this.updateStreamDistributionChannelDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
