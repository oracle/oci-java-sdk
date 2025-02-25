/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpdateScheduledTaskExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateScheduledTaskRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UpdateScheduledTaskRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.UpdateScheduledTaskDetails> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * Unique scheduledTask id returned from task create.
     * If invalid will lead to a 404 not found.
     *
     */
    private String scheduledTaskId;

    /**
     * Unique scheduledTask id returned from task create.
     * If invalid will lead to a 404 not found.
     *
     */
    public String getScheduledTaskId() {
        return scheduledTaskId;
    }
    /**
     * Update details.
     * Schedules may be updated only for taskType SAVED_SEARCH and PURGE.
     *
     */
    private com.oracle.bmc.loganalytics.model.UpdateScheduledTaskDetails updateScheduledTaskDetails;

    /**
     * Update details.
     * Schedules may be updated only for taskType SAVED_SEARCH and PURGE.
     *
     */
    public com.oracle.bmc.loganalytics.model.UpdateScheduledTaskDetails
            getUpdateScheduledTaskDetails() {
        return updateScheduledTaskDetails;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loganalytics.model.UpdateScheduledTaskDetails getBody$() {
        return updateScheduledTaskDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateScheduledTaskRequest,
                    com.oracle.bmc.loganalytics.model.UpdateScheduledTaskDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * Unique scheduledTask id returned from task create.
         * If invalid will lead to a 404 not found.
         *
         */
        private String scheduledTaskId = null;

        /**
         * Unique scheduledTask id returned from task create.
         * If invalid will lead to a 404 not found.
         *
         * @param scheduledTaskId the value to set
         * @return this builder instance
         */
        public Builder scheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }

        /**
         * Update details.
         * Schedules may be updated only for taskType SAVED_SEARCH and PURGE.
         *
         */
        private com.oracle.bmc.loganalytics.model.UpdateScheduledTaskDetails
                updateScheduledTaskDetails = null;

        /**
         * Update details.
         * Schedules may be updated only for taskType SAVED_SEARCH and PURGE.
         *
         * @param updateScheduledTaskDetails the value to set
         * @return this builder instance
         */
        public Builder updateScheduledTaskDetails(
                com.oracle.bmc.loganalytics.model.UpdateScheduledTaskDetails
                        updateScheduledTaskDetails) {
            this.updateScheduledTaskDetails = updateScheduledTaskDetails;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
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
        public Builder copy(UpdateScheduledTaskRequest o) {
            namespaceName(o.getNamespaceName());
            scheduledTaskId(o.getScheduledTaskId());
            updateScheduledTaskDetails(o.getUpdateScheduledTaskDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateScheduledTaskRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateScheduledTaskRequest
         */
        public UpdateScheduledTaskRequest build() {
            UpdateScheduledTaskRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.loganalytics.model.UpdateScheduledTaskDetails body) {
            updateScheduledTaskDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateScheduledTaskRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateScheduledTaskRequest
         */
        public UpdateScheduledTaskRequest buildWithoutInvocationCallback() {
            UpdateScheduledTaskRequest request = new UpdateScheduledTaskRequest();
            request.namespaceName = namespaceName;
            request.scheduledTaskId = scheduledTaskId;
            request.updateScheduledTaskDetails = updateScheduledTaskDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateScheduledTaskRequest(namespaceName, scheduledTaskId, updateScheduledTaskDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .scheduledTaskId(scheduledTaskId)
                .updateScheduledTaskDetails(updateScheduledTaskDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",scheduledTaskId=").append(String.valueOf(this.scheduledTaskId));
        sb.append(",updateScheduledTaskDetails=")
                .append(String.valueOf(this.updateScheduledTaskDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateScheduledTaskRequest)) {
            return false;
        }

        UpdateScheduledTaskRequest other = (UpdateScheduledTaskRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.scheduledTaskId, other.scheduledTaskId)
                && java.util.Objects.equals(
                        this.updateScheduledTaskDetails, other.updateScheduledTaskDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledTaskId == null ? 43 : this.scheduledTaskId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateScheduledTaskDetails == null
                                ? 43
                                : this.updateScheduledTaskDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
