/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ConnectLocalPeeringGatewaysExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ConnectLocalPeeringGatewaysRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ConnectLocalPeeringGatewaysRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails> {

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
     * Details regarding the local peering gateway to connect.
     */
    private com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails
            connectLocalPeeringGatewaysDetails;

    /**
     * Details regarding the local peering gateway to connect.
     */
    public com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails
            getConnectLocalPeeringGatewaysDetails() {
        return connectLocalPeeringGatewaysDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails getBody$() {
        return connectLocalPeeringGatewaysDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ConnectLocalPeeringGatewaysRequest,
                    com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails> {
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
         * Details regarding the local peering gateway to connect.
         */
        private com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails
                connectLocalPeeringGatewaysDetails = null;

        /**
         * Details regarding the local peering gateway to connect.
         * @param connectLocalPeeringGatewaysDetails the value to set
         * @return this builder instance
         */
        public Builder connectLocalPeeringGatewaysDetails(
                com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails
                        connectLocalPeeringGatewaysDetails) {
            this.connectLocalPeeringGatewaysDetails = connectLocalPeeringGatewaysDetails;
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
        public Builder copy(ConnectLocalPeeringGatewaysRequest o) {
            localPeeringGatewayId(o.getLocalPeeringGatewayId());
            connectLocalPeeringGatewaysDetails(o.getConnectLocalPeeringGatewaysDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ConnectLocalPeeringGatewaysRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ConnectLocalPeeringGatewaysRequest
         */
        public ConnectLocalPeeringGatewaysRequest build() {
            ConnectLocalPeeringGatewaysRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.ConnectLocalPeeringGatewaysDetails body) {
            connectLocalPeeringGatewaysDetails(body);
            return this;
        }

        /**
         * Build the instance of ConnectLocalPeeringGatewaysRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ConnectLocalPeeringGatewaysRequest
         */
        public ConnectLocalPeeringGatewaysRequest buildWithoutInvocationCallback() {
            ConnectLocalPeeringGatewaysRequest request = new ConnectLocalPeeringGatewaysRequest();
            request.localPeeringGatewayId = localPeeringGatewayId;
            request.connectLocalPeeringGatewaysDetails = connectLocalPeeringGatewaysDetails;
            return request;
            // new ConnectLocalPeeringGatewaysRequest(localPeeringGatewayId, connectLocalPeeringGatewaysDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .localPeeringGatewayId(localPeeringGatewayId)
                .connectLocalPeeringGatewaysDetails(connectLocalPeeringGatewaysDetails);
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
        sb.append(",connectLocalPeeringGatewaysDetails=")
                .append(String.valueOf(this.connectLocalPeeringGatewaysDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectLocalPeeringGatewaysRequest)) {
            return false;
        }

        ConnectLocalPeeringGatewaysRequest other = (ConnectLocalPeeringGatewaysRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.localPeeringGatewayId, other.localPeeringGatewayId)
                && java.util.Objects.equals(
                        this.connectLocalPeeringGatewaysDetails,
                        other.connectLocalPeeringGatewaysDetails);
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
                        + (this.connectLocalPeeringGatewaysDetails == null
                                ? 43
                                : this.connectLocalPeeringGatewaysDetails.hashCode());
        return result;
    }
}
