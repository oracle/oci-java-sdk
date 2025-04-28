/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDatabaseTableAccessEntryExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDatabaseTableAccessEntryRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetDatabaseTableAccessEntryRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the security policy report resource. */
    private String securityPolicyReportId;

    /** The OCID of the security policy report resource. */
    public String getSecurityPolicyReportId() {
        return securityPolicyReportId;
    }
    /**
     * The unique key that identifies the table access object. This is a system-generated
     * identifier.
     */
    private String databaseTableAccessEntryKey;

    /**
     * The unique key that identifies the table access object. This is a system-generated
     * identifier.
     */
    public String getDatabaseTableAccessEntryKey() {
        return databaseTableAccessEntryKey;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDatabaseTableAccessEntryRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the security policy report resource. */
        private String securityPolicyReportId = null;

        /**
         * The OCID of the security policy report resource.
         *
         * @param securityPolicyReportId the value to set
         * @return this builder instance
         */
        public Builder securityPolicyReportId(String securityPolicyReportId) {
            this.securityPolicyReportId = securityPolicyReportId;
            return this;
        }

        /**
         * The unique key that identifies the table access object. This is a system-generated
         * identifier.
         */
        private String databaseTableAccessEntryKey = null;

        /**
         * The unique key that identifies the table access object. This is a system-generated
         * identifier.
         *
         * @param databaseTableAccessEntryKey the value to set
         * @return this builder instance
         */
        public Builder databaseTableAccessEntryKey(String databaseTableAccessEntryKey) {
            this.databaseTableAccessEntryKey = databaseTableAccessEntryKey;
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
        public Builder copy(GetDatabaseTableAccessEntryRequest o) {
            securityPolicyReportId(o.getSecurityPolicyReportId());
            databaseTableAccessEntryKey(o.getDatabaseTableAccessEntryKey());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDatabaseTableAccessEntryRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDatabaseTableAccessEntryRequest
         */
        public GetDatabaseTableAccessEntryRequest build() {
            GetDatabaseTableAccessEntryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDatabaseTableAccessEntryRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDatabaseTableAccessEntryRequest
         */
        public GetDatabaseTableAccessEntryRequest buildWithoutInvocationCallback() {
            GetDatabaseTableAccessEntryRequest request = new GetDatabaseTableAccessEntryRequest();
            request.securityPolicyReportId = securityPolicyReportId;
            request.databaseTableAccessEntryKey = databaseTableAccessEntryKey;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetDatabaseTableAccessEntryRequest(securityPolicyReportId,
            // databaseTableAccessEntryKey, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .securityPolicyReportId(securityPolicyReportId)
                .databaseTableAccessEntryKey(databaseTableAccessEntryKey)
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
        sb.append(",securityPolicyReportId=").append(String.valueOf(this.securityPolicyReportId));
        sb.append(",databaseTableAccessEntryKey=")
                .append(String.valueOf(this.databaseTableAccessEntryKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDatabaseTableAccessEntryRequest)) {
            return false;
        }

        GetDatabaseTableAccessEntryRequest other = (GetDatabaseTableAccessEntryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.securityPolicyReportId, other.securityPolicyReportId)
                && java.util.Objects.equals(
                        this.databaseTableAccessEntryKey, other.databaseTableAccessEntryKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityPolicyReportId == null
                                ? 43
                                : this.securityPolicyReportId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseTableAccessEntryKey == null
                                ? 43
                                : this.databaseTableAccessEntryKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
