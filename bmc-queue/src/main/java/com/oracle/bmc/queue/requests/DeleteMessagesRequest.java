/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.requests;

import com.oracle.bmc.queue.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/DeleteMessagesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteMessagesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class DeleteMessagesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.queue.model.DeleteMessagesDetails> {

    /** The unique queue identifier. */
    private String queueId;

    /** The unique queue identifier. */
    public String getQueueId() {
        return queueId;
    }
    /** Details for the messages to delete. */
    private com.oracle.bmc.queue.model.DeleteMessagesDetails deleteMessagesDetails;

    /** Details for the messages to delete. */
    public com.oracle.bmc.queue.model.DeleteMessagesDetails getDeleteMessagesDetails() {
        return deleteMessagesDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.queue.model.DeleteMessagesDetails getBody$() {
        return deleteMessagesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteMessagesRequest, com.oracle.bmc.queue.model.DeleteMessagesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique queue identifier. */
        private String queueId = null;

        /**
         * The unique queue identifier.
         *
         * @param queueId the value to set
         * @return this builder instance
         */
        public Builder queueId(String queueId) {
            this.queueId = queueId;
            return this;
        }

        /** Details for the messages to delete. */
        private com.oracle.bmc.queue.model.DeleteMessagesDetails deleteMessagesDetails = null;

        /**
         * Details for the messages to delete.
         *
         * @param deleteMessagesDetails the value to set
         * @return this builder instance
         */
        public Builder deleteMessagesDetails(
                com.oracle.bmc.queue.model.DeleteMessagesDetails deleteMessagesDetails) {
            this.deleteMessagesDetails = deleteMessagesDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(DeleteMessagesRequest o) {
            queueId(o.getQueueId());
            deleteMessagesDetails(o.getDeleteMessagesDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteMessagesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteMessagesRequest
         */
        public DeleteMessagesRequest build() {
            DeleteMessagesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.queue.model.DeleteMessagesDetails body) {
            deleteMessagesDetails(body);
            return this;
        }

        /**
         * Build the instance of DeleteMessagesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteMessagesRequest
         */
        public DeleteMessagesRequest buildWithoutInvocationCallback() {
            DeleteMessagesRequest request = new DeleteMessagesRequest();
            request.queueId = queueId;
            request.deleteMessagesDetails = deleteMessagesDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteMessagesRequest(queueId, deleteMessagesDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .queueId(queueId)
                .deleteMessagesDetails(deleteMessagesDetails)
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
        sb.append(",queueId=").append(String.valueOf(this.queueId));
        sb.append(",deleteMessagesDetails=").append(String.valueOf(this.deleteMessagesDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteMessagesRequest)) {
            return false;
        }

        DeleteMessagesRequest other = (DeleteMessagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.queueId, other.queueId)
                && java.util.Objects.equals(this.deleteMessagesDetails, other.deleteMessagesDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.queueId == null ? 43 : this.queueId.hashCode());
        result =
                (result * PRIME)
                        + (this.deleteMessagesDetails == null
                                ? 43
                                : this.deleteMessagesDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
