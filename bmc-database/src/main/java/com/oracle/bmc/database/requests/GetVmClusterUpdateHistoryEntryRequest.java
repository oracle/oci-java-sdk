/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetVmClusterUpdateHistoryEntryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetVmClusterUpdateHistoryEntryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetVmClusterUpdateHistoryEntryRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String vmClusterId;

    /**
     * The VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getVmClusterId() {
        return vmClusterId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance update history entry.
     */
    private String updateHistoryEntryId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance update history entry.
     */
    public String getUpdateHistoryEntryId() {
        return updateHistoryEntryId;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetVmClusterUpdateHistoryEntryRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String vmClusterId = null;

        /**
         * The VM cluster [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param vmClusterId the value to set
         * @return this builder instance
         */
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance update history entry.
         */
        private String updateHistoryEntryId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the maintenance update history entry.
         * @param updateHistoryEntryId the value to set
         * @return this builder instance
         */
        public Builder updateHistoryEntryId(String updateHistoryEntryId) {
            this.updateHistoryEntryId = updateHistoryEntryId;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
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
        public Builder copy(GetVmClusterUpdateHistoryEntryRequest o) {
            vmClusterId(o.getVmClusterId());
            updateHistoryEntryId(o.getUpdateHistoryEntryId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetVmClusterUpdateHistoryEntryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetVmClusterUpdateHistoryEntryRequest
         */
        public GetVmClusterUpdateHistoryEntryRequest build() {
            GetVmClusterUpdateHistoryEntryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetVmClusterUpdateHistoryEntryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetVmClusterUpdateHistoryEntryRequest
         */
        public GetVmClusterUpdateHistoryEntryRequest buildWithoutInvocationCallback() {
            GetVmClusterUpdateHistoryEntryRequest request =
                    new GetVmClusterUpdateHistoryEntryRequest();
            request.vmClusterId = vmClusterId;
            request.updateHistoryEntryId = updateHistoryEntryId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetVmClusterUpdateHistoryEntryRequest(vmClusterId, updateHistoryEntryId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .vmClusterId(vmClusterId)
                .updateHistoryEntryId(updateHistoryEntryId)
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
        sb.append(",vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(",updateHistoryEntryId=").append(String.valueOf(this.updateHistoryEntryId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetVmClusterUpdateHistoryEntryRequest)) {
            return false;
        }

        GetVmClusterUpdateHistoryEntryRequest other = (GetVmClusterUpdateHistoryEntryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.updateHistoryEntryId, other.updateHistoryEntryId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateHistoryEntryId == null
                                ? 43
                                : this.updateHistoryEntryId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
