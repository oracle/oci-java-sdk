/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetDiscoveryJobResultExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDiscoveryJobResultRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetDiscoveryJobResultRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the discovery job. */
    private String discoveryJobId;

    /** The OCID of the discovery job. */
    public String getDiscoveryJobId() {
        return discoveryJobId;
    }
    /** The unique key that identifies the discovery result. */
    private String resultKey;

    /** The unique key that identifies the discovery result. */
    public String getResultKey() {
        return resultKey;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDiscoveryJobResultRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the discovery job. */
        private String discoveryJobId = null;

        /**
         * The OCID of the discovery job.
         *
         * @param discoveryJobId the value to set
         * @return this builder instance
         */
        public Builder discoveryJobId(String discoveryJobId) {
            this.discoveryJobId = discoveryJobId;
            return this;
        }

        /** The unique key that identifies the discovery result. */
        private String resultKey = null;

        /**
         * The unique key that identifies the discovery result.
         *
         * @param resultKey the value to set
         * @return this builder instance
         */
        public Builder resultKey(String resultKey) {
            this.resultKey = resultKey;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(GetDiscoveryJobResultRequest o) {
            discoveryJobId(o.getDiscoveryJobId());
            resultKey(o.getResultKey());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDiscoveryJobResultRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDiscoveryJobResultRequest
         */
        public GetDiscoveryJobResultRequest build() {
            GetDiscoveryJobResultRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDiscoveryJobResultRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDiscoveryJobResultRequest
         */
        public GetDiscoveryJobResultRequest buildWithoutInvocationCallback() {
            GetDiscoveryJobResultRequest request = new GetDiscoveryJobResultRequest();
            request.discoveryJobId = discoveryJobId;
            request.resultKey = resultKey;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetDiscoveryJobResultRequest(discoveryJobId, resultKey, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .discoveryJobId(discoveryJobId)
                .resultKey(resultKey)
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
        sb.append(",discoveryJobId=").append(String.valueOf(this.discoveryJobId));
        sb.append(",resultKey=").append(String.valueOf(this.resultKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDiscoveryJobResultRequest)) {
            return false;
        }

        GetDiscoveryJobResultRequest other = (GetDiscoveryJobResultRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.discoveryJobId, other.discoveryJobId)
                && java.util.Objects.equals(this.resultKey, other.resultKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.discoveryJobId == null ? 43 : this.discoveryJobId.hashCode());
        result = (result * PRIME) + (this.resultKey == null ? 43 : this.resultKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
