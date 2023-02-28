/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/UpdateIdpGroupMappingExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateIdpGroupMappingRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateIdpGroupMappingRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.identity.model.UpdateIdpGroupMappingDetails> {

    /** The OCID of the identity provider. */
    private String identityProviderId;

    /** The OCID of the identity provider. */
    public String getIdentityProviderId() {
        return identityProviderId;
    }
    /** The OCID of the group mapping. */
    private String mappingId;

    /** The OCID of the group mapping. */
    public String getMappingId() {
        return mappingId;
    }
    /** Request object for updating an identity provider group mapping */
    private com.oracle.bmc.identity.model.UpdateIdpGroupMappingDetails updateIdpGroupMappingDetails;

    /** Request object for updating an identity provider group mapping */
    public com.oracle.bmc.identity.model.UpdateIdpGroupMappingDetails
            getUpdateIdpGroupMappingDetails() {
        return updateIdpGroupMappingDetails;
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
    public com.oracle.bmc.identity.model.UpdateIdpGroupMappingDetails getBody$() {
        return updateIdpGroupMappingDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateIdpGroupMappingRequest,
                    com.oracle.bmc.identity.model.UpdateIdpGroupMappingDetails> {
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

        /** The OCID of the group mapping. */
        private String mappingId = null;

        /**
         * The OCID of the group mapping.
         *
         * @param mappingId the value to set
         * @return this builder instance
         */
        public Builder mappingId(String mappingId) {
            this.mappingId = mappingId;
            return this;
        }

        /** Request object for updating an identity provider group mapping */
        private com.oracle.bmc.identity.model.UpdateIdpGroupMappingDetails
                updateIdpGroupMappingDetails = null;

        /**
         * Request object for updating an identity provider group mapping
         *
         * @param updateIdpGroupMappingDetails the value to set
         * @return this builder instance
         */
        public Builder updateIdpGroupMappingDetails(
                com.oracle.bmc.identity.model.UpdateIdpGroupMappingDetails
                        updateIdpGroupMappingDetails) {
            this.updateIdpGroupMappingDetails = updateIdpGroupMappingDetails;
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
        public Builder copy(UpdateIdpGroupMappingRequest o) {
            identityProviderId(o.getIdentityProviderId());
            mappingId(o.getMappingId());
            updateIdpGroupMappingDetails(o.getUpdateIdpGroupMappingDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateIdpGroupMappingRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateIdpGroupMappingRequest
         */
        public UpdateIdpGroupMappingRequest build() {
            UpdateIdpGroupMappingRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.identity.model.UpdateIdpGroupMappingDetails body) {
            updateIdpGroupMappingDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateIdpGroupMappingRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateIdpGroupMappingRequest
         */
        public UpdateIdpGroupMappingRequest buildWithoutInvocationCallback() {
            UpdateIdpGroupMappingRequest request = new UpdateIdpGroupMappingRequest();
            request.identityProviderId = identityProviderId;
            request.mappingId = mappingId;
            request.updateIdpGroupMappingDetails = updateIdpGroupMappingDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateIdpGroupMappingRequest(identityProviderId, mappingId,
            // updateIdpGroupMappingDetails, ifMatch);
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
                .mappingId(mappingId)
                .updateIdpGroupMappingDetails(updateIdpGroupMappingDetails)
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
        sb.append(",mappingId=").append(String.valueOf(this.mappingId));
        sb.append(",updateIdpGroupMappingDetails=")
                .append(String.valueOf(this.updateIdpGroupMappingDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIdpGroupMappingRequest)) {
            return false;
        }

        UpdateIdpGroupMappingRequest other = (UpdateIdpGroupMappingRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.identityProviderId, other.identityProviderId)
                && java.util.Objects.equals(this.mappingId, other.mappingId)
                && java.util.Objects.equals(
                        this.updateIdpGroupMappingDetails, other.updateIdpGroupMappingDetails)
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
        result = (result * PRIME) + (this.mappingId == null ? 43 : this.mappingId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateIdpGroupMappingDetails == null
                                ? 43
                                : this.updateIdpGroupMappingDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
