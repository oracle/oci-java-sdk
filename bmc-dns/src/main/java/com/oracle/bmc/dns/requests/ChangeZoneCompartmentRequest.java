/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeZoneCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeZoneCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class ChangeZoneCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails> {

    /**
     * The OCID of the target zone.
     */
    private String zoneId;

    /**
     * The OCID of the target zone.
     */
    public String getZoneId() {
        return zoneId;
    }
    /**
     * Details for moving a zone into a different compartment.
     */
    private com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails changeZoneCompartmentDetails;

    /**
     * Details for moving a zone into a different compartment.
     */
    public com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails getChangeZoneCompartmentDetails() {
        return changeZoneCompartmentDetails;
    }
    /**
     * The {@code If-Match} header field makes the request method conditional on the
     * existence of at least one current representation of the target resource,
     * when the field-value is {@code *}, or having a current representation of the
     * target resource that has an entity-tag matching a member of the list of
     * entity-tags provided in the field-value.
     *
     */
    private String ifMatch;

    /**
     * The {@code If-Match} header field makes the request method conditional on the
     * existence of at least one current representation of the target resource,
     * when the field-value is {@code *}, or having a current representation of the
     * target resource that has an entity-tag matching a member of the list of
     * entity-tags provided in the field-value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been
     * deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been
     * deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    private com.oracle.bmc.dns.model.Scope scope;

    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    public com.oracle.bmc.dns.model.Scope getScope() {
        return scope;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails getBody$() {
        return changeZoneCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeZoneCompartmentRequest,
                    com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the target zone.
         */
        private String zoneId = null;

        /**
         * The OCID of the target zone.
         * @param zoneId the value to set
         * @return this builder instance
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Details for moving a zone into a different compartment.
         */
        private com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails changeZoneCompartmentDetails =
                null;

        /**
         * Details for moving a zone into a different compartment.
         * @param changeZoneCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeZoneCompartmentDetails(
                com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails
                        changeZoneCompartmentDetails) {
            this.changeZoneCompartmentDetails = changeZoneCompartmentDetails;
            return this;
        }

        /**
         * The {@code If-Match} header field makes the request method conditional on the
         * existence of at least one current representation of the target resource,
         * when the field-value is {@code *}, or having a current representation of the
         * target resource that has an entity-tag matching a member of the list of
         * entity-tags provided in the field-value.
         *
         */
        private String ifMatch = null;

        /**
         * The {@code If-Match} header field makes the request method conditional on the
         * existence of at least one current representation of the target resource,
         * when the field-value is {@code *}, or having a current representation of the
         * target resource that has an entity-tag matching a member of the list of
         * entity-tags provided in the field-value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated before
         * then due to conflicting operations (for example, if a resource has been
         * deleted and purged from the system, then a retry of the original creation
         * request may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated before
         * then due to conflicting operations (for example, if a resource has been
         * deleted and purged from the system, then a retry of the original creation
         * request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         */
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
        public Builder copy(ChangeZoneCompartmentRequest o) {
            zoneId(o.getZoneId());
            changeZoneCompartmentDetails(o.getChangeZoneCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeZoneCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeZoneCompartmentRequest
         */
        public ChangeZoneCompartmentRequest build() {
            ChangeZoneCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dns.model.ChangeZoneCompartmentDetails body) {
            changeZoneCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeZoneCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeZoneCompartmentRequest
         */
        public ChangeZoneCompartmentRequest buildWithoutInvocationCallback() {
            ChangeZoneCompartmentRequest request = new ChangeZoneCompartmentRequest();
            request.zoneId = zoneId;
            request.changeZoneCompartmentDetails = changeZoneCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            return request;
            // new ChangeZoneCompartmentRequest(zoneId, changeZoneCompartmentDetails, ifMatch, opcRetryToken, opcRequestId, scope);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .zoneId(zoneId)
                .changeZoneCompartmentDetails(changeZoneCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .scope(scope);
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
        sb.append(",zoneId=").append(String.valueOf(this.zoneId));
        sb.append(",changeZoneCompartmentDetails=")
                .append(String.valueOf(this.changeZoneCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof ChangeZoneCompartmentRequest)) {
            return false;
        }

        ChangeZoneCompartmentRequest other = (ChangeZoneCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.zoneId, other.zoneId)
                && java.util.Objects.equals(
                        this.changeZoneCompartmentDetails, other.changeZoneCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
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
                        + (this.changeZoneCompartmentDetails == null
                                ? 43
                                : this.changeZoneCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        return result;
    }
}
