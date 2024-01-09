/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeExadataInsightResourceCapacityTrendExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeExadataInsightResourceCapacityTrendRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeExadataInsightResourceCapacityTrendRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Filter by resource. Supported values are HOST , STORAGE_SERVER and DATABASE */
    private String resourceType;

    /** Filter by resource. Supported values are HOST , STORAGE_SERVER and DATABASE */
    public String getResourceType() {
        return resourceType;
    }
    /**
     * Filter by resource metric. Supported values are CPU , STORAGE, MEMORY, IO, IOPS, THROUGHPUT
     */
    private String resourceMetric;

    /**
     * Filter by resource metric. Supported values are CPU , STORAGE, MEMORY, IO, IOPS, THROUGHPUT
     */
    public String getResourceMetric() {
        return resourceMetric;
    }
    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * exadata insight resource.
     */
    private String exadataInsightId;

    /**
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * exadata insight resource.
     */
    public String getExadataInsightId() {
        return exadataInsightId;
    }
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
     * Optional list of database insight resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private java.util.List<String> databaseInsightId;

    /**
     * Optional list of database insight resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public java.util.List<String> getDatabaseInsightId() {
        return databaseInsightId;
    }
    /**
     * Optional list of host insight resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private java.util.List<String> hostInsightId;

    /**
     * Optional list of host insight resource
     * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public java.util.List<String> getHostInsightId() {
        return hostInsightId;
    }
    /** Optional storage server name on an exadata system. */
    private java.util.List<String> storageServerName;

    /** Optional storage server name on an exadata system. */
    public java.util.List<String> getStorageServerName() {
        return storageServerName;
    }
    /** Filter by one or more Exadata types. Possible value are DBMACHINE, EXACS, and EXACC. */
    private java.util.List<String> exadataType;

    /** Filter by one or more Exadata types. Possible value are DBMACHINE, EXACS, and EXACC. */
    public java.util.List<String> getExadataType() {
        return exadataType;
    }
    /** Filter by one or more cdb name. */
    private java.util.List<String> cdbName;

    /** Filter by one or more cdb name. */
    public java.util.List<String> getCdbName() {
        return cdbName;
    }
    /** Filter by hostname. */
    private java.util.List<String> hostName;

    /** Filter by hostname. */
    public java.util.List<String> getHostName() {
        return hostName;
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
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine). Example:
     * {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.opsi.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.opsi.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The order in which resource capacity trend records are listed */
    private SortBy sortBy;

    /** The order in which resource capacity trend records are listed */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Id("id"),
        Name("name"),
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

    /** The order in which resource capacity trend records are listed */
    public SortBy getSortBy() {
        return sortBy;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeExadataInsightResourceCapacityTrendRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Filter by resource. Supported values are HOST , STORAGE_SERVER and DATABASE */
        private String resourceType = null;

        /**
         * Filter by resource. Supported values are HOST , STORAGE_SERVER and DATABASE
         *
         * @param resourceType the value to set
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Filter by resource metric. Supported values are CPU , STORAGE, MEMORY, IO, IOPS,
         * THROUGHPUT
         */
        private String resourceMetric = null;

        /**
         * Filter by resource metric. Supported values are CPU , STORAGE, MEMORY, IO, IOPS,
         * THROUGHPUT
         *
         * @param resourceMetric the value to set
         * @return this builder instance
         */
        public Builder resourceMetric(String resourceMetric) {
            this.resourceMetric = resourceMetric;
            return this;
        }

        /**
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * exadata insight resource.
         */
        private String exadataInsightId = null;

        /**
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * exadata insight resource.
         *
         * @param exadataInsightId the value to set
         * @return this builder instance
         */
        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            return this;
        }

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
         * Optional list of database insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private java.util.List<String> databaseInsightId = null;

        /**
         * Optional list of database insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param databaseInsightId the value to set
         * @return this builder instance
         */
        public Builder databaseInsightId(java.util.List<String> databaseInsightId) {
            this.databaseInsightId = databaseInsightId;
            return this;
        }

        /**
         * Singular setter. Optional list of database insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder databaseInsightId(String singularValue) {
            return this.databaseInsightId(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional list of host insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private java.util.List<String> hostInsightId = null;

        /**
         * Optional list of host insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param hostInsightId the value to set
         * @return this builder instance
         */
        public Builder hostInsightId(java.util.List<String> hostInsightId) {
            this.hostInsightId = hostInsightId;
            return this;
        }

        /**
         * Singular setter. Optional list of host insight resource
         * [OCIDs](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder hostInsightId(String singularValue) {
            return this.hostInsightId(java.util.Arrays.asList(singularValue));
        }

        /** Optional storage server name on an exadata system. */
        private java.util.List<String> storageServerName = null;

        /**
         * Optional storage server name on an exadata system.
         *
         * @param storageServerName the value to set
         * @return this builder instance
         */
        public Builder storageServerName(java.util.List<String> storageServerName) {
            this.storageServerName = storageServerName;
            return this;
        }

        /**
         * Singular setter. Optional storage server name on an exadata system.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder storageServerName(String singularValue) {
            return this.storageServerName(java.util.Arrays.asList(singularValue));
        }

        /** Filter by one or more Exadata types. Possible value are DBMACHINE, EXACS, and EXACC. */
        private java.util.List<String> exadataType = null;

        /**
         * Filter by one or more Exadata types. Possible value are DBMACHINE, EXACS, and EXACC.
         *
         * @param exadataType the value to set
         * @return this builder instance
         */
        public Builder exadataType(java.util.List<String> exadataType) {
            this.exadataType = exadataType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more Exadata types. Possible value are DBMACHINE,
         * EXACS, and EXACC.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder exadataType(String singularValue) {
            return this.exadataType(java.util.Arrays.asList(singularValue));
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

        /** Filter by hostname. */
        private java.util.List<String> hostName = null;

        /**
         * Filter by hostname.
         *
         * @param hostName the value to set
         * @return this builder instance
         */
        public Builder hostName(java.util.List<String> hostName) {
            this.hostName = hostName;
            return this;
        }

        /**
         * Singular setter. Filter by hostname.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder hostName(String singularValue) {
            return this.hostName(java.util.Arrays.asList(singularValue));
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

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private com.oracle.bmc.opsi.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.opsi.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The order in which resource capacity trend records are listed */
        private SortBy sortBy = null;

        /**
         * The order in which resource capacity trend records are listed
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(SummarizeExadataInsightResourceCapacityTrendRequest o) {
            resourceType(o.getResourceType());
            resourceMetric(o.getResourceMetric());
            exadataInsightId(o.getExadataInsightId());
            compartmentId(o.getCompartmentId());
            analysisTimeInterval(o.getAnalysisTimeInterval());
            timeIntervalStart(o.getTimeIntervalStart());
            timeIntervalEnd(o.getTimeIntervalEnd());
            databaseInsightId(o.getDatabaseInsightId());
            hostInsightId(o.getHostInsightId());
            storageServerName(o.getStorageServerName());
            exadataType(o.getExadataType());
            cdbName(o.getCdbName());
            hostName(o.getHostName());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeExadataInsightResourceCapacityTrendRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeExadataInsightResourceCapacityTrendRequest
         */
        public SummarizeExadataInsightResourceCapacityTrendRequest build() {
            SummarizeExadataInsightResourceCapacityTrendRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeExadataInsightResourceCapacityTrendRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeExadataInsightResourceCapacityTrendRequest
         */
        public SummarizeExadataInsightResourceCapacityTrendRequest
                buildWithoutInvocationCallback() {
            SummarizeExadataInsightResourceCapacityTrendRequest request =
                    new SummarizeExadataInsightResourceCapacityTrendRequest();
            request.resourceType = resourceType;
            request.resourceMetric = resourceMetric;
            request.exadataInsightId = exadataInsightId;
            request.compartmentId = compartmentId;
            request.analysisTimeInterval = analysisTimeInterval;
            request.timeIntervalStart = timeIntervalStart;
            request.timeIntervalEnd = timeIntervalEnd;
            request.databaseInsightId = databaseInsightId;
            request.hostInsightId = hostInsightId;
            request.storageServerName = storageServerName;
            request.exadataType = exadataType;
            request.cdbName = cdbName;
            request.hostName = hostName;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeExadataInsightResourceCapacityTrendRequest(resourceType, resourceMetric,
            // exadataInsightId, compartmentId, analysisTimeInterval, timeIntervalStart,
            // timeIntervalEnd, databaseInsightId, hostInsightId, storageServerName, exadataType,
            // cdbName, hostName, page, limit, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .resourceType(resourceType)
                .resourceMetric(resourceMetric)
                .exadataInsightId(exadataInsightId)
                .compartmentId(compartmentId)
                .analysisTimeInterval(analysisTimeInterval)
                .timeIntervalStart(timeIntervalStart)
                .timeIntervalEnd(timeIntervalEnd)
                .databaseInsightId(databaseInsightId)
                .hostInsightId(hostInsightId)
                .storageServerName(storageServerName)
                .exadataType(exadataType)
                .cdbName(cdbName)
                .hostName(hostName)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(",resourceMetric=").append(String.valueOf(this.resourceMetric));
        sb.append(",exadataInsightId=").append(String.valueOf(this.exadataInsightId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",analysisTimeInterval=").append(String.valueOf(this.analysisTimeInterval));
        sb.append(",timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(",timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(",databaseInsightId=").append(String.valueOf(this.databaseInsightId));
        sb.append(",hostInsightId=").append(String.valueOf(this.hostInsightId));
        sb.append(",storageServerName=").append(String.valueOf(this.storageServerName));
        sb.append(",exadataType=").append(String.valueOf(this.exadataType));
        sb.append(",cdbName=").append(String.valueOf(this.cdbName));
        sb.append(",hostName=").append(String.valueOf(this.hostName));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeExadataInsightResourceCapacityTrendRequest)) {
            return false;
        }

        SummarizeExadataInsightResourceCapacityTrendRequest other =
                (SummarizeExadataInsightResourceCapacityTrendRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.resourceMetric, other.resourceMetric)
                && java.util.Objects.equals(this.exadataInsightId, other.exadataInsightId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.analysisTimeInterval, other.analysisTimeInterval)
                && java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.databaseInsightId, other.databaseInsightId)
                && java.util.Objects.equals(this.hostInsightId, other.hostInsightId)
                && java.util.Objects.equals(this.storageServerName, other.storageServerName)
                && java.util.Objects.equals(this.exadataType, other.exadataType)
                && java.util.Objects.equals(this.cdbName, other.cdbName)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceMetric == null ? 43 : this.resourceMetric.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataInsightId == null ? 43 : this.exadataInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.databaseInsightId == null ? 43 : this.databaseInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.hostInsightId == null ? 43 : this.hostInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServerName == null ? 43 : this.storageServerName.hashCode());
        result = (result * PRIME) + (this.exadataType == null ? 43 : this.exadataType.hashCode());
        result = (result * PRIME) + (this.cdbName == null ? 43 : this.cdbName.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
