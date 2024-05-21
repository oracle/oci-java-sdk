/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetSqlTuningAdvisorTaskSummaryReportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSqlTuningAdvisorTaskSummaryReportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetSqlTuningAdvisorTaskSummaryReportRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private Long sqlTuningAdvisorTaskId;

    /**
     * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public Long getSqlTuningAdvisorTaskId() {
        return sqlTuningAdvisorTaskId;
    }
    /**
     * How far back the API will search for begin and end exec id. Unused if neither exec ids nor time filter query params are supplied. This is applicable only for Auto SQL Tuning tasks.
     */
    private SearchPeriod searchPeriod;

    /**
     * How far back the API will search for begin and end exec id. Unused if neither exec ids nor time filter query params are supplied. This is applicable only for Auto SQL Tuning tasks.
     **/
    public enum SearchPeriod {
        Last24Hr("LAST_24HR"),
        Last7Day("LAST_7DAY"),
        Last31Day("LAST_31DAY"),
        SinceLast("SINCE_LAST"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, SearchPeriod> map;

        static {
            map = new java.util.HashMap<>();
            for (SearchPeriod v : SearchPeriod.values()) {
                map.put(v.getValue(), v);
            }
        }

        SearchPeriod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SearchPeriod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SearchPeriod: " + key);
        }
    };

    /**
     * How far back the API will search for begin and end exec id. Unused if neither exec ids nor time filter query params are supplied. This is applicable only for Auto SQL Tuning tasks.
     */
    public SearchPeriod getSearchPeriod() {
        return searchPeriod;
    }
    /**
     * The optional greater than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
     */
    private java.util.Date timeGreaterThanOrEqualTo;

    /**
     * The optional greater than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
     */
    public java.util.Date getTimeGreaterThanOrEqualTo() {
        return timeGreaterThanOrEqualTo;
    }
    /**
     * The optional less than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
     */
    private java.util.Date timeLessThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
     */
    public java.util.Date getTimeLessThanOrEqualTo() {
        return timeLessThanOrEqualTo;
    }
    /**
     * The optional greater than or equal to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
     */
    private Long beginExecIdGreaterThanOrEqualTo;

    /**
     * The optional greater than or equal to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
     */
    public Long getBeginExecIdGreaterThanOrEqualTo() {
        return beginExecIdGreaterThanOrEqualTo;
    }
    /**
     * The optional less than or equal to query parameter to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
     */
    private Long endExecIdLessThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
     */
    public Long getEndExecIdLessThanOrEqualTo() {
        return endExecIdLessThanOrEqualTo;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The OCID of the Named Credential.
     */
    private String opcNamedCredentialId;

    /**
     * The OCID of the Named Credential.
     */
    public String getOpcNamedCredentialId() {
        return opcNamedCredentialId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSqlTuningAdvisorTaskSummaryReportRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private Long sqlTuningAdvisorTaskId = null;

        /**
         * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param sqlTuningAdvisorTaskId the value to set
         * @return this builder instance
         */
        public Builder sqlTuningAdvisorTaskId(Long sqlTuningAdvisorTaskId) {
            this.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            return this;
        }

        /**
         * How far back the API will search for begin and end exec id. Unused if neither exec ids nor time filter query params are supplied. This is applicable only for Auto SQL Tuning tasks.
         */
        private SearchPeriod searchPeriod = null;

        /**
         * How far back the API will search for begin and end exec id. Unused if neither exec ids nor time filter query params are supplied. This is applicable only for Auto SQL Tuning tasks.
         * @param searchPeriod the value to set
         * @return this builder instance
         */
        public Builder searchPeriod(SearchPeriod searchPeriod) {
            this.searchPeriod = searchPeriod;
            return this;
        }

        /**
         * The optional greater than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
         */
        private java.util.Date timeGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
         * @param timeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeGreaterThanOrEqualTo(java.util.Date timeGreaterThanOrEqualTo) {
            this.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The optional less than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
         */
        private java.util.Date timeLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
         * @param timeLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLessThanOrEqualTo(java.util.Date timeLessThanOrEqualTo) {
            this.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            return this;
        }

        /**
         * The optional greater than or equal to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
         */
        private Long beginExecIdGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
         * @param beginExecIdGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder beginExecIdGreaterThanOrEqualTo(Long beginExecIdGreaterThanOrEqualTo) {
            this.beginExecIdGreaterThanOrEqualTo = beginExecIdGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The optional less than or equal to query parameter to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
         */
        private Long endExecIdLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
         * @param endExecIdLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder endExecIdLessThanOrEqualTo(Long endExecIdLessThanOrEqualTo) {
            this.endExecIdLessThanOrEqualTo = endExecIdLessThanOrEqualTo;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The OCID of the Named Credential.
         */
        private String opcNamedCredentialId = null;

        /**
         * The OCID of the Named Credential.
         * @param opcNamedCredentialId the value to set
         * @return this builder instance
         */
        public Builder opcNamedCredentialId(String opcNamedCredentialId) {
            this.opcNamedCredentialId = opcNamedCredentialId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetSqlTuningAdvisorTaskSummaryReportRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            sqlTuningAdvisorTaskId(o.getSqlTuningAdvisorTaskId());
            searchPeriod(o.getSearchPeriod());
            timeGreaterThanOrEqualTo(o.getTimeGreaterThanOrEqualTo());
            timeLessThanOrEqualTo(o.getTimeLessThanOrEqualTo());
            beginExecIdGreaterThanOrEqualTo(o.getBeginExecIdGreaterThanOrEqualTo());
            endExecIdLessThanOrEqualTo(o.getEndExecIdLessThanOrEqualTo());
            opcRequestId(o.getOpcRequestId());
            opcNamedCredentialId(o.getOpcNamedCredentialId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetSqlTuningAdvisorTaskSummaryReportRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetSqlTuningAdvisorTaskSummaryReportRequest
         */
        public GetSqlTuningAdvisorTaskSummaryReportRequest build() {
            GetSqlTuningAdvisorTaskSummaryReportRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetSqlTuningAdvisorTaskSummaryReportRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetSqlTuningAdvisorTaskSummaryReportRequest
         */
        public GetSqlTuningAdvisorTaskSummaryReportRequest buildWithoutInvocationCallback() {
            GetSqlTuningAdvisorTaskSummaryReportRequest request =
                    new GetSqlTuningAdvisorTaskSummaryReportRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.sqlTuningAdvisorTaskId = sqlTuningAdvisorTaskId;
            request.searchPeriod = searchPeriod;
            request.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            request.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            request.beginExecIdGreaterThanOrEqualTo = beginExecIdGreaterThanOrEqualTo;
            request.endExecIdLessThanOrEqualTo = endExecIdLessThanOrEqualTo;
            request.opcRequestId = opcRequestId;
            request.opcNamedCredentialId = opcNamedCredentialId;
            return request;
            // new GetSqlTuningAdvisorTaskSummaryReportRequest(managedDatabaseId, sqlTuningAdvisorTaskId, searchPeriod, timeGreaterThanOrEqualTo, timeLessThanOrEqualTo, beginExecIdGreaterThanOrEqualTo, endExecIdLessThanOrEqualTo, opcRequestId, opcNamedCredentialId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .sqlTuningAdvisorTaskId(sqlTuningAdvisorTaskId)
                .searchPeriod(searchPeriod)
                .timeGreaterThanOrEqualTo(timeGreaterThanOrEqualTo)
                .timeLessThanOrEqualTo(timeLessThanOrEqualTo)
                .beginExecIdGreaterThanOrEqualTo(beginExecIdGreaterThanOrEqualTo)
                .endExecIdLessThanOrEqualTo(endExecIdLessThanOrEqualTo)
                .opcRequestId(opcRequestId)
                .opcNamedCredentialId(opcNamedCredentialId);
    }

    /**
     * Return a new builder for this request object.
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",sqlTuningAdvisorTaskId=").append(String.valueOf(this.sqlTuningAdvisorTaskId));
        sb.append(",searchPeriod=").append(String.valueOf(this.searchPeriod));
        sb.append(",timeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeGreaterThanOrEqualTo));
        sb.append(",timeLessThanOrEqualTo=").append(String.valueOf(this.timeLessThanOrEqualTo));
        sb.append(",beginExecIdGreaterThanOrEqualTo=")
                .append(String.valueOf(this.beginExecIdGreaterThanOrEqualTo));
        sb.append(",endExecIdLessThanOrEqualTo=")
                .append(String.valueOf(this.endExecIdLessThanOrEqualTo));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcNamedCredentialId=").append(String.valueOf(this.opcNamedCredentialId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetSqlTuningAdvisorTaskSummaryReportRequest)) {
            return false;
        }

        GetSqlTuningAdvisorTaskSummaryReportRequest other =
                (GetSqlTuningAdvisorTaskSummaryReportRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(
                        this.sqlTuningAdvisorTaskId, other.sqlTuningAdvisorTaskId)
                && java.util.Objects.equals(this.searchPeriod, other.searchPeriod)
                && java.util.Objects.equals(
                        this.timeGreaterThanOrEqualTo, other.timeGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeLessThanOrEqualTo, other.timeLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.beginExecIdGreaterThanOrEqualTo, other.beginExecIdGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.endExecIdLessThanOrEqualTo, other.endExecIdLessThanOrEqualTo)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcNamedCredentialId, other.opcNamedCredentialId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlTuningAdvisorTaskId == null
                                ? 43
                                : this.sqlTuningAdvisorTaskId.hashCode());
        result = (result * PRIME) + (this.searchPeriod == null ? 43 : this.searchPeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.timeGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLessThanOrEqualTo == null
                                ? 43
                                : this.timeLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.beginExecIdGreaterThanOrEqualTo == null
                                ? 43
                                : this.beginExecIdGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.endExecIdLessThanOrEqualTo == null
                                ? 43
                                : this.endExecIdLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcNamedCredentialId == null
                                ? 43
                                : this.opcNamedCredentialId.hashCode());
        return result;
    }
}
