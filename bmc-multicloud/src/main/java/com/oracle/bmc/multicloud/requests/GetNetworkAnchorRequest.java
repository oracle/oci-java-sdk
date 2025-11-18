/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.requests;

import com.oracle.bmc.multicloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/multicloud/GetNetworkAnchorExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetNetworkAnchorRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class GetNetworkAnchorRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * NetworkAnchor.
     */
    private String networkAnchorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * NetworkAnchor.
     */
    public String getNetworkAnchorId() {
        return networkAnchorId;
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
    /** The Cloud Service Provider region. */
    private String externalLocation;

    /** The Cloud Service Provider region. */
    public String getExternalLocation() {
        return externalLocation;
    }
    /**
     * Whether to fetch and include the vcn display name, which may introduce additional latency.
     */
    private Boolean shouldFetchVcnName;

    /**
     * Whether to fetch and include the vcn display name, which may introduce additional latency.
     */
    public Boolean getShouldFetchVcnName() {
        return shouldFetchVcnName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetNetworkAnchorRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * NetworkAnchor.
         */
        private String networkAnchorId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * NetworkAnchor.
         *
         * @param networkAnchorId the value to set
         * @return this builder instance
         */
        public Builder networkAnchorId(String networkAnchorId) {
            this.networkAnchorId = networkAnchorId;
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

        /** The Cloud Service Provider region. */
        private String externalLocation = null;

        /**
         * The Cloud Service Provider region.
         *
         * @param externalLocation the value to set
         * @return this builder instance
         */
        public Builder externalLocation(String externalLocation) {
            this.externalLocation = externalLocation;
            return this;
        }

        /**
         * Whether to fetch and include the vcn display name, which may introduce additional
         * latency.
         */
        private Boolean shouldFetchVcnName = null;

        /**
         * Whether to fetch and include the vcn display name, which may introduce additional
         * latency.
         *
         * @param shouldFetchVcnName the value to set
         * @return this builder instance
         */
        public Builder shouldFetchVcnName(Boolean shouldFetchVcnName) {
            this.shouldFetchVcnName = shouldFetchVcnName;
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
        public Builder copy(GetNetworkAnchorRequest o) {
            networkAnchorId(o.getNetworkAnchorId());
            subscriptionServiceName(o.getSubscriptionServiceName());
            subscriptionId(o.getSubscriptionId());
            opcRequestId(o.getOpcRequestId());
            externalLocation(o.getExternalLocation());
            shouldFetchVcnName(o.getShouldFetchVcnName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetNetworkAnchorRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetNetworkAnchorRequest
         */
        public GetNetworkAnchorRequest build() {
            GetNetworkAnchorRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetNetworkAnchorRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetNetworkAnchorRequest
         */
        public GetNetworkAnchorRequest buildWithoutInvocationCallback() {
            GetNetworkAnchorRequest request = new GetNetworkAnchorRequest();
            request.networkAnchorId = networkAnchorId;
            request.subscriptionServiceName = subscriptionServiceName;
            request.subscriptionId = subscriptionId;
            request.opcRequestId = opcRequestId;
            request.externalLocation = externalLocation;
            request.shouldFetchVcnName = shouldFetchVcnName;
            return request;
            // new GetNetworkAnchorRequest(networkAnchorId, subscriptionServiceName, subscriptionId,
            // opcRequestId, externalLocation, shouldFetchVcnName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .networkAnchorId(networkAnchorId)
                .subscriptionServiceName(subscriptionServiceName)
                .subscriptionId(subscriptionId)
                .opcRequestId(opcRequestId)
                .externalLocation(externalLocation)
                .shouldFetchVcnName(shouldFetchVcnName);
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
        sb.append(",networkAnchorId=").append(String.valueOf(this.networkAnchorId));
        sb.append(",subscriptionServiceName=").append(String.valueOf(this.subscriptionServiceName));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",externalLocation=").append(String.valueOf(this.externalLocation));
        sb.append(",shouldFetchVcnName=").append(String.valueOf(this.shouldFetchVcnName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetNetworkAnchorRequest)) {
            return false;
        }

        GetNetworkAnchorRequest other = (GetNetworkAnchorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.networkAnchorId, other.networkAnchorId)
                && java.util.Objects.equals(
                        this.subscriptionServiceName, other.subscriptionServiceName)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.externalLocation, other.externalLocation)
                && java.util.Objects.equals(this.shouldFetchVcnName, other.shouldFetchVcnName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.networkAnchorId == null ? 43 : this.networkAnchorId.hashCode());
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
                        + (this.externalLocation == null ? 43 : this.externalLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldFetchVcnName == null
                                ? 43
                                : this.shouldFetchVcnName.hashCode());
        return result;
    }
}
