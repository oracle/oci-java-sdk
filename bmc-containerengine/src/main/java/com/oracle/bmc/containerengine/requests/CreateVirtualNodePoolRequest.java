/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerengine/CreateVirtualNodePoolExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateVirtualNodePoolRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class CreateVirtualNodePoolRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.containerengine.model.CreateVirtualNodePoolDetails> {

    /**
     * The details of the virtual node pool to create.
     */
    private com.oracle.bmc.containerengine.model.CreateVirtualNodePoolDetails
            createVirtualNodePoolDetails;

    /**
     * The details of the virtual node pool to create.
     */
    public com.oracle.bmc.containerengine.model.CreateVirtualNodePoolDetails
            getCreateVirtualNodePoolDetails() {
        return createVirtualNodePoolDetails;
    }
    /**
     * A token you supply to uniquely identify the request and provide idempotency if
     * the request is retried. Idempotency tokens expire after 24 hours.
     *
     */
    private String opcRetryToken;

    /**
     * A token you supply to uniquely identify the request and provide idempotency if
     * the request is retried. Idempotency tokens expire after 24 hours.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
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
    public com.oracle.bmc.containerengine.model.CreateVirtualNodePoolDetails getBody$() {
        return createVirtualNodePoolDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateVirtualNodePoolRequest,
                    com.oracle.bmc.containerengine.model.CreateVirtualNodePoolDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The details of the virtual node pool to create.
         */
        private com.oracle.bmc.containerengine.model.CreateVirtualNodePoolDetails
                createVirtualNodePoolDetails = null;

        /**
         * The details of the virtual node pool to create.
         * @param createVirtualNodePoolDetails the value to set
         * @return this builder instance
         */
        public Builder createVirtualNodePoolDetails(
                com.oracle.bmc.containerengine.model.CreateVirtualNodePoolDetails
                        createVirtualNodePoolDetails) {
            this.createVirtualNodePoolDetails = createVirtualNodePoolDetails;
            return this;
        }

        /**
         * A token you supply to uniquely identify the request and provide idempotency if
         * the request is retried. Idempotency tokens expire after 24 hours.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token you supply to uniquely identify the request and provide idempotency if
         * the request is retried. Idempotency tokens expire after 24 hours.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
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
        public Builder copy(CreateVirtualNodePoolRequest o) {
            createVirtualNodePoolDetails(o.getCreateVirtualNodePoolDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateVirtualNodePoolRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateVirtualNodePoolRequest
         */
        public CreateVirtualNodePoolRequest build() {
            CreateVirtualNodePoolRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.containerengine.model.CreateVirtualNodePoolDetails body) {
            createVirtualNodePoolDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateVirtualNodePoolRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateVirtualNodePoolRequest
         */
        public CreateVirtualNodePoolRequest buildWithoutInvocationCallback() {
            CreateVirtualNodePoolRequest request = new CreateVirtualNodePoolRequest();
            request.createVirtualNodePoolDetails = createVirtualNodePoolDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateVirtualNodePoolRequest(createVirtualNodePoolDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createVirtualNodePoolDetails(createVirtualNodePoolDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createVirtualNodePoolDetails=")
                .append(String.valueOf(this.createVirtualNodePoolDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVirtualNodePoolRequest)) {
            return false;
        }

        CreateVirtualNodePoolRequest other = (CreateVirtualNodePoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createVirtualNodePoolDetails, other.createVirtualNodePoolDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createVirtualNodePoolDetails == null
                                ? 43
                                : this.createVirtualNodePoolDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
