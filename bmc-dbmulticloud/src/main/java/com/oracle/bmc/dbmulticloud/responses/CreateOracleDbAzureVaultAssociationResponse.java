/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.responses;

import com.oracle.bmc.dbmulticloud.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class CreateOracleDbAzureVaultAssociationResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
     * request.
     */
    private String opcWorkRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
     * request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** URI of the resource */
    private String location;

    /**
     * URI of the resource
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** URI of the resource */
    private String contentLocation;

    /**
     * URI of the resource
     *
     * @return the value
     */
    public String getContentLocation() {
        return contentLocation;
    }

    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /** The returned {@code OracleDbAzureVaultAssociation} instance. */
    private com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation
            oracleDbAzureVaultAssociation;

    /**
     * The returned {@code OracleDbAzureVaultAssociation} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation
            getOracleDbAzureVaultAssociation() {
        return oracleDbAzureVaultAssociation;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcWorkRequestId",
        "opcRequestId",
        "location",
        "contentLocation",
        "etag",
        "oracleDbAzureVaultAssociation"
    })
    private CreateOracleDbAzureVaultAssociationResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcWorkRequestId,
            String opcRequestId,
            String location,
            String contentLocation,
            String etag,
            com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation
                    oracleDbAzureVaultAssociation) {
        super(__httpStatusCode__, headers);
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.contentLocation = contentLocation;
        this.etag = etag;
        this.oracleDbAzureVaultAssociation = oracleDbAzureVaultAssociation;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateOracleDbAzureVaultAssociationResponse> {
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

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
         * request.
         */
        private String opcWorkRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * asynchronous work request. Use GetWorkRequest with this ID to track the status of the
         * request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** URI of the resource */
        private String location;

        /**
         * URI of the resource
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** URI of the resource */
        private String contentLocation;

        /**
         * URI of the resource
         *
         * @param contentLocation the value to set
         * @return this builder
         */
        public Builder contentLocation(String contentLocation) {
            this.contentLocation = contentLocation;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /** The returned {@code OracleDbAzureVaultAssociation} instance. */
        private com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation
                oracleDbAzureVaultAssociation;

        /**
         * The returned {@code OracleDbAzureVaultAssociation} instance.
         *
         * @param oracleDbAzureVaultAssociation the value to set
         * @return this builder
         */
        public Builder oracleDbAzureVaultAssociation(
                com.oracle.bmc.dbmulticloud.model.OracleDbAzureVaultAssociation
                        oracleDbAzureVaultAssociation) {
            this.oracleDbAzureVaultAssociation = oracleDbAzureVaultAssociation;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateOracleDbAzureVaultAssociationResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            contentLocation(o.getContentLocation());
            etag(o.getEtag());
            oracleDbAzureVaultAssociation(o.getOracleDbAzureVaultAssociation());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateOracleDbAzureVaultAssociationResponse build() {
            return new CreateOracleDbAzureVaultAssociationResponse(
                    __httpStatusCode__,
                    headers,
                    opcWorkRequestId,
                    opcRequestId,
                    location,
                    contentLocation,
                    etag,
                    oracleDbAzureVaultAssociation);
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
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",contentLocation=").append(String.valueOf(contentLocation));
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",oracleDbAzureVaultAssociation=")
                .append(String.valueOf(oracleDbAzureVaultAssociation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOracleDbAzureVaultAssociationResponse)) {
            return false;
        }

        CreateOracleDbAzureVaultAssociationResponse other =
                (CreateOracleDbAzureVaultAssociationResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.contentLocation, other.contentLocation)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.oracleDbAzureVaultAssociation, other.oracleDbAzureVaultAssociation);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLocation == null ? 43 : this.contentLocation.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleDbAzureVaultAssociation == null
                                ? 43
                                : this.oracleDbAzureVaultAssociation.hashCode());
        return result;
    }
}
