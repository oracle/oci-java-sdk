/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ListExadataConfigurationsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For pagination of a list of items. The total number of items in the result.
     *
     */
    private Integer opcTotalItems;

    /**
     * For pagination of a list of items. The total number of items in the result.
     *
     * @return the value
     */
    public Integer getOpcTotalItems() {
        return opcTotalItems;
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
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * The returned ExadataConfigurationCollection instance.
     */
    private com.oracle.bmc.opsi.model.ExadataConfigurationCollection exadataConfigurationCollection;

    /**
     * The returned ExadataConfigurationCollection instance.
     * @return the value
     */
    public com.oracle.bmc.opsi.model.ExadataConfigurationCollection
            getExadataConfigurationCollection() {
        return exadataConfigurationCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcTotalItems",
        "opcNextPage",
        "exadataConfigurationCollection"
    })
    private ListExadataConfigurationsResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            Integer opcTotalItems,
            String opcNextPage,
            com.oracle.bmc.opsi.model.ExadataConfigurationCollection
                    exadataConfigurationCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcTotalItems = opcTotalItems;
        this.opcNextPage = opcNextPage;
        this.exadataConfigurationCollection = exadataConfigurationCollection;
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
         * For pagination of a list of items. The total number of items in the result.
         *
         */
        private Integer opcTotalItems;

        /**
         * For pagination of a list of items. The total number of items in the result.
         *
         * @param opcTotalItems the value to set
         * @return this builder
         */
        public Builder opcTotalItems(Integer opcTotalItems) {
            this.opcTotalItems = opcTotalItems;
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
         * The returned ExadataConfigurationCollection instance.
         */
        private com.oracle.bmc.opsi.model.ExadataConfigurationCollection
                exadataConfigurationCollection;

        /**
         * The returned ExadataConfigurationCollection instance.
         * @param exadataConfigurationCollection the value to set
         * @return this builder
         */
        public Builder exadataConfigurationCollection(
                com.oracle.bmc.opsi.model.ExadataConfigurationCollection
                        exadataConfigurationCollection) {
            this.exadataConfigurationCollection = exadataConfigurationCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListExadataConfigurationsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcTotalItems(o.getOpcTotalItems());
            opcNextPage(o.getOpcNextPage());
            exadataConfigurationCollection(o.getExadataConfigurationCollection());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ListExadataConfigurationsResponse build() {
            return new ListExadataConfigurationsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcTotalItems,
                    opcNextPage,
                    exadataConfigurationCollection);
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
        sb.append(",opcTotalItems=").append(String.valueOf(opcTotalItems));
        sb.append(",opcNextPage=").append(String.valueOf(opcNextPage));
        sb.append(",exadataConfigurationCollection=")
                .append(String.valueOf(exadataConfigurationCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListExadataConfigurationsResponse)) {
            return false;
        }

        ListExadataConfigurationsResponse other = (ListExadataConfigurationsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcTotalItems, other.opcTotalItems)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(
                        this.exadataConfigurationCollection, other.exadataConfigurationCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcTotalItems == null ? 43 : this.opcTotalItems.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataConfigurationCollection == null
                                ? 43
                                : this.exadataConfigurationCollection.hashCode());
        return result;
    }
}
