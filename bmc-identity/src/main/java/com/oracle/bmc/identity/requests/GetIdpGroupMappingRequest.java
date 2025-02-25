/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.requests;

import com.oracle.bmc.identity.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/identity/GetIdpGroupMappingExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetIdpGroupMappingRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetIdpGroupMappingRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the identity provider.
     */
    private String identityProviderId;

    /**
     * The OCID of the identity provider.
     */
    public String getIdentityProviderId() {
        return identityProviderId;
    }
    /**
     * The OCID of the group mapping.
     */
    private String mappingId;

    /**
     * The OCID of the group mapping.
     */
    public String getMappingId() {
        return mappingId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetIdpGroupMappingRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the identity provider.
         */
        private String identityProviderId = null;

        /**
         * The OCID of the identity provider.
         * @param identityProviderId the value to set
         * @return this builder instance
         */
        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * The OCID of the group mapping.
         */
        private String mappingId = null;

        /**
         * The OCID of the group mapping.
         * @param mappingId the value to set
         * @return this builder instance
         */
        public Builder mappingId(String mappingId) {
            this.mappingId = mappingId;
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
        public Builder copy(GetIdpGroupMappingRequest o) {
            identityProviderId(o.getIdentityProviderId());
            mappingId(o.getMappingId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetIdpGroupMappingRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetIdpGroupMappingRequest
         */
        public GetIdpGroupMappingRequest build() {
            GetIdpGroupMappingRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetIdpGroupMappingRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetIdpGroupMappingRequest
         */
        public GetIdpGroupMappingRequest buildWithoutInvocationCallback() {
            GetIdpGroupMappingRequest request = new GetIdpGroupMappingRequest();
            request.identityProviderId = identityProviderId;
            request.mappingId = mappingId;
            return request;
            // new GetIdpGroupMappingRequest(identityProviderId, mappingId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().identityProviderId(identityProviderId).mappingId(mappingId);
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
        sb.append(",identityProviderId=").append(String.valueOf(this.identityProviderId));
        sb.append(",mappingId=").append(String.valueOf(this.mappingId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetIdpGroupMappingRequest)) {
            return false;
        }

        GetIdpGroupMappingRequest other = (GetIdpGroupMappingRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.identityProviderId, other.identityProviderId)
                && java.util.Objects.equals(this.mappingId, other.mappingId);
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
        return result;
    }
}
