/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emaildataplane.requests;

import com.oracle.bmc.emaildataplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/emaildataplane/SubmitEmailExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use SubmitEmailRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220926")
public class SubmitEmailRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.emaildataplane.model.SubmitEmailDetails> {

    /** Parameters for submitEmail API. */
    private com.oracle.bmc.emaildataplane.model.SubmitEmailDetails submitEmailDetails;

    /** Parameters for submitEmail API. */
    public com.oracle.bmc.emaildataplane.model.SubmitEmailDetails getSubmitEmailDetails() {
        return submitEmailDetails;
    }
    /** The request ID for tracing from the system */
    private String opcRequestId;

    /** The request ID for tracing from the system */
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
    public com.oracle.bmc.emaildataplane.model.SubmitEmailDetails getBody$() {
        return submitEmailDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SubmitEmailRequest, com.oracle.bmc.emaildataplane.model.SubmitEmailDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Parameters for submitEmail API. */
        private com.oracle.bmc.emaildataplane.model.SubmitEmailDetails submitEmailDetails = null;

        /**
         * Parameters for submitEmail API.
         *
         * @param submitEmailDetails the value to set
         * @return this builder instance
         */
        public Builder submitEmailDetails(
                com.oracle.bmc.emaildataplane.model.SubmitEmailDetails submitEmailDetails) {
            this.submitEmailDetails = submitEmailDetails;
            return this;
        }

        /** The request ID for tracing from the system */
        private String opcRequestId = null;

        /**
         * The request ID for tracing from the system
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
        public Builder copy(SubmitEmailRequest o) {
            submitEmailDetails(o.getSubmitEmailDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SubmitEmailRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SubmitEmailRequest
         */
        public SubmitEmailRequest build() {
            SubmitEmailRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.emaildataplane.model.SubmitEmailDetails body) {
            submitEmailDetails(body);
            return this;
        }

        /**
         * Build the instance of SubmitEmailRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SubmitEmailRequest
         */
        public SubmitEmailRequest buildWithoutInvocationCallback() {
            SubmitEmailRequest request = new SubmitEmailRequest();
            request.submitEmailDetails = submitEmailDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new SubmitEmailRequest(submitEmailDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().submitEmailDetails(submitEmailDetails).opcRequestId(opcRequestId);
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
        sb.append(",submitEmailDetails=").append(String.valueOf(this.submitEmailDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubmitEmailRequest)) {
            return false;
        }

        SubmitEmailRequest other = (SubmitEmailRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.submitEmailDetails, other.submitEmailDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.submitEmailDetails == null
                                ? 43
                                : this.submitEmailDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
