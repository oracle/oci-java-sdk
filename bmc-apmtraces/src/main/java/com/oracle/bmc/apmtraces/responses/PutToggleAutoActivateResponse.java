/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.responses;

import com.oracle.bmc.apmtraces.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class PutToggleAutoActivateResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code AutoActivateToggleStatus} instance. */
    private com.oracle.bmc.apmtraces.model.AutoActivateToggleStatus autoActivateToggleStatus;

    /**
     * The returned {@code AutoActivateToggleStatus} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.apmtraces.model.AutoActivateToggleStatus getAutoActivateToggleStatus() {
        return autoActivateToggleStatus;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "autoActivateToggleStatus"
    })
    private PutToggleAutoActivateResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.apmtraces.model.AutoActivateToggleStatus autoActivateToggleStatus) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.autoActivateToggleStatus = autoActivateToggleStatus;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<PutToggleAutoActivateResponse> {
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

        /** The returned {@code AutoActivateToggleStatus} instance. */
        private com.oracle.bmc.apmtraces.model.AutoActivateToggleStatus autoActivateToggleStatus;

        /**
         * The returned {@code AutoActivateToggleStatus} instance.
         *
         * @param autoActivateToggleStatus the value to set
         * @return this builder
         */
        public Builder autoActivateToggleStatus(
                com.oracle.bmc.apmtraces.model.AutoActivateToggleStatus autoActivateToggleStatus) {
            this.autoActivateToggleStatus = autoActivateToggleStatus;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(PutToggleAutoActivateResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            autoActivateToggleStatus(o.getAutoActivateToggleStatus());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public PutToggleAutoActivateResponse build() {
            return new PutToggleAutoActivateResponse(
                    __httpStatusCode__, headers, opcRequestId, autoActivateToggleStatus);
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
        sb.append(",autoActivateToggleStatus=").append(String.valueOf(autoActivateToggleStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutToggleAutoActivateResponse)) {
            return false;
        }

        PutToggleAutoActivateResponse other = (PutToggleAutoActivateResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.autoActivateToggleStatus, other.autoActivateToggleStatus);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.autoActivateToggleStatus == null
                                ? 43
                                : this.autoActivateToggleStatus.hashCode());
        return result;
    }
}
