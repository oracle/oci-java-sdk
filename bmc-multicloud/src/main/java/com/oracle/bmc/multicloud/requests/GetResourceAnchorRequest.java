/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.requests;

import com.oracle.bmc.multicloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/multicloud/GetResourceAnchorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetResourceAnchorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class GetResourceAnchorRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnchor.
     */
    private String resourceAnchorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnchor.
     */
    public String getResourceAnchorId() {
        return resourceAnchorId;
    }
    /** The subscription service name of the Cloud Service Provider. */
    private com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName;

    /** The subscription service name of the Cloud Service Provider. */
    public com.oracle.bmc.multicloud.model.SubscriptionType getSubscriptionServiceName() {
        return subscriptionServiceName;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud subscription in which to list resources.
     */
    private String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud subscription in which to list resources.
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Whether to fetch and include the compartment name, setting this field to yes may introduce
     * additional latency.
     */
    private Boolean shouldFetchCompartmentName;

    /**
     * Whether to fetch and include the compartment name, setting this field to yes may introduce
     * additional latency.
     */
    public Boolean getShouldFetchCompartmentName() {
        return shouldFetchCompartmentName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetResourceAnchorRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnchor.
         */
        private String resourceAnchorId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnchor.
         *
         * @param resourceAnchorId the value to set
         * @return this builder instance
         */
        public Builder resourceAnchorId(String resourceAnchorId) {
            this.resourceAnchorId = resourceAnchorId;
            return this;
        }

        /** The subscription service name of the Cloud Service Provider. */
        private com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName = null;

        /**
         * The subscription service name of the Cloud Service Provider.
         *
         * @param subscriptionServiceName the value to set
         * @return this builder instance
         */
        public Builder subscriptionServiceName(
                com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName) {
            this.subscriptionServiceName = subscriptionServiceName;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud subscription in which to list resources.
         */
        private String subscriptionId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud subscription in which to list resources.
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Whether to fetch and include the compartment name, setting this field to yes may
         * introduce additional latency.
         */
        private Boolean shouldFetchCompartmentName = null;

        /**
         * Whether to fetch and include the compartment name, setting this field to yes may
         * introduce additional latency.
         *
         * @param shouldFetchCompartmentName the value to set
         * @return this builder instance
         */
        public Builder shouldFetchCompartmentName(Boolean shouldFetchCompartmentName) {
            this.shouldFetchCompartmentName = shouldFetchCompartmentName;
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
        public Builder copy(GetResourceAnchorRequest o) {
            resourceAnchorId(o.getResourceAnchorId());
            subscriptionServiceName(o.getSubscriptionServiceName());
            subscriptionId(o.getSubscriptionId());
            opcRequestId(o.getOpcRequestId());
            shouldFetchCompartmentName(o.getShouldFetchCompartmentName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetResourceAnchorRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetResourceAnchorRequest
         */
        public GetResourceAnchorRequest build() {
            GetResourceAnchorRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetResourceAnchorRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetResourceAnchorRequest
         */
        public GetResourceAnchorRequest buildWithoutInvocationCallback() {
            GetResourceAnchorRequest request = new GetResourceAnchorRequest();
            request.resourceAnchorId = resourceAnchorId;
            request.subscriptionServiceName = subscriptionServiceName;
            request.subscriptionId = subscriptionId;
            request.opcRequestId = opcRequestId;
            request.shouldFetchCompartmentName = shouldFetchCompartmentName;
            return request;
            // new GetResourceAnchorRequest(resourceAnchorId, subscriptionServiceName,
            // subscriptionId, opcRequestId, shouldFetchCompartmentName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .resourceAnchorId(resourceAnchorId)
                .subscriptionServiceName(subscriptionServiceName)
                .subscriptionId(subscriptionId)
                .opcRequestId(opcRequestId)
                .shouldFetchCompartmentName(shouldFetchCompartmentName);
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
        sb.append(",resourceAnchorId=").append(String.valueOf(this.resourceAnchorId));
        sb.append(",subscriptionServiceName=").append(String.valueOf(this.subscriptionServiceName));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shouldFetchCompartmentName=")
                .append(String.valueOf(this.shouldFetchCompartmentName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetResourceAnchorRequest)) {
            return false;
        }

        GetResourceAnchorRequest other = (GetResourceAnchorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.resourceAnchorId, other.resourceAnchorId)
                && java.util.Objects.equals(
                        this.subscriptionServiceName, other.subscriptionServiceName)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.shouldFetchCompartmentName, other.shouldFetchCompartmentName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.resourceAnchorId == null ? 43 : this.resourceAnchorId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionServiceName == null
                                ? 43
                                : this.subscriptionServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldFetchCompartmentName == null
                                ? 43
                                : this.shouldFetchCompartmentName.hashCode());
        return result;
    }
}
