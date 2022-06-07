/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ValidateSourceExtendedFieldDetailsResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ExtendedFieldsValidationResult instance.
     */
    private com.oracle.bmc.loganalytics.model.ExtendedFieldsValidationResult
            extendedFieldsValidationResult;

    public com.oracle.bmc.loganalytics.model.ExtendedFieldsValidationResult
            getExtendedFieldsValidationResult() {
        return extendedFieldsValidationResult;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "extendedFieldsValidationResult"
    })
    private ValidateSourceExtendedFieldDetailsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.ExtendedFieldsValidationResult
                    extendedFieldsValidationResult) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.extendedFieldsValidationResult = extendedFieldsValidationResult;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.loganalytics.model.ExtendedFieldsValidationResult
                extendedFieldsValidationResult;

        public Builder extendedFieldsValidationResult(
                com.oracle.bmc.loganalytics.model.ExtendedFieldsValidationResult
                        extendedFieldsValidationResult) {
            this.extendedFieldsValidationResult = extendedFieldsValidationResult;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ValidateSourceExtendedFieldDetailsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            extendedFieldsValidationResult(o.getExtendedFieldsValidationResult());

            return this;
        }

        public ValidateSourceExtendedFieldDetailsResponse build() {
            return new ValidateSourceExtendedFieldDetailsResponse(
                    __httpStatusCode__, opcRequestId, extendedFieldsValidationResult);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",extendedFieldsValidationResult=")
                .append(String.valueOf(extendedFieldsValidationResult));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateSourceExtendedFieldDetailsResponse)) {
            return false;
        }

        ValidateSourceExtendedFieldDetailsResponse other =
                (ValidateSourceExtendedFieldDetailsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.extendedFieldsValidationResult, other.extendedFieldsValidationResult);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.extendedFieldsValidationResult == null
                                ? 43
                                : this.extendedFieldsValidationResult.hashCode());
        return result;
    }
}
