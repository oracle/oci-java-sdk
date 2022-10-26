/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetPdbConversionHistoryEntryResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned PdbConversionHistoryEntry instance. */
    private com.oracle.bmc.database.model.PdbConversionHistoryEntry pdbConversionHistoryEntry;

    /**
     * The returned PdbConversionHistoryEntry instance.
     *
     * @return the value
     */
    public com.oracle.bmc.database.model.PdbConversionHistoryEntry getPdbConversionHistoryEntry() {
        return pdbConversionHistoryEntry;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "pdbConversionHistoryEntry"
    })
    private GetPdbConversionHistoryEntryResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.database.model.PdbConversionHistoryEntry pdbConversionHistoryEntry) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.pdbConversionHistoryEntry = pdbConversionHistoryEntry;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetPdbConversionHistoryEntryResponse> {
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

        /** The returned PdbConversionHistoryEntry instance. */
        private com.oracle.bmc.database.model.PdbConversionHistoryEntry pdbConversionHistoryEntry;

        /**
         * The returned PdbConversionHistoryEntry instance.
         *
         * @param pdbConversionHistoryEntry the value to set
         * @return this builder
         */
        public Builder pdbConversionHistoryEntry(
                com.oracle.bmc.database.model.PdbConversionHistoryEntry pdbConversionHistoryEntry) {
            this.pdbConversionHistoryEntry = pdbConversionHistoryEntry;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetPdbConversionHistoryEntryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            pdbConversionHistoryEntry(o.getPdbConversionHistoryEntry());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetPdbConversionHistoryEntryResponse build() {
            return new GetPdbConversionHistoryEntryResponse(
                    __httpStatusCode__, headers, opcRequestId, pdbConversionHistoryEntry);
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
        sb.append(",pdbConversionHistoryEntry=").append(String.valueOf(pdbConversionHistoryEntry));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPdbConversionHistoryEntryResponse)) {
            return false;
        }

        GetPdbConversionHistoryEntryResponse other = (GetPdbConversionHistoryEntryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.pdbConversionHistoryEntry, other.pdbConversionHistoryEntry);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.pdbConversionHistoryEntry == null
                                ? 43
                                : this.pdbConversionHistoryEntry.hashCode());
        return result;
    }
}
