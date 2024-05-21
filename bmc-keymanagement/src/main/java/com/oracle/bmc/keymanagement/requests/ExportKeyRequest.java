/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.requests;

import com.oracle.bmc.keymanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ExportKeyExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ExportKeyRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class ExportKeyRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.keymanagement.model.ExportKeyDetails> {

    /**
     * ExportKeyDetails
     */
    private com.oracle.bmc.keymanagement.model.ExportKeyDetails exportKeyDetails;

    /**
     * ExportKeyDetails
     */
    public com.oracle.bmc.keymanagement.model.ExportKeyDetails getExportKeyDetails() {
        return exportKeyDetails;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.keymanagement.model.ExportKeyDetails getBody$() {
        return exportKeyDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ExportKeyRequest, com.oracle.bmc.keymanagement.model.ExportKeyDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * ExportKeyDetails
         */
        private com.oracle.bmc.keymanagement.model.ExportKeyDetails exportKeyDetails = null;

        /**
         * ExportKeyDetails
         * @param exportKeyDetails the value to set
         * @return this builder instance
         */
        public Builder exportKeyDetails(
                com.oracle.bmc.keymanagement.model.ExportKeyDetails exportKeyDetails) {
            this.exportKeyDetails = exportKeyDetails;
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
        public Builder copy(ExportKeyRequest o) {
            exportKeyDetails(o.getExportKeyDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ExportKeyRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ExportKeyRequest
         */
        public ExportKeyRequest build() {
            ExportKeyRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.keymanagement.model.ExportKeyDetails body) {
            exportKeyDetails(body);
            return this;
        }

        /**
         * Build the instance of ExportKeyRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ExportKeyRequest
         */
        public ExportKeyRequest buildWithoutInvocationCallback() {
            ExportKeyRequest request = new ExportKeyRequest();
            request.exportKeyDetails = exportKeyDetails;
            return request;
            // new ExportKeyRequest(exportKeyDetails);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder().exportKeyDetails(exportKeyDetails);
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
        sb.append(",exportKeyDetails=").append(String.valueOf(this.exportKeyDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportKeyRequest)) {
            return false;
        }

        ExportKeyRequest other = (ExportKeyRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.exportKeyDetails, other.exportKeyDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exportKeyDetails == null ? 43 : this.exportKeyDetails.hashCode());
        return result;
    }
}
