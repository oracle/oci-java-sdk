/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.responses;

import com.oracle.bmc.dbmulticloud.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class ListOracleDbAzureVaultAssociationsResponse
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

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * For list pagination. When this header appears in the response, additional pages of results
     * remain. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned {@code OracleDbAzureVaultAssociationSummaryCollection} instance. */
    private com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociationSummaryCollection
            oracleDbAzureVaultAssociationSummaryCollection;

    /**
     * The returned {@code OracleDbAzureVaultAssociationSummaryCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociationSummaryCollection
            getOracleDbAzureVaultAssociationSummaryCollection() {
        return oracleDbAzureVaultAssociationSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "oracleDbAzureVaultAssociationSummaryCollection"
    })
    private ListOracleDbAzureVaultAssociationsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociationSummaryCollection
                    oracleDbAzureVaultAssociationSummaryCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.oracleDbAzureVaultAssociationSummaryCollection =
                oracleDbAzureVaultAssociationSummaryCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListOracleDbAzureVaultAssociationsResponse> {
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
         * results remain. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * For list pagination. When this header appears in the response, additional pages of
         * results remain. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned {@code OracleDbAzureVaultAssociationSummaryCollection} instance. */
        private com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociationSummaryCollection
                oracleDbAzureVaultAssociationSummaryCollection;

        /**
         * The returned {@code OracleDbAzureVaultAssociationSummaryCollection} instance.
         *
         * @param oracleDbAzureVaultAssociationSummaryCollection the value to set
         * @return this builder
         */
        public Builder oracleDbAzureVaultAssociationSummaryCollection(
                com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociationSummaryCollection
                        oracleDbAzureVaultAssociationSummaryCollection) {
            this.oracleDbAzureVaultAssociationSummaryCollection =
                    oracleDbAzureVaultAssociationSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListOracleDbAzureVaultAssociationsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            oracleDbAzureVaultAssociationSummaryCollection(
                    o.getOracleDbAzureVaultAssociationSummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListOracleDbAzureVaultAssociationsResponse build() {
            return new ListOracleDbAzureVaultAssociationsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    oracleDbAzureVaultAssociationSummaryCollection);
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
        sb.append(",oracleDbAzureVaultAssociationSummaryCollection=")
                .append(String.valueOf(oracleDbAzureVaultAssociationSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListOracleDbAzureVaultAssociationsResponse)) {
            return false;
        }

        ListOracleDbAzureVaultAssociationsResponse other =
                (ListOracleDbAzureVaultAssociationsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.oracleDbAzureVaultAssociationSummaryCollection,
                        other.oracleDbAzureVaultAssociationSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleDbAzureVaultAssociationSummaryCollection == null
                                ? 43
                                : this.oracleDbAzureVaultAssociationSummaryCollection.hashCode());
        return result;
    }
}
