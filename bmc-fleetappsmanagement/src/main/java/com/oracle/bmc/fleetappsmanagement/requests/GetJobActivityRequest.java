/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/GetJobActivityExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetJobActivityRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class GetJobActivityRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** If set to true, inventory details will be returned. */
    private Boolean isDetailsRequired;

    /** If set to true, inventory details will be returned. */
    public Boolean getIsDetailsRequired() {
        return isDetailsRequired;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetJobActivityRequest, java.lang.Void> {
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

        /** If set to true, inventory details will be returned. */
        private Boolean isDetailsRequired = null;

        /**
         * If set to true, inventory details will be returned.
         *
         * @param isDetailsRequired the value to set
         * @return this builder instance
         */
        public Builder isDetailsRequired(Boolean isDetailsRequired) {
            this.isDetailsRequired = isDetailsRequired;
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
        public Builder copy(GetJobActivityRequest o) {
            schedulerJobId(o.getSchedulerJobId());
            jobActivityId(o.getJobActivityId());
            isDetailsRequired(o.getIsDetailsRequired());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetJobActivityRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetJobActivityRequest
         */
        public GetJobActivityRequest build() {
            GetJobActivityRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetJobActivityRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetJobActivityRequest
         */
        public GetJobActivityRequest buildWithoutInvocationCallback() {
            GetJobActivityRequest request = new GetJobActivityRequest();
            request.schedulerJobId = schedulerJobId;
            request.jobActivityId = jobActivityId;
            request.isDetailsRequired = isDetailsRequired;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetJobActivityRequest(schedulerJobId, jobActivityId, isDetailsRequired,
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
                .isDetailsRequired(isDetailsRequired)
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
        sb.append(",isDetailsRequired=").append(String.valueOf(this.isDetailsRequired));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetJobActivityRequest)) {
            return false;
        }

        GetJobActivityRequest other = (GetJobActivityRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.schedulerJobId, other.schedulerJobId)
                && java.util.Objects.equals(this.jobActivityId, other.jobActivityId)
                && java.util.Objects.equals(this.isDetailsRequired, other.isDetailsRequired)
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
        result =
                (result * PRIME)
                        + (this.isDetailsRequired == null ? 43 : this.isDetailsRequired.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
