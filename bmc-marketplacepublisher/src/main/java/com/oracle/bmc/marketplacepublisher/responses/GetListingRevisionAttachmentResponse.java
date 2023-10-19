/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.responses;

import com.oracle.bmc.marketplacepublisher.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class GetListingRevisionAttachmentResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code ListingRevisionAttachment} instance. */
    private com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment
            listingRevisionAttachment;

    /**
     * The returned {@code ListingRevisionAttachment} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment
            getListingRevisionAttachment() {
        return listingRevisionAttachment;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "listingRevisionAttachment"
    })
    private GetListingRevisionAttachmentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment
                    listingRevisionAttachment) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.listingRevisionAttachment = listingRevisionAttachment;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetListingRevisionAttachmentResponse> {
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

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code ListingRevisionAttachment} instance. */
        private com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment
                listingRevisionAttachment;

        /**
         * The returned {@code ListingRevisionAttachment} instance.
         *
         * @param listingRevisionAttachment the value to set
         * @return this builder
         */
        public Builder listingRevisionAttachment(
                com.oracle.bmc.marketplacepublisher.model.ListingRevisionAttachment
                        listingRevisionAttachment) {
            this.listingRevisionAttachment = listingRevisionAttachment;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetListingRevisionAttachmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            listingRevisionAttachment(o.getListingRevisionAttachment());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetListingRevisionAttachmentResponse build() {
            return new GetListingRevisionAttachmentResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, listingRevisionAttachment);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",listingRevisionAttachment=").append(String.valueOf(listingRevisionAttachment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetListingRevisionAttachmentResponse)) {
            return false;
        }

        GetListingRevisionAttachmentResponse other = (GetListingRevisionAttachmentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.listingRevisionAttachment, other.listingRevisionAttachment);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.listingRevisionAttachment == null
                                ? 43
                                : this.listingRevisionAttachment.hashCode());
        return result;
    }
}
