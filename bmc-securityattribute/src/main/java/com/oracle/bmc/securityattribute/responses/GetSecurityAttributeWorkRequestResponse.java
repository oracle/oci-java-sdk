/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.securityattribute.responses;

import com.oracle.bmc.securityattribute.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240815")
public class GetSecurityAttributeWorkRequestResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The number of seconds that the client should wait before polling again. */
    private Float retryAfter;

    /**
     * The number of seconds that the client should wait before polling again.
     *
     * @return the value
     */
    public Float getRetryAfter() {
        return retryAfter;
    }

    /** The returned {@code SecurityAttributeWorkRequest} instance. */
    private com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequest
            securityAttributeWorkRequest;

    /**
     * The returned {@code SecurityAttributeWorkRequest} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequest
            getSecurityAttributeWorkRequest() {
        return securityAttributeWorkRequest;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "retryAfter",
        "securityAttributeWorkRequest"
    })
    private GetSecurityAttributeWorkRequestResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            Float retryAfter,
            com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequest
                    securityAttributeWorkRequest) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
        this.securityAttributeWorkRequest = securityAttributeWorkRequest;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetSecurityAttributeWorkRequestResponse> {
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

        /** The number of seconds that the client should wait before polling again. */
        private Float retryAfter;

        /**
         * The number of seconds that the client should wait before polling again.
         *
         * @param retryAfter the value to set
         * @return this builder
         */
        public Builder retryAfter(Float retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        /** The returned {@code SecurityAttributeWorkRequest} instance. */
        private com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequest
                securityAttributeWorkRequest;

        /**
         * The returned {@code SecurityAttributeWorkRequest} instance.
         *
         * @param securityAttributeWorkRequest the value to set
         * @return this builder
         */
        public Builder securityAttributeWorkRequest(
                com.oracle.bmc.securityattribute.model.SecurityAttributeWorkRequest
                        securityAttributeWorkRequest) {
            this.securityAttributeWorkRequest = securityAttributeWorkRequest;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetSecurityAttributeWorkRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            securityAttributeWorkRequest(o.getSecurityAttributeWorkRequest());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetSecurityAttributeWorkRequestResponse build() {
            return new GetSecurityAttributeWorkRequestResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    retryAfter,
                    securityAttributeWorkRequest);
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
        sb.append(",retryAfter=").append(String.valueOf(retryAfter));
        sb.append(",securityAttributeWorkRequest=")
                .append(String.valueOf(securityAttributeWorkRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSecurityAttributeWorkRequestResponse)) {
            return false;
        }

        GetSecurityAttributeWorkRequestResponse other = (GetSecurityAttributeWorkRequestResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(
                        this.securityAttributeWorkRequest, other.securityAttributeWorkRequest);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result =
                (result * PRIME)
                        + (this.securityAttributeWorkRequest == null
                                ? 43
                                : this.securityAttributeWorkRequest.hashCode());
        return result;
    }
}
