/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.responses;

import com.oracle.bmc.databasetools.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class ValidateDatabaseToolsIdentityCredentialResponse
        extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code ValidateDatabaseToolsIdentityCredentialResult} instance. */
    private com.oracle.bmc.databasetools.model.ValidateDatabaseToolsIdentityCredentialResult
            validateDatabaseToolsIdentityCredentialResult;

    /**
     * The returned {@code ValidateDatabaseToolsIdentityCredentialResult} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.databasetools.model.ValidateDatabaseToolsIdentityCredentialResult
            getValidateDatabaseToolsIdentityCredentialResult() {
        return validateDatabaseToolsIdentityCredentialResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "validateDatabaseToolsIdentityCredentialResult"
    })
    private ValidateDatabaseToolsIdentityCredentialResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.databasetools.model.ValidateDatabaseToolsIdentityCredentialResult
                    validateDatabaseToolsIdentityCredentialResult) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.validateDatabaseToolsIdentityCredentialResult =
                validateDatabaseToolsIdentityCredentialResult;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    ValidateDatabaseToolsIdentityCredentialResponse> {
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

        /** The returned {@code ValidateDatabaseToolsIdentityCredentialResult} instance. */
        private com.oracle.bmc.databasetools.model.ValidateDatabaseToolsIdentityCredentialResult
                validateDatabaseToolsIdentityCredentialResult;

        /**
         * The returned {@code ValidateDatabaseToolsIdentityCredentialResult} instance.
         *
         * @param validateDatabaseToolsIdentityCredentialResult the value to set
         * @return this builder
         */
        public Builder validateDatabaseToolsIdentityCredentialResult(
                com.oracle.bmc.databasetools.model.ValidateDatabaseToolsIdentityCredentialResult
                        validateDatabaseToolsIdentityCredentialResult) {
            this.validateDatabaseToolsIdentityCredentialResult =
                    validateDatabaseToolsIdentityCredentialResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ValidateDatabaseToolsIdentityCredentialResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            validateDatabaseToolsIdentityCredentialResult(
                    o.getValidateDatabaseToolsIdentityCredentialResult());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ValidateDatabaseToolsIdentityCredentialResponse build() {
            return new ValidateDatabaseToolsIdentityCredentialResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    validateDatabaseToolsIdentityCredentialResult);
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
        sb.append(",validateDatabaseToolsIdentityCredentialResult=")
                .append(String.valueOf(validateDatabaseToolsIdentityCredentialResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateDatabaseToolsIdentityCredentialResponse)) {
            return false;
        }

        ValidateDatabaseToolsIdentityCredentialResponse other =
                (ValidateDatabaseToolsIdentityCredentialResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.validateDatabaseToolsIdentityCredentialResult,
                        other.validateDatabaseToolsIdentityCredentialResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.validateDatabaseToolsIdentityCredentialResult == null
                                ? 43
                                : this.validateDatabaseToolsIdentityCredentialResult.hashCode());
        return result;
    }
}
