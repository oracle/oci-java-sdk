/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.responses;

import com.oracle.bmc.networkloadbalancer.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class GetNetworkLoadBalancerHealthResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code NetworkLoadBalancerHealth} instance. */
    private com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealth
            networkLoadBalancerHealth;

    /**
     * The returned {@code NetworkLoadBalancerHealth} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealth
            getNetworkLoadBalancerHealth() {
        return networkLoadBalancerHealth;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "networkLoadBalancerHealth"
    })
    private GetNetworkLoadBalancerHealthResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealth
                    networkLoadBalancerHealth) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.networkLoadBalancerHealth = networkLoadBalancerHealth;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetNetworkLoadBalancerHealthResponse> {
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
         * Unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code NetworkLoadBalancerHealth} instance. */
        private com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealth
                networkLoadBalancerHealth;

        /**
         * The returned {@code NetworkLoadBalancerHealth} instance.
         *
         * @param networkLoadBalancerHealth the value to set
         * @return this builder
         */
        public Builder networkLoadBalancerHealth(
                com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealth
                        networkLoadBalancerHealth) {
            this.networkLoadBalancerHealth = networkLoadBalancerHealth;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetNetworkLoadBalancerHealthResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            networkLoadBalancerHealth(o.getNetworkLoadBalancerHealth());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetNetworkLoadBalancerHealthResponse build() {
            return new GetNetworkLoadBalancerHealthResponse(
                    __httpStatusCode__, headers, opcRequestId, networkLoadBalancerHealth);
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
        sb.append(",networkLoadBalancerHealth=").append(String.valueOf(networkLoadBalancerHealth));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetNetworkLoadBalancerHealthResponse)) {
            return false;
        }

        GetNetworkLoadBalancerHealthResponse other = (GetNetworkLoadBalancerHealthResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.networkLoadBalancerHealth, other.networkLoadBalancerHealth);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkLoadBalancerHealth == null
                                ? 43
                                : this.networkLoadBalancerHealth.hashCode());
        return result;
    }
}
