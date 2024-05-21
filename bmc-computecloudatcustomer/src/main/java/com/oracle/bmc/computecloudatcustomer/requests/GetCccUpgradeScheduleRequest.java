/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.requests;

import com.oracle.bmc.computecloudatcustomer.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/computecloudatcustomer/GetCccUpgradeScheduleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetCccUpgradeScheduleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
public class GetCccUpgradeScheduleRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Compute Cloud@Customer upgrade schedule
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private String cccUpgradeScheduleId;

    /**
     * Compute Cloud@Customer upgrade schedule
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    public String getCccUpgradeScheduleId() {
        return cccUpgradeScheduleId;
    }
    /**
     * The client request [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for tracing.
     *
     */
    private String opcRequestId;

    /**
     * The client request [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for tracing.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetCccUpgradeScheduleRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Compute Cloud@Customer upgrade schedule
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         */
        private String cccUpgradeScheduleId = null;

        /**
         * Compute Cloud@Customer upgrade schedule
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param cccUpgradeScheduleId the value to set
         * @return this builder instance
         */
        public Builder cccUpgradeScheduleId(String cccUpgradeScheduleId) {
            this.cccUpgradeScheduleId = cccUpgradeScheduleId;
            return this;
        }

        /**
         * The client request [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for tracing.
         *
         */
        private String opcRequestId = null;

        /**
         * The client request [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for tracing.
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
        public Builder copy(GetCccUpgradeScheduleRequest o) {
            cccUpgradeScheduleId(o.getCccUpgradeScheduleId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCccUpgradeScheduleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetCccUpgradeScheduleRequest
         */
        public GetCccUpgradeScheduleRequest build() {
            GetCccUpgradeScheduleRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCccUpgradeScheduleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCccUpgradeScheduleRequest
         */
        public GetCccUpgradeScheduleRequest buildWithoutInvocationCallback() {
            GetCccUpgradeScheduleRequest request = new GetCccUpgradeScheduleRequest();
            request.cccUpgradeScheduleId = cccUpgradeScheduleId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetCccUpgradeScheduleRequest(cccUpgradeScheduleId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().cccUpgradeScheduleId(cccUpgradeScheduleId).opcRequestId(opcRequestId);
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
        sb.append(",cccUpgradeScheduleId=").append(String.valueOf(this.cccUpgradeScheduleId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCccUpgradeScheduleRequest)) {
            return false;
        }

        GetCccUpgradeScheduleRequest other = (GetCccUpgradeScheduleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cccUpgradeScheduleId, other.cccUpgradeScheduleId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cccUpgradeScheduleId == null
                                ? 43
                                : this.cccUpgradeScheduleId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
