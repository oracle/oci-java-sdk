/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.responses;

import com.oracle.bmc.generativeai.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class GetSandboxWarmPoolResponse extends com.oracle.bmc.responses.BmcResponse {
    /** Request identifier. */
    private String opcRequestId;

    /**
     * Request identifier.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** Opaque configuration ETag; use if-match on mutations. */
    private String etag;

    /**
     * Opaque configuration ETag; use if-match on mutations.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code SandboxWarmPool} instance. */
    private com.oracle.bmc.generativeai.model.SandboxWarmPool sandboxWarmPool;

    /**
     * The returned {@code SandboxWarmPool} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.generativeai.model.SandboxWarmPool getSandboxWarmPool() {
        return sandboxWarmPool;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "sandboxWarmPool"
    })
    private GetSandboxWarmPoolResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.generativeai.model.SandboxWarmPool sandboxWarmPool) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.sandboxWarmPool = sandboxWarmPool;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetSandboxWarmPoolResponse> {
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

        /** Request identifier. */
        private String opcRequestId;

        /**
         * Request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** Opaque configuration ETag; use if-match on mutations. */
        private String etag;

        /**
         * Opaque configuration ETag; use if-match on mutations.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code SandboxWarmPool} instance. */
        private com.oracle.bmc.generativeai.model.SandboxWarmPool sandboxWarmPool;

        /**
         * The returned {@code SandboxWarmPool} instance.
         *
         * @param sandboxWarmPool the value to set
         * @return this builder
         */
        public Builder sandboxWarmPool(
                com.oracle.bmc.generativeai.model.SandboxWarmPool sandboxWarmPool) {
            this.sandboxWarmPool = sandboxWarmPool;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetSandboxWarmPoolResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            sandboxWarmPool(o.getSandboxWarmPool());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetSandboxWarmPoolResponse build() {
            return new GetSandboxWarmPoolResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, sandboxWarmPool);
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
        sb.append(",sandboxWarmPool=").append(String.valueOf(sandboxWarmPool));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSandboxWarmPoolResponse)) {
            return false;
        }

        GetSandboxWarmPoolResponse other = (GetSandboxWarmPoolResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.sandboxWarmPool, other.sandboxWarmPool);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.sandboxWarmPool == null ? 43 : this.sandboxWarmPool.hashCode());
        return result;
    }
}
