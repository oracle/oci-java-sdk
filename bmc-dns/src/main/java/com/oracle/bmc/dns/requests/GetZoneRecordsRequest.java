/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetZoneRecordsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetZoneRecordsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class GetZoneRecordsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * Search by domain.
     * Will match any record whose domain (case-insensitive) equals the provided value.
     *
     */
    private String domain;

    /**
     * Search by domain.
     * Will match any record whose domain (case-insensitive) equals the provided value.
     *
     */
    public String getDomain() {
        return domain;
    }
    /**
     * Search by domain.
     * Will match any record whose domain (case-insensitive) contains the provided value.
     *
     */
    private String domainContains;

    /**
     * Search by domain.
     * Will match any record whose domain (case-insensitive) contains the provided value.
     *
     */
    public String getDomainContains() {
        return domainContains;
    }
    /**
     * Search by record type.
     * Will match any record whose [type](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4) (case-insensitive) equals the provided value.
     *
     */
    private String rtype;

    /**
     * Search by record type.
     * Will match any record whose [type](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4) (case-insensitive) equals the provided value.
     *
     */
    public String getRtype() {
        return rtype;
    }
    /**
     * The field by which to sort records.
     */
    private SortBy sortBy;

    /**
     * The field by which to sort records.
     **/
    public enum SortBy {
        Domain("domain"),
        Rtype("rtype"),
        Ttl("ttl"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field by which to sort records.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The order to sort the resources.
     *
     */
    private com.oracle.bmc.dns.model.SortOrder sortOrder;

    /**
     * The order to sort the resources.
     *
     */
    public com.oracle.bmc.dns.model.SortOrder getSortOrder() {
        return sortOrder;
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
     * The OCID of the view the zone is associated with. Required when accessing a private zone by name.
     */
    private String viewId;

    /**
     * The OCID of the view the zone is associated with. Required when accessing a private zone by name.
     */
    public String getViewId() {
        return viewId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetZoneRecordsRequest, java.lang.Void> {
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
         * Search by domain.
         * Will match any record whose domain (case-insensitive) equals the provided value.
         *
         */
        private String domain = null;

        /**
         * Search by domain.
         * Will match any record whose domain (case-insensitive) equals the provided value.
         *
         * @param domain the value to set
         * @return this builder instance
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Search by domain.
         * Will match any record whose domain (case-insensitive) contains the provided value.
         *
         */
        private String domainContains = null;

        /**
         * Search by domain.
         * Will match any record whose domain (case-insensitive) contains the provided value.
         *
         * @param domainContains the value to set
         * @return this builder instance
         */
        public Builder domainContains(String domainContains) {
            this.domainContains = domainContains;
            return this;
        }

        /**
         * Search by record type.
         * Will match any record whose [type](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4) (case-insensitive) equals the provided value.
         *
         */
        private String rtype = null;

        /**
         * Search by record type.
         * Will match any record whose [type](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4) (case-insensitive) equals the provided value.
         *
         * @param rtype the value to set
         * @return this builder instance
         */
        public Builder rtype(String rtype) {
            this.rtype = rtype;
            return this;
        }

        /**
         * The field by which to sort records.
         */
        private SortBy sortBy = null;

        /**
         * The field by which to sort records.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The order to sort the resources.
         *
         */
        private com.oracle.bmc.dns.model.SortOrder sortOrder = null;

        /**
         * The order to sort the resources.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.dns.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
         * The OCID of the view the zone is associated with. Required when accessing a private zone by name.
         */
        private String viewId = null;

        /**
         * The OCID of the view the zone is associated with. Required when accessing a private zone by name.
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
        public Builder copy(GetZoneRecordsRequest o) {
            zoneNameOrId(o.getZoneNameOrId());
            ifNoneMatch(o.getIfNoneMatch());
            ifModifiedSince(o.getIfModifiedSince());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            zoneVersion(o.getZoneVersion());
            domain(o.getDomain());
            domainContains(o.getDomainContains());
            rtype(o.getRtype());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            compartmentId(o.getCompartmentId());
            scope(o.getScope());
            viewId(o.getViewId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetZoneRecordsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetZoneRecordsRequest
         */
        public GetZoneRecordsRequest build() {
            GetZoneRecordsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetZoneRecordsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetZoneRecordsRequest
         */
        public GetZoneRecordsRequest buildWithoutInvocationCallback() {
            GetZoneRecordsRequest request = new GetZoneRecordsRequest();
            request.zoneNameOrId = zoneNameOrId;
            request.ifNoneMatch = ifNoneMatch;
            request.ifModifiedSince = ifModifiedSince;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.zoneVersion = zoneVersion;
            request.domain = domain;
            request.domainContains = domainContains;
            request.rtype = rtype;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.compartmentId = compartmentId;
            request.scope = scope;
            request.viewId = viewId;
            return request;
            // new GetZoneRecordsRequest(zoneNameOrId, ifNoneMatch, ifModifiedSince, opcRequestId, limit, page, zoneVersion, domain, domainContains, rtype, sortBy, sortOrder, compartmentId, scope, viewId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .zoneNameOrId(zoneNameOrId)
                .ifNoneMatch(ifNoneMatch)
                .ifModifiedSince(ifModifiedSince)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .zoneVersion(zoneVersion)
                .domain(domain)
                .domainContains(domainContains)
                .rtype(rtype)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",ifModifiedSince=").append(String.valueOf(this.ifModifiedSince));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",zoneVersion=").append(String.valueOf(this.zoneVersion));
        sb.append(",domain=").append(String.valueOf(this.domain));
        sb.append(",domainContains=").append(String.valueOf(this.domainContains));
        sb.append(",rtype=").append(String.valueOf(this.rtype));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
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
        if (!(o instanceof GetZoneRecordsRequest)) {
            return false;
        }

        GetZoneRecordsRequest other = (GetZoneRecordsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.zoneNameOrId, other.zoneNameOrId)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.ifModifiedSince, other.ifModifiedSince)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.zoneVersion, other.zoneVersion)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.domainContains, other.domainContains)
                && java.util.Objects.equals(this.rtype, other.rtype)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
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
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.zoneVersion == null ? 43 : this.zoneVersion.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.domainContains == null ? 43 : this.domainContains.hashCode());
        result = (result * PRIME) + (this.rtype == null ? 43 : this.rtype.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        return result;
    }
}
