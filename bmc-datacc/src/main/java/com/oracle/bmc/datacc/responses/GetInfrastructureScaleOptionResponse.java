/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.responses;

import com.oracle.bmc.datacc.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class GetInfrastructureScaleOptionResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about a
     * particular request, then please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about a
     * particular request, then please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code InfrastructureScaleOption} instance. */
    private com.oracle.bmc.datacc.model.InfrastructureScaleOption infrastructureScaleOption;

    /**
     * The returned {@code InfrastructureScaleOption} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datacc.model.InfrastructureScaleOption getInfrastructureScaleOption() {
        return infrastructureScaleOption;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "infrastructureScaleOption"
    })
    private GetInfrastructureScaleOptionResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.datacc.model.InfrastructureScaleOption infrastructureScaleOption) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.infrastructureScaleOption = infrastructureScaleOption;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetInfrastructureScaleOptionResponse> {
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
         * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about
         * a particular request, then please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique identifier assigned by Oracle for the request. If you need to contact Oracle about
         * a particular request, then please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code InfrastructureScaleOption} instance. */
        private com.oracle.bmc.datacc.model.InfrastructureScaleOption infrastructureScaleOption;

        /**
         * The returned {@code InfrastructureScaleOption} instance.
         *
         * @param infrastructureScaleOption the value to set
         * @return this builder
         */
        public Builder infrastructureScaleOption(
                com.oracle.bmc.datacc.model.InfrastructureScaleOption infrastructureScaleOption) {
            this.infrastructureScaleOption = infrastructureScaleOption;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetInfrastructureScaleOptionResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            infrastructureScaleOption(o.getInfrastructureScaleOption());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetInfrastructureScaleOptionResponse build() {
            return new GetInfrastructureScaleOptionResponse(
                    __httpStatusCode__, headers, opcRequestId, infrastructureScaleOption);
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
        sb.append(",infrastructureScaleOption=").append(String.valueOf(infrastructureScaleOption));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetInfrastructureScaleOptionResponse)) {
            return false;
        }

        GetInfrastructureScaleOptionResponse other = (GetInfrastructureScaleOptionResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.infrastructureScaleOption, other.infrastructureScaleOption);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureScaleOption == null
                                ? 43
                                : this.infrastructureScaleOption.hashCode());
        return result;
    }
}
