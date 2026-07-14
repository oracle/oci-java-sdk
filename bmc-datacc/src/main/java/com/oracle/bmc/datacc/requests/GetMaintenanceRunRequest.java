/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/GetMaintenanceRunExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMaintenanceRunRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class GetMaintenanceRunRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The maintenance run OCID. */
    private String maintenanceRunId;

    /** The maintenance run OCID. */
    public String getMaintenanceRunId() {
        return maintenanceRunId;
    }
    /** The client request identifier. */
    private String opcRequestId;

    /** The client request identifier. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMaintenanceRunRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The maintenance run OCID. */
        private String maintenanceRunId = null;

        /**
         * The maintenance run OCID.
         *
         * @param maintenanceRunId the value to set
         * @return this builder instance
         */
        public Builder maintenanceRunId(String maintenanceRunId) {
            this.maintenanceRunId = maintenanceRunId;
            return this;
        }

        /** The client request identifier. */
        private String opcRequestId = null;

        /**
         * The client request identifier.
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
        public Builder copy(GetMaintenanceRunRequest o) {
            maintenanceRunId(o.getMaintenanceRunId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMaintenanceRunRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetMaintenanceRunRequest
         */
        public GetMaintenanceRunRequest build() {
            GetMaintenanceRunRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMaintenanceRunRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMaintenanceRunRequest
         */
        public GetMaintenanceRunRequest buildWithoutInvocationCallback() {
            GetMaintenanceRunRequest request = new GetMaintenanceRunRequest();
            request.maintenanceRunId = maintenanceRunId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetMaintenanceRunRequest(maintenanceRunId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().maintenanceRunId(maintenanceRunId).opcRequestId(opcRequestId);
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
        sb.append(",maintenanceRunId=").append(String.valueOf(this.maintenanceRunId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMaintenanceRunRequest)) {
            return false;
        }

        GetMaintenanceRunRequest other = (GetMaintenanceRunRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maintenanceRunId, other.maintenanceRunId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maintenanceRunId == null ? 43 : this.maintenanceRunId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
