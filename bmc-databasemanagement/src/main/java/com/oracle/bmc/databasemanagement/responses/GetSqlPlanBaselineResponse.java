/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetSqlPlanBaselineResponse extends com.oracle.bmc.responses.BmcResponse {
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
     * The returned SqlPlanBaseline instance.
     */
    private com.oracle.bmc.databasemanagement.model.SqlPlanBaseline sqlPlanBaseline;

    /**
     * The returned SqlPlanBaseline instance.
     * @return the value
     */
    public com.oracle.bmc.databasemanagement.model.SqlPlanBaseline getSqlPlanBaseline() {
        return sqlPlanBaseline;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "opcRequestId",
        "sqlPlanBaseline"
    })
    private GetSqlPlanBaselineResponse(
            int __httpStatusCode__,
            javax.ws.rs.core.MultivaluedMap<String, String> headers,
            String opcRequestId,
            com.oracle.bmc.databasemanagement.model.SqlPlanBaseline sqlPlanBaseline) {
        super(__httpStatusCode__, headers);
        this.opcRequestId = opcRequestId;
        this.sqlPlanBaseline = sqlPlanBaseline;
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
         * The returned SqlPlanBaseline instance.
         */
        private com.oracle.bmc.databasemanagement.model.SqlPlanBaseline sqlPlanBaseline;

        /**
         * The returned SqlPlanBaseline instance.
         * @param sqlPlanBaseline the value to set
         * @return this builder
         */
        public Builder sqlPlanBaseline(
                com.oracle.bmc.databasemanagement.model.SqlPlanBaseline sqlPlanBaseline) {
            this.sqlPlanBaseline = sqlPlanBaseline;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetSqlPlanBaselineResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            opcRequestId(o.getOpcRequestId());
            sqlPlanBaseline(o.getSqlPlanBaseline());

            return this;
        }

        /**
         * Build the response object.
         * @return the response object
         */
        public GetSqlPlanBaselineResponse build() {
            return new GetSqlPlanBaselineResponse(
                    __httpStatusCode__, headers, opcRequestId, sqlPlanBaseline);
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
        sb.append(",sqlPlanBaseline=").append(String.valueOf(sqlPlanBaseline));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSqlPlanBaselineResponse)) {
            return false;
        }

        GetSqlPlanBaselineResponse other = (GetSqlPlanBaselineResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sqlPlanBaseline, other.sqlPlanBaseline);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlPlanBaseline == null ? 43 : this.sqlPlanBaseline.hashCode());
        return result;
    }
}
