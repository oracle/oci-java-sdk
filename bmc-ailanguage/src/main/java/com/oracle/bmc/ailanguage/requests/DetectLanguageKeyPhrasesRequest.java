/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.requests;

import com.oracle.bmc.ailanguage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectLanguageKeyPhrasesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DetectLanguageKeyPhrasesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class DetectLanguageKeyPhrasesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesDetails> {

    /** The details to make keyPhrase detect call. */
    private com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesDetails
            detectLanguageKeyPhrasesDetails;

    /** The details to make keyPhrase detect call. */
    public com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesDetails
            getDetectLanguageKeyPhrasesDetails() {
        return detectLanguageKeyPhrasesDetails;
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
    public com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesDetails getBody$() {
        return detectLanguageKeyPhrasesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DetectLanguageKeyPhrasesRequest,
                    com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details to make keyPhrase detect call. */
        private com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesDetails
                detectLanguageKeyPhrasesDetails = null;

        /**
         * The details to make keyPhrase detect call.
         *
         * @param detectLanguageKeyPhrasesDetails the value to set
         * @return this builder instance
         */
        public Builder detectLanguageKeyPhrasesDetails(
                com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesDetails
                        detectLanguageKeyPhrasesDetails) {
            this.detectLanguageKeyPhrasesDetails = detectLanguageKeyPhrasesDetails;
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
        public Builder copy(DetectLanguageKeyPhrasesRequest o) {
            detectLanguageKeyPhrasesDetails(o.getDetectLanguageKeyPhrasesDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DetectLanguageKeyPhrasesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DetectLanguageKeyPhrasesRequest
         */
        public DetectLanguageKeyPhrasesRequest build() {
            DetectLanguageKeyPhrasesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.ailanguage.model.DetectLanguageKeyPhrasesDetails body) {
            detectLanguageKeyPhrasesDetails(body);
            return this;
        }

        /**
         * Build the instance of DetectLanguageKeyPhrasesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DetectLanguageKeyPhrasesRequest
         */
        public DetectLanguageKeyPhrasesRequest buildWithoutInvocationCallback() {
            DetectLanguageKeyPhrasesRequest request = new DetectLanguageKeyPhrasesRequest();
            request.detectLanguageKeyPhrasesDetails = detectLanguageKeyPhrasesDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new DetectLanguageKeyPhrasesRequest(detectLanguageKeyPhrasesDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .detectLanguageKeyPhrasesDetails(detectLanguageKeyPhrasesDetails)
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
        sb.append(",detectLanguageKeyPhrasesDetails=")
                .append(String.valueOf(this.detectLanguageKeyPhrasesDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageKeyPhrasesRequest)) {
            return false;
        }

        DetectLanguageKeyPhrasesRequest other = (DetectLanguageKeyPhrasesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.detectLanguageKeyPhrasesDetails, other.detectLanguageKeyPhrasesDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.detectLanguageKeyPhrasesDetails == null
                                ? 43
                                : this.detectLanguageKeyPhrasesDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
