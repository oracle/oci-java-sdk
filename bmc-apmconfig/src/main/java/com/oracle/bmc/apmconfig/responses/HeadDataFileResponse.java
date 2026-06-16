/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.responses;

import com.oracle.bmc.apmconfig.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class HeadDataFileResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The client request ID. */
    private String opcClientRequestId;

    /**
     * The client request ID.
     *
     * @return the value
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Content-Type header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
     */
    private String contentType;

    /**
     * Content-Type header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /** The object size in bytes. */
    private Long contentLength;

    /**
     * The object size in bytes.
     *
     * @return the value
     */
    public Long getContentLength() {
        return contentLength;
    }

    /** The base-64 encoded MD5 hash of the request body as computed by the server. */
    private String contentMd5;

    /**
     * The base-64 encoded MD5 hash of the request body as computed by the server.
     *
     * @return the value
     */
    public String getContentMd5() {
        return contentMd5;
    }

    /**
     * Content-Encoding header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
     */
    private String contentEncoding;

    /**
     * Content-Encoding header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
     *
     * @return the value
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * Content-Language header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
     */
    private String contentLanguage;

    /**
     * Content-Language header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
     *
     * @return the value
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * Content-Disposition header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
     */
    private String contentDisposition;

    /**
     * Content-Disposition header, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
     *
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * The last time the object was modified, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29). Expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-19T22:47:12.613Z}
     */
    private java.util.Date lastModified;

    /**
     * The last time the object was modified, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29). Expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-19T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * A string containing a JSON-encoded object with metadata related to the uploaded file or
     * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
     */
    private String metadata;

    /**
     * A string containing a JSON-encoded object with metadata related to the uploaded file or
     * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
     *
     * @return the value
     */
    public String getMetadata() {
        return metadata;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "opcClientRequestId",
        "contentType",
        "contentLength",
        "contentMd5",
        "contentEncoding",
        "contentLanguage",
        "contentDisposition",
        "lastModified",
        "metadata"
    })
    private HeadDataFileResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String opcClientRequestId,
            String contentType,
            Long contentLength,
            String contentMd5,
            String contentEncoding,
            String contentLanguage,
            String contentDisposition,
            java.util.Date lastModified,
            String metadata) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcClientRequestId = opcClientRequestId;
        this.contentType = contentType;
        this.contentLength = contentLength;
        this.contentMd5 = contentMd5;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentDisposition = contentDisposition;
        this.lastModified = lastModified;
        this.metadata = metadata;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<HeadDataFileResponse> {
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

        /** The client request ID. */
        private String opcClientRequestId;

        /**
         * The client request ID.
         *
         * @param opcClientRequestId the value to set
         * @return this builder
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        /**
         * Content-Type header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
         */
        private String contentType;

        /**
         * Content-Type header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.17).
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /** The object size in bytes. */
        private Long contentLength;

        /**
         * The object size in bytes.
         *
         * @param contentLength the value to set
         * @return this builder
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /** The base-64 encoded MD5 hash of the request body as computed by the server. */
        private String contentMd5;

        /**
         * The base-64 encoded MD5 hash of the request body as computed by the server.
         *
         * @param contentMd5 the value to set
         * @return this builder
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         * Content-Encoding header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
         */
        private String contentEncoding;

        /**
         * Content-Encoding header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.11).
         *
         * @param contentEncoding the value to set
         * @return this builder
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        /**
         * Content-Language header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
         */
        private String contentLanguage;

        /**
         * Content-Language header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.12).
         *
         * @param contentLanguage the value to set
         * @return this builder
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            return this;
        }

        /**
         * Content-Disposition header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
         */
        private String contentDisposition;

        /**
         * Content-Disposition header, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-19.5.1).
         *
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * The last time the object was modified, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29). Expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-19T22:47:12.613Z}
         */
        private java.util.Date lastModified;

        /**
         * The last time the object was modified, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29). Expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-19T22:47:12.613Z}
         *
         * @param lastModified the value to set
         * @return this builder
         */
        public Builder lastModified(java.util.Date lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * A string containing a JSON-encoded object with metadata related to the uploaded file or
         * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
         */
        private String metadata;

        /**
         * A string containing a JSON-encoded object with metadata related to the uploaded file or
         * resource. Example: {"fileName":"report.pdf","uploader":"jane.doe","category":"financial"}
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(HeadDataFileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            contentType(o.getContentType());
            contentLength(o.getContentLength());
            contentMd5(o.getContentMd5());
            contentEncoding(o.getContentEncoding());
            contentLanguage(o.getContentLanguage());
            contentDisposition(o.getContentDisposition());
            lastModified(o.getLastModified());
            metadata(o.getMetadata());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public HeadDataFileResponse build() {
            return new HeadDataFileResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    opcClientRequestId,
                    contentType,
                    contentLength,
                    contentMd5,
                    contentEncoding,
                    contentLanguage,
                    contentDisposition,
                    lastModified,
                    metadata);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",contentType=").append(String.valueOf(contentType));
        sb.append(",contentLength=").append(String.valueOf(contentLength));
        sb.append(",contentMd5=").append(String.valueOf(contentMd5));
        sb.append(",contentEncoding=").append(String.valueOf(contentEncoding));
        sb.append(",contentLanguage=").append(String.valueOf(contentLanguage));
        sb.append(",contentDisposition=").append(String.valueOf(contentDisposition));
        sb.append(",lastModified=").append(String.valueOf(lastModified));
        sb.append(",metadata=").append(String.valueOf(metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeadDataFileResponse)) {
            return false;
        }

        HeadDataFileResponse other = (HeadDataFileResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.contentMd5, other.contentMd5)
                && java.util.Objects.equals(this.contentEncoding, other.contentEncoding)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.lastModified, other.lastModified)
                && java.util.Objects.equals(this.metadata, other.metadata);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result = (result * PRIME) + (this.contentMd5 == null ? 43 : this.contentMd5.hashCode());
        result =
                (result * PRIME)
                        + (this.contentEncoding == null ? 43 : this.contentEncoding.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLanguage == null ? 43 : this.contentLanguage.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        return result;
    }
}
