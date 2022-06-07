/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeDatabaseInsightResourceUsageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeDatabaseInsightResourceUsageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeDatabaseInsightResourceUsageRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Filter by resource metric.
     * Supported values are CPU , STORAGE, MEMORY and IO.
     *
     */
    private String resourceMetric;

    public String getResourceMetric() {
        return resourceMetric;
    }
    /**
     * Specify time period in ISO 8601 format with respect to current time.
     * Default is last 30 days represented by P30D.
     * If timeInterval is specified, then timeIntervalStart and timeIntervalEnd will be ignored.
     * Examples  P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
     *
     */
    private String analysisTimeInterval;

    public String getAnalysisTimeInterval() {
        return analysisTimeInterval;
    }
    /**
     * Analysis start time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * The minimum allowed value is 2 years prior to the current day.
     * timeIntervalStart and timeIntervalEnd parameters are used together.
     * If analysisTimeInterval is specified, this parameter is ignored.
     *
     */
    private java.util.Date timeIntervalStart;

    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }
    /**
     * Analysis end time in UTC in ISO 8601 format(exclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd are used together.
     * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
     *
     */
    private java.util.Date timeIntervalEnd;

    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }
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

    public java.util.List<DatabaseType> getDatabaseType() {
        return databaseType;
    }
    /**
     * Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
     *
     */
    private java.util.List<String> databaseId;

    public java.util.List<String> getDatabaseId() {
        return databaseId;
    }
    /**
     * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> id;

    public java.util.List<String> getId() {
        return id;
    }
    /**
     * Optional list of exadata insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private java.util.List<String> exadataInsightId;

    public java.util.List<String> getExadataInsightId() {
        return exadataInsightId;
    }
    /**
     * Filter by one or more hostname.
     *
     */
    private java.util.List<String> hostName;

    public java.util.List<String> getHostName() {
        return hostName;
    }
    /**
     * Flag to indicate if database instance level metrics should be returned. The flag is ignored when a host name filter is not applied.
     * When a hostname filter is applied this flag will determine whether to return metrics for the instances located on the specified host or for the
     * whole database which contains an instance on this host.
     *
     */
    private Boolean isDatabaseInstanceLevelMetrics;

    public Boolean getIsDatabaseInstanceLevelMetrics() {
        return isDatabaseInstanceLevelMetrics;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    public String getPage() {
        return page;
    }
    /**
     * Percentile values of daily usage to be used for computing the aggregate resource usage.
     *
     */
    private Integer percentile;

    public Integer getPercentile() {
        return percentile;
    }
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
     * A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
     * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
     * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
     *
     */
    private java.util.List<String> definedTagEquals;

    public java.util.List<String> getDefinedTagEquals() {
        return definedTagEquals;
    }
    /**
     * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
     * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
     * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
     *
     */
    private java.util.List<String> freeformTagEquals;

    public java.util.List<String> getFreeformTagEquals() {
        return freeformTagEquals;
    }
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

    public java.util.List<String> getDefinedTagExists() {
        return definedTagExists;
    }
    /**
     * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
     * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
     * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
     * Multiple values for different tag names are interpreted as "AND".
     *
     */
    private java.util.List<String> freeformTagExists;

    public java.util.List<String> getFreeformTagExists() {
        return freeformTagExists;
    }
    /**
     * A flag to search all resources within a given compartment and all sub-compartments.
     *
     */
    private Boolean compartmentIdInSubtree;

    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeDatabaseInsightResourceUsageRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        private String resourceMetric = null;

        /**
         * Filter by resource metric.
         * Supported values are CPU , STORAGE, MEMORY and IO.
         *
         * @return this builder instance
         */
        public Builder resourceMetric(String resourceMetric) {
            this.resourceMetric = resourceMetric;
            return this;
        }

        private String analysisTimeInterval = null;

        /**
         * Specify time period in ISO 8601 format with respect to current time.
         * Default is last 30 days represented by P30D.
         * If timeInterval is specified, then timeIntervalStart and timeIntervalEnd will be ignored.
         * Examples  P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
         *
         * @return this builder instance
         */
        public Builder analysisTimeInterval(String analysisTimeInterval) {
            this.analysisTimeInterval = analysisTimeInterval;
            return this;
        }

        private java.util.Date timeIntervalStart = null;

        /**
         * Analysis start time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * The minimum allowed value is 2 years prior to the current day.
         * timeIntervalStart and timeIntervalEnd parameters are used together.
         * If analysisTimeInterval is specified, this parameter is ignored.
         *
         * @return this builder instance
         */
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            return this;
        }

        private java.util.Date timeIntervalEnd = null;

        /**
         * Analysis end time in UTC in ISO 8601 format(exclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd are used together.
         * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
         *
         * @return this builder instance
         */
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            return this;
        }

        private java.util.List<DatabaseType> databaseType = null;

        /**
         * Filter by one or more database type.
         * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
         *
         * @return this builder instance
         */
        public Builder databaseType(java.util.List<DatabaseType> databaseType) {
            this.databaseType = databaseType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more database type.
         * Possible values are ADW-S, ATP-S, ADW-D, ATP-D, EXTERNAL-PDB, EXTERNAL-NONCDB.
         *
         * @return this builder instance
         */
        public Builder databaseType(DatabaseType singularValue) {
            return this.databaseType(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> databaseId = null;

        /**
         * Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         * @return this builder instance
         */
        public Builder databaseId(java.util.List<String> databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        /**
         * Singular setter. Optional list of database [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated DBaaS entity.
         *
         * @return this builder instance
         */
        public Builder databaseId(String singularValue) {
            return this.databaseId(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> id = null;

        /**
         * Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @return this builder instance
         */
        public Builder id(java.util.List<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Singular setter. Optional list of database insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @return this builder instance
         */
        public Builder id(String singularValue) {
            return this.id(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> exadataInsightId = null;

        /**
         * Optional list of exadata insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @return this builder instance
         */
        public Builder exadataInsightId(java.util.List<String> exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            return this;
        }

        /**
         * Singular setter. Optional list of exadata insight resource [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @return this builder instance
         */
        public Builder exadataInsightId(String singularValue) {
            return this.exadataInsightId(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> hostName = null;

        /**
         * Filter by one or more hostname.
         *
         * @return this builder instance
         */
        public Builder hostName(java.util.List<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Singular setter. Filter by one or more hostname.
         *
         * @return this builder instance
         */
        public Builder hostName(String singularValue) {
            return this.hostName(java.util.Arrays.asList(singularValue));
        }

        private Boolean isDatabaseInstanceLevelMetrics = null;

        /**
         * Flag to indicate if database instance level metrics should be returned. The flag is ignored when a host name filter is not applied.
         * When a hostname filter is applied this flag will determine whether to return metrics for the instances located on the specified host or for the
         * whole database which contains an instance on this host.
         *
         * @return this builder instance
         */
        public Builder isDatabaseInstanceLevelMetrics(Boolean isDatabaseInstanceLevelMetrics) {
            this.isDatabaseInstanceLevelMetrics = isDatabaseInstanceLevelMetrics;
            return this;
        }

        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        private Integer percentile = null;

        /**
         * Percentile values of daily usage to be used for computing the aggregate resource usage.
         *
         * @return this builder instance
         */
        public Builder percentile(Integer percentile) {
            this.percentile = percentile;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private java.util.List<String> definedTagEquals = null;

        /**
         * A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @return this builder instance
         */
        public Builder definedTagEquals(java.util.List<String> definedTagEquals) {
            this.definedTagEquals = definedTagEquals;
            return this;
        }

        /**
         * Singular setter. A list of tag filters to apply.  Only resources with a defined tag matching the value will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @return this builder instance
         */
        public Builder definedTagEquals(String singularValue) {
            return this.definedTagEquals(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> freeformTagEquals = null;

        /**
         * A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
         * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
         *
         * @return this builder instance
         */
        public Builder freeformTagEquals(java.util.List<String> freeformTagEquals) {
            this.freeformTagEquals = freeformTagEquals;
            return this;
        }

        /**
         * Singular setter. A list of tag filters to apply.  Only resources with a freeform tag matching the value will be returned.
         * The key for each tag is "{tagName}.{value}".  All inputs are case-insensitive.
         * Multiple values for the same tag name are interpreted as "OR".  Values for different tag names are interpreted as "AND".
         *
         * @return this builder instance
         */
        public Builder freeformTagEquals(String singularValue) {
            return this.freeformTagEquals(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> definedTagExists = null;

        /**
         * A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
         * or "{namespace}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @return this builder instance
         */
        public Builder definedTagExists(java.util.List<String> definedTagExists) {
            this.definedTagExists = definedTagExists;
            return this;
        }

        /**
         * Singular setter. A list of tag existence filters to apply.  Only resources for which the specified defined tags exist will be returned.
         * Each item in the list has the format "{namespace}.{tagName}.true" (for checking existence of a defined tag)
         * or "{namespace}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for the same key (i.e. same namespace and tag name) are interpreted as "OR".
         * Values for different keys (i.e. different namespaces, different tag names, or both) are interpreted as "AND".
         *
         * @return this builder instance
         */
        public Builder definedTagExists(String singularValue) {
            return this.definedTagExists(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> freeformTagExists = null;

        /**
         * A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
         * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for different tag names are interpreted as "AND".
         *
         * @return this builder instance
         */
        public Builder freeformTagExists(java.util.List<String> freeformTagExists) {
            this.freeformTagExists = freeformTagExists;
            return this;
        }

        /**
         * Singular setter. A list of tag existence filters to apply.  Only resources for which the specified freeform tags exist the value will be returned.
         * The key for each tag is "{tagName}.true".  All inputs are case-insensitive.
         * Currently, only existence ("true" at the end) is supported. Absence ("false" at the end) is not supported.
         * Multiple values for different tag names are interpreted as "AND".
         *
         * @return this builder instance
         */
        public Builder freeformTagExists(String singularValue) {
            return this.freeformTagExists(java.util.Arrays.asList(singularValue));
        }

        private Boolean compartmentIdInSubtree = null;

        /**
         * A flag to search all resources within a given compartment and all sub-compartments.
         *
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
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
        public Builder copy(SummarizeDatabaseInsightResourceUsageRequest o) {
            compartmentId(o.getCompartmentId());
            resourceMetric(o.getResourceMetric());
            analysisTimeInterval(o.getAnalysisTimeInterval());
            timeIntervalStart(o.getTimeIntervalStart());
            timeIntervalEnd(o.getTimeIntervalEnd());
            databaseType(o.getDatabaseType());
            databaseId(o.getDatabaseId());
            id(o.getId());
            exadataInsightId(o.getExadataInsightId());
            hostName(o.getHostName());
            isDatabaseInstanceLevelMetrics(o.getIsDatabaseInstanceLevelMetrics());
            page(o.getPage());
            percentile(o.getPercentile());
            opcRequestId(o.getOpcRequestId());
            definedTagEquals(o.getDefinedTagEquals());
            freeformTagEquals(o.getFreeformTagEquals());
            definedTagExists(o.getDefinedTagExists());
            freeformTagExists(o.getFreeformTagExists());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeDatabaseInsightResourceUsageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeDatabaseInsightResourceUsageRequest
         */
        public SummarizeDatabaseInsightResourceUsageRequest build() {
            SummarizeDatabaseInsightResourceUsageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeDatabaseInsightResourceUsageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeDatabaseInsightResourceUsageRequest
         */
        public SummarizeDatabaseInsightResourceUsageRequest buildWithoutInvocationCallback() {
            SummarizeDatabaseInsightResourceUsageRequest request =
                    new SummarizeDatabaseInsightResourceUsageRequest();
            request.compartmentId = compartmentId;
            request.resourceMetric = resourceMetric;
            request.analysisTimeInterval = analysisTimeInterval;
            request.timeIntervalStart = timeIntervalStart;
            request.timeIntervalEnd = timeIntervalEnd;
            request.databaseType = databaseType;
            request.databaseId = databaseId;
            request.id = id;
            request.exadataInsightId = exadataInsightId;
            request.hostName = hostName;
            request.isDatabaseInstanceLevelMetrics = isDatabaseInstanceLevelMetrics;
            request.page = page;
            request.percentile = percentile;
            request.opcRequestId = opcRequestId;
            request.definedTagEquals = definedTagEquals;
            request.freeformTagEquals = freeformTagEquals;
            request.definedTagExists = definedTagExists;
            request.freeformTagExists = freeformTagExists;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            return request;
            // new SummarizeDatabaseInsightResourceUsageRequest(compartmentId, resourceMetric, analysisTimeInterval, timeIntervalStart, timeIntervalEnd, databaseType, databaseId, id, exadataInsightId, hostName, isDatabaseInstanceLevelMetrics, page, percentile, opcRequestId, definedTagEquals, freeformTagEquals, definedTagExists, freeformTagExists, compartmentIdInSubtree);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
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
                .hostName(hostName)
                .isDatabaseInstanceLevelMetrics(isDatabaseInstanceLevelMetrics)
                .page(page)
                .percentile(percentile)
                .opcRequestId(opcRequestId)
                .definedTagEquals(definedTagEquals)
                .freeformTagEquals(freeformTagEquals)
                .definedTagExists(definedTagExists)
                .freeformTagExists(freeformTagExists)
                .compartmentIdInSubtree(compartmentIdInSubtree);
    }

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
        sb.append(",hostName=").append(String.valueOf(this.hostName));
        sb.append(",isDatabaseInstanceLevelMetrics=")
                .append(String.valueOf(this.isDatabaseInstanceLevelMetrics));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",percentile=").append(String.valueOf(this.percentile));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",definedTagEquals=").append(String.valueOf(this.definedTagEquals));
        sb.append(",freeformTagEquals=").append(String.valueOf(this.freeformTagEquals));
        sb.append(",definedTagExists=").append(String.valueOf(this.definedTagExists));
        sb.append(",freeformTagExists=").append(String.valueOf(this.freeformTagExists));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeDatabaseInsightResourceUsageRequest)) {
            return false;
        }

        SummarizeDatabaseInsightResourceUsageRequest other =
                (SummarizeDatabaseInsightResourceUsageRequest) o;
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
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(
                        this.isDatabaseInstanceLevelMetrics, other.isDatabaseInstanceLevelMetrics)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.percentile, other.percentile)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.definedTagEquals, other.definedTagEquals)
                && java.util.Objects.equals(this.freeformTagEquals, other.freeformTagEquals)
                && java.util.Objects.equals(this.definedTagExists, other.definedTagExists)
                && java.util.Objects.equals(this.freeformTagExists, other.freeformTagExists)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree);
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
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.isDatabaseInstanceLevelMetrics == null
                                ? 43
                                : this.isDatabaseInstanceLevelMetrics.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.percentile == null ? 43 : this.percentile.hashCode());
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
        return result;
    }
}
