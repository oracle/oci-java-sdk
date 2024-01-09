/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ConnectRemotePeeringConnectionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ConnectRemotePeeringConnectionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ConnectRemotePeeringConnectionsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the remote peering connection (RPC).
     */
    private String remotePeeringConnectionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the remote peering connection (RPC).
     */
    public String getRemotePeeringConnectionId() {
        return remotePeeringConnectionId;
    }
    /** Details to connect peering connection with peering connection from remote region */
    private com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails
            connectRemotePeeringConnectionsDetails;

    /** Details to connect peering connection with peering connection from remote region */
    public com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails
            getConnectRemotePeeringConnectionsDetails() {
        return connectRemotePeeringConnectionsDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails getBody$() {
        return connectRemotePeeringConnectionsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ConnectRemotePeeringConnectionsRequest,
                    com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the remote peering connection (RPC).
         */
        private String remotePeeringConnectionId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the remote peering connection (RPC).
         *
         * @param remotePeeringConnectionId the value to set
         * @return this builder instance
         */
        public Builder remotePeeringConnectionId(String remotePeeringConnectionId) {
            this.remotePeeringConnectionId = remotePeeringConnectionId;
            return this;
        }

        /** Details to connect peering connection with peering connection from remote region */
        private com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails
                connectRemotePeeringConnectionsDetails = null;

        /**
         * Details to connect peering connection with peering connection from remote region
         *
         * @param connectRemotePeeringConnectionsDetails the value to set
         * @return this builder instance
         */
        public Builder connectRemotePeeringConnectionsDetails(
                com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails
                        connectRemotePeeringConnectionsDetails) {
            this.connectRemotePeeringConnectionsDetails = connectRemotePeeringConnectionsDetails;
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
        public Builder copy(ConnectRemotePeeringConnectionsRequest o) {
            remotePeeringConnectionId(o.getRemotePeeringConnectionId());
            connectRemotePeeringConnectionsDetails(o.getConnectRemotePeeringConnectionsDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ConnectRemotePeeringConnectionsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ConnectRemotePeeringConnectionsRequest
         */
        public ConnectRemotePeeringConnectionsRequest build() {
            ConnectRemotePeeringConnectionsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ConnectRemotePeeringConnectionsDetails body) {
            connectRemotePeeringConnectionsDetails(body);
            return this;
        }

        /**
         * Build the instance of ConnectRemotePeeringConnectionsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ConnectRemotePeeringConnectionsRequest
         */
        public ConnectRemotePeeringConnectionsRequest buildWithoutInvocationCallback() {
            ConnectRemotePeeringConnectionsRequest request =
                    new ConnectRemotePeeringConnectionsRequest();
            request.remotePeeringConnectionId = remotePeeringConnectionId;
            request.connectRemotePeeringConnectionsDetails = connectRemotePeeringConnectionsDetails;
            return request;
            // new ConnectRemotePeeringConnectionsRequest(remotePeeringConnectionId,
            // connectRemotePeeringConnectionsDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .remotePeeringConnectionId(remotePeeringConnectionId)
                .connectRemotePeeringConnectionsDetails(connectRemotePeeringConnectionsDetails);
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
        sb.append(",remotePeeringConnectionId=")
                .append(String.valueOf(this.remotePeeringConnectionId));
        sb.append(",connectRemotePeeringConnectionsDetails=")
                .append(String.valueOf(this.connectRemotePeeringConnectionsDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectRemotePeeringConnectionsRequest)) {
            return false;
        }

        ConnectRemotePeeringConnectionsRequest other = (ConnectRemotePeeringConnectionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.remotePeeringConnectionId, other.remotePeeringConnectionId)
                && java.util.Objects.equals(
                        this.connectRemotePeeringConnectionsDetails,
                        other.connectRemotePeeringConnectionsDetails);
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
                        + (this.connectRemotePeeringConnectionsDetails == null
                                ? 43
                                : this.connectRemotePeeringConnectionsDetails.hashCode());
        return result;
    }
}
