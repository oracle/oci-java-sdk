/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.responses;

import com.oracle.bmc.generativeai.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class UpdateSandboxWarmPoolResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
     * request.
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
     * request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /** Opaque ETag of the persisted configuration. */
    private String etag;

    /**
     * Opaque ETag of the persisted configuration.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

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
        "opcWorkRequestId",
        "etag",
        "opcRequestId",
        "sandboxWarmPool"
    })
    private UpdateSandboxWarmPoolResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcWorkRequestId,
            String etag,
            String opcRequestId,
            com.oracle.bmc.generativeai.model.SandboxWarmPool sandboxWarmPool) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.sandboxWarmPool = sandboxWarmPool;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<UpdateSandboxWarmPoolResponse> {
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
         * request.
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
         * request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /** Opaque ETag of the persisted configuration. */
        private String etag;

        /**
         * Opaque ETag of the persisted configuration.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
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
        public Builder copy(UpdateSandboxWarmPoolResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            sandboxWarmPool(o.getSandboxWarmPool());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateSandboxWarmPoolResponse build() {
            return new UpdateSandboxWarmPoolResponse(
                    __httpStatusCode__,
                    headers,
                    opcWorkRequestId,
                    etag,
                    opcRequestId,
                    sandboxWarmPool);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",sandboxWarmPool=").append(String.valueOf(sandboxWarmPool));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSandboxWarmPoolResponse)) {
            return false;
        }

        UpdateSandboxWarmPoolResponse other = (UpdateSandboxWarmPoolResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sandboxWarmPool, other.sandboxWarmPool);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.sandboxWarmPool == null ? 43 : this.sandboxWarmPool.hashCode());
        return result;
    }
}
