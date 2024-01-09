/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ChangeViewCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeViewCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class ChangeViewCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dns.model.ChangeViewCompartmentDetails> {

    /** The OCID of the target view. */
    private String viewId;

    /** The OCID of the target view. */
    public String getViewId() {
        return viewId;
    }
    /** Details for moving a view into a different compartment. */
    private com.oracle.bmc.dns.model.ChangeViewCompartmentDetails changeViewCompartmentDetails;

    /** Details for moving a view into a different compartment. */
    public com.oracle.bmc.dns.model.ChangeViewCompartmentDetails getChangeViewCompartmentDetails() {
        return changeViewCompartmentDetails;
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
    public com.oracle.bmc.dns.model.ChangeViewCompartmentDetails getBody$() {
        return changeViewCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeViewCompartmentRequest,
                    com.oracle.bmc.dns.model.ChangeViewCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the target view. */
        private String viewId = null;

        /**
         * The OCID of the target view.
         *
         * @param viewId the value to set
         * @return this builder instance
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
            return this;
        }

        /** Details for moving a view into a different compartment. */
        private com.oracle.bmc.dns.model.ChangeViewCompartmentDetails changeViewCompartmentDetails =
                null;

        /**
         * Details for moving a view into a different compartment.
         *
         * @param changeViewCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeViewCompartmentDetails(
                com.oracle.bmc.dns.model.ChangeViewCompartmentDetails
                        changeViewCompartmentDetails) {
            this.changeViewCompartmentDetails = changeViewCompartmentDetails;
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
        public Builder copy(ChangeViewCompartmentRequest o) {
            viewId(o.getViewId());
            changeViewCompartmentDetails(o.getChangeViewCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeViewCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeViewCompartmentRequest
         */
        public ChangeViewCompartmentRequest build() {
            ChangeViewCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dns.model.ChangeViewCompartmentDetails body) {
            changeViewCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeViewCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeViewCompartmentRequest
         */
        public ChangeViewCompartmentRequest buildWithoutInvocationCallback() {
            ChangeViewCompartmentRequest request = new ChangeViewCompartmentRequest();
            request.viewId = viewId;
            request.changeViewCompartmentDetails = changeViewCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            return request;
            // new ChangeViewCompartmentRequest(viewId, changeViewCompartmentDetails, ifMatch,
            // opcRetryToken, opcRequestId, scope);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .viewId(viewId)
                .changeViewCompartmentDetails(changeViewCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",viewId=").append(String.valueOf(this.viewId));
        sb.append(",changeViewCompartmentDetails=")
                .append(String.valueOf(this.changeViewCompartmentDetails));
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
        if (!(o instanceof ChangeViewCompartmentRequest)) {
            return false;
        }

        ChangeViewCompartmentRequest other = (ChangeViewCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.viewId, other.viewId)
                && java.util.Objects.equals(
                        this.changeViewCompartmentDetails, other.changeViewCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.scope, other.scope);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeViewCompartmentDetails == null
                                ? 43
                                : this.changeViewCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        return result;
    }
}
