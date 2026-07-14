/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/CreateInfrastructureExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateInfrastructureRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class CreateInfrastructureRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacc.model.CreateInfrastructureDetails> {

    /** New Database Infrastructure details. */
    private com.oracle.bmc.datacc.model.CreateInfrastructureDetails createInfrastructureDetails;

    /** New Database Infrastructure details. */
    public com.oracle.bmc.datacc.model.CreateInfrastructureDetails
            getCreateInfrastructureDetails() {
        return createInfrastructureDetails;
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
    public com.oracle.bmc.datacc.model.CreateInfrastructureDetails getBody$() {
        return createInfrastructureDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateInfrastructureRequest,
                    com.oracle.bmc.datacc.model.CreateInfrastructureDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** New Database Infrastructure details. */
        private com.oracle.bmc.datacc.model.CreateInfrastructureDetails
                createInfrastructureDetails = null;

        /**
         * New Database Infrastructure details.
         *
         * @param createInfrastructureDetails the value to set
         * @return this builder instance
         */
        public Builder createInfrastructureDetails(
                com.oracle.bmc.datacc.model.CreateInfrastructureDetails
                        createInfrastructureDetails) {
            this.createInfrastructureDetails = createInfrastructureDetails;
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
        public Builder copy(CreateInfrastructureRequest o) {
            createInfrastructureDetails(o.getCreateInfrastructureDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateInfrastructureRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateInfrastructureRequest
         */
        public CreateInfrastructureRequest build() {
            CreateInfrastructureRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacc.model.CreateInfrastructureDetails body) {
            createInfrastructureDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateInfrastructureRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateInfrastructureRequest
         */
        public CreateInfrastructureRequest buildWithoutInvocationCallback() {
            CreateInfrastructureRequest request = new CreateInfrastructureRequest();
            request.createInfrastructureDetails = createInfrastructureDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateInfrastructureRequest(createInfrastructureDetails, opcRetryToken,
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
                .createInfrastructureDetails(createInfrastructureDetails)
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
        sb.append(",createInfrastructureDetails=")
                .append(String.valueOf(this.createInfrastructureDetails));
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
        if (!(o instanceof CreateInfrastructureRequest)) {
            return false;
        }

        CreateInfrastructureRequest other = (CreateInfrastructureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createInfrastructureDetails, other.createInfrastructureDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createInfrastructureDetails == null
                                ? 43
                                : this.createInfrastructureDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
