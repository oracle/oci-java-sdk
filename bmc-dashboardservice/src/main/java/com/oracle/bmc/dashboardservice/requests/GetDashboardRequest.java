/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dashboardservice.requests;

import com.oracle.bmc.dashboardservice.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dashboardservice/GetDashboardExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetDashboardRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210731")
public class GetDashboardRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * dashboard.
     */
    private String dashboardId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * dashboard.
     */
    public String getDashboardId() {
        return dashboardId;
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
    /**
     * To identify if the call is cross-regional. In CRUD calls for a resource, to identify that the
     * call originates from different region, set the {@code CrossRegionIdentifierHeader} parameter
     * to a region name (ex - {@code US-ASHBURN-1}) The call will be served from a Replicated
     * bucket. For same-region calls, the value is unassigned.
     */
    private String opcCrossRegion;

    /**
     * To identify if the call is cross-regional. In CRUD calls for a resource, to identify that the
     * call originates from different region, set the {@code CrossRegionIdentifierHeader} parameter
     * to a region name (ex - {@code US-ASHBURN-1}) The call will be served from a Replicated
     * bucket. For same-region calls, the value is unassigned.
     */
    public String getOpcCrossRegion() {
        return opcCrossRegion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDashboardRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * dashboard.
         */
        private String dashboardId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * dashboard.
         *
         * @param dashboardId the value to set
         * @return this builder instance
         */
        public Builder dashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
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

        /**
         * To identify if the call is cross-regional. In CRUD calls for a resource, to identify that
         * the call originates from different region, set the {@code CrossRegionIdentifierHeader}
         * parameter to a region name (ex - {@code US-ASHBURN-1}) The call will be served from a
         * Replicated bucket. For same-region calls, the value is unassigned.
         */
        private String opcCrossRegion = null;

        /**
         * To identify if the call is cross-regional. In CRUD calls for a resource, to identify that
         * the call originates from different region, set the {@code CrossRegionIdentifierHeader}
         * parameter to a region name (ex - {@code US-ASHBURN-1}) The call will be served from a
         * Replicated bucket. For same-region calls, the value is unassigned.
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
        public Builder copy(GetDashboardRequest o) {
            dashboardId(o.getDashboardId());
            opcRequestId(o.getOpcRequestId());
            opcCrossRegion(o.getOpcCrossRegion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDashboardRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDashboardRequest
         */
        public GetDashboardRequest build() {
            GetDashboardRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDashboardRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDashboardRequest
         */
        public GetDashboardRequest buildWithoutInvocationCallback() {
            GetDashboardRequest request = new GetDashboardRequest();
            request.dashboardId = dashboardId;
            request.opcRequestId = opcRequestId;
            request.opcCrossRegion = opcCrossRegion;
            return request;
            // new GetDashboardRequest(dashboardId, opcRequestId, opcCrossRegion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dashboardId(dashboardId)
                .opcRequestId(opcRequestId)
                .opcCrossRegion(opcCrossRegion);
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
        sb.append(",dashboardId=").append(String.valueOf(this.dashboardId));
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
        if (!(o instanceof GetDashboardRequest)) {
            return false;
        }

        GetDashboardRequest other = (GetDashboardRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dashboardId, other.dashboardId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcCrossRegion, other.opcCrossRegion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dashboardId == null ? 43 : this.dashboardId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcCrossRegion == null ? 43 : this.opcCrossRegion.hashCode());
        return result;
    }
}
