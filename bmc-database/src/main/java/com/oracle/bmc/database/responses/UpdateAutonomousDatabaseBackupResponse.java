/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateAutonomousDatabaseBackupResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the work request.
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the work request.
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * The returned AutonomousDatabaseBackup instance.
     */
    private com.oracle.bmc.database.model.AutonomousDatabaseBackup autonomousDatabaseBackup;

    /**
     * The returned AutonomousDatabaseBackup instance.
     * @return the value
     */
    public com.oracle.bmc.database.model.AutonomousDatabaseBackup getAutonomousDatabaseBackup() {
        return autonomousDatabaseBackup;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "opcWorkRequestId",
        "autonomousDatabaseBackup"
    })
    private UpdateAutonomousDatabaseBackupResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            String opcWorkRequestId,
            com.oracle.bmc.database.model.AutonomousDatabaseBackup autonomousDatabaseBackup) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.autonomousDatabaseBackup = autonomousDatabaseBackup;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the work request.
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the work request.
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * The returned AutonomousDatabaseBackup instance.
         */
        private com.oracle.bmc.database.model.AutonomousDatabaseBackup autonomousDatabaseBackup;

        /**
         * The returned AutonomousDatabaseBackup instance.
         * @param autonomousDatabaseBackup the value to set
         * @return this builder
         */
        public Builder autonomousDatabaseBackup(
                com.oracle.bmc.database.model.AutonomousDatabaseBackup autonomousDatabaseBackup) {
            this.autonomousDatabaseBackup = autonomousDatabaseBackup;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateAutonomousDatabaseBackupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            autonomousDatabaseBackup(o.getAutonomousDatabaseBackup());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateAutonomousDatabaseBackupResponse build() {
            return new UpdateAutonomousDatabaseBackupResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    etag,
                    opcWorkRequestId,
                    autonomousDatabaseBackup);
        }
    }

    /**
     * Return a new builder for this response object.
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",autonomousDatabaseBackup=").append(String.valueOf(autonomousDatabaseBackup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousDatabaseBackupResponse)) {
            return false;
        }

        UpdateAutonomousDatabaseBackupResponse other = (UpdateAutonomousDatabaseBackupResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(
                        this.autonomousDatabaseBackup, other.autonomousDatabaseBackup);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseBackup == null
                                ? 43
                                : this.autonomousDatabaseBackup.hashCode());
        return result;
    }
}
