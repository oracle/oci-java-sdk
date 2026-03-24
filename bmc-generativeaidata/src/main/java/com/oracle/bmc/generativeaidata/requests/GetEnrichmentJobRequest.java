/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaidata.requests;

import com.oracle.bmc.generativeaidata.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/generativeaidata/GetEnrichmentJobExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetEnrichmentJobRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
public class GetEnrichmentJobRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the semantic store */
    private String semanticStoreId;

    /** The OCID of the semantic store */
    public String getSemanticStoreId() {
        return semanticStoreId;
    }
    /** The OCID of the enrichment job */
    private String enrichmentJobId;

    /** The OCID of the enrichment job */
    public String getEnrichmentJobId() {
        return enrichmentJobId;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetEnrichmentJobRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the semantic store */
        private String semanticStoreId = null;

        /**
         * The OCID of the semantic store
         *
         * @param semanticStoreId the value to set
         * @return this builder instance
         */
        public Builder semanticStoreId(String semanticStoreId) {
            this.semanticStoreId = semanticStoreId;
            return this;
        }

        /** The OCID of the enrichment job */
        private String enrichmentJobId = null;

        /**
         * The OCID of the enrichment job
         *
         * @param enrichmentJobId the value to set
         * @return this builder instance
         */
        public Builder enrichmentJobId(String enrichmentJobId) {
            this.enrichmentJobId = enrichmentJobId;
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
        public Builder copy(GetEnrichmentJobRequest o) {
            semanticStoreId(o.getSemanticStoreId());
            enrichmentJobId(o.getEnrichmentJobId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetEnrichmentJobRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetEnrichmentJobRequest
         */
        public GetEnrichmentJobRequest build() {
            GetEnrichmentJobRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetEnrichmentJobRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetEnrichmentJobRequest
         */
        public GetEnrichmentJobRequest buildWithoutInvocationCallback() {
            GetEnrichmentJobRequest request = new GetEnrichmentJobRequest();
            request.semanticStoreId = semanticStoreId;
            request.enrichmentJobId = enrichmentJobId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetEnrichmentJobRequest(semanticStoreId, enrichmentJobId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .semanticStoreId(semanticStoreId)
                .enrichmentJobId(enrichmentJobId)
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
        sb.append(",semanticStoreId=").append(String.valueOf(this.semanticStoreId));
        sb.append(",enrichmentJobId=").append(String.valueOf(this.enrichmentJobId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetEnrichmentJobRequest)) {
            return false;
        }

        GetEnrichmentJobRequest other = (GetEnrichmentJobRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.semanticStoreId, other.semanticStoreId)
                && java.util.Objects.equals(this.enrichmentJobId, other.enrichmentJobId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.semanticStoreId == null ? 43 : this.semanticStoreId.hashCode());
        result =
                (result * PRIME)
                        + (this.enrichmentJobId == null ? 43 : this.enrichmentJobId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
