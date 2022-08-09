/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.responses;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class CreateDomainResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     */
    private String opcWorkRequestId;

    /**
     * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
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
     * The returned Domain instance.
     */
    private com.oracle.bmc.tenantmanagercontrolplane.model.Domain domain;

    /**
     * The returned Domain instance.
     * @return the value
     */
    public com.oracle.bmc.tenantmanagercontrolplane.model.Domain getDomain() {
        return domain;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "opcWorkRequestId",
        "etag",
        "domain"
    })
    private CreateDomainResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String opcWorkRequestId,
            String etag,
            com.oracle.bmc.tenantmanagercontrolplane.model.Domain domain) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.etag = etag;
        this.domain = domain;
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
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
         *
         */
        private String opcWorkRequestId;

        /**
         * Unique Oracle-assigned identifier for the asynchronous request. You can use this to query status of the asynchronous operation.
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
         * The returned Domain instance.
         */
        private com.oracle.bmc.tenantmanagercontrolplane.model.Domain domain;

        /**
         * The returned Domain instance.
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(com.oracle.bmc.tenantmanagercontrolplane.model.Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreateDomainResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            etag(o.getEtag());
            domain(o.getDomain());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CreateDomainResponse build() {
            return new CreateDomainResponse(
                    __httpStatusCode__, headers, opcRequestId, opcWorkRequestId, etag, domain);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",domain=").append(String.valueOf(domain));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDomainResponse)) {
            return false;
        }

        CreateDomainResponse other = (CreateDomainResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.domain, other.domain);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        return result;
    }
}
