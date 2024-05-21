/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.responses;

import com.oracle.bmc.stackmonitoring.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class ListBaselineableMetricsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
     */
    private Integer retryAfter;

    /**
     * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
     * @return the value
     */
    public Integer getRetryAfter() {
        return retryAfter;
    }

    /**
     * The returned BaselineableMetricSummaryCollection instance.
     */
    private com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummaryCollection
            baselineableMetricSummaryCollection;

    /**
     * The returned BaselineableMetricSummaryCollection instance.
     * @return the value
     */
    public com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummaryCollection
            getBaselineableMetricSummaryCollection() {
        return baselineableMetricSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "retryAfter",
        "baselineableMetricSummaryCollection"
    })
    private ListBaselineableMetricsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            Integer retryAfter,
            com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummaryCollection
                    baselineableMetricSummaryCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.retryAfter = retryAfter;
        this.baselineableMetricSummaryCollection = baselineableMetricSummaryCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
         */
        private Integer retryAfter;

        /**
         * A decimal number representing the number of seconds the client should wait before polling this endpoint again.
         * @param retryAfter the value to set
         * @return this builder
         */
        public Builder retryAfter(Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        /**
         * The returned BaselineableMetricSummaryCollection instance.
         */
        private com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummaryCollection
                baselineableMetricSummaryCollection;

        /**
         * The returned BaselineableMetricSummaryCollection instance.
         * @param baselineableMetricSummaryCollection the value to set
         * @return this builder
         */
        public Builder baselineableMetricSummaryCollection(
                com.oracle.bmc.stackmonitoring.model.BaselineableMetricSummaryCollection
                        baselineableMetricSummaryCollection) {
            this.baselineableMetricSummaryCollection = baselineableMetricSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListBaselineableMetricsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            retryAfter(o.getRetryAfter());
            baselineableMetricSummaryCollection(o.getBaselineableMetricSummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListBaselineableMetricsResponse build() {
            return new ListBaselineableMetricsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    retryAfter,
                    baselineableMetricSummaryCollection);
        }
    }

    /**
     * Return a new builder for this response object.
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
        sb.append(",retryAfter=").append(String.valueOf(retryAfter));
        sb.append(",baselineableMetricSummaryCollection=")
                .append(String.valueOf(baselineableMetricSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListBaselineableMetricsResponse)) {
            return false;
        }

        ListBaselineableMetricsResponse other = (ListBaselineableMetricsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(
                        this.baselineableMetricSummaryCollection,
                        other.baselineableMetricSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result =
                (result * PRIME)
                        + (this.baselineableMetricSummaryCollection == null
                                ? 43
                                : this.baselineableMetricSummaryCollection.hashCode());
        return result;
    }
}
