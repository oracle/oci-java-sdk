/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.requests;

import com.oracle.bmc.ospgateway.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ospgateway/AuthorizeSubscriptionPaymentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * AuthorizeSubscriptionPaymentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class AuthorizeSubscriptionPaymentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentDetails> {

    /** The home region's public name of the logged in user. */
    private String ospHomeRegion;

    /** The home region's public name of the logged in user. */
    public String getOspHomeRegion() {
        return ospHomeRegion;
    }
    /** Subscription id(OCID). */
    private String subscriptionId;

    /** Subscription id(OCID). */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** subscription payment request. */
    private com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentDetails
            authorizeSubscriptionPaymentDetails;

    /** subscription payment request. */
    public com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentDetails
            getAuthorizeSubscriptionPaymentDetails() {
        return authorizeSubscriptionPaymentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * For requests that are not idempotent (creates being the main place of interest), THE APIs
     * should take a header called opc-retry-token to identify the customer desire across requests,
     * to introduce some level of idempotency.
     */
    private String opcRetryToken;

    /**
     * For requests that are not idempotent (creates being the main place of interest), THE APIs
     * should take a header called opc-retry-token to identify the customer desire across requests,
     * to introduce some level of idempotency.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
    public com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentDetails getBody$() {
        return authorizeSubscriptionPaymentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AuthorizeSubscriptionPaymentRequest,
                    com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The home region's public name of the logged in user. */
        private String ospHomeRegion = null;

        /**
         * The home region's public name of the logged in user.
         *
         * @param ospHomeRegion the value to set
         * @return this builder instance
         */
        public Builder ospHomeRegion(String ospHomeRegion) {
            this.ospHomeRegion = ospHomeRegion;
            return this;
        }

        /** Subscription id(OCID). */
        private String subscriptionId = null;

        /**
         * Subscription id(OCID).
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** subscription payment request. */
        private com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentDetails
                authorizeSubscriptionPaymentDetails = null;

        /**
         * subscription payment request.
         *
         * @param authorizeSubscriptionPaymentDetails the value to set
         * @return this builder instance
         */
        public Builder authorizeSubscriptionPaymentDetails(
                com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentDetails
                        authorizeSubscriptionPaymentDetails) {
            this.authorizeSubscriptionPaymentDetails = authorizeSubscriptionPaymentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * For requests that are not idempotent (creates being the main place of interest), THE APIs
         * should take a header called opc-retry-token to identify the customer desire across
         * requests, to introduce some level of idempotency.
         */
        private String opcRetryToken = null;

        /**
         * For requests that are not idempotent (creates being the main place of interest), THE APIs
         * should take a header called opc-retry-token to identify the customer desire across
         * requests, to introduce some level of idempotency.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
        public Builder copy(AuthorizeSubscriptionPaymentRequest o) {
            ospHomeRegion(o.getOspHomeRegion());
            subscriptionId(o.getSubscriptionId());
            compartmentId(o.getCompartmentId());
            authorizeSubscriptionPaymentDetails(o.getAuthorizeSubscriptionPaymentDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AuthorizeSubscriptionPaymentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AuthorizeSubscriptionPaymentRequest
         */
        public AuthorizeSubscriptionPaymentRequest build() {
            AuthorizeSubscriptionPaymentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.ospgateway.model.AuthorizeSubscriptionPaymentDetails body) {
            authorizeSubscriptionPaymentDetails(body);
            return this;
        }

        /**
         * Build the instance of AuthorizeSubscriptionPaymentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AuthorizeSubscriptionPaymentRequest
         */
        public AuthorizeSubscriptionPaymentRequest buildWithoutInvocationCallback() {
            AuthorizeSubscriptionPaymentRequest request = new AuthorizeSubscriptionPaymentRequest();
            request.ospHomeRegion = ospHomeRegion;
            request.subscriptionId = subscriptionId;
            request.compartmentId = compartmentId;
            request.authorizeSubscriptionPaymentDetails = authorizeSubscriptionPaymentDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new AuthorizeSubscriptionPaymentRequest(ospHomeRegion, subscriptionId, compartmentId,
            // authorizeSubscriptionPaymentDetails, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ospHomeRegion(ospHomeRegion)
                .subscriptionId(subscriptionId)
                .compartmentId(compartmentId)
                .authorizeSubscriptionPaymentDetails(authorizeSubscriptionPaymentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",ospHomeRegion=").append(String.valueOf(this.ospHomeRegion));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",authorizeSubscriptionPaymentDetails=")
                .append(String.valueOf(this.authorizeSubscriptionPaymentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof AuthorizeSubscriptionPaymentRequest)) {
            return false;
        }

        AuthorizeSubscriptionPaymentRequest other = (AuthorizeSubscriptionPaymentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ospHomeRegion, other.ospHomeRegion)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.authorizeSubscriptionPaymentDetails,
                        other.authorizeSubscriptionPaymentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ospHomeRegion == null ? 43 : this.ospHomeRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.authorizeSubscriptionPaymentDetails == null
                                ? 43
                                : this.authorizeSubscriptionPaymentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
