/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.requests;

import com.oracle.bmc.ailanguage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectLanguageSentimentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DetectLanguageSentimentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class DetectLanguageSentimentsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsDetails> {

    /**
     * The details to make sentiment detect call.
     *
     */
    private com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsDetails
            detectLanguageSentimentsDetails;

    /**
     * The details to make sentiment detect call.
     *
     */
    public com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsDetails
            getDetectLanguageSentimentsDetails() {
        return detectLanguageSentimentsDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsDetails getBody$() {
        return detectLanguageSentimentsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DetectLanguageSentimentsRequest,
                    com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The details to make sentiment detect call.
         *
         */
        private com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsDetails
                detectLanguageSentimentsDetails = null;

        /**
         * The details to make sentiment detect call.
         *
         * @param detectLanguageSentimentsDetails the value to set
         * @return this builder instance
         */
        public Builder detectLanguageSentimentsDetails(
                com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsDetails
                        detectLanguageSentimentsDetails) {
            this.detectLanguageSentimentsDetails = detectLanguageSentimentsDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * @return this builder instance
         */
        public Builder copy(DetectLanguageSentimentsRequest o) {
            detectLanguageSentimentsDetails(o.getDetectLanguageSentimentsDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DetectLanguageSentimentsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DetectLanguageSentimentsRequest
         */
        public DetectLanguageSentimentsRequest build() {
            DetectLanguageSentimentsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.ailanguage.model.DetectLanguageSentimentsDetails body) {
            detectLanguageSentimentsDetails(body);
            return this;
        }

        /**
         * Build the instance of DetectLanguageSentimentsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DetectLanguageSentimentsRequest
         */
        public DetectLanguageSentimentsRequest buildWithoutInvocationCallback() {
            DetectLanguageSentimentsRequest request = new DetectLanguageSentimentsRequest();
            request.detectLanguageSentimentsDetails = detectLanguageSentimentsDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new DetectLanguageSentimentsRequest(detectLanguageSentimentsDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .detectLanguageSentimentsDetails(detectLanguageSentimentsDetails)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",detectLanguageSentimentsDetails=")
                .append(String.valueOf(this.detectLanguageSentimentsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetectLanguageSentimentsRequest)) {
            return false;
        }

        DetectLanguageSentimentsRequest other = (DetectLanguageSentimentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.detectLanguageSentimentsDetails, other.detectLanguageSentimentsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.detectLanguageSentimentsDetails == null
                                ? 43
                                : this.detectLanguageSentimentsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
