/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeSqlStatisticsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeSqlStatisticsRequest.
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
public class SummarizeSqlStatisticsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

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
     * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> id;

    /**
     * Filter by one or more hostname.
     *
     */
    private java.util.List<String> hostName;

    /**
     * Filter sqls by percentage of db time.
     *
     */
    private Double databaseTimePctGreaterThan;

    /**
     * One or more unique SQL_IDs for a SQL Statement.
     * Example: {@code 6rgjh9bjmy2s7}
     *
     */
    private java.util.List<String> sqlIdentifier;

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
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    private Integer limit;

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

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /**
     * The field to use when sorting SQL statistics.
     * Example: databaseTimeInSec
     *
     */
    private SortBy sortBy;

    /**
     * The field to use when sorting SQL statistics.
     * Example: databaseTimeInSec
     *
     **/
    public enum SortBy {
        DatabaseTimeInSec("databaseTimeInSec"),
        ExecutionsPerHour("executionsPerHour"),
        ExecutionsCount("executionsCount"),
        CpuTimeInSec("cpuTimeInSec"),
        IoTimeInSec("ioTimeInSec"),
        InefficientWaitTimeInSec("inefficientWaitTimeInSec"),
        ResponseTimeInSec("responseTimeInSec"),
        PlanCount("planCount"),
        Variability("variability"),
        AverageActiveSessions("averageActiveSessions"),
        DatabaseTimePct("databaseTimePct"),
        InefficiencyInPct("inefficiencyInPct"),
        ChangeInCpuTimeInPct("changeInCpuTimeInPct"),
        ChangeInIoTimeInPct("changeInIoTimeInPct"),
        ChangeInInefficientWaitTimeInPct("changeInInefficientWaitTimeInPct"),
        ChangeInResponseTimeInPct("changeInResponseTimeInPct"),
        ChangeInAverageActiveSessionsInPct("changeInAverageActiveSessionsInPct"),
        ChangeInExecutionsPerHourInPct("changeInExecutionsPerHourInPct"),
        ChangeInInefficiencyInPct("changeInInefficiencyInPct"),
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
     * Filter sqls by one or more performance categories.
     *
     */
    private java.util.List<Category> category;

    /**
     * Filter sqls by one or more performance categories.
     *
     **/
    public enum Category {
        Degrading("DEGRADING"),
        Variant("VARIANT"),
        Inefficient("INEFFICIENT"),
        ChangingPlans("CHANGING_PLANS"),
        Improving("IMPROVING"),
        DegradingVariant("DEGRADING_VARIANT"),
        DegradingInefficient("DEGRADING_INEFFICIENT"),
        DegradingChangingPlans("DEGRADING_CHANGING_PLANS"),
        DegradingIncreasingIo("DEGRADING_INCREASING_IO"),
        DegradingIncreasingCpu("DEGRADING_INCREASING_CPU"),
        DegradingIncreasingInefficientWait("DEGRADING_INCREASING_INEFFICIENT_WAIT"),
        DegradingChangingPlansAndIncreasingIo("DEGRADING_CHANGING_PLANS_AND_INCREASING_IO"),
        DegradingChangingPlansAndIncreasingCpu("DEGRADING_CHANGING_PLANS_AND_INCREASING_CPU"),
        DegradingChangingPlansAndIncreasingInefficientWait(
                "DEGRADING_CHANGING_PLANS_AND_INCREASING_INEFFICIENT_WAIT"),
        VariantInefficient("VARIANT_INEFFICIENT"),
        VariantChangingPlans("VARIANT_CHANGING_PLANS"),
        VariantIncreasingIo("VARIANT_INCREASING_IO"),
        VariantIncreasingCpu("VARIANT_INCREASING_CPU"),
        VariantIncreasingInefficientWait("VARIANT_INCREASING_INEFFICIENT_WAIT"),
        VariantChangingPlansAndIncreasingIo("VARIANT_CHANGING_PLANS_AND_INCREASING_IO"),
        VariantChangingPlansAndIncreasingCpu("VARIANT_CHANGING_PLANS_AND_INCREASING_CPU"),
        VariantChangingPlansAndIncreasingInefficientWait(
                "VARIANT_CHANGING_PLANS_AND_INCREASING_INEFFICIENT_WAIT"),
        InefficientChangingPlans("INEFFICIENT_CHANGING_PLANS"),
        InefficientIncreasingInefficientWait("INEFFICIENT_INCREASING_INEFFICIENT_WAIT"),
        InefficientChangingPlansAndIncreasingInefficientWait(
                "INEFFICIENT_CHANGING_PLANS_AND_INCREASING_INEFFICIENT_WAIT"),
        ;

        private final String value;
        private static java.util.Map<String, Category> map;

        static {
            map = new java.util.HashMap<>();
            for (Category v : Category.values()) {
                map.put(v.getValue(), v);
            }
        }

        Category(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Category create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Category: " + key);
        }
    };
    /**
     * A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
     * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     */
    private java.util.List<String> definedTagEquals;

    /**
     * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
     * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
     *
     */
    private java.util.List<String> freeformTagEquals;

    /**
     * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be returned.
     * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
     * or "{namespace}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     */
    private java.util.List<String> definedTagExists;

    /**
     * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
     * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for different tag names are interpreted as "AND".
     *
     */
    private java.util.List<String> freeformTagExists;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeSqlStatisticsRequest, java.lang.Void> {
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
        public Builder copy(SummarizeSqlStatisticsRequest o) {
            compartmentId(o.getCompartmentId());
            databaseType(o.getDatabaseType());
            databaseId(o.getDatabaseId());
            id(o.getId());
            hostName(o.getHostName());
            databaseTimePctGreaterThan(o.getDatabaseTimePctGreaterThan());
            sqlIdentifier(o.getSqlIdentifier());
            analysisTimeInterval(o.getAnalysisTimeInterval());
            timeIntervalStart(o.getTimeIntervalStart());
            timeIntervalEnd(o.getTimeIntervalEnd());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            category(o.getCategory());
            definedTagEquals(o.getDefinedTagEquals());
            freeformTagEquals(o.getFreeformTagEquals());
            definedTagExists(o.getDefinedTagExists());
            freeformTagExists(o.getFreeformTagExists());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeSqlStatisticsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeSqlStatisticsRequest
         */
        public SummarizeSqlStatisticsRequest build() {
            SummarizeSqlStatisticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
