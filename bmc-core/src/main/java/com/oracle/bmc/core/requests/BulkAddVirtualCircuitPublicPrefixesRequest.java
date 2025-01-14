/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/BulkAddVirtualCircuitPublicPrefixesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * BulkAddVirtualCircuitPublicPrefixesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class BulkAddVirtualCircuitPublicPrefixesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.BulkAddVirtualCircuitPublicPrefixesDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the virtual circuit.
     */
    private String virtualCircuitId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the virtual circuit.
     */
    public String getVirtualCircuitId() {
        return virtualCircuitId;
    }
    /** Request with publix prefixes to be added to the virtual circuit */
    private com.oracle.bmc.core.model.BulkAddVirtualCircuitPublicPrefixesDetails
            bulkAddVirtualCircuitPublicPrefixesDetails;

    /** Request with publix prefixes to be added to the virtual circuit */
    public com.oracle.bmc.core.model.BulkAddVirtualCircuitPublicPrefixesDetails
            getBulkAddVirtualCircuitPublicPrefixesDetails() {
        return bulkAddVirtualCircuitPublicPrefixesDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.BulkAddVirtualCircuitPublicPrefixesDetails getBody$() {
        return bulkAddVirtualCircuitPublicPrefixesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BulkAddVirtualCircuitPublicPrefixesRequest,
                    com.oracle.bmc.core.model.BulkAddVirtualCircuitPublicPrefixesDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the virtual circuit.
         */
        private String virtualCircuitId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the virtual circuit.
         *
         * @param virtualCircuitId the value to set
         * @return this builder instance
         */
        public Builder virtualCircuitId(String virtualCircuitId) {
            this.virtualCircuitId = virtualCircuitId;
            return this;
        }

        /** Request with publix prefixes to be added to the virtual circuit */
        private com.oracle.bmc.core.model.BulkAddVirtualCircuitPublicPrefixesDetails
                bulkAddVirtualCircuitPublicPrefixesDetails = null;

        /**
         * Request with publix prefixes to be added to the virtual circuit
         *
         * @param bulkAddVirtualCircuitPublicPrefixesDetails the value to set
         * @return this builder instance
         */
        public Builder bulkAddVirtualCircuitPublicPrefixesDetails(
                com.oracle.bmc.core.model.BulkAddVirtualCircuitPublicPrefixesDetails
                        bulkAddVirtualCircuitPublicPrefixesDetails) {
            this.bulkAddVirtualCircuitPublicPrefixesDetails =
                    bulkAddVirtualCircuitPublicPrefixesDetails;
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
        public Builder copy(BulkAddVirtualCircuitPublicPrefixesRequest o) {
            virtualCircuitId(o.getVirtualCircuitId());
            bulkAddVirtualCircuitPublicPrefixesDetails(
                    o.getBulkAddVirtualCircuitPublicPrefixesDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BulkAddVirtualCircuitPublicPrefixesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BulkAddVirtualCircuitPublicPrefixesRequest
         */
        public BulkAddVirtualCircuitPublicPrefixesRequest build() {
            BulkAddVirtualCircuitPublicPrefixesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.core.model.BulkAddVirtualCircuitPublicPrefixesDetails body) {
            bulkAddVirtualCircuitPublicPrefixesDetails(body);
            return this;
        }

        /**
         * Build the instance of BulkAddVirtualCircuitPublicPrefixesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BulkAddVirtualCircuitPublicPrefixesRequest
         */
        public BulkAddVirtualCircuitPublicPrefixesRequest buildWithoutInvocationCallback() {
            BulkAddVirtualCircuitPublicPrefixesRequest request =
                    new BulkAddVirtualCircuitPublicPrefixesRequest();
            request.virtualCircuitId = virtualCircuitId;
            request.bulkAddVirtualCircuitPublicPrefixesDetails =
                    bulkAddVirtualCircuitPublicPrefixesDetails;
            return request;
            // new BulkAddVirtualCircuitPublicPrefixesRequest(virtualCircuitId,
            // bulkAddVirtualCircuitPublicPrefixesDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .virtualCircuitId(virtualCircuitId)
                .bulkAddVirtualCircuitPublicPrefixesDetails(
                        bulkAddVirtualCircuitPublicPrefixesDetails);
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
        sb.append(",virtualCircuitId=").append(String.valueOf(this.virtualCircuitId));
        sb.append(",bulkAddVirtualCircuitPublicPrefixesDetails=")
                .append(String.valueOf(this.bulkAddVirtualCircuitPublicPrefixesDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkAddVirtualCircuitPublicPrefixesRequest)) {
            return false;
        }

        BulkAddVirtualCircuitPublicPrefixesRequest other =
                (BulkAddVirtualCircuitPublicPrefixesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.virtualCircuitId, other.virtualCircuitId)
                && java.util.Objects.equals(
                        this.bulkAddVirtualCircuitPublicPrefixesDetails,
                        other.bulkAddVirtualCircuitPublicPrefixesDetails);
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
                        + (this.bulkAddVirtualCircuitPublicPrefixesDetails == null
                                ? 43
                                : this.bulkAddVirtualCircuitPublicPrefixesDetails.hashCode());
        return result;
    }
}
