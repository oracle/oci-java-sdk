/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.requests;

import com.oracle.bmc.servicemesh.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/servicemesh/GetIngressGatewayRouteTableExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetIngressGatewayRouteTableRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
public class GetIngressGatewayRouteTableRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique IngressGatewayRouteTable identifier.
     */
    private String ingressGatewayRouteTableId;

    public String getIngressGatewayRouteTableId() {
        return ingressGatewayRouteTableId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetIngressGatewayRouteTableRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String ingressGatewayRouteTableId = null;

        /**
         * Unique IngressGatewayRouteTable identifier.
         * @return this builder instance
         */
        public Builder ingressGatewayRouteTableId(String ingressGatewayRouteTableId) {
            this.ingressGatewayRouteTableId = ingressGatewayRouteTableId;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(GetIngressGatewayRouteTableRequest o) {
            ingressGatewayRouteTableId(o.getIngressGatewayRouteTableId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetIngressGatewayRouteTableRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetIngressGatewayRouteTableRequest
         */
        public GetIngressGatewayRouteTableRequest build() {
            GetIngressGatewayRouteTableRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetIngressGatewayRouteTableRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetIngressGatewayRouteTableRequest
         */
        public GetIngressGatewayRouteTableRequest buildWithoutInvocationCallback() {
            GetIngressGatewayRouteTableRequest request = new GetIngressGatewayRouteTableRequest();
            request.ingressGatewayRouteTableId = ingressGatewayRouteTableId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetIngressGatewayRouteTableRequest(ingressGatewayRouteTableId, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .ingressGatewayRouteTableId(ingressGatewayRouteTableId)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",ingressGatewayRouteTableId=")
                .append(String.valueOf(this.ingressGatewayRouteTableId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetIngressGatewayRouteTableRequest)) {
            return false;
        }

        GetIngressGatewayRouteTableRequest other = (GetIngressGatewayRouteTableRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.ingressGatewayRouteTableId, other.ingressGatewayRouteTableId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.ingressGatewayRouteTableId == null
                                ? 43
                                : this.ingressGatewayRouteTableId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
