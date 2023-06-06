/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.responses;

import com.oracle.bmc.filestorage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class CreateFilesystemSnapshotPolicyResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned FilesystemSnapshotPolicy instance. */
    private com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy filesystemSnapshotPolicy;

    /**
     * The returned FilesystemSnapshotPolicy instance.
     *
     * @return the value
     */
    public com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy getFilesystemSnapshotPolicy() {
        return filesystemSnapshotPolicy;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "filesystemSnapshotPolicy"
    })
    private CreateFilesystemSnapshotPolicyResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy filesystemSnapshotPolicy) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.filesystemSnapshotPolicy = filesystemSnapshotPolicy;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateFilesystemSnapshotPolicyResponse> {
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

        /** The returned FilesystemSnapshotPolicy instance. */
        private com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy filesystemSnapshotPolicy;

        /**
         * The returned FilesystemSnapshotPolicy instance.
         *
         * @param filesystemSnapshotPolicy the value to set
         * @return this builder
         */
        public Builder filesystemSnapshotPolicy(
                com.oracle.bmc.filestorage.model.FilesystemSnapshotPolicy
                        filesystemSnapshotPolicy) {
            this.filesystemSnapshotPolicy = filesystemSnapshotPolicy;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateFilesystemSnapshotPolicyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            filesystemSnapshotPolicy(o.getFilesystemSnapshotPolicy());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateFilesystemSnapshotPolicyResponse build() {
            return new CreateFilesystemSnapshotPolicyResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, filesystemSnapshotPolicy);
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
        sb.append(",filesystemSnapshotPolicy=").append(String.valueOf(filesystemSnapshotPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFilesystemSnapshotPolicyResponse)) {
            return false;
        }

        CreateFilesystemSnapshotPolicyResponse other = (CreateFilesystemSnapshotPolicyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.filesystemSnapshotPolicy, other.filesystemSnapshotPolicy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.filesystemSnapshotPolicy == null
                                ? 43
                                : this.filesystemSnapshotPolicy.hashCode());
        return result;
    }
}