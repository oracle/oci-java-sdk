/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetSqlTuningAdvisorTaskSummaryReportExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetSqlTuningAdvisorTaskSummaryReportRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetSqlTuningAdvisorTaskSummaryReportRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The SQL tuning task identifier. This is not the [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private Long sqlTuningAdvisorTaskId;

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
     * The optional greater than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
     */
    private java.util.Date timeGreaterThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter the timestamp. This is applicable only for Auto SQL Tuning tasks.
     */
    private java.util.Date timeLessThanOrEqualTo;

    /**
     * The optional greater than or equal to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
     */
    private Long beginExecIdGreaterThanOrEqualTo;

    /**
     * The optional less than or equal to query parameter to filter on the execution ID related to a specific SQL Tuning Advisor task. This is applicable only for Auto SQL Tuning tasks.
     */
    private Long endExecIdLessThanOrEqualTo;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetSqlTuningAdvisorTaskSummaryReportRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
    }
}
