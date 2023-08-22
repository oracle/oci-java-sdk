/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.responses;

import com.oracle.bmc.database.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetExadataInfrastructureOcpusResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code OCPUs} instance. */
    private com.oracle.bmc.database.model.OCPUs oCPUs;

    /**
     * The returned {@code OCPUs} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.database.model.OCPUs getOCPUs() {
        return oCPUs;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "headers", "opcRequestId", "oCPUs"})
    private GetExadataInfrastructureOcpusResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.database.model.OCPUs oCPUs) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.oCPUs = oCPUs;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetExadataInfrastructureOcpusResponse> {
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

        /** The returned {@code OCPUs} instance. */
        private com.oracle.bmc.database.model.OCPUs oCPUs;

        /**
         * The returned {@code OCPUs} instance.
         *
         * @param oCPUs the value to set
         * @return this builder
         */
        public Builder oCPUs(com.oracle.bmc.database.model.OCPUs oCPUs) {
            this.oCPUs = oCPUs;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetExadataInfrastructureOcpusResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            oCPUs(o.getOCPUs());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetExadataInfrastructureOcpusResponse build() {
            return new GetExadataInfrastructureOcpusResponse(
                    __httpStatusCode__, headers, opcRequestId, oCPUs);
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
        sb.append(",oCPUs=").append(String.valueOf(oCPUs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetExadataInfrastructureOcpusResponse)) {
            return false;
        }

        GetExadataInfrastructureOcpusResponse other = (GetExadataInfrastructureOcpusResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.oCPUs, other.oCPUs);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.oCPUs == null ? 43 : this.oCPUs.hashCode());
        return result;
    }
}
