/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.responses;

import com.oracle.bmc.identity.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetIamWorkRequestResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code IamWorkRequest} instance. */
    private com.oracle.bmc.identity.model.IamWorkRequest iamWorkRequest;

    /**
     * The returned {@code IamWorkRequest} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.identity.model.IamWorkRequest getIamWorkRequest() {
        return iamWorkRequest;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "iamWorkRequest"
    })
    private GetIamWorkRequestResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.identity.model.IamWorkRequest iamWorkRequest) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.iamWorkRequest = iamWorkRequest;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetIamWorkRequestResponse> {
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

        /** The returned {@code IamWorkRequest} instance. */
        private com.oracle.bmc.identity.model.IamWorkRequest iamWorkRequest;

        /**
         * The returned {@code IamWorkRequest} instance.
         *
         * @param iamWorkRequest the value to set
         * @return this builder
         */
        public Builder iamWorkRequest(com.oracle.bmc.identity.model.IamWorkRequest iamWorkRequest) {
            this.iamWorkRequest = iamWorkRequest;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetIamWorkRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            iamWorkRequest(o.getIamWorkRequest());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetIamWorkRequestResponse build() {
            return new GetIamWorkRequestResponse(
                    __httpStatusCode__, headers, opcRequestId, iamWorkRequest);
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
        sb.append(",iamWorkRequest=").append(String.valueOf(iamWorkRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetIamWorkRequestResponse)) {
            return false;
        }

        GetIamWorkRequestResponse other = (GetIamWorkRequestResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.iamWorkRequest, other.iamWorkRequest);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.iamWorkRequest == null ? 43 : this.iamWorkRequest.hashCode());
        return result;
    }
}
