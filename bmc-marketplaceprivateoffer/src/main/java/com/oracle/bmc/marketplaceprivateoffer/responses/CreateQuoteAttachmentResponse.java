/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplaceprivateoffer.responses;

import com.oracle.bmc.marketplaceprivateoffer.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class CreateQuoteAttachmentResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /**
     * URL for the created offer quote attachment. The offer quote attachment OCID is generated
     * after this request is sent.
     */
    private String location;

    /**
     * URL for the created offer quote attachment. The offer quote attachment OCID is generated
     * after this request is sent.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** Same as location. */
    private String contentLocation;

    /**
     * Same as location.
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /**
     * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query its
     * status.
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query its
     * status.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** The returned {@code QuoteAttachment} instance. */
    private com.oracle.bmc.marketplaceprivateoffer.model.QuoteAttachment quoteAttachment;

    /**
     * The returned {@code QuoteAttachment} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.marketplaceprivateoffer.model.QuoteAttachment getQuoteAttachment() {
        return quoteAttachment;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "location",
        "contentLocation",
        "opcWorkRequestId",
        "quoteAttachment"
    })
    private CreateQuoteAttachmentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String location,
            String contentLocation,
            String opcWorkRequestId,
            com.oracle.bmc.marketplaceprivateoffer.model.QuoteAttachment quoteAttachment) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.contentLocation = contentLocation;
        this.opcWorkRequestId = opcWorkRequestId;
        this.quoteAttachment = quoteAttachment;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateQuoteAttachmentResponse> {
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

        /**
         * URL for the created offer quote attachment. The offer quote attachment OCID is generated
         * after this request is sent.
         */
        private String location;

        /**
         * URL for the created offer quote attachment. The offer quote attachment OCID is generated
         * after this request is sent.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** Same as location. */
        private String contentLocation;

        /**
         * Same as location.
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query
         * its status.
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query
         * its status.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** The returned {@code QuoteAttachment} instance. */
        private com.oracle.bmc.marketplaceprivateoffer.model.QuoteAttachment quoteAttachment;

        /**
         * The returned {@code QuoteAttachment} instance.
         *
         * @param quoteAttachment the value to set
         * @return this builder
         */
        public Builder quoteAttachment(
                com.oracle.bmc.marketplaceprivateoffer.model.QuoteAttachment quoteAttachment) {
            this.quoteAttachment = quoteAttachment;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateQuoteAttachmentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            opcWorkRequestId(o.getOpcWorkRequestId());
            quoteAttachment(o.getQuoteAttachment());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateQuoteAttachmentResponse build() {
            return new CreateQuoteAttachmentResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    location,
                    contentLocation,
                    opcWorkRequestId,
                    quoteAttachment);
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",quoteAttachment=").append(String.valueOf(quoteAttachment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateQuoteAttachmentResponse)) {
            return false;
        }

        CreateQuoteAttachmentResponse other = (CreateQuoteAttachmentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.quoteAttachment, other.quoteAttachment);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.quoteAttachment == null ? 43 : this.quoteAttachment.hashCode());
        return result;
    }
}
