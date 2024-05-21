/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.responses;

import com.oracle.bmc.aianomalydetection.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class ListDetectAnomalyJobsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * precedent GET request to get the previous batch of items.
     *
     */
    private String opcPrevPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * precedent GET request to get the previous batch of items.
     *
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
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
     * The returned DetectAnomalyJobCollection instance.
     */
    private com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobCollection
            detectAnomalyJobCollection;

    /**
     * The returned DetectAnomalyJobCollection instance.
     * @return the value
     */
    public com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobCollection
            getDetectAnomalyJobCollection() {
        return detectAnomalyJobCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcPrevPage",
        "opcNextPage",
        "detectAnomalyJobCollection"
    })
    private ListDetectAnomalyJobsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcPrevPage,
            String opcNextPage,
            com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobCollection
                    detectAnomalyJobCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcPrevPage = opcPrevPage;
        this.opcNextPage = opcNextPage;
        this.detectAnomalyJobCollection = detectAnomalyJobCollection;
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
         * precedent GET request to get the previous batch of items.
         *
         */
        private String opcPrevPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * precedent GET request to get the previous batch of items.
         *
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
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
         * The returned DetectAnomalyJobCollection instance.
         */
        private com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobCollection
                detectAnomalyJobCollection;

        /**
         * The returned DetectAnomalyJobCollection instance.
         * @param detectAnomalyJobCollection the value to set
         * @return this builder
         */
        public Builder detectAnomalyJobCollection(
                com.oracle.bmc.aianomalydetection.model.DetectAnomalyJobCollection
                        detectAnomalyJobCollection) {
            this.detectAnomalyJobCollection = detectAnomalyJobCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListDetectAnomalyJobsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcPrevPage(o.getOpcPrevPage());
            opcNextPage(o.getOpcNextPage());
            detectAnomalyJobCollection(o.getDetectAnomalyJobCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListDetectAnomalyJobsResponse build() {
            return new ListDetectAnomalyJobsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcPrevPage,
                    opcNextPage,
                    detectAnomalyJobCollection);
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
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",detectAnomalyJobCollection=")
                .append(String.valueOf(detectAnomalyJobCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDetectAnomalyJobsResponse)) {
            return false;
        }

        ListDetectAnomalyJobsResponse other = (ListDetectAnomalyJobsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.detectAnomalyJobCollection, other.detectAnomalyJobCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.detectAnomalyJobCollection == null
                                ? 43
                                : this.detectAnomalyJobCollection.hashCode());
        return result;
    }
}
