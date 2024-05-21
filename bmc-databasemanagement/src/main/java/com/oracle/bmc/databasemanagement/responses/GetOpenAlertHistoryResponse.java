/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetOpenAlertHistoryResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned OpenAlertHistory instance.
     */
    private com.oracle.bmc.databasemanagement.model.OpenAlertHistory openAlertHistory;

    /**
     * The returned OpenAlertHistory instance.
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.OpenAlertHistory getOpenAlertHistory() {
        return openAlertHistory;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "openAlertHistory"
    })
    private GetOpenAlertHistoryResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.databasemanagement.model.OpenAlertHistory openAlertHistory) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.openAlertHistory = openAlertHistory;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The returned OpenAlertHistory instance.
         */
        private com.oracle.bmc.databasemanagement.model.OpenAlertHistory openAlertHistory;

        /**
         * The returned OpenAlertHistory instance.
         * @param openAlertHistory the value to set
         * @return this builder
         */
        public Builder openAlertHistory(
                com.oracle.bmc.databasemanagement.model.OpenAlertHistory openAlertHistory) {
            this.openAlertHistory = openAlertHistory;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetOpenAlertHistoryResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            openAlertHistory(o.getOpenAlertHistory());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetOpenAlertHistoryResponse build() {
            return new GetOpenAlertHistoryResponse(
                    __httpStatusCode__, headers, opcRequestId, openAlertHistory);
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
        sb.append(",openAlertHistory=").append(String.valueOf(openAlertHistory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOpenAlertHistoryResponse)) {
            return false;
        }

        GetOpenAlertHistoryResponse other = (GetOpenAlertHistoryResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.openAlertHistory, other.openAlertHistory);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.openAlertHistory == null ? 43 : this.openAlertHistory.hashCode());
        return result;
    }
}
