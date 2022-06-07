/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/BulkDeleteVirtualCircuitPublicPrefixesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use BulkDeleteVirtualCircuitPublicPrefixesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class BulkDeleteVirtualCircuitPublicPrefixesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.BulkDeleteVirtualCircuitPublicPrefixesDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the virtual circuit.
     */
    private String virtualCircuitId;

    public String getVirtualCircuitId() {
        return virtualCircuitId;
    }
    /**
     * Request with public prefixes to be deleted from the virtual circuit.
     */
    private com.oracle.bmc.core.model.BulkDeleteVirtualCircuitPublicPrefixesDetails
            bulkDeleteVirtualCircuitPublicPrefixesDetails;

    public com.oracle.bmc.core.model.BulkDeleteVirtualCircuitPublicPrefixesDetails
            getBulkDeleteVirtualCircuitPublicPrefixesDetails() {
        return bulkDeleteVirtualCircuitPublicPrefixesDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.BulkDeleteVirtualCircuitPublicPrefixesDetails getBody$() {
        return bulkDeleteVirtualCircuitPublicPrefixesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkDeleteVirtualCircuitPublicPrefixesRequest,
                    com.oracle.bmc.core.model.BulkDeleteVirtualCircuitPublicPrefixesDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String virtualCircuitId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the virtual circuit.
         * @return this builder instance
         */
        public Builder virtualCircuitId(String virtualCircuitId) {
            this.virtualCircuitId = virtualCircuitId;
            return this;
        }

        private com.oracle.bmc.core.model.BulkDeleteVirtualCircuitPublicPrefixesDetails
                bulkDeleteVirtualCircuitPublicPrefixesDetails = null;

        /**
         * Request with public prefixes to be deleted from the virtual circuit.
         * @return this builder instance
         */
        public Builder bulkDeleteVirtualCircuitPublicPrefixesDetails(
                com.oracle.bmc.core.model.BulkDeleteVirtualCircuitPublicPrefixesDetails
                        bulkDeleteVirtualCircuitPublicPrefixesDetails) {
            this.bulkDeleteVirtualCircuitPublicPrefixesDetails =
                    bulkDeleteVirtualCircuitPublicPrefixesDetails;
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
        public Builder copy(BulkDeleteVirtualCircuitPublicPrefixesRequest o) {
            virtualCircuitId(o.getVirtualCircuitId());
            bulkDeleteVirtualCircuitPublicPrefixesDetails(
                    o.getBulkDeleteVirtualCircuitPublicPrefixesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkDeleteVirtualCircuitPublicPrefixesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of BulkDeleteVirtualCircuitPublicPrefixesRequest
         */
        public BulkDeleteVirtualCircuitPublicPrefixesRequest build() {
            BulkDeleteVirtualCircuitPublicPrefixesRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.core.model.BulkDeleteVirtualCircuitPublicPrefixesDetails body) {
            bulkDeleteVirtualCircuitPublicPrefixesDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkDeleteVirtualCircuitPublicPrefixesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkDeleteVirtualCircuitPublicPrefixesRequest
         */
        public BulkDeleteVirtualCircuitPublicPrefixesRequest buildWithoutInvocationCallback() {
            BulkDeleteVirtualCircuitPublicPrefixesRequest request =
                    new BulkDeleteVirtualCircuitPublicPrefixesRequest();
            request.virtualCircuitId = virtualCircuitId;
            request.bulkDeleteVirtualCircuitPublicPrefixesDetails =
                    bulkDeleteVirtualCircuitPublicPrefixesDetails;
            return request;
            // new BulkDeleteVirtualCircuitPublicPrefixesRequest(virtualCircuitId, bulkDeleteVirtualCircuitPublicPrefixesDetails);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .virtualCircuitId(virtualCircuitId)
                .bulkDeleteVirtualCircuitPublicPrefixesDetails(
                        bulkDeleteVirtualCircuitPublicPrefixesDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",virtualCircuitId=").append(String.valueOf(this.virtualCircuitId));
        sb.append(",bulkDeleteVirtualCircuitPublicPrefixesDetails=")
                .append(String.valueOf(this.bulkDeleteVirtualCircuitPublicPrefixesDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkDeleteVirtualCircuitPublicPrefixesRequest)) {
            return false;
        }

        BulkDeleteVirtualCircuitPublicPrefixesRequest other =
                (BulkDeleteVirtualCircuitPublicPrefixesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.virtualCircuitId, other.virtualCircuitId)
                && java.util.Objects.equals(
                        this.bulkDeleteVirtualCircuitPublicPrefixesDetails,
                        other.bulkDeleteVirtualCircuitPublicPrefixesDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.virtualCircuitId == null ? 43 : this.virtualCircuitId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkDeleteVirtualCircuitPublicPrefixesDetails == null
                                ? 43
                                : this.bulkDeleteVirtualCircuitPublicPrefixesDetails.hashCode());
        return result;
    }
}
