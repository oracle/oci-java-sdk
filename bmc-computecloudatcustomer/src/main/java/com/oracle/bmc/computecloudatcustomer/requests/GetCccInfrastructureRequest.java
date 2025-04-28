/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.requests;

import com.oracle.bmc.computecloudatcustomer.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computecloudatcustomer/GetCccInfrastructureExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetCccInfrastructureRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
public class GetCccInfrastructureRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for a
     * Compute Cloud@Customer Infrastructure.
     */
    private String cccInfrastructureId;

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for a
     * Compute Cloud@Customer Infrastructure.
     */
    public String getCccInfrastructureId() {
        return cccInfrastructureId;
    }
    /**
     * The client request
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for tracing.
     */
    private String opcRequestId;

    /**
     * The client request
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetCccInfrastructureRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for a
         * Compute Cloud@Customer Infrastructure.
         */
        private String cccInfrastructureId = null;

        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for a
         * Compute Cloud@Customer Infrastructure.
         *
         * @param cccInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder cccInfrastructureId(String cccInfrastructureId) {
            this.cccInfrastructureId = cccInfrastructureId;
            return this;
        }

        /**
         * The client request
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for
         * tracing.
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
        public Builder copy(GetCccInfrastructureRequest o) {
            cccInfrastructureId(o.getCccInfrastructureId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCccInfrastructureRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetCccInfrastructureRequest
         */
        public GetCccInfrastructureRequest build() {
            GetCccInfrastructureRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCccInfrastructureRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCccInfrastructureRequest
         */
        public GetCccInfrastructureRequest buildWithoutInvocationCallback() {
            GetCccInfrastructureRequest request = new GetCccInfrastructureRequest();
            request.cccInfrastructureId = cccInfrastructureId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetCccInfrastructureRequest(cccInfrastructureId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().cccInfrastructureId(cccInfrastructureId).opcRequestId(opcRequestId);
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
        sb.append(",cccInfrastructureId=").append(String.valueOf(this.cccInfrastructureId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCccInfrastructureRequest)) {
            return false;
        }

        GetCccInfrastructureRequest other = (GetCccInfrastructureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cccInfrastructureId, other.cccInfrastructureId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cccInfrastructureId == null
                                ? 43
                                : this.cccInfrastructureId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
