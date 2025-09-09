/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/email/RemoveSenderLockExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use RemoveSenderLockRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public class RemoveSenderLockRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.email.model.RemoveLockDetails> {

    /** The unique OCID of the sender. */
    private String senderId;

    /** The unique OCID of the sender. */
    public String getSenderId() {
        return senderId;
    }
    /** Details for removing a lock from a resource. */
    private com.oracle.bmc.email.model.RemoveLockDetails removeLockDetails;

    /** Details for removing a lock from a resource. */
    public com.oracle.bmc.email.model.RemoveLockDetails getRemoveLockDetails() {
        return removeLockDetails;
    }
    /** The request ID for tracing from the system */
    private String opcRequestId;

    /** The request ID for tracing from the system */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the
     * {@code if-match} parameter to the value of the etag from a previous get, create, or update
     * response for that resource. The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.email.model.RemoveLockDetails getBody$() {
        return removeLockDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveSenderLockRequest, com.oracle.bmc.email.model.RemoveLockDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique OCID of the sender. */
        private String senderId = null;

        /**
         * The unique OCID of the sender.
         *
         * @param senderId the value to set
         * @return this builder instance
         */
        public Builder senderId(String senderId) {
            this.senderId = senderId;
            return this;
        }

        /** Details for removing a lock from a resource. */
        private com.oracle.bmc.email.model.RemoveLockDetails removeLockDetails = null;

        /**
         * Details for removing a lock from a resource.
         *
         * @param removeLockDetails the value to set
         * @return this builder instance
         */
        public Builder removeLockDetails(
                com.oracle.bmc.email.model.RemoveLockDetails removeLockDetails) {
            this.removeLockDetails = removeLockDetails;
            return this;
        }

        /** The request ID for tracing from the system */
        private String opcRequestId = null;

        /**
         * The request ID for tracing from the system
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set
         * the {@code if-match} parameter to the value of the etag from a previous get, create, or
         * update response for that resource. The resource will be updated or deleted only if the
         * etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(RemoveSenderLockRequest o) {
            senderId(o.getSenderId());
            removeLockDetails(o.getRemoveLockDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveSenderLockRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RemoveSenderLockRequest
         */
        public RemoveSenderLockRequest build() {
            RemoveSenderLockRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.email.model.RemoveLockDetails body) {
            removeLockDetails(body);
            return this;
        }

        /**
         * Build the instance of RemoveSenderLockRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveSenderLockRequest
         */
        public RemoveSenderLockRequest buildWithoutInvocationCallback() {
            RemoveSenderLockRequest request = new RemoveSenderLockRequest();
            request.senderId = senderId;
            request.removeLockDetails = removeLockDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new RemoveSenderLockRequest(senderId, removeLockDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .senderId(senderId)
                .removeLockDetails(removeLockDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",senderId=").append(String.valueOf(this.senderId));
        sb.append(",removeLockDetails=").append(String.valueOf(this.removeLockDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveSenderLockRequest)) {
            return false;
        }

        RemoveSenderLockRequest other = (RemoveSenderLockRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.senderId, other.senderId)
                && java.util.Objects.equals(this.removeLockDetails, other.removeLockDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.senderId == null ? 43 : this.senderId.hashCode());
        result =
                (result * PRIME)
                        + (this.removeLockDetails == null ? 43 : this.removeLockDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
