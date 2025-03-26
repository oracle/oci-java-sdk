/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.responses;

import com.oracle.bmc.dataflow.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class ListApplicationsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Retrieves the previous page of results.
     * When this header appears in the response, previous pages of results exist.
     * See [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcPrevPage;

    /**
     * Retrieves the previous page of results.
     * When this header appears in the response, previous pages of results exist.
     * See [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /**
     * Retrieves the next page of results. When this header appears in the response,
     * additional pages of results remain. See [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * Retrieves the next page of results. When this header appears in the response,
     * additional pages of results remain. See [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * A list of com.oracle.bmc.dataflow.model.ApplicationSummary instances.
     */
    private java.util.List<com.oracle.bmc.dataflow.model.ApplicationSummary> items;

    /**
     * A list of com.oracle.bmc.dataflow.model.ApplicationSummary instances.
     * @return the value
     */
    public java.util.List<com.oracle.bmc.dataflow.model.ApplicationSummary> getItems() {
        return items;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcPrevPage",
        "opcNextPage",
        "opcRequestId",
        "items"
    })
    private ListApplicationsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcPrevPage,
            String opcNextPage,
            String opcRequestId,
            java.util.List<com.oracle.bmc.dataflow.model.ApplicationSummary> items) {
        super(__httpStatusCode__, headers);
        this.opcPrevPage = opcPrevPage;
        this.opcNextPage = opcNextPage;
        this.opcRequestId = opcRequestId;
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
         * Retrieves the previous page of results.
         * When this header appears in the response, previous pages of results exist.
         * See [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String opcPrevPage;

        /**
         * Retrieves the previous page of results.
         * When this header appears in the response, previous pages of results exist.
         * See [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        /**
         * Retrieves the next page of results. When this header appears in the response,
         * additional pages of results remain. See [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String opcNextPage;

        /**
         * Retrieves the next page of results. When this header appears in the response,
         * additional pages of results remain. See [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle assigned identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A list of com.oracle.bmc.dataflow.model.ApplicationSummary instances.
         */
        private java.util.List<com.oracle.bmc.dataflow.model.ApplicationSummary> items;

        /**
         * A list of com.oracle.bmc.dataflow.model.ApplicationSummary instances.
         * @param items the value to set
         * @return this builder
         */
        public Builder items(
                java.util.List<com.oracle.bmc.dataflow.model.ApplicationSummary> items) {
            this.items = items;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListApplicationsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcPrevPage(o.getOpcPrevPage());
            opcNextPage(o.getOpcNextPage());
            opcRequestId(o.getOpcRequestId());
            items(o.getItems());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListApplicationsResponse build() {
            return new ListApplicationsResponse(
                    __httpStatusCode__, headers, opcPrevPage, opcNextPage, opcRequestId, items);
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
        sb.append(",opcPrevPage=").append(String.valueOf(opcPrevPage));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",items=").append(String.valueOf(items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListApplicationsResponse)) {
            return false;
        }

        ListApplicationsResponse other = (ListApplicationsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
