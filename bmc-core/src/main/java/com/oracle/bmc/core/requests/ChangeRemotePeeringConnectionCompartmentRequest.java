/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeRemotePeeringConnectionCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeRemotePeeringConnectionCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeRemotePeeringConnectionCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeRemotePeeringConnectionCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the remote peering connection (RPC).
     */
    private String remotePeeringConnectionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the remote peering connection (RPC).
     */
    public String getRemotePeeringConnectionId() {
        return remotePeeringConnectionId;
    }
    /**
     * Request to change the compartment of a remote peering connection.
     */
    private com.oracle.bmc.core.model.ChangeRemotePeeringConnectionCompartmentDetails
            changeRemotePeeringConnectionCompartmentDetails;

    /**
     * Request to change the compartment of a remote peering connection.
     */
    public com.oracle.bmc.core.model.ChangeRemotePeeringConnectionCompartmentDetails
            getChangeRemotePeeringConnectionCompartmentDetails() {
        return changeRemotePeeringConnectionCompartmentDetails;
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
    public com.oracle.bmc.core.model.ChangeRemotePeeringConnectionCompartmentDetails getBody$() {
        return changeRemotePeeringConnectionCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeRemotePeeringConnectionCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeRemotePeeringConnectionCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the remote peering connection (RPC).
         */
        private String remotePeeringConnectionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the remote peering connection (RPC).
         * @param remotePeeringConnectionId the value to set
         * @return this builder instance
         */
        public Builder remotePeeringConnectionId(String remotePeeringConnectionId) {
            this.remotePeeringConnectionId = remotePeeringConnectionId;
            return this;
        }

        /**
         * Request to change the compartment of a remote peering connection.
         */
        private com.oracle.bmc.core.model.ChangeRemotePeeringConnectionCompartmentDetails
                changeRemotePeeringConnectionCompartmentDetails = null;

        /**
         * Request to change the compartment of a remote peering connection.
         * @param changeRemotePeeringConnectionCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeRemotePeeringConnectionCompartmentDetails(
                com.oracle.bmc.core.model.ChangeRemotePeeringConnectionCompartmentDetails
                        changeRemotePeeringConnectionCompartmentDetails) {
            this.changeRemotePeeringConnectionCompartmentDetails =
                    changeRemotePeeringConnectionCompartmentDetails;
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
        public Builder copy(ChangeRemotePeeringConnectionCompartmentRequest o) {
            remotePeeringConnectionId(o.getRemotePeeringConnectionId());
            changeRemotePeeringConnectionCompartmentDetails(
                    o.getChangeRemotePeeringConnectionCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeRemotePeeringConnectionCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeRemotePeeringConnectionCompartmentRequest
         */
        public ChangeRemotePeeringConnectionCompartmentRequest build() {
            ChangeRemotePeeringConnectionCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeRemotePeeringConnectionCompartmentDetails body) {
            changeRemotePeeringConnectionCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeRemotePeeringConnectionCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeRemotePeeringConnectionCompartmentRequest
         */
        public ChangeRemotePeeringConnectionCompartmentRequest buildWithoutInvocationCallback() {
            ChangeRemotePeeringConnectionCompartmentRequest request =
                    new ChangeRemotePeeringConnectionCompartmentRequest();
            request.remotePeeringConnectionId = remotePeeringConnectionId;
            request.changeRemotePeeringConnectionCompartmentDetails =
                    changeRemotePeeringConnectionCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeRemotePeeringConnectionCompartmentRequest(remotePeeringConnectionId, changeRemotePeeringConnectionCompartmentDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .remotePeeringConnectionId(remotePeeringConnectionId)
                .changeRemotePeeringConnectionCompartmentDetails(
                        changeRemotePeeringConnectionCompartmentDetails)
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
        sb.append(",remotePeeringConnectionId=")
                .append(String.valueOf(this.remotePeeringConnectionId));
        sb.append(",changeRemotePeeringConnectionCompartmentDetails=")
                .append(String.valueOf(this.changeRemotePeeringConnectionCompartmentDetails));
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
        if (!(o instanceof ChangeRemotePeeringConnectionCompartmentRequest)) {
            return false;
        }

        ChangeRemotePeeringConnectionCompartmentRequest other =
                (ChangeRemotePeeringConnectionCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.remotePeeringConnectionId, other.remotePeeringConnectionId)
                && java.util.Objects.equals(
                        this.changeRemotePeeringConnectionCompartmentDetails,
                        other.changeRemotePeeringConnectionCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.remotePeeringConnectionId == null
                                ? 43
                                : this.remotePeeringConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeRemotePeeringConnectionCompartmentDetails == null
                                ? 43
                                : this.changeRemotePeeringConnectionCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
