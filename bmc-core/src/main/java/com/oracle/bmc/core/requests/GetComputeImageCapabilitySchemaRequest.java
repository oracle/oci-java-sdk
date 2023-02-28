/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/GetComputeImageCapabilitySchemaExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetComputeImageCapabilitySchemaRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetComputeImageCapabilitySchemaRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The id of the compute image capability schema or the image ocid */
    private String computeImageCapabilitySchemaId;

    /** The id of the compute image capability schema or the image ocid */
    public String getComputeImageCapabilitySchemaId() {
        return computeImageCapabilitySchemaId;
    }
    /** Merge the image capability schema with the global image capability schema */
    private Boolean isMergeEnabled;

    /** Merge the image capability schema with the global image capability schema */
    public Boolean getIsMergeEnabled() {
        return isMergeEnabled;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetComputeImageCapabilitySchemaRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The id of the compute image capability schema or the image ocid */
        private String computeImageCapabilitySchemaId = null;

        /**
         * The id of the compute image capability schema or the image ocid
         *
         * @param computeImageCapabilitySchemaId the value to set
         * @return this builder instance
         */
        public Builder computeImageCapabilitySchemaId(String computeImageCapabilitySchemaId) {
            this.computeImageCapabilitySchemaId = computeImageCapabilitySchemaId;
            return this;
        }

        /** Merge the image capability schema with the global image capability schema */
        private Boolean isMergeEnabled = null;

        /**
         * Merge the image capability schema with the global image capability schema
         *
         * @param isMergeEnabled the value to set
         * @return this builder instance
         */
        public Builder isMergeEnabled(Boolean isMergeEnabled) {
            this.isMergeEnabled = isMergeEnabled;
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
        public Builder copy(GetComputeImageCapabilitySchemaRequest o) {
            computeImageCapabilitySchemaId(o.getComputeImageCapabilitySchemaId());
            isMergeEnabled(o.getIsMergeEnabled());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetComputeImageCapabilitySchemaRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetComputeImageCapabilitySchemaRequest
         */
        public GetComputeImageCapabilitySchemaRequest build() {
            GetComputeImageCapabilitySchemaRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetComputeImageCapabilitySchemaRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetComputeImageCapabilitySchemaRequest
         */
        public GetComputeImageCapabilitySchemaRequest buildWithoutInvocationCallback() {
            GetComputeImageCapabilitySchemaRequest request =
                    new GetComputeImageCapabilitySchemaRequest();
            request.computeImageCapabilitySchemaId = computeImageCapabilitySchemaId;
            request.isMergeEnabled = isMergeEnabled;
            return request;
            // new GetComputeImageCapabilitySchemaRequest(computeImageCapabilitySchemaId,
            // isMergeEnabled);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .computeImageCapabilitySchemaId(computeImageCapabilitySchemaId)
                .isMergeEnabled(isMergeEnabled);
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
        sb.append(",computeImageCapabilitySchemaId=")
                .append(String.valueOf(this.computeImageCapabilitySchemaId));
        sb.append(",isMergeEnabled=").append(String.valueOf(this.isMergeEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetComputeImageCapabilitySchemaRequest)) {
            return false;
        }

        GetComputeImageCapabilitySchemaRequest other = (GetComputeImageCapabilitySchemaRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.computeImageCapabilitySchemaId, other.computeImageCapabilitySchemaId)
                && java.util.Objects.equals(this.isMergeEnabled, other.isMergeEnabled);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeImageCapabilitySchemaId == null
                                ? 43
                                : this.computeImageCapabilitySchemaId.hashCode());
        result =
                (result * PRIME)
                        + (this.isMergeEnabled == null ? 43 : this.isMergeEnabled.hashCode());
        return result;
    }
}
