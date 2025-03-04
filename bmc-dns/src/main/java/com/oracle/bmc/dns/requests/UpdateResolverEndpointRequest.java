/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateResolverEndpointExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateResolverEndpointRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class UpdateResolverEndpointRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dns.model.UpdateResolverEndpointDetails> {

    /** The OCID of the target resolver. */
    private String resolverId;

    /** The OCID of the target resolver. */
    public String getResolverId() {
        return resolverId;
    }
    /** The name of the target resolver endpoint. */
    private String resolverEndpointName;

    /** The name of the target resolver endpoint. */
    public String getResolverEndpointName() {
        return resolverEndpointName;
    }
    /** New data for the resolver endpoint. */
    private com.oracle.bmc.dns.model.UpdateResolverEndpointDetails updateResolverEndpointDetails;

    /** New data for the resolver endpoint. */
    public com.oracle.bmc.dns.model.UpdateResolverEndpointDetails
            getUpdateResolverEndpointDetails() {
        return updateResolverEndpointDetails;
    }
    /**
     * The {@code If-Match} header field makes the request method conditional on the existence of at
     * least one current representation of the target resource, when the field-value is {@code *},
     * or having a current representation of the target resource that has an entity-tag matching a
     * member of the list of entity-tags provided in the field-value.
     */
    private String ifMatch;

    /**
     * The {@code If-Match} header field makes the request method conditional on the existence of at
     * least one current representation of the target resource, when the field-value is {@code *},
     * or having a current representation of the target resource that has an entity-tag matching a
     * member of the list of entity-tags provided in the field-value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The {@code If-Unmodified-Since} header field makes the request method conditional on the
     * selected representation's last modification date being earlier than or equal to the date
     * provided in the field-value. This field accomplishes the same purpose as If-Match for cases
     * where the user agent does not have an entity-tag for the representation.
     */
    private String ifUnmodifiedSince;

    /**
     * The {@code If-Unmodified-Since} header field makes the request method conditional on the
     * selected representation's last modification date being earlier than or equal to the date
     * provided in the field-value. This field accomplishes the same purpose as If-Match for cases
     * where the user agent does not have an entity-tag for the representation.
     */
    public String getIfUnmodifiedSince() {
        return ifUnmodifiedSince;
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
    /** Specifies to operate only on resources that have a matching DNS scope. */
    private com.oracle.bmc.dns.model.Scope scope;

    /** Specifies to operate only on resources that have a matching DNS scope. */
    public com.oracle.bmc.dns.model.Scope getScope() {
        return scope;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dns.model.UpdateResolverEndpointDetails getBody$() {
        return updateResolverEndpointDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateResolverEndpointRequest,
                    com.oracle.bmc.dns.model.UpdateResolverEndpointDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the target resolver. */
        private String resolverId = null;

        /**
         * The OCID of the target resolver.
         *
         * @param resolverId the value to set
         * @return this builder instance
         */
        public Builder resolverId(String resolverId) {
            this.resolverId = resolverId;
            return this;
        }

        /** The name of the target resolver endpoint. */
        private String resolverEndpointName = null;

        /**
         * The name of the target resolver endpoint.
         *
         * @param resolverEndpointName the value to set
         * @return this builder instance
         */
        public Builder resolverEndpointName(String resolverEndpointName) {
            this.resolverEndpointName = resolverEndpointName;
            return this;
        }

        /** New data for the resolver endpoint. */
        private com.oracle.bmc.dns.model.UpdateResolverEndpointDetails
                updateResolverEndpointDetails = null;

        /**
         * New data for the resolver endpoint.
         *
         * @param updateResolverEndpointDetails the value to set
         * @return this builder instance
         */
        public Builder updateResolverEndpointDetails(
                com.oracle.bmc.dns.model.UpdateResolverEndpointDetails
                        updateResolverEndpointDetails) {
            this.updateResolverEndpointDetails = updateResolverEndpointDetails;
            return this;
        }

        /**
         * The {@code If-Match} header field makes the request method conditional on the existence
         * of at least one current representation of the target resource, when the field-value is
         * {@code *}, or having a current representation of the target resource that has an
         * entity-tag matching a member of the list of entity-tags provided in the field-value.
         */
        private String ifMatch = null;

        /**
         * The {@code If-Match} header field makes the request method conditional on the existence
         * of at least one current representation of the target resource, when the field-value is
         * {@code *}, or having a current representation of the target resource that has an
         * entity-tag matching a member of the list of entity-tags provided in the field-value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The {@code If-Unmodified-Since} header field makes the request method conditional on the
         * selected representation's last modification date being earlier than or equal to the date
         * provided in the field-value. This field accomplishes the same purpose as If-Match for
         * cases where the user agent does not have an entity-tag for the representation.
         */
        private String ifUnmodifiedSince = null;

        /**
         * The {@code If-Unmodified-Since} header field makes the request method conditional on the
         * selected representation's last modification date being earlier than or equal to the date
         * provided in the field-value. This field accomplishes the same purpose as If-Match for
         * cases where the user agent does not have an entity-tag for the representation.
         *
         * @param ifUnmodifiedSince the value to set
         * @return this builder instance
         */
        public Builder ifUnmodifiedSince(String ifUnmodifiedSince) {
            this.ifUnmodifiedSince = ifUnmodifiedSince;
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

        /** Specifies to operate only on resources that have a matching DNS scope. */
        private com.oracle.bmc.dns.model.Scope scope = null;

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         * @param scope the value to set
         * @return this builder instance
         */
        public Builder scope(com.oracle.bmc.dns.model.Scope scope) {
            this.scope = scope;
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
        public Builder copy(UpdateResolverEndpointRequest o) {
            resolverId(o.getResolverId());
            resolverEndpointName(o.getResolverEndpointName());
            updateResolverEndpointDetails(o.getUpdateResolverEndpointDetails());
            ifMatch(o.getIfMatch());
            ifUnmodifiedSince(o.getIfUnmodifiedSince());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateResolverEndpointRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateResolverEndpointRequest
         */
        public UpdateResolverEndpointRequest build() {
            UpdateResolverEndpointRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dns.model.UpdateResolverEndpointDetails body) {
            updateResolverEndpointDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateResolverEndpointRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateResolverEndpointRequest
         */
        public UpdateResolverEndpointRequest buildWithoutInvocationCallback() {
            UpdateResolverEndpointRequest request = new UpdateResolverEndpointRequest();
            request.resolverId = resolverId;
            request.resolverEndpointName = resolverEndpointName;
            request.updateResolverEndpointDetails = updateResolverEndpointDetails;
            request.ifMatch = ifMatch;
            request.ifUnmodifiedSince = ifUnmodifiedSince;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            return request;
            // new UpdateResolverEndpointRequest(resolverId, resolverEndpointName,
            // updateResolverEndpointDetails, ifMatch, ifUnmodifiedSince, opcRequestId, scope);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .resolverId(resolverId)
                .resolverEndpointName(resolverEndpointName)
                .updateResolverEndpointDetails(updateResolverEndpointDetails)
                .ifMatch(ifMatch)
                .ifUnmodifiedSince(ifUnmodifiedSince)
                .opcRequestId(opcRequestId)
                .scope(scope);
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
        sb.append(",resolverId=").append(String.valueOf(this.resolverId));
        sb.append(",resolverEndpointName=").append(String.valueOf(this.resolverEndpointName));
        sb.append(",updateResolverEndpointDetails=")
                .append(String.valueOf(this.updateResolverEndpointDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifUnmodifiedSince=").append(String.valueOf(this.ifUnmodifiedSince));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateResolverEndpointRequest)) {
            return false;
        }

        UpdateResolverEndpointRequest other = (UpdateResolverEndpointRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.resolverId, other.resolverId)
                && java.util.Objects.equals(this.resolverEndpointName, other.resolverEndpointName)
                && java.util.Objects.equals(
                        this.updateResolverEndpointDetails, other.updateResolverEndpointDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifUnmodifiedSince, other.ifUnmodifiedSince)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.scope, other.scope);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.resolverId == null ? 43 : this.resolverId.hashCode());
        result =
                (result * PRIME)
                        + (this.resolverEndpointName == null
                                ? 43
                                : this.resolverEndpointName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateResolverEndpointDetails == null
                                ? 43
                                : this.updateResolverEndpointDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.ifUnmodifiedSince == null ? 43 : this.ifUnmodifiedSince.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        return result;
    }
}
