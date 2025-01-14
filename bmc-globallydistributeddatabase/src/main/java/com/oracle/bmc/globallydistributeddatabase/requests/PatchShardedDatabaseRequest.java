/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.requests;

import com.oracle.bmc.globallydistributeddatabase.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/globallydistributeddatabase/PatchShardedDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use PatchShardedDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class PatchShardedDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.globallydistributeddatabase.model.PatchShardedDatabaseDetails> {

    /** Sharded Database identifier */
    private String shardedDatabaseId;

    /** Sharded Database identifier */
    public String getShardedDatabaseId() {
        return shardedDatabaseId;
    }
    /** The payload containing instructions to patch the sharded database. */
    private com.oracle.bmc.globallydistributeddatabase.model.PatchShardedDatabaseDetails
            patchShardedDatabaseDetails;

    /** The payload containing instructions to patch the sharded database. */
    public com.oracle.bmc.globallydistributeddatabase.model.PatchShardedDatabaseDetails
            getPatchShardedDatabaseDetails() {
        return patchShardedDatabaseDetails;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.globallydistributeddatabase.model.PatchShardedDatabaseDetails getBody$() {
        return patchShardedDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PatchShardedDatabaseRequest,
                    com.oracle.bmc.globallydistributeddatabase.model.PatchShardedDatabaseDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Sharded Database identifier */
        private String shardedDatabaseId = null;

        /**
         * Sharded Database identifier
         *
         * @param shardedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder shardedDatabaseId(String shardedDatabaseId) {
            this.shardedDatabaseId = shardedDatabaseId;
            return this;
        }

        /** The payload containing instructions to patch the sharded database. */
        private com.oracle.bmc.globallydistributeddatabase.model.PatchShardedDatabaseDetails
                patchShardedDatabaseDetails = null;

        /**
         * The payload containing instructions to patch the sharded database.
         *
         * @param patchShardedDatabaseDetails the value to set
         * @return this builder instance
         */
        public Builder patchShardedDatabaseDetails(
                com.oracle.bmc.globallydistributeddatabase.model.PatchShardedDatabaseDetails
                        patchShardedDatabaseDetails) {
            this.patchShardedDatabaseDetails = patchShardedDatabaseDetails;
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

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(PatchShardedDatabaseRequest o) {
            shardedDatabaseId(o.getShardedDatabaseId());
            patchShardedDatabaseDetails(o.getPatchShardedDatabaseDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PatchShardedDatabaseRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PatchShardedDatabaseRequest
         */
        public PatchShardedDatabaseRequest build() {
            PatchShardedDatabaseRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.globallydistributeddatabase.model.PatchShardedDatabaseDetails body) {
            patchShardedDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of PatchShardedDatabaseRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PatchShardedDatabaseRequest
         */
        public PatchShardedDatabaseRequest buildWithoutInvocationCallback() {
            PatchShardedDatabaseRequest request = new PatchShardedDatabaseRequest();
            request.shardedDatabaseId = shardedDatabaseId;
            request.patchShardedDatabaseDetails = patchShardedDatabaseDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new PatchShardedDatabaseRequest(shardedDatabaseId, patchShardedDatabaseDetails,
            // ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .shardedDatabaseId(shardedDatabaseId)
                .patchShardedDatabaseDetails(patchShardedDatabaseDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",shardedDatabaseId=").append(String.valueOf(this.shardedDatabaseId));
        sb.append(",patchShardedDatabaseDetails=")
                .append(String.valueOf(this.patchShardedDatabaseDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchShardedDatabaseRequest)) {
            return false;
        }

        PatchShardedDatabaseRequest other = (PatchShardedDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.shardedDatabaseId, other.shardedDatabaseId)
                && java.util.Objects.equals(
                        this.patchShardedDatabaseDetails, other.patchShardedDatabaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.shardedDatabaseId == null ? 43 : this.shardedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.patchShardedDatabaseDetails == null
                                ? 43
                                : this.patchShardedDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
