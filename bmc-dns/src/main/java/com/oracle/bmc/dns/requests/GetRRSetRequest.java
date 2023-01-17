/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetRRSetExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRRSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class GetRRSetRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The name or OCID of the target zone.
     */
    private String zoneNameOrId;

    /**
     * The name or OCID of the target zone.
     */
    public String getZoneNameOrId() {
        return zoneNameOrId;
    }
    /**
     * The target fully-qualified domain name (FQDN) within the target zone.
     */
    private String domain;

    /**
     * The target fully-qualified domain name (FQDN) within the target zone.
     */
    public String getDomain() {
        return domain;
    }
    /**
     * The type of the target RRSet within the target zone.
     */
    private String rtype;

    /**
     * The type of the target RRSet within the target zone.
     */
    public String getRtype() {
        return rtype;
    }
    /**
     * The {@code If-None-Match} header field makes the request method conditional on
     * the absence of any current representation of the target resource, when
     * the field-value is {@code *}, or having a selected representation with an
     * entity-tag that does not match any of those listed in the field-value.
     *
     */
    private String ifNoneMatch;

    /**
     * The {@code If-None-Match} header field makes the request method conditional on
     * the absence of any current representation of the target resource, when
     * the field-value is {@code *}, or having a selected representation with an
     * entity-tag that does not match any of those listed in the field-value.
     *
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /**
     * The {@code If-Modified-Since} header field makes a GET or HEAD request method
     * conditional on the selected representation's modification date being more
     * recent than the date provided in the field-value.  Transfer of the
     * selected representation's data is avoided if that data has not changed.
     *
     */
    private String ifModifiedSince;

    /**
     * The {@code If-Modified-Since} header field makes a GET or HEAD request method
     * conditional on the selected representation's modification date being more
     * recent than the date provided in the field-value.  Transfer of the
     * selected representation's data is avoided if that data has not changed.
     *
     */
    public String getIfModifiedSince() {
        return ifModifiedSince;
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
     * The maximum number of items to return in a page of the collection.
     *
     */
    private Long limit;

    /**
     * The maximum number of items to return in a page of the collection.
     *
     */
    public Long getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The version of the zone for which data is requested.
     *
     */
    private String zoneVersion;

    /**
     * The version of the zone for which data is requested.
     *
     */
    public String getZoneVersion() {
        return zoneVersion;
    }
    /**
     * The OCID of the compartment the zone belongs to.
     * <p>
     * This parameter is deprecated and should be omitted.
     *
     */
    private String compartmentId;

    /**
     * The OCID of the compartment the zone belongs to.
     * <p>
     * This parameter is deprecated and should be omitted.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
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
     * The OCID of the view the resource is associated with.
     */
    private String viewId;

    /**
     * The OCID of the view the resource is associated with.
     */
    public String getViewId() {
        return viewId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<GetRRSetRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The name or OCID of the target zone.
         */
        private String zoneNameOrId = null;

        /**
         * The name or OCID of the target zone.
         * @param zoneNameOrId the value to set
         * @return this builder instance
         */
        public Builder zoneNameOrId(String zoneNameOrId) {
            this.zoneNameOrId = zoneNameOrId;
            return this;
        }

        /**
         * The target fully-qualified domain name (FQDN) within the target zone.
         */
        private String domain = null;

        /**
         * The target fully-qualified domain name (FQDN) within the target zone.
         * @param domain the value to set
         * @return this builder instance
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The type of the target RRSet within the target zone.
         */
        private String rtype = null;

        /**
         * The type of the target RRSet within the target zone.
         * @param rtype the value to set
         * @return this builder instance
         */
        public Builder rtype(String rtype) {
            this.rtype = rtype;
            return this;
        }

        /**
         * The {@code If-None-Match} header field makes the request method conditional on
         * the absence of any current representation of the target resource, when
         * the field-value is {@code *}, or having a selected representation with an
         * entity-tag that does not match any of those listed in the field-value.
         *
         */
        private String ifNoneMatch = null;

        /**
         * The {@code If-None-Match} header field makes the request method conditional on
         * the absence of any current representation of the target resource, when
         * the field-value is {@code *}, or having a selected representation with an
         * entity-tag that does not match any of those listed in the field-value.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
            return this;
        }

        /**
         * The {@code If-Modified-Since} header field makes a GET or HEAD request method
         * conditional on the selected representation's modification date being more
         * recent than the date provided in the field-value.  Transfer of the
         * selected representation's data is avoided if that data has not changed.
         *
         */
        private String ifModifiedSince = null;

        /**
         * The {@code If-Modified-Since} header field makes a GET or HEAD request method
         * conditional on the selected representation's modification date being more
         * recent than the date provided in the field-value.  Transfer of the
         * selected representation's data is avoided if that data has not changed.
         *
         * @param ifModifiedSince the value to set
         * @return this builder instance
         */
        public Builder ifModifiedSince(String ifModifiedSince) {
            this.ifModifiedSince = ifModifiedSince;
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
         * The maximum number of items to return in a page of the collection.
         *
         */
        private Long limit = null;

        /**
         * The maximum number of items to return in a page of the collection.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The version of the zone for which data is requested.
         *
         */
        private String zoneVersion = null;

        /**
         * The version of the zone for which data is requested.
         *
         * @param zoneVersion the value to set
         * @return this builder instance
         */
        public Builder zoneVersion(String zoneVersion) {
            this.zoneVersion = zoneVersion;
            return this;
        }

        /**
         * The OCID of the compartment the zone belongs to.
         * <p>
         * This parameter is deprecated and should be omitted.
         *
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment the zone belongs to.
         * <p>
         * This parameter is deprecated and should be omitted.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
         * The OCID of the view the resource is associated with.
         */
        private String viewId = null;

        /**
         * The OCID of the view the resource is associated with.
         * @param viewId the value to set
         * @return this builder instance
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
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
        public Builder copy(GetRRSetRequest o) {
            zoneNameOrId(o.getZoneNameOrId());
            domain(o.getDomain());
            rtype(o.getRtype());
            ifNoneMatch(o.getIfNoneMatch());
            ifModifiedSince(o.getIfModifiedSince());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            zoneVersion(o.getZoneVersion());
            compartmentId(o.getCompartmentId());
            scope(o.getScope());
            viewId(o.getViewId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRRSetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetRRSetRequest
         */
        public GetRRSetRequest build() {
            GetRRSetRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetRRSetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetRRSetRequest
         */
        public GetRRSetRequest buildWithoutInvocationCallback() {
            GetRRSetRequest request = new GetRRSetRequest();
            request.zoneNameOrId = zoneNameOrId;
            request.domain = domain;
            request.rtype = rtype;
            request.ifNoneMatch = ifNoneMatch;
            request.ifModifiedSince = ifModifiedSince;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.zoneVersion = zoneVersion;
            request.compartmentId = compartmentId;
            request.scope = scope;
            request.viewId = viewId;
            return request;
            // new GetRRSetRequest(zoneNameOrId, domain, rtype, ifNoneMatch, ifModifiedSince, opcRequestId, limit, page, zoneVersion, compartmentId, scope, viewId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .zoneNameOrId(zoneNameOrId)
                .domain(domain)
                .rtype(rtype)
                .ifNoneMatch(ifNoneMatch)
                .ifModifiedSince(ifModifiedSince)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .zoneVersion(zoneVersion)
                .compartmentId(compartmentId)
                .scope(scope)
                .viewId(viewId);
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
        sb.append(",zoneNameOrId=").append(String.valueOf(this.zoneNameOrId));
        sb.append(",domain=").append(String.valueOf(this.domain));
        sb.append(",rtype=").append(String.valueOf(this.rtype));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",ifModifiedSince=").append(String.valueOf(this.ifModifiedSince));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",zoneVersion=").append(String.valueOf(this.zoneVersion));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
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
        if (!(o instanceof GetRRSetRequest)) {
            return false;
        }

        GetRRSetRequest other = (GetRRSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.zoneNameOrId, other.zoneNameOrId)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.rtype, other.rtype)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.ifModifiedSince, other.ifModifiedSince)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.zoneVersion, other.zoneVersion)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.viewId, other.viewId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.zoneNameOrId == null ? 43 : this.zoneNameOrId.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.rtype == null ? 43 : this.rtype.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.ifModifiedSince == null ? 43 : this.ifModifiedSince.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.zoneVersion == null ? 43 : this.zoneVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        return result;
    }
}
