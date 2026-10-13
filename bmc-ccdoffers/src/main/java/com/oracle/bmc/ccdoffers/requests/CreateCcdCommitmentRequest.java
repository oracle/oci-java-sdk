/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.requests;

import com.oracle.bmc.ccdoffers.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ccdoffers/CreateCcdCommitmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateCcdCommitmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
public class CreateCcdCommitmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ccdoffers.model.CreateCcdCommitmentDetails> {

    /**
     * CCD offer OCID. If you're trying to commit against the CCD offer, ensure that the CCD offer's
     * {@code lifecycleDetails} field value is Current or Scheduled. You can only sign up for a
     * current or scheduled CCD offer, but not for any canceled, or ended CCD offer.
     */
    private String ccdOfferId;

    /**
     * CCD offer OCID. If you're trying to commit against the CCD offer, ensure that the CCD offer's
     * {@code lifecycleDetails} field value is Current or Scheduled. You can only sign up for a
     * current or scheduled CCD offer, but not for any canceled, or ended CCD offer.
     */
    public String getCcdOfferId() {
        return ccdOfferId;
    }
    /** The create CCD commitment details model. */
    private com.oracle.bmc.ccdoffers.model.CreateCcdCommitmentDetails createCcdCommitmentDetails;

    /** The create CCD commitment details model. */
    public com.oracle.bmc.ccdoffers.model.CreateCcdCommitmentDetails
            getCreateCcdCommitmentDetails() {
        return createCcdCommitmentDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
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
    public com.oracle.bmc.ccdoffers.model.CreateCcdCommitmentDetails getBody$() {
        return createCcdCommitmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateCcdCommitmentRequest,
                    com.oracle.bmc.ccdoffers.model.CreateCcdCommitmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * CCD offer OCID. If you're trying to commit against the CCD offer, ensure that the CCD
         * offer's {@code lifecycleDetails} field value is Current or Scheduled. You can only sign
         * up for a current or scheduled CCD offer, but not for any canceled, or ended CCD offer.
         */
        private String ccdOfferId = null;

        /**
         * CCD offer OCID. If you're trying to commit against the CCD offer, ensure that the CCD
         * offer's {@code lifecycleDetails} field value is Current or Scheduled. You can only sign
         * up for a current or scheduled CCD offer, but not for any canceled, or ended CCD offer.
         *
         * @param ccdOfferId the value to set
         * @return this builder instance
         */
        public Builder ccdOfferId(String ccdOfferId) {
            this.ccdOfferId = ccdOfferId;
            return this;
        }

        /** The create CCD commitment details model. */
        private com.oracle.bmc.ccdoffers.model.CreateCcdCommitmentDetails
                createCcdCommitmentDetails = null;

        /**
         * The create CCD commitment details model.
         *
         * @param createCcdCommitmentDetails the value to set
         * @return this builder instance
         */
        public Builder createCcdCommitmentDetails(
                com.oracle.bmc.ccdoffers.model.CreateCcdCommitmentDetails
                        createCcdCommitmentDetails) {
            this.createCcdCommitmentDetails = createCcdCommitmentDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(CreateCcdCommitmentRequest o) {
            ccdOfferId(o.getCcdOfferId());
            createCcdCommitmentDetails(o.getCreateCcdCommitmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateCcdCommitmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateCcdCommitmentRequest
         */
        public CreateCcdCommitmentRequest build() {
            CreateCcdCommitmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.ccdoffers.model.CreateCcdCommitmentDetails body) {
            createCcdCommitmentDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateCcdCommitmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateCcdCommitmentRequest
         */
        public CreateCcdCommitmentRequest buildWithoutInvocationCallback() {
            CreateCcdCommitmentRequest request = new CreateCcdCommitmentRequest();
            request.ccdOfferId = ccdOfferId;
            request.createCcdCommitmentDetails = createCcdCommitmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateCcdCommitmentRequest(ccdOfferId, createCcdCommitmentDetails, opcRetryToken,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .ccdOfferId(ccdOfferId)
                .createCcdCommitmentDetails(createCcdCommitmentDetails)
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
        sb.append(",ccdOfferId=").append(String.valueOf(this.ccdOfferId));
        sb.append(",createCcdCommitmentDetails=")
                .append(String.valueOf(this.createCcdCommitmentDetails));
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
        if (!(o instanceof CreateCcdCommitmentRequest)) {
            return false;
        }

        CreateCcdCommitmentRequest other = (CreateCcdCommitmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.ccdOfferId, other.ccdOfferId)
                && java.util.Objects.equals(
                        this.createCcdCommitmentDetails, other.createCcdCommitmentDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.ccdOfferId == null ? 43 : this.ccdOfferId.hashCode());
        result =
                (result * PRIME)
                        + (this.createCcdCommitmentDetails == null
                                ? 43
                                : this.createCcdCommitmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
