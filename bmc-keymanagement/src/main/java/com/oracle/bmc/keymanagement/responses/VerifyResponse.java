/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.responses;

import com.oracle.bmc.keymanagement.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class VerifyResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code VerifiedData} instance. */
    private com.oracle.bmc.keymanagement.model.VerifiedData verifiedData;

    /**
     * The returned {@code VerifiedData} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.keymanagement.model.VerifiedData getVerifiedData() {
        return verifiedData;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "verifiedData"
    })
    private VerifyResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.keymanagement.model.VerifiedData verifiedData) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.verifiedData = verifiedData;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<VerifyResponse> {
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

        /** The returned {@code VerifiedData} instance. */
        private com.oracle.bmc.keymanagement.model.VerifiedData verifiedData;

        /**
         * The returned {@code VerifiedData} instance.
         *
         * @param verifiedData the value to set
         * @return this builder
         */
        public Builder verifiedData(com.oracle.bmc.keymanagement.model.VerifiedData verifiedData) {
            this.verifiedData = verifiedData;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(VerifyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            verifiedData(o.getVerifiedData());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public VerifyResponse build() {
            return new VerifyResponse(__httpStatusCode__, headers, opcRequestId, verifiedData);
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
        sb.append(",verifiedData=").append(String.valueOf(verifiedData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VerifyResponse)) {
            return false;
        }

        VerifyResponse other = (VerifyResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.verifiedData, other.verifiedData);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.verifiedData == null ? 43 : this.verifiedData.hashCode());
        return result;
    }
}
