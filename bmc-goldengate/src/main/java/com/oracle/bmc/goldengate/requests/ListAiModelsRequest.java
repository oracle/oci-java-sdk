/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/ListAiModelsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAiModelsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class ListAiModelsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped
     * to the same compartment as the resource the work request affects. If the work request concerns
     * multiple resources, and those resources are not in the same compartment, it is up to the service team
     * to pick the primary resource whose compartment should be used.
     *
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped
     * to the same compartment as the resource the work request affects. If the work request concerns
     * multiple resources, and those resources are not in the same compartment, it is up to the service team
     * to pick the primary resource whose compartment should be used.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The AI provider type for which model information is requested.
     *
     */
    private com.oracle.bmc.goldengate.model.AiProviderSummary.ProviderType providerType;

    /**
     * The AI provider type for which model information is requested.
     *
     */
    public com.oracle.bmc.goldengate.model.AiProviderSummary.ProviderType getProviderType() {
        return providerType;
    }
    /**
     * OCI region identifier, for example us-ashburn-1.
     *
     */
    private String region;

    /**
     * OCI region identifier, for example us-ashburn-1.
     *
     */
    public String getRegion() {
        return region;
    }
    /**
     * OCI tenancy OCID to use when resolving provider models, for example for
     * OCI Generative AI model discovery across a specific tenancy.
     *
     */
    private String tenancyId;

    /**
     * OCI tenancy OCID to use when resolving provider models, for example for
     * OCI Generative AI model discovery across a specific tenancy.
     *
     */
    public String getTenancyId() {
        return tenancyId;
    }
    /**
     * The client request ID for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAiModelsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment that contains the work request. Work requests should be scoped
         * to the same compartment as the resource the work request affects. If the work request concerns
         * multiple resources, and those resources are not in the same compartment, it is up to the service team
         * to pick the primary resource whose compartment should be used.
         *
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the work request. Work requests should be scoped
         * to the same compartment as the resource the work request affects. If the work request concerns
         * multiple resources, and those resources are not in the same compartment, it is up to the service team
         * to pick the primary resource whose compartment should be used.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The AI provider type for which model information is requested.
         *
         */
        private com.oracle.bmc.goldengate.model.AiProviderSummary.ProviderType providerType = null;

        /**
         * The AI provider type for which model information is requested.
         *
         * @param providerType the value to set
         * @return this builder instance
         */
        public Builder providerType(
                com.oracle.bmc.goldengate.model.AiProviderSummary.ProviderType providerType) {
            this.providerType = providerType;
            return this;
        }

        /**
         * OCI region identifier, for example us-ashburn-1.
         *
         */
        private String region = null;

        /**
         * OCI region identifier, for example us-ashburn-1.
         *
         * @param region the value to set
         * @return this builder instance
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * OCI tenancy OCID to use when resolving provider models, for example for
         * OCI Generative AI model discovery across a specific tenancy.
         *
         */
        private String tenancyId = null;

        /**
         * OCI tenancy OCID to use when resolving provider models, for example for
         * OCI Generative AI model discovery across a specific tenancy.
         *
         * @param tenancyId the value to set
         * @return this builder instance
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            return this;
        }

        /**
         * The client request ID for tracing.
         *
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListAiModelsRequest o) {
            compartmentId(o.getCompartmentId());
            providerType(o.getProviderType());
            region(o.getRegion());
            tenancyId(o.getTenancyId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAiModelsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAiModelsRequest
         */
        public ListAiModelsRequest build() {
            ListAiModelsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAiModelsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAiModelsRequest
         */
        public ListAiModelsRequest buildWithoutInvocationCallback() {
            ListAiModelsRequest request = new ListAiModelsRequest();
            request.compartmentId = compartmentId;
            request.providerType = providerType;
            request.region = region;
            request.tenancyId = tenancyId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAiModelsRequest(compartmentId, providerType, region, tenancyId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .providerType(providerType)
                .region(region)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",providerType=").append(String.valueOf(this.providerType));
        sb.append(",region=").append(String.valueOf(this.region));
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
        if (!(o instanceof ListAiModelsRequest)) {
            return false;
        }

        ListAiModelsRequest other = (ListAiModelsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.providerType, other.providerType)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.providerType == null ? 43 : this.providerType.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
