/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.responses;

import com.oracle.bmc.jmsjavadownloads.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
public class CreateJavaLicenseAcceptanceRecordResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /** The returned {@code JavaLicenseAcceptanceRecord} instance. */
    private com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecord
            javaLicenseAcceptanceRecord;

    /**
     * The returned {@code JavaLicenseAcceptanceRecord} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecord
            getJavaLicenseAcceptanceRecord() {
        return javaLicenseAcceptanceRecord;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "etag",
        "javaLicenseAcceptanceRecord"
    })
    private CreateJavaLicenseAcceptanceRecordResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            String etag,
            com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecord
                    javaLicenseAcceptanceRecord) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.etag = etag;
        this.javaLicenseAcceptanceRecord = javaLicenseAcceptanceRecord;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    CreateJavaLicenseAcceptanceRecordResponse> {
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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

        /** The returned {@code JavaLicenseAcceptanceRecord} instance. */
        private com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecord
                javaLicenseAcceptanceRecord;

        /**
         * The returned {@code JavaLicenseAcceptanceRecord} instance.
         *
         * @param javaLicenseAcceptanceRecord the value to set
         * @return this builder
         */
        public Builder javaLicenseAcceptanceRecord(
                com.oracle.bmc.jmsjavadownloads.model.JavaLicenseAcceptanceRecord
                        javaLicenseAcceptanceRecord) {
            this.javaLicenseAcceptanceRecord = javaLicenseAcceptanceRecord;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateJavaLicenseAcceptanceRecordResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            etag(o.getEtag());
            javaLicenseAcceptanceRecord(o.getJavaLicenseAcceptanceRecord());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateJavaLicenseAcceptanceRecordResponse build() {
            return new CreateJavaLicenseAcceptanceRecordResponse(
                    __httpStatusCode__, headers, opcRequestId, etag, javaLicenseAcceptanceRecord);
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
        sb.append(",javaLicenseAcceptanceRecord=")
                .append(String.valueOf(javaLicenseAcceptanceRecord));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJavaLicenseAcceptanceRecordResponse)) {
            return false;
        }

        CreateJavaLicenseAcceptanceRecordResponse other =
                (CreateJavaLicenseAcceptanceRecordResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(
                        this.javaLicenseAcceptanceRecord, other.javaLicenseAcceptanceRecord);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result =
                (result * PRIME)
                        + (this.javaLicenseAcceptanceRecord == null
                                ? 43
                                : this.javaLicenseAcceptanceRecord.hashCode());
        return result;
    }
}
