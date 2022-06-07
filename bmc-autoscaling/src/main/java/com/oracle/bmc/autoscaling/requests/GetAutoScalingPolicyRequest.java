/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.autoscaling.requests;

import com.oracle.bmc.autoscaling.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/autoscaling/GetAutoScalingPolicyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAutoScalingPolicyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class GetAutoScalingPolicyRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
     */
    private String autoScalingConfigurationId;

    public String getAutoScalingConfigurationId() {
        return autoScalingConfigurationId;
    }
    /**
     * The ID of the autoscaling policy.
     */
    private String autoScalingPolicyId;

    public String getAutoScalingPolicyId() {
        return autoScalingPolicyId;
    }
    /**
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAutoScalingPolicyRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String autoScalingConfigurationId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the autoscaling configuration.
         * @return this builder instance
         */
        public Builder autoScalingConfigurationId(String autoScalingConfigurationId) {
            this.autoScalingConfigurationId = autoScalingConfigurationId;
            return this;
        }

        private String autoScalingPolicyId = null;

        /**
         * The ID of the autoscaling policy.
         * @return this builder instance
         */
        public Builder autoScalingPolicyId(String autoScalingPolicyId) {
            this.autoScalingPolicyId = autoScalingPolicyId;
            return this;
        }

        private String opcRequestId = null;

        /**
         *
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
        public Builder copy(GetAutoScalingPolicyRequest o) {
            autoScalingConfigurationId(o.getAutoScalingConfigurationId());
            autoScalingPolicyId(o.getAutoScalingPolicyId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAutoScalingPolicyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAutoScalingPolicyRequest
         */
        public GetAutoScalingPolicyRequest build() {
            GetAutoScalingPolicyRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAutoScalingPolicyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAutoScalingPolicyRequest
         */
        public GetAutoScalingPolicyRequest buildWithoutInvocationCallback() {
            GetAutoScalingPolicyRequest request = new GetAutoScalingPolicyRequest();
            request.autoScalingConfigurationId = autoScalingConfigurationId;
            request.autoScalingPolicyId = autoScalingPolicyId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetAutoScalingPolicyRequest(autoScalingConfigurationId, autoScalingPolicyId, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .autoScalingConfigurationId(autoScalingConfigurationId)
                .autoScalingPolicyId(autoScalingPolicyId)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",autoScalingConfigurationId=")
                .append(String.valueOf(this.autoScalingConfigurationId));
        sb.append(",autoScalingPolicyId=").append(String.valueOf(this.autoScalingPolicyId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAutoScalingPolicyRequest)) {
            return false;
        }

        GetAutoScalingPolicyRequest other = (GetAutoScalingPolicyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autoScalingConfigurationId, other.autoScalingConfigurationId)
                && java.util.Objects.equals(this.autoScalingPolicyId, other.autoScalingPolicyId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autoScalingConfigurationId == null
                                ? 43
                                : this.autoScalingConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.autoScalingPolicyId == null
                                ? 43
                                : this.autoScalingPolicyId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
