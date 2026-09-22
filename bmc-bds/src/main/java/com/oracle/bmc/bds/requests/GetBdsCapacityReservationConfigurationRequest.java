/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.requests;

import com.oracle.bmc.bds.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/GetBdsCapacityReservationConfigurationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetBdsCapacityReservationConfigurationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class GetBdsCapacityReservationConfigurationRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the cluster.
     */
    private String bdsInstanceId;

    /**
     * The OCID of the cluster.
     */
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }
    /**
     * The OCID of the BDS capacity reservation configuration.
     */
    private String bdsCapacityReservationConfigurationId;

    /**
     * The OCID of the BDS capacity reservation configuration.
     */
    public String getBdsCapacityReservationConfigurationId() {
        return bdsCapacityReservationConfigurationId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetBdsCapacityReservationConfigurationRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the cluster.
         */
        private String bdsInstanceId = null;

        /**
         * The OCID of the cluster.
         * @param bdsInstanceId the value to set
         * @return this builder instance
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /**
         * The OCID of the BDS capacity reservation configuration.
         */
        private String bdsCapacityReservationConfigurationId = null;

        /**
         * The OCID of the BDS capacity reservation configuration.
         * @param bdsCapacityReservationConfigurationId the value to set
         * @return this builder instance
         */
        public Builder bdsCapacityReservationConfigurationId(
                String bdsCapacityReservationConfigurationId) {
            this.bdsCapacityReservationConfigurationId = bdsCapacityReservationConfigurationId;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(GetBdsCapacityReservationConfigurationRequest o) {
            bdsInstanceId(o.getBdsInstanceId());
            bdsCapacityReservationConfigurationId(o.getBdsCapacityReservationConfigurationId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetBdsCapacityReservationConfigurationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetBdsCapacityReservationConfigurationRequest
         */
        public GetBdsCapacityReservationConfigurationRequest build() {
            GetBdsCapacityReservationConfigurationRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetBdsCapacityReservationConfigurationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetBdsCapacityReservationConfigurationRequest
         */
        public GetBdsCapacityReservationConfigurationRequest buildWithoutInvocationCallback() {
            GetBdsCapacityReservationConfigurationRequest request =
                    new GetBdsCapacityReservationConfigurationRequest();
            request.bdsInstanceId = bdsInstanceId;
            request.bdsCapacityReservationConfigurationId = bdsCapacityReservationConfigurationId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetBdsCapacityReservationConfigurationRequest(bdsInstanceId, bdsCapacityReservationConfigurationId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bdsInstanceId(bdsInstanceId)
                .bdsCapacityReservationConfigurationId(bdsCapacityReservationConfigurationId)
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
        sb.append(",bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(",bdsCapacityReservationConfigurationId=")
                .append(String.valueOf(this.bdsCapacityReservationConfigurationId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBdsCapacityReservationConfigurationRequest)) {
            return false;
        }

        GetBdsCapacityReservationConfigurationRequest other =
                (GetBdsCapacityReservationConfigurationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(
                        this.bdsCapacityReservationConfigurationId,
                        other.bdsCapacityReservationConfigurationId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.bdsCapacityReservationConfigurationId == null
                                ? 43
                                : this.bdsCapacityReservationConfigurationId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
