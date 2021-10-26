/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceForecastTrendExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeExadataInsightResourceForecastTrendRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class SummarizeExadataInsightResourceForecastTrendRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Filter by resource.
     * Supported values are HOST , STORAGE_SERVER and DATABASE
     *
     */
    private String resourceType;

    /**
     * Filter by resource metric.
     * Supported values are CPU , STORAGE, MEMORY, IO, IOPS, THROUGHPUT
     *
     */
    private String resourceMetric;

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of exadata insight resource.
     *
     */
    private String exadataInsightId;

    /**
     * Specify time period in ISO 8601 format with respect to current time.
     * Default is last 30 days represented by P30D.
     * If timeInterval is specified, then timeIntervalStart and timeIntervalEnd will be ignored.
     * Examples  P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
     *
     */
    private String analysisTimeInterval;

    /**
     * Analysis start time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * The minimum allowed value is 2 years prior to the current day.
     * timeIntervalStart and timeIntervalEnd parameters are used together.
     * If analysisTimeInterval is specified, this parameter is ignored.
     *
     */
    private java.util.Date timeIntervalStart;

    /**
     * Analysis end time in UTC in ISO 8601 format(exclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd are used together.
     * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
     *
     */
    private java.util.Date timeIntervalEnd;

    /**
     * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> databaseInsightId;

    /**
     * Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> hostInsightId;

    /**
     * Optional storage server name on an exadata system.
     *
     */
    private java.util.List<String> storageServerName;

    /**
     * Filter by one or more Exadata types.
     * Possible value are DBMACHINE, EXACS, and EXACC.
     *
     */
    private java.util.List<String> exadataType;

    /**
     * Choose the type of statistic metric data to be used for forecasting.
     */
    private Statistic statistic;

    /**
     * Choose the type of statistic metric data to be used for forecasting.
     **/
    public enum Statistic {
        Avg("AVG"),
        Max("MAX"),
        ;

        private final String value;
        private static java.util.Map<String, Statistic> map;

        static {
            map = new java.util.HashMap<>();
            for (Statistic v : Statistic.values()) {
                map.put(v.getValue(), v);
            }
        }

        Statistic(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Statistic create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Statistic: " + key);
        }
    };
    /**
     * Number of days used for utilization forecast analysis.
     *
     */
    private Integer forecastStartDay;

    /**
     * Number of days used for utilization forecast analysis.
     *
     */
    private Integer forecastDays;

    /**
     * Choose algorithm model for the forecasting.
     * Possible values:
     *   - LINEAR: Uses linear regression algorithm for forecasting.
     *   - ML_AUTO: Automatically detects best algorithm to use for forecasting.
     *   - ML_NO_AUTO: Automatically detects seasonality of the data for forecasting using linear or seasonal algorithm.
     *
     */
    private ForecastModel forecastModel;

    /**
     * Choose algorithm model for the forecasting.
     * Possible values:
     *   - LINEAR: Uses linear regression algorithm for forecasting.
     *   - ML_AUTO: Automatically detects best algorithm to use for forecasting.
     *   - ML_NO_AUTO: Automatically detects seasonality of the data for forecasting using linear or seasonal algorithm.
     *
     **/
    public enum ForecastModel {
        Linear("LINEAR"),
        MlAuto("ML_AUTO"),
        MlNoAuto("ML_NO_AUTO"),
        ;

        private final String value;
        private static java.util.Map<String, ForecastModel> map;

        static {
            map = new java.util.HashMap<>();
            for (ForecastModel v : ForecastModel.values()) {
                map.put(v.getValue(), v);
            }
        }

        ForecastModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ForecastModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ForecastModel: " + key);
        }
    };
    /**
     * Filter by one or more cdb name.
     *
     */
    private java.util.List<String> cdbName;

    /**
     * Filter by hostname.
     *
     */
    private java.util.List<String> hostName;

    /**
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * This parameter is used to change data's confidence level, this data is ingested by the
     * forecast algorithm.
     * Confidence is the probability of an interval to contain the expected population parameter.
     * Manipulation of this value will lead to different results.
     * If not set, default confidence value is 95%.
     *
     */
    private Integer confidence;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /**
     * The order in which resource Forecast trend records are listed
     */
    private SortBy sortBy;

    /**
     * The order in which resource Forecast trend records are listed
     **/
    public enum SortBy {
        Id("id"),
        Name("name"),
        DaysToReachCapacity("daysToReachCapacity"),
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
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeExadataInsightResourceForecastTrendRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> databaseInsightId = null;

        /**
         * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @return this builder instance
         */
        public Builder databaseInsightId(java.util.List<String> databaseInsightId) {
            this.databaseInsightId = databaseInsightId;
            return this;
        }

        /**
         * Singular setter. Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @return this builder instance
         */
        public Builder databaseInsightId(String singularValue) {
            return this.databaseInsightId(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> hostInsightId = null;

        /**
         * Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @return this builder instance
         */
        public Builder hostInsightId(java.util.List<String> hostInsightId) {
            this.hostInsightId = hostInsightId;
            return this;
        }

        /**
         * Singular setter. Optional list of host insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @return this builder instance
         */
        public Builder hostInsightId(String singularValue) {
            return this.hostInsightId(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> storageServerName = null;

        /**
         * Optional storage server name on an exadata system.
         *
         * @return this builder instance
         */
        public Builder storageServerName(java.util.List<String> storageServerName) {
            this.storageServerName = storageServerName;
            return this;
        }

        /**
         * Singular setter. Optional storage server name on an exadata system.
         *
         * @return this builder instance
         */
        public Builder storageServerName(String singularValue) {
            return this.storageServerName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> exadataType = null;

        /**
         * Filter by one or more Exadata types.
         * Possible value are DBMACHINE, EXACS, and EXACC.
         *
         * @return this builder instance
         */
        public Builder exadataType(java.util.List<String> exadataType) {
            this.exadataType = exadataType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more Exadata types.
         * Possible value are DBMACHINE, EXACS, and EXACC.
         *
         * @return this builder instance
         */
        public Builder exadataType(String singularValue) {
            return this.exadataType(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> cdbName = null;

        /**
         * Filter by one or more cdb name.
         *
         * @return this builder instance
         */
        public Builder cdbName(java.util.List<String> cdbName) {
            this.cdbName = cdbName;
            return this;
        }

        /**
         * Singular setter. Filter by one or more cdb name.
         *
         * @return this builder instance
         */
        public Builder cdbName(String singularValue) {
            return this.cdbName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> hostName = null;

        /**
         * Filter by hostname.
         *
         * @return this builder instance
         */
        public Builder hostName(java.util.List<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Singular setter. Filter by hostname.
         *
         * @return this builder instance
         */
        public Builder hostName(String singularValue) {
            return this.hostName(java.util.Arrays.asList(singularValue));
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
        public Builder copy(SummarizeExadataInsightResourceForecastTrendRequest o) {
            resourceType(o.getResourceType());
            resourceMetric(o.getResourceMetric());
            exadataInsightId(o.getExadataInsightId());
            analysisTimeInterval(o.getAnalysisTimeInterval());
            timeIntervalStart(o.getTimeIntervalStart());
            timeIntervalEnd(o.getTimeIntervalEnd());
            databaseInsightId(o.getDatabaseInsightId());
            hostInsightId(o.getHostInsightId());
            storageServerName(o.getStorageServerName());
            exadataType(o.getExadataType());
            statistic(o.getStatistic());
            forecastStartDay(o.getForecastStartDay());
            forecastDays(o.getForecastDays());
            forecastModel(o.getForecastModel());
            cdbName(o.getCdbName());
            hostName(o.getHostName());
            limit(o.getLimit());
            confidence(o.getConfidence());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeExadataInsightResourceForecastTrendRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeExadataInsightResourceForecastTrendRequest
         */
        public SummarizeExadataInsightResourceForecastTrendRequest build() {
            SummarizeExadataInsightResourceForecastTrendRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
