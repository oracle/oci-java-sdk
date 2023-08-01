/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ListOverlappingRecallsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then additional items may be available on the next page of the list. Include this
     * value as the {@code page} parameter for the subsequent request to get the next batch of
     * items.
     */
    private String opcNextPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then additional items may be available on the next page of the list. Include this
     * value as the {@code page} parameter for the subsequent request to get the next batch of
     * items.
     *
     * @return the value
     */
    public String getOpcNextPage() {
        return opcNextPage;
    }

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then additional items may be available on the previous page of the list. Include
     * this value as the {@code page} parameter for the subsequent request to get the previous batch
     * of items.
     */
    private String opcPrevPage;

    /**
     * For pagination of a list of items. When paging through a list, if this header appears in the
     * response, then additional items may be available on the previous page of the list. Include
     * this value as the {@code page} parameter for the subsequent request to get the previous batch
     * of items.
     *
     * @return the value
     */
    public String getOpcPrevPage() {
        return opcPrevPage;
    }

    /** The returned OverlappingRecallCollection instance. */
    private com.oracle.bmc.loganalytics.model.OverlappingRecallCollection
            overlappingRecallCollection;

    /**
     * The returned OverlappingRecallCollection instance.
     *
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.OverlappingRecallCollection
            getOverlappingRecallCollection() {
        return overlappingRecallCollection;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcNextPage",
        "opcPrevPage",
        "overlappingRecallCollection"
    })
    private ListOverlappingRecallsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcNextPage,
            String opcPrevPage,
            com.oracle.bmc.loganalytics.model.OverlappingRecallCollection
                    overlappingRecallCollection) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcNextPage = opcNextPage;
        this.opcPrevPage = opcPrevPage;
        this.overlappingRecallCollection = overlappingRecallCollection;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ListOverlappingRecallsResponse> {
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
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
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
         * the response, then additional items may be available on the next page of the list.
         * Include this value as the {@code page} parameter for the subsequent request to get the
         * next batch of items.
         */
        private String opcNextPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then additional items may be available on the next page of the list.
         * Include this value as the {@code page} parameter for the subsequent request to get the
         * next batch of items.
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
         * the response, then additional items may be available on the previous page of the list.
         * Include this value as the {@code page} parameter for the subsequent request to get the
         * previous batch of items.
         */
        private String opcPrevPage;

        /**
         * For pagination of a list of items. When paging through a list, if this header appears in
         * the response, then additional items may be available on the previous page of the list.
         * Include this value as the {@code page} parameter for the subsequent request to get the
         * previous batch of items.
         *
         * @param opcPrevPage the value to set
         * @return this builder
         */
        public Builder opcPrevPage(String opcPrevPage) {
            this.opcPrevPage = opcPrevPage;
            return this;
        }

        /** The returned OverlappingRecallCollection instance. */
        private com.oracle.bmc.loganalytics.model.OverlappingRecallCollection
                overlappingRecallCollection;

        /**
         * The returned OverlappingRecallCollection instance.
         *
         * @param overlappingRecallCollection the value to set
         * @return this builder
         */
        public Builder overlappingRecallCollection(
                com.oracle.bmc.loganalytics.model.OverlappingRecallCollection
                        overlappingRecallCollection) {
            this.overlappingRecallCollection = overlappingRecallCollection;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ListOverlappingRecallsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcPrevPage(o.getOpcPrevPage());
            overlappingRecallCollection(o.getOverlappingRecallCollection());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ListOverlappingRecallsResponse build() {
            return new ListOverlappingRecallsResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    opcNextPage,
                    opcPrevPage,
                    overlappingRecallCollection);
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
        sb.append(",overlappingRecallCollection=")
                .append(String.valueOf(overlappingRecallCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListOverlappingRecallsResponse)) {
            return false;
        }

        ListOverlappingRecallsResponse other = (ListOverlappingRecallsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNextPage, other.opcNextPage)
                && java.util.Objects.equals(this.opcPrevPage, other.opcPrevPage)
                && java.util.Objects.equals(
                        this.overlappingRecallCollection, other.overlappingRecallCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcNextPage == null ? 43 : this.opcNextPage.hashCode());
        result = (result * PRIME) + (this.opcPrevPage == null ? 43 : this.opcPrevPage.hashCode());
        result =
                (result * PRIME)
                        + (this.overlappingRecallCollection == null
                                ? 43
                                : this.overlappingRecallCollection.hashCode());
        return result;
    }
}
