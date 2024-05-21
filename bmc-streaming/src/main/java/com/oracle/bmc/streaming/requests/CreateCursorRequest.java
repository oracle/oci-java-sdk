/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.requests;

import com.oracle.bmc.streaming.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/CreateCursorExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateCursorRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class CreateCursorRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.streaming.model.CreateCursorDetails> {

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
     * The information used to create the cursor.
     */
    private com.oracle.bmc.streaming.model.CreateCursorDetails createCursorDetails;

    /**
     * The information used to create the cursor.
     */
    public com.oracle.bmc.streaming.model.CreateCursorDetails getCreateCursorDetails() {
        return createCursorDetails;
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

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.streaming.model.CreateCursorDetails getBody$() {
        return createCursorDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateCursorRequest, com.oracle.bmc.streaming.model.CreateCursorDetails> {
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
         * The information used to create the cursor.
         */
        private com.oracle.bmc.streaming.model.CreateCursorDetails createCursorDetails = null;

        /**
         * The information used to create the cursor.
         * @param createCursorDetails the value to set
         * @return this builder instance
         */
        public Builder createCursorDetails(
                com.oracle.bmc.streaming.model.CreateCursorDetails createCursorDetails) {
            this.createCursorDetails = createCursorDetails;
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
        public Builder copy(CreateCursorRequest o) {
            streamId(o.getStreamId());
            createCursorDetails(o.getCreateCursorDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateCursorRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateCursorRequest
         */
        public CreateCursorRequest build() {
            CreateCursorRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.streaming.model.CreateCursorDetails body) {
            createCursorDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateCursorRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateCursorRequest
         */
        public CreateCursorRequest buildWithoutInvocationCallback() {
            CreateCursorRequest request = new CreateCursorRequest();
            request.streamId = streamId;
            request.createCursorDetails = createCursorDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new CreateCursorRequest(streamId, createCursorDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .streamId(streamId)
                .createCursorDetails(createCursorDetails)
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
        sb.append(",createCursorDetails=").append(String.valueOf(this.createCursorDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCursorRequest)) {
            return false;
        }

        CreateCursorRequest other = (CreateCursorRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.streamId, other.streamId)
                && java.util.Objects.equals(this.createCursorDetails, other.createCursorDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.streamId == null ? 43 : this.streamId.hashCode());
        result =
                (result * PRIME)
                        + (this.createCursorDetails == null
                                ? 43
                                : this.createCursorDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
