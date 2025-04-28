/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class CreateTransferApplianceAdminCredentialsResponse
        extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code TransferApplianceCertificate} instance. */
    private com.oracle.bmc.dts.model.TransferApplianceCertificate transferApplianceCertificate;

    /**
     * The returned {@code TransferApplianceCertificate} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dts.model.TransferApplianceCertificate getTransferApplianceCertificate() {
        return transferApplianceCertificate;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "transferApplianceCertificate"
    })
    private CreateTransferApplianceAdminCredentialsResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.dts.model.TransferApplianceCertificate transferApplianceCertificate) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.transferApplianceCertificate = transferApplianceCertificate;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateTransferApplianceAdminCredentialsResponse> {
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

        /** The returned {@code TransferApplianceCertificate} instance. */
        private com.oracle.bmc.dts.model.TransferApplianceCertificate transferApplianceCertificate;

        /**
         * The returned {@code TransferApplianceCertificate} instance.
         *
         * @param transferApplianceCertificate the value to set
         * @return this builder
         */
        public Builder transferApplianceCertificate(
                com.oracle.bmc.dts.model.TransferApplianceCertificate
                        transferApplianceCertificate) {
            this.transferApplianceCertificate = transferApplianceCertificate;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateTransferApplianceAdminCredentialsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            transferApplianceCertificate(o.getTransferApplianceCertificate());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateTransferApplianceAdminCredentialsResponse build() {
            return new CreateTransferApplianceAdminCredentialsResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, transferApplianceCertificate);
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
        sb.append(",transferApplianceCertificate=")
                .append(String.valueOf(transferApplianceCertificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTransferApplianceAdminCredentialsResponse)) {
            return false;
        }

        CreateTransferApplianceAdminCredentialsResponse other =
                (CreateTransferApplianceAdminCredentialsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.transferApplianceCertificate, other.transferApplianceCertificate);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.transferApplianceCertificate == null
                                ? 43
                                : this.transferApplianceCertificate.hashCode());
        return result;
    }
}
