/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.responses;

import com.oracle.bmc.certificatesmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class ListCertificateAuthorityVersionsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then there are additional items still to get. Include this value as the {@code page} parameter for the
     * subsequent GET request. For information about pagination, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then there are additional items still to get. Include this value as the {@code page} parameter for the
     * subsequent GET request. For information about pagination, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned CertificateAuthorityVersionCollection instance.
     */
    private com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionCollection
            certificateAuthorityVersionCollection;

    /**
     * The returned CertificateAuthorityVersionCollection instance.
     * @return the value
     */
    public com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionCollection
            getCertificateAuthorityVersionCollection() {
        return certificateAuthorityVersionCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "certificateAuthorityVersionCollection"
    })
    private ListCertificateAuthorityVersionsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionCollection
                    certificateAuthorityVersionCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.certificateAuthorityVersionCollection = certificateAuthorityVersionCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
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
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then there are additional items still to get. Include this value as the {@code page} parameter for the
         * subsequent GET request. For information about pagination, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
         *
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then there are additional items still to get. Include this value as the {@code page} parameter for the
         * subsequent GET request. For information about pagination, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#List_Pagination).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned CertificateAuthorityVersionCollection instance.
         */
        private com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionCollection
                certificateAuthorityVersionCollection;

        /**
         * The returned CertificateAuthorityVersionCollection instance.
         * @param certificateAuthorityVersionCollection the value to set
         * @return this builder
         */
        public Builder certificateAuthorityVersionCollection(
                com.oracle.bmc.certificatesmanagement.model.CertificateAuthorityVersionCollection
                        certificateAuthorityVersionCollection) {
            this.certificateAuthorityVersionCollection = certificateAuthorityVersionCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListCertificateAuthorityVersionsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            certificateAuthorityVersionCollection(o.getCertificateAuthorityVersionCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListCertificateAuthorityVersionsResponse build() {
            return new ListCertificateAuthorityVersionsResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    opcNextPage,
                    certificateAuthorityVersionCollection);
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
        sb.append(",certificateAuthorityVersionCollection=")
                .append(String.valueOf(certificateAuthorityVersionCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCertificateAuthorityVersionsResponse)) {
            return false;
        }

        ListCertificateAuthorityVersionsResponse other =
                (ListCertificateAuthorityVersionsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.certificateAuthorityVersionCollection,
                        other.certificateAuthorityVersionCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityVersionCollection == null
                                ? 43
                                : this.certificateAuthorityVersionCollection.hashCode());
        return result;
    }
}
