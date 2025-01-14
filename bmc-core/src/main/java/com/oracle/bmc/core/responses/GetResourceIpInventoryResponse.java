/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.responses;

import com.oracle.bmc.core.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetResourceIpInventoryResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
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

    /** For list pagination. A pagination token to get the total number of results available. */
    private Integer opcTotalItems;

    /**
     * For list pagination. A pagination token to get the total number of results available.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /** The returned {@code IpInventoryCollection} instance. */
    private com.oracle.bmc.core.model.IpInventoryCollection ipInventoryCollection;

    /**
     * The returned {@code IpInventoryCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.core.model.IpInventoryCollection getIpInventoryCollection() {
        return ipInventoryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcNextPage",
        "opcRequestId",
        "opcTotalItems",
        "ipInventoryCollection"
    })
    private GetResourceIpInventoryResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcNextPage,
            String opcRequestId,
            Integer opcTotalItems,
            com.oracle.bmc.core.model.IpInventoryCollection ipInventoryCollection) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.opcTotalItems = opcTotalItems;
        this.ipInventoryCollection = ipInventoryCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetResourceIpInventoryResponse> {
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
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
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

        /** For list pagination. A pagination token to get the total number of results available. */
        private Integer opcTotalItems;

        /**
         * For list pagination. A pagination token to get the total number of results available.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /** The returned {@code IpInventoryCollection} instance. */
        private com.oracle.bmc.core.model.IpInventoryCollection ipInventoryCollection;

        /**
         * The returned {@code IpInventoryCollection} instance.
         *
         * @param ipInventoryCollection the value to set
         * @return this builder
         */
        public Builder ipInventoryCollection(
                com.oracle.bmc.core.model.IpInventoryCollection ipInventoryCollection) {
            this.ipInventoryCollection = ipInventoryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetResourceIpInventoryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            opcTotalItems(o.getOpcTotalItems());
            ipInventoryCollection(o.getIpInventoryCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetResourceIpInventoryResponse build() {
            return new GetResourceIpInventoryResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcNextPage,
                    opcRequestId,
                    opcTotalItems,
                    ipInventoryCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",ipInventoryCollection=").append(String.valueOf(ipInventoryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetResourceIpInventoryResponse)) {
            return false;
        }

        GetResourceIpInventoryResponse other = (GetResourceIpInventoryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(
                        this.ipInventoryCollection, other.ipInventoryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result =
                (result * PRIME)
                        + (this.ipInventoryCollection == null
                                ? 43
                                : this.ipInventoryCollection.hashCode());
        return result;
    }
}
