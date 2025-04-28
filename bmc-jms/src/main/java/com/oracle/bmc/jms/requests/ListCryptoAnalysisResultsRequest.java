/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListCryptoAnalysisResultsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListCryptoAnalysisResultsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class ListCryptoAnalysisResultsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    private String fleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    public String getFleetId() {
        return fleetId;
    }
    /** The aggregation mode of the crypto event analysis result. */
    private com.oracle.bmc.jms.model.CryptoAnalysisResultMode aggregationMode;

    /** The aggregation mode of the crypto event analysis result. */
    public com.oracle.bmc.jms.model.CryptoAnalysisResultMode getAggregationMode() {
        return aggregationMode;
    }
    /** The Fleet-unique identifier of the related managed instance. */
    private String managedInstanceId;

    /** The Fleet-unique identifier of the related managed instance. */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * The host [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance.
     */
    private String hostName;

    /**
     * The host [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance.
     */
    public String getHostName() {
        return hostName;
    }
    /** Non Compliant Finding Count of CryptoAnalysis Report. */
    private Integer nonCompliantFindingCount;

    /** Non Compliant Finding Count of CryptoAnalysis Report. */
    public Integer getNonCompliantFindingCount() {
        return nonCompliantFindingCount;
    }
    /** Non Compliant Finding Count of CryptoAnalysis Report. */
    private Integer nonCompliantFindingCountGreaterThan;

    /** Non Compliant Finding Count of CryptoAnalysis Report. */
    public Integer getNonCompliantFindingCountGreaterThan() {
        return nonCompliantFindingCountGreaterThan;
    }
    /** FindingCount of CryptoAnalysis Report. */
    private Integer findingCount;

    /** FindingCount of CryptoAnalysis Report. */
    public Integer getFindingCount() {
        return findingCount;
    }
    /** FindingCount of CryptoAnalysis Report. */
    private Integer findingCountGreaterThan;

    /** FindingCount of CryptoAnalysis Report. */
    public Integer getFindingCountGreaterThan() {
        return findingCountGreaterThan;
    }
    /**
     * The start of the time period during which resources are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeStart;

    /**
     * The start of the time period during which resources are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * The end of the time period during which resources are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeEnd;

    /**
     * The end of the time period during which resources are searched (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. The token is
     * usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. The token is
     * usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order, either 'asc' or 'desc'. */
    private com.oracle.bmc.jms.model.SortOrder sortOrder;

    /** The sort order, either 'asc' or 'desc'. */
    public com.oracle.bmc.jms.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort crypto event analysis results. Only one sort order can be provided. Default
     * order for _timeCreated_, and _jreVersion_ is **descending**. Default order for
     * _managedInstanceId_, _jreDistribution_, _jreVendor_ and _osName_ is **ascending**. If no
     * value is specified _timeCreated_ is default.
     */
    private com.oracle.bmc.jms.model.CryptoAnalysisResultSortBy sortBy;

    /**
     * The field to sort crypto event analysis results. Only one sort order can be provided. Default
     * order for _timeCreated_, and _jreVersion_ is **descending**. Default order for
     * _managedInstanceId_, _jreDistribution_, _jreVendor_ and _osName_ is **ascending**. If no
     * value is specified _timeCreated_ is default.
     */
    public com.oracle.bmc.jms.model.CryptoAnalysisResultSortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCryptoAnalysisResultsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        private String fleetId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /** The aggregation mode of the crypto event analysis result. */
        private com.oracle.bmc.jms.model.CryptoAnalysisResultMode aggregationMode = null;

        /**
         * The aggregation mode of the crypto event analysis result.
         *
         * @param aggregationMode the value to set
         * @return this builder instance
         */
        public Builder aggregationMode(
                com.oracle.bmc.jms.model.CryptoAnalysisResultMode aggregationMode) {
            this.aggregationMode = aggregationMode;
            return this;
        }

        /** The Fleet-unique identifier of the related managed instance. */
        private String managedInstanceId = null;

        /**
         * The Fleet-unique identifier of the related managed instance.
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * The host [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the managed instance.
         */
        private String hostName = null;

        /**
         * The host [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * the managed instance.
         *
         * @param hostName the value to set
         * @return this builder instance
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            return this;
        }

        /** Non Compliant Finding Count of CryptoAnalysis Report. */
        private Integer nonCompliantFindingCount = null;

        /**
         * Non Compliant Finding Count of CryptoAnalysis Report.
         *
         * @param nonCompliantFindingCount the value to set
         * @return this builder instance
         */
        public Builder nonCompliantFindingCount(Integer nonCompliantFindingCount) {
            this.nonCompliantFindingCount = nonCompliantFindingCount;
            return this;
        }

        /** Non Compliant Finding Count of CryptoAnalysis Report. */
        private Integer nonCompliantFindingCountGreaterThan = null;

        /**
         * Non Compliant Finding Count of CryptoAnalysis Report.
         *
         * @param nonCompliantFindingCountGreaterThan the value to set
         * @return this builder instance
         */
        public Builder nonCompliantFindingCountGreaterThan(
                Integer nonCompliantFindingCountGreaterThan) {
            this.nonCompliantFindingCountGreaterThan = nonCompliantFindingCountGreaterThan;
            return this;
        }

        /** FindingCount of CryptoAnalysis Report. */
        private Integer findingCount = null;

        /**
         * FindingCount of CryptoAnalysis Report.
         *
         * @param findingCount the value to set
         * @return this builder instance
         */
        public Builder findingCount(Integer findingCount) {
            this.findingCount = findingCount;
            return this;
        }

        /** FindingCount of CryptoAnalysis Report. */
        private Integer findingCountGreaterThan = null;

        /**
         * FindingCount of CryptoAnalysis Report.
         *
         * @param findingCountGreaterThan the value to set
         * @return this builder instance
         */
        public Builder findingCountGreaterThan(Integer findingCountGreaterThan) {
            this.findingCountGreaterThan = findingCountGreaterThan;
            return this;
        }

        /**
         * The start of the time period during which resources are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeStart = null;

        /**
         * The start of the time period during which resources are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * The end of the time period during which resources are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeEnd = null;

        /**
         * The end of the time period during which resources are searched (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
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
         * The page token representing the page at which to start retrieving results. The token is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. The token is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order, either 'asc' or 'desc'. */
        private com.oracle.bmc.jms.model.SortOrder sortOrder = null;

        /**
         * The sort order, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.jms.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort crypto event analysis results. Only one sort order can be provided.
         * Default order for _timeCreated_, and _jreVersion_ is **descending**. Default order for
         * _managedInstanceId_, _jreDistribution_, _jreVendor_ and _osName_ is **ascending**. If no
         * value is specified _timeCreated_ is default.
         */
        private com.oracle.bmc.jms.model.CryptoAnalysisResultSortBy sortBy = null;

        /**
         * The field to sort crypto event analysis results. Only one sort order can be provided.
         * Default order for _timeCreated_, and _jreVersion_ is **descending**. Default order for
         * _managedInstanceId_, _jreDistribution_, _jreVendor_ and _osName_ is **ascending**. If no
         * value is specified _timeCreated_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.CryptoAnalysisResultSortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListCryptoAnalysisResultsRequest o) {
            fleetId(o.getFleetId());
            aggregationMode(o.getAggregationMode());
            managedInstanceId(o.getManagedInstanceId());
            hostName(o.getHostName());
            nonCompliantFindingCount(o.getNonCompliantFindingCount());
            nonCompliantFindingCountGreaterThan(o.getNonCompliantFindingCountGreaterThan());
            findingCount(o.getFindingCount());
            findingCountGreaterThan(o.getFindingCountGreaterThan());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCryptoAnalysisResultsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCryptoAnalysisResultsRequest
         */
        public ListCryptoAnalysisResultsRequest build() {
            ListCryptoAnalysisResultsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCryptoAnalysisResultsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCryptoAnalysisResultsRequest
         */
        public ListCryptoAnalysisResultsRequest buildWithoutInvocationCallback() {
            ListCryptoAnalysisResultsRequest request = new ListCryptoAnalysisResultsRequest();
            request.fleetId = fleetId;
            request.aggregationMode = aggregationMode;
            request.managedInstanceId = managedInstanceId;
            request.hostName = hostName;
            request.nonCompliantFindingCount = nonCompliantFindingCount;
            request.nonCompliantFindingCountGreaterThan = nonCompliantFindingCountGreaterThan;
            request.findingCount = findingCount;
            request.findingCountGreaterThan = findingCountGreaterThan;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCryptoAnalysisResultsRequest(fleetId, aggregationMode, managedInstanceId,
            // hostName, nonCompliantFindingCount, nonCompliantFindingCountGreaterThan,
            // findingCount, findingCountGreaterThan, timeStart, timeEnd, limit, page, sortOrder,
            // sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .fleetId(fleetId)
                .aggregationMode(aggregationMode)
                .managedInstanceId(managedInstanceId)
                .hostName(hostName)
                .nonCompliantFindingCount(nonCompliantFindingCount)
                .nonCompliantFindingCountGreaterThan(nonCompliantFindingCountGreaterThan)
                .findingCount(findingCount)
                .findingCountGreaterThan(findingCountGreaterThan)
                .timeStart(timeStart)
                .timeEnd(timeEnd)
                .limit(limit)
                .page(page)
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
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",aggregationMode=").append(String.valueOf(this.aggregationMode));
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",hostName=").append(String.valueOf(this.hostName));
        sb.append(",nonCompliantFindingCount=")
                .append(String.valueOf(this.nonCompliantFindingCount));
        sb.append(",nonCompliantFindingCountGreaterThan=")
                .append(String.valueOf(this.nonCompliantFindingCountGreaterThan));
        sb.append(",findingCount=").append(String.valueOf(this.findingCount));
        sb.append(",findingCountGreaterThan=").append(String.valueOf(this.findingCountGreaterThan));
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
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
        if (!(o instanceof ListCryptoAnalysisResultsRequest)) {
            return false;
        }

        ListCryptoAnalysisResultsRequest other = (ListCryptoAnalysisResultsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.aggregationMode, other.aggregationMode)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(
                        this.nonCompliantFindingCount, other.nonCompliantFindingCount)
                && java.util.Objects.equals(
                        this.nonCompliantFindingCountGreaterThan,
                        other.nonCompliantFindingCountGreaterThan)
                && java.util.Objects.equals(this.findingCount, other.findingCount)
                && java.util.Objects.equals(
                        this.findingCountGreaterThan, other.findingCountGreaterThan)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregationMode == null ? 43 : this.aggregationMode.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.nonCompliantFindingCount == null
                                ? 43
                                : this.nonCompliantFindingCount.hashCode());
        result =
                (result * PRIME)
                        + (this.nonCompliantFindingCountGreaterThan == null
                                ? 43
                                : this.nonCompliantFindingCountGreaterThan.hashCode());
        result = (result * PRIME) + (this.findingCount == null ? 43 : this.findingCount.hashCode());
        result =
                (result * PRIME)
                        + (this.findingCountGreaterThan == null
                                ? 43
                                : this.findingCountGreaterThan.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
