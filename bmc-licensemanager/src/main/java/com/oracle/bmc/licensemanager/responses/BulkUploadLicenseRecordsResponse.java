/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.responses;

import com.oracle.bmc.licensemanager.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
public class BulkUploadLicenseRecordsResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned BulkUploadResponse instance.
     */
    private com.oracle.bmc.licensemanager.model.BulkUploadResponse bulkUploadResponse;

    /**
     * The returned BulkUploadResponse instance.
     * @return the value
     */
    public com.oracle.bmc.licensemanager.model.BulkUploadResponse getBulkUploadResponse() {
        return bulkUploadResponse;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "bulkUploadResponse"})
    private BulkUploadLicenseRecordsResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.licensemanager.model.BulkUploadResponse bulkUploadResponse) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.bulkUploadResponse = bulkUploadResponse;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned BulkUploadResponse instance.
         */
        private com.oracle.bmc.licensemanager.model.BulkUploadResponse bulkUploadResponse;

        /**
         * The returned BulkUploadResponse instance.
         * @param bulkUploadResponse the value to set
         * @return this builder
         */
        public Builder bulkUploadResponse(
                com.oracle.bmc.licensemanager.model.BulkUploadResponse bulkUploadResponse) {
            this.bulkUploadResponse = bulkUploadResponse;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(BulkUploadLicenseRecordsResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            bulkUploadResponse(o.getBulkUploadResponse());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public BulkUploadLicenseRecordsResponse build() {
            return new BulkUploadLicenseRecordsResponse(
                    __httpStatusCode__, opcRequestId, bulkUploadResponse);
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
        sb.append(",bulkUploadResponse=").append(String.valueOf(bulkUploadResponse));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkUploadLicenseRecordsResponse)) {
            return false;
        }

        BulkUploadLicenseRecordsResponse other = (BulkUploadLicenseRecordsResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.bulkUploadResponse, other.bulkUploadResponse);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.bulkUploadResponse == null
                                ? 43
                                : this.bulkUploadResponse.hashCode());
        return result;
    }
}
