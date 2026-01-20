/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.globallydistributeddatabase.requests;

import com.oracle.bmc.globallydistributeddatabase.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/globallydistributeddatabase/GetShardedDatabaseExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetShardedDatabaseRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230301")
public class GetShardedDatabaseRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Sharded Database identifier */
    private String shardedDatabaseId;

    /** Sharded Database identifier */
    public String getShardedDatabaseId() {
        return shardedDatabaseId;
    }
    /**
     * Comma separated names of argument corresponding to which metadata need to be retrived, namely
     * VM_CLUSTER_INFO, ADDITIONAL_RESOURCE_INFO. An example is
     * metadata=VM_CLUSTER_INFO,ADDITIONAL_RESOURCE_INFO.
     */
    private String metadata;

    /**
     * Comma separated names of argument corresponding to which metadata need to be retrived, namely
     * VM_CLUSTER_INFO, ADDITIONAL_RESOURCE_INFO. An example is
     * metadata=VM_CLUSTER_INFO,ADDITIONAL_RESOURCE_INFO.
     */
    public String getMetadata() {
        return metadata;
    }
    /**
     * For conditional requests. In the GET call for a resource, set the {@code If-None-Match}
     * header to the value of the ETag from a previous GET (or POST or PUT) response for that
     * resource. The server will return with either a 304 Not Modified response if the resource has
     * not changed, or a 200 OK response with the updated representation.
     */
    private String ifNoneMatch;

    /**
     * For conditional requests. In the GET call for a resource, set the {@code If-None-Match}
     * header to the value of the ETag from a previous GET (or POST or PUT) response for that
     * resource. The server will return with either a 304 Not Modified response if the resource has
     * not changed, or a 200 OK response with the updated representation.
     */
    public String getIfNoneMatch() {
        return ifNoneMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetShardedDatabaseRequest, java.lang.Void> {
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

        /**
         * Comma separated names of argument corresponding to which metadata need to be retrived,
         * namely VM_CLUSTER_INFO, ADDITIONAL_RESOURCE_INFO. An example is
         * metadata=VM_CLUSTER_INFO,ADDITIONAL_RESOURCE_INFO.
         */
        private String metadata = null;

        /**
         * Comma separated names of argument corresponding to which metadata need to be retrived,
         * namely VM_CLUSTER_INFO, ADDITIONAL_RESOURCE_INFO. An example is
         * metadata=VM_CLUSTER_INFO,ADDITIONAL_RESOURCE_INFO.
         *
         * @param metadata the value to set
         * @return this builder instance
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * For conditional requests. In the GET call for a resource, set the {@code If-None-Match}
         * header to the value of the ETag from a previous GET (or POST or PUT) response for that
         * resource. The server will return with either a 304 Not Modified response if the resource
         * has not changed, or a 200 OK response with the updated representation.
         */
        private String ifNoneMatch = null;

        /**
         * For conditional requests. In the GET call for a resource, set the {@code If-None-Match}
         * header to the value of the ETag from a previous GET (or POST or PUT) response for that
         * resource. The server will return with either a 304 Not Modified response if the resource
         * has not changed, or a 200 OK response with the updated representation.
         *
         * @param ifNoneMatch the value to set
         * @return this builder instance
         */
        public Builder ifNoneMatch(String ifNoneMatch) {
            this.ifNoneMatch = ifNoneMatch;
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
        public Builder copy(GetShardedDatabaseRequest o) {
            shardedDatabaseId(o.getShardedDatabaseId());
            metadata(o.getMetadata());
            ifNoneMatch(o.getIfNoneMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetShardedDatabaseRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetShardedDatabaseRequest
         */
        public GetShardedDatabaseRequest build() {
            GetShardedDatabaseRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetShardedDatabaseRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetShardedDatabaseRequest
         */
        public GetShardedDatabaseRequest buildWithoutInvocationCallback() {
            GetShardedDatabaseRequest request = new GetShardedDatabaseRequest();
            request.shardedDatabaseId = shardedDatabaseId;
            request.metadata = metadata;
            request.ifNoneMatch = ifNoneMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetShardedDatabaseRequest(shardedDatabaseId, metadata, ifNoneMatch,
            // opcRequestId);
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
                .metadata(metadata)
                .ifNoneMatch(ifNoneMatch)
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
        sb.append(",metadata=").append(String.valueOf(this.metadata));
        sb.append(",ifNoneMatch=").append(String.valueOf(this.ifNoneMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetShardedDatabaseRequest)) {
            return false;
        }

        GetShardedDatabaseRequest other = (GetShardedDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.shardedDatabaseId, other.shardedDatabaseId)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.ifNoneMatch, other.ifNoneMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.shardedDatabaseId == null ? 43 : this.shardedDatabaseId.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.ifNoneMatch == null ? 43 : this.ifNoneMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
