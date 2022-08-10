/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class GetTransferApplianceEntitlementResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     *
     */
    private String opcRequestId;

    /**
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned TransferApplianceEntitlement instance.
     */
    private com.oracle.bmc.dts.model.TransferApplianceEntitlement transferApplianceEntitlement;

    /**
     * The returned TransferApplianceEntitlement instance.
     * @return the value
     */
    public com.oracle.bmc.dts.model.TransferApplianceEntitlement getTransferApplianceEntitlement() {
        return transferApplianceEntitlement;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "transferApplianceEntitlement"
    })
    private GetTransferApplianceEntitlementResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.dts.model.TransferApplianceEntitlement transferApplianceEntitlement) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.transferApplianceEntitlement = transferApplianceEntitlement;
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
         *
         */
        private String opcRequestId;

        /**
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned TransferApplianceEntitlement instance.
         */
        private com.oracle.bmc.dts.model.TransferApplianceEntitlement transferApplianceEntitlement;

        /**
         * The returned TransferApplianceEntitlement instance.
         * @param transferApplianceEntitlement the value to set
         * @return this builder
         */
        public Builder transferApplianceEntitlement(
                com.oracle.bmc.dts.model.TransferApplianceEntitlement
                        transferApplianceEntitlement) {
            this.transferApplianceEntitlement = transferApplianceEntitlement;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetTransferApplianceEntitlementResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            transferApplianceEntitlement(o.getTransferApplianceEntitlement());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetTransferApplianceEntitlementResponse build() {
            return new GetTransferApplianceEntitlementResponse(
                    __httpStatusCode__, headers, opcRequestId, transferApplianceEntitlement);
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
        sb.append(",transferApplianceEntitlement=")
                .append(String.valueOf(transferApplianceEntitlement));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTransferApplianceEntitlementResponse)) {
            return false;
        }

        GetTransferApplianceEntitlementResponse other = (GetTransferApplianceEntitlementResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.transferApplianceEntitlement, other.transferApplianceEntitlement);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.transferApplianceEntitlement == null
                                ? 43
                                : this.transferApplianceEntitlement.hashCode());
        return result;
    }
}
