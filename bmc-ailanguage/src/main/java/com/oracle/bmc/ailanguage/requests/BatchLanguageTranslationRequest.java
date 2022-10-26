/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.requests;

import com.oracle.bmc.ailanguage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchLanguageTranslationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * BatchLanguageTranslationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class BatchLanguageTranslationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ailanguage.model.BatchLanguageTranslationDetails> {

    /** The details to make language translation call. */
    private com.oracle.bmc.ailanguage.model.BatchLanguageTranslationDetails
            batchLanguageTranslationDetails;

    /** The details to make language translation call. */
    public com.oracle.bmc.ailanguage.model.BatchLanguageTranslationDetails
            getBatchLanguageTranslationDetails() {
        return batchLanguageTranslationDetails;
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
    public com.oracle.bmc.ailanguage.model.BatchLanguageTranslationDetails getBody$() {
        return batchLanguageTranslationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BatchLanguageTranslationRequest,
                    com.oracle.bmc.ailanguage.model.BatchLanguageTranslationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details to make language translation call. */
        private com.oracle.bmc.ailanguage.model.BatchLanguageTranslationDetails
                batchLanguageTranslationDetails = null;

        /**
         * The details to make language translation call.
         *
         * @param batchLanguageTranslationDetails the value to set
         * @return this builder instance
         */
        public Builder batchLanguageTranslationDetails(
                com.oracle.bmc.ailanguage.model.BatchLanguageTranslationDetails
                        batchLanguageTranslationDetails) {
            this.batchLanguageTranslationDetails = batchLanguageTranslationDetails;
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
        public Builder copy(BatchLanguageTranslationRequest o) {
            batchLanguageTranslationDetails(o.getBatchLanguageTranslationDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BatchLanguageTranslationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BatchLanguageTranslationRequest
         */
        public BatchLanguageTranslationRequest build() {
            BatchLanguageTranslationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.ailanguage.model.BatchLanguageTranslationDetails body) {
            batchLanguageTranslationDetails(body);
            return this;
        }

        /**
         * Build the instance of BatchLanguageTranslationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BatchLanguageTranslationRequest
         */
        public BatchLanguageTranslationRequest buildWithoutInvocationCallback() {
            BatchLanguageTranslationRequest request = new BatchLanguageTranslationRequest();
            request.batchLanguageTranslationDetails = batchLanguageTranslationDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new BatchLanguageTranslationRequest(batchLanguageTranslationDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .batchLanguageTranslationDetails(batchLanguageTranslationDetails)
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
        sb.append(",batchLanguageTranslationDetails=")
                .append(String.valueOf(this.batchLanguageTranslationDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchLanguageTranslationRequest)) {
            return false;
        }

        BatchLanguageTranslationRequest other = (BatchLanguageTranslationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.batchLanguageTranslationDetails, other.batchLanguageTranslationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.batchLanguageTranslationDetails == null
                                ? 43
                                : this.batchLanguageTranslationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
