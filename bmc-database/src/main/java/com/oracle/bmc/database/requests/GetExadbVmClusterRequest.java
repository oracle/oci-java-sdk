/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadbVmClusterExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetExadbVmClusterRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetExadbVmClusterRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Exadata VM cluster
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) on Exascale
     * Infrastructure.
     */
    private String exadbVmClusterId;

    /**
     * The Exadata VM cluster
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) on Exascale
     * Infrastructure.
     */
    public String getExadbVmClusterId() {
        return exadbVmClusterId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetExadbVmClusterRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Exadata VM cluster
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) on
         * Exascale Infrastructure.
         */
        private String exadbVmClusterId = null;

        /**
         * The Exadata VM cluster
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) on
         * Exascale Infrastructure.
         *
         * @param exadbVmClusterId the value to set
         * @return this builder instance
         */
        public Builder exadbVmClusterId(String exadbVmClusterId) {
            this.exadbVmClusterId = exadbVmClusterId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(GetExadbVmClusterRequest o) {
            exadbVmClusterId(o.getExadbVmClusterId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetExadbVmClusterRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetExadbVmClusterRequest
         */
        public GetExadbVmClusterRequest build() {
            GetExadbVmClusterRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetExadbVmClusterRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetExadbVmClusterRequest
         */
        public GetExadbVmClusterRequest buildWithoutInvocationCallback() {
            GetExadbVmClusterRequest request = new GetExadbVmClusterRequest();
            request.exadbVmClusterId = exadbVmClusterId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetExadbVmClusterRequest(exadbVmClusterId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().exadbVmClusterId(exadbVmClusterId).opcRequestId(opcRequestId);
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
        sb.append(",exadbVmClusterId=").append(String.valueOf(this.exadbVmClusterId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetExadbVmClusterRequest)) {
            return false;
        }

        GetExadbVmClusterRequest other = (GetExadbVmClusterRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.exadbVmClusterId, other.exadbVmClusterId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exadbVmClusterId == null ? 43 : this.exadbVmClusterId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
