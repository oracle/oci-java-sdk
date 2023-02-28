/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.responses;

import com.oracle.bmc.keymanagement.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class RestoreVaultFromFileResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The base64-encoded MD5 hash value of the request body, as computed by the server. */
    private String opcContentMd5;

    /**
     * The base64-encoded MD5 hash value of the request body, as computed by the server.
     *
     * @return the value
     */
    public String getOpcContentMd5() {
        return opcContentMd5;
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

    /**
     * Unique Oracle-assigned identifier for the work request, used to track the progress of the
     * restore operation.
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the work request, used to track the progress of the
     * restore operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** The returned Vault instance. */
    private com.oracle.bmc.keymanagement.model.Vault vault;

    /**
     * The returned Vault instance.
     *
     * @return the value
     */
    public com.oracle.bmc.keymanagement.model.Vault getVault() {
        return vault;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcContentMd5",
        "opcRequestId",
        "opcWorkRequestId",
        "vault"
    })
    private RestoreVaultFromFileResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcContentMd5,
            String opcRequestId,
            String opcWorkRequestId,
            com.oracle.bmc.keymanagement.model.Vault vault) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcContentMd5 = opcContentMd5;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.vault = vault;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<RestoreVaultFromFileResponse> {
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

        /** The base64-encoded MD5 hash value of the request body, as computed by the server. */
        private String opcContentMd5;

        /**
         * The base64-encoded MD5 hash value of the request body, as computed by the server.
         *
         * @param opcContentMd5 the value to set
         * @return this builder
         */
        public Builder opcContentMd5(String opcContentMd5) {
            this.opcContentMd5 = opcContentMd5;
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

        /**
         * Unique Oracle-assigned identifier for the work request, used to track the progress of the
         * restore operation.
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the work request, used to track the progress of the
         * restore operation.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** The returned Vault instance. */
        private com.oracle.bmc.keymanagement.model.Vault vault;

        /**
         * The returned Vault instance.
         *
         * @param vault the value to set
         * @return this builder
         */
        public Builder vault(com.oracle.bmc.keymanagement.model.Vault vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(RestoreVaultFromFileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcContentMd5(o.getOpcContentMd5());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            vault(o.getVault());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public RestoreVaultFromFileResponse build() {
            return new RestoreVaultFromFileResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcContentMd5,
                    opcRequestId,
                    opcWorkRequestId,
                    vault);
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
        sb.append(",opcContentMd5=").append(String.valueOf(opcContentMd5));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",vault=").append(String.valueOf(vault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreVaultFromFileResponse)) {
            return false;
        }

        RestoreVaultFromFileResponse other = (RestoreVaultFromFileResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcContentMd5, other.opcContentMd5)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.vault, other.vault);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentMd5 == null ? 43 : this.opcContentMd5.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.vault == null ? 43 : this.vault.hashCode());
        return result;
    }
}
