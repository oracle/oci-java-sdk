/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.requests;

import com.oracle.bmc.aivision.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aivision/GetVisionPrivateEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetVisionPrivateEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class GetVisionPrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Vision private endpoint Id. */
    private String visionPrivateEndpointId;

    /** Vision private endpoint Id. */
    public String getVisionPrivateEndpointId() {
        return visionPrivateEndpointId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetVisionPrivateEndpointRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Vision private endpoint Id. */
        private String visionPrivateEndpointId = null;

        /**
         * Vision private endpoint Id.
         *
         * @param visionPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder visionPrivateEndpointId(String visionPrivateEndpointId) {
            this.visionPrivateEndpointId = visionPrivateEndpointId;
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
        public Builder copy(GetVisionPrivateEndpointRequest o) {
            visionPrivateEndpointId(o.getVisionPrivateEndpointId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetVisionPrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetVisionPrivateEndpointRequest
         */
        public GetVisionPrivateEndpointRequest build() {
            GetVisionPrivateEndpointRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetVisionPrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetVisionPrivateEndpointRequest
         */
        public GetVisionPrivateEndpointRequest buildWithoutInvocationCallback() {
            GetVisionPrivateEndpointRequest request = new GetVisionPrivateEndpointRequest();
            request.visionPrivateEndpointId = visionPrivateEndpointId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetVisionPrivateEndpointRequest(visionPrivateEndpointId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .visionPrivateEndpointId(visionPrivateEndpointId)
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
        sb.append(",visionPrivateEndpointId=").append(String.valueOf(this.visionPrivateEndpointId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetVisionPrivateEndpointRequest)) {
            return false;
        }

        GetVisionPrivateEndpointRequest other = (GetVisionPrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.visionPrivateEndpointId, other.visionPrivateEndpointId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.visionPrivateEndpointId == null
                                ? 43
                                : this.visionPrivateEndpointId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
