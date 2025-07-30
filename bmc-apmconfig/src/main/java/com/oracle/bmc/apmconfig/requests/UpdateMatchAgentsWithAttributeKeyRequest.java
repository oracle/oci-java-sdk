/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.requests;

import com.oracle.bmc.apmconfig.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmconfig/UpdateMatchAgentsWithAttributeKeyExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateMatchAgentsWithAttributeKeyRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class UpdateMatchAgentsWithAttributeKeyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmconfig.model.UpdateMatchAgentsWithAttributeKeyDetails> {

    /** The APM Domain ID the request is intended for. */
    private String apmDomainId;

    /** The APM Domain ID the request is intended for. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** The list of values to be updated. */
    private com.oracle.bmc.apmconfig.model.UpdateMatchAgentsWithAttributeKeyDetails
            updateMatchAgentsWithAttributeKeyDetails;

    /** The list of values to be updated. */
    public com.oracle.bmc.apmconfig.model.UpdateMatchAgentsWithAttributeKeyDetails
            getUpdateMatchAgentsWithAttributeKeyDetails() {
        return updateMatchAgentsWithAttributeKeyDetails;
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
    public com.oracle.bmc.apmconfig.model.UpdateMatchAgentsWithAttributeKeyDetails getBody$() {
        return updateMatchAgentsWithAttributeKeyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateMatchAgentsWithAttributeKeyRequest,
                    com.oracle.bmc.apmconfig.model.UpdateMatchAgentsWithAttributeKeyDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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

        /** The list of values to be updated. */
        private com.oracle.bmc.apmconfig.model.UpdateMatchAgentsWithAttributeKeyDetails
                updateMatchAgentsWithAttributeKeyDetails = null;

        /**
         * The list of values to be updated.
         *
         * @param updateMatchAgentsWithAttributeKeyDetails the value to set
         * @return this builder instance
         */
        public Builder updateMatchAgentsWithAttributeKeyDetails(
                com.oracle.bmc.apmconfig.model.UpdateMatchAgentsWithAttributeKeyDetails
                        updateMatchAgentsWithAttributeKeyDetails) {
            this.updateMatchAgentsWithAttributeKeyDetails =
                    updateMatchAgentsWithAttributeKeyDetails;
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
        public Builder copy(UpdateMatchAgentsWithAttributeKeyRequest o) {
            apmDomainId(o.getApmDomainId());
            updateMatchAgentsWithAttributeKeyDetails(
                    o.getUpdateMatchAgentsWithAttributeKeyDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateMatchAgentsWithAttributeKeyRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateMatchAgentsWithAttributeKeyRequest
         */
        public UpdateMatchAgentsWithAttributeKeyRequest build() {
            UpdateMatchAgentsWithAttributeKeyRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.apmconfig.model.UpdateMatchAgentsWithAttributeKeyDetails body) {
            updateMatchAgentsWithAttributeKeyDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateMatchAgentsWithAttributeKeyRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateMatchAgentsWithAttributeKeyRequest
         */
        public UpdateMatchAgentsWithAttributeKeyRequest buildWithoutInvocationCallback() {
            UpdateMatchAgentsWithAttributeKeyRequest request =
                    new UpdateMatchAgentsWithAttributeKeyRequest();
            request.apmDomainId = apmDomainId;
            request.updateMatchAgentsWithAttributeKeyDetails =
                    updateMatchAgentsWithAttributeKeyDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateMatchAgentsWithAttributeKeyRequest(apmDomainId,
            // updateMatchAgentsWithAttributeKeyDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .updateMatchAgentsWithAttributeKeyDetails(updateMatchAgentsWithAttributeKeyDetails)
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",updateMatchAgentsWithAttributeKeyDetails=")
                .append(String.valueOf(this.updateMatchAgentsWithAttributeKeyDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMatchAgentsWithAttributeKeyRequest)) {
            return false;
        }

        UpdateMatchAgentsWithAttributeKeyRequest other =
                (UpdateMatchAgentsWithAttributeKeyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(
                        this.updateMatchAgentsWithAttributeKeyDetails,
                        other.updateMatchAgentsWithAttributeKeyDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateMatchAgentsWithAttributeKeyDetails == null
                                ? 43
                                : this.updateMatchAgentsWithAttributeKeyDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
