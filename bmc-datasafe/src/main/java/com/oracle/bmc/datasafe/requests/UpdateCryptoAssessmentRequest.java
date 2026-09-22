/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/UpdateCryptoAssessmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateCryptoAssessmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class UpdateCryptoAssessmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.UpdateCryptoAssessmentDetails> {

    /**
     * The OCID of the crypto assessment.
     */
    private String cryptoAssessmentId;

    /**
     * The OCID of the crypto assessment.
     */
    public String getCryptoAssessmentId() {
        return cryptoAssessmentId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.datasafe.model.UpdateCryptoAssessmentDetails
            updateCryptoAssessmentDetails;

    /**
     * The information to be updated.
     */
    public com.oracle.bmc.datasafe.model.UpdateCryptoAssessmentDetails
            getUpdateCryptoAssessmentDetails() {
        return updateCryptoAssessmentDetails;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.UpdateCryptoAssessmentDetails getBody$() {
        return updateCryptoAssessmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateCryptoAssessmentRequest,
                    com.oracle.bmc.datasafe.model.UpdateCryptoAssessmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the crypto assessment.
         */
        private String cryptoAssessmentId = null;

        /**
         * The OCID of the crypto assessment.
         * @param cryptoAssessmentId the value to set
         * @return this builder instance
         */
        public Builder cryptoAssessmentId(String cryptoAssessmentId) {
            this.cryptoAssessmentId = cryptoAssessmentId;
            return this;
        }

        /**
         * The information to be updated.
         */
        private com.oracle.bmc.datasafe.model.UpdateCryptoAssessmentDetails
                updateCryptoAssessmentDetails = null;

        /**
         * The information to be updated.
         * @param updateCryptoAssessmentDetails the value to set
         * @return this builder instance
         */
        public Builder updateCryptoAssessmentDetails(
                com.oracle.bmc.datasafe.model.UpdateCryptoAssessmentDetails
                        updateCryptoAssessmentDetails) {
            this.updateCryptoAssessmentDetails = updateCryptoAssessmentDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateCryptoAssessmentRequest o) {
            cryptoAssessmentId(o.getCryptoAssessmentId());
            updateCryptoAssessmentDetails(o.getUpdateCryptoAssessmentDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateCryptoAssessmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateCryptoAssessmentRequest
         */
        public UpdateCryptoAssessmentRequest build() {
            UpdateCryptoAssessmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datasafe.model.UpdateCryptoAssessmentDetails body) {
            updateCryptoAssessmentDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateCryptoAssessmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateCryptoAssessmentRequest
         */
        public UpdateCryptoAssessmentRequest buildWithoutInvocationCallback() {
            UpdateCryptoAssessmentRequest request = new UpdateCryptoAssessmentRequest();
            request.cryptoAssessmentId = cryptoAssessmentId;
            request.updateCryptoAssessmentDetails = updateCryptoAssessmentDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateCryptoAssessmentRequest(cryptoAssessmentId, updateCryptoAssessmentDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cryptoAssessmentId(cryptoAssessmentId)
                .updateCryptoAssessmentDetails(updateCryptoAssessmentDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",cryptoAssessmentId=").append(String.valueOf(this.cryptoAssessmentId));
        sb.append(",updateCryptoAssessmentDetails=")
                .append(String.valueOf(this.updateCryptoAssessmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCryptoAssessmentRequest)) {
            return false;
        }

        UpdateCryptoAssessmentRequest other = (UpdateCryptoAssessmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cryptoAssessmentId, other.cryptoAssessmentId)
                && java.util.Objects.equals(
                        this.updateCryptoAssessmentDetails, other.updateCryptoAssessmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cryptoAssessmentId == null
                                ? 43
                                : this.cryptoAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateCryptoAssessmentDetails == null
                                ? 43
                                : this.updateCryptoAssessmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
