/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.responses;

import com.oracle.bmc.mysql.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
public class UpdateBackupResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned Backup instance, or null if {@link #isNotModified()} is true. */
    private com.oracle.bmc.mysql.model.Backup backup;

    /**
     * The returned Backup instance, or null if {@link #isNotModified()} is true.
     *
     * @return the value
     */
    public com.oracle.bmc.mysql.model.Backup getBackup() {
        return backup;
    }

    /**
     * Flag to indicate whether or not the object was modified. If this is true, the getter for the
     * object itself will return null. Callers should check this if they specified one of the
     * request params that might result in a conditional response (like 'if-match'/'if-none-match').
     */
    private boolean isNotModified;

    /**
     * Flag to indicate whether or not the object was modified. If this is true, the getter for the
     * object itself will return null. Callers should check this if they specified one of the
     * request params that might result in a conditional response (like 'if-match'/'if-none-match').
     *
     * @param true if the object was not modified
     */
    public boolean isNotModified() {
        return isNotModified;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "backup",
        "isNotModified"
    })
    private UpdateBackupResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.mysql.model.Backup backup,
            boolean isNotModified) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.backup = backup;
        this.isNotModified = isNotModified;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<UpdateBackupResponse> {
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

        /** The returned Backup instance, or null if {@link #isNotModified()} is true. */
        private com.oracle.bmc.mysql.model.Backup backup;

        /**
         * The returned Backup instance, or null if {@link #isNotModified()} is true.
         *
         * @param backup the value to set
         * @return this builder
         */
        public Builder backup(com.oracle.bmc.mysql.model.Backup backup) {
            this.backup = backup;
            return this;
        }

        /**
         * Flag to indicate whether or not the object was modified. If this is true, the getter for
         * the object itself will return null. Callers should check this if they specified one of
         * the request params that might result in a conditional response (like
         * 'if-match'/'if-none-match').
         */
        private boolean isNotModified;

        /**
         * Flag to indicate whether or not the object was modified. If this is true, the getter for
         * the object itself will return null. Callers should check this if they specified one of
         * the request params that might result in a conditional response (like
         * 'if-match'/'if-none-match').
         *
         * @param true if the object was not modified
         */
        public Builder isNotModified(boolean isNotModified) {
            this.isNotModified = isNotModified;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateBackupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            backup(o.getBackup());
            isNotModified(o.isNotModified());
            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateBackupResponse build() {
            return new UpdateBackupResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, backup, isNotModified);
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
        sb.append(",backup=").append(String.valueOf(backup));
        sb.append(",isNotModified=").append(isNotModified);
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBackupResponse)) {
            return false;
        }

        UpdateBackupResponse other = (UpdateBackupResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.backup, other.backup)
                && this.isNotModified == other.isNotModified;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.backup == null ? 43 : this.backup.hashCode());
        result = (result * PRIME) + (this.isNotModified ? 79 : 97);
        return result;
    }
}
