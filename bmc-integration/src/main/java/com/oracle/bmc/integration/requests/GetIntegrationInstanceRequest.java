/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.requests;

import com.oracle.bmc.integration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/integration/GetIntegrationInstanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetIntegrationInstanceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
public class GetIntegrationInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Integration Instance identifier. */
    private String integrationInstanceId;

    /** Unique Integration Instance identifier. */
    public String getIntegrationInstanceId() {
        return integrationInstanceId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetIntegrationInstanceRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Integration Instance identifier. */
        private String integrationInstanceId = null;

        /**
         * Unique Integration Instance identifier.
         *
         * @param integrationInstanceId the value to set
         * @return this builder instance
         */
        public Builder integrationInstanceId(String integrationInstanceId) {
            this.integrationInstanceId = integrationInstanceId;
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
        public Builder copy(GetIntegrationInstanceRequest o) {
            integrationInstanceId(o.getIntegrationInstanceId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetIntegrationInstanceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetIntegrationInstanceRequest
         */
        public GetIntegrationInstanceRequest build() {
            GetIntegrationInstanceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetIntegrationInstanceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetIntegrationInstanceRequest
         */
        public GetIntegrationInstanceRequest buildWithoutInvocationCallback() {
            GetIntegrationInstanceRequest request = new GetIntegrationInstanceRequest();
            request.integrationInstanceId = integrationInstanceId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetIntegrationInstanceRequest(integrationInstanceId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .integrationInstanceId(integrationInstanceId)
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
        sb.append(",integrationInstanceId=").append(String.valueOf(this.integrationInstanceId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetIntegrationInstanceRequest)) {
            return false;
        }

        GetIntegrationInstanceRequest other = (GetIntegrationInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.integrationInstanceId, other.integrationInstanceId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.integrationInstanceId == null
                                ? 43
                                : this.integrationInstanceId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
