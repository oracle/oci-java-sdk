/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.responses;

import com.oracle.bmc.loadbalancer.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class GetLoadBalancerResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Reflects the current version of the load balancer and the resources it contains. The value
     * only changes when the load balancer or an associated resource is created, updated, or delete
     *
     * <p>For optimistic concurrency control. See {@code if-match}.
     */
    private String eTag;

    /**
     * Reflects the current version of the load balancer and the resources it contains. The value
     * only changes when the load balancer or an associated resource is created, updated, or delete
     *
     * <p>For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getETag() {
        return eTag;
    }

    /** The returned {@code LoadBalancer} instance. */
    private com.oracle.bmc.loadbalancer.model.LoadBalancer loadBalancer;

    /**
     * The returned {@code LoadBalancer} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.loadbalancer.model.LoadBalancer getLoadBalancer() {
        return loadBalancer;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "eTag",
        "loadBalancer"
    })
    private GetLoadBalancerResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String eTag,
            com.oracle.bmc.loadbalancer.model.LoadBalancer loadBalancer) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.loadBalancer = loadBalancer;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetLoadBalancerResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Reflects the current version of the load balancer and the resources it contains. The
         * value only changes when the load balancer or an associated resource is created, updated,
         * or delete
         *
         * <p>For optimistic concurrency control. See {@code if-match}.
         */
        private String eTag;

        /**
         * Reflects the current version of the load balancer and the resources it contains. The
         * value only changes when the load balancer or an associated resource is created, updated,
         * or delete
         *
         * <p>For optimistic concurrency control. See {@code if-match}.
         *
         * @param eTag the value to set
         * @return this builder
         */
        public Builder eTag(String eTag) {
            this.eTag = eTag;
            return this;
        }

        /** The returned {@code LoadBalancer} instance. */
        private com.oracle.bmc.loadbalancer.model.LoadBalancer loadBalancer;

        /**
         * The returned {@code LoadBalancer} instance.
         *
         * @param loadBalancer the value to set
         * @return this builder
         */
        public Builder loadBalancer(com.oracle.bmc.loadbalancer.model.LoadBalancer loadBalancer) {
            this.loadBalancer = loadBalancer;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetLoadBalancerResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            loadBalancer(o.getLoadBalancer());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetLoadBalancerResponse build() {
            return new GetLoadBalancerResponse(
                    __httpStatusCode__, headers, opcRequestId, eTag, loadBalancer);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",eTag=").append(String.valueOf(eTag));
        sb.append(",loadBalancer=").append(String.valueOf(loadBalancer));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetLoadBalancerResponse)) {
            return false;
        }

        GetLoadBalancerResponse other = (GetLoadBalancerResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.loadBalancer, other.loadBalancer);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result = (result * PRIME) + (this.loadBalancer == null ? 43 : this.loadBalancer.hashCode());
        return result;
    }
}
