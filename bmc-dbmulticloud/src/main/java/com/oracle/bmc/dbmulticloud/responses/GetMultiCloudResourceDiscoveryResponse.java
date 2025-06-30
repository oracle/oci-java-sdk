/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.responses;

import com.oracle.bmc.dbmulticloud.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class GetMultiCloudResourceDiscoveryResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
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

    /** The returned {@code MultiCloudResourceDiscovery} instance. */
    private com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery
            multiCloudResourceDiscovery;

    /**
     * The returned {@code MultiCloudResourceDiscovery} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery
            getMultiCloudResourceDiscovery() {
        return multiCloudResourceDiscovery;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "multiCloudResourceDiscovery"
    })
    private GetMultiCloudResourceDiscoveryResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery
                    multiCloudResourceDiscovery) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.multiCloudResourceDiscovery = multiCloudResourceDiscovery;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetMultiCloudResourceDiscoveryResponse> {
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

        /** For optimistic concurrency control. See {@code if-match}. */
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

        /** The returned {@code MultiCloudResourceDiscovery} instance. */
        private com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery
                multiCloudResourceDiscovery;

        /**
         * The returned {@code MultiCloudResourceDiscovery} instance.
         *
         * @param multiCloudResourceDiscovery the value to set
         * @return this builder
         */
        public Builder multiCloudResourceDiscovery(
                com.oracle.bmc.dbmulticloud.model.MultiCloudResourceDiscovery
                        multiCloudResourceDiscovery) {
            this.multiCloudResourceDiscovery = multiCloudResourceDiscovery;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetMultiCloudResourceDiscoveryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            multiCloudResourceDiscovery(o.getMultiCloudResourceDiscovery());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetMultiCloudResourceDiscoveryResponse build() {
            return new GetMultiCloudResourceDiscoveryResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, multiCloudResourceDiscovery);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",multiCloudResourceDiscovery=")
                .append(String.valueOf(multiCloudResourceDiscovery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMultiCloudResourceDiscoveryResponse)) {
            return false;
        }

        GetMultiCloudResourceDiscoveryResponse other = (GetMultiCloudResourceDiscoveryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.multiCloudResourceDiscovery, other.multiCloudResourceDiscovery);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.multiCloudResourceDiscovery == null
                                ? 43
                                : this.multiCloudResourceDiscovery.hashCode());
        return result;
    }
}
