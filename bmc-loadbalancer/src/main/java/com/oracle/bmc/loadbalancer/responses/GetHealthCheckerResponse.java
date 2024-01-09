/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.responses;

import com.oracle.bmc.loadbalancer.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
public class GetHealthCheckerResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code HealthChecker} instance. */
    private com.oracle.bmc.loadbalancer.model.HealthChecker healthChecker;

    /**
     * The returned {@code HealthChecker} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.loadbalancer.model.HealthChecker getHealthChecker() {
        return healthChecker;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "eTag",
        "healthChecker"
    })
    private GetHealthCheckerResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String eTag,
            com.oracle.bmc.loadbalancer.model.HealthChecker healthChecker) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.eTag = eTag;
        this.healthChecker = healthChecker;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetHealthCheckerResponse> {
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

        /** The returned {@code HealthChecker} instance. */
        private com.oracle.bmc.loadbalancer.model.HealthChecker healthChecker;

        /**
         * The returned {@code HealthChecker} instance.
         *
         * @param healthChecker the value to set
         * @return this builder
         */
        public Builder healthChecker(
                com.oracle.bmc.loadbalancer.model.HealthChecker healthChecker) {
            this.healthChecker = healthChecker;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetHealthCheckerResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            eTag(o.getETag());
            healthChecker(o.getHealthChecker());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetHealthCheckerResponse build() {
            return new GetHealthCheckerResponse(
                    __httpStatusCode__, headers, opcRequestId, eTag, healthChecker);
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
        sb.append(",healthChecker=").append(String.valueOf(healthChecker));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetHealthCheckerResponse)) {
            return false;
        }

        GetHealthCheckerResponse other = (GetHealthCheckerResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eTag, other.eTag)
                && java.util.Objects.equals(this.healthChecker, other.healthChecker);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eTag == null ? 43 : this.eTag.hashCode());
        result =
                (result * PRIME)
                        + (this.healthChecker == null ? 43 : this.healthChecker.hashCode());
        return result;
    }
}
