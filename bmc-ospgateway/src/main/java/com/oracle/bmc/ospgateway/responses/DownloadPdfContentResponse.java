/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.responses;

import com.oracle.bmc.ospgateway.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
public class DownloadPdfContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
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
     * Set content to download
     */
    private String contentDisposition;

    /**
     * Set content to download
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * Set the content type to download
     */
    private String contentType;

    /**
     * Set the content type to download
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Set the content length to download
     */
    private Integer contentLength;

    /**
     * Set the content length to download
     * @return the value
     */
    public Integer getContentLength() {
        return contentLength;
    }

    /**
     * The returned java.io.InputStream instance.
     */
    private java.io.InputStream inputStream;

    /**
     * The returned java.io.InputStream instance.
     * @return the value
     */
    public java.io.InputStream getInputStream() {
        return inputStream;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "contentDisposition",
        "contentType",
        "contentLength",
        "inputStream"
    })
    private DownloadPdfContentResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String contentDisposition,
            String contentType,
            Integer contentLength,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.contentDisposition = contentDisposition;
        this.contentType = contentType;
        this.contentLength = contentLength;
        this.inputStream = inputStream;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
         * Set content to download
         */
        private String contentDisposition;

        /**
         * Set content to download
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            return this;
        }

        /**
         * Set the content type to download
         */
        private String contentType;

        /**
         * Set the content type to download
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Set the content length to download
         */
        private Integer contentLength;

        /**
         * Set the content length to download
         * @param contentLength the value to set
         * @return this builder
         */
        public Builder contentLength(Integer contentLength) {
            this.contentLength = contentLength;
            return this;
        }

        /**
         * The returned java.io.InputStream instance.
         */
        private java.io.InputStream inputStream;

        /**
         * The returned java.io.InputStream instance.
         * @param inputStream the value to set
         * @return this builder
         */
        public Builder inputStream(java.io.InputStream inputStream) {
            this.inputStream = inputStream;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DownloadPdfContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            contentDisposition(o.getContentDisposition());
            contentType(o.getContentType());
            contentLength(o.getContentLength());
            inputStream(o.getInputStream());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public DownloadPdfContentResponse build() {
            return new DownloadPdfContentResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    contentDisposition,
                    contentType,
                    contentLength,
                    inputStream);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",contentDisposition=").append(String.valueOf(contentDisposition));
        sb.append(",contentType=").append(String.valueOf(contentType));
        sb.append(",contentLength=").append(String.valueOf(contentLength));
        sb.append(",inputStream=").append(String.valueOf(inputStream));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadPdfContentResponse)) {
            return false;
        }

        DownloadPdfContentResponse other = (DownloadPdfContentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentLength, other.contentLength)
                && java.util.Objects.equals(this.inputStream, other.inputStream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLength == null ? 43 : this.contentLength.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        return result;
    }
}
