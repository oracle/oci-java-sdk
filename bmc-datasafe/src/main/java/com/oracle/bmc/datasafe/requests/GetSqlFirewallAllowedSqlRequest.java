/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSqlFirewallAllowedSqlExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetSqlFirewallAllowedSqlRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetSqlFirewallAllowedSqlRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the sqlFirewallAllowedSql resource. */
    private String sqlFirewallAllowedSqlId;

    /** The OCID of the sqlFirewallAllowedSql resource. */
    public String getSqlFirewallAllowedSqlId() {
        return sqlFirewallAllowedSqlId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSqlFirewallAllowedSqlRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the sqlFirewallAllowedSql resource. */
        private String sqlFirewallAllowedSqlId = null;

        /**
         * The OCID of the sqlFirewallAllowedSql resource.
         *
         * @param sqlFirewallAllowedSqlId the value to set
         * @return this builder instance
         */
        public Builder sqlFirewallAllowedSqlId(String sqlFirewallAllowedSqlId) {
            this.sqlFirewallAllowedSqlId = sqlFirewallAllowedSqlId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(GetSqlFirewallAllowedSqlRequest o) {
            sqlFirewallAllowedSqlId(o.getSqlFirewallAllowedSqlId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSqlFirewallAllowedSqlRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetSqlFirewallAllowedSqlRequest
         */
        public GetSqlFirewallAllowedSqlRequest build() {
            GetSqlFirewallAllowedSqlRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSqlFirewallAllowedSqlRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSqlFirewallAllowedSqlRequest
         */
        public GetSqlFirewallAllowedSqlRequest buildWithoutInvocationCallback() {
            GetSqlFirewallAllowedSqlRequest request = new GetSqlFirewallAllowedSqlRequest();
            request.sqlFirewallAllowedSqlId = sqlFirewallAllowedSqlId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetSqlFirewallAllowedSqlRequest(sqlFirewallAllowedSqlId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sqlFirewallAllowedSqlId(sqlFirewallAllowedSqlId)
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
        sb.append(",sqlFirewallAllowedSqlId=").append(String.valueOf(this.sqlFirewallAllowedSqlId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSqlFirewallAllowedSqlRequest)) {
            return false;
        }

        GetSqlFirewallAllowedSqlRequest other = (GetSqlFirewallAllowedSqlRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.sqlFirewallAllowedSqlId, other.sqlFirewallAllowedSqlId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sqlFirewallAllowedSqlId == null
                                ? 43
                                : this.sqlFirewallAllowedSqlId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
