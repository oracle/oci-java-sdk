/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.responses;

import com.oracle.bmc.ospgateway.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class ListInvoiceLinesResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /**
     * For list pagination. If this header appears in the response, then this is a partial list of
     * invoices. Include this value as the {@code page} parameter in a subsequent GET request to get
     * the next batch of invoices.
     */
    private String opcNextPage;

    /**
     * For list pagination. If this header appears in the response, then this is a partial list of
     * invoices. Include this value as the {@code page} parameter in a subsequent GET request to get
     * the next batch of invoices.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The total number of items that match the query. */
    private Integer opcTotalItems;

    /**
     * The total number of items that match the query.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /** The returned {@code InvoiceLineCollection} instance. */
    private com.oracle.bmc.ospgateway.model.InvoiceLineCollection invoiceLineCollection;

    /**
     * The returned {@code InvoiceLineCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.ospgateway.model.InvoiceLineCollection getInvoiceLineCollection() {
        return invoiceLineCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "opcNextPage",
        "opcTotalItems",
        "invoiceLineCollection"
    })
    private ListInvoiceLinesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String opcNextPage,
            Integer opcTotalItems,
            com.oracle.bmc.ospgateway.model.InvoiceLineCollection invoiceLineCollection) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcTotalItems = opcTotalItems;
        this.invoiceLineCollection = invoiceLineCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListInvoiceLinesResponse> {
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

        /**
         * For list pagination. If this header appears in the response, then this is a partial list
         * of invoices. Include this value as the {@code page} parameter in a subsequent GET request
         * to get the next batch of invoices.
         */
        private String opcNextPage;

        /**
         * For list pagination. If this header appears in the response, then this is a partial list
         * of invoices. Include this value as the {@code page} parameter in a subsequent GET request
         * to get the next batch of invoices.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The total number of items that match the query. */
        private Integer opcTotalItems;

        /**
         * The total number of items that match the query.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /** The returned {@code InvoiceLineCollection} instance. */
        private com.oracle.bmc.ospgateway.model.InvoiceLineCollection invoiceLineCollection;

        /**
         * The returned {@code InvoiceLineCollection} instance.
         *
         * @param invoiceLineCollection the value to set
         * @return this builder
         */
        public Builder invoiceLineCollection(
                com.oracle.bmc.ospgateway.model.InvoiceLineCollection invoiceLineCollection) {
            this.invoiceLineCollection = invoiceLineCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListInvoiceLinesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcTotalItems(o.getOpcTotalItems());
            invoiceLineCollection(o.getInvoiceLineCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListInvoiceLinesResponse build() {
            return new ListInvoiceLinesResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    opcNextPage,
                    opcTotalItems,
                    invoiceLineCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",invoiceLineCollection=").append(String.valueOf(invoiceLineCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListInvoiceLinesResponse)) {
            return false;
        }

        ListInvoiceLinesResponse other = (ListInvoiceLinesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(
                        this.invoiceLineCollection, other.invoiceLineCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result =
                (result * PRIME)
                        + (this.invoiceLineCollection == null
                                ? 43
                                : this.invoiceLineCollection.hashCode());
        return result;
    }
}
