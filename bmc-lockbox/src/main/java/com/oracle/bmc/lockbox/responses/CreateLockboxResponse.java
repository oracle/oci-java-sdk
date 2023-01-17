/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.responses;

import com.oracle.bmc.lockbox.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
public class CreateLockboxResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * this contains the full URI for the get request, e.g. "https://iaas.us-phoenix-1.oraclecloud.com/20210331/lockbox/<some-ocid>"
     *
     */
    private String location;

    /**
     * this contains the full URI for the get request, e.g. "https://iaas.us-phoenix-1.oraclecloud.com/20210331/lockbox/<some-ocid>"
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
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
     * The returned Lockbox instance.
     */
    private com.oracle.bmc.lockbox.model.Lockbox lockbox;

    /**
     * The returned Lockbox instance.
     * @return the value
     */
    public com.oracle.bmc.lockbox.model.Lockbox getLockbox() {
        return lockbox;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "location",
        "etag",
        "lockbox"
    })
    private CreateLockboxResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String location,
            String etag,
            com.oracle.bmc.lockbox.model.Lockbox lockbox) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.etag = etag;
        this.lockbox = lockbox;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * this contains the full URI for the get request, e.g. "https://iaas.us-phoenix-1.oraclecloud.com/20210331/lockbox/<some-ocid>"
         *
         */
        private String location;

        /**
         * this contains the full URI for the get request, e.g. "https://iaas.us-phoenix-1.oraclecloud.com/20210331/lockbox/<some-ocid>"
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         */
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
         * The returned Lockbox instance.
         */
        private com.oracle.bmc.lockbox.model.Lockbox lockbox;

        /**
         * The returned Lockbox instance.
         * @param lockbox the value to set
         * @return this builder
         */
        public Builder lockbox(com.oracle.bmc.lockbox.model.Lockbox lockbox) {
            this.lockbox = lockbox;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateLockboxResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            etag(o.getEtag());
            lockbox(o.getLockbox());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateLockboxResponse build() {
            return new CreateLockboxResponse(
                    __httpStatusCode__, headers, opcRequestId, location, etag, lockbox);
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",lockbox=").append(String.valueOf(lockbox));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateLockboxResponse)) {
            return false;
        }

        CreateLockboxResponse other = (CreateLockboxResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.lockbox, other.lockbox);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.lockbox == null ? 43 : this.lockbox.hashCode());
        return result;
    }
}
