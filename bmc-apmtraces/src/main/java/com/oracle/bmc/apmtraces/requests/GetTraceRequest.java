/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/GetTraceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetTraceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetTraceRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The APM Domain ID for the intended request. */
    private String apmDomainId;

    /** The APM Domain ID for the intended request. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** Unique Application Performance Monitoring trace identifier (traceId). */
    private String traceKey;

    /** Unique Application Performance Monitoring trace identifier (traceId). */
    public String getTraceKey() {
        return traceKey;
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
    /** Include traces that have a {@code minTraceStartTime} equal to or greater than this value. */
    private java.util.Date timeTraceStartedGreaterThanOrEqualTo;

    /** Include traces that have a {@code minTraceStartTime} equal to or greater than this value. */
    public java.util.Date getTimeTraceStartedGreaterThanOrEqualTo() {
        return timeTraceStartedGreaterThanOrEqualTo;
    }
    /** Include traces that have a {@code minTraceStartTime} less than this value. */
    private java.util.Date timeTraceStartedLessThan;

    /** Include traces that have a {@code minTraceStartTime} less than this value. */
    public java.util.Date getTimeTraceStartedLessThan() {
        return timeTraceStartedLessThan;
    }
    /** Name space from which the trace details need to be retrieved. */
    private TraceNamespace traceNamespace;

    /** Name space from which the trace details need to be retrieved. */
    public enum TraceNamespace implements com.oracle.bmc.http.internal.BmcEnum {
        Traces("TRACES"),
        Synthetic("SYNTHETIC"),
        ;

        private final String value;
        private static java.util.Map<String, TraceNamespace> map;

        static {
            map = new java.util.HashMap<>();
            for (TraceNamespace v : TraceNamespace.values()) {
                map.put(v.getValue(), v);
            }
        }

        TraceNamespace(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TraceNamespace create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TraceNamespace: " + key);
        }
    };

    /** Name space from which the trace details need to be retrieved. */
    public TraceNamespace getTraceNamespace() {
        return traceNamespace;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<GetTraceRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The APM Domain ID for the intended request. */
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

        /** Unique Application Performance Monitoring trace identifier (traceId). */
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
         * Include traces that have a {@code minTraceStartTime} equal to or greater than this value.
         */
        private java.util.Date timeTraceStartedGreaterThanOrEqualTo = null;

        /**
         * Include traces that have a {@code minTraceStartTime} equal to or greater than this value.
         *
         * @param timeTraceStartedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeTraceStartedGreaterThanOrEqualTo(
                java.util.Date timeTraceStartedGreaterThanOrEqualTo) {
            this.timeTraceStartedGreaterThanOrEqualTo = timeTraceStartedGreaterThanOrEqualTo;
            return this;
        }

        /** Include traces that have a {@code minTraceStartTime} less than this value. */
        private java.util.Date timeTraceStartedLessThan = null;

        /**
         * Include traces that have a {@code minTraceStartTime} less than this value.
         *
         * @param timeTraceStartedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeTraceStartedLessThan(java.util.Date timeTraceStartedLessThan) {
            this.timeTraceStartedLessThan = timeTraceStartedLessThan;
            return this;
        }

        /** Name space from which the trace details need to be retrieved. */
        private TraceNamespace traceNamespace = null;

        /**
         * Name space from which the trace details need to be retrieved.
         *
         * @param traceNamespace the value to set
         * @return this builder instance
         */
        public Builder traceNamespace(TraceNamespace traceNamespace) {
            this.traceNamespace = traceNamespace;
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
        public Builder copy(GetTraceRequest o) {
            apmDomainId(o.getApmDomainId());
            traceKey(o.getTraceKey());
            opcRequestId(o.getOpcRequestId());
            timeTraceStartedGreaterThanOrEqualTo(o.getTimeTraceStartedGreaterThanOrEqualTo());
            timeTraceStartedLessThan(o.getTimeTraceStartedLessThan());
            traceNamespace(o.getTraceNamespace());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTraceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetTraceRequest
         */
        public GetTraceRequest build() {
            GetTraceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTraceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTraceRequest
         */
        public GetTraceRequest buildWithoutInvocationCallback() {
            GetTraceRequest request = new GetTraceRequest();
            request.apmDomainId = apmDomainId;
            request.traceKey = traceKey;
            request.opcRequestId = opcRequestId;
            request.timeTraceStartedGreaterThanOrEqualTo = timeTraceStartedGreaterThanOrEqualTo;
            request.timeTraceStartedLessThan = timeTraceStartedLessThan;
            request.traceNamespace = traceNamespace;
            return request;
            // new GetTraceRequest(apmDomainId, traceKey, opcRequestId,
            // timeTraceStartedGreaterThanOrEqualTo, timeTraceStartedLessThan, traceNamespace);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .traceKey(traceKey)
                .opcRequestId(opcRequestId)
                .timeTraceStartedGreaterThanOrEqualTo(timeTraceStartedGreaterThanOrEqualTo)
                .timeTraceStartedLessThan(timeTraceStartedLessThan)
                .traceNamespace(traceNamespace);
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",traceKey=").append(String.valueOf(this.traceKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",timeTraceStartedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeTraceStartedGreaterThanOrEqualTo));
        sb.append(",timeTraceStartedLessThan=")
                .append(String.valueOf(this.timeTraceStartedLessThan));
        sb.append(",traceNamespace=").append(String.valueOf(this.traceNamespace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTraceRequest)) {
            return false;
        }

        GetTraceRequest other = (GetTraceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.traceKey, other.traceKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.timeTraceStartedGreaterThanOrEqualTo,
                        other.timeTraceStartedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeTraceStartedLessThan, other.timeTraceStartedLessThan)
                && java.util.Objects.equals(this.traceNamespace, other.traceNamespace);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.traceKey == null ? 43 : this.traceKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTraceStartedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeTraceStartedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTraceStartedLessThan == null
                                ? 43
                                : this.timeTraceStartedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.traceNamespace == null ? 43 : this.traceNamespace.hashCode());
        return result;
    }
}
