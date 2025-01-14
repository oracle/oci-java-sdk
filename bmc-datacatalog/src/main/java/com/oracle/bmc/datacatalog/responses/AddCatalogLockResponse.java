/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.responses;

import com.oracle.bmc.datacatalog.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class AddCatalogLockResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** etag for the returned Catalog resource. */
    private String etag;

    /**
     * etag for the returned Catalog resource.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code Catalog} instance. */
    private com.oracle.bmc.datacatalog.model.Catalog catalog;

    /**
     * The returned {@code Catalog} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datacatalog.model.Catalog getCatalog() {
        return catalog;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "catalog"
    })
    private AddCatalogLockResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.datacatalog.model.Catalog catalog) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.catalog = catalog;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<AddCatalogLockResponse> {
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

        /** etag for the returned Catalog resource. */
        private String etag;

        /**
         * etag for the returned Catalog resource.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code Catalog} instance. */
        private com.oracle.bmc.datacatalog.model.Catalog catalog;

        /**
         * The returned {@code Catalog} instance.
         *
         * @param catalog the value to set
         * @return this builder
         */
        public Builder catalog(com.oracle.bmc.datacatalog.model.Catalog catalog) {
            this.catalog = catalog;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(AddCatalogLockResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            catalog(o.getCatalog());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public AddCatalogLockResponse build() {
            return new AddCatalogLockResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, catalog);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",catalog=").append(String.valueOf(catalog));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddCatalogLockResponse)) {
            return false;
        }

        AddCatalogLockResponse other = (AddCatalogLockResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.catalog, other.catalog);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.catalog == null ? 43 : this.catalog.hashCode());
        return result;
    }
}
