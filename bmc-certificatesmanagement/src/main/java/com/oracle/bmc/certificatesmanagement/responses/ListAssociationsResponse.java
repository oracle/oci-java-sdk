/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.responses;

import com.oracle.bmc.certificatesmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public class ListAssociationsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
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
     * The returned AssociationCollection instance.
     */
    private com.oracle.bmc.certificatesmanagement.model.AssociationCollection associationCollection;

    /**
     * The returned AssociationCollection instance.
     * @return the value
     */
    public com.oracle.bmc.certificatesmanagement.model.AssociationCollection
            getAssociationCollection() {
        return associationCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "opcNextPage",
        "associationCollection"
    })
    private ListAssociationsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.certificatesmanagement.model.AssociationCollection
                    associationCollection) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.associationCollection = associationCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
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
         * The returned AssociationCollection instance.
         */
        private com.oracle.bmc.certificatesmanagement.model.AssociationCollection
                associationCollection;

        /**
         * The returned AssociationCollection instance.
         * @param associationCollection the value to set
         * @return this builder
         */
        public Builder associationCollection(
                com.oracle.bmc.certificatesmanagement.model.AssociationCollection
                        associationCollection) {
            this.associationCollection = associationCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListAssociationsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            associationCollection(o.getAssociationCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListAssociationsResponse build() {
            return new ListAssociationsResponse(
                    __httpStatusCode__, opcRequestId, opcNextPage, associationCollection);
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
        sb.append(",associationCollection=").append(String.valueOf(associationCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAssociationsResponse)) {
            return false;
        }

        ListAssociationsResponse other = (ListAssociationsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.associationCollection, other.associationCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.associationCollection == null
                                ? 43
                                : this.associationCollection.hashCode());
        return result;
    }
}
