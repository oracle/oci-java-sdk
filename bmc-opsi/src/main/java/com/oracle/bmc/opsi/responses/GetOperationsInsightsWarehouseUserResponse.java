/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.responses;

import com.oracle.bmc.opsi.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetOperationsInsightsWarehouseUserResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     */
    private String etag;

    public String getEtag() {
        return etag;
    }

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
     * The returned OperationsInsightsWarehouseUser instance.
     */
    private com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUser
            operationsInsightsWarehouseUser;

    public com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUser
            getOperationsInsightsWarehouseUser() {
        return operationsInsightsWarehouseUser;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "etag",
        "opcRequestId",
        "operationsInsightsWarehouseUser"
    })
    private GetOperationsInsightsWarehouseUserResponse(
            int __httpStatusCode__,
            String etag,
            String opcRequestId,
            com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUser
                    operationsInsightsWarehouseUser) {
        super(__httpStatusCode__);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.operationsInsightsWarehouseUser = operationsInsightsWarehouseUser;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String etag;

        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUser
                operationsInsightsWarehouseUser;

        public Builder operationsInsightsWarehouseUser(
                com.oracle.bmc.opsi.model.OperationsInsightsWarehouseUser
                        operationsInsightsWarehouseUser) {
            this.operationsInsightsWarehouseUser = operationsInsightsWarehouseUser;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetOperationsInsightsWarehouseUserResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            operationsInsightsWarehouseUser(o.getOperationsInsightsWarehouseUser());

            return this;
        }

        public GetOperationsInsightsWarehouseUserResponse build() {
            return new GetOperationsInsightsWarehouseUserResponse(
                    __httpStatusCode__, etag, opcRequestId, operationsInsightsWarehouseUser);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",operationsInsightsWarehouseUser=")
                .append(String.valueOf(operationsInsightsWarehouseUser));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOperationsInsightsWarehouseUserResponse)) {
            return false;
        }

        GetOperationsInsightsWarehouseUserResponse other =
                (GetOperationsInsightsWarehouseUserResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.operationsInsightsWarehouseUser,
                        other.operationsInsightsWarehouseUser);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouseUser == null
                                ? 43
                                : this.operationsInsightsWarehouseUser.hashCode());
        return result;
    }
}
