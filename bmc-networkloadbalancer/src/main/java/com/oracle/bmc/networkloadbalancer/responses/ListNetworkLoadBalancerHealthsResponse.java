/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.responses;

import com.oracle.bmc.networkloadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class ListNetworkLoadBalancerHealthsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the response,
     * then a partial list might have been returned. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the next batch of items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you must contact
     * Oracle about a particular request, then provide the request identifier.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you must contact
     * Oracle about a particular request, then provide the request identifier.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned NetworkLoadBalancerHealthCollection instance.
     */
    private com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthCollection
            networkLoadBalancerHealthCollection;

    /**
     * The returned NetworkLoadBalancerHealthCollection instance.
     * @return the value
     */
    public com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthCollection
            getNetworkLoadBalancerHealthCollection() {
        return networkLoadBalancerHealthCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcNextPage",
        "opcRequestId",
        "networkLoadBalancerHealthCollection"
    })
    private ListNetworkLoadBalancerHealthsResponse(
            int __httpStatusCode__,
            String opcNextPage,
            String opcRequestId,
            com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthCollection
                    networkLoadBalancerHealthCollection) {
        super(__httpStatusCode__);
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
        this.networkLoadBalancerHealthCollection = networkLoadBalancerHealthCollection;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in the response,
         * then a partial list might have been returned. Include this value as the {@code page} parameter for the
         * subsequent GET request to get the next batch of items.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you must contact
         * Oracle about a particular request, then provide the request identifier.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you must contact
         * Oracle about a particular request, then provide the request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned NetworkLoadBalancerHealthCollection instance.
         */
        private com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthCollection
                networkLoadBalancerHealthCollection;

        /**
         * The returned NetworkLoadBalancerHealthCollection instance.
         * @param networkLoadBalancerHealthCollection the value to set
         * @return this builder
         */
        public Builder networkLoadBalancerHealthCollection(
                com.oracle.bmc.networkloadbalancer.model.NetworkLoadBalancerHealthCollection
                        networkLoadBalancerHealthCollection) {
            this.networkLoadBalancerHealthCollection = networkLoadBalancerHealthCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListNetworkLoadBalancerHealthsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            networkLoadBalancerHealthCollection(o.getNetworkLoadBalancerHealthCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListNetworkLoadBalancerHealthsResponse build() {
            return new ListNetworkLoadBalancerHealthsResponse(
                    __httpStatusCode__,
                    opcNextPage,
                    opcRequestId,
                    networkLoadBalancerHealthCollection);
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
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",networkLoadBalancerHealthCollection=")
                .append(String.valueOf(networkLoadBalancerHealthCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListNetworkLoadBalancerHealthsResponse)) {
            return false;
        }

        ListNetworkLoadBalancerHealthsResponse other = (ListNetworkLoadBalancerHealthsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.networkLoadBalancerHealthCollection,
                        other.networkLoadBalancerHealthCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkLoadBalancerHealthCollection == null
                                ? 43
                                : this.networkLoadBalancerHealthCollection.hashCode());
        return result;
    }
}
