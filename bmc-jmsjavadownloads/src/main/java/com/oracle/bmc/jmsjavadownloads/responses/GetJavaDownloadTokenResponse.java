/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.responses;

import com.oracle.bmc.jmsjavadownloads.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class GetJavaDownloadTokenResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned JavaDownloadToken instance.
     */
    private com.oracle.bmc.jmsjavadownloads.model.JavaDownloadToken javaDownloadToken;

    /**
     * The returned JavaDownloadToken instance.
     * @return the value
     */
    public com.oracle.bmc.jmsjavadownloads.model.JavaDownloadToken getJavaDownloadToken() {
        return javaDownloadToken;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "javaDownloadToken"
    })
    private GetJavaDownloadTokenResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.jmsjavadownloads.model.JavaDownloadToken javaDownloadToken) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.javaDownloadToken = javaDownloadToken;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned JavaDownloadToken instance.
         */
        private com.oracle.bmc.jmsjavadownloads.model.JavaDownloadToken javaDownloadToken;

        /**
         * The returned JavaDownloadToken instance.
         * @param javaDownloadToken the value to set
         * @return this builder
         */
        public Builder javaDownloadToken(
                com.oracle.bmc.jmsjavadownloads.model.JavaDownloadToken javaDownloadToken) {
            this.javaDownloadToken = javaDownloadToken;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetJavaDownloadTokenResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            javaDownloadToken(o.getJavaDownloadToken());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetJavaDownloadTokenResponse build() {
            return new GetJavaDownloadTokenResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, javaDownloadToken);
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
        sb.append(",javaDownloadToken=").append(String.valueOf(javaDownloadToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetJavaDownloadTokenResponse)) {
            return false;
        }

        GetJavaDownloadTokenResponse other = (GetJavaDownloadTokenResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.javaDownloadToken, other.javaDownloadToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.javaDownloadToken == null ? 43 : this.javaDownloadToken.hashCode());
        return result;
    }
}
