/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.responses;

import com.oracle.bmc.datasafe.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class CreateSensitiveTypesExportResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * For optimistic concurrency control. For more information, see [ETags for Optimistic
     * Concurrency
     * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
     */
    private String etag;

    /**
     * For optimistic concurrency control. For more information, see [ETags for Optimistic
     * Concurrency
     * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest)
     * getWorkRequest} with this OCID to track the status of the request.
     */
    private String opcWorkRequestId;

    /**
     * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest)
     * getWorkRequest} with this OCID to track the status of the request.
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

    /** The URI of the sensitive types export. */
    private String location;

    /**
     * The URI of the sensitive types export.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** The returned {@code SensitiveTypesExport} instance. */
    private com.oracle.bmc.datasafe.model.SensitiveTypesExport sensitiveTypesExport;

    /**
     * The returned {@code SensitiveTypesExport} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.datasafe.model.SensitiveTypesExport getSensitiveTypesExport() {
        return sensitiveTypesExport;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcWorkRequestId",
        "opcRequestId",
        "location",
        "sensitiveTypesExport"
    })
    private CreateSensitiveTypesExportResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcWorkRequestId,
            String opcRequestId,
            String location,
            com.oracle.bmc.datasafe.model.SensitiveTypesExport sensitiveTypesExport) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcWorkRequestId = opcWorkRequestId;
        this.opcRequestId = opcRequestId;
        this.location = location;
        this.sensitiveTypesExport = sensitiveTypesExport;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateSensitiveTypesExportResponse> {
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
         * For optimistic concurrency control. For more information, see [ETags for Optimistic
         * Concurrency
         * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
         */
        private String etag;

        /**
         * For optimistic concurrency control. For more information, see [ETags for Optimistic
         * Concurrency
         * Control](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#eleven)
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest)
         * getWorkRequest} with this OCID to track the status of the request.
         */
        private String opcWorkRequestId;

        /**
         * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest)
         * getWorkRequest} with this OCID to track the status of the request.
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

        /** The URI of the sensitive types export. */
        private String location;

        /**
         * The URI of the sensitive types export.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** The returned {@code SensitiveTypesExport} instance. */
        private com.oracle.bmc.datasafe.model.SensitiveTypesExport sensitiveTypesExport;

        /**
         * The returned {@code SensitiveTypesExport} instance.
         *
         * @param sensitiveTypesExport the value to set
         * @return this builder
         */
        public Builder sensitiveTypesExport(
                com.oracle.bmc.datasafe.model.SensitiveTypesExport sensitiveTypesExport) {
            this.sensitiveTypesExport = sensitiveTypesExport;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateSensitiveTypesExportResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcWorkRequestId(o.getOpcWorkRequestId());
            opcRequestId(o.getOpcRequestId());
            location(o.getLocation());
            sensitiveTypesExport(o.getSensitiveTypesExport());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateSensitiveTypesExportResponse build() {
            return new CreateSensitiveTypesExportResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcWorkRequestId,
                    opcRequestId,
                    location,
                    sensitiveTypesExport);
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
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",sensitiveTypesExport=").append(String.valueOf(sensitiveTypesExport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSensitiveTypesExportResponse)) {
            return false;
        }

        CreateSensitiveTypesExportResponse other = (CreateSensitiveTypesExportResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.sensitiveTypesExport, other.sensitiveTypesExport);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypesExport == null
                                ? 43
                                : this.sensitiveTypesExport.hashCode());
        return result;
    }
}
