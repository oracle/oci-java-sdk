/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.responses;

import com.oracle.bmc.marketplacepublisher.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
public class CreateListingRevisionResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code ListingRevision} instance. */
    private com.oracle.bmc.marketplacepublisher.model.ListingRevision listingRevision;

    /**
     * The returned {@code ListingRevision} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.marketplacepublisher.model.ListingRevision getListingRevision() {
        return listingRevision;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "listingRevision"
    })
    private CreateListingRevisionResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.marketplacepublisher.model.ListingRevision listingRevision) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.listingRevision = listingRevision;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateListingRevisionResponse> {
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

        /** The returned {@code ListingRevision} instance. */
        private com.oracle.bmc.marketplacepublisher.model.ListingRevision listingRevision;

        /**
         * The returned {@code ListingRevision} instance.
         *
         * @param listingRevision the value to set
         * @return this builder
         */
        public Builder listingRevision(
                com.oracle.bmc.marketplacepublisher.model.ListingRevision listingRevision) {
            this.listingRevision = listingRevision;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateListingRevisionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            listingRevision(o.getListingRevision());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateListingRevisionResponse build() {
            return new CreateListingRevisionResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, listingRevision);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",listingRevision=").append(String.valueOf(listingRevision));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateListingRevisionResponse)) {
            return false;
        }

        CreateListingRevisionResponse other = (CreateListingRevisionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.listingRevision, other.listingRevision);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.listingRevision == null ? 43 : this.listingRevision.hashCode());
        return result;
    }
}
