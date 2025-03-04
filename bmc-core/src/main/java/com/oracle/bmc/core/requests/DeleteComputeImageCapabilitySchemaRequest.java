/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/DeleteComputeImageCapabilitySchemaExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * DeleteComputeImageCapabilitySchemaRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class DeleteComputeImageCapabilitySchemaRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The id of the compute image capability schema or the image ocid */
    private String computeImageCapabilitySchemaId;

    /** The id of the compute image capability schema or the image ocid */
    public String getComputeImageCapabilitySchemaId() {
        return computeImageCapabilitySchemaId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DeleteComputeImageCapabilitySchemaRequest, java.lang.Void> {
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

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(DeleteComputeImageCapabilitySchemaRequest o) {
            computeImageCapabilitySchemaId(o.getComputeImageCapabilitySchemaId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DeleteComputeImageCapabilitySchemaRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DeleteComputeImageCapabilitySchemaRequest
         */
        public DeleteComputeImageCapabilitySchemaRequest build() {
            DeleteComputeImageCapabilitySchemaRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DeleteComputeImageCapabilitySchemaRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DeleteComputeImageCapabilitySchemaRequest
         */
        public DeleteComputeImageCapabilitySchemaRequest buildWithoutInvocationCallback() {
            DeleteComputeImageCapabilitySchemaRequest request =
                    new DeleteComputeImageCapabilitySchemaRequest();
            request.computeImageCapabilitySchemaId = computeImageCapabilitySchemaId;
            request.ifMatch = ifMatch;
            return request;
            // new DeleteComputeImageCapabilitySchemaRequest(computeImageCapabilitySchemaId,
            // ifMatch);
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
                .ifMatch(ifMatch);
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
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteComputeImageCapabilitySchemaRequest)) {
            return false;
        }

        DeleteComputeImageCapabilitySchemaRequest other =
                (DeleteComputeImageCapabilitySchemaRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.computeImageCapabilitySchemaId, other.computeImageCapabilitySchemaId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
