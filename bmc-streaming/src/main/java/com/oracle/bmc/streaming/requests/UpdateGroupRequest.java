/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.streaming.requests;

import com.oracle.bmc.streaming.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/streaming/UpdateGroupExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateGroupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
public class UpdateGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.streaming.model.UpdateGroupDetails> {

    /** The OCID of the stream. */
    private String streamId;

    /** The OCID of the stream. */
    public String getStreamId() {
        return streamId;
    }
    /** The name of the consumer group. */
    private String groupName;

    /** The name of the consumer group. */
    public String getGroupName() {
        return groupName;
    }
    /** The information used to modify the group. */
    private com.oracle.bmc.streaming.model.UpdateGroupDetails updateGroupDetails;

    /** The information used to modify the group. */
    public com.oracle.bmc.streaming.model.UpdateGroupDetails getUpdateGroupDetails() {
        return updateGroupDetails;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
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
    public com.oracle.bmc.streaming.model.UpdateGroupDetails getBody$() {
        return updateGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateGroupRequest, com.oracle.bmc.streaming.model.UpdateGroupDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the stream. */
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

        /** The name of the consumer group. */
        private String groupName = null;

        /**
         * The name of the consumer group.
         *
         * @param groupName the value to set
         * @return this builder instance
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /** The information used to modify the group. */
        private com.oracle.bmc.streaming.model.UpdateGroupDetails updateGroupDetails = null;

        /**
         * The information used to modify the group.
         *
         * @param updateGroupDetails the value to set
         * @return this builder instance
         */
        public Builder updateGroupDetails(
                com.oracle.bmc.streaming.model.UpdateGroupDetails updateGroupDetails) {
            this.updateGroupDetails = updateGroupDetails;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
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
        public Builder copy(UpdateGroupRequest o) {
            streamId(o.getStreamId());
            groupName(o.getGroupName());
            updateGroupDetails(o.getUpdateGroupDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateGroupRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateGroupRequest
         */
        public UpdateGroupRequest build() {
            UpdateGroupRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.streaming.model.UpdateGroupDetails body) {
            updateGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateGroupRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateGroupRequest
         */
        public UpdateGroupRequest buildWithoutInvocationCallback() {
            UpdateGroupRequest request = new UpdateGroupRequest();
            request.streamId = streamId;
            request.groupName = groupName;
            request.updateGroupDetails = updateGroupDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateGroupRequest(streamId, groupName, updateGroupDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .streamId(streamId)
                .groupName(groupName)
                .updateGroupDetails(updateGroupDetails)
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
        sb.append(",streamId=").append(String.valueOf(this.streamId));
        sb.append(",groupName=").append(String.valueOf(this.groupName));
        sb.append(",updateGroupDetails=").append(String.valueOf(this.updateGroupDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateGroupRequest)) {
            return false;
        }

        UpdateGroupRequest other = (UpdateGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.streamId, other.streamId)
                && java.util.Objects.equals(this.groupName, other.groupName)
                && java.util.Objects.equals(this.updateGroupDetails, other.updateGroupDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.streamId == null ? 43 : this.streamId.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result =
                (result * PRIME)
                        + (this.updateGroupDetails == null
                                ? 43
                                : this.updateGroupDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
