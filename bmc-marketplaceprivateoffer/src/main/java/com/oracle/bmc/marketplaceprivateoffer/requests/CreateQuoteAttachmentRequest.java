/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.requests;

import com.oracle.bmc.marketplaceprivateoffer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplaceprivateoffer/CreateQuoteAttachmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateQuoteAttachmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class CreateQuoteAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.marketplaceprivateoffer.model.CreateQuoteAttachmentDetails> {

    /** Unique offer quote identifier. */
    private String offerQuoteId;

    /** Unique offer quote identifier. */
    public String getOfferQuoteId() {
        return offerQuoteId;
    }
    /** Details for the new offer quote attachment. */
    private com.oracle.bmc.marketplaceprivateoffer.model.CreateQuoteAttachmentDetails
            createQuoteAttachmentDetails;

    /** Details for the new offer quote attachment. */
    public com.oracle.bmc.marketplaceprivateoffer.model.CreateQuoteAttachmentDetails
            getCreateQuoteAttachmentDetails() {
        return createQuoteAttachmentDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.marketplaceprivateoffer.model.CreateQuoteAttachmentDetails getBody$() {
        return createQuoteAttachmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateQuoteAttachmentRequest,
                    com.oracle.bmc.marketplaceprivateoffer.model.CreateQuoteAttachmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique offer quote identifier. */
        private String offerQuoteId = null;

        /**
         * Unique offer quote identifier.
         *
         * @param offerQuoteId the value to set
         * @return this builder instance
         */
        public Builder offerQuoteId(String offerQuoteId) {
            this.offerQuoteId = offerQuoteId;
            return this;
        }

        /** Details for the new offer quote attachment. */
        private com.oracle.bmc.marketplaceprivateoffer.model.CreateQuoteAttachmentDetails
                createQuoteAttachmentDetails = null;

        /**
         * Details for the new offer quote attachment.
         *
         * @param createQuoteAttachmentDetails the value to set
         * @return this builder instance
         */
        public Builder createQuoteAttachmentDetails(
                com.oracle.bmc.marketplaceprivateoffer.model.CreateQuoteAttachmentDetails
                        createQuoteAttachmentDetails) {
            this.createQuoteAttachmentDetails = createQuoteAttachmentDetails;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateQuoteAttachmentRequest o) {
            offerQuoteId(o.getOfferQuoteId());
            createQuoteAttachmentDetails(o.getCreateQuoteAttachmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateQuoteAttachmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateQuoteAttachmentRequest
         */
        public CreateQuoteAttachmentRequest build() {
            CreateQuoteAttachmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.marketplaceprivateoffer.model.CreateQuoteAttachmentDetails body) {
            createQuoteAttachmentDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateQuoteAttachmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateQuoteAttachmentRequest
         */
        public CreateQuoteAttachmentRequest buildWithoutInvocationCallback() {
            CreateQuoteAttachmentRequest request = new CreateQuoteAttachmentRequest();
            request.offerQuoteId = offerQuoteId;
            request.createQuoteAttachmentDetails = createQuoteAttachmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateQuoteAttachmentRequest(offerQuoteId, createQuoteAttachmentDetails,
            // opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .offerQuoteId(offerQuoteId)
                .createQuoteAttachmentDetails(createQuoteAttachmentDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",offerQuoteId=").append(String.valueOf(this.offerQuoteId));
        sb.append(",createQuoteAttachmentDetails=")
                .append(String.valueOf(this.createQuoteAttachmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateQuoteAttachmentRequest)) {
            return false;
        }

        CreateQuoteAttachmentRequest other = (CreateQuoteAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.offerQuoteId, other.offerQuoteId)
                && java.util.Objects.equals(
                        this.createQuoteAttachmentDetails, other.createQuoteAttachmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.offerQuoteId == null ? 43 : this.offerQuoteId.hashCode());
        result =
                (result * PRIME)
                        + (this.createQuoteAttachmentDetails == null
                                ? 43
                                : this.createQuoteAttachmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
