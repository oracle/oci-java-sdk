/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.responses;

import com.oracle.bmc.osmanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class GetEventReportResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * identifier for the request
     */
    private String opcRequestId;

    /**
     * identifier for the request
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned EventReport instance.
     */
    private com.oracle.bmc.osmanagement.model.EventReport eventReport;

    /**
     * The returned EventReport instance.
     * @return the value
     */
    public com.oracle.bmc.osmanagement.model.EventReport getEventReport() {
        return eventReport;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "eventReport"
    })
    private GetEventReportResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.osmanagement.model.EventReport eventReport) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.eventReport = eventReport;
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
         * identifier for the request
         */
        private String opcRequestId;

        /**
         * identifier for the request
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned EventReport instance.
         */
        private com.oracle.bmc.osmanagement.model.EventReport eventReport;

        /**
         * The returned EventReport instance.
         * @param eventReport the value to set
         * @return this builder
         */
        public Builder eventReport(com.oracle.bmc.osmanagement.model.EventReport eventReport) {
            this.eventReport = eventReport;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetEventReportResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            eventReport(o.getEventReport());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetEventReportResponse build() {
            return new GetEventReportResponse(
                    __httpStatusCode__, headers, opcRequestId, eventReport);
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
        sb.append(",eventReport=").append(String.valueOf(eventReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetEventReportResponse)) {
            return false;
        }

        GetEventReportResponse other = (GetEventReportResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eventReport, other.eventReport);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eventReport == null ? 43 : this.eventReport.hashCode());
        return result;
    }
}
