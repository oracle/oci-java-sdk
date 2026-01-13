/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/BulkCreateOccmDemandSignalItemExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * BulkCreateOccmDemandSignalItemRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class BulkCreateOccmDemandSignalItemRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.capacitymanagement.model.BulkCreateOccmDemandSignalItemDetails> {

    /** The request details for bulk creating the demand signal items. */
    private com.oracle.bmc.capacitymanagement.model.BulkCreateOccmDemandSignalItemDetails
            bulkCreateOccmDemandSignalItemDetails;

    /** The request details for bulk creating the demand signal items. */
    public com.oracle.bmc.capacitymanagement.model.BulkCreateOccmDemandSignalItemDetails
            getBulkCreateOccmDemandSignalItemDetails() {
        return bulkCreateOccmDemandSignalItemDetails;
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
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
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
    public com.oracle.bmc.capacitymanagement.model.BulkCreateOccmDemandSignalItemDetails
            getBody$() {
        return bulkCreateOccmDemandSignalItemDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkCreateOccmDemandSignalItemRequest,
                    com.oracle.bmc.capacitymanagement.model.BulkCreateOccmDemandSignalItemDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The request details for bulk creating the demand signal items. */
        private com.oracle.bmc.capacitymanagement.model.BulkCreateOccmDemandSignalItemDetails
                bulkCreateOccmDemandSignalItemDetails = null;

        /**
         * The request details for bulk creating the demand signal items.
         *
         * @param bulkCreateOccmDemandSignalItemDetails the value to set
         * @return this builder instance
         */
        public Builder bulkCreateOccmDemandSignalItemDetails(
                com.oracle.bmc.capacitymanagement.model.BulkCreateOccmDemandSignalItemDetails
                        bulkCreateOccmDemandSignalItemDetails) {
            this.bulkCreateOccmDemandSignalItemDetails = bulkCreateOccmDemandSignalItemDetails;
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
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
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
        public Builder copy(BulkCreateOccmDemandSignalItemRequest o) {
            bulkCreateOccmDemandSignalItemDetails(o.getBulkCreateOccmDemandSignalItemDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkCreateOccmDemandSignalItemRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BulkCreateOccmDemandSignalItemRequest
         */
        public BulkCreateOccmDemandSignalItemRequest build() {
            BulkCreateOccmDemandSignalItemRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.capacitymanagement.model.BulkCreateOccmDemandSignalItemDetails
                        body) {
            bulkCreateOccmDemandSignalItemDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkCreateOccmDemandSignalItemRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkCreateOccmDemandSignalItemRequest
         */
        public BulkCreateOccmDemandSignalItemRequest buildWithoutInvocationCallback() {
            BulkCreateOccmDemandSignalItemRequest request =
                    new BulkCreateOccmDemandSignalItemRequest();
            request.bulkCreateOccmDemandSignalItemDetails = bulkCreateOccmDemandSignalItemDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new BulkCreateOccmDemandSignalItemRequest(bulkCreateOccmDemandSignalItemDetails,
            // opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bulkCreateOccmDemandSignalItemDetails(bulkCreateOccmDemandSignalItemDetails)
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
        sb.append(",bulkCreateOccmDemandSignalItemDetails=")
                .append(String.valueOf(this.bulkCreateOccmDemandSignalItemDetails));
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
        if (!(o instanceof BulkCreateOccmDemandSignalItemRequest)) {
            return false;
        }

        BulkCreateOccmDemandSignalItemRequest other = (BulkCreateOccmDemandSignalItemRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.bulkCreateOccmDemandSignalItemDetails,
                        other.bulkCreateOccmDemandSignalItemDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bulkCreateOccmDemandSignalItemDetails == null
                                ? 43
                                : this.bulkCreateOccmDemandSignalItemDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
