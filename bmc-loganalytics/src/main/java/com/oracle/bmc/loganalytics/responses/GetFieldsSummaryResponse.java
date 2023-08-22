/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetFieldsSummaryResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific
     * request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /** The returned {@code FieldSummaryReport} instance. */
    private com.oracle.bmc.loganalytics.model.FieldSummaryReport fieldSummaryReport;

    /**
     * The returned {@code FieldSummaryReport} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.FieldSummaryReport getFieldSummaryReport() {
        return fieldSummaryReport;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "fieldSummaryReport"
    })
    private GetFieldsSummaryResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.FieldSummaryReport fieldSummaryReport) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.fieldSummaryReport = fieldSummaryReport;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<GetFieldsSummaryResponse> {
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
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a
         * specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The returned {@code FieldSummaryReport} instance. */
        private com.oracle.bmc.loganalytics.model.FieldSummaryReport fieldSummaryReport;

        /**
         * The returned {@code FieldSummaryReport} instance.
         *
         * @param fieldSummaryReport the value to set
         * @return this builder
         */
        public Builder fieldSummaryReport(
                com.oracle.bmc.loganalytics.model.FieldSummaryReport fieldSummaryReport) {
            this.fieldSummaryReport = fieldSummaryReport;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(GetFieldsSummaryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            fieldSummaryReport(o.getFieldSummaryReport());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public GetFieldsSummaryResponse build() {
            return new GetFieldsSummaryResponse(
                    __httpStatusCode__, headers, opcRequestId, fieldSummaryReport);
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
        sb.append(",fieldSummaryReport=").append(String.valueOf(fieldSummaryReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetFieldsSummaryResponse)) {
            return false;
        }

        GetFieldsSummaryResponse other = (GetFieldsSummaryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.fieldSummaryReport, other.fieldSummaryReport);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.fieldSummaryReport == null
                                ? 43
                                : this.fieldSummaryReport.hashCode());
        return result;
    }
}
