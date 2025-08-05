/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.responses;

import com.oracle.bmc.multicloud.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class ListExternalLocationMappingMetadataResponse
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

    /** The returned {@code ExternalLocationMappingMetadatumSummaryCollection} instance. */
    private com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummaryCollection
            externalLocationMappingMetadatumSummaryCollection;

    /**
     * The returned {@code ExternalLocationMappingMetadatumSummaryCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummaryCollection
            getExternalLocationMappingMetadatumSummaryCollection() {
        return externalLocationMappingMetadatumSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "externalLocationMappingMetadatumSummaryCollection"
    })
    private ListExternalLocationMappingMetadataResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummaryCollection
                    externalLocationMappingMetadatumSummaryCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.externalLocationMappingMetadatumSummaryCollection =
                externalLocationMappingMetadatumSummaryCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListExternalLocationMappingMetadataResponse> {
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

        /** The returned {@code ExternalLocationMappingMetadatumSummaryCollection} instance. */
        private com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummaryCollection
                externalLocationMappingMetadatumSummaryCollection;

        /**
         * The returned {@code ExternalLocationMappingMetadatumSummaryCollection} instance.
         *
         * @param externalLocationMappingMetadatumSummaryCollection the value to set
         * @return this builder
         */
        public Builder externalLocationMappingMetadatumSummaryCollection(
                com.oracle.bmc.multicloud.model.ExternalLocationMappingMetadatumSummaryCollection
                        externalLocationMappingMetadatumSummaryCollection) {
            this.externalLocationMappingMetadatumSummaryCollection =
                    externalLocationMappingMetadatumSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListExternalLocationMappingMetadataResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            externalLocationMappingMetadatumSummaryCollection(
                    o.getExternalLocationMappingMetadatumSummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListExternalLocationMappingMetadataResponse build() {
            return new ListExternalLocationMappingMetadataResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    externalLocationMappingMetadatumSummaryCollection);
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
        sb.append(",externalLocationMappingMetadatumSummaryCollection=")
                .append(String.valueOf(externalLocationMappingMetadatumSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListExternalLocationMappingMetadataResponse)) {
            return false;
        }

        ListExternalLocationMappingMetadataResponse other =
                (ListExternalLocationMappingMetadataResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.externalLocationMappingMetadatumSummaryCollection,
                        other.externalLocationMappingMetadatumSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.externalLocationMappingMetadatumSummaryCollection == null
                                ? 43
                                : this.externalLocationMappingMetadatumSummaryCollection
                                        .hashCode());
        return result;
    }
}
