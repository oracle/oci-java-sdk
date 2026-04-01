/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.requests;

import com.oracle.bmc.limitsincrease.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/limitsincrease/CreateLimitsIncreaseRequestExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateLimitsIncreaseRequestRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class CreateLimitsIncreaseRequestRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.limitsincrease.model.CreateLimitsIncreaseRequestDetails> {

    /**
     * The new limit increase request details
     */
    private com.oracle.bmc.limitsincrease.model.CreateLimitsIncreaseRequestDetails
            createLimitsIncreaseRequestDetails;

    /**
     * The new limit increase request details
     */
    public com.oracle.bmc.limitsincrease.model.CreateLimitsIncreaseRequestDetails
            getCreateLimitsIncreaseRequestDetails() {
        return createLimitsIncreaseRequestDetails;
    }
    /**
     * Idempotency token to make sure that a second create operation won't fail if the first one succeeded.
     * This can be any random string.
     *
     */
    private String opcRetryToken;

    /**
     * Idempotency token to make sure that a second create operation won't fail if the first one succeeded.
     * This can be any random string.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Override request id for request tracking purposes.
     */
    private String opcRequestId;

    /**
     * Override request id for request tracking purposes.
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
    public com.oracle.bmc.limitsincrease.model.CreateLimitsIncreaseRequestDetails getBody$() {
        return createLimitsIncreaseRequestDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateLimitsIncreaseRequestRequest,
                    com.oracle.bmc.limitsincrease.model.CreateLimitsIncreaseRequestDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The new limit increase request details
         */
        private com.oracle.bmc.limitsincrease.model.CreateLimitsIncreaseRequestDetails
                createLimitsIncreaseRequestDetails = null;

        /**
         * The new limit increase request details
         * @param createLimitsIncreaseRequestDetails the value to set
         * @return this builder instance
         */
        public Builder createLimitsIncreaseRequestDetails(
                com.oracle.bmc.limitsincrease.model.CreateLimitsIncreaseRequestDetails
                        createLimitsIncreaseRequestDetails) {
            this.createLimitsIncreaseRequestDetails = createLimitsIncreaseRequestDetails;
            return this;
        }

        /**
         * Idempotency token to make sure that a second create operation won't fail if the first one succeeded.
         * This can be any random string.
         *
         */
        private String opcRetryToken = null;

        /**
         * Idempotency token to make sure that a second create operation won't fail if the first one succeeded.
         * This can be any random string.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Override request id for request tracking purposes.
         */
        private String opcRequestId = null;

        /**
         * Override request id for request tracking purposes.
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
        public Builder copy(CreateLimitsIncreaseRequestRequest o) {
            createLimitsIncreaseRequestDetails(o.getCreateLimitsIncreaseRequestDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateLimitsIncreaseRequestRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateLimitsIncreaseRequestRequest
         */
        public CreateLimitsIncreaseRequestRequest build() {
            CreateLimitsIncreaseRequestRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.limitsincrease.model.CreateLimitsIncreaseRequestDetails body) {
            createLimitsIncreaseRequestDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateLimitsIncreaseRequestRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateLimitsIncreaseRequestRequest
         */
        public CreateLimitsIncreaseRequestRequest buildWithoutInvocationCallback() {
            CreateLimitsIncreaseRequestRequest request = new CreateLimitsIncreaseRequestRequest();
            request.createLimitsIncreaseRequestDetails = createLimitsIncreaseRequestDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateLimitsIncreaseRequestRequest(createLimitsIncreaseRequestDetails, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createLimitsIncreaseRequestDetails(createLimitsIncreaseRequestDetails)
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
        sb.append(",createLimitsIncreaseRequestDetails=")
                .append(String.valueOf(this.createLimitsIncreaseRequestDetails));
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
        if (!(o instanceof CreateLimitsIncreaseRequestRequest)) {
            return false;
        }

        CreateLimitsIncreaseRequestRequest other = (CreateLimitsIncreaseRequestRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createLimitsIncreaseRequestDetails,
                        other.createLimitsIncreaseRequestDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createLimitsIncreaseRequestDetails == null
                                ? 43
                                : this.createLimitsIncreaseRequestDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
