/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.responses;

import com.oracle.bmc.dataflow.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class GetRunLogResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** Indicates the size of the data as described in RFC 2616, section 14.13. */
    private Long contentLength;

    /**
     * Indicates the size of the data as described in RFC 2616, section 14.13.
     *
     * @return the value
     */
    public Long getContentLength() {
        return contentLength;
    }

    /** Specifies the media type of the underlying data as described in RFC 2616, section 14.17. */
    private String contentType;

    /**
     * Specifies the media type of the underlying data as described in RFC 2616, section 14.17.
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /** Indicates the encoding of the data, as described in RFC 2616, section 14.11. */
    private String contentEncoding;

    /**
     * Indicates the encoding of the data, as described in RFC 2616, section 14.11.
     *
     * @return the value
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /** The user-defined metadata for the log. */
    private java.util.Map<String, String> opcMeta;

    /**
     * The user-defined metadata for the log.
     *
     * @return the value
     */
    public java.util.Map<String, String> getOpcMeta() {
        return opcMeta;
    }

    /** The returned java.io.InputStream instance. */
    private java.io.InputStream inputStream;

    /**
     * The returned java.io.InputStream instance.
     *
     * @return the value
     */
    public java.io.InputStream getInputStream() {
        return inputStream;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "contentLength",
        "contentType",
        "contentEncoding",
        "opcMeta",
        "inputStream"
    })
    private GetRunLogResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            Long contentLength,
            String contentType,
            String contentEncoding,
            java.util.Map<String, String> opcMeta,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.contentLength = contentLength;
        this.contentType = contentType;
        this.contentEncoding = contentEncoding;
        this.opcMeta = opcMeta;
        this.inputStream = inputStream;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetRunLogResponse> {
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
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
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

        /** Indicates the size of the data as described in RFC 2616, section 14.13. */
        private Long contentLength;

        /**
         * Indicates the size of the data as described in RFC 2616, section 14.13.
         *
         * @param contentLength the value to set
         * @return this builder
         */
        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * Specifies the media type of the underlying data as described in RFC 2616, section 14.17.
         */
        private String contentType;

        /**
         * Specifies the media type of the underlying data as described in RFC 2616, section 14.17.
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /** Indicates the encoding of the data, as described in RFC 2616, section 14.11. */
        private String contentEncoding;

        /**
         * Indicates the encoding of the data, as described in RFC 2616, section 14.11.
         *
         * @param contentEncoding the value to set
         * @return this builder
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        /** The user-defined metadata for the log. */
        private java.util.Map<String, String> opcMeta;

        /**
         * The user-defined metadata for the log.
         *
         * @param opcMeta the value to set
         * @return this builder
         */
        public Builder opcMeta(java.util.Map<String, String> opcMeta) {
            this.opcMeta = opcMeta;
            return this;
        }

        /** The returned java.io.InputStream instance. */
        private java.io.InputStream inputStream;

        /**
         * The returned java.io.InputStream instance.
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
        public Builder copy(GetRunLogResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            contentLength(o.getContentLength());
            contentType(o.getContentType());
            contentEncoding(o.getContentEncoding());
            opcMeta(o.getOpcMeta());
            inputStream(o.getInputStream());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetRunLogResponse build() {
            return new GetRunLogResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    etag,
                    contentLength,
                    contentType,
                    contentEncoding,
                    opcMeta,
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",contentLength=").append(String.valueOf(contentLength));
        sb.append(",contentType=").append(String.valueOf(contentType));
        sb.append(",contentEncoding=").append(String.valueOf(contentEncoding));
        sb.append(",opcMeta=").append(String.valueOf(opcMeta));
        sb.append(",inputStream=").append(String.valueOf(inputStream));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetRunLogResponse)) {
            return false;
        }

        GetRunLogResponse other = (GetRunLogResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentEncoding, other.contentEncoding)
                && java.util.Objects.equals(this.opcMeta, other.opcMeta)
                && java.util.Objects.equals(this.inputStream, other.inputStream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentEncoding == null ? 43 : this.contentEncoding.hashCode());
        result = (result * PRIME) + (this.opcMeta == null ? 43 : this.opcMeta.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        return result;
    }
}
