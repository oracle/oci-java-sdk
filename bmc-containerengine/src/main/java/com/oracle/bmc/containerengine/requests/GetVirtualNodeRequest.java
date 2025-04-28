/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerengine/GetVirtualNodeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetVirtualNodeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class GetVirtualNodeRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the virtual node pool. */
    private String virtualNodePoolId;

    /** The OCID of the virtual node pool. */
    public String getVirtualNodePoolId() {
        return virtualNodePoolId;
    }
    /** The OCID of the virtual node. */
    private String virtualNodeId;

    /** The OCID of the virtual node. */
    public String getVirtualNodeId() {
        return virtualNodeId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetVirtualNodeRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the virtual node pool. */
        private String virtualNodePoolId = null;

        /**
         * The OCID of the virtual node pool.
         *
         * @param virtualNodePoolId the value to set
         * @return this builder instance
         */
        public Builder virtualNodePoolId(String virtualNodePoolId) {
            this.virtualNodePoolId = virtualNodePoolId;
            return this;
        }

        /** The OCID of the virtual node. */
        private String virtualNodeId = null;

        /**
         * The OCID of the virtual node.
         *
         * @param virtualNodeId the value to set
         * @return this builder instance
         */
        public Builder virtualNodeId(String virtualNodeId) {
            this.virtualNodeId = virtualNodeId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(GetVirtualNodeRequest o) {
            virtualNodePoolId(o.getVirtualNodePoolId());
            virtualNodeId(o.getVirtualNodeId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetVirtualNodeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetVirtualNodeRequest
         */
        public GetVirtualNodeRequest build() {
            GetVirtualNodeRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetVirtualNodeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetVirtualNodeRequest
         */
        public GetVirtualNodeRequest buildWithoutInvocationCallback() {
            GetVirtualNodeRequest request = new GetVirtualNodeRequest();
            request.virtualNodePoolId = virtualNodePoolId;
            request.virtualNodeId = virtualNodeId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetVirtualNodeRequest(virtualNodePoolId, virtualNodeId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .virtualNodePoolId(virtualNodePoolId)
                .virtualNodeId(virtualNodeId)
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
        sb.append(",virtualNodePoolId=").append(String.valueOf(this.virtualNodePoolId));
        sb.append(",virtualNodeId=").append(String.valueOf(this.virtualNodeId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetVirtualNodeRequest)) {
            return false;
        }

        GetVirtualNodeRequest other = (GetVirtualNodeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.virtualNodePoolId, other.virtualNodePoolId)
                && java.util.Objects.equals(this.virtualNodeId, other.virtualNodeId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.virtualNodePoolId == null ? 43 : this.virtualNodePoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualNodeId == null ? 43 : this.virtualNodeId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
