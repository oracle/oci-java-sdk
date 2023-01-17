/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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

    /**
     * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned ParserSummaryReport instance.
     */
    private com.oracle.bmc.loganalytics.model.ParserSummaryReport parserSummaryReport;

    /**
     * The returned ParserSummaryReport instance.
     * @return the value
     */
    public com.oracle.bmc.loganalytics.model.ParserSummaryReport getParserSummaryReport() {
        return parserSummaryReport;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "parserSummaryReport"
    })
    private GetParserSummaryResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.loganalytics.model.ParserSummaryReport parserSummaryReport) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.parserSummaryReport = parserSummaryReport;
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
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. When you contact Oracle about a specific request, provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned ParserSummaryReport instance.
         */
        private com.oracle.bmc.loganalytics.model.ParserSummaryReport parserSummaryReport;

        /**
         * The returned ParserSummaryReport instance.
         * @param parserSummaryReport the value to set
         * @return this builder
         */
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
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            parserSummaryReport(o.getParserSummaryReport());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetParserSummaryResponse build() {
            return new GetParserSummaryResponse(
                    __httpStatusCode__, headers, opcRequestId, parserSummaryReport);
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
