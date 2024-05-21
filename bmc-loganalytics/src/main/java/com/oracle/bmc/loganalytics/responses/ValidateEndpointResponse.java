/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ValidateEndpointResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ValidateEndpointResult instance.
     */
    private com.oracle.bmc.loganalytics.model.ValidateEndpointResult validateEndpointResult;

    /**
     * The returned ValidateEndpointResult instance.
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.ValidateEndpointResult getValidateEndpointResult() {
        return validateEndpointResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "validateEndpointResult"
    })
    private ValidateEndpointResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.ValidateEndpointResult validateEndpointResult) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.validateEndpointResult = validateEndpointResult;
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
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned ValidateEndpointResult instance.
         */
        private com.oracle.bmc.loganalytics.model.ValidateEndpointResult validateEndpointResult;

        /**
         * The returned ValidateEndpointResult instance.
         * @param validateEndpointResult the value to set
         * @return this builder
         */
        public Builder validateEndpointResult(
                com.oracle.bmc.loganalytics.model.ValidateEndpointResult validateEndpointResult) {
            this.validateEndpointResult = validateEndpointResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ValidateEndpointResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            validateEndpointResult(o.getValidateEndpointResult());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public ValidateEndpointResponse build() {
            return new ValidateEndpointResponse(
                    __httpStatusCode__, headers, opcRequestId, validateEndpointResult);
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
        sb.append(",validateEndpointResult=").append(String.valueOf(validateEndpointResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateEndpointResponse)) {
            return false;
        }

        ValidateEndpointResponse other = (ValidateEndpointResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.validateEndpointResult, other.validateEndpointResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.validateEndpointResult == null
                                ? 43
                                : this.validateEndpointResult.hashCode());
        return result;
    }
}
