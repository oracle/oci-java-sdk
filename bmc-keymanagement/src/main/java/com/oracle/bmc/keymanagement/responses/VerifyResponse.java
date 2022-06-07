/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.responses;

import com.oracle.bmc.keymanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class VerifyResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned VerifiedData instance.
     */
    private com.oracle.bmc.keymanagement.model.VerifiedData verifiedData;

    public com.oracle.bmc.keymanagement.model.VerifiedData getVerifiedData() {
        return verifiedData;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "verifiedData"})
    private VerifyResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.keymanagement.model.VerifiedData verifiedData) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.verifiedData = verifiedData;
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

        private com.oracle.bmc.keymanagement.model.VerifiedData verifiedData;

        public Builder verifiedData(com.oracle.bmc.keymanagement.model.VerifiedData verifiedData) {
            this.verifiedData = verifiedData;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(VerifyResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            verifiedData(o.getVerifiedData());

            return this;
        }

        public VerifyResponse build() {
            return new VerifyResponse(__httpStatusCode__, opcRequestId, verifiedData);
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
