/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeDatabaseInsightResourceStatisticsResponse
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

    /**
     * The returned {@code SummarizeDatabaseInsightResourceStatisticsAggregationCollection}
     * instance.
     */
    private com.oracle.bmc.opsi.model
                    .SummarizeDatabaseInsightResourceStatisticsAggregationCollection
            summarizeDatabaseInsightResourceStatisticsAggregationCollection;

    /**
     * The returned {@code SummarizeDatabaseInsightResourceStatisticsAggregationCollection}
     * instance.
     *
     * @return the value
     */
    public com.oracle.bmc.opsi.model.SummarizeDatabaseInsightResourceStatisticsAggregationCollection
            getSummarizeDatabaseInsightResourceStatisticsAggregationCollection() {
        return summarizeDatabaseInsightResourceStatisticsAggregationCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "summarizeDatabaseInsightResourceStatisticsAggregationCollection"
    })
    private SummarizeDatabaseInsightResourceStatisticsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.opsi.model
                            .SummarizeDatabaseInsightResourceStatisticsAggregationCollection
                    summarizeDatabaseInsightResourceStatisticsAggregationCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.summarizeDatabaseInsightResourceStatisticsAggregationCollection =
                summarizeDatabaseInsightResourceStatisticsAggregationCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    SummarizeDatabaseInsightResourceStatisticsResponse> {
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
         * The returned {@code SummarizeDatabaseInsightResourceStatisticsAggregationCollection}
         * instance.
         */
        private com.oracle.bmc.opsi.model
                        .SummarizeDatabaseInsightResourceStatisticsAggregationCollection
                summarizeDatabaseInsightResourceStatisticsAggregationCollection;

        /**
         * The returned {@code SummarizeDatabaseInsightResourceStatisticsAggregationCollection}
         * instance.
         *
         * @param summarizeDatabaseInsightResourceStatisticsAggregationCollection the value to set
         * @return this builder
         */
        public Builder summarizeDatabaseInsightResourceStatisticsAggregationCollection(
                com.oracle.bmc.opsi.model
                                .SummarizeDatabaseInsightResourceStatisticsAggregationCollection
                        summarizeDatabaseInsightResourceStatisticsAggregationCollection) {
            this.summarizeDatabaseInsightResourceStatisticsAggregationCollection =
                    summarizeDatabaseInsightResourceStatisticsAggregationCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(SummarizeDatabaseInsightResourceStatisticsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            summarizeDatabaseInsightResourceStatisticsAggregationCollection(
                    o.getSummarizeDatabaseInsightResourceStatisticsAggregationCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public SummarizeDatabaseInsightResourceStatisticsResponse build() {
            return new SummarizeDatabaseInsightResourceStatisticsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    summarizeDatabaseInsightResourceStatisticsAggregationCollection);
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
        sb.append(",summarizeDatabaseInsightResourceStatisticsAggregationCollection=")
                .append(
                        String.valueOf(
                                summarizeDatabaseInsightResourceStatisticsAggregationCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeDatabaseInsightResourceStatisticsResponse)) {
            return false;
        }

        SummarizeDatabaseInsightResourceStatisticsResponse other =
                (SummarizeDatabaseInsightResourceStatisticsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.summarizeDatabaseInsightResourceStatisticsAggregationCollection,
                        other.summarizeDatabaseInsightResourceStatisticsAggregationCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizeDatabaseInsightResourceStatisticsAggregationCollection
                                        == null
                                ? 43
                                : this
                                        .summarizeDatabaseInsightResourceStatisticsAggregationCollection
                                        .hashCode());
        return result;
    }
}
