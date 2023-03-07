/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceForecastTrendExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeDatabaseInsightResourceForecastTrendRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeDatabaseInsightResourceForecastTrendRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Filter by resource metric. Supported values are CPU , STORAGE, MEMORY and IO. */
    private String resourceMetric;

    /** Filter by resource metric. Supported values are CPU , STORAGE, MEMORY and IO. */
    public String getResourceMetric() {
        return resourceMetric;
    }
    /**
     * Specify time period in ISO 8601 format with respect to current time. Default is last 30 days
     * represented by P30D. If timeInterval is specified, then timeIntervalStart and timeIntervalEnd
     * will be ignored. Examples P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y
     * (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
     */
    private String analysisTimeInterval;

    /**
     * Specify time period in ISO 8601 format with respect to current time. Default is last 30 days
     * represented by P30D. If timeInterval is specified, then timeIntervalStart and timeIntervalEnd
     * will be ignored. Examples P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y
     * (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
     */
    public String getAnalysisTimeInterval() {
        return analysisTimeInterval;
    }
    /**
     * Analysis start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z
     * (yyyy-MM-ddThh:mm:ssZ). The minimum allowed value is 2 years prior to the current day.
     * timeIntervalStart and timeIntervalEnd parameters are used together. If analysisTimeInterval
     * is specified, this parameter is ignored.
     */
    private java.util.Date timeIntervalStart;

    /**
     * Analysis start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z
     * (yyyy-MM-ddThh:mm:ssZ). The minimum allowed value is 2 years prior to the current day.
     * timeIntervalStart and timeIntervalEnd parameters are used together. If analysisTimeInterval
     * is specified, this parameter is ignored.
     */
    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }
    /**
     * Analysis end time in UTC in ISO 8601 format(exclusive). Example 2019-10-30T00:00:00Z
     * (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd are used together. If
     * timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
     */
    private java.util.Date timeIntervalEnd;

    /**
     * Analysis end time in UTC in ISO 8601 format(exclusive). Example 2019-10-30T00:00:00Z
     * (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd are used together. If
     * timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
     */
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }
    /**
     * Filter by one or more database type. Possible values are ADW-S, ATP-S, ADW-D, ATP-D,
     * EXTERNAL-PDB, EXTERNAL-NONCDB.
     */
    private java.util.List<DatabaseType> databaseType;

    /**
     * Filter by one or more database type. Possible values are ADW-S, ATP-S, ADW-D, ATP-D,
     * EXTERNAL-PDB, EXTERNAL-NONCDB.
     */
    public enum DatabaseType implements com.oracle.bmc.http.internal.BmcEnum {
        AdwS("ADW-S"),
        AtpS("ATP-S"),
        AdwD("ADW-D"),
        AtpD("ATP-D"),
        ExternalPdb("EXTERNAL-PDB"),
        ExternalNoncdb("EXTERNAL-NONCDB"),
        ComanagedVmCdb("COMANAGED-VM-CDB"),
        ComanagedVmPdb("COMANAGED-VM-PDB"),
        ComanagedVmNoncdb("COMANAGED-VM-NONCDB"),
        ComanagedBmCdb("COMANAGED-BM-CDB"),
        ComanagedBmPdb("COMANAGED-BM-PDB"),
        ComanagedBmNoncdb("COMANAGED-BM-NONCDB"),
        ComanagedExacsCdb("COMANAGED-EXACS-CDB"),
        ComanagedExacsPdb("COMANAGED-EXACS-PDB"),
        ComanagedExacsNoncdb("COMANAGED-EXACS-NONCDB"),
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
     * Filter by one or more database type. Possible values are ADW-S, ATP-S, ADW-D, ATP-D,
     * EXTERNAL-PDB, EXTERNAL-NONCDB.
     */
    public java.util.List<DatabaseType> getDatabaseType() {
        return databaseType;
    }
    /**
     * Optional list of database
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated DBaaS entity.
     */
    private java.util.List<String> databaseId;

    /**
     * Optional list of database
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * associated DBaaS entity.
     */
    public java.util.List<String> getDatabaseId() {
        return databaseId;
    }
    /**
     * Optional list of database insight resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private java.util.List<String> id;

    /**
     * Optional list of database insight resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public java.util.List<String> getId() {
        return id;
    }
    /**
     * Optional list of exadata insight resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private java.util.List<String> exadataInsightId;

    /**
     * Optional list of exadata insight resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public java.util.List<String> getExadataInsightId() {
        return exadataInsightId;
    }
    /** Filter by one or more cdb name. */
    private java.util.List<String> cdbName;

    /** Filter by one or more cdb name. */
    public java.util.List<String> getCdbName() {
        return cdbName;
    }
    /** Choose the type of statistic metric data to be used for forecasting. */
    private Statistic statistic;

    /** Choose the type of statistic metric data to be used for forecasting. */
    public enum Statistic implements com.oracle.bmc.http.internal.BmcEnum {
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

    /** Choose the type of statistic metric data to be used for forecasting. */
    public Statistic getStatistic() {
        return statistic;
    }
    /** Number of days used for utilization forecast analysis. */
    private Integer forecastDays;

    /** Number of days used for utilization forecast analysis. */
    public Integer getForecastDays() {
        return forecastDays;
    }
    /**
     * Choose algorithm model for the forecasting. Possible values: - LINEAR: Uses linear regression
     * algorithm for forecasting. - ML_AUTO: Automatically detects best algorithm to use for
     * forecasting. - ML_NO_AUTO: Automatically detects seasonality of the data for forecasting
     * using linear or seasonal algorithm.
     */
    private ForecastModel forecastModel;

    /**
     * Choose algorithm model for the forecasting. Possible values: - LINEAR: Uses linear regression
     * algorithm for forecasting. - ML_AUTO: Automatically detects best algorithm to use for
     * forecasting. - ML_NO_AUTO: Automatically detects seasonality of the data for forecasting
     * using linear or seasonal algorithm.
     */
    public enum ForecastModel implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Choose algorithm model for the forecasting. Possible values: - LINEAR: Uses linear regression
     * algorithm for forecasting. - ML_AUTO: Automatically detects best algorithm to use for
     * forecasting. - ML_NO_AUTO: Automatically detects seasonality of the data for forecasting
     * using linear or seasonal algorithm.
     */
    public ForecastModel getForecastModel() {
        return forecastModel;
    }
    /**
     * Filter by utilization level by the following buckets: - HIGH_UTILIZATION: DBs with
     * utilization greater or equal than 75. - LOW_UTILIZATION: DBs with utilization lower than 25.
     * - MEDIUM_HIGH_UTILIZATION: DBs with utilization greater or equal than 50 but lower than 75. -
     * MEDIUM_LOW_UTILIZATION: DBs with utilization greater or equal than 25 but lower than 50.
     */
    private UtilizationLevel utilizationLevel;

    /**
     * Filter by utilization level by the following buckets: - HIGH_UTILIZATION: DBs with
     * utilization greater or equal than 75. - LOW_UTILIZATION: DBs with utilization lower than 25.
     * - MEDIUM_HIGH_UTILIZATION: DBs with utilization greater or equal than 50 but lower than 75. -
     * MEDIUM_LOW_UTILIZATION: DBs with utilization greater or equal than 25 but lower than 50.
     */
    public enum UtilizationLevel implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Filter by utilization level by the following buckets: - HIGH_UTILIZATION: DBs with
     * utilization greater or equal than 75. - LOW_UTILIZATION: DBs with utilization lower than 25.
     * - MEDIUM_HIGH_UTILIZATION: DBs with utilization greater or equal than 50 but lower than 75. -
     * MEDIUM_LOW_UTILIZATION: DBs with utilization greater or equal than 25 but lower than 50.
     */
    public UtilizationLevel getUtilizationLevel() {
        return utilizationLevel;
    }
    /**
     * This parameter is used to change data's confidence level, this data is ingested by the
     * forecast algorithm. Confidence is the probability of an interval to contain the expected
     * population parameter. Manipulation of this value will lead to different results. If not set,
     * default confidence value is 95%.
     */
    private Integer confidence;

    /**
     * This parameter is used to change data's confidence level, this data is ingested by the
     * forecast algorithm. Confidence is the probability of an interval to contain the expected
     * population parameter. Manipulation of this value will lead to different results. If not set,
     * default confidence value is 95%.
     */
    public Integer getConfidence() {
        return confidence;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** Filter by one or more hostname. */
    private java.util.List<String> hostName;

    /** Filter by one or more hostname. */
    public java.util.List<String> getHostName() {
        return hostName;
    }
    /** Tablespace name for a database */
    private String tablespaceName;

    /** Tablespace name for a database */
    public String getTablespaceName() {
        return tablespaceName;
    }
    /**
     * Flag to indicate if database instance level metrics should be returned. The flag is ignored
     * when a host name filter is not applied. When a hostname filter is applied this flag will
     * determine whether to return metrics for the instances located on the specified host or for
     * the whole database which contains an instance on this host.
     */
    private Boolean isDatabaseInstanceLevelMetrics;

    /**
     * Flag to indicate if database instance level metrics should be returned. The flag is ignored
     * when a host name filter is not applied. When a hostname filter is applied this flag will
     * determine whether to return metrics for the instances located on the specified host or for
     * the whole database which contains an instance on this host.
     */
    public Boolean getIsDatabaseInstanceLevelMetrics() {
        return isDatabaseInstanceLevelMetrics;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A list of tag filters to apply. Only resources with a defined tag matching the value will be
     * returned. Each item in the list has the format "{namespace}.{tagName}.{value}". All inputs
     * are case-insensitive. Multiple values for the same key (i.e. same namespace and tag name) are
     * interpreted as "OR". Values for different keys (i.e. different namespaces, different tag
     * names, or both) are interpreted as "AND".
     */
    private java.util.List<String> definedTagEquals;

    /**
     * A list of tag filters to apply. Only resources with a defined tag matching the value will be
     * returned. Each item in the list has the format "{namespace}.{tagName}.{value}". All inputs
     * are case-insensitive. Multiple values for the same key (i.e. same namespace and tag name) are
     * interpreted as "OR". Values for different keys (i.e. different namespaces, different tag
     * names, or both) are interpreted as "AND".
     */
    public java.util.List<String> getDefinedTagEquals() {
        return definedTagEquals;
    }
    /**
     * A list of tag filters to apply. Only resources with a freeform tag matching the value will be
     * returned. The key for each tag is "{tagName}.{value}". All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR". Values for different tag names
     * are interpreted as "AND".
     */
    private java.util.List<String> freeformTagEquals;

    /**
     * A list of tag filters to apply. Only resources with a freeform tag matching the value will be
     * returned. The key for each tag is "{tagName}.{value}". All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR". Values for different tag names
     * are interpreted as "AND".
     */
    public java.util.List<String> getFreeformTagEquals() {
        return freeformTagEquals;
    }
    /**
     * A list of tag existence filters to apply. Only resources for which the specified defined tags
     * exist will be returned. Each item in the list has the format "{namespace}.{tagName}.true"
     * (for checking existence of a defined tag) or "{namespace}.true". All inputs are
     * case-insensitive. Currently, only existence ("true" at the end) is supported. Absence
     * ("false" at the end) is not supported. Multiple values for the same key (i.e. same namespace
     * and tag name) are interpreted as "OR". Values for different keys (i.e. different namespaces,
     * different tag names, or both) are interpreted as "AND".
     */
    private java.util.List<String> definedTagExists;

    /**
     * A list of tag existence filters to apply. Only resources for which the specified defined tags
     * exist will be returned. Each item in the list has the format "{namespace}.{tagName}.true"
     * (for checking existence of a defined tag) or "{namespace}.true". All inputs are
     * case-insensitive. Currently, only existence ("true" at the end) is supported. Absence
     * ("false" at the end) is not supported. Multiple values for the same key (i.e. same namespace
     * and tag name) are interpreted as "OR". Values for different keys (i.e. different namespaces,
     * different tag names, or both) are interpreted as "AND".
     */
    public java.util.List<String> getDefinedTagExists() {
        return definedTagExists;
    }
    /**
     * A list of tag existence filters to apply. Only resources for which the specified freeform
     * tags exist the value will be returned. The key for each tag is "{tagName}.true". All inputs
     * are case-insensitive. Currently, only existence ("true" at the end) is supported. Absence
     * ("false" at the end) is not supported. Multiple values for different tag names are
     * interpreted as "AND".
     */
    private java.util.List<String> freeformTagExists;

    /**
     * A list of tag existence filters to apply. Only resources for which the specified freeform
     * tags exist the value will be returned. The key for each tag is "{tagName}.true". All inputs
     * are case-insensitive. Currently, only existence ("true" at the end) is supported. Absence
     * ("false" at the end) is not supported. Multiple values for different tag names are
     * interpreted as "AND".
     */
    public java.util.List<String> getFreeformTagExists() {
        return freeformTagExists;
    }
    /** A flag to search all resources within a given compartment and all sub-compartments. */
    private Boolean compartmentIdInSubtree;

    /** A flag to search all resources within a given compartment and all sub-compartments. */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /** Optional list of Exadata Insight VM cluster name. */
    private java.util.List<String> vmclusterName;

    /** Optional list of Exadata Insight VM cluster name. */
    public java.util.List<String> getVmclusterName() {
        return vmclusterName;
    }
    /** Percent value in which a resource metric is considered highly utilized. */
    private Integer highUtilizationThreshold;

    /** Percent value in which a resource metric is considered highly utilized. */
    public Integer getHighUtilizationThreshold() {
        return highUtilizationThreshold;
    }
    /** Percent value in which a resource metric is considered low utilized. */
    private Integer lowUtilizationThreshold;

    /** Percent value in which a resource metric is considered low utilized. */
    public Integer getLowUtilizationThreshold() {
        return lowUtilizationThreshold;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeDatabaseInsightResourceForecastTrendRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Filter by resource metric. Supported values are CPU , STORAGE, MEMORY and IO. */
        private String resourceMetric = null;

        /**
         * Filter by resource metric. Supported values are CPU , STORAGE, MEMORY and IO.
         *
         * @param resourceMetric the value to set
         * @return this builder instance
         */
        public Builder resourceMetric(String resourceMetric) {
            this.resourceMetric = resourceMetric;
            return this;
        }

        /**
         * Specify time period in ISO 8601 format with respect to current time. Default is last 30
         * days represented by P30D. If timeInterval is specified, then timeIntervalStart and
         * timeIntervalEnd will be ignored. Examples P90D (last 90 days), P4W (last 4 weeks), P2M
         * (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to
         * current time (P25M).
         */
        private String analysisTimeInterval = null;

        /**
         * Specify time period in ISO 8601 format with respect to current time. Default is last 30
         * days represented by P30D. If timeInterval is specified, then timeIntervalStart and
         * timeIntervalEnd will be ignored. Examples P90D (last 90 days), P4W (last 4 weeks), P2M
         * (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to
         * current time (P25M).
         *
         * @param analysisTimeInterval the value to set
         * @return this builder instance
         */
        public Builder analysisTimeInterval(String analysisTimeInterval) {
            this.analysisTimeInterval = analysisTimeInterval;
            return this;
        }

        /**
         * Analysis start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z
         * (yyyy-MM-ddThh:mm:ssZ). The minimum allowed value is 2 years prior to the current day.
         * timeIntervalStart and timeIntervalEnd parameters are used together. If
         * analysisTimeInterval is specified, this parameter is ignored.
         */
        private java.util.Date timeIntervalStart = null;

        /**
         * Analysis start time in UTC in ISO 8601 format(inclusive). Example 2019-10-30T00:00:00Z
         * (yyyy-MM-ddThh:mm:ssZ). The minimum allowed value is 2 years prior to the current day.
         * timeIntervalStart and timeIntervalEnd parameters are used together. If
         * analysisTimeInterval is specified, this parameter is ignored.
         *
         * @param timeIntervalStart the value to set
         * @return this builder instance
         */
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            return this;
        }

        /**
         * Analysis end time in UTC in ISO 8601 format(exclusive). Example 2019-10-30T00:00:00Z
         * (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd are used together. If
         * timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
         */
        private java.util.Date timeIntervalEnd = null;

        /**
         * Analysis end time in UTC in ISO 8601 format(exclusive). Example 2019-10-30T00:00:00Z
         * (yyyy-MM-ddThh:mm:ssZ). timeIntervalStart and timeIntervalEnd are used together. If
         * timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
         *
         * @param timeIntervalEnd the value to set
         * @return this builder instance
         */
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            return this;
        }

        /**
         * Filter by one or more database type. Possible values are ADW-S, ATP-S, ADW-D, ATP-D,
         * EXTERNAL-PDB, EXTERNAL-NONCDB.
         */
        private java.util.List<DatabaseType> databaseType = null;

        /**
         * Filter by one or more database type. Possible values are ADW-S, ATP-S, ADW-D, ATP-D,
         * EXTERNAL-PDB, EXTERNAL-NONCDB.
         *
         * @param databaseType the value to set
         * @return this builder instance
         */
        public Builder databaseType(java.util.List<DatabaseType> databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more database type. Possible values are ADW-S, ATP-S,
         * ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder databaseType(DatabaseType singularValue) {
            return this.databaseType(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional list of database
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the associated DBaaS entity.
         */
        private java.util.List<String> databaseId = null;

        /**
         * Optional list of database
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the associated DBaaS entity.
         *
         * @param databaseId the value to set
         * @return this builder instance
         */
        public Builder databaseId(java.util.List<String> databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * Singular setter. Optional list of database
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the associated DBaaS entity.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder databaseId(String singularValue) {
            return this.databaseId(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional list of database insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private java.util.List<String> id = null;

        /**
         * Optional list of database insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(java.util.List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Singular setter. Optional list of database insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder id(String singularValue) {
            return this.id(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional list of exadata insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private java.util.List<String> exadataInsightId = null;

        /**
         * Optional list of exadata insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param exadataInsightId the value to set
         * @return this builder instance
         */
        public Builder exadataInsightId(java.util.List<String> exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            return this;
        }

        /**
         * Singular setter. Optional list of exadata insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder exadataInsightId(String singularValue) {
            return this.exadataInsightId(java.util.Arrays.asList(singularValue));
        }

        /** Filter by one or more cdb name. */
        private java.util.List<String> cdbName = null;

        /**
         * Filter by one or more cdb name.
         *
         * @param cdbName the value to set
         * @return this builder instance
         */
        public Builder cdbName(java.util.List<String> cdbName) {
            this.cdbName = cdbName;
            return this;
        }

        /**
         * Singular setter. Filter by one or more cdb name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder cdbName(String singularValue) {
            return this.cdbName(java.util.Arrays.asList(singularValue));
        }

        /** Choose the type of statistic metric data to be used for forecasting. */
        private Statistic statistic = null;

        /**
         * Choose the type of statistic metric data to be used for forecasting.
         *
         * @param statistic the value to set
         * @return this builder instance
         */
        public Builder statistic(Statistic statistic) {
            this.statistic = statistic;
            return this;
        }

        /** Number of days used for utilization forecast analysis. */
        private Integer forecastDays = null;

        /**
         * Number of days used for utilization forecast analysis.
         *
         * @param forecastDays the value to set
         * @return this builder instance
         */
        public Builder forecastDays(Integer forecastDays) {
            this.forecastDays = forecastDays;
            return this;
        }

        /**
         * Choose algorithm model for the forecasting. Possible values: - LINEAR: Uses linear
         * regression algorithm for forecasting. - ML_AUTO: Automatically detects best algorithm to
         * use for forecasting. - ML_NO_AUTO: Automatically detects seasonality of the data for
         * forecasting using linear or seasonal algorithm.
         */
        private ForecastModel forecastModel = null;

        /**
         * Choose algorithm model for the forecasting. Possible values: - LINEAR: Uses linear
         * regression algorithm for forecasting. - ML_AUTO: Automatically detects best algorithm to
         * use for forecasting. - ML_NO_AUTO: Automatically detects seasonality of the data for
         * forecasting using linear or seasonal algorithm.
         *
         * @param forecastModel the value to set
         * @return this builder instance
         */
        public Builder forecastModel(ForecastModel forecastModel) {
            this.forecastModel = forecastModel;
            return this;
        }

        /**
         * Filter by utilization level by the following buckets: - HIGH_UTILIZATION: DBs with
         * utilization greater or equal than 75. - LOW_UTILIZATION: DBs with utilization lower than
         * 25. - MEDIUM_HIGH_UTILIZATION: DBs with utilization greater or equal than 50 but lower
         * than 75. - MEDIUM_LOW_UTILIZATION: DBs with utilization greater or equal than 25 but
         * lower than 50.
         */
        private UtilizationLevel utilizationLevel = null;

        /**
         * Filter by utilization level by the following buckets: - HIGH_UTILIZATION: DBs with
         * utilization greater or equal than 75. - LOW_UTILIZATION: DBs with utilization lower than
         * 25. - MEDIUM_HIGH_UTILIZATION: DBs with utilization greater or equal than 50 but lower
         * than 75. - MEDIUM_LOW_UTILIZATION: DBs with utilization greater or equal than 25 but
         * lower than 50.
         *
         * @param utilizationLevel the value to set
         * @return this builder instance
         */
        public Builder utilizationLevel(UtilizationLevel utilizationLevel) {
            this.utilizationLevel = utilizationLevel;
            return this;
        }

        /**
         * This parameter is used to change data's confidence level, this data is ingested by the
         * forecast algorithm. Confidence is the probability of an interval to contain the expected
         * population parameter. Manipulation of this value will lead to different results. If not
         * set, default confidence value is 95%.
         */
        private Integer confidence = null;

        /**
         * This parameter is used to change data's confidence level, this data is ingested by the
         * forecast algorithm. Confidence is the probability of an interval to contain the expected
         * population parameter. Manipulation of this value will lead to different results. If not
         * set, default confidence value is 95%.
         *
         * @param confidence the value to set
         * @return this builder instance
         */
        public Builder confidence(Integer confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** Filter by one or more hostname. */
        private java.util.List<String> hostName = null;

        /**
         * Filter by one or more hostname.
         *
         * @param hostName the value to set
         * @return this builder instance
         */
        public Builder hostName(java.util.List<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Singular setter. Filter by one or more hostname.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder hostName(String singularValue) {
            return this.hostName(java.util.Arrays.asList(singularValue));
        }

        /** Tablespace name for a database */
        private String tablespaceName = null;

        /**
         * Tablespace name for a database
         *
         * @param tablespaceName the value to set
         * @return this builder instance
         */
        public Builder tablespaceName(String tablespaceName) {
            this.tablespaceName = tablespaceName;
            return this;
        }

        /**
         * Flag to indicate if database instance level metrics should be returned. The flag is
         * ignored when a host name filter is not applied. When a hostname filter is applied this
         * flag will determine whether to return metrics for the instances located on the specified
         * host or for the whole database which contains an instance on this host.
         */
        private Boolean isDatabaseInstanceLevelMetrics = null;

        /**
         * Flag to indicate if database instance level metrics should be returned. The flag is
         * ignored when a host name filter is not applied. When a hostname filter is applied this
         * flag will determine whether to return metrics for the instances located on the specified
         * host or for the whole database which contains an instance on this host.
         *
         * @param isDatabaseInstanceLevelMetrics the value to set
         * @return this builder instance
         */
        public Builder isDatabaseInstanceLevelMetrics(Boolean isDatabaseInstanceLevelMetrics) {
            this.isDatabaseInstanceLevelMetrics = isDatabaseInstanceLevelMetrics;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A list of tag filters to apply. Only resources with a defined tag matching the value will
         * be returned. Each item in the list has the format "{namespace}.{tagName}.{value}". All
         * inputs are case-insensitive. Multiple values for the same key (i.e. same namespace and
         * tag name) are interpreted as "OR". Values for different keys (i.e. different namespaces,
         * different tag names, or both) are interpreted as "AND".
         */
        private java.util.List<String> definedTagEquals = null;

        /**
         * A list of tag filters to apply. Only resources with a defined tag matching the value will
         * be returned. Each item in the list has the format "{namespace}.{tagName}.{value}". All
         * inputs are case-insensitive. Multiple values for the same key (i.e. same namespace and
         * tag name) are interpreted as "OR". Values for different keys (i.e. different namespaces,
         * different tag names, or both) are interpreted as "AND".
         *
         * @param definedTagEquals the value to set
         * @return this builder instance
         */
        public Builder definedTagEquals(java.util.List<String> definedTagEquals) {
            this.definedTagEquals = definedTagEquals;
            return this;
        }

        /**
         * Singular setter. A list of tag filters to apply. Only resources with a defined tag
         * matching the value will be returned. Each item in the list has the format
         * "{namespace}.{tagName}.{value}". All inputs are case-insensitive. Multiple values for the
         * same key (i.e. same namespace and tag name) are interpreted as "OR". Values for different
         * keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder definedTagEquals(String singularValue) {
            return this.definedTagEquals(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag filters to apply. Only resources with a freeform tag matching the value
         * will be returned. The key for each tag is "{tagName}.{value}". All inputs are
         * case-insensitive. Multiple values for the same tag name are interpreted as "OR". Values
         * for different tag names are interpreted as "AND".
         */
        private java.util.List<String> freeformTagEquals = null;

        /**
         * A list of tag filters to apply. Only resources with a freeform tag matching the value
         * will be returned. The key for each tag is "{tagName}.{value}". All inputs are
         * case-insensitive. Multiple values for the same tag name are interpreted as "OR". Values
         * for different tag names are interpreted as "AND".
         *
         * @param freeformTagEquals the value to set
         * @return this builder instance
         */
        public Builder freeformTagEquals(java.util.List<String> freeformTagEquals) {
            this.freeformTagEquals = freeformTagEquals;
            return this;
        }

        /**
         * Singular setter. A list of tag filters to apply. Only resources with a freeform tag
         * matching the value will be returned. The key for each tag is "{tagName}.{value}". All
         * inputs are case-insensitive. Multiple values for the same tag name are interpreted as
         * "OR". Values for different tag names are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder freeformTagEquals(String singularValue) {
            return this.freeformTagEquals(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag existence filters to apply. Only resources for which the specified defined
         * tags exist will be returned. Each item in the list has the format
         * "{namespace}.{tagName}.true" (for checking existence of a defined tag) or
         * "{namespace}.true". All inputs are case-insensitive. Currently, only existence ("true" at
         * the end) is supported. Absence ("false" at the end) is not supported. Multiple values for
         * the same key (i.e. same namespace and tag name) are interpreted as "OR". Values for
         * different keys (i.e. different namespaces, different tag names, or both) are interpreted
         * as "AND".
         */
        private java.util.List<String> definedTagExists = null;

        /**
         * A list of tag existence filters to apply. Only resources for which the specified defined
         * tags exist will be returned. Each item in the list has the format
         * "{namespace}.{tagName}.true" (for checking existence of a defined tag) or
         * "{namespace}.true". All inputs are case-insensitive. Currently, only existence ("true" at
         * the end) is supported. Absence ("false" at the end) is not supported. Multiple values for
         * the same key (i.e. same namespace and tag name) are interpreted as "OR". Values for
         * different keys (i.e. different namespaces, different tag names, or both) are interpreted
         * as "AND".
         *
         * @param definedTagExists the value to set
         * @return this builder instance
         */
        public Builder definedTagExists(java.util.List<String> definedTagExists) {
            this.definedTagExists = definedTagExists;
            return this;
        }

        /**
         * Singular setter. A list of tag existence filters to apply. Only resources for which the
         * specified defined tags exist will be returned. Each item in the list has the format
         * "{namespace}.{tagName}.true" (for checking existence of a defined tag) or
         * "{namespace}.true". All inputs are case-insensitive. Currently, only existence ("true" at
         * the end) is supported. Absence ("false" at the end) is not supported. Multiple values for
         * the same key (i.e. same namespace and tag name) are interpreted as "OR". Values for
         * different keys (i.e. different namespaces, different tag names, or both) are interpreted
         * as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder definedTagExists(String singularValue) {
            return this.definedTagExists(java.util.Arrays.asList(singularValue));
        }

        /**
         * A list of tag existence filters to apply. Only resources for which the specified freeform
         * tags exist the value will be returned. The key for each tag is "{tagName}.true". All
         * inputs are case-insensitive. Currently, only existence ("true" at the end) is supported.
         * Absence ("false" at the end) is not supported. Multiple values for different tag names
         * are interpreted as "AND".
         */
        private java.util.List<String> freeformTagExists = null;

        /**
         * A list of tag existence filters to apply. Only resources for which the specified freeform
         * tags exist the value will be returned. The key for each tag is "{tagName}.true". All
         * inputs are case-insensitive. Currently, only existence ("true" at the end) is supported.
         * Absence ("false" at the end) is not supported. Multiple values for different tag names
         * are interpreted as "AND".
         *
         * @param freeformTagExists the value to set
         * @return this builder instance
         */
        public Builder freeformTagExists(java.util.List<String> freeformTagExists) {
            this.freeformTagExists = freeformTagExists;
            return this;
        }

        /**
         * Singular setter. A list of tag existence filters to apply. Only resources for which the
         * specified freeform tags exist the value will be returned. The key for each tag is
         * "{tagName}.true". All inputs are case-insensitive. Currently, only existence ("true" at
         * the end) is supported. Absence ("false" at the end) is not supported. Multiple values for
         * different tag names are interpreted as "AND".
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder freeformTagExists(String singularValue) {
            return this.freeformTagExists(java.util.Arrays.asList(singularValue));
        }

        /** A flag to search all resources within a given compartment and all sub-compartments. */
        private Boolean compartmentIdInSubtree = null;

        /**
         * A flag to search all resources within a given compartment and all sub-compartments.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /** Optional list of Exadata Insight VM cluster name. */
        private java.util.List<String> vmclusterName = null;

        /**
         * Optional list of Exadata Insight VM cluster name.
         *
         * @param vmclusterName the value to set
         * @return this builder instance
         */
        public Builder vmclusterName(java.util.List<String> vmclusterName) {
            this.vmclusterName = vmclusterName;
            return this;
        }

        /**
         * Singular setter. Optional list of Exadata Insight VM cluster name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder vmclusterName(String singularValue) {
            return this.vmclusterName(java.util.Arrays.asList(singularValue));
        }

        /** Percent value in which a resource metric is considered highly utilized. */
        private Integer highUtilizationThreshold = null;

        /**
         * Percent value in which a resource metric is considered highly utilized.
         *
         * @param highUtilizationThreshold the value to set
         * @return this builder instance
         */
        public Builder highUtilizationThreshold(Integer highUtilizationThreshold) {
            this.highUtilizationThreshold = highUtilizationThreshold;
            return this;
        }

        /** Percent value in which a resource metric is considered low utilized. */
        private Integer lowUtilizationThreshold = null;

        /**
         * Percent value in which a resource metric is considered low utilized.
         *
         * @param lowUtilizationThreshold the value to set
         * @return this builder instance
         */
        public Builder lowUtilizationThreshold(Integer lowUtilizationThreshold) {
            this.lowUtilizationThreshold = lowUtilizationThreshold;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
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
            exadataInsightId(o.getExadataInsightId());
            cdbName(o.getCdbName());
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
            definedTagEquals(o.getDefinedTagEquals());
            freeformTagEquals(o.getFreeformTagEquals());
            definedTagExists(o.getDefinedTagExists());
            freeformTagExists(o.getFreeformTagExists());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            vmclusterName(o.getVmclusterName());
            highUtilizationThreshold(o.getHighUtilizationThreshold());
            lowUtilizationThreshold(o.getLowUtilizationThreshold());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeDatabaseInsightResourceForecastTrendRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
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

        /**
         * Build the instance of SummarizeDatabaseInsightResourceForecastTrendRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeDatabaseInsightResourceForecastTrendRequest
         */
        public SummarizeDatabaseInsightResourceForecastTrendRequest
                buildWithoutInvocationCallback() {
            SummarizeDatabaseInsightResourceForecastTrendRequest request =
                    new SummarizeDatabaseInsightResourceForecastTrendRequest();
            request.compartmentId = compartmentId;
            request.resourceMetric = resourceMetric;
            request.analysisTimeInterval = analysisTimeInterval;
            request.timeIntervalStart = timeIntervalStart;
            request.timeIntervalEnd = timeIntervalEnd;
            request.databaseType = databaseType;
            request.databaseId = databaseId;
            request.id = id;
            request.exadataInsightId = exadataInsightId;
            request.cdbName = cdbName;
            request.statistic = statistic;
            request.forecastDays = forecastDays;
            request.forecastModel = forecastModel;
            request.utilizationLevel = utilizationLevel;
            request.confidence = confidence;
            request.page = page;
            request.hostName = hostName;
            request.tablespaceName = tablespaceName;
            request.isDatabaseInstanceLevelMetrics = isDatabaseInstanceLevelMetrics;
            request.opcRequestId = opcRequestId;
            request.definedTagEquals = definedTagEquals;
            request.freeformTagEquals = freeformTagEquals;
            request.definedTagExists = definedTagExists;
            request.freeformTagExists = freeformTagExists;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.vmclusterName = vmclusterName;
            request.highUtilizationThreshold = highUtilizationThreshold;
            request.lowUtilizationThreshold = lowUtilizationThreshold;
            return request;
            // new SummarizeDatabaseInsightResourceForecastTrendRequest(compartmentId,
            // resourceMetric, analysisTimeInterval, timeIntervalStart, timeIntervalEnd,
            // databaseType, databaseId, id, exadataInsightId, cdbName, statistic, forecastDays,
            // forecastModel, utilizationLevel, confidence, page, hostName, tablespaceName,
            // isDatabaseInstanceLevelMetrics, opcRequestId, definedTagEquals, freeformTagEquals,
            // definedTagExists, freeformTagExists, compartmentIdInSubtree, vmclusterName,
            // highUtilizationThreshold, lowUtilizationThreshold);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .resourceMetric(resourceMetric)
                .analysisTimeInterval(analysisTimeInterval)
                .timeIntervalStart(timeIntervalStart)
                .timeIntervalEnd(timeIntervalEnd)
                .databaseType(databaseType)
                .databaseId(databaseId)
                .id(id)
                .exadataInsightId(exadataInsightId)
                .cdbName(cdbName)
                .statistic(statistic)
                .forecastDays(forecastDays)
                .forecastModel(forecastModel)
                .utilizationLevel(utilizationLevel)
                .confidence(confidence)
                .page(page)
                .hostName(hostName)
                .tablespaceName(tablespaceName)
                .isDatabaseInstanceLevelMetrics(isDatabaseInstanceLevelMetrics)
                .opcRequestId(opcRequestId)
                .definedTagEquals(definedTagEquals)
                .freeformTagEquals(freeformTagEquals)
                .definedTagExists(definedTagExists)
                .freeformTagExists(freeformTagExists)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .vmclusterName(vmclusterName)
                .highUtilizationThreshold(highUtilizationThreshold)
                .lowUtilizationThreshold(lowUtilizationThreshold);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",resourceMetric=").append(String.valueOf(this.resourceMetric));
        sb.append(",analysisTimeInterval=").append(String.valueOf(this.analysisTimeInterval));
        sb.append(",timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(",timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(",databaseType=").append(String.valueOf(this.databaseType));
        sb.append(",databaseId=").append(String.valueOf(this.databaseId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(",cdbName=").append(String.valueOf(this.cdbName));
        sb.append(",statistic=").append(String.valueOf(this.statistic));
        sb.append(",forecastDays=").append(String.valueOf(this.forecastDays));
        sb.append(",forecastModel=").append(String.valueOf(this.forecastModel));
        sb.append(",utilizationLevel=").append(String.valueOf(this.utilizationLevel));
        sb.append(",confidence=").append(String.valueOf(this.confidence));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",hostName=").append(String.valueOf(this.hostName));
        sb.append(",tablespaceName=").append(String.valueOf(this.tablespaceName));
        sb.append(",isDatabaseInstanceLevelMetrics=")
                .append(String.valueOf(this.isDatabaseInstanceLevelMetrics));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",definedTagEquals=").append(String.valueOf(this.definedTagEquals));
        sb.append(",freeformTagEquals=").append(String.valueOf(this.freeformTagEquals));
        sb.append(",definedTagExists=").append(String.valueOf(this.definedTagExists));
        sb.append(",freeformTagExists=").append(String.valueOf(this.freeformTagExists));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",vmclusterName=").append(String.valueOf(this.vmclusterName));
        sb.append(",highUtilizationThreshold=")
                .append(String.valueOf(this.highUtilizationThreshold));
        sb.append(",lowUtilizationThreshold=").append(String.valueOf(this.lowUtilizationThreshold));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeDatabaseInsightResourceForecastTrendRequest)) {
            return false;
        }

        SummarizeDatabaseInsightResourceForecastTrendRequest other =
                (SummarizeDatabaseInsightResourceForecastTrendRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceMetric, other.resourceMetric)
                && java.util.Objects.equals(this.analysisTimeInterval, other.analysisTimeInterval)
                && java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.databaseType, other.databaseType)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.cdbName, other.cdbName)
                && java.util.Objects.equals(this.statistic, other.statistic)
                && java.util.Objects.equals(this.forecastDays, other.forecastDays)
                && java.util.Objects.equals(this.forecastModel, other.forecastModel)
                && java.util.Objects.equals(this.utilizationLevel, other.utilizationLevel)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.tablespaceName, other.tablespaceName)
                && java.util.Objects.equals(
                        this.isDatabaseInstanceLevelMetrics, other.isDatabaseInstanceLevelMetrics)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.definedTagEquals, other.definedTagEquals)
                && java.util.Objects.equals(this.freeformTagEquals, other.freeformTagEquals)
                && java.util.Objects.equals(this.definedTagExists, other.definedTagExists)
                && java.util.Objects.equals(this.freeformTagExists, other.freeformTagExists)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.vmclusterName, other.vmclusterName)
                && java.util.Objects.equals(
                        this.highUtilizationThreshold, other.highUtilizationThreshold)
                && java.util.Objects.equals(
                        this.lowUtilizationThreshold, other.lowUtilizationThreshold);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceMetric == null ? 43 : this.resourceMetric.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisTimeInterval == null
                                ? 43
                                : this.analysisTimeInterval.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result = (result * PRIME) + (this.databaseType == null ? 43 : this.databaseType.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result = (result * PRIME) + (this.cdbName == null ? 43 : this.cdbName.hashCode());
        result = (result * PRIME) + (this.statistic == null ? 43 : this.statistic.hashCode());
        result = (result * PRIME) + (this.forecastDays == null ? 43 : this.forecastDays.hashCode());
        result =
                (result * PRIME)
                        + (this.forecastModel == null ? 43 : this.forecastModel.hashCode());
        result =
                (result * PRIME)
                        + (this.utilizationLevel == null ? 43 : this.utilizationLevel.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.tablespaceName == null ? 43 : this.tablespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.isDatabaseInstanceLevelMetrics == null
                                ? 43
                                : this.isDatabaseInstanceLevelMetrics.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.definedTagEquals == null ? 43 : this.definedTagEquals.hashCode());
        result =
                (result * PRIME)
                        + (this.freeformTagEquals == null ? 43 : this.freeformTagEquals.hashCode());
        result =
                (result * PRIME)
                        + (this.definedTagExists == null ? 43 : this.definedTagExists.hashCode());
        result =
                (result * PRIME)
                        + (this.freeformTagExists == null ? 43 : this.freeformTagExists.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.vmclusterName == null ? 43 : this.vmclusterName.hashCode());
        result =
                (result * PRIME)
                        + (this.highUtilizationThreshold == null
                                ? 43
                                : this.highUtilizationThreshold.hashCode());
        result =
                (result * PRIME)
                        + (this.lowUtilizationThreshold == null
                                ? 43
                                : this.lowUtilizationThreshold.hashCode());
        return result;
    }
}
