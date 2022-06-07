/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetPdbConversionHistoryEntryResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned PdbConversionHistoryEntry instance.
     */
    private com.oracle.bmc.database.model.PdbConversionHistoryEntry pdbConversionHistoryEntry;

    public com.oracle.bmc.database.model.PdbConversionHistoryEntry getPdbConversionHistoryEntry() {
        return pdbConversionHistoryEntry;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "pdbConversionHistoryEntry"
    })
    private GetPdbConversionHistoryEntryResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.database.model.PdbConversionHistoryEntry pdbConversionHistoryEntry) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.pdbConversionHistoryEntry = pdbConversionHistoryEntry;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.database.model.PdbConversionHistoryEntry pdbConversionHistoryEntry;

        public Builder pdbConversionHistoryEntry(
                com.oracle.bmc.database.model.PdbConversionHistoryEntry pdbConversionHistoryEntry) {
            this.pdbConversionHistoryEntry = pdbConversionHistoryEntry;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetPdbConversionHistoryEntryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            pdbConversionHistoryEntry(o.getPdbConversionHistoryEntry());

            return this;
        }

        public GetPdbConversionHistoryEntryResponse build() {
            return new GetPdbConversionHistoryEntryResponse(
                    __httpStatusCode__, opcRequestId, pdbConversionHistoryEntry);
        }
    }

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
