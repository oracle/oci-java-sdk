/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.responses;

import com.oracle.bmc.filestorage.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
public class ValidateKeyTabsResponse extends com.oracle.bmc.responses.BmcResponse {
    /** Unique Oracle-assigned identifier for the request. */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned ValidateKeyTabsResponseDetails instance. */
    private com.oracle.bmc.filestorage.model.ValidateKeyTabsResponseDetails
            validateKeyTabsResponseDetails;

    /**
     * The returned ValidateKeyTabsResponseDetails instance.
     *
     * @return the value
     */
    public com.oracle.bmc.filestorage.model.ValidateKeyTabsResponseDetails
            getValidateKeyTabsResponseDetails() {
        return validateKeyTabsResponseDetails;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "validateKeyTabsResponseDetails"
    })
    private ValidateKeyTabsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.filestorage.model.ValidateKeyTabsResponseDetails
                    validateKeyTabsResponseDetails) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.validateKeyTabsResponseDetails = validateKeyTabsResponseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<ValidateKeyTabsResponse> {
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

        /** Unique Oracle-assigned identifier for the request. */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned ValidateKeyTabsResponseDetails instance. */
        private com.oracle.bmc.filestorage.model.ValidateKeyTabsResponseDetails
                validateKeyTabsResponseDetails;

        /**
         * The returned ValidateKeyTabsResponseDetails instance.
         *
         * @param validateKeyTabsResponseDetails the value to set
         * @return this builder
         */
        public Builder validateKeyTabsResponseDetails(
                com.oracle.bmc.filestorage.model.ValidateKeyTabsResponseDetails
                        validateKeyTabsResponseDetails) {
            this.validateKeyTabsResponseDetails = validateKeyTabsResponseDetails;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(ValidateKeyTabsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            validateKeyTabsResponseDetails(o.getValidateKeyTabsResponseDetails());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public ValidateKeyTabsResponse build() {
            return new ValidateKeyTabsResponse(
                    __httpStatusCode__, headers, opcRequestId, validateKeyTabsResponseDetails);
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
        sb.append(",validateKeyTabsResponseDetails=")
                .append(String.valueOf(validateKeyTabsResponseDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateKeyTabsResponse)) {
            return false;
        }

        ValidateKeyTabsResponse other = (ValidateKeyTabsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.validateKeyTabsResponseDetails, other.validateKeyTabsResponseDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.validateKeyTabsResponseDetails == null
                                ? 43
                                : this.validateKeyTabsResponseDetails.hashCode());
        return result;
    }
}
