/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.requests;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ActivateOrderExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ActivateOrderRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class ActivateOrderRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.tenantmanagercontrolplane.model.ActivateOrderDetails> {

    /** The information needed to activate an order in a tenancy. */
    private com.oracle.bmc.tenantmanagercontrolplane.model.ActivateOrderDetails
            activateOrderDetails;

    /** The information needed to activate an order in a tenancy. */
    public com.oracle.bmc.tenantmanagercontrolplane.model.ActivateOrderDetails
            getActivateOrderDetails() {
        return activateOrderDetails;
    }
    /** Activation token containing an order ID. A JWT RFC 7519-formatted string. */
    private String activationToken;

    /** Activation token containing an order ID. A JWT RFC 7519-formatted string. */
    public String getActivationToken() {
        return activationToken;
    }
    /**
     * A token that uniquely identifies a request, so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request will be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request, so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request will be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
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
    public com.oracle.bmc.tenantmanagercontrolplane.model.ActivateOrderDetails getBody$() {
        return activateOrderDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ActivateOrderRequest,
                    com.oracle.bmc.tenantmanagercontrolplane.model.ActivateOrderDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The information needed to activate an order in a tenancy. */
        private com.oracle.bmc.tenantmanagercontrolplane.model.ActivateOrderDetails
                activateOrderDetails = null;

        /**
         * The information needed to activate an order in a tenancy.
         *
         * @param activateOrderDetails the value to set
         * @return this builder instance
         */
        public Builder activateOrderDetails(
                com.oracle.bmc.tenantmanagercontrolplane.model.ActivateOrderDetails
                        activateOrderDetails) {
            this.activateOrderDetails = activateOrderDetails;
            return this;
        }

        /** Activation token containing an order ID. A JWT RFC 7519-formatted string. */
        private String activationToken = null;

        /**
         * Activation token containing an order ID. A JWT RFC 7519-formatted string.
         *
         * @param activationToken the value to set
         * @return this builder instance
         */
        public Builder activationToken(String activationToken) {
            this.activationToken = activationToken;
            return this;
        }

        /**
         * A token that uniquely identifies a request, so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request will be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request, so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request will be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ActivateOrderRequest o) {
            activateOrderDetails(o.getActivateOrderDetails());
            activationToken(o.getActivationToken());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ActivateOrderRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ActivateOrderRequest
         */
        public ActivateOrderRequest build() {
            ActivateOrderRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.tenantmanagercontrolplane.model.ActivateOrderDetails body) {
            activateOrderDetails(body);
            return this;
        }

        /**
         * Build the instance of ActivateOrderRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ActivateOrderRequest
         */
        public ActivateOrderRequest buildWithoutInvocationCallback() {
            ActivateOrderRequest request = new ActivateOrderRequest();
            request.activateOrderDetails = activateOrderDetails;
            request.activationToken = activationToken;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new ActivateOrderRequest(activateOrderDetails, activationToken, opcRetryToken,
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
                .activateOrderDetails(activateOrderDetails)
                .activationToken(activationToken)
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
        sb.append(",activateOrderDetails=").append(String.valueOf(this.activateOrderDetails));
        sb.append(",activationToken=").append(String.valueOf(this.activationToken));
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
        if (!(o instanceof ActivateOrderRequest)) {
            return false;
        }

        ActivateOrderRequest other = (ActivateOrderRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.activateOrderDetails, other.activateOrderDetails)
                && java.util.Objects.equals(this.activationToken, other.activationToken)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.activateOrderDetails == null
                                ? 43
                                : this.activateOrderDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.activationToken == null ? 43 : this.activationToken.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
