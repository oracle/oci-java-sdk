/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.requests;

import com.oracle.bmc.filestorage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/filestorage/ValidateKeyTabsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ValidateKeyTabsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class ValidateKeyTabsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.filestorage.model.ValidateKeyTabsDetails> {

    /** Keytab secret details or mount target ID for validating keytabs. */
    private com.oracle.bmc.filestorage.model.ValidateKeyTabsDetails validateKeyTabsDetails;

    /** Keytab secret details or mount target ID for validating keytabs. */
    public com.oracle.bmc.filestorage.model.ValidateKeyTabsDetails getValidateKeyTabsDetails() {
        return validateKeyTabsDetails;
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
    public com.oracle.bmc.filestorage.model.ValidateKeyTabsDetails getBody$() {
        return validateKeyTabsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ValidateKeyTabsRequest,
                    com.oracle.bmc.filestorage.model.ValidateKeyTabsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Keytab secret details or mount target ID for validating keytabs. */
        private com.oracle.bmc.filestorage.model.ValidateKeyTabsDetails validateKeyTabsDetails =
                null;

        /**
         * Keytab secret details or mount target ID for validating keytabs.
         *
         * @param validateKeyTabsDetails the value to set
         * @return this builder instance
         */
        public Builder validateKeyTabsDetails(
                com.oracle.bmc.filestorage.model.ValidateKeyTabsDetails validateKeyTabsDetails) {
            this.validateKeyTabsDetails = validateKeyTabsDetails;
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
        public Builder copy(ValidateKeyTabsRequest o) {
            validateKeyTabsDetails(o.getValidateKeyTabsDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ValidateKeyTabsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ValidateKeyTabsRequest
         */
        public ValidateKeyTabsRequest build() {
            ValidateKeyTabsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.filestorage.model.ValidateKeyTabsDetails body) {
            validateKeyTabsDetails(body);
            return this;
        }

        /**
         * Build the instance of ValidateKeyTabsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ValidateKeyTabsRequest
         */
        public ValidateKeyTabsRequest buildWithoutInvocationCallback() {
            ValidateKeyTabsRequest request = new ValidateKeyTabsRequest();
            request.validateKeyTabsDetails = validateKeyTabsDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ValidateKeyTabsRequest(validateKeyTabsDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .validateKeyTabsDetails(validateKeyTabsDetails)
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
        sb.append(",validateKeyTabsDetails=").append(String.valueOf(this.validateKeyTabsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateKeyTabsRequest)) {
            return false;
        }

        ValidateKeyTabsRequest other = (ValidateKeyTabsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.validateKeyTabsDetails, other.validateKeyTabsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.validateKeyTabsDetails == null
                                ? 43
                                : this.validateKeyTabsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
