/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/CreateVmClusterNetworkExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateVmClusterNetworkRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class CreateVmClusterNetworkRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails> {

    /** New VM cluster network details. */
    private com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails createVmClusterNetworkDetails;

    /** New VM cluster network details. */
    public com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails
            getCreateVmClusterNetworkDetails() {
        return createVmClusterNetworkDetails;
    }
    /**
     * A token that uniquely identifies a request, so the request can be retried without risk of
     * processing that same action again, in the event of a timeout or server error. Retry tokens
     * expire after 24 hours, but can be invalidated before then due to conflicting operations. For
     * example, if a resource was deleted and purged from the system, then a retry of the original
     * creation request can be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request, so the request can be retried without risk of
     * processing that same action again, in the event of a timeout or server error. Retry tokens
     * expire after 24 hours, but can be invalidated before then due to conflicting operations. For
     * example, if a resource was deleted and purged from the system, then a retry of the original
     * creation request can be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request identifier. */
    private String opcRequestId;

    /** The client request identifier. */
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
    public com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails getBody$() {
        return createVmClusterNetworkDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateVmClusterNetworkRequest,
                    com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** New VM cluster network details. */
        private com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails
                createVmClusterNetworkDetails = null;

        /**
         * New VM cluster network details.
         *
         * @param createVmClusterNetworkDetails the value to set
         * @return this builder instance
         */
        public Builder createVmClusterNetworkDetails(
                com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails
                        createVmClusterNetworkDetails) {
            this.createVmClusterNetworkDetails = createVmClusterNetworkDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request, so the request can be retried without risk of
         * processing that same action again, in the event of a timeout or server error. Retry
         * tokens expire after 24 hours, but can be invalidated before then due to conflicting
         * operations. For example, if a resource was deleted and purged from the system, then a
         * retry of the original creation request can be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request, so the request can be retried without risk of
         * processing that same action again, in the event of a timeout or server error. Retry
         * tokens expire after 24 hours, but can be invalidated before then due to conflicting
         * operations. For example, if a resource was deleted and purged from the system, then a
         * retry of the original creation request can be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /** The client request identifier. */
        private String opcRequestId = null;

        /**
         * The client request identifier.
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
        public Builder copy(CreateVmClusterNetworkRequest o) {
            createVmClusterNetworkDetails(o.getCreateVmClusterNetworkDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateVmClusterNetworkRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateVmClusterNetworkRequest
         */
        public CreateVmClusterNetworkRequest build() {
            CreateVmClusterNetworkRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacc.model.CreateVmClusterNetworkDetails body) {
            createVmClusterNetworkDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateVmClusterNetworkRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateVmClusterNetworkRequest
         */
        public CreateVmClusterNetworkRequest buildWithoutInvocationCallback() {
            CreateVmClusterNetworkRequest request = new CreateVmClusterNetworkRequest();
            request.createVmClusterNetworkDetails = createVmClusterNetworkDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateVmClusterNetworkRequest(createVmClusterNetworkDetails, opcRetryToken,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createVmClusterNetworkDetails(createVmClusterNetworkDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createVmClusterNetworkDetails=")
                .append(String.valueOf(this.createVmClusterNetworkDetails));
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
        if (!(o instanceof CreateVmClusterNetworkRequest)) {
            return false;
        }

        CreateVmClusterNetworkRequest other = (CreateVmClusterNetworkRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createVmClusterNetworkDetails, other.createVmClusterNetworkDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createVmClusterNetworkDetails == null
                                ? 43
                                : this.createVmClusterNetworkDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
