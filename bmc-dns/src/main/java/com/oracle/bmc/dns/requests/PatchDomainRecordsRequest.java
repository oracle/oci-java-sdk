/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/PatchDomainRecordsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PatchDomainRecordsRequest.
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
public class PatchDomainRecordsRequest
        extends com.oracle.bmc.requests.BmcRequest<PatchDomainRecordsDetails> {

    /**
     * The name or OCID of the target zone.
     */
    private String zoneNameOrId;

    /**
     * The target fully-qualified domain name (FQDN) within the target zone.
     */
    private String domain;

    /**
     * Operations describing how to modify the collection of records.
     */
    private PatchDomainRecordsDetails patchDomainRecordsDetails;

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
     * The {@code If-Unmodified-Since} header field makes the request method
     * conditional on the selected representation's last modification date being
     * earlier than or equal to the date provided in the field-value.  This
     * field accomplishes the same purpose as If-Match for cases where the user
     * agent does not have an entity-tag for the representation.
     *
     */
    private String ifUnmodifiedSince;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

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
     * The OCID of the compartment the resource belongs to.
     */
    private String compartmentId;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public PatchDomainRecordsDetails getBody$() {
        return patchDomainRecordsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PatchDomainRecordsRequest, PatchDomainRecordsDetails> {
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
        public Builder copy(PatchDomainRecordsRequest o) {
            zoneNameOrId(o.getZoneNameOrId());
            domain(o.getDomain());
            patchDomainRecordsDetails(o.getPatchDomainRecordsDetails());
            ifMatch(o.getIfMatch());
            ifUnmodifiedSince(o.getIfUnmodifiedSince());
            opcRequestId(o.getOpcRequestId());
            scope(o.getScope());
            viewId(o.getViewId());
            compartmentId(o.getCompartmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PatchDomainRecordsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of PatchDomainRecordsRequest
         */
        public PatchDomainRecordsRequest build() {
            PatchDomainRecordsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(PatchDomainRecordsDetails body) {
            patchDomainRecordsDetails(body);
            return this;
        }
    }
}
