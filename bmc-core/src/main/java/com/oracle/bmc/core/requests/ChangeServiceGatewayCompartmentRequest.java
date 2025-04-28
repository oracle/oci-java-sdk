/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeServiceGatewayCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeServiceGatewayCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeServiceGatewayCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeServiceGatewayCompartmentDetails> {

    /**
     * The service gateway's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String serviceGatewayId;

    /**
     * The service gateway's
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getServiceGatewayId() {
        return serviceGatewayId;
    }
    /** Request to change the compartment of a given Service Gateway. */
    private com.oracle.bmc.core.model.ChangeServiceGatewayCompartmentDetails
            changeServiceGatewayCompartmentDetails;

    /** Request to change the compartment of a given Service Gateway. */
    public com.oracle.bmc.core.model.ChangeServiceGatewayCompartmentDetails
            getChangeServiceGatewayCompartmentDetails() {
        return changeServiceGatewayCompartmentDetails;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
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
    public com.oracle.bmc.core.model.ChangeServiceGatewayCompartmentDetails getBody$() {
        return changeServiceGatewayCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeServiceGatewayCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeServiceGatewayCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The service gateway's
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String serviceGatewayId = null;

        /**
         * The service gateway's
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param serviceGatewayId the value to set
         * @return this builder instance
         */
        public Builder serviceGatewayId(String serviceGatewayId) {
            this.serviceGatewayId = serviceGatewayId;
            return this;
        }

        /** Request to change the compartment of a given Service Gateway. */
        private com.oracle.bmc.core.model.ChangeServiceGatewayCompartmentDetails
                changeServiceGatewayCompartmentDetails = null;

        /**
         * Request to change the compartment of a given Service Gateway.
         *
         * @param changeServiceGatewayCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeServiceGatewayCompartmentDetails(
                com.oracle.bmc.core.model.ChangeServiceGatewayCompartmentDetails
                        changeServiceGatewayCompartmentDetails) {
            this.changeServiceGatewayCompartmentDetails = changeServiceGatewayCompartmentDetails;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
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
        public Builder copy(ChangeServiceGatewayCompartmentRequest o) {
            serviceGatewayId(o.getServiceGatewayId());
            changeServiceGatewayCompartmentDetails(o.getChangeServiceGatewayCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeServiceGatewayCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeServiceGatewayCompartmentRequest
         */
        public ChangeServiceGatewayCompartmentRequest build() {
            ChangeServiceGatewayCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeServiceGatewayCompartmentDetails body) {
            changeServiceGatewayCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeServiceGatewayCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeServiceGatewayCompartmentRequest
         */
        public ChangeServiceGatewayCompartmentRequest buildWithoutInvocationCallback() {
            ChangeServiceGatewayCompartmentRequest request =
                    new ChangeServiceGatewayCompartmentRequest();
            request.serviceGatewayId = serviceGatewayId;
            request.changeServiceGatewayCompartmentDetails = changeServiceGatewayCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeServiceGatewayCompartmentRequest(serviceGatewayId,
            // changeServiceGatewayCompartmentDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .serviceGatewayId(serviceGatewayId)
                .changeServiceGatewayCompartmentDetails(changeServiceGatewayCompartmentDetails)
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
        sb.append(",serviceGatewayId=").append(String.valueOf(this.serviceGatewayId));
        sb.append(",changeServiceGatewayCompartmentDetails=")
                .append(String.valueOf(this.changeServiceGatewayCompartmentDetails));
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
        if (!(o instanceof ChangeServiceGatewayCompartmentRequest)) {
            return false;
        }

        ChangeServiceGatewayCompartmentRequest other = (ChangeServiceGatewayCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.serviceGatewayId, other.serviceGatewayId)
                && java.util.Objects.equals(
                        this.changeServiceGatewayCompartmentDetails,
                        other.changeServiceGatewayCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.serviceGatewayId == null ? 43 : this.serviceGatewayId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeServiceGatewayCompartmentDetails == null
                                ? 43
                                : this.changeServiceGatewayCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
