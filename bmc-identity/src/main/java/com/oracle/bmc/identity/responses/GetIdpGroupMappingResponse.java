/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetIdpGroupMappingResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
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
     * The returned IdpGroupMapping instance.
     */
    private com.oracle.bmc.identity.model.IdpGroupMapping idpGroupMapping;

    /**
     * The returned IdpGroupMapping instance.
     * @return the value
     */
    public com.oracle.bmc.identity.model.IdpGroupMapping getIdpGroupMapping() {
        return idpGroupMapping;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "idpGroupMapping"
    })
    private GetIdpGroupMappingResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.identity.model.IdpGroupMapping idpGroupMapping) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.idpGroupMapping = idpGroupMapping;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
         * The returned IdpGroupMapping instance.
         */
        private com.oracle.bmc.identity.model.IdpGroupMapping idpGroupMapping;

        /**
         * The returned IdpGroupMapping instance.
         * @param idpGroupMapping the value to set
         * @return this builder
         */
        public Builder idpGroupMapping(
                com.oracle.bmc.identity.model.IdpGroupMapping idpGroupMapping) {
            this.idpGroupMapping = idpGroupMapping;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetIdpGroupMappingResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            idpGroupMapping(o.getIdpGroupMapping());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetIdpGroupMappingResponse build() {
            return new GetIdpGroupMappingResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, idpGroupMapping);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",idpGroupMapping=").append(String.valueOf(idpGroupMapping));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetIdpGroupMappingResponse)) {
            return false;
        }

        GetIdpGroupMappingResponse other = (GetIdpGroupMappingResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.idpGroupMapping, other.idpGroupMapping);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.idpGroupMapping == null ? 43 : this.idpGroupMapping.hashCode());
        return result;
    }
}
