/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.responses;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class GetParserSummaryResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ParserSummaryReport instance.
     */
    private com.oracle.bmc.loganalytics.model.ParserSummaryReport parserSummaryReport;

    public com.oracle.bmc.loganalytics.model.ParserSummaryReport getParserSummaryReport() {
        return parserSummaryReport;
    }

    @java.beans.ConstructorProperties({"__httpStatusCode__", "opcRequestId", "parserSummaryReport"})
    private GetParserSummaryResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.ParserSummaryReport parserSummaryReport) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.parserSummaryReport = parserSummaryReport;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private String opcRequestId;

        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private com.oracle.bmc.loganalytics.model.ParserSummaryReport parserSummaryReport;

        public Builder parserSummaryReport(
                com.oracle.bmc.loganalytics.model.ParserSummaryReport parserSummaryReport) {
            this.parserSummaryReport = parserSummaryReport;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetParserSummaryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            parserSummaryReport(o.getParserSummaryReport());

            return this;
        }

        public GetParserSummaryResponse build() {
            return new GetParserSummaryResponse(
                    __httpStatusCode__, opcRequestId, parserSummaryReport);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",parserSummaryReport=").append(String.valueOf(parserSummaryReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetParserSummaryResponse)) {
            return false;
        }

        GetParserSummaryResponse other = (GetParserSummaryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.parserSummaryReport, other.parserSummaryReport);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.parserSummaryReport == null
                                ? 43
                                : this.parserSummaryReport.hashCode());
        return result;
    }
}
