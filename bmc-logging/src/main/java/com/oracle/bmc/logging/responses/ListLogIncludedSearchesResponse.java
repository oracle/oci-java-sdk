/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.responses;

import com.oracle.bmc.logging.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class ListLogIncludedSearchesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For list pagination. When this header appears in the response, additional pages
     * of results remain. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * For list pagination. When this header appears in the response, previous pages
     * of results exist. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPreviousPage;

    public String getOpcPreviousPage() {
        return opcPreviousPage;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned LogIncludedSearchSummaryCollection instance.
     */
    private com.oracle.bmc.logging.model.LogIncludedSearchSummaryCollection
            logIncludedSearchSummaryCollection;

    public com.oracle.bmc.logging.model.LogIncludedSearchSummaryCollection
            getLogIncludedSearchSummaryCollection() {
        return logIncludedSearchSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcPreviousPage",
        "opcRequestId",
        "logIncludedSearchSummaryCollection"
    })
    private ListLogIncludedSearchesResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcPreviousPage,
            String opcRequestId,
            com.oracle.bmc.logging.model.LogIncludedSearchSummaryCollection
                    logIncludedSearchSummaryCollection) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcPreviousPage = opcPreviousPage;
        this.opcRequestId = opcRequestId;
        this.logIncludedSearchSummaryCollection = logIncludedSearchSummaryCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcNextPage;

        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        private String opcPreviousPage;

        public Builder opcPreviousPage(String opcPreviousPage) {
            this.opcPreviousPage = opcPreviousPage;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.logging.model.LogIncludedSearchSummaryCollection
                logIncludedSearchSummaryCollection;

        public Builder logIncludedSearchSummaryCollection(
                com.oracle.bmc.logging.model.LogIncludedSearchSummaryCollection
                        logIncludedSearchSummaryCollection) {
            this.logIncludedSearchSummaryCollection = logIncludedSearchSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListLogIncludedSearchesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcPreviousPage(o.getOpcPreviousPage());
            opcRequestId(o.getOpcRequestId());
            logIncludedSearchSummaryCollection(o.getLogIncludedSearchSummaryCollection());

            return this;
        }

        public ListLogIncludedSearchesResponse build() {
            return new ListLogIncludedSearchesResponse(
                    __httpStatusCode__,
                    opcNextPage,
                    opcPreviousPage,
                    opcRequestId,
                    logIncludedSearchSummaryCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcPreviousPage=").append(String.valueOf(opcPreviousPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",logIncludedSearchSummaryCollection=")
                .append(String.valueOf(logIncludedSearchSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListLogIncludedSearchesResponse)) {
            return false;
        }

        ListLogIncludedSearchesResponse other = (ListLogIncludedSearchesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPreviousPage, other.opcPreviousPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.logIncludedSearchSummaryCollection,
                        other.logIncludedSearchSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.opcPreviousPage == null ? 43 : this.opcPreviousPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.logIncludedSearchSummaryCollection == null
                                ? 43
                                : this.logIncludedSearchSummaryCollection.hashCode());
        return result;
    }
}
