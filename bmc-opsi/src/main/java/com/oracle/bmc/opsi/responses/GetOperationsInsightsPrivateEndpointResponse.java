/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetOperationsInsightsPrivateEndpointResponse
        extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code OperationsInsightsPrivateEndpoint} instance. */
    private com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpoint
            operationsInsightsPrivateEndpoint;

    /**
     * The returned {@code OperationsInsightsPrivateEndpoint} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpoint
            getOperationsInsightsPrivateEndpoint() {
        return operationsInsightsPrivateEndpoint;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "operationsInsightsPrivateEndpoint"
    })
    private GetOperationsInsightsPrivateEndpointResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpoint
                    operationsInsightsPrivateEndpoint) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.operationsInsightsPrivateEndpoint = operationsInsightsPrivateEndpoint;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetOperationsInsightsPrivateEndpointResponse> {
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

        /** The returned {@code OperationsInsightsPrivateEndpoint} instance. */
        private com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpoint
                operationsInsightsPrivateEndpoint;

        /**
         * The returned {@code OperationsInsightsPrivateEndpoint} instance.
         *
         * @param operationsInsightsPrivateEndpoint the value to set
         * @return this builder
         */
        public Builder operationsInsightsPrivateEndpoint(
                com.oracle.bmc.opsi.model.OperationsInsightsPrivateEndpoint
                        operationsInsightsPrivateEndpoint) {
            this.operationsInsightsPrivateEndpoint = operationsInsightsPrivateEndpoint;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetOperationsInsightsPrivateEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            operationsInsightsPrivateEndpoint(o.getOperationsInsightsPrivateEndpoint());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetOperationsInsightsPrivateEndpointResponse build() {
            return new GetOperationsInsightsPrivateEndpointResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    operationsInsightsPrivateEndpoint);
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
        sb.append(",operationsInsightsPrivateEndpoint=")
                .append(String.valueOf(operationsInsightsPrivateEndpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOperationsInsightsPrivateEndpointResponse)) {
            return false;
        }

        GetOperationsInsightsPrivateEndpointResponse other =
                (GetOperationsInsightsPrivateEndpointResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.operationsInsightsPrivateEndpoint,
                        other.operationsInsightsPrivateEndpoint);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.operationsInsightsPrivateEndpoint == null
                                ? 43
                                : this.operationsInsightsPrivateEndpoint.hashCode());
        return result;
    }
}
