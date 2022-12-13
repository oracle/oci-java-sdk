/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.requests;

import com.oracle.bmc.queue.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/UpdateMessageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateMessageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class UpdateMessageRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.queue.model.UpdateMessageDetails> {

    /**
     * unique Queue identifier
     */
    private String queueId;

    /**
     * unique Queue identifier
     */
    public String getQueueId() {
        return queueId;
    }
    /**
     * The receipt of the message retrieved from a GetMessages call.
     */
    private String messageReceipt;

    /**
     * The receipt of the message retrieved from a GetMessages call.
     */
    public String getMessageReceipt() {
        return messageReceipt;
    }
    /**
     * Details for the message to update.
     */
    private com.oracle.bmc.queue.model.UpdateMessageDetails updateMessageDetails;

    /**
     * Details for the message to update.
     */
    public com.oracle.bmc.queue.model.UpdateMessageDetails getUpdateMessageDetails() {
        return updateMessageDetails;
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
    public com.oracle.bmc.queue.model.UpdateMessageDetails getBody$() {
        return updateMessageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMessageRequest, com.oracle.bmc.queue.model.UpdateMessageDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * unique Queue identifier
         */
        private String queueId = null;

        /**
         * unique Queue identifier
         * @param queueId the value to set
         * @return this builder instance
         */
        public Builder queueId(String queueId) {
            this.queueId = queueId;
            return this;
        }

        /**
         * The receipt of the message retrieved from a GetMessages call.
         */
        private String messageReceipt = null;

        /**
         * The receipt of the message retrieved from a GetMessages call.
         * @param messageReceipt the value to set
         * @return this builder instance
         */
        public Builder messageReceipt(String messageReceipt) {
            this.messageReceipt = messageReceipt;
            return this;
        }

        /**
         * Details for the message to update.
         */
        private com.oracle.bmc.queue.model.UpdateMessageDetails updateMessageDetails = null;

        /**
         * Details for the message to update.
         * @param updateMessageDetails the value to set
         * @return this builder instance
         */
        public Builder updateMessageDetails(
                com.oracle.bmc.queue.model.UpdateMessageDetails updateMessageDetails) {
            this.updateMessageDetails = updateMessageDetails;
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
        public Builder copy(UpdateMessageRequest o) {
            queueId(o.getQueueId());
            messageReceipt(o.getMessageReceipt());
            updateMessageDetails(o.getUpdateMessageDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMessageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateMessageRequest
         */
        public UpdateMessageRequest build() {
            UpdateMessageRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.queue.model.UpdateMessageDetails body) {
            updateMessageDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMessageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMessageRequest
         */
        public UpdateMessageRequest buildWithoutInvocationCallback() {
            UpdateMessageRequest request = new UpdateMessageRequest();
            request.queueId = queueId;
            request.messageReceipt = messageReceipt;
            request.updateMessageDetails = updateMessageDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMessageRequest(queueId, messageReceipt, updateMessageDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .queueId(queueId)
                .messageReceipt(messageReceipt)
                .updateMessageDetails(updateMessageDetails)
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
        sb.append(",queueId=").append(String.valueOf(this.queueId));
        sb.append(",messageReceipt=").append(String.valueOf(this.messageReceipt));
        sb.append(",updateMessageDetails=").append(String.valueOf(this.updateMessageDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMessageRequest)) {
            return false;
        }

        UpdateMessageRequest other = (UpdateMessageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.queueId, other.queueId)
                && java.util.Objects.equals(this.messageReceipt, other.messageReceipt)
                && java.util.Objects.equals(this.updateMessageDetails, other.updateMessageDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.queueId == null ? 43 : this.queueId.hashCode());
        result =
                (result * PRIME)
                        + (this.messageReceipt == null ? 43 : this.messageReceipt.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMessageDetails == null
                                ? 43
                                : this.updateMessageDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
