/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class DropTablespaceResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned TablespaceAdminStatus instance.
     */
    private com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus tablespaceAdminStatus;

    /**
     * The returned TablespaceAdminStatus instance.
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus
            getTablespaceAdminStatus() {
        return tablespaceAdminStatus;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "tablespaceAdminStatus"
    })
    private DropTablespaceResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus tablespaceAdminStatus) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.tablespaceAdminStatus = tablespaceAdminStatus;
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
         * The returned TablespaceAdminStatus instance.
         */
        private com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus tablespaceAdminStatus;

        /**
         * The returned TablespaceAdminStatus instance.
         * @param tablespaceAdminStatus the value to set
         * @return this builder
         */
        public Builder tablespaceAdminStatus(
                com.oracle.bmc.databasemanagement.model.TablespaceAdminStatus
                        tablespaceAdminStatus) {
            this.tablespaceAdminStatus = tablespaceAdminStatus;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(DropTablespaceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            tablespaceAdminStatus(o.getTablespaceAdminStatus());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public DropTablespaceResponse build() {
            return new DropTablespaceResponse(
                    __httpStatusCode__, headers, opcRequestId, tablespaceAdminStatus);
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
        sb.append(",tablespaceAdminStatus=").append(String.valueOf(tablespaceAdminStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DropTablespaceResponse)) {
            return false;
        }

        DropTablespaceResponse other = (DropTablespaceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.tablespaceAdminStatus, other.tablespaceAdminStatus);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.tablespaceAdminStatus == null
                                ? 43
                                : this.tablespaceAdminStatus.hashCode());
        return result;
    }
}
