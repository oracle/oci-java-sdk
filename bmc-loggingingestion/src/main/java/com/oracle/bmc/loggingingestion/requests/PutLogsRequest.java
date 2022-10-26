/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loggingingestion.requests;

import com.oracle.bmc.loggingingestion.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loggingingestion/PutLogsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use PutLogsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200831")
public class PutLogsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loggingingestion.model.PutLogsDetails> {

    /** OCID of a log to work with. */
    private String logId;

    /** OCID of a log to work with. */
    public String getLogId() {
        return logId;
    }
    /** The logs to emit. */
    private com.oracle.bmc.loggingingestion.model.PutLogsDetails putLogsDetails;

    /** The logs to emit. */
    public com.oracle.bmc.loggingingestion.model.PutLogsDetails getPutLogsDetails() {
        return putLogsDetails;
    }
    /**
     * Effective timestamp, for when the agent started processing the log segment being sent. An
     * RFC3339-formatted date-time string with milliseconds precision.
     */
    private java.util.Date timestampOpcAgentProcessing;

    /**
     * Effective timestamp, for when the agent started processing the log segment being sent. An
     * RFC3339-formatted date-time string with milliseconds precision.
     */
    public java.util.Date getTimestampOpcAgentProcessing() {
        return timestampOpcAgentProcessing;
    }
    /** Version of the agent sending the request. */
    private String opcAgentVersion;

    /** Version of the agent sending the request. */
    public String getOpcAgentVersion() {
        return opcAgentVersion;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
    public com.oracle.bmc.loggingingestion.model.PutLogsDetails getBody$() {
        return putLogsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PutLogsRequest, com.oracle.bmc.loggingingestion.model.PutLogsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** OCID of a log to work with. */
        private String logId = null;

        /**
         * OCID of a log to work with.
         *
         * @param logId the value to set
         * @return this builder instance
         */
        public Builder logId(String logId) {
            this.logId = logId;
            return this;
        }

        /** The logs to emit. */
        private com.oracle.bmc.loggingingestion.model.PutLogsDetails putLogsDetails = null;

        /**
         * The logs to emit.
         *
         * @param putLogsDetails the value to set
         * @return this builder instance
         */
        public Builder putLogsDetails(
                com.oracle.bmc.loggingingestion.model.PutLogsDetails putLogsDetails) {
            this.putLogsDetails = putLogsDetails;
            return this;
        }

        /**
         * Effective timestamp, for when the agent started processing the log segment being sent. An
         * RFC3339-formatted date-time string with milliseconds precision.
         */
        private java.util.Date timestampOpcAgentProcessing = null;

        /**
         * Effective timestamp, for when the agent started processing the log segment being sent. An
         * RFC3339-formatted date-time string with milliseconds precision.
         *
         * @param timestampOpcAgentProcessing the value to set
         * @return this builder instance
         */
        public Builder timestampOpcAgentProcessing(java.util.Date timestampOpcAgentProcessing) {
            this.timestampOpcAgentProcessing = timestampOpcAgentProcessing;
            return this;
        }

        /** Version of the agent sending the request. */
        private String opcAgentVersion = null;

        /**
         * Version of the agent sending the request.
         *
         * @param opcAgentVersion the value to set
         * @return this builder instance
         */
        public Builder opcAgentVersion(String opcAgentVersion) {
            this.opcAgentVersion = opcAgentVersion;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
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
        public Builder copy(PutLogsRequest o) {
            logId(o.getLogId());
            putLogsDetails(o.getPutLogsDetails());
            timestampOpcAgentProcessing(o.getTimestampOpcAgentProcessing());
            opcAgentVersion(o.getOpcAgentVersion());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PutLogsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PutLogsRequest
         */
        public PutLogsRequest build() {
            PutLogsRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.loggingingestion.model.PutLogsDetails body) {
            putLogsDetails(body);
            return this;
        }

        /**
         * Build the instance of PutLogsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PutLogsRequest
         */
        public PutLogsRequest buildWithoutInvocationCallback() {
            PutLogsRequest request = new PutLogsRequest();
            request.logId = logId;
            request.putLogsDetails = putLogsDetails;
            request.timestampOpcAgentProcessing = timestampOpcAgentProcessing;
            request.opcAgentVersion = opcAgentVersion;
            request.opcRequestId = opcRequestId;
            return request;
            // new PutLogsRequest(logId, putLogsDetails, timestampOpcAgentProcessing,
            // opcAgentVersion, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .logId(logId)
                .putLogsDetails(putLogsDetails)
                .timestampOpcAgentProcessing(timestampOpcAgentProcessing)
                .opcAgentVersion(opcAgentVersion)
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
        sb.append(",logId=").append(String.valueOf(this.logId));
        sb.append(",putLogsDetails=").append(String.valueOf(this.putLogsDetails));
        sb.append(",timestampOpcAgentProcessing=")
                .append(String.valueOf(this.timestampOpcAgentProcessing));
        sb.append(",opcAgentVersion=").append(String.valueOf(this.opcAgentVersion));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutLogsRequest)) {
            return false;
        }

        PutLogsRequest other = (PutLogsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.logId, other.logId)
                && java.util.Objects.equals(this.putLogsDetails, other.putLogsDetails)
                && java.util.Objects.equals(
                        this.timestampOpcAgentProcessing, other.timestampOpcAgentProcessing)
                && java.util.Objects.equals(this.opcAgentVersion, other.opcAgentVersion)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
        result =
                (result * PRIME)
                        + (this.putLogsDetails == null ? 43 : this.putLogsDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timestampOpcAgentProcessing == null
                                ? 43
                                : this.timestampOpcAgentProcessing.hashCode());
        result =
                (result * PRIME)
                        + (this.opcAgentVersion == null ? 43 : this.opcAgentVersion.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
