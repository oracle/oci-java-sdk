/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/email/ChangeSenderCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeSenderCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
public class ChangeSenderCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.email.model.ChangeSenderCompartmentDetails> {

    /**
     * The unique OCID of the sender.
     */
    private String senderId;

    /**
     * The unique OCID of the sender.
     */
    public String getSenderId() {
        return senderId;
    }
    /**
     * Details for moving a sender into a different compartment.
     */
    private com.oracle.bmc.email.model.ChangeSenderCompartmentDetails
            changeSenderCompartmentDetails;

    /**
     * Details for moving a sender into a different compartment.
     */
    public com.oracle.bmc.email.model.ChangeSenderCompartmentDetails
            getChangeSenderCompartmentDetails() {
        return changeSenderCompartmentDetails;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The request ID for tracing from the system
     */
    private String opcRequestId;

    /**
     * The request ID for tracing from the system
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
    public com.oracle.bmc.email.model.ChangeSenderCompartmentDetails getBody$() {
        return changeSenderCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeSenderCompartmentRequest,
                    com.oracle.bmc.email.model.ChangeSenderCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique OCID of the sender.
         */
        private String senderId = null;

        /**
         * The unique OCID of the sender.
         * @param senderId the value to set
         * @return this builder instance
         */
        public Builder senderId(String senderId) {
            this.senderId = senderId;
            return this;
        }

        /**
         * Details for moving a sender into a different compartment.
         */
        private com.oracle.bmc.email.model.ChangeSenderCompartmentDetails
                changeSenderCompartmentDetails = null;

        /**
         * Details for moving a sender into a different compartment.
         * @param changeSenderCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeSenderCompartmentDetails(
                com.oracle.bmc.email.model.ChangeSenderCompartmentDetails
                        changeSenderCompartmentDetails) {
            this.changeSenderCompartmentDetails = changeSenderCompartmentDetails;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The request ID for tracing from the system
         */
        private String opcRequestId = null;

        /**
         * The request ID for tracing from the system
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
        public Builder copy(ChangeSenderCompartmentRequest o) {
            senderId(o.getSenderId());
            changeSenderCompartmentDetails(o.getChangeSenderCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeSenderCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeSenderCompartmentRequest
         */
        public ChangeSenderCompartmentRequest build() {
            ChangeSenderCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.email.model.ChangeSenderCompartmentDetails body) {
            changeSenderCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeSenderCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeSenderCompartmentRequest
         */
        public ChangeSenderCompartmentRequest buildWithoutInvocationCallback() {
            ChangeSenderCompartmentRequest request = new ChangeSenderCompartmentRequest();
            request.senderId = senderId;
            request.changeSenderCompartmentDetails = changeSenderCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeSenderCompartmentRequest(senderId, changeSenderCompartmentDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .senderId(senderId)
                .changeSenderCompartmentDetails(changeSenderCompartmentDetails)
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
        sb.append(",senderId=").append(String.valueOf(this.senderId));
        sb.append(",changeSenderCompartmentDetails=")
                .append(String.valueOf(this.changeSenderCompartmentDetails));
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
        if (!(o instanceof ChangeSenderCompartmentRequest)) {
            return false;
        }

        ChangeSenderCompartmentRequest other = (ChangeSenderCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.senderId, other.senderId)
                && java.util.Objects.equals(
                        this.changeSenderCompartmentDetails, other.changeSenderCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.senderId == null ? 43 : this.senderId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeSenderCompartmentDetails == null
                                ? 43
                                : this.changeSenderCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
