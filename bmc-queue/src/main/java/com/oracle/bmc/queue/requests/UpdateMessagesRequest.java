/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.requests;

import com.oracle.bmc.queue.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/queue/UpdateMessagesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateMessagesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class UpdateMessagesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.queue.model.UpdateMessagesDetails> {

    /** The unique queue identifier. */
    private String queueId;

    /** The unique queue identifier. */
    public String getQueueId() {
        return queueId;
    }
    /** Details for the messages to update. */
    private com.oracle.bmc.queue.model.UpdateMessagesDetails updateMessagesDetails;

    /** Details for the messages to update. */
    public com.oracle.bmc.queue.model.UpdateMessagesDetails getUpdateMessagesDetails() {
        return updateMessagesDetails;
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
    public com.oracle.bmc.queue.model.UpdateMessagesDetails getBody$() {
        return updateMessagesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMessagesRequest, com.oracle.bmc.queue.model.UpdateMessagesDetails> {
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

        /** Details for the messages to update. */
        private com.oracle.bmc.queue.model.UpdateMessagesDetails updateMessagesDetails = null;

        /**
         * Details for the messages to update.
         *
         * @param updateMessagesDetails the value to set
         * @return this builder instance
         */
        public Builder updateMessagesDetails(
                com.oracle.bmc.queue.model.UpdateMessagesDetails updateMessagesDetails) {
            this.updateMessagesDetails = updateMessagesDetails;
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
        public Builder copy(UpdateMessagesRequest o) {
            queueId(o.getQueueId());
            updateMessagesDetails(o.getUpdateMessagesDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMessagesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateMessagesRequest
         */
        public UpdateMessagesRequest build() {
            UpdateMessagesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.queue.model.UpdateMessagesDetails body) {
            updateMessagesDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMessagesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMessagesRequest
         */
        public UpdateMessagesRequest buildWithoutInvocationCallback() {
            UpdateMessagesRequest request = new UpdateMessagesRequest();
            request.queueId = queueId;
            request.updateMessagesDetails = updateMessagesDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMessagesRequest(queueId, updateMessagesDetails, opcRequestId);
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
                .updateMessagesDetails(updateMessagesDetails)
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
        sb.append(",updateMessagesDetails=").append(String.valueOf(this.updateMessagesDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMessagesRequest)) {
            return false;
        }

        UpdateMessagesRequest other = (UpdateMessagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.queueId, other.queueId)
                && java.util.Objects.equals(this.updateMessagesDetails, other.updateMessagesDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.queueId == null ? 43 : this.queueId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMessagesDetails == null
                                ? 43
                                : this.updateMessagesDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
