/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/DeleteChargebackPlanReportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DeleteChargebackPlanReportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class DeleteChargebackPlanReportRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Ops Insights chargeback plan report
     */
    private String chargebackPlanReportId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Ops Insights chargeback plan report
     */
    public String getChargebackPlanReportId() {
        return chargebackPlanReportId;
    }
    /**
     * Unique Ops insight identifier
     */
    private String id;

    /**
     * Unique Ops insight identifier
     */
    public String getId() {
        return id;
    }
    /**
     * Filter by resource type.
     * Supported values are EXADATA_INSIGHT , HOST_INSIGHT, DATABASE_INSIGHT.
     *
     */
    private String resourceType;

    /**
     * Filter by resource type.
     * Supported values are EXADATA_INSIGHT , HOST_INSIGHT, DATABASE_INSIGHT.
     *
     */
    public String getResourceType() {
        return resourceType;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteChargebackPlanReportRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Ops Insights chargeback plan report
         */
        private String chargebackPlanReportId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Ops Insights chargeback plan report
         * @param chargebackPlanReportId the value to set
         * @return this builder instance
         */
        public Builder chargebackPlanReportId(String chargebackPlanReportId) {
            this.chargebackPlanReportId = chargebackPlanReportId;
            return this;
        }

        /**
         * Unique Ops insight identifier
         */
        private String id = null;

        /**
         * Unique Ops insight identifier
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Filter by resource type.
         * Supported values are EXADATA_INSIGHT , HOST_INSIGHT, DATABASE_INSIGHT.
         *
         */
        private String resourceType = null;

        /**
         * Filter by resource type.
         * Supported values are EXADATA_INSIGHT , HOST_INSIGHT, DATABASE_INSIGHT.
         *
         * @param resourceType the value to set
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(DeleteChargebackPlanReportRequest o) {
            chargebackPlanReportId(o.getChargebackPlanReportId());
            id(o.getId());
            resourceType(o.getResourceType());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteChargebackPlanReportRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DeleteChargebackPlanReportRequest
         */
        public DeleteChargebackPlanReportRequest build() {
            DeleteChargebackPlanReportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteChargebackPlanReportRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteChargebackPlanReportRequest
         */
        public DeleteChargebackPlanReportRequest buildWithoutInvocationCallback() {
            DeleteChargebackPlanReportRequest request = new DeleteChargebackPlanReportRequest();
            request.chargebackPlanReportId = chargebackPlanReportId;
            request.id = id;
            request.resourceType = resourceType;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DeleteChargebackPlanReportRequest(chargebackPlanReportId, id, resourceType, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .chargebackPlanReportId(chargebackPlanReportId)
                .id(id)
                .resourceType(resourceType)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",chargebackPlanReportId=").append(String.valueOf(this.chargebackPlanReportId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteChargebackPlanReportRequest)) {
            return false;
        }

        DeleteChargebackPlanReportRequest other = (DeleteChargebackPlanReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.chargebackPlanReportId, other.chargebackPlanReportId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.chargebackPlanReportId == null
                                ? 43
                                : this.chargebackPlanReportId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
