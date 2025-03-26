/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.responses;

import com.oracle.bmc.capacitymanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class GetOccAvailabilityCatalogResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned OccAvailabilityCatalog instance.
     */
    private com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog occAvailabilityCatalog;

    /**
     * The returned OccAvailabilityCatalog instance.
     * @return the value
     */
    public com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog
            getOccAvailabilityCatalog() {
        return occAvailabilityCatalog;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "occAvailabilityCatalog"
    })
    private GetOccAvailabilityCatalogResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog occAvailabilityCatalog) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.occAvailabilityCatalog = occAvailabilityCatalog;
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
         * The returned OccAvailabilityCatalog instance.
         */
        private com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog
                occAvailabilityCatalog;

        /**
         * The returned OccAvailabilityCatalog instance.
         * @param occAvailabilityCatalog the value to set
         * @return this builder
         */
        public Builder occAvailabilityCatalog(
                com.oracle.bmc.capacitymanagement.model.OccAvailabilityCatalog
                        occAvailabilityCatalog) {
            this.occAvailabilityCatalog = occAvailabilityCatalog;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetOccAvailabilityCatalogResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            occAvailabilityCatalog(o.getOccAvailabilityCatalog());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetOccAvailabilityCatalogResponse build() {
            return new GetOccAvailabilityCatalogResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, occAvailabilityCatalog);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",occAvailabilityCatalog=").append(String.valueOf(occAvailabilityCatalog));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOccAvailabilityCatalogResponse)) {
            return false;
        }

        GetOccAvailabilityCatalogResponse other = (GetOccAvailabilityCatalogResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.occAvailabilityCatalog, other.occAvailabilityCatalog);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.occAvailabilityCatalog == null
                                ? 43
                                : this.occAvailabilityCatalog.hashCode());
        return result;
    }
}
