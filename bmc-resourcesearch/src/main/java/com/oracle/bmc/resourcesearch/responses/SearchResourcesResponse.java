/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcesearch.responses;

import com.oracle.bmc.resourcesearch.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180409")
public class SearchResourcesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then there are additional items still to get. Include this value as the page
     * parameter for the subsequent GET request. For information about pagination, see
     * [ListPagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then there are additional items still to get. Include this value as the page
     * parameter for the subsequent GET request. For information about pagination, see
     * [ListPagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then there are additional items in previous pages to get. Include this value as the
     * page parameter for the subsequent GET request. The absence of this header indicates that you
     * have reached the first page of the list. For more information, see
     * [ListPagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcPreviousPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then there are additional items in previous pages to get. Include this value as the
     * page parameter for the subsequent GET request. The absence of this header indicates that you
     * have reached the first page of the list. For more information, see
     * [ListPagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcPreviousPage() {
        return opcPreviousPage;
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

    /** The returned {@code ResourceSummaryCollection} instance. */
    private com.oracle.bmc.resourcesearch.model.ResourceSummaryCollection resourceSummaryCollection;

    /**
     * The returned {@code ResourceSummaryCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.resourcesearch.model.ResourceSummaryCollection
            getResourceSummaryCollection() {
        return resourceSummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcNextPage",
        "opcPreviousPage",
        "opcRequestId",
        "resourceSummaryCollection"
    })
    private SearchResourcesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcNextPage,
            String opcPreviousPage,
            String opcRequestId,
            com.oracle.bmc.resourcesearch.model.ResourceSummaryCollection
                    resourceSummaryCollection) {
        super(__httpStatusCode__, headers);
        this.opcNextPage = opcNextPage;
        this.opcPreviousPage = opcPreviousPage;
        this.opcRequestId = opcRequestId;
        this.resourceSummaryCollection = resourceSummaryCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<SearchResourcesResponse> {
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
         * page parameter for the subsequent GET request. For information about pagination, see
         * [ListPagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then there are additional items still to get. Include this value as the
         * page parameter for the subsequent GET request. For information about pagination, see
         * [ListPagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then there are additional items in previous pages to get. Include this
         * value as the page parameter for the subsequent GET request. The absence of this header
         * indicates that you have reached the first page of the list. For more information, see
         * [ListPagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcPreviousPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then there are additional items in previous pages to get. Include this
         * value as the page parameter for the subsequent GET request. The absence of this header
         * indicates that you have reached the first page of the list. For more information, see
         * [ListPagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcPreviousPage the value to set
         * @return this builder
         */
        public Builder opcPreviousPage(String opcPreviousPage) {
            this.opcPreviousPage = opcPreviousPage;
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

        /** The returned {@code ResourceSummaryCollection} instance. */
        private com.oracle.bmc.resourcesearch.model.ResourceSummaryCollection
                resourceSummaryCollection;

        /**
         * The returned {@code ResourceSummaryCollection} instance.
         *
         * @param resourceSummaryCollection the value to set
         * @return this builder
         */
        public Builder resourceSummaryCollection(
                com.oracle.bmc.resourcesearch.model.ResourceSummaryCollection
                        resourceSummaryCollection) {
            this.resourceSummaryCollection = resourceSummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(SearchResourcesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcNextPage(o.getOpcNextPage());
            opcPreviousPage(o.getOpcPreviousPage());
            opcRequestId(o.getOpcRequestId());
            resourceSummaryCollection(o.getResourceSummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public SearchResourcesResponse build() {
            return new SearchResourcesResponse(
                    __httpStatusCode__,
                    headers,
                    opcNextPage,
                    opcPreviousPage,
                    opcRequestId,
                    resourceSummaryCollection);
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
        sb.append(",opcPreviousPage=").append(String.valueOf(opcPreviousPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",resourceSummaryCollection=").append(String.valueOf(resourceSummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SearchResourcesResponse)) {
            return false;
        }

        SearchResourcesResponse other = (SearchResourcesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPreviousPage, other.opcPreviousPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.resourceSummaryCollection, other.resourceSummaryCollection);
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
                        + (this.resourceSummaryCollection == null
                                ? 43
                                : this.resourceSummaryCollection.hashCode());
        return result;
    }
}
