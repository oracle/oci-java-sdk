/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.responses;

import com.oracle.bmc.generativeai.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class ListVectorStoreConnectorFileSyncIngestionLogsResponse
        extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code FileSyncIngestionLogsCollection} instance. */
    private com.oracle.bmc.generativeai.model.FileSyncIngestionLogsCollection
            fileSyncIngestionLogsCollection;

    /**
     * The returned {@code FileSyncIngestionLogsCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.generativeai.model.FileSyncIngestionLogsCollection
            getFileSyncIngestionLogsCollection() {
        return fileSyncIngestionLogsCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcNextPage",
        "opcRequestId",
        "fileSyncIngestionLogsCollection"
    })
    private ListVectorStoreConnectorFileSyncIngestionLogsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.generativeai.model.FileSyncIngestionLogsCollection
                    fileSyncIngestionLogsCollection) {
        super(__httpStatusCode__, headers);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.fileSyncIngestionLogsCollection = fileSyncIngestionLogsCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListVectorStoreConnectorFileSyncIngestionLogsResponse> {
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

        /** The returned {@code FileSyncIngestionLogsCollection} instance. */
        private com.oracle.bmc.generativeai.model.FileSyncIngestionLogsCollection
                fileSyncIngestionLogsCollection;

        /**
         * The returned {@code FileSyncIngestionLogsCollection} instance.
         *
         * @param fileSyncIngestionLogsCollection the value to set
         * @return this builder
         */
        public Builder fileSyncIngestionLogsCollection(
                com.oracle.bmc.generativeai.model.FileSyncIngestionLogsCollection
                        fileSyncIngestionLogsCollection) {
            this.fileSyncIngestionLogsCollection = fileSyncIngestionLogsCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListVectorStoreConnectorFileSyncIngestionLogsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            fileSyncIngestionLogsCollection(o.getFileSyncIngestionLogsCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListVectorStoreConnectorFileSyncIngestionLogsResponse build() {
            return new ListVectorStoreConnectorFileSyncIngestionLogsResponse(
                    __httpStatusCode__,
                    headers,
                    opcNextPage,
                    opcRequestId,
                    fileSyncIngestionLogsCollection);
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
        sb.append(",fileSyncIngestionLogsCollection=")
                .append(String.valueOf(fileSyncIngestionLogsCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListVectorStoreConnectorFileSyncIngestionLogsResponse)) {
            return false;
        }

        ListVectorStoreConnectorFileSyncIngestionLogsResponse other =
                (ListVectorStoreConnectorFileSyncIngestionLogsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.fileSyncIngestionLogsCollection,
                        other.fileSyncIngestionLogsCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.fileSyncIngestionLogsCollection == null
                                ? 43
                                : this.fileSyncIngestionLogsCollection.hashCode());
        return result;
    }
}
