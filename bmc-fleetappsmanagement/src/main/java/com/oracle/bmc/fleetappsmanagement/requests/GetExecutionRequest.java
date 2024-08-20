/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/GetExecutionExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetExecutionRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class GetExecutionRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** unique SchedulerJob identifier */
    private String schedulerJobId;

    /** unique SchedulerJob identifier */
    public String getSchedulerJobId() {
        return schedulerJobId;
    }
    /** unique jobActivity identifier */
    private String jobActivityId;

    /** unique jobActivity identifier */
    public String getJobActivityId() {
        return jobActivityId;
    }
    /** unique Resource identifier */
    private String resourceId;

    /** unique Resource identifier */
    public String getResourceId() {
        return resourceId;
    }
    /** Execution Id */
    private String executionId;

    /** Execution Id */
    public String getExecutionId() {
        return executionId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetExecutionRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique SchedulerJob identifier */
        private String schedulerJobId = null;

        /**
         * unique SchedulerJob identifier
         *
         * @param schedulerJobId the value to set
         * @return this builder instance
         */
        public Builder schedulerJobId(String schedulerJobId) {
            this.schedulerJobId = schedulerJobId;
            return this;
        }

        /** unique jobActivity identifier */
        private String jobActivityId = null;

        /**
         * unique jobActivity identifier
         *
         * @param jobActivityId the value to set
         * @return this builder instance
         */
        public Builder jobActivityId(String jobActivityId) {
            this.jobActivityId = jobActivityId;
            return this;
        }

        /** unique Resource identifier */
        private String resourceId = null;

        /**
         * unique Resource identifier
         *
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /** Execution Id */
        private String executionId = null;

        /**
         * Execution Id
         *
         * @param executionId the value to set
         * @return this builder instance
         */
        public Builder executionId(String executionId) {
            this.executionId = executionId;
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
        public Builder copy(GetExecutionRequest o) {
            schedulerJobId(o.getSchedulerJobId());
            jobActivityId(o.getJobActivityId());
            resourceId(o.getResourceId());
            executionId(o.getExecutionId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetExecutionRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetExecutionRequest
         */
        public GetExecutionRequest build() {
            GetExecutionRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetExecutionRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetExecutionRequest
         */
        public GetExecutionRequest buildWithoutInvocationCallback() {
            GetExecutionRequest request = new GetExecutionRequest();
            request.schedulerJobId = schedulerJobId;
            request.jobActivityId = jobActivityId;
            request.resourceId = resourceId;
            request.executionId = executionId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetExecutionRequest(schedulerJobId, jobActivityId, resourceId, executionId,
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
                .schedulerJobId(schedulerJobId)
                .jobActivityId(jobActivityId)
                .resourceId(resourceId)
                .executionId(executionId)
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
        sb.append(",schedulerJobId=").append(String.valueOf(this.schedulerJobId));
        sb.append(",jobActivityId=").append(String.valueOf(this.jobActivityId));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(",executionId=").append(String.valueOf(this.executionId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetExecutionRequest)) {
            return false;
        }

        GetExecutionRequest other = (GetExecutionRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.schedulerJobId, other.schedulerJobId)
                && java.util.Objects.equals(this.jobActivityId, other.jobActivityId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.executionId, other.executionId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.schedulerJobId == null ? 43 : this.schedulerJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.jobActivityId == null ? 43 : this.jobActivityId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.executionId == null ? 43 : this.executionId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
