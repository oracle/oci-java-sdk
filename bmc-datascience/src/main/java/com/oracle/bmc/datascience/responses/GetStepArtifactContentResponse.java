/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.responses;

import com.oracle.bmc.datascience.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class GetStepArtifactContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency
     * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     */
    private String etag;

    /**
     * For optimistic concurrency control. See [ETags for Optimistic Concurrency
     * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The content size of the body in bytes. */
    private Long contentLength;

    /**
     * The content size of the body in bytes.
     *
     * @return the value
     */
    public Long getContentLength() {
        return contentLength;
    }

    /**
     * The base-64 encoded MD5 hash of the body, as described in [RFC
     * 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15. Unavailable for objects uploaded
     * using multipart upload. If the {@code content-md5} header is present, Object Storage performs
     * an integrity check on the body of the HTTP request by computing the MD5 hash for the body and
     * comparing it to the MD5 hash supplied in the header. If the two hashes do not match, the
     * object is rejected and an HTTP-400 Unmatched Content MD5 error is returned with the message:
     * "The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header
     * (HEADER_MD5)"
     */
    private String contentMd5;

    /**
     * The base-64 encoded MD5 hash of the body, as described in [RFC
     * 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15. Unavailable for objects uploaded
     * using multipart upload. If the {@code content-md5} header is present, Object Storage performs
     * an integrity check on the body of the HTTP request by computing the MD5 hash for the body and
     * comparing it to the MD5 hash supplied in the header. If the two hashes do not match, the
     * object is rejected and an HTTP-400 Unmatched Content MD5 error is returned with the message:
     * "The computed MD5 of the request body (ACTUAL_MD5) does not match the Content-MD5 header
     * (HEADER_MD5)"
     *
     * @return the value
     */
    public String getContentMd5() {
        return contentMd5;
    }

    /**
     * The artifact modification time, as described in [RFC
     * 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     */
    private java.util.Date lastModified;

    /**
     * The artifact modification time, as described in [RFC
     * 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getLastModified() {
        return lastModified;
    }

    /**
     * The content disposition of the body, as described in [RFC
     * 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
     */
    private String contentDisposition;

    /**
     * The content disposition of the body, as described in [RFC
     * 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
     *
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /** The returned {@code java.io.InputStream} instance. */
    private java.io.InputStream inputStream;

    /**
     * The returned {@code java.io.InputStream} instance.
     *
     * @return the value
     */
    public java.io.InputStream getInputStream() {
        return inputStream;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "contentLength",
        "contentMd5",
        "lastModified",
        "contentDisposition",
        "inputStream"
    })
    private GetStepArtifactContentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            Long contentLength,
            String contentMd5,
            java.util.Date lastModified,
            String contentDisposition,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.contentLength = contentLength;
        this.contentMd5 = contentMd5;
        this.lastModified = lastModified;
        this.contentDisposition = contentDisposition;
        this.inputStream = inputStream;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetStepArtifactContentResponse> {
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
         * For optimistic concurrency control. See [ETags for Optimistic Concurrency
         * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
         */
        private String etag;

        /**
         * For optimistic concurrency control. See [ETags for Optimistic Concurrency
         * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The content size of the body in bytes. */
        private Long contentLength;

        /**
         * The content size of the body in bytes.
         *
         * @param contentLength the value to set
         * @return this builder
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * The base-64 encoded MD5 hash of the body, as described in [RFC
         * 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15. Unavailable for objects
         * uploaded using multipart upload. If the {@code content-md5} header is present, Object
         * Storage performs an integrity check on the body of the HTTP request by computing the MD5
         * hash for the body and comparing it to the MD5 hash supplied in the header. If the two
         * hashes do not match, the object is rejected and an HTTP-400 Unmatched Content MD5 error
         * is returned with the message: "The computed MD5 of the request body (ACTUAL_MD5) does not
         * match the Content-MD5 header (HEADER_MD5)"
         */
        private String contentMd5;

        /**
         * The base-64 encoded MD5 hash of the body, as described in [RFC
         * 2616](https://tools.ietf.org/rfc/rfc2616), section 14.15. Unavailable for objects
         * uploaded using multipart upload. If the {@code content-md5} header is present, Object
         * Storage performs an integrity check on the body of the HTTP request by computing the MD5
         * hash for the body and comparing it to the MD5 hash supplied in the header. If the two
         * hashes do not match, the object is rejected and an HTTP-400 Unmatched Content MD5 error
         * is returned with the message: "The computed MD5 of the request body (ACTUAL_MD5) does not
         * match the Content-MD5 header (HEADER_MD5)"
         *
         * @param contentMd5 the value to set
         * @return this builder
         */
        public Builder contentMd5(String contentMd5) {
            this.contentMd5 = contentMd5;
            return this;
        }

        /**
         * The artifact modification time, as described in [RFC
         * 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
         */
        private java.util.Date lastModified;

        /**
         * The artifact modification time, as described in [RFC
         * 2616](https://tools.ietf.org/rfc/rfc2616), section 14.29.
         *
         * @param lastModified the value to set
         * @return this builder
         */
        public Builder lastModified(java.util.Date lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * The content disposition of the body, as described in [RFC
         * 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
         */
        private String contentDisposition;

        /**
         * The content disposition of the body, as described in [RFC
         * 2616](https://tools.ietf.org/rfc/rfc2616), section 19.5.1.
         *
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /** The returned {@code java.io.InputStream} instance. */
        private java.io.InputStream inputStream;

        /**
         * The returned {@code java.io.InputStream} instance.
         *
         * @param inputStream the value to set
         * @return this builder
         */
        public Builder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetStepArtifactContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            contentLength(o.getContentLength());
            contentMd5(o.getContentMd5());
            lastModified(o.getLastModified());
            contentDisposition(o.getContentDisposition());
            inputStream(o.getInputStream());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetStepArtifactContentResponse build() {
            return new GetStepArtifactContentResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    contentLength,
                    contentMd5,
                    lastModified,
                    contentDisposition,
                    inputStream);
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
        sb.append(",contentLength=").append(String.valueOf(contentLength));
        sb.append(",contentMd5=").append(String.valueOf(contentMd5));
        sb.append(",lastModified=").append(String.valueOf(lastModified));
        sb.append(",contentDisposition=").append(String.valueOf(contentDisposition));
        sb.append(",inputStream=").append(String.valueOf(inputStream));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetStepArtifactContentResponse)) {
            return false;
        }

        GetStepArtifactContentResponse other = (GetStepArtifactContentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.contentMd5, other.contentMd5)
                && java.util.Objects.equals(this.lastModified, other.lastModified)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.inputStream, other.inputStream);
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
        result = (result * PRIME) + (this.contentMd5 == null ? 43 : this.contentMd5.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        return result;
    }
}
