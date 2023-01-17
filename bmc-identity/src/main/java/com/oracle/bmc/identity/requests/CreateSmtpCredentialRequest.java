/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateSmtpCredentialExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateSmtpCredentialRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateSmtpCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.CreateSmtpCredentialDetails> {

    /** Request object for creating a new SMTP credential with the user. */
    private com.oracle.bmc.identity.model.CreateSmtpCredentialDetails createSmtpCredentialDetails;

    /** Request object for creating a new SMTP credential with the user. */
    public com.oracle.bmc.identity.model.CreateSmtpCredentialDetails
            getCreateSmtpCredentialDetails() {
        return createSmtpCredentialDetails;
    }
    /** The OCID of the user. */
    private String userId;

    /** The OCID of the user. */
    public String getUserId() {
        return userId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (e.g., if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.identity.model.CreateSmtpCredentialDetails getBody$() {
        return createSmtpCredentialDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateSmtpCredentialRequest,
                    com.oracle.bmc.identity.model.CreateSmtpCredentialDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request object for creating a new SMTP credential with the user. */
        private com.oracle.bmc.identity.model.CreateSmtpCredentialDetails
                createSmtpCredentialDetails = null;

        /**
         * Request object for creating a new SMTP credential with the user.
         *
         * @param createSmtpCredentialDetails the value to set
         * @return this builder instance
         */
        public Builder createSmtpCredentialDetails(
                com.oracle.bmc.identity.model.CreateSmtpCredentialDetails
                        createSmtpCredentialDetails) {
            this.createSmtpCredentialDetails = createSmtpCredentialDetails;
            return this;
        }

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

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (e.g., if a
         * resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateSmtpCredentialRequest o) {
            createSmtpCredentialDetails(o.getCreateSmtpCredentialDetails());
            userId(o.getUserId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateSmtpCredentialRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateSmtpCredentialRequest
         */
        public CreateSmtpCredentialRequest build() {
            CreateSmtpCredentialRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.CreateSmtpCredentialDetails body) {
            createSmtpCredentialDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateSmtpCredentialRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateSmtpCredentialRequest
         */
        public CreateSmtpCredentialRequest buildWithoutInvocationCallback() {
            CreateSmtpCredentialRequest request = new CreateSmtpCredentialRequest();
            request.createSmtpCredentialDetails = createSmtpCredentialDetails;
            request.userId = userId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateSmtpCredentialRequest(createSmtpCredentialDetails, userId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createSmtpCredentialDetails(createSmtpCredentialDetails)
                .userId(userId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",createSmtpCredentialDetails=")
                .append(String.valueOf(this.createSmtpCredentialDetails));
        sb.append(",userId=").append(String.valueOf(this.userId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSmtpCredentialRequest)) {
            return false;
        }

        CreateSmtpCredentialRequest other = (CreateSmtpCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createSmtpCredentialDetails, other.createSmtpCredentialDetails)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createSmtpCredentialDetails == null
                                ? 43
                                : this.createSmtpCredentialDetails.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
