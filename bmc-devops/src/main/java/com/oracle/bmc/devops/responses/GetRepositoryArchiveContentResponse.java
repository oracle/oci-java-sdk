/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.responses;

import com.oracle.bmc.devops.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
public class GetRepositoryArchiveContentResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** Content type refers to content of a file which is transferred via HTTP */
    private String contentType;

    /**
     * Content type refers to content of a file which is transferred via HTTP
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * The Content-Disposition response-header field has been proposed as a means for the origin
     * server to suggest a default filename if the user requests that the content is saved to a
     * file.
     */
    private String contentDisposition;

    /**
     * The Content-Disposition response-header field has been proposed as a means for the origin
     * server to suggest a default filename if the user requests that the content is saved to a
     * file.
     *
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
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
        "contentType",
        "contentDisposition",
        "inputStream"
    })
    private GetRepositoryArchiveContentResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String contentType,
            String contentDisposition,
            java.io.InputStream inputStream) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.contentType = contentType;
        this.contentDisposition = contentDisposition;
        this.inputStream = inputStream;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetRepositoryArchiveContentResponse> {
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
         * particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Content type refers to content of a file which is transferred via HTTP */
        private String contentType;

        /**
         * Content type refers to content of a file which is transferred via HTTP
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * The Content-Disposition response-header field has been proposed as a means for the origin
         * server to suggest a default filename if the user requests that the content is saved to a
         * file.
         */
        private String contentDisposition;

        /**
         * The Content-Disposition response-header field has been proposed as a means for the origin
         * server to suggest a default filename if the user requests that the content is saved to a
         * file.
         *
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
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
        public Builder copy(GetRepositoryArchiveContentResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            contentType(o.getContentType());
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
        public GetRepositoryArchiveContentResponse build() {
            return new GetRepositoryArchiveContentResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    contentType,
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",contentType=").append(String.valueOf(contentType));
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
        if (!(o instanceof GetRepositoryArchiveContentResponse)) {
            return false;
        }

        GetRepositoryArchiveContentResponse other = (GetRepositoryArchiveContentResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.inputStream, other.inputStream);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result = (result * PRIME) + (this.inputStream == null ? 43 : this.inputStream.hashCode());
        return result;
    }
}
