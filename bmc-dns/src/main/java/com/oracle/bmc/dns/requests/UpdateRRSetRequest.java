/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/UpdateRRSetExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateRRSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class UpdateRRSetRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.dns.model.UpdateRRSetDetails> {

    /**
     * The name or OCID of the target zone.
     */
    private String zoneNameOrId;

    public String getZoneNameOrId() {
        return zoneNameOrId;
    }
    /**
     * The target fully-qualified domain name (FQDN) within the target zone.
     */
    private String domain;

    public String getDomain() {
        return domain;
    }
    /**
     * The type of the target RRSet within the target zone.
     */
    private String rtype;

    public String getRtype() {
        return rtype;
    }
    /**
     * A full list of records for the RRSet.
     */
    private com.oracle.bmc.dns.model.UpdateRRSetDetails updateRRSetDetails;

    public com.oracle.bmc.dns.model.UpdateRRSetDetails getUpdateRRSetDetails() {
        return updateRRSetDetails;
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

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The {@code If-Unmodified-Since} header field makes the request method
     * conditional on the selected representation's last modification date being
     * earlier than or equal to the date provided in the field-value.  This
     * field accomplishes the same purpose as If-Match for cases where the user
     * agent does not have an entity-tag for the representation.
     *
     */
    private String ifUnmodifiedSince;

    public String getIfUnmodifiedSince() {
        return ifUnmodifiedSince;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    private com.oracle.bmc.dns.model.Scope scope;

    public com.oracle.bmc.dns.model.Scope getScope() {
        return scope;
    }
    /**
     * The OCID of the view the resource is associated with.
     */
    private String viewId;

    public String getViewId() {
        return viewId;
    }
    /**
     * The OCID of the compartment the zone belongs to.
     * <p>
     * This parameter is deprecated and should be omitted.
     *
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dns.model.UpdateRRSetDetails getBody$() {
        return updateRRSetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateRRSetRequest, com.oracle.bmc.dns.model.UpdateRRSetDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String zoneNameOrId = null;

        /**
         * The name or OCID of the target zone.
         * @return this builder instance
         */
        public Builder zoneNameOrId(String zoneNameOrId) {
            this.zoneNameOrId = zoneNameOrId;
            return this;
        }

        private String domain = null;

        /**
         * The target fully-qualified domain name (FQDN) within the target zone.
         * @return this builder instance
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        private String rtype = null;

        /**
         * The type of the target RRSet within the target zone.
         * @return this builder instance
         */
        public Builder rtype(String rtype) {
            this.rtype = rtype;
            return this;
        }

        private com.oracle.bmc.dns.model.UpdateRRSetDetails updateRRSetDetails = null;

        /**
         * A full list of records for the RRSet.
         * @return this builder instance
         */
        public Builder updateRRSetDetails(
                com.oracle.bmc.dns.model.UpdateRRSetDetails updateRRSetDetails) {
            this.updateRRSetDetails = updateRRSetDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * The {@code If-Match} header field makes the request method conditional on the
         * existence of at least one current representation of the target resource,
         * when the field-value is {@code *}, or having a current representation of the
         * target resource that has an entity-tag matching a member of the list of
         * entity-tags provided in the field-value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String ifUnmodifiedSince = null;

        /**
         * The {@code If-Unmodified-Since} header field makes the request method
         * conditional on the selected representation's last modification date being
         * earlier than or equal to the date provided in the field-value.  This
         * field accomplishes the same purpose as If-Match for cases where the user
         * agent does not have an entity-tag for the representation.
         *
         * @return this builder instance
         */
        public Builder ifUnmodifiedSince(String ifUnmodifiedSince) {
            this.ifUnmodifiedSince = ifUnmodifiedSince;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.dns.model.Scope scope = null;

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         * @return this builder instance
         */
        public Builder scope(com.oracle.bmc.dns.model.Scope scope) {
            this.scope = scope;
            return this;
        }

        private String viewId = null;

        /**
         * The OCID of the view the resource is associated with.
         * @return this builder instance
         */
        public Builder viewId(String viewId) {
            this.viewId = viewId;
            return this;
        }

        private String compartmentId = null;

        /**
         * The OCID of the compartment the zone belongs to.
         * <p>
         * This parameter is deprecated and should be omitted.
         *
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
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
        public Builder copy(UpdateRRSetRequest o) {
            zoneNameOrId(o.getZoneNameOrId());
            domain(o.getDomain());
            rtype(o.getRtype());
            updateRRSetDetails(o.getUpdateRRSetDetails());
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
         * Build the instance of UpdateRRSetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateRRSetRequest
         */
        public UpdateRRSetRequest build() {
            UpdateRRSetRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dns.model.UpdateRRSetDetails body) {
            updateRRSetDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateRRSetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateRRSetRequest
         */
        public UpdateRRSetRequest buildWithoutInvocationCallback() {
            UpdateRRSetRequest request = new UpdateRRSetRequest();
            request.zoneNameOrId = zoneNameOrId;
            request.domain = domain;
            request.rtype = rtype;
            request.updateRRSetDetails = updateRRSetDetails;
            request.ifMatch = ifMatch;
            request.ifUnmodifiedSince = ifUnmodifiedSince;
            request.opcRequestId = opcRequestId;
            request.scope = scope;
            request.viewId = viewId;
            request.compartmentId = compartmentId;
            return request;
            // new UpdateRRSetRequest(zoneNameOrId, domain, rtype, updateRRSetDetails, ifMatch, ifUnmodifiedSince, opcRequestId, scope, viewId, compartmentId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .zoneNameOrId(zoneNameOrId)
                .domain(domain)
                .rtype(rtype)
                .updateRRSetDetails(updateRRSetDetails)
                .ifMatch(ifMatch)
                .ifUnmodifiedSince(ifUnmodifiedSince)
                .opcRequestId(opcRequestId)
                .scope(scope)
                .viewId(viewId)
                .compartmentId(compartmentId);
    }

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
        sb.append(",updateRRSetDetails=").append(String.valueOf(this.updateRRSetDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",ifUnmodifiedSince=").append(String.valueOf(this.ifUnmodifiedSince));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(",viewId=").append(String.valueOf(this.viewId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRRSetRequest)) {
            return false;
        }

        UpdateRRSetRequest other = (UpdateRRSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.zoneNameOrId, other.zoneNameOrId)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.rtype, other.rtype)
                && java.util.Objects.equals(this.updateRRSetDetails, other.updateRRSetDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.ifUnmodifiedSince, other.ifUnmodifiedSince)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.viewId, other.viewId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.zoneNameOrId == null ? 43 : this.zoneNameOrId.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.rtype == null ? 43 : this.rtype.hashCode());
        result =
                (result * PRIME)
                        + (this.updateRRSetDetails == null
                                ? 43
                                : this.updateRRSetDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.ifUnmodifiedSince == null ? 43 : this.ifUnmodifiedSince.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.viewId == null ? 43 : this.viewId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        return result;
    }
}
