/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.requests;

import com.oracle.bmc.marketplaceprivateoffer.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplaceprivateoffer/GetQuoteAttachmentContentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetQuoteAttachmentContentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetQuoteAttachmentContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique offer quote identifier.
     */
    private String offerQuoteId;

    /**
     * Unique offer quote identifier.
     */
    public String getOfferQuoteId() {
        return offerQuoteId;
    }
    /**
     * Unique offer quote attachment identifier.
     */
    private String quoteAttachmentId;

    /**
     * Unique offer quote attachment identifier.
     */
    public String getQuoteAttachmentId() {
        return quoteAttachmentId;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetQuoteAttachmentContentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique offer quote identifier.
         */
        private String offerQuoteId = null;

        /**
         * Unique offer quote identifier.
         * @param offerQuoteId the value to set
         * @return this builder instance
         */
        public Builder offerQuoteId(String offerQuoteId) {
            this.offerQuoteId = offerQuoteId;
            return this;
        }

        /**
         * Unique offer quote attachment identifier.
         */
        private String quoteAttachmentId = null;

        /**
         * Unique offer quote attachment identifier.
         * @param quoteAttachmentId the value to set
         * @return this builder instance
         */
        public Builder quoteAttachmentId(String quoteAttachmentId) {
            this.quoteAttachmentId = quoteAttachmentId;
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
        public Builder copy(GetQuoteAttachmentContentRequest o) {
            offerQuoteId(o.getOfferQuoteId());
            quoteAttachmentId(o.getQuoteAttachmentId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetQuoteAttachmentContentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetQuoteAttachmentContentRequest
         */
        public GetQuoteAttachmentContentRequest build() {
            GetQuoteAttachmentContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetQuoteAttachmentContentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetQuoteAttachmentContentRequest
         */
        public GetQuoteAttachmentContentRequest buildWithoutInvocationCallback() {
            GetQuoteAttachmentContentRequest request = new GetQuoteAttachmentContentRequest();
            request.offerQuoteId = offerQuoteId;
            request.quoteAttachmentId = quoteAttachmentId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetQuoteAttachmentContentRequest(offerQuoteId, quoteAttachmentId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .offerQuoteId(offerQuoteId)
                .quoteAttachmentId(quoteAttachmentId)
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
        sb.append(",offerQuoteId=").append(String.valueOf(this.offerQuoteId));
        sb.append(",quoteAttachmentId=").append(String.valueOf(this.quoteAttachmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetQuoteAttachmentContentRequest)) {
            return false;
        }

        GetQuoteAttachmentContentRequest other = (GetQuoteAttachmentContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.offerQuoteId, other.offerQuoteId)
                && java.util.Objects.equals(this.quoteAttachmentId, other.quoteAttachmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.offerQuoteId == null ? 43 : this.offerQuoteId.hashCode());
        result =
                (result * PRIME)
                        + (this.quoteAttachmentId == null ? 43 : this.quoteAttachmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
