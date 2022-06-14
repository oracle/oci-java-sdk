/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/UpdateAcceptedAgreementExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAcceptedAgreementRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class UpdateAcceptedAgreementRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.marketplace.model.UpdateAcceptedAgreementDetails> {

    /**
     * The unique identifier for the accepted terms of use agreement.
     */
    private String acceptedAgreementId;

    /**
     * The unique identifier for the accepted terms of use agreement.
     */
    public String getAcceptedAgreementId() {
        return acceptedAgreementId;
    }
    /**
     * Details to update for an accepted agreement.
     */
    private com.oracle.bmc.marketplace.model.UpdateAcceptedAgreementDetails
            updateAcceptedAgreementDetails;

    /**
     * Details to update for an accepted agreement.
     */
    public com.oracle.bmc.marketplace.model.UpdateAcceptedAgreementDetails
            getUpdateAcceptedAgreementDetails() {
        return updateAcceptedAgreementDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without
     * risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been deleted and purged from the system,
     * then a retry of the original creation request might be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without
     * risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been deleted and purged from the system,
     * then a retry of the original creation request might be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to
     * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to
     * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
     * deleted only if the etag you provide matches the resource's current etag value.
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
    public com.oracle.bmc.marketplace.model.UpdateAcceptedAgreementDetails getBody$() {
        return updateAcceptedAgreementDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAcceptedAgreementRequest,
                    com.oracle.bmc.marketplace.model.UpdateAcceptedAgreementDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier for the accepted terms of use agreement.
         */
        private String acceptedAgreementId = null;

        /**
         * The unique identifier for the accepted terms of use agreement.
         * @param acceptedAgreementId the value to set
         * @return this builder instance
         */
        public Builder acceptedAgreementId(String acceptedAgreementId) {
            this.acceptedAgreementId = acceptedAgreementId;
            return this;
        }

        /**
         * Details to update for an accepted agreement.
         */
        private com.oracle.bmc.marketplace.model.UpdateAcceptedAgreementDetails
                updateAcceptedAgreementDetails = null;

        /**
         * Details to update for an accepted agreement.
         * @param updateAcceptedAgreementDetails the value to set
         * @return this builder instance
         */
        public Builder updateAcceptedAgreementDetails(
                com.oracle.bmc.marketplace.model.UpdateAcceptedAgreementDetails
                        updateAcceptedAgreementDetails) {
            this.updateAcceptedAgreementDetails = updateAcceptedAgreementDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without
         * risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before
         * then due to conflicting operations (for example, if a resource has been deleted and purged from the system,
         * then a retry of the original creation request might be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without
         * risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before
         * then due to conflicting operations (for example, if a resource has been deleted and purged from the system,
         * then a retry of the original creation request might be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to
         * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
         * deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to
         * the value of the etag from a previous GET or POST response for that resource.  The resource will be updated or
         * deleted only if the etag you provide matches the resource's current etag value.
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
        public Builder copy(UpdateAcceptedAgreementRequest o) {
            acceptedAgreementId(o.getAcceptedAgreementId());
            updateAcceptedAgreementDetails(o.getUpdateAcceptedAgreementDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAcceptedAgreementRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAcceptedAgreementRequest
         */
        public UpdateAcceptedAgreementRequest build() {
            UpdateAcceptedAgreementRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.marketplace.model.UpdateAcceptedAgreementDetails body) {
            updateAcceptedAgreementDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAcceptedAgreementRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAcceptedAgreementRequest
         */
        public UpdateAcceptedAgreementRequest buildWithoutInvocationCallback() {
            UpdateAcceptedAgreementRequest request = new UpdateAcceptedAgreementRequest();
            request.acceptedAgreementId = acceptedAgreementId;
            request.updateAcceptedAgreementDetails = updateAcceptedAgreementDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateAcceptedAgreementRequest(acceptedAgreementId, updateAcceptedAgreementDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .acceptedAgreementId(acceptedAgreementId)
                .updateAcceptedAgreementDetails(updateAcceptedAgreementDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",acceptedAgreementId=").append(String.valueOf(this.acceptedAgreementId));
        sb.append(",updateAcceptedAgreementDetails=")
                .append(String.valueOf(this.updateAcceptedAgreementDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAcceptedAgreementRequest)) {
            return false;
        }

        UpdateAcceptedAgreementRequest other = (UpdateAcceptedAgreementRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.acceptedAgreementId, other.acceptedAgreementId)
                && java.util.Objects.equals(
                        this.updateAcceptedAgreementDetails, other.updateAcceptedAgreementDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.acceptedAgreementId == null
                                ? 43
                                : this.acceptedAgreementId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAcceptedAgreementDetails == null
                                ? 43
                                : this.updateAcceptedAgreementDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
