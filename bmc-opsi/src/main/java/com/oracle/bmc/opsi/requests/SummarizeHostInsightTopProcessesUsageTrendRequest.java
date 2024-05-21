/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/SummarizeHostInsightTopProcessesUsageTrendExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use SummarizeHostInsightTopProcessesUsageTrendRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class SummarizeHostInsightTopProcessesUsageTrendRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Required [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host insight resource.
     *
     */
    private String id;

    /**
     * Required [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host insight resource.
     *
     */
    public String getId() {
        return id;
    }
    /**
     * Host top processes resource metric sort options.
     * Supported values are CPU, MEMORY, VIIRTUAL_MEMORY.
     *
     */
    private String resourceMetric;

    /**
     * Host top processes resource metric sort options.
     * Supported values are CPU, MEMORY, VIIRTUAL_MEMORY.
     *
     */
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

    /**
     * Specify time period in ISO 8601 format with respect to current time.
     * Default is last 30 days represented by P30D.
     * If timeInterval is specified, then timeIntervalStart and timeIntervalEnd will be ignored.
     * Examples  P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
     *
     */
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

    /**
     * Analysis start time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * The minimum allowed value is 2 years prior to the current day.
     * timeIntervalStart and timeIntervalEnd parameters are used together.
     * If analysisTimeInterval is specified, this parameter is ignored.
     *
     */
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

    /**
     * Analysis end time in UTC in ISO 8601 format(exclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd are used together.
     * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
     *
     */
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from
     * the previous "List" call. For important details about how pagination works,
     * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
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
     * For list pagination. The maximum number of results per page, or items to
     * return in a paginated "List" call.
     * For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Filter by one or more host types.
     * Possible values are CLOUD-HOST, EXTERNAL-HOST, COMANAGED-VM-HOST, COMANAGED-BM-HOST, COMANAGED-EXACS-HOST
     *
     */
    private java.util.List<String> hostType;

    /**
     * Filter by one or more host types.
     * Possible values are CLOUD-HOST, EXTERNAL-HOST, COMANAGED-VM-HOST, COMANAGED-BM-HOST, COMANAGED-EXACS-HOST
     *
     */
    public java.util.List<String> getHostType() {
        return hostType;
    }
    /**
     * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host (Compute Id)
     *
     */
    private String hostId;

    /**
     * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host (Compute Id)
     *
     */
    public String getHostId() {
        return hostId;
    }
    /**
     * Unique identifier for a process.
     *
     */
    private String processHash;

    /**
     * Unique identifier for a process.
     *
     */
    public String getProcessHash() {
        return processHash;
    }
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
     * Choose the type of statistic metric data to be used for forecasting.
     */
    public Statistic getStatistic() {
        return statistic;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeHostInsightTopProcessesUsageTrendRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Required [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host insight resource.
         *
         */
        private String id = null;

        /**
         * Required [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host insight resource.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Host top processes resource metric sort options.
         * Supported values are CPU, MEMORY, VIIRTUAL_MEMORY.
         *
         */
        private String resourceMetric = null;

        /**
         * Host top processes resource metric sort options.
         * Supported values are CPU, MEMORY, VIIRTUAL_MEMORY.
         *
         * @param resourceMetric the value to set
         * @return this builder instance
         */
        public Builder resourceMetric(String resourceMetric) {
            this.resourceMetric = resourceMetric;
            return this;
        }

        /**
         * Specify time period in ISO 8601 format with respect to current time.
         * Default is last 30 days represented by P30D.
         * If timeInterval is specified, then timeIntervalStart and timeIntervalEnd will be ignored.
         * Examples  P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
         *
         */
        private String analysisTimeInterval = null;

        /**
         * Specify time period in ISO 8601 format with respect to current time.
         * Default is last 30 days represented by P30D.
         * If timeInterval is specified, then timeIntervalStart and timeIntervalEnd will be ignored.
         * Examples  P90D (last 90 days), P4W (last 4 weeks), P2M (last 2 months), P1Y (last 12 months), . Maximum value allowed is 25 months prior to current time (P25M).
         *
         * @param analysisTimeInterval the value to set
         * @return this builder instance
         */
        public Builder analysisTimeInterval(String analysisTimeInterval) {
            this.analysisTimeInterval = analysisTimeInterval;
            return this;
        }

        /**
         * Analysis start time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * The minimum allowed value is 2 years prior to the current day.
         * timeIntervalStart and timeIntervalEnd parameters are used together.
         * If analysisTimeInterval is specified, this parameter is ignored.
         *
         */
        private java.util.Date timeIntervalStart = null;

        /**
         * Analysis start time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * The minimum allowed value is 2 years prior to the current day.
         * timeIntervalStart and timeIntervalEnd parameters are used together.
         * If analysisTimeInterval is specified, this parameter is ignored.
         *
         * @param timeIntervalStart the value to set
         * @return this builder instance
         */
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            return this;
        }

        /**
         * Analysis end time in UTC in ISO 8601 format(exclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd are used together.
         * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
         *
         */
        private java.util.Date timeIntervalEnd = null;

        /**
         * Analysis end time in UTC in ISO 8601 format(exclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd are used together.
         * If timeIntervalEnd is not specified, current time is used as timeIntervalEnd.
         *
         * @param timeIntervalEnd the value to set
         * @return this builder instance
         */
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from
         * the previous "List" call. For important details about how pagination works,
         * see [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to
         * return in a paginated "List" call.
         * For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm#nine).
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Filter by one or more host types.
         * Possible values are CLOUD-HOST, EXTERNAL-HOST, COMANAGED-VM-HOST, COMANAGED-BM-HOST, COMANAGED-EXACS-HOST
         *
         */
        private java.util.List<String> hostType = null;

        /**
         * Filter by one or more host types.
         * Possible values are CLOUD-HOST, EXTERNAL-HOST, COMANAGED-VM-HOST, COMANAGED-BM-HOST, COMANAGED-EXACS-HOST
         *
         * @param hostType the value to set
         * @return this builder instance
         */
        public Builder hostType(java.util.List<String> hostType) {
            this.hostType = hostType;
            return this;
        }

        /**
         * Singular setter. Filter by one or more host types.
         * Possible values are CLOUD-HOST, EXTERNAL-HOST, COMANAGED-VM-HOST, COMANAGED-BM-HOST, COMANAGED-EXACS-HOST
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder hostType(String singularValue) {
            return this.hostType(java.util.Arrays.asList(singularValue));
        }

        /**
         * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host (Compute Id)
         *
         */
        private String hostId = null;

        /**
         * Optional [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the host (Compute Id)
         *
         * @param hostId the value to set
         * @return this builder instance
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * Unique identifier for a process.
         *
         */
        private String processHash = null;

        /**
         * Unique identifier for a process.
         *
         * @param processHash the value to set
         * @return this builder instance
         */
        public Builder processHash(String processHash) {
            this.processHash = processHash;
            return this;
        }

        /**
         * Choose the type of statistic metric data to be used for forecasting.
         */
        private Statistic statistic = null;

        /**
         * Choose the type of statistic metric data to be used for forecasting.
         * @param statistic the value to set
         * @return this builder instance
         */
        public Builder statistic(Statistic statistic) {
            this.statistic = statistic;
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
        public Builder copy(SummarizeHostInsightTopProcessesUsageTrendRequest o) {
            compartmentId(o.getCompartmentId());
            id(o.getId());
            resourceMetric(o.getResourceMetric());
            analysisTimeInterval(o.getAnalysisTimeInterval());
            timeIntervalStart(o.getTimeIntervalStart());
            timeIntervalEnd(o.getTimeIntervalEnd());
            page(o.getPage());
            limit(o.getLimit());
            opcRequestId(o.getOpcRequestId());
            hostType(o.getHostType());
            hostId(o.getHostId());
            processHash(o.getProcessHash());
            statistic(o.getStatistic());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeHostInsightTopProcessesUsageTrendRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of SummarizeHostInsightTopProcessesUsageTrendRequest
         */
        public SummarizeHostInsightTopProcessesUsageTrendRequest build() {
            SummarizeHostInsightTopProcessesUsageTrendRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeHostInsightTopProcessesUsageTrendRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeHostInsightTopProcessesUsageTrendRequest
         */
        public SummarizeHostInsightTopProcessesUsageTrendRequest buildWithoutInvocationCallback() {
            SummarizeHostInsightTopProcessesUsageTrendRequest request =
                    new SummarizeHostInsightTopProcessesUsageTrendRequest();
            request.compartmentId = compartmentId;
            request.id = id;
            request.resourceMetric = resourceMetric;
            request.analysisTimeInterval = analysisTimeInterval;
            request.timeIntervalStart = timeIntervalStart;
            request.timeIntervalEnd = timeIntervalEnd;
            request.page = page;
            request.limit = limit;
            request.opcRequestId = opcRequestId;
            request.hostType = hostType;
            request.hostId = hostId;
            request.processHash = processHash;
            request.statistic = statistic;
            return request;
            // new SummarizeHostInsightTopProcessesUsageTrendRequest(compartmentId, id, resourceMetric, analysisTimeInterval, timeIntervalStart, timeIntervalEnd, page, limit, opcRequestId, hostType, hostId, processHash, statistic);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .id(id)
                .resourceMetric(resourceMetric)
                .analysisTimeInterval(analysisTimeInterval)
                .timeIntervalStart(timeIntervalStart)
                .timeIntervalEnd(timeIntervalEnd)
                .page(page)
                .limit(limit)
                .opcRequestId(opcRequestId)
                .hostType(hostType)
                .hostId(hostId)
                .processHash(processHash)
                .statistic(statistic);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",resourceMetric=").append(String.valueOf(this.resourceMetric));
        sb.append(",analysisTimeInterval=").append(String.valueOf(this.analysisTimeInterval));
        sb.append(",timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(",timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",hostType=").append(String.valueOf(this.hostType));
        sb.append(",hostId=").append(String.valueOf(this.hostId));
        sb.append(",processHash=").append(String.valueOf(this.processHash));
        sb.append(",statistic=").append(String.valueOf(this.statistic));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeHostInsightTopProcessesUsageTrendRequest)) {
            return false;
        }

        SummarizeHostInsightTopProcessesUsageTrendRequest other =
                (SummarizeHostInsightTopProcessesUsageTrendRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceMetric, other.resourceMetric)
                && java.util.Objects.equals(this.analysisTimeInterval, other.analysisTimeInterval)
                && java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.hostType, other.hostType)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.processHash, other.processHash)
                && java.util.Objects.equals(this.statistic, other.statistic);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
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
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.hostType == null ? 43 : this.hostType.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result = (result * PRIME) + (this.processHash == null ? 43 : this.processHash.hashCode());
        result = (result * PRIME) + (this.statistic == null ? 43 : this.statistic.hashCode());
        return result;
    }
}
