/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.responses;

import com.oracle.bmc.networkfirewall.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class ListNetworkFirewallPoliciesResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the previous batch of items.
     */
    private String opcPrevPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. Include this value as the {@code
     * page} parameter for the subsequent GET request to get the previous batch of items.
     *
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. This is to get the page counts
     * overall.
     */
    private String opcPageCount;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then a partial list might have been returned. This is to get the page counts
     * overall.
     *
     * @return the value
     */
    public String getOpcPageCount() {
        return opcPageCount;
    }

    /** For pagination of a list of items. This provides the count of total items across pages. */
    private Integer opcTotalItems;

    /**
     * For pagination of a list of items. This provides the count of total items across pages.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /** The returned NetworkFirewallPolicySummaryCollection instance. */
    private com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummaryCollection
            networkFirewallPolicySummaryCollection;

    /**
     * The returned NetworkFirewallPolicySummaryCollection instance.
     *
     * @return the value
     */
    public com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummaryCollection
            getNetworkFirewallPolicySummaryCollection() {
        return networkFirewallPolicySummaryCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "opcPrevPage",
        "opcPageCount",
        "opcTotalItems",
        "networkFirewallPolicySummaryCollection"
    })
    private ListNetworkFirewallPoliciesResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            String opcPrevPage,
            String opcPageCount,
            Integer opcTotalItems,
            com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummaryCollection
                    networkFirewallPolicySummaryCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
        this.opcPageCount = opcPageCount;
        this.opcTotalItems = opcTotalItems;
        this.networkFirewallPolicySummaryCollection = networkFirewallPolicySummaryCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListNetworkFirewallPoliciesResponse> {
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
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the next batch of items.
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
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the previous batch of items.
         */
        private String opcPrevPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. Include this value as the
         * {@code page} parameter for the subsequent GET request to get the previous batch of items.
         *
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. This is to get the page
         * counts overall.
         */
        private String opcPageCount;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then a partial list might have been returned. This is to get the page
         * counts overall.
         *
         * @param opcPageCount the value to set
         * @return this builder
         */
        public Builder opcPageCount(String opcPageCount) {
            this.opcPageCount = opcPageCount;
            return this;
        }

        /**
         * For pagination of a list of items. This provides the count of total items across pages.
         */
        private Integer opcTotalItems;

        /**
         * For pagination of a list of items. This provides the count of total items across pages.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /** The returned NetworkFirewallPolicySummaryCollection instance. */
        private com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummaryCollection
                networkFirewallPolicySummaryCollection;

        /**
         * The returned NetworkFirewallPolicySummaryCollection instance.
         *
         * @param networkFirewallPolicySummaryCollection the value to set
         * @return this builder
         */
        public Builder networkFirewallPolicySummaryCollection(
                com.oracle.bmc.networkfirewall.model.NetworkFirewallPolicySummaryCollection
                        networkFirewallPolicySummaryCollection) {
            this.networkFirewallPolicySummaryCollection = networkFirewallPolicySummaryCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListNetworkFirewallPoliciesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            opcPageCount(o.getOpcPageCount());
            opcTotalItems(o.getOpcTotalItems());
            networkFirewallPolicySummaryCollection(o.getNetworkFirewallPolicySummaryCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListNetworkFirewallPoliciesResponse build() {
            return new ListNetworkFirewallPoliciesResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    opcPrevPage,
                    opcPageCount,
                    opcTotalItems,
                    networkFirewallPolicySummaryCollection);
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
        sb.append(",opcPageCount=").append(String.valueOf(opcPageCount));
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",networkFirewallPolicySummaryCollection=")
                .append(String.valueOf(networkFirewallPolicySummaryCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListNetworkFirewallPoliciesResponse)) {
            return false;
        }

        ListNetworkFirewallPoliciesResponse other = (ListNetworkFirewallPoliciesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcPageCount, other.opcPageCount)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(
                        this.networkFirewallPolicySummaryCollection,
                        other.networkFirewallPolicySummaryCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcPageCount == null ? 43 : this.opcPageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result =
                (result * PRIME)
                        + (this.networkFirewallPolicySummaryCollection == null
                                ? 43
                                : this.networkFirewallPolicySummaryCollection.hashCode());
        return result;
    }
}
