/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeHostInsightNetworkUsageTrendResponse
        extends com.oracle.bmc.responses.BmcResponse {
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
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code SummarizeHostInsightNetworkUsageTrendAggregationCollection} instance. */
    private com.oracle.bmc.opsi.model.SummarizeHostInsightNetworkUsageTrendAggregationCollection
            summarizeHostInsightNetworkUsageTrendAggregationCollection;

    /**
     * The returned {@code SummarizeHostInsightNetworkUsageTrendAggregationCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.opsi.model.SummarizeHostInsightNetworkUsageTrendAggregationCollection
            getSummarizeHostInsightNetworkUsageTrendAggregationCollection() {
        return summarizeHostInsightNetworkUsageTrendAggregationCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "summarizeHostInsightNetworkUsageTrendAggregationCollection"
    })
    private SummarizeHostInsightNetworkUsageTrendResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.opsi.model.SummarizeHostInsightNetworkUsageTrendAggregationCollection
                    summarizeHostInsightNetworkUsageTrendAggregationCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.summarizeHostInsightNetworkUsageTrendAggregationCollection =
                summarizeHostInsightNetworkUsageTrendAggregationCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    SummarizeHostInsightNetworkUsageTrendResponse> {
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
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned {@code SummarizeHostInsightNetworkUsageTrendAggregationCollection} instance.
         */
        private com.oracle.bmc.opsi.model.SummarizeHostInsightNetworkUsageTrendAggregationCollection
                summarizeHostInsightNetworkUsageTrendAggregationCollection;

        /**
         * The returned {@code SummarizeHostInsightNetworkUsageTrendAggregationCollection} instance.
         *
         * @param summarizeHostInsightNetworkUsageTrendAggregationCollection the value to set
         * @return this builder
         */
        public Builder summarizeHostInsightNetworkUsageTrendAggregationCollection(
                com.oracle.bmc.opsi.model.SummarizeHostInsightNetworkUsageTrendAggregationCollection
                        summarizeHostInsightNetworkUsageTrendAggregationCollection) {
            this.summarizeHostInsightNetworkUsageTrendAggregationCollection =
                    summarizeHostInsightNetworkUsageTrendAggregationCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(SummarizeHostInsightNetworkUsageTrendResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            summarizeHostInsightNetworkUsageTrendAggregationCollection(
                    o.getSummarizeHostInsightNetworkUsageTrendAggregationCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public SummarizeHostInsightNetworkUsageTrendResponse build() {
            return new SummarizeHostInsightNetworkUsageTrendResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    summarizeHostInsightNetworkUsageTrendAggregationCollection);
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
        sb.append(",summarizeHostInsightNetworkUsageTrendAggregationCollection=")
                .append(String.valueOf(summarizeHostInsightNetworkUsageTrendAggregationCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeHostInsightNetworkUsageTrendResponse)) {
            return false;
        }

        SummarizeHostInsightNetworkUsageTrendResponse other =
                (SummarizeHostInsightNetworkUsageTrendResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.summarizeHostInsightNetworkUsageTrendAggregationCollection,
                        other.summarizeHostInsightNetworkUsageTrendAggregationCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizeHostInsightNetworkUsageTrendAggregationCollection == null
                                ? 43
                                : this.summarizeHostInsightNetworkUsageTrendAggregationCollection
                                        .hashCode());
        return result;
    }
}
