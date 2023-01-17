/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.requests;

import com.oracle.bmc.marketplace.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/marketplace/UpdatePublicationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePublicationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class UpdatePublicationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.marketplace.model.UpdatePublicationDetails> {

    /**
     * The unique identifier for the publication.
     */
    private String publicationId;

    /**
     * The unique identifier for the publication.
     */
    public String getPublicationId() {
        return publicationId;
    }
    /**
     * The details for updating the publication.
     */
    private com.oracle.bmc.marketplace.model.UpdatePublicationDetails updatePublicationDetails;

    /**
     * The details for updating the publication.
     */
    public com.oracle.bmc.marketplace.model.UpdatePublicationDetails getUpdatePublicationDetails() {
        return updatePublicationDetails;
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
    public com.oracle.bmc.marketplace.model.UpdatePublicationDetails getBody$() {
        return updatePublicationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePublicationRequest,
                    com.oracle.bmc.marketplace.model.UpdatePublicationDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The unique identifier for the publication.
         */
        private String publicationId = null;

        /**
         * The unique identifier for the publication.
         * @param publicationId the value to set
         * @return this builder instance
         */
        public Builder publicationId(String publicationId) {
            this.publicationId = publicationId;
            return this;
        }

        /**
         * The details for updating the publication.
         */
        private com.oracle.bmc.marketplace.model.UpdatePublicationDetails updatePublicationDetails =
                null;

        /**
         * The details for updating the publication.
         * @param updatePublicationDetails the value to set
         * @return this builder instance
         */
        public Builder updatePublicationDetails(
                com.oracle.bmc.marketplace.model.UpdatePublicationDetails
                        updatePublicationDetails) {
            this.updatePublicationDetails = updatePublicationDetails;
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
        public Builder copy(UpdatePublicationRequest o) {
            publicationId(o.getPublicationId());
            updatePublicationDetails(o.getUpdatePublicationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePublicationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePublicationRequest
         */
        public UpdatePublicationRequest build() {
            UpdatePublicationRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.marketplace.model.UpdatePublicationDetails body) {
            updatePublicationDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePublicationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePublicationRequest
         */
        public UpdatePublicationRequest buildWithoutInvocationCallback() {
            UpdatePublicationRequest request = new UpdatePublicationRequest();
            request.publicationId = publicationId;
            request.updatePublicationDetails = updatePublicationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new UpdatePublicationRequest(publicationId, updatePublicationDetails, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .publicationId(publicationId)
                .updatePublicationDetails(updatePublicationDetails)
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
        sb.append(",publicationId=").append(String.valueOf(this.publicationId));
        sb.append(",updatePublicationDetails=")
                .append(String.valueOf(this.updatePublicationDetails));
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
        if (!(o instanceof UpdatePublicationRequest)) {
            return false;
        }

        UpdatePublicationRequest other = (UpdatePublicationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.publicationId, other.publicationId)
                && java.util.Objects.equals(
                        this.updatePublicationDetails, other.updatePublicationDetails)
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
                        + (this.publicationId == null ? 43 : this.publicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePublicationDetails == null
                                ? 43
                                : this.updatePublicationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
