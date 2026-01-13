/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/GetOracleDbAwsIdentityConnectorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetOracleDbAwsIdentityConnectorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class GetOracleDbAwsIdentityConnectorRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB AWS Identity Connector resource.
     */
    private String oracleDbAwsIdentityConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB AWS Identity Connector resource.
     */
    public String getOracleDbAwsIdentityConnectorId() {
        return oracleDbAwsIdentityConnectorId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetOracleDbAwsIdentityConnectorRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB AWS Identity Connector resource.
         */
        private String oracleDbAwsIdentityConnectorId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB AWS Identity Connector resource.
         *
         * @param oracleDbAwsIdentityConnectorId the value to set
         * @return this builder instance
         */
        public Builder oracleDbAwsIdentityConnectorId(String oracleDbAwsIdentityConnectorId) {
            this.oracleDbAwsIdentityConnectorId = oracleDbAwsIdentityConnectorId;
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
        public Builder copy(GetOracleDbAwsIdentityConnectorRequest o) {
            oracleDbAwsIdentityConnectorId(o.getOracleDbAwsIdentityConnectorId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetOracleDbAwsIdentityConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetOracleDbAwsIdentityConnectorRequest
         */
        public GetOracleDbAwsIdentityConnectorRequest build() {
            GetOracleDbAwsIdentityConnectorRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetOracleDbAwsIdentityConnectorRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetOracleDbAwsIdentityConnectorRequest
         */
        public GetOracleDbAwsIdentityConnectorRequest buildWithoutInvocationCallback() {
            GetOracleDbAwsIdentityConnectorRequest request =
                    new GetOracleDbAwsIdentityConnectorRequest();
            request.oracleDbAwsIdentityConnectorId = oracleDbAwsIdentityConnectorId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetOracleDbAwsIdentityConnectorRequest(oracleDbAwsIdentityConnectorId,
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
                .oracleDbAwsIdentityConnectorId(oracleDbAwsIdentityConnectorId)
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
        sb.append(",oracleDbAwsIdentityConnectorId=")
                .append(String.valueOf(this.oracleDbAwsIdentityConnectorId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOracleDbAwsIdentityConnectorRequest)) {
            return false;
        }

        GetOracleDbAwsIdentityConnectorRequest other = (GetOracleDbAwsIdentityConnectorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.oracleDbAwsIdentityConnectorId, other.oracleDbAwsIdentityConnectorId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.oracleDbAwsIdentityConnectorId == null
                                ? 43
                                : this.oracleDbAwsIdentityConnectorId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
