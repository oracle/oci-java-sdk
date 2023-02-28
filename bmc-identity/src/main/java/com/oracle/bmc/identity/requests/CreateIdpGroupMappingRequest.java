/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/CreateIdpGroupMappingExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateIdpGroupMappingRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateIdpGroupMappingRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.CreateIdpGroupMappingDetails> {

    /** Add a mapping from an SAML2.0 identity provider group to a BMC group. */
    private com.oracle.bmc.identity.model.CreateIdpGroupMappingDetails createIdpGroupMappingDetails;

    /** Add a mapping from an SAML2.0 identity provider group to a BMC group. */
    public com.oracle.bmc.identity.model.CreateIdpGroupMappingDetails
            getCreateIdpGroupMappingDetails() {
        return createIdpGroupMappingDetails;
    }
    /** The OCID of the identity provider. */
    private String identityProviderId;

    /** The OCID of the identity provider. */
    public String getIdentityProviderId() {
        return identityProviderId;
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
    public com.oracle.bmc.identity.model.CreateIdpGroupMappingDetails getBody$() {
        return createIdpGroupMappingDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateIdpGroupMappingRequest,
                    com.oracle.bmc.identity.model.CreateIdpGroupMappingDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Add a mapping from an SAML2.0 identity provider group to a BMC group. */
        private com.oracle.bmc.identity.model.CreateIdpGroupMappingDetails
                createIdpGroupMappingDetails = null;

        /**
         * Add a mapping from an SAML2.0 identity provider group to a BMC group.
         *
         * @param createIdpGroupMappingDetails the value to set
         * @return this builder instance
         */
        public Builder createIdpGroupMappingDetails(
                com.oracle.bmc.identity.model.CreateIdpGroupMappingDetails
                        createIdpGroupMappingDetails) {
            this.createIdpGroupMappingDetails = createIdpGroupMappingDetails;
            return this;
        }

        /** The OCID of the identity provider. */
        private String identityProviderId = null;

        /**
         * The OCID of the identity provider.
         *
         * @param identityProviderId the value to set
         * @return this builder instance
         */
        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
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
        public Builder copy(CreateIdpGroupMappingRequest o) {
            createIdpGroupMappingDetails(o.getCreateIdpGroupMappingDetails());
            identityProviderId(o.getIdentityProviderId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateIdpGroupMappingRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateIdpGroupMappingRequest
         */
        public CreateIdpGroupMappingRequest build() {
            CreateIdpGroupMappingRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.CreateIdpGroupMappingDetails body) {
            createIdpGroupMappingDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateIdpGroupMappingRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateIdpGroupMappingRequest
         */
        public CreateIdpGroupMappingRequest buildWithoutInvocationCallback() {
            CreateIdpGroupMappingRequest request = new CreateIdpGroupMappingRequest();
            request.createIdpGroupMappingDetails = createIdpGroupMappingDetails;
            request.identityProviderId = identityProviderId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateIdpGroupMappingRequest(createIdpGroupMappingDetails, identityProviderId,
            // opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createIdpGroupMappingDetails(createIdpGroupMappingDetails)
                .identityProviderId(identityProviderId)
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
        sb.append(",createIdpGroupMappingDetails=")
                .append(String.valueOf(this.createIdpGroupMappingDetails));
        sb.append(",identityProviderId=").append(String.valueOf(this.identityProviderId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIdpGroupMappingRequest)) {
            return false;
        }

        CreateIdpGroupMappingRequest other = (CreateIdpGroupMappingRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createIdpGroupMappingDetails, other.createIdpGroupMappingDetails)
                && java.util.Objects.equals(this.identityProviderId, other.identityProviderId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createIdpGroupMappingDetails == null
                                ? 43
                                : this.createIdpGroupMappingDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.identityProviderId == null
                                ? 43
                                : this.identityProviderId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
