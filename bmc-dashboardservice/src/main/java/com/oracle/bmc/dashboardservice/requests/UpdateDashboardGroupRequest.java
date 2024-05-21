/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice.requests;

import com.oracle.bmc.dashboardservice.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/UpdateDashboardGroupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateDashboardGroupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
public class UpdateDashboardGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dashboardservice.model.UpdateDashboardGroupDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dashboard group.
     */
    private String dashboardGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dashboard group.
     */
    public String getDashboardGroupId() {
        return dashboardGroupId;
    }
    /**
     * The dashboard group details to be updated.
     */
    private com.oracle.bmc.dashboardservice.model.UpdateDashboardGroupDetails
            updateDashboardGroupDetails;

    /**
     * The dashboard group details to be updated.
     */
    public com.oracle.bmc.dashboardservice.model.UpdateDashboardGroupDetails
            getUpdateDashboardGroupDetails() {
        return updateDashboardGroupDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * To identify if the call is cross-regional. In CRUD calls for a resource, to
     * identify that the call originates from different region, set the
     * {@code CrossRegionIdentifierHeader} parameter to a region name (ex - {@code US-ASHBURN-1})
     * The call will be served from a Replicated bucket.
     * For same-region calls, the value is unassigned.
     *
     */
    private String opcCrossRegion;

    /**
     * To identify if the call is cross-regional. In CRUD calls for a resource, to
     * identify that the call originates from different region, set the
     * {@code CrossRegionIdentifierHeader} parameter to a region name (ex - {@code US-ASHBURN-1})
     * The call will be served from a Replicated bucket.
     * For same-region calls, the value is unassigned.
     *
     */
    public String getOpcCrossRegion() {
        return opcCrossRegion;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dashboardservice.model.UpdateDashboardGroupDetails getBody$() {
        return updateDashboardGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateDashboardGroupRequest,
                    com.oracle.bmc.dashboardservice.model.UpdateDashboardGroupDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dashboard group.
         */
        private String dashboardGroupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dashboard group.
         * @param dashboardGroupId the value to set
         * @return this builder instance
         */
        public Builder dashboardGroupId(String dashboardGroupId) {
            this.dashboardGroupId = dashboardGroupId;
            return this;
        }

        /**
         * The dashboard group details to be updated.
         */
        private com.oracle.bmc.dashboardservice.model.UpdateDashboardGroupDetails
                updateDashboardGroupDetails = null;

        /**
         * The dashboard group details to be updated.
         * @param updateDashboardGroupDetails the value to set
         * @return this builder instance
         */
        public Builder updateDashboardGroupDetails(
                com.oracle.bmc.dashboardservice.model.UpdateDashboardGroupDetails
                        updateDashboardGroupDetails) {
            this.updateDashboardGroupDetails = updateDashboardGroupDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * To identify if the call is cross-regional. In CRUD calls for a resource, to
         * identify that the call originates from different region, set the
         * {@code CrossRegionIdentifierHeader} parameter to a region name (ex - {@code US-ASHBURN-1})
         * The call will be served from a Replicated bucket.
         * For same-region calls, the value is unassigned.
         *
         */
        private String opcCrossRegion = null;

        /**
         * To identify if the call is cross-regional. In CRUD calls for a resource, to
         * identify that the call originates from different region, set the
         * {@code CrossRegionIdentifierHeader} parameter to a region name (ex - {@code US-ASHBURN-1})
         * The call will be served from a Replicated bucket.
         * For same-region calls, the value is unassigned.
         *
         * @param opcCrossRegion the value to set
         * @return this builder instance
         */
        public Builder opcCrossRegion(String opcCrossRegion) {
            this.opcCrossRegion = opcCrossRegion;
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
        public Builder copy(UpdateDashboardGroupRequest o) {
            dashboardGroupId(o.getDashboardGroupId());
            updateDashboardGroupDetails(o.getUpdateDashboardGroupDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcCrossRegion(o.getOpcCrossRegion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateDashboardGroupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateDashboardGroupRequest
         */
        public UpdateDashboardGroupRequest build() {
            UpdateDashboardGroupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(
                com.oracle.bmc.dashboardservice.model.UpdateDashboardGroupDetails body) {
            updateDashboardGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateDashboardGroupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateDashboardGroupRequest
         */
        public UpdateDashboardGroupRequest buildWithoutInvocationCallback() {
            UpdateDashboardGroupRequest request = new UpdateDashboardGroupRequest();
            request.dashboardGroupId = dashboardGroupId;
            request.updateDashboardGroupDetails = updateDashboardGroupDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcCrossRegion = opcCrossRegion;
            return request;
            // new UpdateDashboardGroupRequest(dashboardGroupId, updateDashboardGroupDetails, ifMatch, opcRequestId, opcCrossRegion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dashboardGroupId(dashboardGroupId)
                .updateDashboardGroupDetails(updateDashboardGroupDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcCrossRegion(opcCrossRegion);
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
        sb.append(",dashboardGroupId=").append(String.valueOf(this.dashboardGroupId));
        sb.append(",updateDashboardGroupDetails=")
                .append(String.valueOf(this.updateDashboardGroupDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcCrossRegion=").append(String.valueOf(this.opcCrossRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDashboardGroupRequest)) {
            return false;
        }

        UpdateDashboardGroupRequest other = (UpdateDashboardGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dashboardGroupId, other.dashboardGroupId)
                && java.util.Objects.equals(
                        this.updateDashboardGroupDetails, other.updateDashboardGroupDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcCrossRegion, other.opcCrossRegion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dashboardGroupId == null ? 43 : this.dashboardGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateDashboardGroupDetails == null
                                ? 43
                                : this.updateDashboardGroupDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcCrossRegion == null ? 43 : this.opcCrossRegion.hashCode());
        return result;
    }
}
