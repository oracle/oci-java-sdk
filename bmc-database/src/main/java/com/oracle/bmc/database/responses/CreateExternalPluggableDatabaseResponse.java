/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateExternalPluggableDatabaseResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the work request. Multiple OCID values are returned in a comma-separated list. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track the status of the request.
     *
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the work request. Multiple OCID values are returned in a comma-separated list. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track the status of the request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ExternalPluggableDatabase instance.
     */
    private com.oracle.bmc.database.model.ExternalPluggableDatabase externalPluggableDatabase;

    /**
     * The returned ExternalPluggableDatabase instance.
     * @return the value
     */
    public com.oracle.bmc.database.model.ExternalPluggableDatabase getExternalPluggableDatabase() {
        return externalPluggableDatabase;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcWorkRequestId",
        "etag",
        "opcRequestId",
        "externalPluggableDatabase"
    })
    private CreateExternalPluggableDatabaseResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcWorkRequestId,
            String etag,
            String opcRequestId,
            com.oracle.bmc.database.model.ExternalPluggableDatabase externalPluggableDatabase) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.externalPluggableDatabase = externalPluggableDatabase;
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the work request. Multiple OCID values are returned in a comma-separated list. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track the status of the request.
         *
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the work request. Multiple OCID values are returned in a comma-separated list. Use {@link #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track the status of the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned ExternalPluggableDatabase instance.
         */
        private com.oracle.bmc.database.model.ExternalPluggableDatabase externalPluggableDatabase;

        /**
         * The returned ExternalPluggableDatabase instance.
         * @param externalPluggableDatabase the value to set
         * @return this builder
         */
        public Builder externalPluggableDatabase(
                com.oracle.bmc.database.model.ExternalPluggableDatabase externalPluggableDatabase) {
            this.externalPluggableDatabase = externalPluggableDatabase;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateExternalPluggableDatabaseResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            externalPluggableDatabase(o.getExternalPluggableDatabase());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateExternalPluggableDatabaseResponse build() {
            return new CreateExternalPluggableDatabaseResponse(
                    __httpStatusCode__,
                    headers,
                    opcWorkRequestId,
                    etag,
                    opcRequestId,
                    externalPluggableDatabase);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",externalPluggableDatabase=").append(String.valueOf(externalPluggableDatabase));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExternalPluggableDatabaseResponse)) {
            return false;
        }

        CreateExternalPluggableDatabaseResponse other = (CreateExternalPluggableDatabaseResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.externalPluggableDatabase, other.externalPluggableDatabase);
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
                        + (this.externalPluggableDatabase == null
                                ? 43
                                : this.externalPluggableDatabase.hashCode());
        return result;
    }
}
