/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PromoteZoneDnssecKeyVersionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * PromoteZoneDnssecKeyVersionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class PromoteZoneDnssecKeyVersionRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dns.model.PromoteZoneDnssecKeyVersionDetails> {

    /** The OCID of the target zone. */
    private String zoneId;

    /** The OCID of the target zone. */
    public String getZoneId() {
        return zoneId;
    }
    /** Details for promoting a {@code DnssecKeyVersion}. */
    private com.oracle.bmc.dns.model.PromoteZoneDnssecKeyVersionDetails
            promoteZoneDnssecKeyVersionDetails;

    /** Details for promoting a {@code DnssecKeyVersion}. */
    public com.oracle.bmc.dns.model.PromoteZoneDnssecKeyVersionDetails
            getPromoteZoneDnssecKeyVersionDetails() {
        return promoteZoneDnssecKeyVersionDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.dns.model.PromoteZoneDnssecKeyVersionDetails getBody$() {
        return promoteZoneDnssecKeyVersionDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PromoteZoneDnssecKeyVersionRequest,
                    com.oracle.bmc.dns.model.PromoteZoneDnssecKeyVersionDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the target zone. */
        private String zoneId = null;

        /**
         * The OCID of the target zone.
         *
         * @param zoneId the value to set
         * @return this builder instance
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /** Details for promoting a {@code DnssecKeyVersion}. */
        private com.oracle.bmc.dns.model.PromoteZoneDnssecKeyVersionDetails
                promoteZoneDnssecKeyVersionDetails = null;

        /**
         * Details for promoting a {@code DnssecKeyVersion}.
         *
         * @param promoteZoneDnssecKeyVersionDetails the value to set
         * @return this builder instance
         */
        public Builder promoteZoneDnssecKeyVersionDetails(
                com.oracle.bmc.dns.model.PromoteZoneDnssecKeyVersionDetails
                        promoteZoneDnssecKeyVersionDetails) {
            this.promoteZoneDnssecKeyVersionDetails = promoteZoneDnssecKeyVersionDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
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
        public Builder copy(PromoteZoneDnssecKeyVersionRequest o) {
            zoneId(o.getZoneId());
            promoteZoneDnssecKeyVersionDetails(o.getPromoteZoneDnssecKeyVersionDetails());
            ifMatch(o.getIfMatch());
            ifUnmodifiedSince(o.getIfUnmodifiedSince());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PromoteZoneDnssecKeyVersionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PromoteZoneDnssecKeyVersionRequest
         */
        public PromoteZoneDnssecKeyVersionRequest build() {
            PromoteZoneDnssecKeyVersionRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dns.model.PromoteZoneDnssecKeyVersionDetails body) {
            promoteZoneDnssecKeyVersionDetails(body);
            return this;
        }

        /**
         * Build the instance of PromoteZoneDnssecKeyVersionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PromoteZoneDnssecKeyVersionRequest
         */
        public PromoteZoneDnssecKeyVersionRequest buildWithoutInvocationCallback() {
            PromoteZoneDnssecKeyVersionRequest request = new PromoteZoneDnssecKeyVersionRequest();
            request.zoneId = zoneId;
            request.promoteZoneDnssecKeyVersionDetails = promoteZoneDnssecKeyVersionDetails;
            request.ifMatch = ifMatch;
            request.ifUnmodifiedSince = ifUnmodifiedSince;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            return request;
            // new PromoteZoneDnssecKeyVersionRequest(zoneId, promoteZoneDnssecKeyVersionDetails,
            // ifMatch, ifUnmodifiedSince, opcRetryToken, opcRequestId, scope);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .zoneId(zoneId)
                .promoteZoneDnssecKeyVersionDetails(promoteZoneDnssecKeyVersionDetails)
                .ifMatch(ifMatch)
                .ifUnmodifiedSince(ifUnmodifiedSince)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",zoneId=").append(String.valueOf(this.zoneId));
        sb.append(",promoteZoneDnssecKeyVersionDetails=")
                .append(String.valueOf(this.promoteZoneDnssecKeyVersionDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifUnmodifiedSince=").append(String.valueOf(this.ifUnmodifiedSince));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof PromoteZoneDnssecKeyVersionRequest)) {
            return false;
        }

        PromoteZoneDnssecKeyVersionRequest other = (PromoteZoneDnssecKeyVersionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.zoneId, other.zoneId)
                && java.util.Objects.equals(
                        this.promoteZoneDnssecKeyVersionDetails,
                        other.promoteZoneDnssecKeyVersionDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifUnmodifiedSince, other.ifUnmodifiedSince)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.scope, other.scope);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.zoneId == null ? 43 : this.zoneId.hashCode());
        result =
                (result * PRIME)
                        + (this.promoteZoneDnssecKeyVersionDetails == null
                                ? 43
                                : this.promoteZoneDnssecKeyVersionDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.ifUnmodifiedSince == null ? 43 : this.ifUnmodifiedSince.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        return result;
    }
}
