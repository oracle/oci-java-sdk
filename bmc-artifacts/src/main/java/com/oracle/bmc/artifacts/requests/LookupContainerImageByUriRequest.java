/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.requests;

import com.oracle.bmc.artifacts.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/artifacts/LookupContainerImageByUriExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * LookupContainerImageByUriRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class LookupContainerImageByUriRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.artifacts.model.LookupContainerImageByUriDetails> {

    /** Get container image metadata by URI. */
    private com.oracle.bmc.artifacts.model.LookupContainerImageByUriDetails
            lookupContainerImageByUriDetails;

    /** Get container image metadata by URI. */
    public com.oracle.bmc.artifacts.model.LookupContainerImageByUriDetails
            getLookupContainerImageByUriDetails() {
        return lookupContainerImageByUriDetails;
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
    public com.oracle.bmc.artifacts.model.LookupContainerImageByUriDetails getBody$() {
        return lookupContainerImageByUriDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    LookupContainerImageByUriRequest,
                    com.oracle.bmc.artifacts.model.LookupContainerImageByUriDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Get container image metadata by URI. */
        private com.oracle.bmc.artifacts.model.LookupContainerImageByUriDetails
                lookupContainerImageByUriDetails = null;

        /**
         * Get container image metadata by URI.
         *
         * @param lookupContainerImageByUriDetails the value to set
         * @return this builder instance
         */
        public Builder lookupContainerImageByUriDetails(
                com.oracle.bmc.artifacts.model.LookupContainerImageByUriDetails
                        lookupContainerImageByUriDetails) {
            this.lookupContainerImageByUriDetails = lookupContainerImageByUriDetails;
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
        public Builder copy(LookupContainerImageByUriRequest o) {
            lookupContainerImageByUriDetails(o.getLookupContainerImageByUriDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of LookupContainerImageByUriRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of LookupContainerImageByUriRequest
         */
        public LookupContainerImageByUriRequest build() {
            LookupContainerImageByUriRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.artifacts.model.LookupContainerImageByUriDetails body) {
            lookupContainerImageByUriDetails(body);
            return this;
        }

        /**
         * Build the instance of LookupContainerImageByUriRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of LookupContainerImageByUriRequest
         */
        public LookupContainerImageByUriRequest buildWithoutInvocationCallback() {
            LookupContainerImageByUriRequest request = new LookupContainerImageByUriRequest();
            request.lookupContainerImageByUriDetails = lookupContainerImageByUriDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new LookupContainerImageByUriRequest(lookupContainerImageByUriDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .lookupContainerImageByUriDetails(lookupContainerImageByUriDetails)
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
        sb.append(",lookupContainerImageByUriDetails=")
                .append(String.valueOf(this.lookupContainerImageByUriDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LookupContainerImageByUriRequest)) {
            return false;
        }

        LookupContainerImageByUriRequest other = (LookupContainerImageByUriRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.lookupContainerImageByUriDetails,
                        other.lookupContainerImageByUriDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.lookupContainerImageByUriDetails == null
                                ? 43
                                : this.lookupContainerImageByUriDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
