/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.requests;

import com.oracle.bmc.managementdashboard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementdashboard/GetOobManagementSavedSearchExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetOobManagementSavedSearchRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
public class GetOobManagementSavedSearchRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A unique saved search identifier. */
    private String managementSavedSearchId;

    /** A unique saved search identifier. */
    public String getManagementSavedSearchId() {
        return managementSavedSearchId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetOobManagementSavedSearchRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A unique saved search identifier. */
        private String managementSavedSearchId = null;

        /**
         * A unique saved search identifier.
         *
         * @param managementSavedSearchId the value to set
         * @return this builder instance
         */
        public Builder managementSavedSearchId(String managementSavedSearchId) {
            this.managementSavedSearchId = managementSavedSearchId;
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
        public Builder copy(GetOobManagementSavedSearchRequest o) {
            managementSavedSearchId(o.getManagementSavedSearchId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetOobManagementSavedSearchRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetOobManagementSavedSearchRequest
         */
        public GetOobManagementSavedSearchRequest build() {
            GetOobManagementSavedSearchRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetOobManagementSavedSearchRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetOobManagementSavedSearchRequest
         */
        public GetOobManagementSavedSearchRequest buildWithoutInvocationCallback() {
            GetOobManagementSavedSearchRequest request = new GetOobManagementSavedSearchRequest();
            request.managementSavedSearchId = managementSavedSearchId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetOobManagementSavedSearchRequest(managementSavedSearchId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managementSavedSearchId(managementSavedSearchId)
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
        sb.append(",managementSavedSearchId=").append(String.valueOf(this.managementSavedSearchId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOobManagementSavedSearchRequest)) {
            return false;
        }

        GetOobManagementSavedSearchRequest other = (GetOobManagementSavedSearchRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.managementSavedSearchId, other.managementSavedSearchId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managementSavedSearchId == null
                                ? 43
                                : this.managementSavedSearchId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
