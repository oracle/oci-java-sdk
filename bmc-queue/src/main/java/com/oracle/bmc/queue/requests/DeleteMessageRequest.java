/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.requests;

import com.oracle.bmc.queue.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/DeleteMessageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteMessageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class DeleteMessageRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique queue identifier. */
    private String queueId;

    /** The unique queue identifier. */
    public String getQueueId() {
        return queueId;
    }
    /** The receipt of the message retrieved from a GetMessages call. */
    private String messageReceipt;

    /** The receipt of the message retrieved from a GetMessages call. */
    public String getMessageReceipt() {
        return messageReceipt;
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
    /** Optional parameter to specify a consumer group. */
    private String consumerGroupId;

    /** Optional parameter to specify a consumer group. */
    public String getConsumerGroupId() {
        return consumerGroupId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteMessageRequest, java.lang.Void> {
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

        /** The receipt of the message retrieved from a GetMessages call. */
        private String messageReceipt = null;

        /**
         * The receipt of the message retrieved from a GetMessages call.
         *
         * @param messageReceipt the value to set
         * @return this builder instance
         */
        public Builder messageReceipt(String messageReceipt) {
            this.messageReceipt = messageReceipt;
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

        /** Optional parameter to specify a consumer group. */
        private String consumerGroupId = null;

        /**
         * Optional parameter to specify a consumer group.
         *
         * @param consumerGroupId the value to set
         * @return this builder instance
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
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
        public Builder copy(DeleteMessageRequest o) {
            queueId(o.getQueueId());
            messageReceipt(o.getMessageReceipt());
            opcRequestId(o.getOpcRequestId());
            consumerGroupId(o.getConsumerGroupId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteMessageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteMessageRequest
         */
        public DeleteMessageRequest build() {
            DeleteMessageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteMessageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteMessageRequest
         */
        public DeleteMessageRequest buildWithoutInvocationCallback() {
            DeleteMessageRequest request = new DeleteMessageRequest();
            request.queueId = queueId;
            request.messageReceipt = messageReceipt;
            request.opcRequestId = opcRequestId;
            request.consumerGroupId = consumerGroupId;
            return request;
            // new DeleteMessageRequest(queueId, messageReceipt, opcRequestId, consumerGroupId);
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
                .messageReceipt(messageReceipt)
                .opcRequestId(opcRequestId)
                .consumerGroupId(consumerGroupId);
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
        sb.append(",messageReceipt=").append(String.valueOf(this.messageReceipt));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",consumerGroupId=").append(String.valueOf(this.consumerGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteMessageRequest)) {
            return false;
        }

        DeleteMessageRequest other = (DeleteMessageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.queueId, other.queueId)
                && java.util.Objects.equals(this.messageReceipt, other.messageReceipt)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.consumerGroupId, other.consumerGroupId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.queueId == null ? 43 : this.queueId.hashCode());
        result =
                (result * PRIME)
                        + (this.messageReceipt == null ? 43 : this.messageReceipt.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.consumerGroupId == null ? 43 : this.consumerGroupId.hashCode());
        return result;
    }
}
