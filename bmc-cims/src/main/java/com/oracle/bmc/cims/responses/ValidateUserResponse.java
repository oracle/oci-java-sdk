/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.responses;

import com.oracle.bmc.cims.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
public class ValidateUserResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ValidationResponse instance.
     */
    private com.oracle.bmc.cims.model.ValidationResponse validationResponse;

    /**
     * The returned ValidationResponse instance.
     * @return the value
     */
    public com.oracle.bmc.cims.model.ValidationResponse getValidationResponse() {
        return validationResponse;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "validationResponse"
    })
    private ValidateUserResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.cims.model.ValidationResponse validationResponse) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.validationResponse = validationResponse;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned ValidationResponse instance.
         */
        private com.oracle.bmc.cims.model.ValidationResponse validationResponse;

        /**
         * The returned ValidationResponse instance.
         * @param validationResponse the value to set
         * @return this builder
         */
        public Builder validationResponse(
                com.oracle.bmc.cims.model.ValidationResponse validationResponse) {
            this.validationResponse = validationResponse;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ValidateUserResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            validationResponse(o.getValidationResponse());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ValidateUserResponse build() {
            return new ValidateUserResponse(
                    __httpStatusCode__, headers, opcRequestId, validationResponse);
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
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",validationResponse=").append(String.valueOf(validationResponse));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateUserResponse)) {
            return false;
        }

        ValidateUserResponse other = (ValidateUserResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.validationResponse, other.validationResponse);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.validationResponse == null
                                ? 43
                                : this.validationResponse.hashCode());
        return result;
    }
}
