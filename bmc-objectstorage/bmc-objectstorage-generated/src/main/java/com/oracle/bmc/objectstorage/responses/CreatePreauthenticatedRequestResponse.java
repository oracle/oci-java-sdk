/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreatePreauthenticatedRequestResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned PreauthenticatedRequest instance.
     */
    private com.oracle.bmc.objectstorage.model.PreauthenticatedRequest preauthenticatedRequest;

    public com.oracle.bmc.objectstorage.model.PreauthenticatedRequest getPreauthenticatedRequest() {
        return preauthenticatedRequest;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcClientRequestId",
        "opcRequestId",
        "preauthenticatedRequest"
    })
    private CreatePreauthenticatedRequestResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            com.oracle.bmc.objectstorage.model.PreauthenticatedRequest preauthenticatedRequest) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.preauthenticatedRequest = preauthenticatedRequest;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcClientRequestId;

        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.objectstorage.model.PreauthenticatedRequest preauthenticatedRequest;

        public Builder preauthenticatedRequest(
                com.oracle.bmc.objectstorage.model.PreauthenticatedRequest
                        preauthenticatedRequest) {
            this.preauthenticatedRequest = preauthenticatedRequest;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CreatePreauthenticatedRequestResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            preauthenticatedRequest(o.getPreauthenticatedRequest());

            return this;
        }

        public CreatePreauthenticatedRequestResponse build() {
            return new CreatePreauthenticatedRequestResponse(
                    __httpStatusCode__, opcClientRequestId, opcRequestId, preauthenticatedRequest);
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
        sb.append(",opcClientRequestId=").append(String.valueOf(opcClientRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",preauthenticatedRequest=").append(String.valueOf(preauthenticatedRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePreauthenticatedRequestResponse)) {
            return false;
        }

        CreatePreauthenticatedRequestResponse other = (CreatePreauthenticatedRequestResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.preauthenticatedRequest, other.preauthenticatedRequest);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.preauthenticatedRequest == null
                                ? 43
                                : this.preauthenticatedRequest.hashCode());
        return result;
    }
}
