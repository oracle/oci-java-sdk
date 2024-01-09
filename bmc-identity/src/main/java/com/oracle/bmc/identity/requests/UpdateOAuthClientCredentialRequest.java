/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateOAuthClientCredentialExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateOAuthClientCredentialRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateOAuthClientCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateOAuth2ClientCredentialDetails> {

    /** The OCID of the user. */
    private String userId;

    /** The OCID of the user. */
    public String getUserId() {
        return userId;
    }
    /** The ID of the Oauth credential. */
    private String oauth2ClientCredentialId;

    /** The ID of the Oauth credential. */
    public String getOauth2ClientCredentialId() {
        return oauth2ClientCredentialId;
    }
    /** Request object containing the information required to generate an Oauth token. */
    private com.oracle.bmc.identity.model.UpdateOAuth2ClientCredentialDetails
            updateOAuth2ClientCredentialDetails;

    /** Request object containing the information required to generate an Oauth token. */
    public com.oracle.bmc.identity.model.UpdateOAuth2ClientCredentialDetails
            getUpdateOAuth2ClientCredentialDetails() {
        return updateOAuth2ClientCredentialDetails;
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
    public com.oracle.bmc.identity.model.UpdateOAuth2ClientCredentialDetails getBody$() {
        return updateOAuth2ClientCredentialDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateOAuthClientCredentialRequest,
                    com.oracle.bmc.identity.model.UpdateOAuth2ClientCredentialDetails> {
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

        /** The ID of the Oauth credential. */
        private String oauth2ClientCredentialId = null;

        /**
         * The ID of the Oauth credential.
         *
         * @param oauth2ClientCredentialId the value to set
         * @return this builder instance
         */
        public Builder oauth2ClientCredentialId(String oauth2ClientCredentialId) {
            this.oauth2ClientCredentialId = oauth2ClientCredentialId;
            return this;
        }

        /** Request object containing the information required to generate an Oauth token. */
        private com.oracle.bmc.identity.model.UpdateOAuth2ClientCredentialDetails
                updateOAuth2ClientCredentialDetails = null;

        /**
         * Request object containing the information required to generate an Oauth token.
         *
         * @param updateOAuth2ClientCredentialDetails the value to set
         * @return this builder instance
         */
        public Builder updateOAuth2ClientCredentialDetails(
                com.oracle.bmc.identity.model.UpdateOAuth2ClientCredentialDetails
                        updateOAuth2ClientCredentialDetails) {
            this.updateOAuth2ClientCredentialDetails = updateOAuth2ClientCredentialDetails;
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
        public Builder copy(UpdateOAuthClientCredentialRequest o) {
            userId(o.getUserId());
            oauth2ClientCredentialId(o.getOauth2ClientCredentialId());
            updateOAuth2ClientCredentialDetails(o.getUpdateOAuth2ClientCredentialDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateOAuthClientCredentialRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateOAuthClientCredentialRequest
         */
        public UpdateOAuthClientCredentialRequest build() {
            UpdateOAuthClientCredentialRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.identity.model.UpdateOAuth2ClientCredentialDetails body) {
            updateOAuth2ClientCredentialDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateOAuthClientCredentialRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateOAuthClientCredentialRequest
         */
        public UpdateOAuthClientCredentialRequest buildWithoutInvocationCallback() {
            UpdateOAuthClientCredentialRequest request = new UpdateOAuthClientCredentialRequest();
            request.userId = userId;
            request.oauth2ClientCredentialId = oauth2ClientCredentialId;
            request.updateOAuth2ClientCredentialDetails = updateOAuth2ClientCredentialDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateOAuthClientCredentialRequest(userId, oauth2ClientCredentialId,
            // updateOAuth2ClientCredentialDetails, ifMatch);
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
                .oauth2ClientCredentialId(oauth2ClientCredentialId)
                .updateOAuth2ClientCredentialDetails(updateOAuth2ClientCredentialDetails)
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
        sb.append(",oauth2ClientCredentialId=")
                .append(String.valueOf(this.oauth2ClientCredentialId));
        sb.append(",updateOAuth2ClientCredentialDetails=")
                .append(String.valueOf(this.updateOAuth2ClientCredentialDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOAuthClientCredentialRequest)) {
            return false;
        }

        UpdateOAuthClientCredentialRequest other = (UpdateOAuthClientCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(
                        this.oauth2ClientCredentialId, other.oauth2ClientCredentialId)
                && java.util.Objects.equals(
                        this.updateOAuth2ClientCredentialDetails,
                        other.updateOAuth2ClientCredentialDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.oauth2ClientCredentialId == null
                                ? 43
                                : this.oauth2ClientCredentialId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateOAuth2ClientCredentialDetails == null
                                ? 43
                                : this.updateOAuth2ClientCredentialDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
