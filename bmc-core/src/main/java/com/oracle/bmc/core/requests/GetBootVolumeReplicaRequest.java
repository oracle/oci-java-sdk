/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetBootVolumeReplicaExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetBootVolumeReplicaRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetBootVolumeReplicaRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the boot volume replica.
     */
    private String bootVolumeReplicaId;

    public String getBootVolumeReplicaId() {
        return bootVolumeReplicaId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetBootVolumeReplicaRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String bootVolumeReplicaId = null;

        /**
         * The OCID of the boot volume replica.
         * @return this builder instance
         */
        public Builder bootVolumeReplicaId(String bootVolumeReplicaId) {
            this.bootVolumeReplicaId = bootVolumeReplicaId;
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
        public Builder copy(GetBootVolumeReplicaRequest o) {
            bootVolumeReplicaId(o.getBootVolumeReplicaId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetBootVolumeReplicaRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetBootVolumeReplicaRequest
         */
        public GetBootVolumeReplicaRequest build() {
            GetBootVolumeReplicaRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetBootVolumeReplicaRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetBootVolumeReplicaRequest
         */
        public GetBootVolumeReplicaRequest buildWithoutInvocationCallback() {
            GetBootVolumeReplicaRequest request = new GetBootVolumeReplicaRequest();
            request.bootVolumeReplicaId = bootVolumeReplicaId;
            return request;
            // new GetBootVolumeReplicaRequest(bootVolumeReplicaId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder().bootVolumeReplicaId(bootVolumeReplicaId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",bootVolumeReplicaId=").append(String.valueOf(this.bootVolumeReplicaId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBootVolumeReplicaRequest)) {
            return false;
        }

        GetBootVolumeReplicaRequest other = (GetBootVolumeReplicaRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bootVolumeReplicaId, other.bootVolumeReplicaId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.bootVolumeReplicaId == null
                                ? 43
                                : this.bootVolumeReplicaId.hashCode());
        return result;
    }
}
