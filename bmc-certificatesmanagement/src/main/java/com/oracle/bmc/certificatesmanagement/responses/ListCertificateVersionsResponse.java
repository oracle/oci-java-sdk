/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.responses;

import com.oracle.bmc.certificatesmanagement.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class ListCertificateVersionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then there are additional items still to get. Include this value as the {@code
     * page} parameter for the subsequent GET request. For information about pagination, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then there are additional items still to get. Include this value as the {@code
     * page} parameter for the subsequent GET request. For information about pagination, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
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

    /** The returned {@code CertificateVersionCollection} instance. */
    private com.oracle.bmc.certificatesmanagement.model.CertificateVersionCollection
            certificateVersionCollection;

    /**
     * The returned {@code CertificateVersionCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.certificatesmanagement.model.CertificateVersionCollection
            getCertificateVersionCollection() {
        return certificateVersionCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcNextPage",
        "opcRequestId",
        "certificateVersionCollection"
    })
    private ListCertificateVersionsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.certificatesmanagement.model.CertificateVersionCollection
                    certificateVersionCollection) {
        super(__httpStatusCode__, headers);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.certificateVersionCollection = certificateVersionCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListCertificateVersionsResponse> {
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
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then there are additional items still to get. Include this value as the
         * {@code page} parameter for the subsequent GET request. For information about pagination,
         * see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then there are additional items still to get. Include this value as the
         * {@code page} parameter for the subsequent GET request. For information about pagination,
         * see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
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

        /** The returned {@code CertificateVersionCollection} instance. */
        private com.oracle.bmc.certificatesmanagement.model.CertificateVersionCollection
                certificateVersionCollection;

        /**
         * The returned {@code CertificateVersionCollection} instance.
         *
         * @param certificateVersionCollection the value to set
         * @return this builder
         */
        public Builder certificateVersionCollection(
                com.oracle.bmc.certificatesmanagement.model.CertificateVersionCollection
                        certificateVersionCollection) {
            this.certificateVersionCollection = certificateVersionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListCertificateVersionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            certificateVersionCollection(o.getCertificateVersionCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListCertificateVersionsResponse build() {
            return new ListCertificateVersionsResponse(
                    __httpStatusCode__,
                    headers,
                    opcNextPage,
                    opcRequestId,
                    certificateVersionCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",certificateVersionCollection=")
                .append(String.valueOf(certificateVersionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCertificateVersionsResponse)) {
            return false;
        }

        ListCertificateVersionsResponse other = (ListCertificateVersionsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.certificateVersionCollection, other.certificateVersionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateVersionCollection == null
                                ? 43
                                : this.certificateVersionCollection.hashCode());
        return result;
    }
}
