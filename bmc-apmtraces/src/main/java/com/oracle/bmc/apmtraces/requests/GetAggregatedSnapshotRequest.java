/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.requests;

import com.oracle.bmc.apmtraces.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmtraces/GetAggregatedSnapshotExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetAggregatedSnapshotRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetAggregatedSnapshotRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** Name associated with the service. */
    private String serviceName;

    /** Name associated with the service. */
    public String getServiceName() {
        return serviceName;
    }
    /** Name of the server. */
    private String serverName;

    /** Name of the server. */
    public String getServerName() {
        return serverName;
    }
    /** Unique Application Performance Monitoring span identifier (spanId). */
    private String spanKey;

    /** Unique Application Performance Monitoring span identifier (spanId). */
    public String getSpanKey() {
        return spanKey;
    }
    /** Name of the span associated with the trace. */
    private String spanName;

    /** Name of the span associated with the trace. */
    public String getSpanName() {
        return spanName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAggregatedSnapshotRequest, java.lang.Void> {
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

        /** Name associated with the service. */
        private String serviceName = null;

        /**
         * Name associated with the service.
         *
         * @param serviceName the value to set
         * @return this builder instance
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /** Name of the server. */
        private String serverName = null;

        /**
         * Name of the server.
         *
         * @param serverName the value to set
         * @return this builder instance
         */
        public Builder serverName(String serverName) {
            this.serverName = serverName;
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

        /** Name of the span associated with the trace. */
        private String spanName = null;

        /**
         * Name of the span associated with the trace.
         *
         * @param spanName the value to set
         * @return this builder instance
         */
        public Builder spanName(String spanName) {
            this.spanName = spanName;
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
        public Builder copy(GetAggregatedSnapshotRequest o) {
            apmDomainId(o.getApmDomainId());
            traceKey(o.getTraceKey());
            opcRequestId(o.getOpcRequestId());
            serviceName(o.getServiceName());
            serverName(o.getServerName());
            spanKey(o.getSpanKey());
            spanName(o.getSpanName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAggregatedSnapshotRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetAggregatedSnapshotRequest
         */
        public GetAggregatedSnapshotRequest build() {
            GetAggregatedSnapshotRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAggregatedSnapshotRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAggregatedSnapshotRequest
         */
        public GetAggregatedSnapshotRequest buildWithoutInvocationCallback() {
            GetAggregatedSnapshotRequest request = new GetAggregatedSnapshotRequest();
            request.apmDomainId = apmDomainId;
            request.traceKey = traceKey;
            request.opcRequestId = opcRequestId;
            request.serviceName = serviceName;
            request.serverName = serverName;
            request.spanKey = spanKey;
            request.spanName = spanName;
            return request;
            // new GetAggregatedSnapshotRequest(apmDomainId, traceKey, opcRequestId, serviceName,
            // serverName, spanKey, spanName);
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
                .serviceName(serviceName)
                .serverName(serverName)
                .spanKey(spanKey)
                .spanName(spanName);
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
        sb.append(",serviceName=").append(String.valueOf(this.serviceName));
        sb.append(",serverName=").append(String.valueOf(this.serverName));
        sb.append(",spanKey=").append(String.valueOf(this.spanKey));
        sb.append(",spanName=").append(String.valueOf(this.spanName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAggregatedSnapshotRequest)) {
            return false;
        }

        GetAggregatedSnapshotRequest other = (GetAggregatedSnapshotRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.traceKey, other.traceKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.serverName, other.serverName)
                && java.util.Objects.equals(this.spanKey, other.spanKey)
                && java.util.Objects.equals(this.spanName, other.spanName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.traceKey == null ? 43 : this.traceKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.serverName == null ? 43 : this.serverName.hashCode());
        result = (result * PRIME) + (this.spanKey == null ? 43 : this.spanKey.hashCode());
        result = (result * PRIME) + (this.spanName == null ? 43 : this.spanName.hashCode());
        return result;
    }
}
