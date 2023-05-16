/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.requests;

import com.oracle.bmc.fusionapps.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fusionapps/VerifyServiceAttachmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * VerifyServiceAttachmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
public class VerifyServiceAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.fusionapps.model.VerifyServiceAttachmentDetails> {

    /** Details for the service attachment. */
    private com.oracle.bmc.fusionapps.model.VerifyServiceAttachmentDetails
            verifyServiceAttachmentDetails;

    /** Details for the service attachment. */
    public com.oracle.bmc.fusionapps.model.VerifyServiceAttachmentDetails
            getVerifyServiceAttachmentDetails() {
        return verifyServiceAttachmentDetails;
    }
    /** unique FusionEnvironment identifier */
    private String fusionEnvironmentId;

    /** unique FusionEnvironment identifier */
    public String getFusionEnvironmentId() {
        return fusionEnvironmentId;
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
    public com.oracle.bmc.fusionapps.model.VerifyServiceAttachmentDetails getBody$() {
        return verifyServiceAttachmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    VerifyServiceAttachmentRequest,
                    com.oracle.bmc.fusionapps.model.VerifyServiceAttachmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for the service attachment. */
        private com.oracle.bmc.fusionapps.model.VerifyServiceAttachmentDetails
                verifyServiceAttachmentDetails = null;

        /**
         * Details for the service attachment.
         *
         * @param verifyServiceAttachmentDetails the value to set
         * @return this builder instance
         */
        public Builder verifyServiceAttachmentDetails(
                com.oracle.bmc.fusionapps.model.VerifyServiceAttachmentDetails
                        verifyServiceAttachmentDetails) {
            this.verifyServiceAttachmentDetails = verifyServiceAttachmentDetails;
            return this;
        }

        /** unique FusionEnvironment identifier */
        private String fusionEnvironmentId = null;

        /**
         * unique FusionEnvironment identifier
         *
         * @param fusionEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder fusionEnvironmentId(String fusionEnvironmentId) {
            this.fusionEnvironmentId = fusionEnvironmentId;
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
        public Builder copy(VerifyServiceAttachmentRequest o) {
            verifyServiceAttachmentDetails(o.getVerifyServiceAttachmentDetails());
            fusionEnvironmentId(o.getFusionEnvironmentId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of VerifyServiceAttachmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of VerifyServiceAttachmentRequest
         */
        public VerifyServiceAttachmentRequest build() {
            VerifyServiceAttachmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.fusionapps.model.VerifyServiceAttachmentDetails body) {
            verifyServiceAttachmentDetails(body);
            return this;
        }

        /**
         * Build the instance of VerifyServiceAttachmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of VerifyServiceAttachmentRequest
         */
        public VerifyServiceAttachmentRequest buildWithoutInvocationCallback() {
            VerifyServiceAttachmentRequest request = new VerifyServiceAttachmentRequest();
            request.verifyServiceAttachmentDetails = verifyServiceAttachmentDetails;
            request.fusionEnvironmentId = fusionEnvironmentId;
            request.opcRequestId = opcRequestId;
            return request;
            // new VerifyServiceAttachmentRequest(verifyServiceAttachmentDetails,
            // fusionEnvironmentId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .verifyServiceAttachmentDetails(verifyServiceAttachmentDetails)
                .fusionEnvironmentId(fusionEnvironmentId)
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
        sb.append(",verifyServiceAttachmentDetails=")
                .append(String.valueOf(this.verifyServiceAttachmentDetails));
        sb.append(",fusionEnvironmentId=").append(String.valueOf(this.fusionEnvironmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifyServiceAttachmentRequest)) {
            return false;
        }

        VerifyServiceAttachmentRequest other = (VerifyServiceAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.verifyServiceAttachmentDetails, other.verifyServiceAttachmentDetails)
                && java.util.Objects.equals(this.fusionEnvironmentId, other.fusionEnvironmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.verifyServiceAttachmentDetails == null
                                ? 43
                                : this.verifyServiceAttachmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.fusionEnvironmentId == null
                                ? 43
                                : this.fusionEnvironmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
