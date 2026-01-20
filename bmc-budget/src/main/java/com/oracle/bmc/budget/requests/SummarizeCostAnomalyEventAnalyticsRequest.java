/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.requests;

import com.oracle.bmc.budget.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/budget/SummarizeCostAnomalyEventAnalyticsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeCostAnomalyEventAnalyticsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class SummarizeCostAnomalyEventAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'asc' or 'desc'. */
    private com.oracle.bmc.budget.model.SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public com.oracle.bmc.budget.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. If not specified, the default is timeAnomalyEventDate. The default sort
     * order for timeAnomalyEventDate is DESC. The default sort order for costAnomalyName is ASC in
     * alphanumeric order.
     */
    private com.oracle.bmc.budget.model.SortByForCostAnomalyEvent sortBy;

    /**
     * The field to sort by. If not specified, the default is timeAnomalyEventDate. The default sort
     * order for timeAnomalyEventDate is DESC. The default sort order for costAnomalyName is ASC in
     * alphanumeric order.
     */
    public com.oracle.bmc.budget.model.SortByForCostAnomalyEvent getSortBy() {
        return sortBy;
    }
    /** Unique, non-changeable resource name. */
    private String name;

    /** Unique, non-changeable resource name. */
    public String getName() {
        return name;
    }
    /** The cost monitor ocid. */
    private String costAnomalyMonitorId;

    /** The cost monitor ocid. */
    public String getCostAnomalyMonitorId() {
        return costAnomalyMonitorId;
    }
    /** The target tenantId ocid filter param. */
    private java.util.List<String> targetTenantId;

    /** The target tenantId ocid filter param. */
    public java.util.List<String> getTargetTenantId() {
        return targetTenantId;
    }
    /** startDate for anomaly event date. */
    private java.util.Date timeAnomalyEventStartDate;

    /** startDate for anomaly event date. */
    public java.util.Date getTimeAnomalyEventStartDate() {
        return timeAnomalyEventStartDate;
    }
    /** endDate for anomaly event date. */
    private java.util.Date timeAnomalyEventEndDate;

    /** endDate for anomaly event date. */
    public java.util.Date getTimeAnomalyEventEndDate() {
        return timeAnomalyEventEndDate;
    }
    /** region of the anomaly event. */
    private java.util.List<String> region;

    /** region of the anomaly event. */
    public java.util.List<String> getRegion() {
        return region;
    }
    /** cost impact (absolute) of the anomaly event. */
    private Double costImpact;

    /** cost impact (absolute) of the anomaly event. */
    public Double getCostImpact() {
        return costImpact;
    }
    /** cost impact (percentage) of the anomaly event. */
    private Double costImpactPercentage;

    /** cost impact (percentage) of the anomaly event. */
    public Double getCostImpactPercentage() {
        return costImpactPercentage;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeCostAnomalyEventAnalyticsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The maximum number of items to return. */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'asc' or 'desc'. */
        private com.oracle.bmc.budget.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.budget.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. If not specified, the default is timeAnomalyEventDate. The default
         * sort order for timeAnomalyEventDate is DESC. The default sort order for costAnomalyName
         * is ASC in alphanumeric order.
         */
        private com.oracle.bmc.budget.model.SortByForCostAnomalyEvent sortBy = null;

        /**
         * The field to sort by. If not specified, the default is timeAnomalyEventDate. The default
         * sort order for timeAnomalyEventDate is DESC. The default sort order for costAnomalyName
         * is ASC in alphanumeric order.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.budget.model.SortByForCostAnomalyEvent sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** Unique, non-changeable resource name. */
        private String name = null;

        /**
         * Unique, non-changeable resource name.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** The cost monitor ocid. */
        private String costAnomalyMonitorId = null;

        /**
         * The cost monitor ocid.
         *
         * @param costAnomalyMonitorId the value to set
         * @return this builder instance
         */
        public Builder costAnomalyMonitorId(String costAnomalyMonitorId) {
            this.costAnomalyMonitorId = costAnomalyMonitorId;
            return this;
        }

        /** The target tenantId ocid filter param. */
        private java.util.List<String> targetTenantId = null;

        /**
         * The target tenantId ocid filter param.
         *
         * @param targetTenantId the value to set
         * @return this builder instance
         */
        public Builder targetTenantId(java.util.List<String> targetTenantId) {
            this.targetTenantId = targetTenantId;
            return this;
        }

        /**
         * Singular setter. The target tenantId ocid filter param.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder targetTenantId(String singularValue) {
            return this.targetTenantId(java.util.Arrays.asList(singularValue));
        }

        /** startDate for anomaly event date. */
        private java.util.Date timeAnomalyEventStartDate = null;

        /**
         * startDate for anomaly event date.
         *
         * @param timeAnomalyEventStartDate the value to set
         * @return this builder instance
         */
        public Builder timeAnomalyEventStartDate(java.util.Date timeAnomalyEventStartDate) {
            this.timeAnomalyEventStartDate = timeAnomalyEventStartDate;
            return this;
        }

        /** endDate for anomaly event date. */
        private java.util.Date timeAnomalyEventEndDate = null;

        /**
         * endDate for anomaly event date.
         *
         * @param timeAnomalyEventEndDate the value to set
         * @return this builder instance
         */
        public Builder timeAnomalyEventEndDate(java.util.Date timeAnomalyEventEndDate) {
            this.timeAnomalyEventEndDate = timeAnomalyEventEndDate;
            return this;
        }

        /** region of the anomaly event. */
        private java.util.List<String> region = null;

        /**
         * region of the anomaly event.
         *
         * @param region the value to set
         * @return this builder instance
         */
        public Builder region(java.util.List<String> region) {
            this.region = region;
            return this;
        }

        /**
         * Singular setter. region of the anomaly event.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder region(String singularValue) {
            return this.region(java.util.Arrays.asList(singularValue));
        }

        /** cost impact (absolute) of the anomaly event. */
        private Double costImpact = null;

        /**
         * cost impact (absolute) of the anomaly event.
         *
         * @param costImpact the value to set
         * @return this builder instance
         */
        public Builder costImpact(Double costImpact) {
            this.costImpact = costImpact;
            return this;
        }

        /** cost impact (percentage) of the anomaly event. */
        private Double costImpactPercentage = null;

        /**
         * cost impact (percentage) of the anomaly event.
         *
         * @param costImpactPercentage the value to set
         * @return this builder instance
         */
        public Builder costImpactPercentage(Double costImpactPercentage) {
            this.costImpactPercentage = costImpactPercentage;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(SummarizeCostAnomalyEventAnalyticsRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            name(o.getName());
            costAnomalyMonitorId(o.getCostAnomalyMonitorId());
            targetTenantId(o.getTargetTenantId());
            timeAnomalyEventStartDate(o.getTimeAnomalyEventStartDate());
            timeAnomalyEventEndDate(o.getTimeAnomalyEventEndDate());
            region(o.getRegion());
            costImpact(o.getCostImpact());
            costImpactPercentage(o.getCostImpactPercentage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeCostAnomalyEventAnalyticsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeCostAnomalyEventAnalyticsRequest
         */
        public SummarizeCostAnomalyEventAnalyticsRequest build() {
            SummarizeCostAnomalyEventAnalyticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeCostAnomalyEventAnalyticsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeCostAnomalyEventAnalyticsRequest
         */
        public SummarizeCostAnomalyEventAnalyticsRequest buildWithoutInvocationCallback() {
            SummarizeCostAnomalyEventAnalyticsRequest request =
                    new SummarizeCostAnomalyEventAnalyticsRequest();
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.name = name;
            request.costAnomalyMonitorId = costAnomalyMonitorId;
            request.targetTenantId = targetTenantId;
            request.timeAnomalyEventStartDate = timeAnomalyEventStartDate;
            request.timeAnomalyEventEndDate = timeAnomalyEventEndDate;
            request.region = region;
            request.costImpact = costImpact;
            request.costImpactPercentage = costImpactPercentage;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeCostAnomalyEventAnalyticsRequest(compartmentId, limit, page, sortOrder,
            // sortBy, name, costAnomalyMonitorId, targetTenantId, timeAnomalyEventStartDate,
            // timeAnomalyEventEndDate, region, costImpact, costImpactPercentage, opcRequestId);
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
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .name(name)
                .costAnomalyMonitorId(costAnomalyMonitorId)
                .targetTenantId(targetTenantId)
                .timeAnomalyEventStartDate(timeAnomalyEventStartDate)
                .timeAnomalyEventEndDate(timeAnomalyEventEndDate)
                .region(region)
                .costImpact(costImpact)
                .costImpactPercentage(costImpactPercentage)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",costAnomalyMonitorId=").append(String.valueOf(this.costAnomalyMonitorId));
        sb.append(",targetTenantId=").append(String.valueOf(this.targetTenantId));
        sb.append(",timeAnomalyEventStartDate=")
                .append(String.valueOf(this.timeAnomalyEventStartDate));
        sb.append(",timeAnomalyEventEndDate=").append(String.valueOf(this.timeAnomalyEventEndDate));
        sb.append(",region=").append(String.valueOf(this.region));
        sb.append(",costImpact=").append(String.valueOf(this.costImpact));
        sb.append(",costImpactPercentage=").append(String.valueOf(this.costImpactPercentage));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeCostAnomalyEventAnalyticsRequest)) {
            return false;
        }

        SummarizeCostAnomalyEventAnalyticsRequest other =
                (SummarizeCostAnomalyEventAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.costAnomalyMonitorId, other.costAnomalyMonitorId)
                && java.util.Objects.equals(this.targetTenantId, other.targetTenantId)
                && java.util.Objects.equals(
                        this.timeAnomalyEventStartDate, other.timeAnomalyEventStartDate)
                && java.util.Objects.equals(
                        this.timeAnomalyEventEndDate, other.timeAnomalyEventEndDate)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.costImpact, other.costImpact)
                && java.util.Objects.equals(this.costImpactPercentage, other.costImpactPercentage)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.costAnomalyMonitorId == null
                                ? 43
                                : this.costAnomalyMonitorId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetTenantId == null ? 43 : this.targetTenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAnomalyEventStartDate == null
                                ? 43
                                : this.timeAnomalyEventStartDate.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAnomalyEventEndDate == null
                                ? 43
                                : this.timeAnomalyEventEndDate.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.costImpact == null ? 43 : this.costImpact.hashCode());
        result =
                (result * PRIME)
                        + (this.costImpactPercentage == null
                                ? 43
                                : this.costImpactPercentage.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
