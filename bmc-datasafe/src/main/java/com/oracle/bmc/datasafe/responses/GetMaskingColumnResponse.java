/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.responses;

import com.oracle.bmc.datasafe.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetMaskingColumnResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. For more information, see [ETags for Optimistic Concurrency Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
     *
     */
    private String etag;

    /**
     * For optimistic concurrency control. For more information, see [ETags for Optimistic Concurrency Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned MaskingColumn instance.
     */
    private com.oracle.bmc.datasafe.model.MaskingColumn maskingColumn;

    /**
     * The returned MaskingColumn instance.
     * @return the value
     */
    public com.oracle.bmc.datasafe.model.MaskingColumn getMaskingColumn() {
        return maskingColumn;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "maskingColumn"
    })
    private GetMaskingColumnResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.datasafe.model.MaskingColumn maskingColumn) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.maskingColumn = maskingColumn;
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
         * For optimistic concurrency control. For more information, see [ETags for Optimistic Concurrency Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
         *
         */
        private String etag;

        /**
         * For optimistic concurrency control. For more information, see [ETags for Optimistic Concurrency Control](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned MaskingColumn instance.
         */
        private com.oracle.bmc.datasafe.model.MaskingColumn maskingColumn;

        /**
         * The returned MaskingColumn instance.
         * @param maskingColumn the value to set
         * @return this builder
         */
        public Builder maskingColumn(com.oracle.bmc.datasafe.model.MaskingColumn maskingColumn) {
            this.maskingColumn = maskingColumn;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetMaskingColumnResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            maskingColumn(o.getMaskingColumn());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetMaskingColumnResponse build() {
            return new GetMaskingColumnResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, maskingColumn);
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
        sb.append(",maskingColumn=").append(String.valueOf(maskingColumn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMaskingColumnResponse)) {
            return false;
        }

        GetMaskingColumnResponse other = (GetMaskingColumnResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.maskingColumn, other.maskingColumn);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingColumn == null ? 43 : this.maskingColumn.hashCode());
        return result;
    }
}
