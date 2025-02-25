/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.responses;

import com.oracle.bmc.securityattribute.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class UpdateSecurityAttributeNamespaceResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned SecurityAttributeNamespace instance.
     */
    private com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
            securityAttributeNamespace;

    /**
     * The returned SecurityAttributeNamespace instance.
     * @return the value
     */
    public com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
            getSecurityAttributeNamespace() {
        return securityAttributeNamespace;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "securityAttributeNamespace"
    })
    private UpdateSecurityAttributeNamespaceResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
                    securityAttributeNamespace) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.securityAttributeNamespace = securityAttributeNamespace;
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
         * The returned SecurityAttributeNamespace instance.
         */
        private com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
                securityAttributeNamespace;

        /**
         * The returned SecurityAttributeNamespace instance.
         * @param securityAttributeNamespace the value to set
         * @return this builder
         */
        public Builder securityAttributeNamespace(
                com.oracle.bmc.securityattribute.model.SecurityAttributeNamespace
                        securityAttributeNamespace) {
            this.securityAttributeNamespace = securityAttributeNamespace;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateSecurityAttributeNamespaceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            securityAttributeNamespace(o.getSecurityAttributeNamespace());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public UpdateSecurityAttributeNamespaceResponse build() {
            return new UpdateSecurityAttributeNamespaceResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, securityAttributeNamespace);
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
        sb.append(",securityAttributeNamespace=")
                .append(String.valueOf(securityAttributeNamespace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSecurityAttributeNamespaceResponse)) {
            return false;
        }

        UpdateSecurityAttributeNamespaceResponse other =
                (UpdateSecurityAttributeNamespaceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.securityAttributeNamespace, other.securityAttributeNamespace);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributeNamespace == null
                                ? 43
                                : this.securityAttributeNamespace.hashCode());
        return result;
    }
}
