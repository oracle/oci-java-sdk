/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.responses;

import com.oracle.bmc.networkloadbalancer.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class GetBackendOperationalStatusResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you must contact
     * Oracle about a particular request, then provide the request identifier.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you must contact
     * Oracle about a particular request, then provide the request identifier.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned BackendOperationalStatus instance.
     */
    private com.oracle.bmc.networkloadbalancer.model.BackendOperationalStatus
            backendOperationalStatus;

    /**
     * The returned BackendOperationalStatus instance.
     * @return the value
     */
    public com.oracle.bmc.networkloadbalancer.model.BackendOperationalStatus
            getBackendOperationalStatus() {
        return backendOperationalStatus;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "backendOperationalStatus"
    })
    private GetBackendOperationalStatusResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.networkloadbalancer.model.BackendOperationalStatus
                    backendOperationalStatus) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.backendOperationalStatus = backendOperationalStatus;
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
         * Unique Oracle-assigned identifier for the request. If you must contact
         * Oracle about a particular request, then provide the request identifier.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you must contact
         * Oracle about a particular request, then provide the request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned BackendOperationalStatus instance.
         */
        private com.oracle.bmc.networkloadbalancer.model.BackendOperationalStatus
                backendOperationalStatus;

        /**
         * The returned BackendOperationalStatus instance.
         * @param backendOperationalStatus the value to set
         * @return this builder
         */
        public Builder backendOperationalStatus(
                com.oracle.bmc.networkloadbalancer.model.BackendOperationalStatus
                        backendOperationalStatus) {
            this.backendOperationalStatus = backendOperationalStatus;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetBackendOperationalStatusResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            backendOperationalStatus(o.getBackendOperationalStatus());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetBackendOperationalStatusResponse build() {
            return new GetBackendOperationalStatusResponse(
                    __httpStatusCode__, headers, opcRequestId, backendOperationalStatus);
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
        sb.append(",backendOperationalStatus=").append(String.valueOf(backendOperationalStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetBackendOperationalStatusResponse)) {
            return false;
        }

        GetBackendOperationalStatusResponse other = (GetBackendOperationalStatusResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.backendOperationalStatus, other.backendOperationalStatus);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.backendOperationalStatus == null
                                ? 43
                                : this.backendOperationalStatus.hashCode());
        return result;
    }
}
