/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListSqlTuningAdvisorTaskFindingsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSqlTuningAdvisorTaskFindingsRequest.
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
public class ListSqlTuningAdvisorTaskFindingsRequest
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
     * The optional greater than or equal to filter on the execution ID related to a specific SQL Tuning Advisor task.
     */
    private Long beginExecId;

    /**
     * The optional less than or equal to query parameter to filter on the execution ID related to a specific SQL Tuning Advisor task.
     */
    private Long endExecId;

    /**
     * How far back the API will search for begin and end exec id, if not supplied. Unused if beginExecId and endExecId optional query params are both supplied.
     */
    private SearchPeriod searchPeriod;

    /**
     * How far back the API will search for begin and end exec id, if not supplied. Unused if beginExecId and endExecId optional query params are both supplied.
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
     * Filters which findings get shown in the report
     */
    private FindingFilter findingFilter;

    /**
     * Filters which findings get shown in the report
     **/
    public enum FindingFilter {
        None("none"),
        Findings("FINDINGS"),
        Nofindings("NOFINDINGS"),
        Errors("ERRORS"),
        Profiles("PROFILES"),
        Indices("INDICES"),
        Stats("STATS"),
        Restructure("RESTRUCTURE"),
        Alternative("ALTERNATIVE"),
        AutoProfiles("AUTO_PROFILES"),
        OtherProfiles("OTHER_PROFILES"),
        ;

        private final String value;
        private static java.util.Map<String, FindingFilter> map;

        static {
            map = new java.util.HashMap<>();
            for (FindingFilter v : FindingFilter.values()) {
                map.put(v.getValue(), v);
            }
        }

        FindingFilter(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FindingFilter create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid FindingFilter: " + key);
        }
    };
    /**
     * The hash value of the object for the statistic finding search.
     */
    private String statsHashFilter;

    /**
     * The hash value of the index table name.
     */
    private String indexHashFilter;

    /**
     * The possible sortBy values of an object's recommendations.
     */
    private SortBy sortBy;

    /**
     * The possible sortBy values of an object's recommendations.
     **/
    public enum SortBy {
        DbtimeBenefit("DBTIME_BENEFIT"),
        ParsingSchema("PARSING_SCHEMA"),
        SqlId("SQL_ID"),
        Stats("STATS"),
        Profiles("PROFILES"),
        SqlBenefit("SQL_BENEFIT"),
        Date("DATE"),
        Indices("INDICES"),
        Restructure("RESTRUCTURE"),
        Alternative("ALTERNATIVE"),
        Misc("MISC"),
        Error("ERROR"),
        Timeouts("TIMEOUTS"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Descending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The page token representing the page from where the next set of paginated results
     * are retrieved. This is usually retrieved from a previous list call.
     *
     */
    private String page;

    /**
     * The maximum number of records returned in the paginated response.
     */
    private Integer limit;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSqlTuningAdvisorTaskFindingsRequest, java.lang.Void> {
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
        public Builder copy(ListSqlTuningAdvisorTaskFindingsRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            sqlTuningAdvisorTaskId(o.getSqlTuningAdvisorTaskId());
            beginExecId(o.getBeginExecId());
            endExecId(o.getEndExecId());
            searchPeriod(o.getSearchPeriod());
            findingFilter(o.getFindingFilter());
            statsHashFilter(o.getStatsHashFilter());
            indexHashFilter(o.getIndexHashFilter());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSqlTuningAdvisorTaskFindingsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSqlTuningAdvisorTaskFindingsRequest
         */
        public ListSqlTuningAdvisorTaskFindingsRequest build() {
            ListSqlTuningAdvisorTaskFindingsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
