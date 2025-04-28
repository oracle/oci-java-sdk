/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.responses;

import com.oracle.bmc.cloudmigrations.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public class GetTargetAssetResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control, see {@code if-match.} */
    private String etag;

    /**
     * For optimistic concurrency control, see {@code if-match.}
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

    /** The returned {@code TargetAsset} instance. */
    private com.oracle.bmc.cloudmigrations.model.TargetAsset targetAsset;

    /**
     * The returned {@code TargetAsset} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.cloudmigrations.model.TargetAsset getTargetAsset() {
        return targetAsset;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "targetAsset"
    })
    private GetTargetAssetResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.cloudmigrations.model.TargetAsset targetAsset) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.targetAsset = targetAsset;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetTargetAssetResponse> {
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

        /** For optimistic concurrency control, see {@code if-match.} */
        private String etag;

        /**
         * For optimistic concurrency control, see {@code if-match.}
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

        /** The returned {@code TargetAsset} instance. */
        private com.oracle.bmc.cloudmigrations.model.TargetAsset targetAsset;

        /**
         * The returned {@code TargetAsset} instance.
         *
         * @param targetAsset the value to set
         * @return this builder
         */
        public Builder targetAsset(com.oracle.bmc.cloudmigrations.model.TargetAsset targetAsset) {
            this.targetAsset = targetAsset;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetTargetAssetResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            targetAsset(o.getTargetAsset());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetTargetAssetResponse build() {
            return new GetTargetAssetResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, targetAsset);
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
        sb.append(",targetAsset=").append(String.valueOf(targetAsset));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTargetAssetResponse)) {
            return false;
        }

        GetTargetAssetResponse other = (GetTargetAssetResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.targetAsset, other.targetAsset);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.targetAsset == null ? 43 : this.targetAsset.hashCode());
        return result;
    }
}
