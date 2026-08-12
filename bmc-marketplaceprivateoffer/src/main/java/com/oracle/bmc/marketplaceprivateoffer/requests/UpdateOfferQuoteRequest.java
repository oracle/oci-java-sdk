/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.requests;

import com.oracle.bmc.marketplaceprivateoffer.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplaceprivateoffer/UpdateOfferQuoteExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateOfferQuoteRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class UpdateOfferQuoteRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.marketplaceprivateoffer.model.UpdateOfferQuoteDetails> {

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
     * The information to be updated.
     */
    private com.oracle.bmc.marketplaceprivateoffer.model.UpdateOfferQuoteDetails
            updateOfferQuoteDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.marketplaceprivateoffer.model.UpdateOfferQuoteDetails
            getUpdateOfferQuoteDetails() {
        return updateOfferQuoteDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
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
    public com.oracle.bmc.marketplaceprivateoffer.model.UpdateOfferQuoteDetails getBody$() {
        return updateOfferQuoteDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOfferQuoteRequest,
                    com.oracle.bmc.marketplaceprivateoffer.model.UpdateOfferQuoteDetails> {
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
         * The information to be updated.
         */
        private com.oracle.bmc.marketplaceprivateoffer.model.UpdateOfferQuoteDetails
                updateOfferQuoteDetails = null;

        /**
         * The information to be updated.
         * @param updateOfferQuoteDetails the value to set
         * @return this builder instance
         */
        public Builder updateOfferQuoteDetails(
                com.oracle.bmc.marketplaceprivateoffer.model.UpdateOfferQuoteDetails
                        updateOfferQuoteDetails) {
            this.updateOfferQuoteDetails = updateOfferQuoteDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateOfferQuoteRequest o) {
            offerQuoteId(o.getOfferQuoteId());
            updateOfferQuoteDetails(o.getUpdateOfferQuoteDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOfferQuoteRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateOfferQuoteRequest
         */
        public UpdateOfferQuoteRequest build() {
            UpdateOfferQuoteRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.marketplaceprivateoffer.model.UpdateOfferQuoteDetails body) {
            updateOfferQuoteDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOfferQuoteRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOfferQuoteRequest
         */
        public UpdateOfferQuoteRequest buildWithoutInvocationCallback() {
            UpdateOfferQuoteRequest request = new UpdateOfferQuoteRequest();
            request.offerQuoteId = offerQuoteId;
            request.updateOfferQuoteDetails = updateOfferQuoteDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateOfferQuoteRequest(offerQuoteId, updateOfferQuoteDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .offerQuoteId(offerQuoteId)
                .updateOfferQuoteDetails(updateOfferQuoteDetails)
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
        sb.append(",offerQuoteId=").append(String.valueOf(this.offerQuoteId));
        sb.append(",updateOfferQuoteDetails=").append(String.valueOf(this.updateOfferQuoteDetails));
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
        if (!(o instanceof UpdateOfferQuoteRequest)) {
            return false;
        }

        UpdateOfferQuoteRequest other = (UpdateOfferQuoteRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.offerQuoteId, other.offerQuoteId)
                && java.util.Objects.equals(
                        this.updateOfferQuoteDetails, other.updateOfferQuoteDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.offerQuoteId == null ? 43 : this.offerQuoteId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOfferQuoteDetails == null
                                ? 43
                                : this.updateOfferQuoteDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
