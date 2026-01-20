/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.responses;

import com.oracle.bmc.dataintegration.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class ListRuntimePipelinesResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /**
     * For pagination of a list of {@code RuntimePipeline}s. If this header appears in the response,
     * then this is a partial list of RuntimePipeline. Include this value as the {@code page}
     * parameter in a subsequent GET request to get the next batch of RuntimePipelines.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of {@code RuntimePipeline}s. If this header appears in the response,
     * then this is a partial list of RuntimePipeline. Include this value as the {@code page}
     * parameter in a subsequent GET request to get the next batch of RuntimePipelines.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code RuntimePipelineSummaryCollection} instance. */
    private com.oracle.bmc.dataintegration.model.RuntimePipelineSummaryCollection
            runtimePipelineSummaryCollection;

    /**
     * The returned {@code RuntimePipelineSummaryCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dataintegration.model.RuntimePipelineSummaryCollection
            getRuntimePipelineSummaryCollection() {
        return runtimePipelineSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "runtimePipelineSummaryCollection"
    })
    private ListRuntimePipelinesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.dataintegration.model.RuntimePipelineSummaryCollection
                    runtimePipelineSummaryCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.runtimePipelineSummaryCollection = runtimePipelineSummaryCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListRuntimePipelinesResponse> {
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

        /**
         * For pagination of a list of {@code RuntimePipeline}s. If this header appears in the
         * response, then this is a partial list of RuntimePipeline. Include this value as the
         * {@code page} parameter in a subsequent GET request to get the next batch of
         * RuntimePipelines.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of {@code RuntimePipeline}s. If this header appears in the
         * response, then this is a partial list of RuntimePipeline. Include this value as the
         * {@code page} parameter in a subsequent GET request to get the next batch of
         * RuntimePipelines.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code RuntimePipelineSummaryCollection} instance. */
        private com.oracle.bmc.dataintegration.model.RuntimePipelineSummaryCollection
                runtimePipelineSummaryCollection;

        /**
         * The returned {@code RuntimePipelineSummaryCollection} instance.
         *
         * @param runtimePipelineSummaryCollection the value to set
         * @return this builder
         */
        public Builder runtimePipelineSummaryCollection(
                com.oracle.bmc.dataintegration.model.RuntimePipelineSummaryCollection
                        runtimePipelineSummaryCollection) {
            this.runtimePipelineSummaryCollection = runtimePipelineSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListRuntimePipelinesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            runtimePipelineSummaryCollection(o.getRuntimePipelineSummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListRuntimePipelinesResponse build() {
            return new ListRuntimePipelinesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    runtimePipelineSummaryCollection);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",runtimePipelineSummaryCollection=")
                .append(String.valueOf(runtimePipelineSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListRuntimePipelinesResponse)) {
            return false;
        }

        ListRuntimePipelinesResponse other = (ListRuntimePipelinesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.runtimePipelineSummaryCollection,
                        other.runtimePipelineSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimePipelineSummaryCollection == null
                                ? 43
                                : this.runtimePipelineSummaryCollection.hashCode());
        return result;
    }
}
