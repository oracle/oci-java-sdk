/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeExadataInsightResourceForecastTrendResponse
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

    /** The returned SummarizeExadataInsightResourceForecastTrendCollection instance. */
    private com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendCollection
            summarizeExadataInsightResourceForecastTrendCollection;

    /**
     * The returned SummarizeExadataInsightResourceForecastTrendCollection instance.
     *
     * @return the value
     */
    public com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendCollection
            getSummarizeExadataInsightResourceForecastTrendCollection() {
        return summarizeExadataInsightResourceForecastTrendCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "summarizeExadataInsightResourceForecastTrendCollection"
    })
    private SummarizeExadataInsightResourceForecastTrendResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendCollection
                    summarizeExadataInsightResourceForecastTrendCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.summarizeExadataInsightResourceForecastTrendCollection =
                summarizeExadataInsightResourceForecastTrendCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    SummarizeExadataInsightResourceForecastTrendResponse> {
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

        /** The returned SummarizeExadataInsightResourceForecastTrendCollection instance. */
        private com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendCollection
                summarizeExadataInsightResourceForecastTrendCollection;

        /**
         * The returned SummarizeExadataInsightResourceForecastTrendCollection instance.
         *
         * @param summarizeExadataInsightResourceForecastTrendCollection the value to set
         * @return this builder
         */
        public Builder summarizeExadataInsightResourceForecastTrendCollection(
                com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceForecastTrendCollection
                        summarizeExadataInsightResourceForecastTrendCollection) {
            this.summarizeExadataInsightResourceForecastTrendCollection =
                    summarizeExadataInsightResourceForecastTrendCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(SummarizeExadataInsightResourceForecastTrendResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            summarizeExadataInsightResourceForecastTrendCollection(
                    o.getSummarizeExadataInsightResourceForecastTrendCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public SummarizeExadataInsightResourceForecastTrendResponse build() {
            return new SummarizeExadataInsightResourceForecastTrendResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    summarizeExadataInsightResourceForecastTrendCollection);
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
        sb.append(",summarizeExadataInsightResourceForecastTrendCollection=")
                .append(String.valueOf(summarizeExadataInsightResourceForecastTrendCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeExadataInsightResourceForecastTrendResponse)) {
            return false;
        }

        SummarizeExadataInsightResourceForecastTrendResponse other =
                (SummarizeExadataInsightResourceForecastTrendResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.summarizeExadataInsightResourceForecastTrendCollection,
                        other.summarizeExadataInsightResourceForecastTrendCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizeExadataInsightResourceForecastTrendCollection == null
                                ? 43
                                : this.summarizeExadataInsightResourceForecastTrendCollection
                                        .hashCode());
        return result;
    }
}
