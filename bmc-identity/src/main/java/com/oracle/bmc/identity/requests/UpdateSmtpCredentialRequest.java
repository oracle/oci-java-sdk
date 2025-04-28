/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateSmtpCredentialExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSmtpCredentialRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateSmtpCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails> {

    /** The OCID of the user. */
    private String userId;

    /** The OCID of the user. */
    public String getUserId() {
        return userId;
    }
    /** The OCID of the SMTP credential. */
    private String smtpCredentialId;

    /** The OCID of the SMTP credential. */
    public String getSmtpCredentialId() {
        return smtpCredentialId;
    }
    /** Request object for updating a SMTP credential. */
    private com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails updateSmtpCredentialDetails;

    /** Request object for updating a SMTP credential. */
    public com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails
            getUpdateSmtpCredentialDetails() {
        return updateSmtpCredentialDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails getBody$() {
        return updateSmtpCredentialDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSmtpCredentialRequest,
                    com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the user. */
        private String userId = null;

        /**
         * The OCID of the user.
         *
         * @param userId the value to set
         * @return this builder instance
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /** The OCID of the SMTP credential. */
        private String smtpCredentialId = null;

        /**
         * The OCID of the SMTP credential.
         *
         * @param smtpCredentialId the value to set
         * @return this builder instance
         */
        public Builder smtpCredentialId(String smtpCredentialId) {
            this.smtpCredentialId = smtpCredentialId;
            return this;
        }

        /** Request object for updating a SMTP credential. */
        private com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails
                updateSmtpCredentialDetails = null;

        /**
         * Request object for updating a SMTP credential.
         *
         * @param updateSmtpCredentialDetails the value to set
         * @return this builder instance
         */
        public Builder updateSmtpCredentialDetails(
                com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails
                        updateSmtpCredentialDetails) {
            this.updateSmtpCredentialDetails = updateSmtpCredentialDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
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
        public Builder copy(UpdateSmtpCredentialRequest o) {
            userId(o.getUserId());
            smtpCredentialId(o.getSmtpCredentialId());
            updateSmtpCredentialDetails(o.getUpdateSmtpCredentialDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSmtpCredentialRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateSmtpCredentialRequest
         */
        public UpdateSmtpCredentialRequest build() {
            UpdateSmtpCredentialRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails body) {
            updateSmtpCredentialDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSmtpCredentialRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSmtpCredentialRequest
         */
        public UpdateSmtpCredentialRequest buildWithoutInvocationCallback() {
            UpdateSmtpCredentialRequest request = new UpdateSmtpCredentialRequest();
            request.userId = userId;
            request.smtpCredentialId = smtpCredentialId;
            request.updateSmtpCredentialDetails = updateSmtpCredentialDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateSmtpCredentialRequest(userId, smtpCredentialId,
            // updateSmtpCredentialDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .userId(userId)
                .smtpCredentialId(smtpCredentialId)
                .updateSmtpCredentialDetails(updateSmtpCredentialDetails)
                .ifMatch(ifMatch);
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
        sb.append(",userId=").append(String.valueOf(this.userId));
        sb.append(",smtpCredentialId=").append(String.valueOf(this.smtpCredentialId));
        sb.append(",updateSmtpCredentialDetails=")
                .append(String.valueOf(this.updateSmtpCredentialDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSmtpCredentialRequest)) {
            return false;
        }

        UpdateSmtpCredentialRequest other = (UpdateSmtpCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.smtpCredentialId, other.smtpCredentialId)
                && java.util.Objects.equals(
                        this.updateSmtpCredentialDetails, other.updateSmtpCredentialDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.smtpCredentialId == null ? 43 : this.smtpCredentialId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSmtpCredentialDetails == null
                                ? 43
                                : this.updateSmtpCredentialDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
