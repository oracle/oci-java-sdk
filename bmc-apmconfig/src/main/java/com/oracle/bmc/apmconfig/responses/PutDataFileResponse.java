/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.responses;

import com.oracle.bmc.apmconfig.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class PutDataFileResponse extends com.oracle.bmc.responses.BmcResponse {
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

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "opcClientRequestId",
        "contentMd5",
        "lastModified"
    })
    private PutDataFileResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String opcClientRequestId,
            String contentMd5,
            java.util.Date lastModified) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcClientRequestId = opcClientRequestId;
        this.contentMd5 = contentMd5;
        this.lastModified = lastModified;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<PutDataFileResponse> {
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
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(PutDataFileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcClientRequestId(o.getOpcClientRequestId());
            contentMd5(o.getContentMd5());
            lastModified(o.getLastModified());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public PutDataFileResponse build() {
            return new PutDataFileResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    opcClientRequestId,
                    contentMd5,
                    lastModified);
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
        sb.append(",contentMd5=").append(String.valueOf(contentMd5));
        sb.append(",lastModified=").append(String.valueOf(lastModified));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutDataFileResponse)) {
            return false;
        }

        PutDataFileResponse other = (PutDataFileResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.contentMd5, other.contentMd5)
                && java.util.Objects.equals(this.lastModified, other.lastModified);
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
        result = (result * PRIME) + (this.contentMd5 == null ? 43 : this.contentMd5.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        return result;
    }
}
