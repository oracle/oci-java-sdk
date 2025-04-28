/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetZoneContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetZoneContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class GetZoneContentRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The name or OCID of the target zone. */
    private String zoneNameOrId;

    /** The name or OCID of the target zone. */
    public String getZoneNameOrId() {
        return zoneNameOrId;
    }
    /**
     * The {@code If-None-Match} header field makes the request method conditional on the absence of
     * any current representation of the target resource, when the field-value is {@code *}, or
     * having a selected representation with an entity-tag that does not match any of those listed
     * in the field-value.
     */
    private String ifNoneMatch;

    /**
     * The {@code If-None-Match} header field makes the request method conditional on the absence of
     * any current representation of the target resource, when the field-value is {@code *}, or
     * having a selected representation with an entity-tag that does not match any of those listed
     * in the field-value.
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /**
     * The {@code If-Modified-Since} header field makes a GET or HEAD request method conditional on
     * the selected representation's modification date being more recent than the date provided in
     * the field-value. Transfer of the selected representation's data is avoided if that data has
     * not changed.
     */
    private String ifModifiedSince;

    /**
     * The {@code If-Modified-Since} header field makes a GET or HEAD request method conditional on
     * the selected representation's modification date being more recent than the date provided in
     * the field-value. Transfer of the selected representation's data is avoided if that data has
     * not changed.
     */
    public String getIfModifiedSince() {
        return ifModifiedSince;
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
     * The OCID of the view the zone is associated with. Required when accessing a private zone by
     * name.
     */
    private String viewId;

    /**
     * The OCID of the view the zone is associated with. Required when accessing a private zone by
     * name.
     */
    public String getViewId() {
        return viewId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetZoneContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The name or OCID of the target zone. */
        private String zoneNameOrId = null;

        /**
         * The name or OCID of the target zone.
         *
         * @param zoneNameOrId the value to set
         * @return this builder instance
         */
        public Builder zoneNameOrId(String zoneNameOrId) {
            this.zoneNameOrId = zoneNameOrId;
            return this;
        }

        /**
         * The {@code If-None-Match} header field makes the request method conditional on the
         * absence of any current representation of the target resource, when the field-value is
         * {@code *}, or having a selected representation with an entity-tag that does not match any
         * of those listed in the field-value.
         */
        private String ifNoneMatch = null;

        /**
         * The {@code If-None-Match} header field makes the request method conditional on the
         * absence of any current representation of the target resource, when the field-value is
         * {@code *}, or having a selected representation with an entity-tag that does not match any
         * of those listed in the field-value.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /**
         * The {@code If-Modified-Since} header field makes a GET or HEAD request method conditional
         * on the selected representation's modification date being more recent than the date
         * provided in the field-value. Transfer of the selected representation's data is avoided if
         * that data has not changed.
         */
        private String ifModifiedSince = null;

        /**
         * The {@code If-Modified-Since} header field makes a GET or HEAD request method conditional
         * on the selected representation's modification date being more recent than the date
         * provided in the field-value. Transfer of the selected representation's data is avoided if
         * that data has not changed.
         *
         * @param ifModifiedSince the value to set
         * @return this builder instance
         */
        public Builder ifModifiedSince(String ifModifiedSince) {
            this.ifModifiedSince = ifModifiedSince;
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
         * The OCID of the view the zone is associated with. Required when accessing a private zone
         * by name.
         */
        private String viewId = null;

        /**
         * The OCID of the view the zone is associated with. Required when accessing a private zone
         * by name.
         *
         * @param viewId the value to set
         * @return this builder instance
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
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
        public Builder copy(GetZoneContentRequest o) {
            zoneNameOrId(o.getZoneNameOrId());
            ifNoneMatch(o.getIfNoneMatch());
            ifModifiedSince(o.getIfModifiedSince());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            viewId(o.getViewId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetZoneContentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetZoneContentRequest
         */
        public GetZoneContentRequest build() {
            GetZoneContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetZoneContentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetZoneContentRequest
         */
        public GetZoneContentRequest buildWithoutInvocationCallback() {
            GetZoneContentRequest request = new GetZoneContentRequest();
            request.zoneNameOrId = zoneNameOrId;
            request.ifNoneMatch = ifNoneMatch;
            request.ifModifiedSince = ifModifiedSince;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            request.viewId = viewId;
            return request;
            // new GetZoneContentRequest(zoneNameOrId, ifNoneMatch, ifModifiedSince, opcRequestId,
            // scope, viewId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .zoneNameOrId(zoneNameOrId)
                .ifNoneMatch(ifNoneMatch)
                .ifModifiedSince(ifModifiedSince)
                .opcRequestId(opcRequestId)
                .scope(scope)
                .viewId(viewId);
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
        sb.append(",zoneNameOrId=").append(String.valueOf(this.zoneNameOrId));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",ifModifiedSince=").append(String.valueOf(this.ifModifiedSince));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(",viewId=").append(String.valueOf(this.viewId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetZoneContentRequest)) {
            return false;
        }

        GetZoneContentRequest other = (GetZoneContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.zoneNameOrId, other.zoneNameOrId)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.ifModifiedSince, other.ifModifiedSince)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.viewId, other.viewId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.zoneNameOrId == null ? 43 : this.zoneNameOrId.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.ifModifiedSince == null ? 43 : this.ifModifiedSince.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        return result;
    }
}
