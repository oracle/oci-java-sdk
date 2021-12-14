/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.requests;

import com.oracle.bmc.ospgateway.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ospgateway/PayInvoiceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PayInvoiceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class PayInvoiceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ospgateway.model.PayInvoiceDetails> {

    /**
     * The home region's public name of the logged in user.
     *
     */
    private String ospHomeRegion;

    /**
     * The identifier of the invoice.
     */
    private String internalInvoiceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     *
     */
    private String compartmentId;

    /**
     * Invoice payment request.
     */
    private com.oracle.bmc.ospgateway.model.PayInvoiceDetails payInvoiceDetails;

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
     * For requests that are not idempotent (creates being the main place of interest), THE APIs should take a header
     * called opc-retry-token to identify the customer desire across requests, to introduce some level of idempotency.
     *
     */
    private String opcRetryToken;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

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
    }
}
