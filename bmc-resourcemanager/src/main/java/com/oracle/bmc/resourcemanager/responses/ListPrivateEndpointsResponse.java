/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.responses;

import com.oracle.bmc.resourcemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ListPrivateEndpointsResponse extends com.oracle.bmc.responses.BmcResponse {
    /** Unique Oracle-assigned identifier for the request. */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Retrieves the next page of paginated list items. If the {@code opc-next-page} header appears
     * in the response, additional pages of results remain. To receive the next page, include the
     * header value in the {@code page} param. If the {@code opc-next-page} header does not appear
     * in the response, there are no more list items to get. For more information about list
     * pagination, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String opcNextPage;

    /**
     * Retrieves the next page of paginated list items. If the {@code opc-next-page} header appears
     * in the response, additional pages of results remain. To receive the next page, include the
     * header value in the {@code page} param. If the {@code opc-next-page} header does not appear
     * in the response, there are no more list items to get. For more information about list
     * pagination, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /** The returned PrivateEndpointCollection instance. */
    private com.oracle.bmc.resourcemanager.model.PrivateEndpointCollection
            privateEndpointCollection;

    /**
     * The returned PrivateEndpointCollection instance.
     *
     * @return the value
     */
    public com.oracle.bmc.resourcemanager.model.PrivateEndpointCollection
            getPrivateEndpointCollection() {
        return privateEndpointCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "privateEndpointCollection"
    })
    private ListPrivateEndpointsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.resourcemanager.model.PrivateEndpointCollection
                    privateEndpointCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.privateEndpointCollection = privateEndpointCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListPrivateEndpointsResponse> {
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

        /** Unique Oracle-assigned identifier for the request. */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Retrieves the next page of paginated list items. If the {@code opc-next-page} header
         * appears in the response, additional pages of results remain. To receive the next page,
         * include the header value in the {@code page} param. If the {@code opc-next-page} header
         * does not appear in the response, there are no more list items to get. For more
         * information about list pagination, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String opcNextPage;

        /**
         * Retrieves the next page of paginated list items. If the {@code opc-next-page} header
         * appears in the response, additional pages of results remain. To receive the next page,
         * include the header value in the {@code page} param. If the {@code opc-next-page} header
         * does not appear in the response, there are no more list items to get. For more
         * information about list pagination, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /** The returned PrivateEndpointCollection instance. */
        private com.oracle.bmc.resourcemanager.model.PrivateEndpointCollection
                privateEndpointCollection;

        /**
         * The returned PrivateEndpointCollection instance.
         *
         * @param privateEndpointCollection the value to set
         * @return this builder
         */
        public Builder privateEndpointCollection(
                com.oracle.bmc.resourcemanager.model.PrivateEndpointCollection
                        privateEndpointCollection) {
            this.privateEndpointCollection = privateEndpointCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListPrivateEndpointsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            privateEndpointCollection(o.getPrivateEndpointCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListPrivateEndpointsResponse build() {
            return new ListPrivateEndpointsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    privateEndpointCollection);
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
        sb.append(",privateEndpointCollection=").append(String.valueOf(privateEndpointCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListPrivateEndpointsResponse)) {
            return false;
        }

        ListPrivateEndpointsResponse other = (ListPrivateEndpointsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.privateEndpointCollection, other.privateEndpointCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointCollection == null
                                ? 43
                                : this.privateEndpointCollection.hashCode());
        return result;
    }
}
