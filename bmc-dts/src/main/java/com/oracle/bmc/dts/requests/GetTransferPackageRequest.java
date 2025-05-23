/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.requests;

import com.oracle.bmc.dts.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dts/GetTransferPackageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetTransferPackageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class GetTransferPackageRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** ID of the Transfer Job */
    private String id;

    /** ID of the Transfer Job */
    public String getId() {
        return id;
    }
    /** Label of the Transfer Package */
    private String transferPackageLabel;

    /** Label of the Transfer Package */
    public String getTransferPackageLabel() {
        return transferPackageLabel;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetTransferPackageRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** ID of the Transfer Job */
        private String id = null;

        /**
         * ID of the Transfer Job
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** Label of the Transfer Package */
        private String transferPackageLabel = null;

        /**
         * Label of the Transfer Package
         *
         * @param transferPackageLabel the value to set
         * @return this builder instance
         */
        public Builder transferPackageLabel(String transferPackageLabel) {
            this.transferPackageLabel = transferPackageLabel;
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
        public Builder copy(GetTransferPackageRequest o) {
            id(o.getId());
            transferPackageLabel(o.getTransferPackageLabel());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTransferPackageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetTransferPackageRequest
         */
        public GetTransferPackageRequest build() {
            GetTransferPackageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTransferPackageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTransferPackageRequest
         */
        public GetTransferPackageRequest buildWithoutInvocationCallback() {
            GetTransferPackageRequest request = new GetTransferPackageRequest();
            request.id = id;
            request.transferPackageLabel = transferPackageLabel;
            return request;
            // new GetTransferPackageRequest(id, transferPackageLabel);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().id(id).transferPackageLabel(transferPackageLabel);
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
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",transferPackageLabel=").append(String.valueOf(this.transferPackageLabel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTransferPackageRequest)) {
            return false;
        }

        GetTransferPackageRequest other = (GetTransferPackageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.transferPackageLabel, other.transferPackageLabel);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.transferPackageLabel == null
                                ? 43
                                : this.transferPackageLabel.hashCode());
        return result;
    }
}
