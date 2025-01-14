/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.requests;

import com.oracle.bmc.aivision.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aivision/AnalyzeImageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use AnalyzeImageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
public class AnalyzeImageRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.aivision.model.AnalyzeImageDetails> {

    /** Details about how to analyze an image. */
    private com.oracle.bmc.aivision.model.AnalyzeImageDetails analyzeImageDetails;

    /** Details about how to analyze an image. */
    public com.oracle.bmc.aivision.model.AnalyzeImageDetails getAnalyzeImageDetails() {
        return analyzeImageDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.aivision.model.AnalyzeImageDetails getBody$() {
        return analyzeImageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AnalyzeImageRequest, com.oracle.bmc.aivision.model.AnalyzeImageDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details about how to analyze an image. */
        private com.oracle.bmc.aivision.model.AnalyzeImageDetails analyzeImageDetails = null;

        /**
         * Details about how to analyze an image.
         *
         * @param analyzeImageDetails the value to set
         * @return this builder instance
         */
        public Builder analyzeImageDetails(
                com.oracle.bmc.aivision.model.AnalyzeImageDetails analyzeImageDetails) {
            this.analyzeImageDetails = analyzeImageDetails;
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
        public Builder copy(AnalyzeImageRequest o) {
            analyzeImageDetails(o.getAnalyzeImageDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AnalyzeImageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AnalyzeImageRequest
         */
        public AnalyzeImageRequest build() {
            AnalyzeImageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.aivision.model.AnalyzeImageDetails body) {
            analyzeImageDetails(body);
            return this;
        }

        /**
         * Build the instance of AnalyzeImageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AnalyzeImageRequest
         */
        public AnalyzeImageRequest buildWithoutInvocationCallback() {
            AnalyzeImageRequest request = new AnalyzeImageRequest();
            request.analyzeImageDetails = analyzeImageDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new AnalyzeImageRequest(analyzeImageDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().analyzeImageDetails(analyzeImageDetails).opcRequestId(opcRequestId);
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
        sb.append(",analyzeImageDetails=").append(String.valueOf(this.analyzeImageDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnalyzeImageRequest)) {
            return false;
        }

        AnalyzeImageRequest other = (AnalyzeImageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.analyzeImageDetails, other.analyzeImageDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.analyzeImageDetails == null
                                ? 43
                                : this.analyzeImageDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
