/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/** Supported resources for actionable insights content type. */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public enum ActionableInsightsContentTypesResource implements com.oracle.bmc.http.internal.BmcEnum {
    NewHighs("NEW_HIGHS"),
    BigChanges("BIG_CHANGES"),
    CurrentInventory("CURRENT_INVENTORY"),
    InventoryChanges("INVENTORY_CHANGES"),
    FleetStatistics("FLEET_STATISTICS"),
    FleetAnalysisSummaryDbCount("FLEET_ANALYSIS_SUMMARY_DB_COUNT"),
    FleetAnalysisSummarySqlAnalyzedCount("FLEET_ANALYSIS_SUMMARY_SQL_ANALYZED_COUNT"),
    FleetAnalysisSummaryNewSqlCount("FLEET_ANALYSIS_SUMMARY_NEW_SQL_COUNT"),
    FleetAnalysisSummaryBusiestDb("FLEET_ANALYSIS_SUMMARY_BUSIEST_DB"),
    FleetAnalysisDegradingSqlCount("FLEET_ANALYSIS_DEGRADING_SQL_COUNT"),
    FleetAnalysisDegradingSqlByDb("FLEET_ANALYSIS_DEGRADING_SQL_BY_DB"),
    FleetAnalysisDegradingSqlBySqlId("FLEET_ANALYSIS_DEGRADING_SQL_BY_SQL_ID"),
    FleetAnalysisPlanChangesCount("FLEET_ANALYSIS_PLAN_CHANGES_COUNT"),
    FleetAnalysisPlanChangesDbMostChanges("FLEET_ANALYSIS_PLAN_CHANGES_DB_MOST_CHANGES"),
    FleetAnalysisPlanChangesBySqlIdImproved("FLEET_ANALYSIS_PLAN_CHANGES_BY_SQL_ID_IMPROVED"),
    FleetAnalysisPlanChangesBySqlIdDegraded("FLEET_ANALYSIS_PLAN_CHANGES_BY_SQL_ID_DEGRADED"),
    FleetAnalysisInvalidationStormsCount("FLEET_ANALYSIS_INVALIDATION_STORMS_COUNT"),
    FleetAnalysisInvalidationStormsHighest("FLEET_ANALYSIS_INVALIDATION_STORMS_HIGHEST"),
    FleetAnalysisCursorSharingIssuesCount("FLEET_ANALYSIS_CURSOR_SHARING_ISSUES_COUNT"),
    FleetAnalysisCursorSharingIssuesByDb("FLEET_ANALYSIS_CURSOR_SHARING_ISSUES_BY_DB"),
    FleetAnalysisCursorSharingIssuesBySql("FLEET_ANALYSIS_CURSOR_SHARING_ISSUES_BY_SQL"),
    PerformanceDegradationSummaryDbCount("PERFORMANCE_DEGRADATION_SUMMARY_DB_COUNT"),
    PerformanceDegradationSummarySqlAnalyzedCount(
            "PERFORMANCE_DEGRADATION_SUMMARY_SQL_ANALYZED_COUNT"),
    PerformanceDegradationSummarySqlPerformanceTrendsCount(
            "PERFORMANCE_DEGRADATION_SUMMARY_SQL_PERFORMANCE_TRENDS_COUNT"),
    PerformanceDegradationSummaryDegradedSqlCount(
            "PERFORMANCE_DEGRADATION_SUMMARY_DEGRADED_SQL_COUNT"),
    PerformanceDegradationSummaryImprovedSqlCount(
            "PERFORMANCE_DEGRADATION_SUMMARY_IMPROVED_SQL_COUNT"),
    PerformanceDegradationDbDegradedCount("PERFORMANCE_DEGRADATION_DB_DEGRADED_COUNT"),
    PerformanceDegradationSqlDegradedTable("PERFORMANCE_DEGRADATION_SQL_DEGRADED_TABLE"),
    PlanChangesSummaryDbCount("PLAN_CHANGES_SUMMARY_DB_COUNT"),
    PlanChangesSummarySqlAnalyzedCount("PLAN_CHANGES_SUMMARY_SQL_ANALYZED_COUNT"),
    PlanChangesSummaryPlanChangesCount("PLAN_CHANGES_SUMMARY_PLAN_CHANGES_COUNT"),
    PlanChangesSummaryImprovementsCount("PLAN_CHANGES_SUMMARY_IMPROVEMENTS_COUNT"),
    PlanChangesSummaryDegradationCount("PLAN_CHANGES_SUMMARY_DEGRADATION_COUNT"),
    PlanChangesTopPlanChangesTable("PLAN_CHANGES_TOP_PLAN_CHANGES_TABLE"),
    TopDbSummaryDbCount("TOP_DB_SUMMARY_DB_COUNT"),
    TopDbSummarySqlAnalyzedCount("TOP_DB_SUMMARY_SQL_ANALYZED_COUNT"),
    TopDbSummaryBusiestDb("TOP_DB_SUMMARY_BUSIEST_DB"),
    TopTable("TOP_TABLE"),
    CollectionDelayCount("COLLECTION_DELAY_COUNT"),
    CollectionDelayPreviousWeekCount("COLLECTION_DELAY_PREVIOUS_WEEK_COUNT"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ActionableInsightsContentTypesResource.class);

    private final String value;
    private static java.util.Map<String, ActionableInsightsContentTypesResource> map;

    static {
        map = new java.util.HashMap<>();
        for (ActionableInsightsContentTypesResource v :
                ActionableInsightsContentTypesResource.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    ActionableInsightsContentTypesResource(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static ActionableInsightsContentTypesResource create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'ActionableInsightsContentTypesResource', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
