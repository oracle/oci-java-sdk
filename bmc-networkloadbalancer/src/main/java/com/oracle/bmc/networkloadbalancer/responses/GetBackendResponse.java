/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.responses;

import com.oracle.bmc.networkloadbalancer.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class GetBackendResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you must contact Oracle about a
     * particular request, then provide the request identifier.
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

    /** The returned {@code Backend} instance. */
    private com.oracle.bmc.networkloadbalancer.model.Backend backend;

    /**
     * The returned {@code Backend} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.networkloadbalancer.model.Backend getBackend() {
        return backend;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "backend"
    })
    private GetBackendResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.networkloadbalancer.model.Backend backend) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.backend = backend;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetBackendResponse> {
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
         * Unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you must contact Oracle about a
         * particular request, then provide the request identifier.
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

        /** The returned {@code Backend} instance. */
        private com.oracle.bmc.networkloadbalancer.model.Backend backend;

        /**
         * The returned {@code Backend} instance.
         *
         * @param backend the value to set
         * @return this builder
         */
        public Builder backend(com.oracle.bmc.networkloadbalancer.model.Backend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetBackendResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            backend(o.getBackend());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetBackendResponse build() {
            return new GetBackendResponse(__httpStatusCode__, headers, opcRequestId, etag, backend);
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
        sb.append(",backend=").append(String.valueOf(backend));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBackendResponse)) {
            return false;
        }

        GetBackendResponse other = (GetBackendResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.backend, other.backend);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.backend == null ? 43 : this.backend.hashCode());
        return result;
    }
}
