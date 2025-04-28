/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.requests;

import com.oracle.bmc.apmconfig.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmconfig/CopyConfigurationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CopyConfigurationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class CopyConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmconfig.model.CopyConfigurationDetails> {

    /** JSON metadata for fast Export/Import configurations domain. */
    private com.oracle.bmc.apmconfig.model.CopyConfigurationDetails copyConfigurationDetails;

    /** JSON metadata for fast Export/Import configurations domain. */
    public com.oracle.bmc.apmconfig.model.CopyConfigurationDetails getCopyConfigurationDetails() {
        return copyConfigurationDetails;
    }
    /** The APM Domain ID the request is intended for. */
    private String apmDomainId;

    /** The APM Domain ID the request is intended for. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** The Target APM Domain ID the request is intended for. */
    private String apmTargetDomainId;

    /** The Target APM Domain ID the request is intended for. */
    public String getApmTargetDomainId() {
        return apmTargetDomainId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
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
    public com.oracle.bmc.apmconfig.model.CopyConfigurationDetails getBody$() {
        return copyConfigurationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CopyConfigurationRequest,
                    com.oracle.bmc.apmconfig.model.CopyConfigurationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** JSON metadata for fast Export/Import configurations domain. */
        private com.oracle.bmc.apmconfig.model.CopyConfigurationDetails copyConfigurationDetails =
                null;

        /**
         * JSON metadata for fast Export/Import configurations domain.
         *
         * @param copyConfigurationDetails the value to set
         * @return this builder instance
         */
        public Builder copyConfigurationDetails(
                com.oracle.bmc.apmconfig.model.CopyConfigurationDetails copyConfigurationDetails) {
            this.copyConfigurationDetails = copyConfigurationDetails;
            return this;
        }

        /** The APM Domain ID the request is intended for. */
        private String apmDomainId = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /** The Target APM Domain ID the request is intended for. */
        private String apmTargetDomainId = null;

        /**
         * The Target APM Domain ID the request is intended for.
         *
         * @param apmTargetDomainId the value to set
         * @return this builder instance
         */
        public Builder apmTargetDomainId(String apmTargetDomainId) {
            this.apmTargetDomainId = apmTargetDomainId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(CopyConfigurationRequest o) {
            copyConfigurationDetails(o.getCopyConfigurationDetails());
            apmDomainId(o.getApmDomainId());
            apmTargetDomainId(o.getApmTargetDomainId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CopyConfigurationRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CopyConfigurationRequest
         */
        public CopyConfigurationRequest build() {
            CopyConfigurationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apmconfig.model.CopyConfigurationDetails body) {
            copyConfigurationDetails(body);
            return this;
        }

        /**
         * Build the instance of CopyConfigurationRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CopyConfigurationRequest
         */
        public CopyConfigurationRequest buildWithoutInvocationCallback() {
            CopyConfigurationRequest request = new CopyConfigurationRequest();
            request.copyConfigurationDetails = copyConfigurationDetails;
            request.apmDomainId = apmDomainId;
            request.apmTargetDomainId = apmTargetDomainId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CopyConfigurationRequest(copyConfigurationDetails, apmDomainId,
            // apmTargetDomainId, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .copyConfigurationDetails(copyConfigurationDetails)
                .apmDomainId(apmDomainId)
                .apmTargetDomainId(apmTargetDomainId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",copyConfigurationDetails=")
                .append(String.valueOf(this.copyConfigurationDetails));
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",apmTargetDomainId=").append(String.valueOf(this.apmTargetDomainId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyConfigurationRequest)) {
            return false;
        }

        CopyConfigurationRequest other = (CopyConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.copyConfigurationDetails, other.copyConfigurationDetails)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.apmTargetDomainId, other.apmTargetDomainId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.copyConfigurationDetails == null
                                ? 43
                                : this.copyConfigurationDetails.hashCode());
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.apmTargetDomainId == null ? 43 : this.apmTargetDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
