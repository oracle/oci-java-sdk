/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.responses;

import com.oracle.bmc.datalabelingservicedataplane.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
public class GetRecordPreviewContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
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
     * A unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The content size of the body in bytes.
     */
    private Long contentLength;

    /**
     * The content size of the body in bytes.
     * @return the value
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * The content disposition of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
     */
    private String contentDisposition;

    /**
     * The content disposition of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * The content type as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.17.
     */
    private String contentType;

    /**
     * The content type as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.17.
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Cache-control allows us to tell browsers to cache assets, how long to store them, and whether to validate them.
     *
     */
    private String cacheControl;

    /**
     * Cache-control allows us to tell browsers to cache assets, how long to store them, and whether to validate them.
     *
     * @return the value
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true.
     */
    private java.io.InputStream inputStream;

    /**
     * The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true.
     * @return the value
     */
    public java.io.InputStream getInputStream() {
        return inputStream;
    }

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    /**
     * Flag to indicate whether or not the object was modified.  If this is true,
     * the getter for the object itself will return null.  Callers should check this
     * if they specified one of the request params that might result in a conditional
     * response (like 'if-match'/'if-none-match').
     * @param true if the object was not modified
     */
    public boolean isNotModified() {
        return isNotModified;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "contentLength",
        "contentDisposition",
        "contentType",
        "cacheControl",
        "inputStream",
        "isNotModified"
    })
    private GetRecordPreviewContentResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String etag,
            String opcRequestId,
            Long contentLength,
            String contentDisposition,
            String contentType,
            String cacheControl,
            java.io.InputStream inputStream,
            boolean isNotModified) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.contentLength = contentLength;
        this.contentDisposition = contentDisposition;
        this.contentType = contentType;
        this.cacheControl = cacheControl;
        this.inputStream = inputStream;
        this.isNotModified = isNotModified;
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
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
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
         * A unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact
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
         * The content size of the body in bytes.
         */
        private Long contentLength;

        /**
         * The content size of the body in bytes.
         * @param contentLength the value to set
         * @return this builder
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * The content disposition of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
         */
        private String contentDisposition;

        /**
         * The content disposition of the body, as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * The content type as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.17.
         */
        private String contentType;

        /**
         * The content type as described in [RFC 2616](https://tools.ietf.org/rfc/rfc2616), section 14.17.
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Cache-control allows us to tell browsers to cache assets, how long to store them, and whether to validate them.
         *
         */
        private String cacheControl;

        /**
         * Cache-control allows us to tell browsers to cache assets, how long to store them, and whether to validate them.
         *
         * @param cacheControl the value to set
         * @return this builder
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            return this;
        }

        /**
         * The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true.
         */
        private java.io.InputStream inputStream;

        /**
         * The returned java.io.InputStream instance, or null if {@link #isNotModified()} is true.
         * @param inputStream the value to set
         * @return this builder
         */
        public Builder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        /**
         * Flag to indicate whether or not the object was modified.  If this is true,
         * the getter for the object itself will return null.  Callers should check this
         * if they specified one of the request params that might result in a conditional
         * response (like 'if-match'/'if-none-match').
         */
        private boolean isNotModified;

        /**
         * Flag to indicate whether or not the object was modified.  If this is true,
         * the getter for the object itself will return null.  Callers should check this
         * if they specified one of the request params that might result in a conditional
         * response (like 'if-match'/'if-none-match').
         * @param true if the object was not modified
         */
        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRecordPreviewContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            contentLength(o.getContentLength());
            contentDisposition(o.getContentDisposition());
            contentType(o.getContentType());
            cacheControl(o.getCacheControl());
            inputStream(o.getInputStream());
            isNotModified(o.isNotModified());
            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetRecordPreviewContentResponse build() {
            return new GetRecordPreviewContentResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    contentLength,
                    contentDisposition,
                    contentType,
                    cacheControl,
                    inputStream,
                    isNotModified);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",contentLength=").append(String.valueOf(contentLength));
        sb.append(",contentDisposition=").append(String.valueOf(contentDisposition));
        sb.append(",contentType=").append(String.valueOf(contentType));
        sb.append(",cacheControl=").append(String.valueOf(cacheControl));
        sb.append(",inputStream=").append(String.valueOf(inputStream));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRecordPreviewContentResponse)) {
            return false;
        }

        GetRecordPreviewContentResponse other = (GetRecordPreviewContentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.cacheControl, other.cacheControl)
                && java.util.Objects.equals(this.inputStream, other.inputStream)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.cacheControl == null ? 43 : this.cacheControl.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
