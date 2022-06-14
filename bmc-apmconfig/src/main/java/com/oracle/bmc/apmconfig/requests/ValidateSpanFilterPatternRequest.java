/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.requests;

import com.oracle.bmc.apmconfig.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmconfig/ValidateSpanFilterPatternExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ValidateSpanFilterPatternRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class ValidateSpanFilterPatternRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmconfig.model.ValidateSpanFilterPatternDetails> {

    /**
     * The APM Domain ID the request is intended for.
     *
     */
    private String apmDomainId;

    /**
     * The APM Domain ID the request is intended for.
     *
     */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * The Span Filter pattern to validate.
     */
    private com.oracle.bmc.apmconfig.model.ValidateSpanFilterPatternDetails
            validateSpanFilterPatternDetails;

    /**
     * The Span Filter pattern to validate.
     */
    public com.oracle.bmc.apmconfig.model.ValidateSpanFilterPatternDetails
            getValidateSpanFilterPatternDetails() {
        return validateSpanFilterPatternDetails;
    }
    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
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
    public com.oracle.bmc.apmconfig.model.ValidateSpanFilterPatternDetails getBody$() {
        return validateSpanFilterPatternDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ValidateSpanFilterPatternRequest,
                    com.oracle.bmc.apmconfig.model.ValidateSpanFilterPatternDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         */
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

        /**
         * The Span Filter pattern to validate.
         */
        private com.oracle.bmc.apmconfig.model.ValidateSpanFilterPatternDetails
                validateSpanFilterPatternDetails = null;

        /**
         * The Span Filter pattern to validate.
         * @param validateSpanFilterPatternDetails the value to set
         * @return this builder instance
         */
        public Builder validateSpanFilterPatternDetails(
                com.oracle.bmc.apmconfig.model.ValidateSpanFilterPatternDetails
                        validateSpanFilterPatternDetails) {
            this.validateSpanFilterPatternDetails = validateSpanFilterPatternDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
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
        public Builder copy(ValidateSpanFilterPatternRequest o) {
            apmDomainId(o.getApmDomainId());
            validateSpanFilterPatternDetails(o.getValidateSpanFilterPatternDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ValidateSpanFilterPatternRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ValidateSpanFilterPatternRequest
         */
        public ValidateSpanFilterPatternRequest build() {
            ValidateSpanFilterPatternRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apmconfig.model.ValidateSpanFilterPatternDetails body) {
            validateSpanFilterPatternDetails(body);
            return this;
        }

        /**
         * Build the instance of ValidateSpanFilterPatternRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ValidateSpanFilterPatternRequest
         */
        public ValidateSpanFilterPatternRequest buildWithoutInvocationCallback() {
            ValidateSpanFilterPatternRequest request = new ValidateSpanFilterPatternRequest();
            request.apmDomainId = apmDomainId;
            request.validateSpanFilterPatternDetails = validateSpanFilterPatternDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new ValidateSpanFilterPatternRequest(apmDomainId, validateSpanFilterPatternDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .validateSpanFilterPatternDetails(validateSpanFilterPatternDetails)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",validateSpanFilterPatternDetails=")
                .append(String.valueOf(this.validateSpanFilterPatternDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateSpanFilterPatternRequest)) {
            return false;
        }

        ValidateSpanFilterPatternRequest other = (ValidateSpanFilterPatternRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.validateSpanFilterPatternDetails,
                        other.validateSpanFilterPatternDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.validateSpanFilterPatternDetails == null
                                ? 43
                                : this.validateSpanFilterPatternDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
