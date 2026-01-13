/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.appmgmtcontrol.responses;

import com.oracle.bmc.appmgmtcontrol.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class GetWorkRequestResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /**
     * A decimal number representing the number of seconds the client should wait before polling
     * this endpoint again.
     */
    private Integer retryAfter;

    /**
     * A decimal number representing the number of seconds the client should wait before polling
     * this endpoint again.
     *
     * @return the value
     */
    public Integer getRetryAfter() {
        return retryAfter;
    }

    /** The returned {@code WorkRequest} instance. */
    private com.oracle.bmc.appmgmtcontrol.model.WorkRequest workRequest;

    /**
     * The returned {@code WorkRequest} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.appmgmtcontrol.model.WorkRequest getWorkRequest() {
        return workRequest;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "retryAfter",
        "workRequest"
    })
    private GetWorkRequestResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            Integer retryAfter,
            com.oracle.bmc.appmgmtcontrol.model.WorkRequest workRequest) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.retryAfter = retryAfter;
        this.workRequest = workRequest;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetWorkRequestResponse> {
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

        /**
         * A decimal number representing the number of seconds the client should wait before polling
         * this endpoint again.
         */
        private Integer retryAfter;

        /**
         * A decimal number representing the number of seconds the client should wait before polling
         * this endpoint again.
         *
         * @param retryAfter the value to set
         * @return this builder
         */
        public Builder retryAfter(Integer retryAfter) {
            this.retryAfter = retryAfter;
            return this;
        }

        /** The returned {@code WorkRequest} instance. */
        private com.oracle.bmc.appmgmtcontrol.model.WorkRequest workRequest;

        /**
         * The returned {@code WorkRequest} instance.
         *
         * @param workRequest the value to set
         * @return this builder
         */
        public Builder workRequest(com.oracle.bmc.appmgmtcontrol.model.WorkRequest workRequest) {
            this.workRequest = workRequest;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetWorkRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            retryAfter(o.getRetryAfter());
            workRequest(o.getWorkRequest());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetWorkRequestResponse build() {
            return new GetWorkRequestResponse(
                    __httpStatusCode__, headers, opcRequestId, retryAfter, workRequest);
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
        sb.append(",workRequest=").append(String.valueOf(workRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetWorkRequestResponse)) {
            return false;
        }

        GetWorkRequestResponse other = (GetWorkRequestResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.retryAfter, other.retryAfter)
                && java.util.Objects.equals(this.workRequest, other.workRequest);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.retryAfter == null ? 43 : this.retryAfter.hashCode());
        result = (result * PRIME) + (this.workRequest == null ? 43 : this.workRequest.hashCode());
        return result;
    }
}
