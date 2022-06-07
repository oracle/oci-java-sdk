/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.responses;

import com.oracle.bmc.dataflow.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
public class GetRunLogResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle assigned identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control.
     * See [ETags for Optimistic Concurrency Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven).
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

    /**
     * Indicates the size of the data as described in RFC 2616, section 14.13.
     *
     */
    private Long contentLength;

    public Long getContentLength() {
        return contentLength;
    }

    /**
     * Specifies the media type of the underlying data as described in RFC 2616, section 14.17.
     *
     */
    private String contentType;

    public String getContentType() {
        return contentType;
    }

    /**
     * Indicates the encoding of the data, as described in RFC 2616, section 14.11.
     *
     */
    private String contentEncoding;

    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * The user-defined metadata for the log.
     *
     */
    private java.util.Map<String, String> opcMeta;

    public java.util.Map<String, String> getOpcMeta() {
        return opcMeta;
    }

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    public java.io.InputStream getInputStream() {
        return inputStream;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
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
            String opcRequestId,
            String etag,
            Long contentLength,
            String contentType,
            String contentEncoding,
            java.util.Map<String, String> opcMeta,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.contentLength = contentLength;
        this.contentType = contentType;
        this.contentEncoding = contentEncoding;
        this.opcMeta = opcMeta;
        this.inputStream = inputStream;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private Long contentLength;

        public Builder contentLength(Long contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        private String contentType;

        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        private String contentEncoding;

        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            return this;
        }

        private java.util.Map<String, String> opcMeta;

        public Builder opcMeta(java.util.Map<String, String> opcMeta) {
            this.opcMeta = opcMeta;
            return this;
        }

        private java.io.InputStream inputStream;

        public Builder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRunLogResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            contentLength(o.getContentLength());
            contentType(o.getContentType());
            contentEncoding(o.getContentEncoding());
            opcMeta(o.getOpcMeta());
            inputStream(o.getInputStream());

            return this;
        }

        public GetRunLogResponse build() {
            return new GetRunLogResponse(
                    __httpStatusCode__,
                    opcRequestId,
                    etag,
                    contentLength,
                    contentType,
                    contentEncoding,
                    opcMeta,
                    inputStream);
        }
    }

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
