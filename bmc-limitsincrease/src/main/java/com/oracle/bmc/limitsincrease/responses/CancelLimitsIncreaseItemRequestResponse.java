/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.limitsincrease.responses;

import com.oracle.bmc.limitsincrease.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class CancelLimitsIncreaseItemRequestResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned LimitsIncreaseItemRequest instance.
     */
    private com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest limitsIncreaseItemRequest;

    /**
     * The returned LimitsIncreaseItemRequest instance.
     * @return the value
     */
    public com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest
            getLimitsIncreaseItemRequest() {
        return limitsIncreaseItemRequest;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "limitsIncreaseItemRequest"
    })
    private CancelLimitsIncreaseItemRequestResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String etag,
            String opcRequestId,
            com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest
                    limitsIncreaseItemRequest) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.limitsIncreaseItemRequest = limitsIncreaseItemRequest;
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
         * The returned LimitsIncreaseItemRequest instance.
         */
        private com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest
                limitsIncreaseItemRequest;

        /**
         * The returned LimitsIncreaseItemRequest instance.
         * @param limitsIncreaseItemRequest the value to set
         * @return this builder
         */
        public Builder limitsIncreaseItemRequest(
                com.oracle.bmc.limitsincrease.model.LimitsIncreaseItemRequest
                        limitsIncreaseItemRequest) {
            this.limitsIncreaseItemRequest = limitsIncreaseItemRequest;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CancelLimitsIncreaseItemRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            limitsIncreaseItemRequest(o.getLimitsIncreaseItemRequest());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public CancelLimitsIncreaseItemRequestResponse build() {
            return new CancelLimitsIncreaseItemRequestResponse(
                    __httpStatusCode__, headers, etag, opcRequestId, limitsIncreaseItemRequest);
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
        sb.append(",limitsIncreaseItemRequest=").append(String.valueOf(limitsIncreaseItemRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancelLimitsIncreaseItemRequestResponse)) {
            return false;
        }

        CancelLimitsIncreaseItemRequestResponse other = (CancelLimitsIncreaseItemRequestResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.limitsIncreaseItemRequest, other.limitsIncreaseItemRequest);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.limitsIncreaseItemRequest == null
                                ? 43
                                : this.limitsIncreaseItemRequest.hashCode());
        return result;
    }
}
