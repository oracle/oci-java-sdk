/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudVmClusterUpdateExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetCloudVmClusterUpdateRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetCloudVmClusterUpdateRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The cloud VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String cloudVmClusterId;

    /**
     * The cloud VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getCloudVmClusterId() {
        return cloudVmClusterId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
     */
    private String updateId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
     */
    public String getUpdateId() {
        return updateId;
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
                    GetCloudVmClusterUpdateRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The cloud VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String cloudVmClusterId = null;

        /**
         * The cloud VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param cloudVmClusterId the value to set
         * @return this builder instance
         */
        public Builder cloudVmClusterId(String cloudVmClusterId) {
            this.cloudVmClusterId = cloudVmClusterId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
         */
        private String updateId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the maintenance update.
         * @param updateId the value to set
         * @return this builder instance
         */
        public Builder updateId(String updateId) {
            this.updateId = updateId;
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
        public Builder copy(GetCloudVmClusterUpdateRequest o) {
            cloudVmClusterId(o.getCloudVmClusterId());
            updateId(o.getUpdateId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCloudVmClusterUpdateRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetCloudVmClusterUpdateRequest
         */
        public GetCloudVmClusterUpdateRequest build() {
            GetCloudVmClusterUpdateRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCloudVmClusterUpdateRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCloudVmClusterUpdateRequest
         */
        public GetCloudVmClusterUpdateRequest buildWithoutInvocationCallback() {
            GetCloudVmClusterUpdateRequest request = new GetCloudVmClusterUpdateRequest();
            request.cloudVmClusterId = cloudVmClusterId;
            request.updateId = updateId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetCloudVmClusterUpdateRequest(cloudVmClusterId, updateId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cloudVmClusterId(cloudVmClusterId)
                .updateId(updateId)
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
        sb.append(",cloudVmClusterId=").append(String.valueOf(this.cloudVmClusterId));
        sb.append(",updateId=").append(String.valueOf(this.updateId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCloudVmClusterUpdateRequest)) {
            return false;
        }

        GetCloudVmClusterUpdateRequest other = (GetCloudVmClusterUpdateRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.cloudVmClusterId, other.cloudVmClusterId)
                && java.util.Objects.equals(this.updateId, other.updateId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cloudVmClusterId == null ? 43 : this.cloudVmClusterId.hashCode());
        result = (result * PRIME) + (this.updateId == null ? 43 : this.updateId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
