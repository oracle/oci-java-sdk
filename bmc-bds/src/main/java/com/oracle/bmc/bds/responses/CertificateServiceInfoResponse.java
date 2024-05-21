/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.responses;

import com.oracle.bmc.bds.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class CertificateServiceInfoResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a request, provide this request ID.
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
     * A list of com.oracle.bmc.bds.model.CertificateServiceInfoSummary instances.
     */
    private java.util.List<com.oracle.bmc.bds.model.CertificateServiceInfoSummary> items;

    /**
     * A list of com.oracle.bmc.bds.model.CertificateServiceInfoSummary instances.
     * @return the value
     */
    public java.util.List<com.oracle.bmc.bds.model.CertificateServiceInfoSummary> getItems() {
        return items;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "items"
    })
    private CertificateServiceInfoResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            String etag,
            java.util.List<com.oracle.bmc.bds.model.CertificateServiceInfoSummary> items) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.items = items;
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
         * Oracle about a request, provide this request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a request, provide this request ID.
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
         * A list of com.oracle.bmc.bds.model.CertificateServiceInfoSummary instances.
         */
        private java.util.List<com.oracle.bmc.bds.model.CertificateServiceInfoSummary> items;

        /**
         * A list of com.oracle.bmc.bds.model.CertificateServiceInfoSummary instances.
         * @param items the value to set
         * @return this builder
         */
        public Builder items(
                java.util.List<com.oracle.bmc.bds.model.CertificateServiceInfoSummary> items) {
            this.items = items;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CertificateServiceInfoResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            items(o.getItems());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CertificateServiceInfoResponse build() {
            return new CertificateServiceInfoResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, items);
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
        sb.append(",items=").append(String.valueOf(items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateServiceInfoResponse)) {
            return false;
        }

        CertificateServiceInfoResponse other = (CertificateServiceInfoResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }
}
