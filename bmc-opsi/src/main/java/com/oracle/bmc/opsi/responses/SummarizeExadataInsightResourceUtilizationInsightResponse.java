/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeExadataInsightResourceUtilizationInsightResponse
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

    /** For pagination of a list of items. The total number of items in the result. */
    private Integer opcTotalItems;

    /**
     * For pagination of a list of items. The total number of items in the result.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
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
     * The returned {@code SummarizeExadataInsightResourceUtilizationInsightAggregation} instance.
     */
    private com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUtilizationInsightAggregation
            summarizeExadataInsightResourceUtilizationInsightAggregation;

    /**
     * The returned {@code SummarizeExadataInsightResourceUtilizationInsightAggregation} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUtilizationInsightAggregation
            getSummarizeExadataInsightResourceUtilizationInsightAggregation() {
        return summarizeExadataInsightResourceUtilizationInsightAggregation;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcTotalItems",
        "opcNextPage",
        "summarizeExadataInsightResourceUtilizationInsightAggregation"
    })
    private SummarizeExadataInsightResourceUtilizationInsightResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            Integer opcTotalItems,
            String opcNextPage,
            com.oracle.bmc.opsi.model.SummarizeExadataInsightResourceUtilizationInsightAggregation
                    summarizeExadataInsightResourceUtilizationInsightAggregation) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcTotalItems = opcTotalItems;
        this.opcNextPage = opcNextPage;
        this.summarizeExadataInsightResourceUtilizationInsightAggregation =
                summarizeExadataInsightResourceUtilizationInsightAggregation;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    SummarizeExadataInsightResourceUtilizationInsightResponse> {
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

        /** For pagination of a list of items. The total number of items in the result. */
        private Integer opcTotalItems;

        /**
         * For pagination of a list of items. The total number of items in the result.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
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
         * The returned {@code SummarizeExadataInsightResourceUtilizationInsightAggregation}
         * instance.
         */
        private com.oracle.bmc.opsi.model
                        .SummarizeExadataInsightResourceUtilizationInsightAggregation
                summarizeExadataInsightResourceUtilizationInsightAggregation;

        /**
         * The returned {@code SummarizeExadataInsightResourceUtilizationInsightAggregation}
         * instance.
         *
         * @param summarizeExadataInsightResourceUtilizationInsightAggregation the value to set
         * @return this builder
         */
        public Builder summarizeExadataInsightResourceUtilizationInsightAggregation(
                com.oracle.bmc.opsi.model
                                .SummarizeExadataInsightResourceUtilizationInsightAggregation
                        summarizeExadataInsightResourceUtilizationInsightAggregation) {
            this.summarizeExadataInsightResourceUtilizationInsightAggregation =
                    summarizeExadataInsightResourceUtilizationInsightAggregation;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(SummarizeExadataInsightResourceUtilizationInsightResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcTotalItems(o.getOpcTotalItems());
            opcNextPage(o.getOpcNextPage());
            summarizeExadataInsightResourceUtilizationInsightAggregation(
                    o.getSummarizeExadataInsightResourceUtilizationInsightAggregation());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public SummarizeExadataInsightResourceUtilizationInsightResponse build() {
            return new SummarizeExadataInsightResourceUtilizationInsightResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcTotalItems,
                    opcNextPage,
                    summarizeExadataInsightResourceUtilizationInsightAggregation);
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
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",summarizeExadataInsightResourceUtilizationInsightAggregation=")
                .append(
                        String.valueOf(
                                summarizeExadataInsightResourceUtilizationInsightAggregation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeExadataInsightResourceUtilizationInsightResponse)) {
            return false;
        }

        SummarizeExadataInsightResourceUtilizationInsightResponse other =
                (SummarizeExadataInsightResourceUtilizationInsightResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.summarizeExadataInsightResourceUtilizationInsightAggregation,
                        other.summarizeExadataInsightResourceUtilizationInsightAggregation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.summarizeExadataInsightResourceUtilizationInsightAggregation == null
                                ? 43
                                : this.summarizeExadataInsightResourceUtilizationInsightAggregation
                                        .hashCode());
        return result;
    }
}
