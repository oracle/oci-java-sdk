/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice.requests;

import com.oracle.bmc.dashboardservice.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/CreateDashboardGroupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateDashboardGroupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
public class CreateDashboardGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails> {

    /**
     * Details about the dashboard group being created.
     */
    private com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails
            createDashboardGroupDetails;

    /**
     * Details about the dashboard group being created.
     */
    public com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails
            getCreateDashboardGroupDetails() {
        return createDashboardGroupDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server
     * error without risk of executing that same action again.
     * Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
     * (for example, if a resource has been deleted and purged from the system,
     * then a retry of the original creation request may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server
     * error without risk of executing that same action again.
     * Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
     * (for example, if a resource has been deleted and purged from the system,
     * then a retry of the original creation request may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    public com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails getBody$() {
        return createDashboardGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDashboardGroupRequest,
                    com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Details about the dashboard group being created.
         */
        private com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails
                createDashboardGroupDetails = null;

        /**
         * Details about the dashboard group being created.
         * @param createDashboardGroupDetails the value to set
         * @return this builder instance
         */
        public Builder createDashboardGroupDetails(
                com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails
                        createDashboardGroupDetails) {
            this.createDashboardGroupDetails = createDashboardGroupDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server
         * error without risk of executing that same action again.
         * Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
         * (for example, if a resource has been deleted and purged from the system,
         * then a retry of the original creation request may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server
         * error without risk of executing that same action again.
         * Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
         * (for example, if a resource has been deleted and purged from the system,
         * then a retry of the original creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CreateDashboardGroupRequest o) {
            createDashboardGroupDetails(o.getCreateDashboardGroupDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            opcCrossRegion(o.getOpcCrossRegion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDashboardGroupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateDashboardGroupRequest
         */
        public CreateDashboardGroupRequest build() {
            CreateDashboardGroupRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dashboardservice.model.CreateDashboardGroupDetails body) {
            createDashboardGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateDashboardGroupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateDashboardGroupRequest
         */
        public CreateDashboardGroupRequest buildWithoutInvocationCallback() {
            CreateDashboardGroupRequest request = new CreateDashboardGroupRequest();
            request.createDashboardGroupDetails = createDashboardGroupDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.opcCrossRegion = opcCrossRegion;
            return request;
            // new CreateDashboardGroupRequest(createDashboardGroupDetails, opcRetryToken, opcRequestId, opcCrossRegion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createDashboardGroupDetails(createDashboardGroupDetails)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",createDashboardGroupDetails=")
                .append(String.valueOf(this.createDashboardGroupDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
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
        if (!(o instanceof CreateDashboardGroupRequest)) {
            return false;
        }

        CreateDashboardGroupRequest other = (CreateDashboardGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createDashboardGroupDetails, other.createDashboardGroupDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcCrossRegion, other.opcCrossRegion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createDashboardGroupDetails == null
                                ? 43
                                : this.createDashboardGroupDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcCrossRegion == null ? 43 : this.opcCrossRegion.hashCode());
        return result;
    }
}
