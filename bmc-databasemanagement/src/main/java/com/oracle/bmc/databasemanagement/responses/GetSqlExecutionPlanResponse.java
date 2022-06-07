/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.responses;

import com.oracle.bmc.databasemanagement.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetSqlExecutionPlanResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The returned SqlTuningAdvisorTaskSqlExecutionPlan instance.
     */
    private com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSqlExecutionPlan
            sqlTuningAdvisorTaskSqlExecutionPlan;

    public com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSqlExecutionPlan
            getSqlTuningAdvisorTaskSqlExecutionPlan() {
        return sqlTuningAdvisorTaskSqlExecutionPlan;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcRequestId",
        "sqlTuningAdvisorTaskSqlExecutionPlan"
    })
    private GetSqlExecutionPlanResponse(
            int __httpStatusCode__,
            String opcRequestId,
            com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSqlExecutionPlan
                    sqlTuningAdvisorTaskSqlExecutionPlan) {
        super(__httpStatusCode__);
        this.opcRequestId = opcRequestId;
        this.sqlTuningAdvisorTaskSqlExecutionPlan = sqlTuningAdvisorTaskSqlExecutionPlan;
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

        private com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSqlExecutionPlan
                sqlTuningAdvisorTaskSqlExecutionPlan;

        public Builder sqlTuningAdvisorTaskSqlExecutionPlan(
                com.oracle.bmc.databasemanagement.model.SqlTuningAdvisorTaskSqlExecutionPlan
                        sqlTuningAdvisorTaskSqlExecutionPlan) {
            this.sqlTuningAdvisorTaskSqlExecutionPlan = sqlTuningAdvisorTaskSqlExecutionPlan;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetSqlExecutionPlanResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcRequestId(o.getOpcRequestId());
            sqlTuningAdvisorTaskSqlExecutionPlan(o.getSqlTuningAdvisorTaskSqlExecutionPlan());

            return this;
        }

        public GetSqlExecutionPlanResponse build() {
            return new GetSqlExecutionPlanResponse(
                    __httpStatusCode__, opcRequestId, sqlTuningAdvisorTaskSqlExecutionPlan);
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
        sb.append(",sqlTuningAdvisorTaskSqlExecutionPlan=")
                .append(String.valueOf(sqlTuningAdvisorTaskSqlExecutionPlan));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSqlExecutionPlanResponse)) {
            return false;
        }

        GetSqlExecutionPlanResponse other = (GetSqlExecutionPlanResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.sqlTuningAdvisorTaskSqlExecutionPlan,
                        other.sqlTuningAdvisorTaskSqlExecutionPlan);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlTuningAdvisorTaskSqlExecutionPlan == null
                                ? 43
                                : this.sqlTuningAdvisorTaskSqlExecutionPlan.hashCode());
        return result;
    }
}
