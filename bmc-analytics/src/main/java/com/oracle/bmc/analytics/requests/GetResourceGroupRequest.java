/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.requests;

import com.oracle.bmc.analytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/GetResourceGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetResourceGroupRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class GetResourceGroupRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the Analytics instance. */
    private String analyticsInstanceId;

    /** The OCID of the Analytics instance. */
    public String getAnalyticsInstanceId() {
        return analyticsInstanceId;
    }
    /** Specify unique id of a resource group within an Analytics instance. */
    private String analyticsInstanceResourceGroupId;

    /** Specify unique id of a resource group within an Analytics instance. */
    public String getAnalyticsInstanceResourceGroupId() {
        return analyticsInstanceResourceGroupId;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetResourceGroupRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Analytics instance. */
        private String analyticsInstanceId = null;

        /**
         * The OCID of the Analytics instance.
         *
         * @param analyticsInstanceId the value to set
         * @return this builder instance
         */
        public Builder analyticsInstanceId(String analyticsInstanceId) {
            this.analyticsInstanceId = analyticsInstanceId;
            return this;
        }

        /** Specify unique id of a resource group within an Analytics instance. */
        private String analyticsInstanceResourceGroupId = null;

        /**
         * Specify unique id of a resource group within an Analytics instance.
         *
         * @param analyticsInstanceResourceGroupId the value to set
         * @return this builder instance
         */
        public Builder analyticsInstanceResourceGroupId(String analyticsInstanceResourceGroupId) {
            this.analyticsInstanceResourceGroupId = analyticsInstanceResourceGroupId;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(GetResourceGroupRequest o) {
            analyticsInstanceId(o.getAnalyticsInstanceId());
            analyticsInstanceResourceGroupId(o.getAnalyticsInstanceResourceGroupId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetResourceGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetResourceGroupRequest
         */
        public GetResourceGroupRequest build() {
            GetResourceGroupRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetResourceGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetResourceGroupRequest
         */
        public GetResourceGroupRequest buildWithoutInvocationCallback() {
            GetResourceGroupRequest request = new GetResourceGroupRequest();
            request.analyticsInstanceId = analyticsInstanceId;
            request.analyticsInstanceResourceGroupId = analyticsInstanceResourceGroupId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetResourceGroupRequest(analyticsInstanceId, analyticsInstanceResourceGroupId,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .analyticsInstanceId(analyticsInstanceId)
                .analyticsInstanceResourceGroupId(analyticsInstanceResourceGroupId)
                .opcRequestId(opcRequestId);
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
        sb.append(",analyticsInstanceId=").append(String.valueOf(this.analyticsInstanceId));
        sb.append(",analyticsInstanceResourceGroupId=")
                .append(String.valueOf(this.analyticsInstanceResourceGroupId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetResourceGroupRequest)) {
            return false;
        }

        GetResourceGroupRequest other = (GetResourceGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.analyticsInstanceId, other.analyticsInstanceId)
                && java.util.Objects.equals(
                        this.analyticsInstanceResourceGroupId,
                        other.analyticsInstanceResourceGroupId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.analyticsInstanceId == null
                                ? 43
                                : this.analyticsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.analyticsInstanceResourceGroupId == null
                                ? 43
                                : this.analyticsInstanceResourceGroupId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
