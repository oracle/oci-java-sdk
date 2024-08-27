/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.responses;

import com.oracle.bmc.delegateaccesscontrol.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class GetDelegatedResourceAccessRequestAuditLogReportResponse
        extends com.oracle.bmc.responses.BmcResponse {
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

    /** The returned {@code DelegatedResourceAccessRequestAuditLogReport} instance. */
    private com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestAuditLogReport
            delegatedResourceAccessRequestAuditLogReport;

    /**
     * The returned {@code DelegatedResourceAccessRequestAuditLogReport} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestAuditLogReport
            getDelegatedResourceAccessRequestAuditLogReport() {
        return delegatedResourceAccessRequestAuditLogReport;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "delegatedResourceAccessRequestAuditLogReport"
    })
    private GetDelegatedResourceAccessRequestAuditLogReportResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestAuditLogReport
                    delegatedResourceAccessRequestAuditLogReport) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.delegatedResourceAccessRequestAuditLogReport =
                delegatedResourceAccessRequestAuditLogReport;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<
                    GetDelegatedResourceAccessRequestAuditLogReportResponse> {
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

        /** The returned {@code DelegatedResourceAccessRequestAuditLogReport} instance. */
        private com.oracle.bmc.delegateaccesscontrol.model
                        .DelegatedResourceAccessRequestAuditLogReport
                delegatedResourceAccessRequestAuditLogReport;

        /**
         * The returned {@code DelegatedResourceAccessRequestAuditLogReport} instance.
         *
         * @param delegatedResourceAccessRequestAuditLogReport the value to set
         * @return this builder
         */
        public Builder delegatedResourceAccessRequestAuditLogReport(
                com.oracle.bmc.delegateaccesscontrol.model
                                .DelegatedResourceAccessRequestAuditLogReport
                        delegatedResourceAccessRequestAuditLogReport) {
            this.delegatedResourceAccessRequestAuditLogReport =
                    delegatedResourceAccessRequestAuditLogReport;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetDelegatedResourceAccessRequestAuditLogReportResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            delegatedResourceAccessRequestAuditLogReport(
                    o.getDelegatedResourceAccessRequestAuditLogReport());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetDelegatedResourceAccessRequestAuditLogReportResponse build() {
            return new GetDelegatedResourceAccessRequestAuditLogReportResponse(
                    __httpStatusCode__,
                    headers,
                    opcRequestId,
                    delegatedResourceAccessRequestAuditLogReport);
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
        sb.append(",delegatedResourceAccessRequestAuditLogReport=")
                .append(String.valueOf(delegatedResourceAccessRequestAuditLogReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDelegatedResourceAccessRequestAuditLogReportResponse)) {
            return false;
        }

        GetDelegatedResourceAccessRequestAuditLogReportResponse other =
                (GetDelegatedResourceAccessRequestAuditLogReportResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.delegatedResourceAccessRequestAuditLogReport,
                        other.delegatedResourceAccessRequestAuditLogReport);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.delegatedResourceAccessRequestAuditLogReport == null
                                ? 43
                                : this.delegatedResourceAccessRequestAuditLogReport.hashCode());
        return result;
    }
}
