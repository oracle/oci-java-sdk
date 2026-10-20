/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.responses;

import com.oracle.bmc.generativeaisandbox.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
public class WriteSandboxFileResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** Base64-encoded SHA-256 checksum of the sandbox file content. */
    private String opcContentSha256;

    /**
     * Base64-encoded SHA-256 checksum of the sandbox file content.
     *
     * @return the value
     */
    public String getOpcContentSha256() {
        return opcContentSha256;
    }

    /** The returned {@code SandboxFile} instance. */
    private com.oracle.bmc.generativeaisandbox.model.SandboxFile sandboxFile;

    /**
     * The returned {@code SandboxFile} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.generativeaisandbox.model.SandboxFile getSandboxFile() {
        return sandboxFile;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcContentSha256",
        "sandboxFile"
    })
    private WriteSandboxFileResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String opcContentSha256,
            com.oracle.bmc.generativeaisandbox.model.SandboxFile sandboxFile) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcContentSha256 = opcContentSha256;
        this.sandboxFile = sandboxFile;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<WriteSandboxFileResponse> {
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

        /** Base64-encoded SHA-256 checksum of the sandbox file content. */
        private String opcContentSha256;

        /**
         * Base64-encoded SHA-256 checksum of the sandbox file content.
         *
         * @param opcContentSha256 the value to set
         * @return this builder
         */
        public Builder opcContentSha256(String opcContentSha256) {
            this.opcContentSha256 = opcContentSha256;
            return this;
        }

        /** The returned {@code SandboxFile} instance. */
        private com.oracle.bmc.generativeaisandbox.model.SandboxFile sandboxFile;

        /**
         * The returned {@code SandboxFile} instance.
         *
         * @param sandboxFile the value to set
         * @return this builder
         */
        public Builder sandboxFile(
                com.oracle.bmc.generativeaisandbox.model.SandboxFile sandboxFile) {
            this.sandboxFile = sandboxFile;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(WriteSandboxFileResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcContentSha256(o.getOpcContentSha256());
            sandboxFile(o.getSandboxFile());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public WriteSandboxFileResponse build() {
            return new WriteSandboxFileResponse(
                    __httpStatusCode__, headers, opcRequestId, opcContentSha256, sandboxFile);
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
        sb.append(",opcContentSha256=").append(String.valueOf(opcContentSha256));
        sb.append(",sandboxFile=").append(String.valueOf(sandboxFile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WriteSandboxFileResponse)) {
            return false;
        }

        WriteSandboxFileResponse other = (WriteSandboxFileResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcContentSha256, other.opcContentSha256)
                && java.util.Objects.equals(this.sandboxFile, other.sandboxFile);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcContentSha256 == null ? 43 : this.opcContentSha256.hashCode());
        result = (result * PRIME) + (this.sandboxFile == null ? 43 : this.sandboxFile.hashCode());
        return result;
    }
}
