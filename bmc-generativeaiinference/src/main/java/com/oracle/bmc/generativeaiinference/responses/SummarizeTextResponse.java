/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.responses;

import com.oracle.bmc.generativeaiinference.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class SummarizeTextResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** Provides deprecation details for models, included only when a model is deprecated. */
    private String modelDeprecationInfo;

    /**
     * Provides deprecation details for models, included only when a model is deprecated.
     *
     * @return the value
     */
    public String getModelDeprecationInfo() {
        return modelDeprecationInfo;
    }

    /** The returned {@code SummarizeTextResult} instance. */
    private com.oracle.bmc.generativeaiinference.model.SummarizeTextResult summarizeTextResult;

    /**
     * The returned {@code SummarizeTextResult} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.generativeaiinference.model.SummarizeTextResult getSummarizeTextResult() {
        return summarizeTextResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "modelDeprecationInfo",
        "summarizeTextResult"
    })
    private SummarizeTextResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String modelDeprecationInfo,
            com.oracle.bmc.generativeaiinference.model.SummarizeTextResult summarizeTextResult) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.modelDeprecationInfo = modelDeprecationInfo;
        this.summarizeTextResult = summarizeTextResult;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<SummarizeTextResponse> {
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
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Provides deprecation details for models, included only when a model is deprecated. */
        private String modelDeprecationInfo;

        /**
         * Provides deprecation details for models, included only when a model is deprecated.
         *
         * @param modelDeprecationInfo the value to set
         * @return this builder
         */
        public Builder modelDeprecationInfo(String modelDeprecationInfo) {
            this.modelDeprecationInfo = modelDeprecationInfo;
            return this;
        }

        /** The returned {@code SummarizeTextResult} instance. */
        private com.oracle.bmc.generativeaiinference.model.SummarizeTextResult summarizeTextResult;

        /**
         * The returned {@code SummarizeTextResult} instance.
         *
         * @param summarizeTextResult the value to set
         * @return this builder
         */
        public Builder summarizeTextResult(
                com.oracle.bmc.generativeaiinference.model.SummarizeTextResult
                        summarizeTextResult) {
            this.summarizeTextResult = summarizeTextResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(SummarizeTextResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            modelDeprecationInfo(o.getModelDeprecationInfo());
            summarizeTextResult(o.getSummarizeTextResult());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public SummarizeTextResponse build() {
            return new SummarizeTextResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    modelDeprecationInfo,
                    summarizeTextResult);
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
        sb.append(",modelDeprecationInfo=").append(String.valueOf(modelDeprecationInfo));
        sb.append(",summarizeTextResult=").append(String.valueOf(summarizeTextResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeTextResponse)) {
            return false;
        }

        SummarizeTextResponse other = (SummarizeTextResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.modelDeprecationInfo, other.modelDeprecationInfo)
                && java.util.Objects.equals(this.summarizeTextResult, other.summarizeTextResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.modelDeprecationInfo == null
                                ? 43
                                : this.modelDeprecationInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizeTextResult == null
                                ? 43
                                : this.summarizeTextResult.hashCode());
        return result;
    }
}
