/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class GetRRSetRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The name or OCID of the target zone.
     */
    private String zoneNameOrId;

    /**
     * The target fully-qualified domain name (FQDN) within the target zone.
     */
    private String domain;

    /**
     * The type of the target RRSet within the target zone.
     */
    private String rtype;

    /**
     * The `If-None-Match` header field makes the request method conditional on
     * the absence of any current representation of the target resource, when
     * the field-value is `*`, or having a selected representation with an
     * entity-tag that does not match any of those listed in the field-value.
     *
     */
    private String ifNoneMatch;

    /**
     * The `If-Modified-Since` header field makes a GET or HEAD request method
     * conditional on the selected representation's modification date being more
     * recent than the date provided in the field-value.  Transfer of the
     * selected representation's data is avoided if that data has not changed.
     *
     */
    private String ifModifiedSince;

    /**
     * The maximum number of items to return in a page of the collection.
     *
     */
    private Long limit;

    /**
     * The value of the `opc-next-page` response header from the previous \"List\" call.
     *
     */
    private String page;

    /**
     * The version of the zone for which data is requested.
     *
     */
    private String zoneVersion;

    /**
     * The OCID of the compartment the resource belongs to.
     */
    private String compartmentId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

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
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRRSetRequest o) {
            zoneNameOrId(o.getZoneNameOrId());
            domain(o.getDomain());
            rtype(o.getRtype());
            ifNoneMatch(o.getIfNoneMatch());
            ifModifiedSince(o.getIfModifiedSince());
            limit(o.getLimit());
            page(o.getPage());
            zoneVersion(o.getZoneVersion());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
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
            return request;
        }
    }
}
