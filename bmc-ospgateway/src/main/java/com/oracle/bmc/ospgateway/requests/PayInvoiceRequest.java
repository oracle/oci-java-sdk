/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.requests;

import com.oracle.bmc.ospgateway.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ospgateway/PayInvoiceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PayInvoiceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class PayInvoiceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ospgateway.model.PayInvoiceDetails> {

    /**
     * The home region's public name of the logged in user.
     *
     */
    private String ospHomeRegion;

    /**
     * The home region's public name of the logged in user.
     *
     */
    public String getOspHomeRegion() {
        return ospHomeRegion;
    }
    /**
     * The identifier of the invoice.
     */
    private String internalInvoiceId;

    /**
     * The identifier of the invoice.
     */
    public String getInternalInvoiceId() {
        return internalInvoiceId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Invoice payment request.
     */
    private com.oracle.bmc.ospgateway.model.PayInvoiceDetails payInvoiceDetails;

    /**
     * Invoice payment request.
     */
    public com.oracle.bmc.ospgateway.model.PayInvoiceDetails getPayInvoiceDetails() {
        return payInvoiceDetails;
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
     * For requests that are not idempotent (creates being the main place of interest), THE APIs should take a header
     * called opc-retry-token to identify the customer desire across requests, to introduce some level of idempotency.
     *
     */
    private String opcRetryToken;

    /**
     * For requests that are not idempotent (creates being the main place of interest), THE APIs should take a header
     * called opc-retry-token to identify the customer desire across requests, to introduce some level of idempotency.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.ospgateway.model.PayInvoiceDetails getBody$() {
        return payInvoiceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PayInvoiceRequest, com.oracle.bmc.ospgateway.model.PayInvoiceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The home region's public name of the logged in user.
         *
         */
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

        /**
         * The identifier of the invoice.
         */
        private String internalInvoiceId = null;

        /**
         * The identifier of the invoice.
         * @param internalInvoiceId the value to set
         * @return this builder instance
         */
        public Builder internalInvoiceId(String internalInvoiceId) {
            this.internalInvoiceId = internalInvoiceId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         *
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Invoice payment request.
         */
        private com.oracle.bmc.ospgateway.model.PayInvoiceDetails payInvoiceDetails = null;

        /**
         * Invoice payment request.
         * @param payInvoiceDetails the value to set
         * @return this builder instance
         */
        public Builder payInvoiceDetails(
                com.oracle.bmc.ospgateway.model.PayInvoiceDetails payInvoiceDetails) {
            this.payInvoiceDetails = payInvoiceDetails;
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
         * For requests that are not idempotent (creates being the main place of interest), THE APIs should take a header
         * called opc-retry-token to identify the customer desire across requests, to introduce some level of idempotency.
         *
         */
        private String opcRetryToken = null;

        /**
         * For requests that are not idempotent (creates being the main place of interest), THE APIs should take a header
         * called opc-retry-token to identify the customer desire across requests, to introduce some level of idempotency.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
        public Builder copy(PayInvoiceRequest o) {
            ospHomeRegion(o.getOspHomeRegion());
            internalInvoiceId(o.getInternalInvoiceId());
            compartmentId(o.getCompartmentId());
            payInvoiceDetails(o.getPayInvoiceDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PayInvoiceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PayInvoiceRequest
         */
        public PayInvoiceRequest build() {
            PayInvoiceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.ospgateway.model.PayInvoiceDetails body) {
            payInvoiceDetails(body);
            return this;
        }

        /**
         * Build the instance of PayInvoiceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PayInvoiceRequest
         */
        public PayInvoiceRequest buildWithoutInvocationCallback() {
            PayInvoiceRequest request = new PayInvoiceRequest();
            request.ospHomeRegion = ospHomeRegion;
            request.internalInvoiceId = internalInvoiceId;
            request.compartmentId = compartmentId;
            request.payInvoiceDetails = payInvoiceDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new PayInvoiceRequest(ospHomeRegion, internalInvoiceId, compartmentId, payInvoiceDetails, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ospHomeRegion(ospHomeRegion)
                .internalInvoiceId(internalInvoiceId)
                .compartmentId(compartmentId)
                .payInvoiceDetails(payInvoiceDetails)
                .ifMatch(ifMatch)
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
        sb.append(",ospHomeRegion=").append(String.valueOf(this.ospHomeRegion));
        sb.append(",internalInvoiceId=").append(String.valueOf(this.internalInvoiceId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",payInvoiceDetails=").append(String.valueOf(this.payInvoiceDetails));
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
        if (!(o instanceof PayInvoiceRequest)) {
            return false;
        }

        PayInvoiceRequest other = (PayInvoiceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ospHomeRegion, other.ospHomeRegion)
                && java.util.Objects.equals(this.internalInvoiceId, other.internalInvoiceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.payInvoiceDetails, other.payInvoiceDetails)
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
                        + (this.internalInvoiceId == null ? 43 : this.internalInvoiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.payInvoiceDetails == null ? 43 : this.payInvoiceDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
