/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class UpdateTransferApplianceResponse extends com.oracle.bmc.responses.BmcResponse {
    /** */
    private String opcRequestId;

    /** @return the value */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** */
    private String etag;

    /** @return the value */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code TransferAppliance} instance. */
    private com.oracle.bmc.dts.model.TransferAppliance transferAppliance;

    /**
     * The returned {@code TransferAppliance} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dts.model.TransferAppliance getTransferAppliance() {
        return transferAppliance;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "transferAppliance"
    })
    private UpdateTransferApplianceResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.dts.model.TransferAppliance transferAppliance) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.transferAppliance = transferAppliance;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    UpdateTransferApplianceResponse> {
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

        /** */
        private String opcRequestId;

        /**
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** */
        private String etag;

        /**
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code TransferAppliance} instance. */
        private com.oracle.bmc.dts.model.TransferAppliance transferAppliance;

        /**
         * The returned {@code TransferAppliance} instance.
         *
         * @param transferAppliance the value to set
         * @return this builder
         */
        public Builder transferAppliance(
                com.oracle.bmc.dts.model.TransferAppliance transferAppliance) {
            this.transferAppliance = transferAppliance;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(UpdateTransferApplianceResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            transferAppliance(o.getTransferAppliance());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public UpdateTransferApplianceResponse build() {
            return new UpdateTransferApplianceResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, transferAppliance);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",transferAppliance=").append(String.valueOf(transferAppliance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTransferApplianceResponse)) {
            return false;
        }

        UpdateTransferApplianceResponse other = (UpdateTransferApplianceResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.transferAppliance, other.transferAppliance);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.transferAppliance == null ? 43 : this.transferAppliance.hashCode());
        return result;
    }
}
