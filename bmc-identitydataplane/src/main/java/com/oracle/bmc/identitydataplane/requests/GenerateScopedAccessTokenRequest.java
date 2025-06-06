/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.requests;

import com.oracle.bmc.identitydataplane.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identitydataplane/GenerateScopedAccessTokenExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GenerateScopedAccessTokenRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class GenerateScopedAccessTokenRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identitydataplane.model.GenerateScopedAccessTokenDetails> {

    /** Scoped access token request */
    private com.oracle.bmc.identitydataplane.model.GenerateScopedAccessTokenDetails
            generateScopedAccessTokenDetails;

    /** Scoped access token request */
    public com.oracle.bmc.identitydataplane.model.GenerateScopedAccessTokenDetails
            getGenerateScopedAccessTokenDetails() {
        return generateScopedAccessTokenDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identitydataplane.model.GenerateScopedAccessTokenDetails getBody$() {
        return generateScopedAccessTokenDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GenerateScopedAccessTokenRequest,
                    com.oracle.bmc.identitydataplane.model.GenerateScopedAccessTokenDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Scoped access token request */
        private com.oracle.bmc.identitydataplane.model.GenerateScopedAccessTokenDetails
                generateScopedAccessTokenDetails = null;

        /**
         * Scoped access token request
         *
         * @param generateScopedAccessTokenDetails the value to set
         * @return this builder instance
         */
        public Builder generateScopedAccessTokenDetails(
                com.oracle.bmc.identitydataplane.model.GenerateScopedAccessTokenDetails
                        generateScopedAccessTokenDetails) {
            this.generateScopedAccessTokenDetails = generateScopedAccessTokenDetails;
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
        public Builder copy(GenerateScopedAccessTokenRequest o) {
            generateScopedAccessTokenDetails(o.getGenerateScopedAccessTokenDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GenerateScopedAccessTokenRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GenerateScopedAccessTokenRequest
         */
        public GenerateScopedAccessTokenRequest build() {
            GenerateScopedAccessTokenRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.identitydataplane.model.GenerateScopedAccessTokenDetails body) {
            generateScopedAccessTokenDetails(body);
            return this;
        }

        /**
         * Build the instance of GenerateScopedAccessTokenRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GenerateScopedAccessTokenRequest
         */
        public GenerateScopedAccessTokenRequest buildWithoutInvocationCallback() {
            GenerateScopedAccessTokenRequest request = new GenerateScopedAccessTokenRequest();
            request.generateScopedAccessTokenDetails = generateScopedAccessTokenDetails;
            return request;
            // new GenerateScopedAccessTokenRequest(generateScopedAccessTokenDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().generateScopedAccessTokenDetails(generateScopedAccessTokenDetails);
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
        sb.append(",generateScopedAccessTokenDetails=")
                .append(String.valueOf(this.generateScopedAccessTokenDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateScopedAccessTokenRequest)) {
            return false;
        }

        GenerateScopedAccessTokenRequest other = (GenerateScopedAccessTokenRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.generateScopedAccessTokenDetails,
                        other.generateScopedAccessTokenDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.generateScopedAccessTokenDetails == null
                                ? 43
                                : this.generateScopedAccessTokenDetails.hashCode());
        return result;
    }
}
