/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.responses;

import com.oracle.bmc.goldengate.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class GetDisasterRecoveryPrecheckReportResponse
        extends com.oracle.bmc.responses.BmcResponse {
    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     */
    private String opcRequestId;

    /**
     * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please include the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned DisasterRecoveryPrecheckReport instance.
     */
    private com.oracle.bmc.goldengate.model.DisasterRecoveryPrecheckReport
            disasterRecoveryPrecheckReport;

    /**
     * The returned DisasterRecoveryPrecheckReport instance.
     * @return the value
     */
    public com.oracle.bmc.goldengate.model.DisasterRecoveryPrecheckReport
            getDisasterRecoveryPrecheckReport() {
        return disasterRecoveryPrecheckReport;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "disasterRecoveryPrecheckReport"
    })
    private GetDisasterRecoveryPrecheckReportResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.goldengate.model.DisasterRecoveryPrecheckReport
                    disasterRecoveryPrecheckReport) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.disasterRecoveryPrecheckReport = disasterRecoveryPrecheckReport;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private javax.ws.rs.core.MultivaluedMap<String, String> headers;

        public Builder headers(javax.ws.rs.core.MultivaluedMap<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         */
        private String opcRequestId;

        /**
         * A unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please include the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned DisasterRecoveryPrecheckReport instance.
         */
        private com.oracle.bmc.goldengate.model.DisasterRecoveryPrecheckReport
                disasterRecoveryPrecheckReport;

        /**
         * The returned DisasterRecoveryPrecheckReport instance.
         * @param disasterRecoveryPrecheckReport the value to set
         * @return this builder
         */
        public Builder disasterRecoveryPrecheckReport(
                com.oracle.bmc.goldengate.model.DisasterRecoveryPrecheckReport
                        disasterRecoveryPrecheckReport) {
            this.disasterRecoveryPrecheckReport = disasterRecoveryPrecheckReport;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetDisasterRecoveryPrecheckReportResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            disasterRecoveryPrecheckReport(o.getDisasterRecoveryPrecheckReport());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetDisasterRecoveryPrecheckReportResponse build() {
            return new GetDisasterRecoveryPrecheckReportResponse(
                    __httpStatusCode__, headers, opcRequestId, disasterRecoveryPrecheckReport);
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
        sb.append(",disasterRecoveryPrecheckReport=")
                .append(String.valueOf(disasterRecoveryPrecheckReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDisasterRecoveryPrecheckReportResponse)) {
            return false;
        }

        GetDisasterRecoveryPrecheckReportResponse other =
                (GetDisasterRecoveryPrecheckReportResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.disasterRecoveryPrecheckReport, other.disasterRecoveryPrecheckReport);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.disasterRecoveryPrecheckReport == null
                                ? 43
                                : this.disasterRecoveryPrecheckReport.hashCode());
        return result;
    }
}
