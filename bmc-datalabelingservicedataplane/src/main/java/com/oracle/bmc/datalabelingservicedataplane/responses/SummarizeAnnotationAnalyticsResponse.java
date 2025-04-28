/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.responses;

import com.oracle.bmc.datalabelingservicedataplane.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class SummarizeAnnotationAnalyticsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For the pagination of a list of items. When paging through a list, if this header appears in
     * the response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     */
    private String opcNextPage;

    /**
     * For the pagination of a list of items. When paging through a list, if this header appears in
     * the response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code AnnotationAnalyticsAggregationCollection} instance. */
    private com.oracle.bmc.datalabelingservicedataplane.model
                    .AnnotationAnalyticsAggregationCollection
            annotationAnalyticsAggregationCollection;

    /**
     * The returned {@code AnnotationAnalyticsAggregationCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datalabelingservicedataplane.model
                    .AnnotationAnalyticsAggregationCollection
            getAnnotationAnalyticsAggregationCollection() {
        return annotationAnalyticsAggregationCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "annotationAnalyticsAggregationCollection"
    })
    private SummarizeAnnotationAnalyticsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.datalabelingservicedataplane.model
                            .AnnotationAnalyticsAggregationCollection
                    annotationAnalyticsAggregationCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.annotationAnalyticsAggregationCollection = annotationAnalyticsAggregationCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    SummarizeAnnotationAnalyticsResponse> {
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
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For the pagination of a list of items. When paging through a list, if this header appears
         * in the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         */
        private String opcNextPage;

        /**
         * For the pagination of a list of items. When paging through a list, if this header appears
         * in the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code AnnotationAnalyticsAggregationCollection} instance. */
        private com.oracle.bmc.datalabelingservicedataplane.model
                        .AnnotationAnalyticsAggregationCollection
                annotationAnalyticsAggregationCollection;

        /**
         * The returned {@code AnnotationAnalyticsAggregationCollection} instance.
         *
         * @param annotationAnalyticsAggregationCollection the value to set
         * @return this builder
         */
        public Builder annotationAnalyticsAggregationCollection(
                com.oracle.bmc.datalabelingservicedataplane.model
                                .AnnotationAnalyticsAggregationCollection
                        annotationAnalyticsAggregationCollection) {
            this.annotationAnalyticsAggregationCollection =
                    annotationAnalyticsAggregationCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(SummarizeAnnotationAnalyticsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            annotationAnalyticsAggregationCollection(
                    o.getAnnotationAnalyticsAggregationCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public SummarizeAnnotationAnalyticsResponse build() {
            return new SummarizeAnnotationAnalyticsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    annotationAnalyticsAggregationCollection);
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
        sb.append(",annotationAnalyticsAggregationCollection=")
                .append(String.valueOf(annotationAnalyticsAggregationCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeAnnotationAnalyticsResponse)) {
            return false;
        }

        SummarizeAnnotationAnalyticsResponse other = (SummarizeAnnotationAnalyticsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.annotationAnalyticsAggregationCollection,
                        other.annotationAnalyticsAggregationCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.annotationAnalyticsAggregationCollection == null
                                ? 43
                                : this.annotationAnalyticsAggregationCollection.hashCode());
        return result;
    }
}
