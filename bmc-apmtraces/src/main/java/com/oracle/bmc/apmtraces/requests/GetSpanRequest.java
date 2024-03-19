/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/GetSpanExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSpanRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetSpanRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The APM Domain ID for the intended request. */
    private String apmDomainId;

    /** The APM Domain ID for the intended request. */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /** Unique Application Performance Monitoring span identifier (spanId). */
    private String spanKey;

    /** Unique Application Performance Monitoring span identifier (spanId). */
    public String getSpanKey() {
        return spanKey;
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
    /** Include spans that have a {@code spanStartTime} equal to or greater than this value. */
    private java.util.Date timeSpanStartedGreaterThanOrEqualTo;

    /** Include spans that have a {@code spanStartTime} equal to or greater than this value. */
    public java.util.Date getTimeSpanStartedGreaterThanOrEqualTo() {
        return timeSpanStartedGreaterThanOrEqualTo;
    }
    /** Include spans that have a {@code spanStartTime}less than this value. */
    private java.util.Date timeSpanStartedLessThan;

    /** Include spans that have a {@code spanStartTime}less than this value. */
    public java.util.Date getTimeSpanStartedLessThan() {
        return timeSpanStartedLessThan;
    }
    /** Name space from which the span details need to be retrieved. */
    private SpanNamespace spanNamespace;

    /** Name space from which the span details need to be retrieved. */
    public enum SpanNamespace implements com.oracle.bmc.http.internal.BmcEnum {
        Traces("TRACES"),
        Synthetic("SYNTHETIC"),
        ;

        private final String value;
        private static java.util.Map<String, SpanNamespace> map;

        static {
            map = new java.util.HashMap<>();
            for (SpanNamespace v : SpanNamespace.values()) {
                map.put(v.getValue(), v);
            }
        }

        SpanNamespace(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SpanNamespace create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SpanNamespace: " + key);
        }
    };

    /** Name space from which the span details need to be retrieved. */
    public SpanNamespace getSpanNamespace() {
        return spanNamespace;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<GetSpanRequest, java.lang.Void> {
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

        /** Unique Application Performance Monitoring span identifier (spanId). */
        private String spanKey = null;

        /**
         * Unique Application Performance Monitoring span identifier (spanId).
         *
         * @param spanKey the value to set
         * @return this builder instance
         */
        public Builder spanKey(String spanKey) {
            this.spanKey = spanKey;
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

        /** Include spans that have a {@code spanStartTime} equal to or greater than this value. */
        private java.util.Date timeSpanStartedGreaterThanOrEqualTo = null;

        /**
         * Include spans that have a {@code spanStartTime} equal to or greater than this value.
         *
         * @param timeSpanStartedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeSpanStartedGreaterThanOrEqualTo(
                java.util.Date timeSpanStartedGreaterThanOrEqualTo) {
            this.timeSpanStartedGreaterThanOrEqualTo = timeSpanStartedGreaterThanOrEqualTo;
            return this;
        }

        /** Include spans that have a {@code spanStartTime}less than this value. */
        private java.util.Date timeSpanStartedLessThan = null;

        /**
         * Include spans that have a {@code spanStartTime}less than this value.
         *
         * @param timeSpanStartedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeSpanStartedLessThan(java.util.Date timeSpanStartedLessThan) {
            this.timeSpanStartedLessThan = timeSpanStartedLessThan;
            return this;
        }

        /** Name space from which the span details need to be retrieved. */
        private SpanNamespace spanNamespace = null;

        /**
         * Name space from which the span details need to be retrieved.
         *
         * @param spanNamespace the value to set
         * @return this builder instance
         */
        public Builder spanNamespace(SpanNamespace spanNamespace) {
            this.spanNamespace = spanNamespace;
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
        public Builder copy(GetSpanRequest o) {
            apmDomainId(o.getApmDomainId());
            spanKey(o.getSpanKey());
            traceKey(o.getTraceKey());
            opcRequestId(o.getOpcRequestId());
            timeSpanStartedGreaterThanOrEqualTo(o.getTimeSpanStartedGreaterThanOrEqualTo());
            timeSpanStartedLessThan(o.getTimeSpanStartedLessThan());
            spanNamespace(o.getSpanNamespace());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSpanRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetSpanRequest
         */
        public GetSpanRequest build() {
            GetSpanRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSpanRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSpanRequest
         */
        public GetSpanRequest buildWithoutInvocationCallback() {
            GetSpanRequest request = new GetSpanRequest();
            request.apmDomainId = apmDomainId;
            request.spanKey = spanKey;
            request.traceKey = traceKey;
            request.opcRequestId = opcRequestId;
            request.timeSpanStartedGreaterThanOrEqualTo = timeSpanStartedGreaterThanOrEqualTo;
            request.timeSpanStartedLessThan = timeSpanStartedLessThan;
            request.spanNamespace = spanNamespace;
            return request;
            // new GetSpanRequest(apmDomainId, spanKey, traceKey, opcRequestId,
            // timeSpanStartedGreaterThanOrEqualTo, timeSpanStartedLessThan, spanNamespace);
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
                .spanKey(spanKey)
                .traceKey(traceKey)
                .opcRequestId(opcRequestId)
                .timeSpanStartedGreaterThanOrEqualTo(timeSpanStartedGreaterThanOrEqualTo)
                .timeSpanStartedLessThan(timeSpanStartedLessThan)
                .spanNamespace(spanNamespace);
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
        sb.append(",spanKey=").append(String.valueOf(this.spanKey));
        sb.append(",traceKey=").append(String.valueOf(this.traceKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",timeSpanStartedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeSpanStartedGreaterThanOrEqualTo));
        sb.append(",timeSpanStartedLessThan=").append(String.valueOf(this.timeSpanStartedLessThan));
        sb.append(",spanNamespace=").append(String.valueOf(this.spanNamespace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSpanRequest)) {
            return false;
        }

        GetSpanRequest other = (GetSpanRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.spanKey, other.spanKey)
                && java.util.Objects.equals(this.traceKey, other.traceKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.timeSpanStartedGreaterThanOrEqualTo,
                        other.timeSpanStartedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeSpanStartedLessThan, other.timeSpanStartedLessThan)
                && java.util.Objects.equals(this.spanNamespace, other.spanNamespace);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.spanKey == null ? 43 : this.spanKey.hashCode());
        result = (result * PRIME) + (this.traceKey == null ? 43 : this.traceKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSpanStartedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeSpanStartedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSpanStartedLessThan == null
                                ? 43
                                : this.timeSpanStartedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.spanNamespace == null ? 43 : this.spanNamespace.hashCode());
        return result;
    }
}
