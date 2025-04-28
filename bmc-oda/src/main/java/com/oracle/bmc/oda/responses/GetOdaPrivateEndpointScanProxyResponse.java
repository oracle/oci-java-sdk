/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.responses;

import com.oracle.bmc.oda.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class GetOdaPrivateEndpointScanProxyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency
     * control.
     */
    private String etag;

    /**
     * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency
     * control.
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

    /** The returned {@code OdaPrivateEndpointScanProxy} instance. */
    private com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxy odaPrivateEndpointScanProxy;

    /**
     * The returned {@code OdaPrivateEndpointScanProxy} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxy getOdaPrivateEndpointScanProxy() {
        return odaPrivateEndpointScanProxy;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "odaPrivateEndpointScanProxy"
    })
    private GetOdaPrivateEndpointScanProxyResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxy odaPrivateEndpointScanProxy) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.odaPrivateEndpointScanProxy = odaPrivateEndpointScanProxy;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetOdaPrivateEndpointScanProxyResponse> {
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
         * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency
         * control.
         */
        private String etag;

        /**
         * For use in a PUT or DELETE {@code if-match} query parameter for optimistic concurrency
         * control.
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

        /** The returned {@code OdaPrivateEndpointScanProxy} instance. */
        private com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxy odaPrivateEndpointScanProxy;

        /**
         * The returned {@code OdaPrivateEndpointScanProxy} instance.
         *
         * @param odaPrivateEndpointScanProxy the value to set
         * @return this builder
         */
        public Builder odaPrivateEndpointScanProxy(
                com.oracle.bmc.oda.model.OdaPrivateEndpointScanProxy odaPrivateEndpointScanProxy) {
            this.odaPrivateEndpointScanProxy = odaPrivateEndpointScanProxy;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetOdaPrivateEndpointScanProxyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            odaPrivateEndpointScanProxy(o.getOdaPrivateEndpointScanProxy());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetOdaPrivateEndpointScanProxyResponse build() {
            return new GetOdaPrivateEndpointScanProxyResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, odaPrivateEndpointScanProxy);
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
        sb.append(",odaPrivateEndpointScanProxy=")
                .append(String.valueOf(odaPrivateEndpointScanProxy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOdaPrivateEndpointScanProxyResponse)) {
            return false;
        }

        GetOdaPrivateEndpointScanProxyResponse other = (GetOdaPrivateEndpointScanProxyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.odaPrivateEndpointScanProxy, other.odaPrivateEndpointScanProxy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.odaPrivateEndpointScanProxy == null
                                ? 43
                                : this.odaPrivateEndpointScanProxy.hashCode());
        return result;
    }
}
