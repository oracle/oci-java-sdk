/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.responses;

import com.oracle.bmc.datasafe.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListCryptoAssessmentFindingsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. Include opc-next-page value as the page parameter for the subsequent GET request to
     * get the next batch of items. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. Include opc-next-page value as the page parameter for the subsequent GET request to
     * get the next batch of items. For details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code CryptoAssessmentFindingCollection} instance. */
    private com.oracle.bmc.datasafe.model.CryptoAssessmentFindingCollection
            cryptoAssessmentFindingCollection;

    /**
     * The returned {@code CryptoAssessmentFindingCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datasafe.model.CryptoAssessmentFindingCollection
            getCryptoAssessmentFindingCollection() {
        return cryptoAssessmentFindingCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "cryptoAssessmentFindingCollection"
    })
    private ListCryptoAssessmentFindingsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.datasafe.model.CryptoAssessmentFindingCollection
                    cryptoAssessmentFindingCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.cryptoAssessmentFindingCollection = cryptoAssessmentFindingCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListCryptoAssessmentFindingsResponse> {
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
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. Include opc-next-page value as the page parameter for the subsequent GET
         * request to get the next batch of items. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. Include opc-next-page value as the page parameter for the subsequent GET
         * request to get the next batch of items. For details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code CryptoAssessmentFindingCollection} instance. */
        private com.oracle.bmc.datasafe.model.CryptoAssessmentFindingCollection
                cryptoAssessmentFindingCollection;

        /**
         * The returned {@code CryptoAssessmentFindingCollection} instance.
         *
         * @param cryptoAssessmentFindingCollection the value to set
         * @return this builder
         */
        public Builder cryptoAssessmentFindingCollection(
                com.oracle.bmc.datasafe.model.CryptoAssessmentFindingCollection
                        cryptoAssessmentFindingCollection) {
            this.cryptoAssessmentFindingCollection = cryptoAssessmentFindingCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListCryptoAssessmentFindingsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            cryptoAssessmentFindingCollection(o.getCryptoAssessmentFindingCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListCryptoAssessmentFindingsResponse build() {
            return new ListCryptoAssessmentFindingsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    cryptoAssessmentFindingCollection);
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
        sb.append(",cryptoAssessmentFindingCollection=")
                .append(String.valueOf(cryptoAssessmentFindingCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCryptoAssessmentFindingsResponse)) {
            return false;
        }

        ListCryptoAssessmentFindingsResponse other = (ListCryptoAssessmentFindingsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.cryptoAssessmentFindingCollection,
                        other.cryptoAssessmentFindingCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.cryptoAssessmentFindingCollection == null
                                ? 43
                                : this.cryptoAssessmentFindingCollection.hashCode());
        return result;
    }
}
