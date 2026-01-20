/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetInstancePoolLoadBalancerAttachmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetInstancePoolLoadBalancerAttachmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetInstancePoolLoadBalancerAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool.
     */
    private String instancePoolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool.
     */
    public String getInstancePoolId() {
        return instancePoolId;
    }
    /** The OCID of the load balancer attachment. */
    private String instancePoolLoadBalancerAttachmentId;

    /** The OCID of the load balancer attachment. */
    public String getInstancePoolLoadBalancerAttachmentId() {
        return instancePoolLoadBalancerAttachmentId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetInstancePoolLoadBalancerAttachmentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool.
         */
        private String instancePoolId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool.
         *
         * @param instancePoolId the value to set
         * @return this builder instance
         */
        public Builder instancePoolId(String instancePoolId) {
            this.instancePoolId = instancePoolId;
            return this;
        }

        /** The OCID of the load balancer attachment. */
        private String instancePoolLoadBalancerAttachmentId = null;

        /**
         * The OCID of the load balancer attachment.
         *
         * @param instancePoolLoadBalancerAttachmentId the value to set
         * @return this builder instance
         */
        public Builder instancePoolLoadBalancerAttachmentId(
                String instancePoolLoadBalancerAttachmentId) {
            this.instancePoolLoadBalancerAttachmentId = instancePoolLoadBalancerAttachmentId;
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
        public Builder copy(GetInstancePoolLoadBalancerAttachmentRequest o) {
            instancePoolId(o.getInstancePoolId());
            instancePoolLoadBalancerAttachmentId(o.getInstancePoolLoadBalancerAttachmentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetInstancePoolLoadBalancerAttachmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetInstancePoolLoadBalancerAttachmentRequest
         */
        public GetInstancePoolLoadBalancerAttachmentRequest build() {
            GetInstancePoolLoadBalancerAttachmentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetInstancePoolLoadBalancerAttachmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetInstancePoolLoadBalancerAttachmentRequest
         */
        public GetInstancePoolLoadBalancerAttachmentRequest buildWithoutInvocationCallback() {
            GetInstancePoolLoadBalancerAttachmentRequest request =
                    new GetInstancePoolLoadBalancerAttachmentRequest();
            request.instancePoolId = instancePoolId;
            request.instancePoolLoadBalancerAttachmentId = instancePoolLoadBalancerAttachmentId;
            return request;
            // new GetInstancePoolLoadBalancerAttachmentRequest(instancePoolId,
            // instancePoolLoadBalancerAttachmentId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .instancePoolId(instancePoolId)
                .instancePoolLoadBalancerAttachmentId(instancePoolLoadBalancerAttachmentId);
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
        sb.append(",instancePoolId=").append(String.valueOf(this.instancePoolId));
        sb.append(",instancePoolLoadBalancerAttachmentId=")
                .append(String.valueOf(this.instancePoolLoadBalancerAttachmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetInstancePoolLoadBalancerAttachmentRequest)) {
            return false;
        }

        GetInstancePoolLoadBalancerAttachmentRequest other =
                (GetInstancePoolLoadBalancerAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.instancePoolId, other.instancePoolId)
                && java.util.Objects.equals(
                        this.instancePoolLoadBalancerAttachmentId,
                        other.instancePoolLoadBalancerAttachmentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.instancePoolId == null ? 43 : this.instancePoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.instancePoolLoadBalancerAttachmentId == null
                                ? 43
                                : this.instancePoolLoadBalancerAttachmentId.hashCode());
        return result;
    }
}
