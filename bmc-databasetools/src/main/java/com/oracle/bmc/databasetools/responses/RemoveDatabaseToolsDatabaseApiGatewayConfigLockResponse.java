/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.responses;

import com.oracle.bmc.databasetools.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse
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

    /** etag for the returned DatabaseToolsDatabaseApiGatewayConfig resource. */
    private String etag;

    /**
     * etag for the returned DatabaseToolsDatabaseApiGatewayConfig resource.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code DatabaseToolsDatabaseApiGatewayConfig} instance. */
    private com.oracle.bmc.databasetools.model.DatabaseToolsDatabaseApiGatewayConfig
            databaseToolsDatabaseApiGatewayConfig;

    /**
     * The returned {@code DatabaseToolsDatabaseApiGatewayConfig} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.databasetools.model.DatabaseToolsDatabaseApiGatewayConfig
            getDatabaseToolsDatabaseApiGatewayConfig() {
        return databaseToolsDatabaseApiGatewayConfig;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "databaseToolsDatabaseApiGatewayConfig"
    })
    private RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.databasetools.model.DatabaseToolsDatabaseApiGatewayConfig
                    databaseToolsDatabaseApiGatewayConfig) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.databaseToolsDatabaseApiGatewayConfig = databaseToolsDatabaseApiGatewayConfig;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse> {
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

        /** etag for the returned DatabaseToolsDatabaseApiGatewayConfig resource. */
        private String etag;

        /**
         * etag for the returned DatabaseToolsDatabaseApiGatewayConfig resource.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code DatabaseToolsDatabaseApiGatewayConfig} instance. */
        private com.oracle.bmc.databasetools.model.DatabaseToolsDatabaseApiGatewayConfig
                databaseToolsDatabaseApiGatewayConfig;

        /**
         * The returned {@code DatabaseToolsDatabaseApiGatewayConfig} instance.
         *
         * @param databaseToolsDatabaseApiGatewayConfig the value to set
         * @return this builder
         */
        public Builder databaseToolsDatabaseApiGatewayConfig(
                com.oracle.bmc.databasetools.model.DatabaseToolsDatabaseApiGatewayConfig
                        databaseToolsDatabaseApiGatewayConfig) {
            this.databaseToolsDatabaseApiGatewayConfig = databaseToolsDatabaseApiGatewayConfig;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            databaseToolsDatabaseApiGatewayConfig(o.getDatabaseToolsDatabaseApiGatewayConfig());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse build() {
            return new RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    etag,
                    databaseToolsDatabaseApiGatewayConfig);
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
        sb.append(",databaseToolsDatabaseApiGatewayConfig=")
                .append(String.valueOf(databaseToolsDatabaseApiGatewayConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse)) {
            return false;
        }

        RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse other =
                (RemoveDatabaseToolsDatabaseApiGatewayConfigLockResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.databaseToolsDatabaseApiGatewayConfig,
                        other.databaseToolsDatabaseApiGatewayConfig);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseToolsDatabaseApiGatewayConfig == null
                                ? 43
                                : this.databaseToolsDatabaseApiGatewayConfig.hashCode());
        return result;
    }
}
