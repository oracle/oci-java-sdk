/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.responses;

import com.oracle.bmc.jms.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class GetPerformanceTuningAnalysisResultResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code PerformanceTuningAnalysisResult} instance. */
    private com.oracle.bmc.jms.model.PerformanceTuningAnalysisResult
            performanceTuningAnalysisResult;

    /**
     * The returned {@code PerformanceTuningAnalysisResult} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.jms.model.PerformanceTuningAnalysisResult
            getPerformanceTuningAnalysisResult() {
        return performanceTuningAnalysisResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "performanceTuningAnalysisResult"
    })
    private GetPerformanceTuningAnalysisResultResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.jms.model.PerformanceTuningAnalysisResult
                    performanceTuningAnalysisResult) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.performanceTuningAnalysisResult = performanceTuningAnalysisResult;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetPerformanceTuningAnalysisResultResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code PerformanceTuningAnalysisResult} instance. */
        private com.oracle.bmc.jms.model.PerformanceTuningAnalysisResult
                performanceTuningAnalysisResult;

        /**
         * The returned {@code PerformanceTuningAnalysisResult} instance.
         *
         * @param performanceTuningAnalysisResult the value to set
         * @return this builder
         */
        public Builder performanceTuningAnalysisResult(
                com.oracle.bmc.jms.model.PerformanceTuningAnalysisResult
                        performanceTuningAnalysisResult) {
            this.performanceTuningAnalysisResult = performanceTuningAnalysisResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetPerformanceTuningAnalysisResultResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            performanceTuningAnalysisResult(o.getPerformanceTuningAnalysisResult());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetPerformanceTuningAnalysisResultResponse build() {
            return new GetPerformanceTuningAnalysisResultResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    performanceTuningAnalysisResult);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",performanceTuningAnalysisResult=")
                .append(String.valueOf(performanceTuningAnalysisResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPerformanceTuningAnalysisResultResponse)) {
            return false;
        }

        GetPerformanceTuningAnalysisResultResponse other =
                (GetPerformanceTuningAnalysisResultResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.performanceTuningAnalysisResult,
                        other.performanceTuningAnalysisResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.performanceTuningAnalysisResult == null
                                ? 43
                                : this.performanceTuningAnalysisResult.hashCode());
        return result;
    }
}
