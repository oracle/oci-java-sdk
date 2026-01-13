/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListVirtualCircuitPublicPrefixesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListVirtualCircuitPublicPrefixesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListVirtualCircuitPublicPrefixesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * virtual circuit.
     */
    private String virtualCircuitId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * virtual circuit.
     */
    public String getVirtualCircuitId() {
        return virtualCircuitId;
    }
    /**
     * A filter to only return resources that match the given verification state.
     *
     * <p>The state value is case-insensitive.
     */
    private com.oracle.bmc.core.model.VirtualCircuitPublicPrefix.VerificationState
            verificationState;

    /**
     * A filter to only return resources that match the given verification state.
     *
     * <p>The state value is case-insensitive.
     */
    public com.oracle.bmc.core.model.VirtualCircuitPublicPrefix.VerificationState
            getVerificationState() {
        return verificationState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListVirtualCircuitPublicPrefixesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * virtual circuit.
         */
        private String virtualCircuitId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * virtual circuit.
         *
         * @param virtualCircuitId the value to set
         * @return this builder instance
         */
        public Builder virtualCircuitId(String virtualCircuitId) {
            this.virtualCircuitId = virtualCircuitId;
            return this;
        }

        /**
         * A filter to only return resources that match the given verification state.
         *
         * <p>The state value is case-insensitive.
         */
        private com.oracle.bmc.core.model.VirtualCircuitPublicPrefix.VerificationState
                verificationState = null;

        /**
         * A filter to only return resources that match the given verification state.
         *
         * <p>The state value is case-insensitive.
         *
         * @param verificationState the value to set
         * @return this builder instance
         */
        public Builder verificationState(
                com.oracle.bmc.core.model.VirtualCircuitPublicPrefix.VerificationState
                        verificationState) {
            this.verificationState = verificationState;
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
        public Builder copy(ListVirtualCircuitPublicPrefixesRequest o) {
            virtualCircuitId(o.getVirtualCircuitId());
            verificationState(o.getVerificationState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListVirtualCircuitPublicPrefixesRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListVirtualCircuitPublicPrefixesRequest
         */
        public ListVirtualCircuitPublicPrefixesRequest build() {
            ListVirtualCircuitPublicPrefixesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListVirtualCircuitPublicPrefixesRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListVirtualCircuitPublicPrefixesRequest
         */
        public ListVirtualCircuitPublicPrefixesRequest buildWithoutInvocationCallback() {
            ListVirtualCircuitPublicPrefixesRequest request =
                    new ListVirtualCircuitPublicPrefixesRequest();
            request.virtualCircuitId = virtualCircuitId;
            request.verificationState = verificationState;
            return request;
            // new ListVirtualCircuitPublicPrefixesRequest(virtualCircuitId, verificationState);
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
                .verificationState(verificationState);
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
        sb.append(",verificationState=").append(String.valueOf(this.verificationState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListVirtualCircuitPublicPrefixesRequest)) {
            return false;
        }

        ListVirtualCircuitPublicPrefixesRequest other = (ListVirtualCircuitPublicPrefixesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.virtualCircuitId, other.virtualCircuitId)
                && java.util.Objects.equals(this.verificationState, other.verificationState);
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
                        + (this.verificationState == null ? 43 : this.verificationState.hashCode());
        return result;
    }
}
