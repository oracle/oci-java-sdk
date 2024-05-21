/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class CreateManagedDatabaseGroupResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A link to the newly created Managed Database Group.
     */
    private String location;

    /**
     * A link to the newly created Managed Database Group.
     * @return the value
     */
    public String getLocation() {
        return location;
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
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * The returned ManagedDatabaseGroup instance.
     */
    private com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroup managedDatabaseGroup;

    /**
     * The returned ManagedDatabaseGroup instance.
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroup getManagedDatabaseGroup() {
        return managedDatabaseGroup;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "location",
        "opcRequestId",
        "etag",
        "managedDatabaseGroup"
    })
    private CreateManagedDatabaseGroupResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String location,
            String opcRequestId,
            String etag,
            com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroup managedDatabaseGroup) {
        super(__httpStatusCode__, headers);
        this.location = location;
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.managedDatabaseGroup = managedDatabaseGroup;
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
         * A link to the newly created Managed Database Group.
         */
        private String location;

        /**
         * A link to the newly created Managed Database Group.
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
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
         * The returned ManagedDatabaseGroup instance.
         */
        private com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroup managedDatabaseGroup;

        /**
         * The returned ManagedDatabaseGroup instance.
         * @param managedDatabaseGroup the value to set
         * @return this builder
         */
        public Builder managedDatabaseGroup(
                com.oracle.bmc.databasemanagement.model.ManagedDatabaseGroup managedDatabaseGroup) {
            this.managedDatabaseGroup = managedDatabaseGroup;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateManagedDatabaseGroupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            location(o.getLocation());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            managedDatabaseGroup(o.getManagedDatabaseGroup());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateManagedDatabaseGroupResponse build() {
            return new CreateManagedDatabaseGroupResponse(
                    __httpStatusCode__,
                    headers,
                    location,
                    opcRequestId,
                    etag,
                    managedDatabaseGroup);
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
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",managedDatabaseGroup=").append(String.valueOf(managedDatabaseGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateManagedDatabaseGroupResponse)) {
            return false;
        }

        CreateManagedDatabaseGroupResponse other = (CreateManagedDatabaseGroupResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.managedDatabaseGroup, other.managedDatabaseGroup);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseGroup == null
                                ? 43
                                : this.managedDatabaseGroup.hashCode());
        return result;
    }
}
