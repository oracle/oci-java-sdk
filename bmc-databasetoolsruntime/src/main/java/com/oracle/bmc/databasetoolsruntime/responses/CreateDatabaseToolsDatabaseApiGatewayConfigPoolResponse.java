/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.responses;

import com.oracle.bmc.databasetoolsruntime.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /** URI of the new resource which was created by the request. */
    private String location;

    /**
     * URI of the new resource which was created by the request.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
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

    /** The returned {@code DatabaseToolsDatabaseApiGatewayConfigPool} instance. */
    private com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPool
            databaseToolsDatabaseApiGatewayConfigPool;

    /**
     * The returned {@code DatabaseToolsDatabaseApiGatewayConfigPool} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPool
            getDatabaseToolsDatabaseApiGatewayConfigPool() {
        return databaseToolsDatabaseApiGatewayConfigPool;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "etag",
        "opcRequestId",
        "databaseToolsDatabaseApiGatewayConfigPool"
    })
    private CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String location,
            String etag,
            String opcRequestId,
            com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPool
                    databaseToolsDatabaseApiGatewayConfigPool) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.databaseToolsDatabaseApiGatewayConfigPool = databaseToolsDatabaseApiGatewayConfigPool;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse> {
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

        /** URI of the new resource which was created by the request. */
        private String location;

        /**
         * URI of the new resource which was created by the request.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
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

        /** The returned {@code DatabaseToolsDatabaseApiGatewayConfigPool} instance. */
        private com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPool
                databaseToolsDatabaseApiGatewayConfigPool;

        /**
         * The returned {@code DatabaseToolsDatabaseApiGatewayConfigPool} instance.
         *
         * @param databaseToolsDatabaseApiGatewayConfigPool the value to set
         * @return this builder
         */
        public Builder databaseToolsDatabaseApiGatewayConfigPool(
                com.oracle.bmc.databasetoolsruntime.model.DatabaseToolsDatabaseApiGatewayConfigPool
                        databaseToolsDatabaseApiGatewayConfigPool) {
            this.databaseToolsDatabaseApiGatewayConfigPool =
                    databaseToolsDatabaseApiGatewayConfigPool;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            databaseToolsDatabaseApiGatewayConfigPool(
                    o.getDatabaseToolsDatabaseApiGatewayConfigPool());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse build() {
            return new CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    etag,
                    opcRequestId,
                    databaseToolsDatabaseApiGatewayConfigPool);
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",databaseToolsDatabaseApiGatewayConfigPool=")
                .append(String.valueOf(databaseToolsDatabaseApiGatewayConfigPool));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse)) {
            return false;
        }

        CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse other =
                (CreateDatabaseToolsDatabaseApiGatewayConfigPoolResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.databaseToolsDatabaseApiGatewayConfigPool,
                        other.databaseToolsDatabaseApiGatewayConfigPool);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseToolsDatabaseApiGatewayConfigPool == null
                                ? 43
                                : this.databaseToolsDatabaseApiGatewayConfigPool.hashCode());
        return result;
    }
}
