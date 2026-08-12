/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.requests;

import com.oracle.bmc.self.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/self/SubmitSubscriptionUsageBatchExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SubmitSubscriptionUsageBatchRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
public class SubmitSubscriptionUsageBatchRequest
        extends com.oracle.bmc.requests.BmcRequest<java.io.InputStream> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment associated with the usage records request.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment associated with the usage records request.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * UTF-8 CSV file with no more than 10,000 usage records and a maximum size of 50 MB.
     * Required columns are {@code MarketplaceOfferId}, {@code Id}, {@code Amount}, {@code CurrencyCode},
     * {@code UsageStartTime}, {@code UsageEndTime}, and {@code UsageDimensionName}.
     * Optional columns are {@code ConsumedQuantity}, {@code CustomerTenancyId},
     * {@code BillingIdentifier}, {@code ProductSku}, {@code UnitOfMeasure}, {@code UnitPrice},
     * {@code ContractDuration}, and {@code AdditionalMetadata}.
     * When provided in CSV, {@code AdditionalMetadata} must be a JSON array of {@code ExtendedMetadata}
     * objects. {@code MarketplaceOfferId} must be a subscription or private offer OCID.
     *
     */
    private java.io.InputStream submitSubscriptionUsageBatchDetails;

    /**
     * UTF-8 CSV file with no more than 10,000 usage records and a maximum size of 50 MB.
     * Required columns are {@code MarketplaceOfferId}, {@code Id}, {@code Amount}, {@code CurrencyCode},
     * {@code UsageStartTime}, {@code UsageEndTime}, and {@code UsageDimensionName}.
     * Optional columns are {@code ConsumedQuantity}, {@code CustomerTenancyId},
     * {@code BillingIdentifier}, {@code ProductSku}, {@code UnitOfMeasure}, {@code UnitPrice},
     * {@code ContractDuration}, and {@code AdditionalMetadata}.
     * When provided in CSV, {@code AdditionalMetadata} must be a JSON array of {@code ExtendedMetadata}
     * objects. {@code MarketplaceOfferId} must be a subscription or private offer OCID.
     *
     */
    public java.io.InputStream getSubmitSubscriptionUsageBatchDetails() {
        return submitSubscriptionUsageBatchDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and removed from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of running that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and removed from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
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
    public java.io.InputStream getBody$() {
        return submitSubscriptionUsageBatchDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SubmitSubscriptionUsageBatchRequest, java.io.InputStream> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment associated with the usage records request.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment associated with the usage records request.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * UTF-8 CSV file with no more than 10,000 usage records and a maximum size of 50 MB.
         * Required columns are {@code MarketplaceOfferId}, {@code Id}, {@code Amount}, {@code CurrencyCode},
         * {@code UsageStartTime}, {@code UsageEndTime}, and {@code UsageDimensionName}.
         * Optional columns are {@code ConsumedQuantity}, {@code CustomerTenancyId},
         * {@code BillingIdentifier}, {@code ProductSku}, {@code UnitOfMeasure}, {@code UnitPrice},
         * {@code ContractDuration}, and {@code AdditionalMetadata}.
         * When provided in CSV, {@code AdditionalMetadata} must be a JSON array of {@code ExtendedMetadata}
         * objects. {@code MarketplaceOfferId} must be a subscription or private offer OCID.
         *
         */
        private java.io.InputStream submitSubscriptionUsageBatchDetails = null;

        /**
         * UTF-8 CSV file with no more than 10,000 usage records and a maximum size of 50 MB.
         * Required columns are {@code MarketplaceOfferId}, {@code Id}, {@code Amount}, {@code CurrencyCode},
         * {@code UsageStartTime}, {@code UsageEndTime}, and {@code UsageDimensionName}.
         * Optional columns are {@code ConsumedQuantity}, {@code CustomerTenancyId},
         * {@code BillingIdentifier}, {@code ProductSku}, {@code UnitOfMeasure}, {@code UnitPrice},
         * {@code ContractDuration}, and {@code AdditionalMetadata}.
         * When provided in CSV, {@code AdditionalMetadata} must be a JSON array of {@code ExtendedMetadata}
         * objects. {@code MarketplaceOfferId} must be a subscription or private offer OCID.
         *
         * @param submitSubscriptionUsageBatchDetails the value to set
         * @return this builder instance
         */
        public Builder submitSubscriptionUsageBatchDetails(
                java.io.InputStream submitSubscriptionUsageBatchDetails) {
            this.submitSubscriptionUsageBatchDetails = submitSubscriptionUsageBatchDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and removed from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of running that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and removed from the system, then a retry of the original creation request
         * might be rejected.
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
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
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
        public Builder copy(SubmitSubscriptionUsageBatchRequest o) {
            compartmentId(o.getCompartmentId());
            submitSubscriptionUsageBatchDetails(o.getSubmitSubscriptionUsageBatchDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SubmitSubscriptionUsageBatchRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SubmitSubscriptionUsageBatchRequest
         */
        public SubmitSubscriptionUsageBatchRequest build() {
            SubmitSubscriptionUsageBatchRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(java.io.InputStream body) {
            submitSubscriptionUsageBatchDetails(body);
            return this;
        }

        /**
         * Build the instance of SubmitSubscriptionUsageBatchRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SubmitSubscriptionUsageBatchRequest
         */
        public SubmitSubscriptionUsageBatchRequest buildWithoutInvocationCallback() {
            SubmitSubscriptionUsageBatchRequest request = new SubmitSubscriptionUsageBatchRequest();
            request.compartmentId = compartmentId;
            request.submitSubscriptionUsageBatchDetails = submitSubscriptionUsageBatchDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new SubmitSubscriptionUsageBatchRequest(compartmentId, submitSubscriptionUsageBatchDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .submitSubscriptionUsageBatchDetails(submitSubscriptionUsageBatchDetails)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",submitSubscriptionUsageBatchDetails=")
                .append(String.valueOf(this.submitSubscriptionUsageBatchDetails));
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
        if (!(o instanceof SubmitSubscriptionUsageBatchRequest)) {
            return false;
        }

        SubmitSubscriptionUsageBatchRequest other = (SubmitSubscriptionUsageBatchRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.submitSubscriptionUsageBatchDetails,
                        other.submitSubscriptionUsageBatchDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.submitSubscriptionUsageBatchDetails == null
                                ? 43
                                : this.submitSubscriptionUsageBatchDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
