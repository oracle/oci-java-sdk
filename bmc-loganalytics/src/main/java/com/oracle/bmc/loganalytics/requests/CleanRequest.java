/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/CleanExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use CleanRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class CleanRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The Logging Analytics namespace used for the request. */
    private String namespaceName;

    /** The Logging Analytics namespace used for the request. */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * Unique scheduledTask id returned from task create. If invalid will lead to a 404 not found.
     */
    private String scheduledTaskId;

    /**
     * Unique scheduledTask id returned from task create. If invalid will lead to a 404 not found.
     */
    public String getScheduledTaskId() {
        return scheduledTaskId;
    }
    /**
     * Optional parameter to specify start of time range, in the format defined by RFC3339. Default
     * value is beginning of time.
     */
    private java.util.Date timeStart;

    /**
     * Optional parameter to specify start of time range, in the format defined by RFC3339. Default
     * value is beginning of time.
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * Optional parameter to specify end of time range, in the format defined by RFC3339. Default
     * value is end of time.
     */
    private java.util.Date timeEnd;

    /**
     * Optional parameter to specify end of time range, in the format defined by RFC3339. Default
     * value is end of time.
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<CleanRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The Logging Analytics namespace used for the request. */
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
         * Unique scheduledTask id returned from task create. If invalid will lead to a 404 not
         * found.
         */
        private String scheduledTaskId = null;

        /**
         * Unique scheduledTask id returned from task create. If invalid will lead to a 404 not
         * found.
         *
         * @param scheduledTaskId the value to set
         * @return this builder instance
         */
        public Builder scheduledTaskId(String scheduledTaskId) {
            this.scheduledTaskId = scheduledTaskId;
            return this;
        }

        /**
         * Optional parameter to specify start of time range, in the format defined by RFC3339.
         * Default value is beginning of time.
         */
        private java.util.Date timeStart = null;

        /**
         * Optional parameter to specify start of time range, in the format defined by RFC3339.
         * Default value is beginning of time.
         *
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * Optional parameter to specify end of time range, in the format defined by RFC3339.
         * Default value is end of time.
         */
        private java.util.Date timeEnd = null;

        /**
         * Optional parameter to specify end of time range, in the format defined by RFC3339.
         * Default value is end of time.
         *
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(CleanRequest o) {
            namespaceName(o.getNamespaceName());
            scheduledTaskId(o.getScheduledTaskId());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CleanRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CleanRequest
         */
        public CleanRequest build() {
            CleanRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of CleanRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CleanRequest
         */
        public CleanRequest buildWithoutInvocationCallback() {
            CleanRequest request = new CleanRequest();
            request.namespaceName = namespaceName;
            request.scheduledTaskId = scheduledTaskId;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CleanRequest(namespaceName, scheduledTaskId, timeStart, timeEnd, opcRequestId,
            // opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .scheduledTaskId(scheduledTaskId)
                .timeStart(timeStart)
                .timeEnd(timeEnd)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",scheduledTaskId=").append(String.valueOf(this.scheduledTaskId));
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CleanRequest)) {
            return false;
        }

        CleanRequest other = (CleanRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.scheduledTaskId, other.scheduledTaskId)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
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
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
