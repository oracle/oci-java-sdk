/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateIdentityProviderExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateIdentityProviderRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateIdentityProviderRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateIdentityProviderDetails> {

    /** The OCID of the identity provider. */
    private String identityProviderId;

    /** The OCID of the identity provider. */
    public String getIdentityProviderId() {
        return identityProviderId;
    }
    /** Request object for updating a identity provider. */
    private com.oracle.bmc.identity.model.UpdateIdentityProviderDetails
            updateIdentityProviderDetails;

    /** Request object for updating a identity provider. */
    public com.oracle.bmc.identity.model.UpdateIdentityProviderDetails
            getUpdateIdentityProviderDetails() {
        return updateIdentityProviderDetails;
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
    public com.oracle.bmc.identity.model.UpdateIdentityProviderDetails getBody$() {
        return updateIdentityProviderDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateIdentityProviderRequest,
                    com.oracle.bmc.identity.model.UpdateIdentityProviderDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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

        /** Request object for updating a identity provider. */
        private com.oracle.bmc.identity.model.UpdateIdentityProviderDetails
                updateIdentityProviderDetails = null;

        /**
         * Request object for updating a identity provider.
         *
         * @param updateIdentityProviderDetails the value to set
         * @return this builder instance
         */
        public Builder updateIdentityProviderDetails(
                com.oracle.bmc.identity.model.UpdateIdentityProviderDetails
                        updateIdentityProviderDetails) {
            this.updateIdentityProviderDetails = updateIdentityProviderDetails;
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
        public Builder copy(UpdateIdentityProviderRequest o) {
            identityProviderId(o.getIdentityProviderId());
            updateIdentityProviderDetails(o.getUpdateIdentityProviderDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateIdentityProviderRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateIdentityProviderRequest
         */
        public UpdateIdentityProviderRequest build() {
            UpdateIdentityProviderRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateIdentityProviderDetails body) {
            updateIdentityProviderDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateIdentityProviderRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateIdentityProviderRequest
         */
        public UpdateIdentityProviderRequest buildWithoutInvocationCallback() {
            UpdateIdentityProviderRequest request = new UpdateIdentityProviderRequest();
            request.identityProviderId = identityProviderId;
            request.updateIdentityProviderDetails = updateIdentityProviderDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateIdentityProviderRequest(identityProviderId, updateIdentityProviderDetails,
            // ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .identityProviderId(identityProviderId)
                .updateIdentityProviderDetails(updateIdentityProviderDetails)
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
        sb.append(",identityProviderId=").append(String.valueOf(this.identityProviderId));
        sb.append(",updateIdentityProviderDetails=")
                .append(String.valueOf(this.updateIdentityProviderDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIdentityProviderRequest)) {
            return false;
        }

        UpdateIdentityProviderRequest other = (UpdateIdentityProviderRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.identityProviderId, other.identityProviderId)
                && java.util.Objects.equals(
                        this.updateIdentityProviderDetails, other.updateIdentityProviderDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.identityProviderId == null
                                ? 43
                                : this.identityProviderId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateIdentityProviderDetails == null
                                ? 43
                                : this.updateIdentityProviderDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
