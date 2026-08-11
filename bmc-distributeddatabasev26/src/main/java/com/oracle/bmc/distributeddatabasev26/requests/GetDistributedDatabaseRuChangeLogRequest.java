/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.requests;

import com.oracle.bmc.distributeddatabasev26.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/distributeddatabasev26/GetDistributedDatabaseRuChangeLogExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDistributedDatabaseRuChangeLogRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
public class GetDistributedDatabaseRuChangeLogRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Globally distributed database identifier. */
    private String distributedDatabaseId;

    /** Globally distributed database identifier. */
    public String getDistributedDatabaseId() {
        return distributedDatabaseId;
    }
    /** The source shard name to filter RU change log entries. */
    private String sourceShardName;

    /** The source shard name to filter RU change log entries. */
    public String getSourceShardName() {
        return sourceShardName;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDistributedDatabaseRuChangeLogRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Globally distributed database identifier. */
        private String distributedDatabaseId = null;

        /**
         * Globally distributed database identifier.
         *
         * @param distributedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder distributedDatabaseId(String distributedDatabaseId) {
            this.distributedDatabaseId = distributedDatabaseId;
            return this;
        }

        /** The source shard name to filter RU change log entries. */
        private String sourceShardName = null;

        /**
         * The source shard name to filter RU change log entries.
         *
         * @param sourceShardName the value to set
         * @return this builder instance
         */
        public Builder sourceShardName(String sourceShardName) {
            this.sourceShardName = sourceShardName;
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
        public Builder copy(GetDistributedDatabaseRuChangeLogRequest o) {
            distributedDatabaseId(o.getDistributedDatabaseId());
            sourceShardName(o.getSourceShardName());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDistributedDatabaseRuChangeLogRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDistributedDatabaseRuChangeLogRequest
         */
        public GetDistributedDatabaseRuChangeLogRequest build() {
            GetDistributedDatabaseRuChangeLogRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDistributedDatabaseRuChangeLogRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDistributedDatabaseRuChangeLogRequest
         */
        public GetDistributedDatabaseRuChangeLogRequest buildWithoutInvocationCallback() {
            GetDistributedDatabaseRuChangeLogRequest request =
                    new GetDistributedDatabaseRuChangeLogRequest();
            request.distributedDatabaseId = distributedDatabaseId;
            request.sourceShardName = sourceShardName;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetDistributedDatabaseRuChangeLogRequest(distributedDatabaseId, sourceShardName,
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
                .distributedDatabaseId(distributedDatabaseId)
                .sourceShardName(sourceShardName)
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
        sb.append(",distributedDatabaseId=").append(String.valueOf(this.distributedDatabaseId));
        sb.append(",sourceShardName=").append(String.valueOf(this.sourceShardName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDistributedDatabaseRuChangeLogRequest)) {
            return false;
        }

        GetDistributedDatabaseRuChangeLogRequest other =
                (GetDistributedDatabaseRuChangeLogRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.distributedDatabaseId, other.distributedDatabaseId)
                && java.util.Objects.equals(this.sourceShardName, other.sourceShardName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.distributedDatabaseId == null
                                ? 43
                                : this.distributedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceShardName == null ? 43 : this.sourceShardName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
