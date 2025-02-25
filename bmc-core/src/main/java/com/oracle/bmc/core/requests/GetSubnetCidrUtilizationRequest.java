/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetSubnetCidrUtilizationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSubnetCidrUtilizationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetSubnetCidrUtilizationRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
     */
    private String subnetId;

    /**
     * Specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
     */
    public String getSubnetId() {
        return subnetId;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSubnetCidrUtilizationRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
         */
        private String subnetId = null;

        /**
         * Specify the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet.
         * @param subnetId the value to set
         * @return this builder instance
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
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
        public Builder copy(GetSubnetCidrUtilizationRequest o) {
            subnetId(o.getSubnetId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSubnetCidrUtilizationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetSubnetCidrUtilizationRequest
         */
        public GetSubnetCidrUtilizationRequest build() {
            GetSubnetCidrUtilizationRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSubnetCidrUtilizationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSubnetCidrUtilizationRequest
         */
        public GetSubnetCidrUtilizationRequest buildWithoutInvocationCallback() {
            GetSubnetCidrUtilizationRequest request = new GetSubnetCidrUtilizationRequest();
            request.subnetId = subnetId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetSubnetCidrUtilizationRequest(subnetId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().subnetId(subnetId).opcRequestId(opcRequestId);
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
        sb.append(",subnetId=").append(String.valueOf(this.subnetId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSubnetCidrUtilizationRequest)) {
            return false;
        }

        GetSubnetCidrUtilizationRequest other = (GetSubnetCidrUtilizationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
