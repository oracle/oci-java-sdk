/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/GetTraceSnapshotExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetTraceSnapshotRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetTraceSnapshotRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The APM Domain ID for the intended request.
     *
     */
    private String apmDomainId;

    /**
     * The APM Domain ID for the intended request.
     *
     */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * Unique Application Performance Monitoring trace identifier (traceId).
     *
     */
    private String traceKey;

    /**
     * Unique Application Performance Monitoring trace identifier (traceId).
     *
     */
    public String getTraceKey() {
        return traceKey;
    }
    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * If enabled, only span level details are sent.
     *
     */
    private Boolean isSummarized;

    /**
     * If enabled, only span level details are sent.
     *
     */
    public Boolean getIsSummarized() {
        return isSummarized;
    }
    /**
     * Thread ID for which snapshots need to be retrieved. This identifier of a thread is a long positive number generated when a thread is created.
     *
     */
    private String threadId;

    /**
     * Thread ID for which snapshots need to be retrieved. This identifier of a thread is a long positive number generated when a thread is created.
     *
     */
    public String getThreadId() {
        return threadId;
    }
    /**
     * Epoch time of snapshot.
     *
     */
    private String snapshotTime;

    /**
     * Epoch time of snapshot.
     *
     */
    public String getSnapshotTime() {
        return snapshotTime;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetTraceSnapshotRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The APM Domain ID for the intended request.
         *
         */
        private String apmDomainId = null;

        /**
         * The APM Domain ID for the intended request.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * Unique Application Performance Monitoring trace identifier (traceId).
         *
         */
        private String traceKey = null;

        /**
         * Unique Application Performance Monitoring trace identifier (traceId).
         *
         * @param traceKey the value to set
         * @return this builder instance
         */
        public Builder traceKey(String traceKey) {
            this.traceKey = traceKey;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request.  If you need to contact Oracle about a
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
         * If enabled, only span level details are sent.
         *
         */
        private Boolean isSummarized = null;

        /**
         * If enabled, only span level details are sent.
         *
         * @param isSummarized the value to set
         * @return this builder instance
         */
        public Builder isSummarized(Boolean isSummarized) {
            this.isSummarized = isSummarized;
            return this;
        }

        /**
         * Thread ID for which snapshots need to be retrieved. This identifier of a thread is a long positive number generated when a thread is created.
         *
         */
        private String threadId = null;

        /**
         * Thread ID for which snapshots need to be retrieved. This identifier of a thread is a long positive number generated when a thread is created.
         *
         * @param threadId the value to set
         * @return this builder instance
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        /**
         * Epoch time of snapshot.
         *
         */
        private String snapshotTime = null;

        /**
         * Epoch time of snapshot.
         *
         * @param snapshotTime the value to set
         * @return this builder instance
         */
        public Builder snapshotTime(String snapshotTime) {
            this.snapshotTime = snapshotTime;
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
        public Builder copy(GetTraceSnapshotRequest o) {
            apmDomainId(o.getApmDomainId());
            traceKey(o.getTraceKey());
            opcRequestId(o.getOpcRequestId());
            isSummarized(o.getIsSummarized());
            threadId(o.getThreadId());
            snapshotTime(o.getSnapshotTime());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTraceSnapshotRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetTraceSnapshotRequest
         */
        public GetTraceSnapshotRequest build() {
            GetTraceSnapshotRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTraceSnapshotRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTraceSnapshotRequest
         */
        public GetTraceSnapshotRequest buildWithoutInvocationCallback() {
            GetTraceSnapshotRequest request = new GetTraceSnapshotRequest();
            request.apmDomainId = apmDomainId;
            request.traceKey = traceKey;
            request.opcRequestId = opcRequestId;
            request.isSummarized = isSummarized;
            request.threadId = threadId;
            request.snapshotTime = snapshotTime;
            return request;
            // new GetTraceSnapshotRequest(apmDomainId, traceKey, opcRequestId, isSummarized, threadId, snapshotTime);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .traceKey(traceKey)
                .opcRequestId(opcRequestId)
                .isSummarized(isSummarized)
                .threadId(threadId)
                .snapshotTime(snapshotTime);
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",traceKey=").append(String.valueOf(this.traceKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isSummarized=").append(String.valueOf(this.isSummarized));
        sb.append(",threadId=").append(String.valueOf(this.threadId));
        sb.append(",snapshotTime=").append(String.valueOf(this.snapshotTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTraceSnapshotRequest)) {
            return false;
        }

        GetTraceSnapshotRequest other = (GetTraceSnapshotRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.traceKey, other.traceKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isSummarized, other.isSummarized)
                && java.util.Objects.equals(this.threadId, other.threadId)
                && java.util.Objects.equals(this.snapshotTime, other.snapshotTime);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.traceKey == null ? 43 : this.traceKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.isSummarized == null ? 43 : this.isSummarized.hashCode());
        result = (result * PRIME) + (this.threadId == null ? 43 : this.threadId.hashCode());
        result = (result * PRIME) + (this.snapshotTime == null ? 43 : this.snapshotTime.hashCode());
        return result;
    }
}
