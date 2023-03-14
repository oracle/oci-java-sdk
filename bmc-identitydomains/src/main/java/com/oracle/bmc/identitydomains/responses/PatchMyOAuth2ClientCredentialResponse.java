/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.responses;

import com.oracle.bmc.identitydomains.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
public class PatchMyOAuth2ClientCredentialResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned MyOAuth2ClientCredential instance. */
    private com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential myOAuth2ClientCredential;

    /**
     * The returned MyOAuth2ClientCredential instance.
     *
     * @return the value
     */
    public com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential
            getMyOAuth2ClientCredential() {
        return myOAuth2ClientCredential;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "myOAuth2ClientCredential"
    })
    private PatchMyOAuth2ClientCredentialResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential
                    myOAuth2ClientCredential) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.myOAuth2ClientCredential = myOAuth2ClientCredential;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    PatchMyOAuth2ClientCredentialResponse> {
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

        /** The returned MyOAuth2ClientCredential instance. */
        private com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential
                myOAuth2ClientCredential;

        /**
         * The returned MyOAuth2ClientCredential instance.
         *
         * @param myOAuth2ClientCredential the value to set
         * @return this builder
         */
        public Builder myOAuth2ClientCredential(
                com.oracle.bmc.identitydomains.model.MyOAuth2ClientCredential
                        myOAuth2ClientCredential) {
            this.myOAuth2ClientCredential = myOAuth2ClientCredential;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(PatchMyOAuth2ClientCredentialResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            myOAuth2ClientCredential(o.getMyOAuth2ClientCredential());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public PatchMyOAuth2ClientCredentialResponse build() {
            return new PatchMyOAuth2ClientCredentialResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, myOAuth2ClientCredential);
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
        sb.append(",myOAuth2ClientCredential=").append(String.valueOf(myOAuth2ClientCredential));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchMyOAuth2ClientCredentialResponse)) {
            return false;
        }

        PatchMyOAuth2ClientCredentialResponse other = (PatchMyOAuth2ClientCredentialResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.myOAuth2ClientCredential, other.myOAuth2ClientCredential);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.myOAuth2ClientCredential == null
                                ? 43
                                : this.myOAuth2ClientCredential.hashCode());
        return result;
    }
}
