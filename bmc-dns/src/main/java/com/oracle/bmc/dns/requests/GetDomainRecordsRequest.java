/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/GetDomainRecordsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetDomainRecordsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetDomainRecordsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The name or OCID of the target zone.
     */
    private String zoneNameOrId;

    /**
     * The target fully-qualified domain name (FQDN) within the target zone.
     */
    private String domain;

    /**
     * The {@code If-None-Match} header field makes the request method conditional on
     * the absence of any current representation of the target resource, when
     * the field-value is {@code *}, or having a selected representation with an
     * entity-tag that does not match any of those listed in the field-value.
     *
     */
    private String ifNoneMatch;

    /**
     * The {@code If-Modified-Since} header field makes a GET or HEAD request method
     * conditional on the selected representation's modification date being more
     * recent than the date provided in the field-value.  Transfer of the
     * selected representation's data is avoided if that data has not changed.
     *
     */
    private String ifModifiedSince;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The maximum number of items to return in a page of the collection.
     *
     */
    private Long limit;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * The version of the zone for which data is requested.
     *
     */
    private String zoneVersion;

    /**
     * Search by record type.
     * Will match any record whose [type](https://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-4) (case-insensitive) equals the provided value.
     *
     */
    private String rtype;

    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    private com.oracle.bmc.dns.model.Scope scope;

    /**
     * The OCID of the view the resource is associated with.
     */
    private String viewId;

    /**
     * The field by which to sort records.
     */
    private SortBy sortBy;

    /**
     * The field by which to sort records.
     **/
    public enum SortBy {
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
     * The order to sort the resources.
     *
     */
    private com.oracle.bmc.dns.model.SortOrder sortOrder;

    /**
     * The OCID of the compartment the resource belongs to.
     */
    private String compartmentId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDomainRecordsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(GetDomainRecordsRequest o) {
            zoneNameOrId(o.getZoneNameOrId());
            domain(o.getDomain());
            ifNoneMatch(o.getIfNoneMatch());
            ifModifiedSince(o.getIfModifiedSince());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            zoneVersion(o.getZoneVersion());
            rtype(o.getRtype());
            scope(o.getScope());
            viewId(o.getViewId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDomainRecordsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetDomainRecordsRequest
         */
        public GetDomainRecordsRequest build() {
            GetDomainRecordsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
