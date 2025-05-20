/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.responses;

import com.oracle.bmc.distributeddatabase.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
public class CreateDistributedDatabasePrivateEndpointResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query its
     * status.
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query its
     * status.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
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

    /** The returned {@code DistributedDatabasePrivateEndpoint} instance. */
    private com.oracle.bmc.distributeddatabase.model.DistributedDatabasePrivateEndpoint
            distributedDatabasePrivateEndpoint;

    /**
     * The returned {@code DistributedDatabasePrivateEndpoint} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.distributeddatabase.model.DistributedDatabasePrivateEndpoint
            getDistributedDatabasePrivateEndpoint() {
        return distributedDatabasePrivateEndpoint;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcWorkRequestId",
        "opcRequestId",
        "etag",
        "distributedDatabasePrivateEndpoint"
    })
    private CreateDistributedDatabasePrivateEndpointResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcWorkRequestId,
            String opcRequestId,
            String etag,
            com.oracle.bmc.distributeddatabase.model.DistributedDatabasePrivateEndpoint
                    distributedDatabasePrivateEndpoint) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.distributedDatabasePrivateEndpoint = distributedDatabasePrivateEndpoint;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateDistributedDatabasePrivateEndpointResponse> {
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
         * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query
         * its status.
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous work. You can use this to query
         * its status.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
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

        /** The returned {@code DistributedDatabasePrivateEndpoint} instance. */
        private com.oracle.bmc.distributeddatabase.model.DistributedDatabasePrivateEndpoint
                distributedDatabasePrivateEndpoint;

        /**
         * The returned {@code DistributedDatabasePrivateEndpoint} instance.
         *
         * @param distributedDatabasePrivateEndpoint the value to set
         * @return this builder
         */
        public Builder distributedDatabasePrivateEndpoint(
                com.oracle.bmc.distributeddatabase.model.DistributedDatabasePrivateEndpoint
                        distributedDatabasePrivateEndpoint) {
            this.distributedDatabasePrivateEndpoint = distributedDatabasePrivateEndpoint;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateDistributedDatabasePrivateEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            distributedDatabasePrivateEndpoint(o.getDistributedDatabasePrivateEndpoint());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateDistributedDatabasePrivateEndpointResponse build() {
            return new CreateDistributedDatabasePrivateEndpointResponse(
                    __httpStatusCode__,
                    headers,
                    opcWorkRequestId,
                    opcRequestId,
                    etag,
                    distributedDatabasePrivateEndpoint);
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
        sb.append(",distributedDatabasePrivateEndpoint=")
                .append(String.valueOf(distributedDatabasePrivateEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDistributedDatabasePrivateEndpointResponse)) {
            return false;
        }

        CreateDistributedDatabasePrivateEndpointResponse other =
                (CreateDistributedDatabasePrivateEndpointResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.distributedDatabasePrivateEndpoint,
                        other.distributedDatabasePrivateEndpoint);
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
        result =
                (result * PRIME)
                        + (this.distributedDatabasePrivateEndpoint == null
                                ? 43
                                : this.distributedDatabasePrivateEndpoint.hashCode());
        return result;
    }
}
