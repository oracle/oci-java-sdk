/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/CreateCertificateExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateCertificateRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class CreateCertificateRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.goldengate.model.CreateCertificateDetails> {

    /** Specifications to create the certificate to truststore. */
    private com.oracle.bmc.goldengate.model.CreateCertificateDetails createCertificateDetails;

    /** Specifications to create the certificate to truststore. */
    public com.oracle.bmc.goldengate.model.CreateCertificateDetails getCreateCertificateDetails() {
        return createCertificateDetails;
    }
    /** A unique Deployment identifier. */
    private String deploymentId;

    /** A unique Deployment identifier. */
    public String getDeploymentId() {
        return deploymentId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or
     * server error, without the risk of executing that same action again. Retry tokens expire after
     * 24 hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource was deleted and purged from the system, then a retry of the original creation
     * request is rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried, in case of a timeout or
     * server error, without the risk of executing that same action again. Retry tokens expire after
     * 24 hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource was deleted and purged from the system, then a retry of the original creation
     * request is rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** Whether to override locks (if any exist). */
    private Boolean isLockOverride;

    /** Whether to override locks (if any exist). */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.goldengate.model.CreateCertificateDetails getBody$() {
        return createCertificateDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateCertificateRequest,
                    com.oracle.bmc.goldengate.model.CreateCertificateDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Specifications to create the certificate to truststore. */
        private com.oracle.bmc.goldengate.model.CreateCertificateDetails createCertificateDetails =
                null;

        /**
         * Specifications to create the certificate to truststore.
         *
         * @param createCertificateDetails the value to set
         * @return this builder instance
         */
        public Builder createCertificateDetails(
                com.oracle.bmc.goldengate.model.CreateCertificateDetails createCertificateDetails) {
            this.createCertificateDetails = createCertificateDetails;
            return this;
        }

        /** A unique Deployment identifier. */
        private String deploymentId = null;

        /**
         * A unique Deployment identifier.
         *
         * @param deploymentId the value to set
         * @return this builder instance
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or
         * server error, without the risk of executing that same action again. Retry tokens expire
         * after 24 hours but can be invalidated before then due to conflicting operations. For
         * example, if a resource was deleted and purged from the system, then a retry of the
         * original creation request is rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried, in case of a timeout or
         * server error, without the risk of executing that same action again. Retry tokens expire
         * after 24 hours but can be invalidated before then due to conflicting operations. For
         * example, if a resource was deleted and purged from the system, then a retry of the
         * original creation request is rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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

        /** Whether to override locks (if any exist). */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         *
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
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
        public Builder copy(CreateCertificateRequest o) {
            createCertificateDetails(o.getCreateCertificateDetails());
            deploymentId(o.getDeploymentId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateCertificateRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateCertificateRequest
         */
        public CreateCertificateRequest build() {
            CreateCertificateRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.goldengate.model.CreateCertificateDetails body) {
            createCertificateDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateCertificateRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateCertificateRequest
         */
        public CreateCertificateRequest buildWithoutInvocationCallback() {
            CreateCertificateRequest request = new CreateCertificateRequest();
            request.createCertificateDetails = createCertificateDetails;
            request.deploymentId = deploymentId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.isLockOverride = isLockOverride;
            return request;
            // new CreateCertificateRequest(createCertificateDetails, deploymentId, opcRetryToken,
            // opcRequestId, isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createCertificateDetails(createCertificateDetails)
                .deploymentId(deploymentId)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .isLockOverride(isLockOverride);
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
        sb.append(",createCertificateDetails=")
                .append(String.valueOf(this.createCertificateDetails));
        sb.append(",deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCertificateRequest)) {
            return false;
        }

        CreateCertificateRequest other = (CreateCertificateRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createCertificateDetails, other.createCertificateDetails)
                && java.util.Objects.equals(this.deploymentId, other.deploymentId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createCertificateDetails == null
                                ? 43
                                : this.createCertificateDetails.hashCode());
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
