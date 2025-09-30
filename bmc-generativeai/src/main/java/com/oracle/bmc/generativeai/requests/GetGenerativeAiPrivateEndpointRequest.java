/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.requests;

import com.oracle.bmc.generativeai.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeai/GetGenerativeAiPrivateEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetGenerativeAiPrivateEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GetGenerativeAiPrivateEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The unique id for a Generative AI private endpoint. */
    private String generativeAiPrivateEndpointId;

    /** The unique id for a Generative AI private endpoint. */
    public String getGenerativeAiPrivateEndpointId() {
        return generativeAiPrivateEndpointId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetGenerativeAiPrivateEndpointRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The unique id for a Generative AI private endpoint. */
        private String generativeAiPrivateEndpointId = null;

        /**
         * The unique id for a Generative AI private endpoint.
         *
         * @param generativeAiPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder generativeAiPrivateEndpointId(String generativeAiPrivateEndpointId) {
            this.generativeAiPrivateEndpointId = generativeAiPrivateEndpointId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
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
        public Builder copy(GetGenerativeAiPrivateEndpointRequest o) {
            generativeAiPrivateEndpointId(o.getGenerativeAiPrivateEndpointId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetGenerativeAiPrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetGenerativeAiPrivateEndpointRequest
         */
        public GetGenerativeAiPrivateEndpointRequest build() {
            GetGenerativeAiPrivateEndpointRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetGenerativeAiPrivateEndpointRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetGenerativeAiPrivateEndpointRequest
         */
        public GetGenerativeAiPrivateEndpointRequest buildWithoutInvocationCallback() {
            GetGenerativeAiPrivateEndpointRequest request =
                    new GetGenerativeAiPrivateEndpointRequest();
            request.generativeAiPrivateEndpointId = generativeAiPrivateEndpointId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetGenerativeAiPrivateEndpointRequest(generativeAiPrivateEndpointId,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .generativeAiPrivateEndpointId(generativeAiPrivateEndpointId)
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
        sb.append(",generativeAiPrivateEndpointId=")
                .append(String.valueOf(this.generativeAiPrivateEndpointId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetGenerativeAiPrivateEndpointRequest)) {
            return false;
        }

        GetGenerativeAiPrivateEndpointRequest other = (GetGenerativeAiPrivateEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.generativeAiPrivateEndpointId, other.generativeAiPrivateEndpointId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.generativeAiPrivateEndpointId == null
                                ? 43
                                : this.generativeAiPrivateEndpointId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
