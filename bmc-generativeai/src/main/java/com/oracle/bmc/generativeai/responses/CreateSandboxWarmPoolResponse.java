/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.responses;

import com.oracle.bmc.generativeai.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
public class CreateSandboxWarmPoolResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** Nested resource URI addressed by name. */
    private String location;

    /**
     * Nested resource URI addressed by name.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
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
        "opcRequestId",
        "etag",
        "location",
        "sandboxWarmPool"
    })
    private CreateSandboxWarmPoolResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcWorkRequestId,
            String opcRequestId,
            String etag,
            String location,
            com.oracle.bmc.generativeai.model.SandboxWarmPool sandboxWarmPool) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.location = location;
        this.sandboxWarmPool = sandboxWarmPool;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateSandboxWarmPoolResponse> {
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

        /** Nested resource URI addressed by name. */
        private String location;

        /**
         * Nested resource URI addressed by name.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
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
        public Builder copy(CreateSandboxWarmPoolResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            location(o.getLocation());
            sandboxWarmPool(o.getSandboxWarmPool());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateSandboxWarmPoolResponse build() {
            return new CreateSandboxWarmPoolResponse(
                    __httpStatusCode__,
                    headers,
                    opcWorkRequestId,
                    opcRequestId,
                    etag,
                    location,
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",sandboxWarmPool=").append(String.valueOf(sandboxWarmPool));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSandboxWarmPoolResponse)) {
            return false;
        }

        CreateSandboxWarmPoolResponse other = (CreateSandboxWarmPoolResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.sandboxWarmPool, other.sandboxWarmPool);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.sandboxWarmPool == null ? 43 : this.sandboxWarmPool.hashCode());
        return result;
    }
}
