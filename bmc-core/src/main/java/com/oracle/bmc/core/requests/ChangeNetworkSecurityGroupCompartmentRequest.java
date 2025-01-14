/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeNetworkSecurityGroupCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeNetworkSecurityGroupCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeNetworkSecurityGroupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeNetworkSecurityGroupCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the network security group.
     */
    private String networkSecurityGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the network security group.
     */
    public String getNetworkSecurityGroupId() {
        return networkSecurityGroupId;
    }
    /** Request to change the compartment of a network security group. */
    private com.oracle.bmc.core.model.ChangeNetworkSecurityGroupCompartmentDetails
            changeNetworkSecurityGroupCompartmentDetails;

    /** Request to change the compartment of a network security group. */
    public com.oracle.bmc.core.model.ChangeNetworkSecurityGroupCompartmentDetails
            getChangeNetworkSecurityGroupCompartmentDetails() {
        return changeNetworkSecurityGroupCompartmentDetails;
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
    public com.oracle.bmc.core.model.ChangeNetworkSecurityGroupCompartmentDetails getBody$() {
        return changeNetworkSecurityGroupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeNetworkSecurityGroupCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeNetworkSecurityGroupCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the network security group.
         */
        private String networkSecurityGroupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the network security group.
         *
         * @param networkSecurityGroupId the value to set
         * @return this builder instance
         */
        public Builder networkSecurityGroupId(String networkSecurityGroupId) {
            this.networkSecurityGroupId = networkSecurityGroupId;
            return this;
        }

        /** Request to change the compartment of a network security group. */
        private com.oracle.bmc.core.model.ChangeNetworkSecurityGroupCompartmentDetails
                changeNetworkSecurityGroupCompartmentDetails = null;

        /**
         * Request to change the compartment of a network security group.
         *
         * @param changeNetworkSecurityGroupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeNetworkSecurityGroupCompartmentDetails(
                com.oracle.bmc.core.model.ChangeNetworkSecurityGroupCompartmentDetails
                        changeNetworkSecurityGroupCompartmentDetails) {
            this.changeNetworkSecurityGroupCompartmentDetails =
                    changeNetworkSecurityGroupCompartmentDetails;
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
        public Builder copy(ChangeNetworkSecurityGroupCompartmentRequest o) {
            networkSecurityGroupId(o.getNetworkSecurityGroupId());
            changeNetworkSecurityGroupCompartmentDetails(
                    o.getChangeNetworkSecurityGroupCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeNetworkSecurityGroupCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeNetworkSecurityGroupCompartmentRequest
         */
        public ChangeNetworkSecurityGroupCompartmentRequest build() {
            ChangeNetworkSecurityGroupCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeNetworkSecurityGroupCompartmentDetails body) {
            changeNetworkSecurityGroupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeNetworkSecurityGroupCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeNetworkSecurityGroupCompartmentRequest
         */
        public ChangeNetworkSecurityGroupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeNetworkSecurityGroupCompartmentRequest request =
                    new ChangeNetworkSecurityGroupCompartmentRequest();
            request.networkSecurityGroupId = networkSecurityGroupId;
            request.changeNetworkSecurityGroupCompartmentDetails =
                    changeNetworkSecurityGroupCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeNetworkSecurityGroupCompartmentRequest(networkSecurityGroupId,
            // changeNetworkSecurityGroupCompartmentDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkSecurityGroupId(networkSecurityGroupId)
                .changeNetworkSecurityGroupCompartmentDetails(
                        changeNetworkSecurityGroupCompartmentDetails)
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
        sb.append(",networkSecurityGroupId=").append(String.valueOf(this.networkSecurityGroupId));
        sb.append(",changeNetworkSecurityGroupCompartmentDetails=")
                .append(String.valueOf(this.changeNetworkSecurityGroupCompartmentDetails));
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
        if (!(o instanceof ChangeNetworkSecurityGroupCompartmentRequest)) {
            return false;
        }

        ChangeNetworkSecurityGroupCompartmentRequest other =
                (ChangeNetworkSecurityGroupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.networkSecurityGroupId, other.networkSecurityGroupId)
                && java.util.Objects.equals(
                        this.changeNetworkSecurityGroupCompartmentDetails,
                        other.changeNetworkSecurityGroupCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupId == null
                                ? 43
                                : this.networkSecurityGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeNetworkSecurityGroupCompartmentDetails == null
                                ? 43
                                : this.changeNetworkSecurityGroupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
