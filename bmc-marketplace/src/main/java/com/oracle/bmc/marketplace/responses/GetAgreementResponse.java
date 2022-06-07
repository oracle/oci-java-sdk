/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.responses;

import com.oracle.bmc.marketplace.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public class GetAgreementResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned Agreement instance.
     */
    private com.oracle.bmc.marketplace.model.Agreement agreement;

    public com.oracle.bmc.marketplace.model.Agreement getAgreement() {
        return agreement;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "agreement"})
    private GetAgreementResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.marketplace.model.Agreement agreement) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.agreement = agreement;
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

        private com.oracle.bmc.marketplace.model.Agreement agreement;

        public Builder agreement(com.oracle.bmc.marketplace.model.Agreement agreement) {
            this.agreement = agreement;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetAgreementResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            agreement(o.getAgreement());

            return this;
        }

        public GetAgreementResponse build() {
            return new GetAgreementResponse(__httpStatusCode__, opcRequestId, agreement);
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
        sb.append(",agreement=").append(String.valueOf(agreement));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAgreementResponse)) {
            return false;
        }

        GetAgreementResponse other = (GetAgreementResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.agreement, other.agreement);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.agreement == null ? 43 : this.agreement.hashCode());
        return result;
    }
}
