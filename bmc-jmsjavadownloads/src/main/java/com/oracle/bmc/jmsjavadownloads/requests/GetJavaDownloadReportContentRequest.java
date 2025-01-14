/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.requests;

import com.oracle.bmc.jmsjavadownloads.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jmsjavadownloads/GetJavaDownloadReportContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetJavaDownloadReportContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class GetJavaDownloadReportContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique Java download report identifier. */
    private String javaDownloadReportId;

    /** Unique Java download report identifier. */
    public String getJavaDownloadReportId() {
        return javaDownloadReportId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetJavaDownloadReportContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique Java download report identifier. */
        private String javaDownloadReportId = null;

        /**
         * Unique Java download report identifier.
         *
         * @param javaDownloadReportId the value to set
         * @return this builder instance
         */
        public Builder javaDownloadReportId(String javaDownloadReportId) {
            this.javaDownloadReportId = javaDownloadReportId;
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
        public Builder copy(GetJavaDownloadReportContentRequest o) {
            javaDownloadReportId(o.getJavaDownloadReportId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetJavaDownloadReportContentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetJavaDownloadReportContentRequest
         */
        public GetJavaDownloadReportContentRequest build() {
            GetJavaDownloadReportContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetJavaDownloadReportContentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetJavaDownloadReportContentRequest
         */
        public GetJavaDownloadReportContentRequest buildWithoutInvocationCallback() {
            GetJavaDownloadReportContentRequest request = new GetJavaDownloadReportContentRequest();
            request.javaDownloadReportId = javaDownloadReportId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetJavaDownloadReportContentRequest(javaDownloadReportId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().javaDownloadReportId(javaDownloadReportId).opcRequestId(opcRequestId);
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
        sb.append(",javaDownloadReportId=").append(String.valueOf(this.javaDownloadReportId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetJavaDownloadReportContentRequest)) {
            return false;
        }

        GetJavaDownloadReportContentRequest other = (GetJavaDownloadReportContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.javaDownloadReportId, other.javaDownloadReportId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.javaDownloadReportId == null
                                ? 43
                                : this.javaDownloadReportId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
