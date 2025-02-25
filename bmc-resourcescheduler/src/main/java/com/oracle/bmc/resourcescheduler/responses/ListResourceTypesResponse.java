/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.responses;

import com.oracle.bmc.resourcescheduler.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class ListResourceTypesResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * When this header appears in the list pagination response, there are additional results pages to view. For
     * important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String opcNextPage;

    /**
     * When this header appears in the list pagination response, there are additional results pages to view. For
     * important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned ResourceTypeCollection instance.
     */
    private com.oracle.bmc.resourcescheduler.model.ResourceTypeCollection resourceTypeCollection;

    /**
     * The returned ResourceTypeCollection instance.
     * @return the value
     */
    public com.oracle.bmc.resourcescheduler.model.ResourceTypeCollection
            getResourceTypeCollection() {
        return resourceTypeCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "resourceTypeCollection"
    })
    private ListResourceTypesResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            com.oracle.bmc.resourcescheduler.model.ResourceTypeCollection resourceTypeCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.resourceTypeCollection = resourceTypeCollection;
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
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * When this header appears in the list pagination response, there are additional results pages to view. For
         * important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String opcNextPage;

        /**
         * When this header appears in the list pagination response, there are additional results pages to view. For
         * important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The returned ResourceTypeCollection instance.
         */
        private com.oracle.bmc.resourcescheduler.model.ResourceTypeCollection
                resourceTypeCollection;

        /**
         * The returned ResourceTypeCollection instance.
         * @param resourceTypeCollection the value to set
         * @return this builder
         */
        public Builder resourceTypeCollection(
                com.oracle.bmc.resourcescheduler.model.ResourceTypeCollection
                        resourceTypeCollection) {
            this.resourceTypeCollection = resourceTypeCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListResourceTypesResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            resourceTypeCollection(o.getResourceTypeCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListResourceTypesResponse build() {
            return new ListResourceTypesResponse(
                    __httpStatusCode__, headers, opcRequestId, opcNextPage, resourceTypeCollection);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",resourceTypeCollection=").append(String.valueOf(resourceTypeCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListResourceTypesResponse)) {
            return false;
        }

        ListResourceTypesResponse other = (ListResourceTypesResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.resourceTypeCollection, other.resourceTypeCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeCollection == null
                                ? 43
                                : this.resourceTypeCollection.hashCode());
        return result;
    }
}
