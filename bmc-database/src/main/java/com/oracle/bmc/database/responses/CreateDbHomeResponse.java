/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateDbHomeResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * work request. Multiple OCID values are returned in a comma-separated list. Use {@link
     * #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track the
     * status of the request.
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * work request. Multiple OCID values are returned in a comma-separated list. Use {@link
     * #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track the
     * status of the request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
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

    /** The returned {@code DbHome} instance. */
    private com.oracle.bmc.database.model.DbHome dbHome;

    /**
     * The returned {@code DbHome} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.database.model.DbHome getDbHome() {
        return dbHome;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcWorkRequestId",
        "etag",
        "opcRequestId",
        "dbHome"
    })
    private CreateDbHomeResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcWorkRequestId,
            String etag,
            String opcRequestId,
            com.oracle.bmc.database.model.DbHome dbHome) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.dbHome = dbHome;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateDbHomeResponse> {
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * work request. Multiple OCID values are returned in a comma-separated list. Use {@link
         * #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track
         * the status of the request.
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * work request. Multiple OCID values are returned in a comma-separated list. Use {@link
         * #getWorkRequest(GetWorkRequestRequest) getWorkRequest} with a work request OCID to track
         * the status of the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
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

        /** The returned {@code DbHome} instance. */
        private com.oracle.bmc.database.model.DbHome dbHome;

        /**
         * The returned {@code DbHome} instance.
         *
         * @param dbHome the value to set
         * @return this builder
         */
        public Builder dbHome(com.oracle.bmc.database.model.DbHome dbHome) {
            this.dbHome = dbHome;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateDbHomeResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            dbHome(o.getDbHome());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateDbHomeResponse build() {
            return new CreateDbHomeResponse(
                    __httpStatusCode__, headers, opcWorkRequestId, etag, opcRequestId, dbHome);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",dbHome=").append(String.valueOf(dbHome));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbHomeResponse)) {
            return false;
        }

        CreateDbHomeResponse other = (CreateDbHomeResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.dbHome, other.dbHome);
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
        result = (result * PRIME) + (this.dbHome == null ? 43 : this.dbHome.hashCode());
        return result;
    }
}
