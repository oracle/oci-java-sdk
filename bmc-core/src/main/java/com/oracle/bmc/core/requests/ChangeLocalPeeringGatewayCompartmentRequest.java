/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeLocalPeeringGatewayCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeLocalPeeringGatewayCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeLocalPeeringGatewayCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeLocalPeeringGatewayCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the local peering gateway.
     */
    private String localPeeringGatewayId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the local peering gateway.
     */
    public String getLocalPeeringGatewayId() {
        return localPeeringGatewayId;
    }
    /**
     * Request to change the compartment of a given local peering gateway.
     */
    private com.oracle.bmc.core.model.ChangeLocalPeeringGatewayCompartmentDetails
            changeLocalPeeringGatewayCompartmentDetails;

    /**
     * Request to change the compartment of a given local peering gateway.
     */
    public com.oracle.bmc.core.model.ChangeLocalPeeringGatewayCompartmentDetails
            getChangeLocalPeeringGatewayCompartmentDetails() {
        return changeLocalPeeringGatewayCompartmentDetails;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.ChangeLocalPeeringGatewayCompartmentDetails getBody$() {
        return changeLocalPeeringGatewayCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeLocalPeeringGatewayCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeLocalPeeringGatewayCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the local peering gateway.
         */
        private String localPeeringGatewayId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the local peering gateway.
         * @param localPeeringGatewayId the value to set
         * @return this builder instance
         */
        public Builder localPeeringGatewayId(String localPeeringGatewayId) {
            this.localPeeringGatewayId = localPeeringGatewayId;
            return this;
        }

        /**
         * Request to change the compartment of a given local peering gateway.
         */
        private com.oracle.bmc.core.model.ChangeLocalPeeringGatewayCompartmentDetails
                changeLocalPeeringGatewayCompartmentDetails = null;

        /**
         * Request to change the compartment of a given local peering gateway.
         * @param changeLocalPeeringGatewayCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeLocalPeeringGatewayCompartmentDetails(
                com.oracle.bmc.core.model.ChangeLocalPeeringGatewayCompartmentDetails
                        changeLocalPeeringGatewayCompartmentDetails) {
            this.changeLocalPeeringGatewayCompartmentDetails =
                    changeLocalPeeringGatewayCompartmentDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
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
        public Builder copy(ChangeLocalPeeringGatewayCompartmentRequest o) {
            localPeeringGatewayId(o.getLocalPeeringGatewayId());
            changeLocalPeeringGatewayCompartmentDetails(
                    o.getChangeLocalPeeringGatewayCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeLocalPeeringGatewayCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeLocalPeeringGatewayCompartmentRequest
         */
        public ChangeLocalPeeringGatewayCompartmentRequest build() {
            ChangeLocalPeeringGatewayCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeLocalPeeringGatewayCompartmentDetails body) {
            changeLocalPeeringGatewayCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeLocalPeeringGatewayCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeLocalPeeringGatewayCompartmentRequest
         */
        public ChangeLocalPeeringGatewayCompartmentRequest buildWithoutInvocationCallback() {
            ChangeLocalPeeringGatewayCompartmentRequest request =
                    new ChangeLocalPeeringGatewayCompartmentRequest();
            request.localPeeringGatewayId = localPeeringGatewayId;
            request.changeLocalPeeringGatewayCompartmentDetails =
                    changeLocalPeeringGatewayCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeLocalPeeringGatewayCompartmentRequest(localPeeringGatewayId, changeLocalPeeringGatewayCompartmentDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .localPeeringGatewayId(localPeeringGatewayId)
                .changeLocalPeeringGatewayCompartmentDetails(
                        changeLocalPeeringGatewayCompartmentDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",localPeeringGatewayId=").append(String.valueOf(this.localPeeringGatewayId));
        sb.append(",changeLocalPeeringGatewayCompartmentDetails=")
                .append(String.valueOf(this.changeLocalPeeringGatewayCompartmentDetails));
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
        if (!(o instanceof ChangeLocalPeeringGatewayCompartmentRequest)) {
            return false;
        }

        ChangeLocalPeeringGatewayCompartmentRequest other =
                (ChangeLocalPeeringGatewayCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.localPeeringGatewayId, other.localPeeringGatewayId)
                && java.util.Objects.equals(
                        this.changeLocalPeeringGatewayCompartmentDetails,
                        other.changeLocalPeeringGatewayCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.localPeeringGatewayId == null
                                ? 43
                                : this.localPeeringGatewayId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeLocalPeeringGatewayCompartmentDetails == null
                                ? 43
                                : this.changeLocalPeeringGatewayCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
