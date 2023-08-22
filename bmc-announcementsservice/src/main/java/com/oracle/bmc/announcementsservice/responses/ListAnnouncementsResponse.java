/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.responses;

import com.oracle.bmc.announcementsservice.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class ListAnnouncementsResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * For pagination of a list of items. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the previous batch of items.
     */
    private String opcPreviousPage;

    /**
     * For pagination of a list of items. Include this value as the {@code page} parameter for the
     * subsequent GET request to get the previous batch of items.
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

    /** The returned {@code AnnouncementsCollection} instance. */
    private com.oracle.bmc.announcementsservice.model.AnnouncementsCollection
            announcementsCollection;

    /**
     * The returned {@code AnnouncementsCollection} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.announcementsservice.model.AnnouncementsCollection
            getAnnouncementsCollection() {
        return announcementsCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcNextPage",
        "opcPreviousPage",
        "opcRequestId",
        "announcementsCollection"
    })
    private ListAnnouncementsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcNextPage,
            String opcPreviousPage,
            String opcRequestId,
            com.oracle.bmc.announcementsservice.model.AnnouncementsCollection
                    announcementsCollection) {
        super(__httpStatusCode__, headers);
        this.opcNextPage = opcNextPage;
        this.opcPreviousPage = opcPreviousPage;
        this.opcRequestId = opcRequestId;
        this.announcementsCollection = announcementsCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ListAnnouncementsResponse> {
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
         * For pagination of a list of items. Include this value as the {@code page} parameter for
         * the subsequent GET request to get the previous batch of items.
         */
        private String opcPreviousPage;

        /**
         * For pagination of a list of items. Include this value as the {@code page} parameter for
         * the subsequent GET request to get the previous batch of items.
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

        /** The returned {@code AnnouncementsCollection} instance. */
        private com.oracle.bmc.announcementsservice.model.AnnouncementsCollection
                announcementsCollection;

        /**
         * The returned {@code AnnouncementsCollection} instance.
         *
         * @param announcementsCollection the value to set
         * @return this builder
         */
        public Builder announcementsCollection(
                com.oracle.bmc.announcementsservice.model.AnnouncementsCollection
                        announcementsCollection) {
            this.announcementsCollection = announcementsCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListAnnouncementsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcNextPage(o.getOpcNextPage());
            opcPreviousPage(o.getOpcPreviousPage());
            opcRequestId(o.getOpcRequestId());
            announcementsCollection(o.getAnnouncementsCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListAnnouncementsResponse build() {
            return new ListAnnouncementsResponse(
                    __httpStatusCode__,
                    headers,
                    opcNextPage,
                    opcPreviousPage,
                    opcRequestId,
                    announcementsCollection);
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
        sb.append(",announcementsCollection=").append(String.valueOf(announcementsCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAnnouncementsResponse)) {
            return false;
        }

        ListAnnouncementsResponse other = (ListAnnouncementsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPreviousPage, other.opcPreviousPage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.announcementsCollection, other.announcementsCollection);
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
                        + (this.announcementsCollection == null
                                ? 43
                                : this.announcementsCollection.hashCode());
        return result;
    }
}
