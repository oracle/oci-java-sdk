/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.responses;

import com.oracle.bmc.dts.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
public class GetTransferApplianceEncryptionPassphraseResponse
        extends com.oracle.bmc.responses.BmcResponse {
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
     *
     */
    private String etag;

    /**
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The returned TransferApplianceEncryptionPassphrase instance.
     */
    private com.oracle.bmc.dts.model.TransferApplianceEncryptionPassphrase
            transferApplianceEncryptionPassphrase;

    /**
     * The returned TransferApplianceEncryptionPassphrase instance.
     * @return the value
     */
    public com.oracle.bmc.dts.model.TransferApplianceEncryptionPassphrase
            getTransferApplianceEncryptionPassphrase() {
        return transferApplianceEncryptionPassphrase;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "etag",
        "transferApplianceEncryptionPassphrase"
    })
    private GetTransferApplianceEncryptionPassphraseResponse(
            int __httpStatusCode__,
            String opcRequestId,
            String etag,
            com.oracle.bmc.dts.model.TransferApplianceEncryptionPassphrase
                    transferApplianceEncryptionPassphrase) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.transferApplianceEncryptionPassphrase = transferApplianceEncryptionPassphrase;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
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
         *
         */
        private String etag;

        /**
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The returned TransferApplianceEncryptionPassphrase instance.
         */
        private com.oracle.bmc.dts.model.TransferApplianceEncryptionPassphrase
                transferApplianceEncryptionPassphrase;

        /**
         * The returned TransferApplianceEncryptionPassphrase instance.
         * @param transferApplianceEncryptionPassphrase the value to set
         * @return this builder
         */
        public Builder transferApplianceEncryptionPassphrase(
                com.oracle.bmc.dts.model.TransferApplianceEncryptionPassphrase
                        transferApplianceEncryptionPassphrase) {
            this.transferApplianceEncryptionPassphrase = transferApplianceEncryptionPassphrase;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetTransferApplianceEncryptionPassphraseResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            transferApplianceEncryptionPassphrase(o.getTransferApplianceEncryptionPassphrase());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetTransferApplianceEncryptionPassphraseResponse build() {
            return new GetTransferApplianceEncryptionPassphraseResponse(
                    __httpStatusCode__, opcRequestId, etag, transferApplianceEncryptionPassphrase);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",transferApplianceEncryptionPassphrase=")
                .append(String.valueOf(transferApplianceEncryptionPassphrase));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTransferApplianceEncryptionPassphraseResponse)) {
            return false;
        }

        GetTransferApplianceEncryptionPassphraseResponse other =
                (GetTransferApplianceEncryptionPassphraseResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.transferApplianceEncryptionPassphrase,
                        other.transferApplianceEncryptionPassphrase);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.transferApplianceEncryptionPassphrase == null
                                ? 43
                                : this.transferApplianceEncryptionPassphrase.hashCode());
        return result;
    }
}
