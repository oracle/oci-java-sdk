/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ListOdaPrivateEndpointAttachmentsResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * When you are paging through a list, if this header appears in the response,
     * then there might be additional items still to get. Include this value as the
     * {@code page} query parameter for the subsequent GET request.
     *
     */
    private String opcNextPage;

    /**
     * When you are paging through a list, if this header appears in the response,
     * then there might be additional items still to get. Include this value as the
     * {@code page} query parameter for the subsequent GET request.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The total number of results that match the query.
     *
     */
    private Integer opcTotalItems;

    /**
     * The total number of results that match the query.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
    }

    /**
     * The returned OdaPrivateEndpointAttachmentCollection instance.
     */
    private com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentCollection
            odaPrivateEndpointAttachmentCollection;

    /**
     * The returned OdaPrivateEndpointAttachmentCollection instance.
     * @return the value
     */
    public com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentCollection
            getOdaPrivateEndpointAttachmentCollection() {
        return odaPrivateEndpointAttachmentCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "opcTotalItems",
        "odaPrivateEndpointAttachmentCollection"
    })
    private ListOdaPrivateEndpointAttachmentsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcNextPage,
            Integer opcTotalItems,
            com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentCollection
                    odaPrivateEndpointAttachmentCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcTotalItems = opcTotalItems;
        this.odaPrivateEndpointAttachmentCollection = odaPrivateEndpointAttachmentCollection;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
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
         * When you are paging through a list, if this header appears in the response,
         * then there might be additional items still to get. Include this value as the
         * {@code page} query parameter for the subsequent GET request.
         *
         */
        private String opcNextPage;

        /**
         * When you are paging through a list, if this header appears in the response,
         * then there might be additional items still to get. Include this value as the
         * {@code page} query parameter for the subsequent GET request.
         *
         * @param opcNextPage the value to set
         * @return this builder
         */
        public Builder opcNextPage(String opcNextPage) {
            this.opcNextPage = opcNextPage;
            return this;
        }

        /**
         * The total number of results that match the query.
         *
         */
        private Integer opcTotalItems;

        /**
         * The total number of results that match the query.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
            return this;
        }

        /**
         * The returned OdaPrivateEndpointAttachmentCollection instance.
         */
        private com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentCollection
                odaPrivateEndpointAttachmentCollection;

        /**
         * The returned OdaPrivateEndpointAttachmentCollection instance.
         * @param odaPrivateEndpointAttachmentCollection the value to set
         * @return this builder
         */
        public Builder odaPrivateEndpointAttachmentCollection(
                com.oracle.bmc.oda.model.OdaPrivateEndpointAttachmentCollection
                        odaPrivateEndpointAttachmentCollection) {
            this.odaPrivateEndpointAttachmentCollection = odaPrivateEndpointAttachmentCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListOdaPrivateEndpointAttachmentsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcTotalItems(o.getOpcTotalItems());
            odaPrivateEndpointAttachmentCollection(o.getOdaPrivateEndpointAttachmentCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListOdaPrivateEndpointAttachmentsResponse build() {
            return new ListOdaPrivateEndpointAttachmentsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    opcTotalItems,
                    odaPrivateEndpointAttachmentCollection);
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
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",odaPrivateEndpointAttachmentCollection=")
                .append(String.valueOf(odaPrivateEndpointAttachmentCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListOdaPrivateEndpointAttachmentsResponse)) {
            return false;
        }

        ListOdaPrivateEndpointAttachmentsResponse other =
                (ListOdaPrivateEndpointAttachmentsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(
                        this.odaPrivateEndpointAttachmentCollection,
                        other.odaPrivateEndpointAttachmentCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result =
                (result * PRIME)
                        + (this.odaPrivateEndpointAttachmentCollection == null
                                ? 43
                                : this.odaPrivateEndpointAttachmentCollection.hashCode());
        return result;
    }
}
