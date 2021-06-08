/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceForecastTrendExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeDatabaseInsightResourceForecastTrendRequest.
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
public class SummarizeDatabaseInsightResourceForecastTrendRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * Filter by resource metric.
     * Supported values are CPU , STORAGE, MEMORY and IO.
     *
     */
    private String resourceMetric;

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
     * Filter by one or more database type.
     * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
     *
     */
    private java.util.List<DatabaseType> databaseType;

    /**
     * Filter by one or more database type.
     * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
     *
     **/
    public enum DatabaseType {
        AdwS("ADW-S"),
        AtpS("ATP-S"),
        AdwD("ADW-D"),
        AtpD("ATP-D"),
        ExternalPdb("EXTERNAL-PDB"),
        ExternalNoncdb("EXTERNAL-NONCDB"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseType> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseType v : DatabaseType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DatabaseType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DatabaseType: " + key);
        }
    };
    /**
     * Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    private java.util.List<String> databaseId;

    /**
     * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database insight resource.
     *
     */
    private java.util.List<String> id;

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
     * Filter by utilization level by the following buckets:
     *   - HIGH_UTILIZATION: DBs with utilization greater or equal than 75.
     *   - LOW_UTILIZATION: DBs with utilization lower than 25.
     *   - MEDIUM_HIGH_UTILIZATION: DBs with utilization greater or equal than 50 but lower than 75.
     *   - MEDIUM_LOW_UTILIZATION: DBs with utilization greater or equal than 25 but lower than 50.
     *
     */
    private UtilizationLevel utilizationLevel;

    /**
     * Filter by utilization level by the following buckets:
     *   - HIGH_UTILIZATION: DBs with utilization greater or equal than 75.
     *   - LOW_UTILIZATION: DBs with utilization lower than 25.
     *   - MEDIUM_HIGH_UTILIZATION: DBs with utilization greater or equal than 50 but lower than 75.
     *   - MEDIUM_LOW_UTILIZATION: DBs with utilization greater or equal than 25 but lower than 50.
     *
     **/
    public enum UtilizationLevel {
        HighUtilization("HIGH_UTILIZATION"),
        LowUtilization("LOW_UTILIZATION"),
        MediumHighUtilization("MEDIUM_HIGH_UTILIZATION"),
        MediumLowUtilization("MEDIUM_LOW_UTILIZATION"),
        ;

        private final String value;
        private static java.util.Map<String, UtilizationLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (UtilizationLevel v : UtilizationLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        UtilizationLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UtilizationLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UtilizationLevel: " + key);
        }
    };
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
     * For list pagination. The value of the `opc-next-page` response header from
     * the previous \"List\" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * Filter by one or more hostname.
     *
     */
    private java.util.List<String> hostName;

    /**
     * Tablespace name for a database
     *
     */
    private String tablespaceName;

    /**
     * Flag to indicate if database instance level metrics should be returned. The flag is ignored when a host name filter is not applied.
     * When a hostname filter is applied this flag will determine whether to return metrics for the instances located on the specified host or for the
     * whole database which contains an instance on this host.
     *
     */
    private Boolean isDatabaseInstanceLevelMetrics;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeDatabaseInsightResourceForecastTrendRequest, java.lang.Void> {
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
        public Builder copy(SummarizeDatabaseInsightResourceForecastTrendRequest o) {
            compartmentId(o.getCompartmentId());
            resourceMetric(o.getResourceMetric());
            analysisTimeInterval(o.getAnalysisTimeInterval());
            timeIntervalStart(o.getTimeIntervalStart());
            timeIntervalEnd(o.getTimeIntervalEnd());
            databaseType(o.getDatabaseType());
            databaseId(o.getDatabaseId());
            id(o.getId());
            statistic(o.getStatistic());
            forecastDays(o.getForecastDays());
            forecastModel(o.getForecastModel());
            utilizationLevel(o.getUtilizationLevel());
            confidence(o.getConfidence());
            page(o.getPage());
            hostName(o.getHostName());
            tablespaceName(o.getTablespaceName());
            isDatabaseInstanceLevelMetrics(o.getIsDatabaseInstanceLevelMetrics());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeDatabaseInsightResourceForecastTrendRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeDatabaseInsightResourceForecastTrendRequest
         */
        public SummarizeDatabaseInsightResourceForecastTrendRequest build() {
            SummarizeDatabaseInsightResourceForecastTrendRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
