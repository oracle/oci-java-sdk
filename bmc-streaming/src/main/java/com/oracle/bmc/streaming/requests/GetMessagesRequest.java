/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.requests;

import com.oracle.bmc.streaming.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/GetMessagesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMessagesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class GetMessagesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the stream.
     *
     */
    private String streamId;

    /**
     * The OCID of the stream.
     *
     */
    public String getStreamId() {
        return streamId;
    }
    /**
     * The cursor used to consume the stream.
     *
     */
    private String cursor;

    /**
     * The cursor used to consume the stream.
     *
     */
    public String getCursor() {
        return cursor;
    }
    /**
     * The maximum number of messages to return. You can specify any value up to 10000. By default, the service returns as many messages as possible.
     * Consider your average message size to help avoid exceeding throughput on the stream.
     *
     */
    private Integer limit;

    /**
     * The maximum number of messages to return. You can specify any value up to 10000. By default, the service returns as many messages as possible.
     * Consider your average message size to help avoid exceeding throughput on the stream.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMessagesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the stream.
         *
         */
        private String streamId = null;

        /**
         * The OCID of the stream.
         *
         * @param streamId the value to set
         * @return this builder instance
         */
        public Builder streamId(String streamId) {
            this.streamId = streamId;
            return this;
        }

        /**
         * The cursor used to consume the stream.
         *
         */
        private String cursor = null;

        /**
         * The cursor used to consume the stream.
         *
         * @param cursor the value to set
         * @return this builder instance
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * The maximum number of messages to return. You can specify any value up to 10000. By default, the service returns as many messages as possible.
         * Consider your average message size to help avoid exceeding throughput on the stream.
         *
         */
        private Integer limit = null;

        /**
         * The maximum number of messages to return. You can specify any value up to 10000. By default, the service returns as many messages as possible.
         * Consider your average message size to help avoid exceeding throughput on the stream.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(GetMessagesRequest o) {
            streamId(o.getStreamId());
            cursor(o.getCursor());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMessagesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetMessagesRequest
         */
        public GetMessagesRequest build() {
            GetMessagesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMessagesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMessagesRequest
         */
        public GetMessagesRequest buildWithoutInvocationCallback() {
            GetMessagesRequest request = new GetMessagesRequest();
            request.streamId = streamId;
            request.cursor = cursor;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetMessagesRequest(streamId, cursor, limit, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .streamId(streamId)
                .cursor(cursor)
                .limit(limit)
                .opcRequestId(opcRequestId);
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
        sb.append(",streamId=").append(String.valueOf(this.streamId));
        sb.append(",cursor=").append(String.valueOf(this.cursor));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMessagesRequest)) {
            return false;
        }

        GetMessagesRequest other = (GetMessagesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.streamId, other.streamId)
                && java.util.Objects.equals(this.cursor, other.cursor)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.streamId == null ? 43 : this.streamId.hashCode());
        result = (result * PRIME) + (this.cursor == null ? 43 : this.cursor.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
