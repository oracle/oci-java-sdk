/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListPrivateEndpointsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For paginating a list of PEs.
     * In the GET request, set the limit to the number of Private Endpoint items that you want returned in the response.
     * If the {@code opc-next-page} header appears in the response, then this is a partial list and there are additional
     * Private Endpoint's to get. Include the header's value as the {@code page} parameter in the subsequent GET request to get the
     * next batch of PEs. Repeat this process to retrieve the entire list of Private Endpoint's.
     * By default, the page limit is set to 25 Private Endpoint's per page, but you can specify a value from 1 to 1000.
     * For more details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * For paginating a list of PEs.
     * In the GET request, set the limit to the number of Private Endpoint items that you want returned in the response.
     * If the {@code opc-next-page} header appears in the response, then this is a partial list and there are additional
     * Private Endpoint's to get. Include the header's value as the {@code page} parameter in the subsequent GET request to get the
     * next batch of PEs. Repeat this process to retrieve the entire list of Private Endpoint's.
     * By default, the page limit is set to 25 Private Endpoint's per page, but you can specify a value from 1 to 1000.
     * For more details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * A list of com.oracle.bmc.objectstorage.model.PrivateEndpointSummary instances.
     */
    private java.util.List<com.oracle.bmc.objectstorage.model.PrivateEndpointSummary> items;

    /**
     * A list of com.oracle.bmc.objectstorage.model.PrivateEndpointSummary instances.
     * @return the value
     */
    public java.util.List<com.oracle.bmc.objectstorage.model.PrivateEndpointSummary> getItems() {
        return items;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcClientRequestId",
        "opcRequestId",
        "opcNextPage",
        "items"
    })
    private ListPrivateEndpointsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcClientRequestId,
            String opcRequestId,
            String opcNextPage,
            java.util.List<com.oracle.bmc.objectstorage.model.PrivateEndpointSummary> items) {
        super(__httpStatusCode__, headers);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.items = items;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
         */
        private String opcClientRequestId;

        /**
         * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
         * request, provide this request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
         * request, provide this request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For paginating a list of PEs.
         * In the GET request, set the limit to the number of Private Endpoint items that you want returned in the response.
         * If the {@code opc-next-page} header appears in the response, then this is a partial list and there are additional
         * Private Endpoint's to get. Include the header's value as the {@code page} parameter in the subsequent GET request to get the
         * next batch of PEs. Repeat this process to retrieve the entire list of Private Endpoint's.
         * By default, the page limit is set to 25 Private Endpoint's per page, but you can specify a value from 1 to 1000.
         * For more details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String opcNextPage;

        /**
         * For paginating a list of PEs.
         * In the GET request, set the limit to the number of Private Endpoint items that you want returned in the response.
         * If the {@code opc-next-page} header appears in the response, then this is a partial list and there are additional
         * Private Endpoint's to get. Include the header's value as the {@code page} parameter in the subsequent GET request to get the
         * next batch of PEs. Repeat this process to retrieve the entire list of Private Endpoint's.
         * By default, the page limit is set to 25 Private Endpoint's per page, but you can specify a value from 1 to 1000.
         * For more details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * A list of com.oracle.bmc.objectstorage.model.PrivateEndpointSummary instances.
         */
        private java.util.List<com.oracle.bmc.objectstorage.model.PrivateEndpointSummary> items;

        /**
         * A list of com.oracle.bmc.objectstorage.model.PrivateEndpointSummary instances.
         * @param items the value to set
         * @return this builder
         */
        public Builder items(
                java.util.List<com.oracle.bmc.objectstorage.model.PrivateEndpointSummary> items) {
            this.items = items;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListPrivateEndpointsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            items(o.getItems());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListPrivateEndpointsResponse build() {
            return new ListPrivateEndpointsResponse(
                    __httpStatusCode__,
                    headers,
                    opcClientRequestId,
                    opcRequestId,
                    opcNextPage,
                    items);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",items=").append(String.valueOf(items));
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
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
