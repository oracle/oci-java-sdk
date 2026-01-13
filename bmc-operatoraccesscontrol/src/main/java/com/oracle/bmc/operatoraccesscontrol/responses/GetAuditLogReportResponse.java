/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.responses;

import com.oracle.bmc.operatoraccesscontrol.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class GetAuditLogReportResponse extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code AuditLogReport} instance. */
    private com.oracle.bmc.operatoraccesscontrol.model.AuditLogReport auditLogReport;

    /**
     * The returned {@code AuditLogReport} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.operatoraccesscontrol.model.AuditLogReport getAuditLogReport() {
        return auditLogReport;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "auditLogReport"
    })
    private GetAuditLogReportResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.operatoraccesscontrol.model.AuditLogReport auditLogReport) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.auditLogReport = auditLogReport;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetAuditLogReportResponse> {
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

        /** The returned {@code AuditLogReport} instance. */
        private com.oracle.bmc.operatoraccesscontrol.model.AuditLogReport auditLogReport;

        /**
         * The returned {@code AuditLogReport} instance.
         *
         * @param auditLogReport the value to set
         * @return this builder
         */
        public Builder auditLogReport(
                com.oracle.bmc.operatoraccesscontrol.model.AuditLogReport auditLogReport) {
            this.auditLogReport = auditLogReport;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetAuditLogReportResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            auditLogReport(o.getAuditLogReport());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetAuditLogReportResponse build() {
            return new GetAuditLogReportResponse(
                    __httpStatusCode__, headers, opcRequestId, auditLogReport);
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
        sb.append(",auditLogReport=").append(String.valueOf(auditLogReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAuditLogReportResponse)) {
            return false;
        }

        GetAuditLogReportResponse other = (GetAuditLogReportResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.auditLogReport, other.auditLogReport);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.auditLogReport == null ? 43 : this.auditLogReport.hashCode());
        return result;
    }
}
