/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.requests;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/GetOrganizationTenancyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetOrganizationTenancyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
public class GetOrganizationTenancyRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * OCID of the organization.
     */
    private String organizationId;

    /**
     * OCID of the organization.
     */
    public String getOrganizationId() {
        return organizationId;
    }
    /**
     * OCID of the tenancy to retrieve.
     */
    private String tenancyId;

    /**
     * OCID of the tenancy to retrieve.
     */
    public String getTenancyId() {
        return tenancyId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetOrganizationTenancyRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * OCID of the organization.
         */
        private String organizationId = null;

        /**
         * OCID of the organization.
         * @param organizationId the value to set
         * @return this builder instance
         */
        public Builder organizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        /**
         * OCID of the tenancy to retrieve.
         */
        private String tenancyId = null;

        /**
         * OCID of the tenancy to retrieve.
         * @param tenancyId the value to set
         * @return this builder instance
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(GetOrganizationTenancyRequest o) {
            organizationId(o.getOrganizationId());
            tenancyId(o.getTenancyId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetOrganizationTenancyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetOrganizationTenancyRequest
         */
        public GetOrganizationTenancyRequest build() {
            GetOrganizationTenancyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetOrganizationTenancyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetOrganizationTenancyRequest
         */
        public GetOrganizationTenancyRequest buildWithoutInvocationCallback() {
            GetOrganizationTenancyRequest request = new GetOrganizationTenancyRequest();
            request.organizationId = organizationId;
            request.tenancyId = tenancyId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetOrganizationTenancyRequest(organizationId, tenancyId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .organizationId(organizationId)
                .tenancyId(tenancyId)
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
        sb.append(",organizationId=").append(String.valueOf(this.organizationId));
        sb.append(",tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOrganizationTenancyRequest)) {
            return false;
        }

        GetOrganizationTenancyRequest other = (GetOrganizationTenancyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.organizationId, other.organizationId)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.organizationId == null ? 43 : this.organizationId.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
