/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/GetRunbookImportExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRunbookImportRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class GetRunbookImportRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Runbook identifier */
    private String runbookId;

    /** Unique Runbook identifier */
    public String getRunbookId() {
        return runbookId;
    }
    /** Unique tracking identifier to fetch runbook import status */
    private String importId;

    /** Unique tracking identifier to fetch runbook import status */
    public String getImportId() {
        return importId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetRunbookImportRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Runbook identifier */
        private String runbookId = null;

        /**
         * Unique Runbook identifier
         *
         * @param runbookId the value to set
         * @return this builder instance
         */
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            return this;
        }

        /** Unique tracking identifier to fetch runbook import status */
        private String importId = null;

        /**
         * Unique tracking identifier to fetch runbook import status
         *
         * @param importId the value to set
         * @return this builder instance
         */
        public Builder importId(String importId) {
            this.importId = importId;
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
        public Builder copy(GetRunbookImportRequest o) {
            runbookId(o.getRunbookId());
            importId(o.getImportId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRunbookImportRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetRunbookImportRequest
         */
        public GetRunbookImportRequest build() {
            GetRunbookImportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRunbookImportRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRunbookImportRequest
         */
        public GetRunbookImportRequest buildWithoutInvocationCallback() {
            GetRunbookImportRequest request = new GetRunbookImportRequest();
            request.runbookId = runbookId;
            request.importId = importId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetRunbookImportRequest(runbookId, importId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().runbookId(runbookId).importId(importId).opcRequestId(opcRequestId);
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
        sb.append(",runbookId=").append(String.valueOf(this.runbookId));
        sb.append(",importId=").append(String.valueOf(this.importId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRunbookImportRequest)) {
            return false;
        }

        GetRunbookImportRequest other = (GetRunbookImportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.importId, other.importId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result = (result * PRIME) + (this.importId == null ? 43 : this.importId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
