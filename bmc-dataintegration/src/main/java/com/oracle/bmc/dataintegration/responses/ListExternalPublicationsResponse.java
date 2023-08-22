/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.responses;

import com.oracle.bmc.dataintegration.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class ListExternalPublicationsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Retrieves the next page of results. When this header appears in the response, additional
     * pages of results remain. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * Retrieves the next page of results. When this header appears in the response, additional
     * pages of results remain. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * Retrieves the previous page of results. When this header appears in the response, previous
     * pages of results exist. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcPrevPage;

    /**
     * Retrieves the previous page of results. When this header appears in the response, previous
     * pages of results exist. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /** Total items in the entire list. */
    private Integer opcTotalItems;

    /**
     * Total items in the entire list.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /** The returned {@code ExternalPublicationSummaryCollection} instance. */
    private com.oracle.bmc.dataintegration.model.ExternalPublicationSummaryCollection
            externalPublicationSummaryCollection;

    /**
     * The returned {@code ExternalPublicationSummaryCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dataintegration.model.ExternalPublicationSummaryCollection
            getExternalPublicationSummaryCollection() {
        return externalPublicationSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "opcPrevPage",
        "opcTotalItems",
        "externalPublicationSummaryCollection"
    })
    private ListExternalPublicationsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            String opcPrevPage,
            Integer opcTotalItems,
            com.oracle.bmc.dataintegration.model.ExternalPublicationSummaryCollection
                    externalPublicationSummaryCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
        this.opcTotalItems = opcTotalItems;
        this.externalPublicationSummaryCollection = externalPublicationSummaryCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListExternalPublicationsResponse> {
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
         * Retrieves the next page of results. When this header appears in the response, additional
         * pages of results remain. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * Retrieves the next page of results. When this header appears in the response, additional
         * pages of results remain. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * Retrieves the previous page of results. When this header appears in the response,
         * previous pages of results exist. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcPrevPage;

        /**
         * Retrieves the previous page of results. When this header appears in the response,
         * previous pages of results exist. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        /** Total items in the entire list. */
        private Integer opcTotalItems;

        /**
         * Total items in the entire list.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /** The returned {@code ExternalPublicationSummaryCollection} instance. */
        private com.oracle.bmc.dataintegration.model.ExternalPublicationSummaryCollection
                externalPublicationSummaryCollection;

        /**
         * The returned {@code ExternalPublicationSummaryCollection} instance.
         *
         * @param externalPublicationSummaryCollection the value to set
         * @return this builder
         */
        public Builder externalPublicationSummaryCollection(
                com.oracle.bmc.dataintegration.model.ExternalPublicationSummaryCollection
                        externalPublicationSummaryCollection) {
            this.externalPublicationSummaryCollection = externalPublicationSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListExternalPublicationsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            opcTotalItems(o.getOpcTotalItems());
            externalPublicationSummaryCollection(o.getExternalPublicationSummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListExternalPublicationsResponse build() {
            return new ListExternalPublicationsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    opcPrevPage,
                    opcTotalItems,
                    externalPublicationSummaryCollection);
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
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",externalPublicationSummaryCollection=")
                .append(String.valueOf(externalPublicationSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListExternalPublicationsResponse)) {
            return false;
        }

        ListExternalPublicationsResponse other = (ListExternalPublicationsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(
                        this.externalPublicationSummaryCollection,
                        other.externalPublicationSummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result =
                (result * PRIME)
                        + (this.externalPublicationSummaryCollection == null
                                ? 43
                                : this.externalPublicationSummaryCollection.hashCode());
        return result;
    }
}
