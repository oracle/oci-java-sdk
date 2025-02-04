/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetSensitiveTypesExportExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetSensitiveTypesExportRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetSensitiveTypesExportRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the sensitive types export. */
    private String sensitiveTypesExportId;

    /** The OCID of the sensitive types export. */
    public String getSensitiveTypesExportId() {
        return sensitiveTypesExportId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSensitiveTypesExportRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the sensitive types export. */
        private String sensitiveTypesExportId = null;

        /**
         * The OCID of the sensitive types export.
         *
         * @param sensitiveTypesExportId the value to set
         * @return this builder instance
         */
        public Builder sensitiveTypesExportId(String sensitiveTypesExportId) {
            this.sensitiveTypesExportId = sensitiveTypesExportId;
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
        public Builder copy(GetSensitiveTypesExportRequest o) {
            sensitiveTypesExportId(o.getSensitiveTypesExportId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSensitiveTypesExportRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetSensitiveTypesExportRequest
         */
        public GetSensitiveTypesExportRequest build() {
            GetSensitiveTypesExportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSensitiveTypesExportRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSensitiveTypesExportRequest
         */
        public GetSensitiveTypesExportRequest buildWithoutInvocationCallback() {
            GetSensitiveTypesExportRequest request = new GetSensitiveTypesExportRequest();
            request.sensitiveTypesExportId = sensitiveTypesExportId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetSensitiveTypesExportRequest(sensitiveTypesExportId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sensitiveTypesExportId(sensitiveTypesExportId)
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
        sb.append(",sensitiveTypesExportId=").append(String.valueOf(this.sensitiveTypesExportId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSensitiveTypesExportRequest)) {
            return false;
        }

        GetSensitiveTypesExportRequest other = (GetSensitiveTypesExportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.sensitiveTypesExportId, other.sensitiveTypesExportId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sensitiveTypesExportId == null
                                ? 43
                                : this.sensitiveTypesExportId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
