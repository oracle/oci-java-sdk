/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/SummarizeLibraryUsageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeLibraryUsageRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class SummarizeLibraryUsageRequest
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
    /** The Java Server instance key. */
    private String serverInstanceKey;

    /** The Java Server instance key. */
    public String getServerInstanceKey() {
        return serverInstanceKey;
    }
    /** The Fleet-unique identifier of the managed instance. */
    private String managedInstanceId;

    /** The Fleet-unique identifier of the managed instance. */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /** The deployed application key. */
    private String applicationKey;

    /** The deployed application key. */
    public String getApplicationKey() {
        return applicationKey;
    }
    /** The library key. */
    private String libraryKey;

    /** The library key. */
    public String getLibraryKey() {
        return libraryKey;
    }
    /** Filter the list with library name contains the given value. */
    private String libraryNameContains;

    /** Filter the list with library name contains the given value. */
    public String getLibraryNameContains() {
        return libraryNameContains;
    }
    /** The library name. */
    private String libraryName;

    /** The library name. */
    public String getLibraryName() {
        return libraryName;
    }
    /** Total Common Vulnerability Scoring System (CVSS) Score reported by the analysis. */
    private Integer cvssScoreGreaterThan;

    /** Total Common Vulnerability Scoring System (CVSS) Score reported by the analysis. */
    public Integer getCvssScoreGreaterThan() {
        return cvssScoreGreaterThan;
    }
    /** Total Common Vulnerability Scoring System (CVSS) Score reported by the analysis. */
    private Integer cvssScoreLessThan;

    /** Total Common Vulnerability Scoring System (CVSS) Score reported by the analysis. */
    public Integer getCvssScoreLessThan() {
        return cvssScoreLessThan;
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
     * The field to sort libraries. Only one sort order may be provided. If no value is specified
     * _timeLastSeen_ is default.
     */
    private com.oracle.bmc.jms.model.LibrarySortBy sortBy;

    /**
     * The field to sort libraries. Only one sort order may be provided. If no value is specified
     * _timeLastSeen_ is default.
     */
    public com.oracle.bmc.jms.model.LibrarySortBy getSortBy() {
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
                    SummarizeLibraryUsageRequest, java.lang.Void> {
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

        /** The Java Server instance key. */
        private String serverInstanceKey = null;

        /**
         * The Java Server instance key.
         *
         * @param serverInstanceKey the value to set
         * @return this builder instance
         */
        public Builder serverInstanceKey(String serverInstanceKey) {
            this.serverInstanceKey = serverInstanceKey;
            return this;
        }

        /** The Fleet-unique identifier of the managed instance. */
        private String managedInstanceId = null;

        /**
         * The Fleet-unique identifier of the managed instance.
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /** The deployed application key. */
        private String applicationKey = null;

        /**
         * The deployed application key.
         *
         * @param applicationKey the value to set
         * @return this builder instance
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }

        /** The library key. */
        private String libraryKey = null;

        /**
         * The library key.
         *
         * @param libraryKey the value to set
         * @return this builder instance
         */
        public Builder libraryKey(String libraryKey) {
            this.libraryKey = libraryKey;
            return this;
        }

        /** Filter the list with library name contains the given value. */
        private String libraryNameContains = null;

        /**
         * Filter the list with library name contains the given value.
         *
         * @param libraryNameContains the value to set
         * @return this builder instance
         */
        public Builder libraryNameContains(String libraryNameContains) {
            this.libraryNameContains = libraryNameContains;
            return this;
        }

        /** The library name. */
        private String libraryName = null;

        /**
         * The library name.
         *
         * @param libraryName the value to set
         * @return this builder instance
         */
        public Builder libraryName(String libraryName) {
            this.libraryName = libraryName;
            return this;
        }

        /** Total Common Vulnerability Scoring System (CVSS) Score reported by the analysis. */
        private Integer cvssScoreGreaterThan = null;

        /**
         * Total Common Vulnerability Scoring System (CVSS) Score reported by the analysis.
         *
         * @param cvssScoreGreaterThan the value to set
         * @return this builder instance
         */
        public Builder cvssScoreGreaterThan(Integer cvssScoreGreaterThan) {
            this.cvssScoreGreaterThan = cvssScoreGreaterThan;
            return this;
        }

        /** Total Common Vulnerability Scoring System (CVSS) Score reported by the analysis. */
        private Integer cvssScoreLessThan = null;

        /**
         * Total Common Vulnerability Scoring System (CVSS) Score reported by the analysis.
         *
         * @param cvssScoreLessThan the value to set
         * @return this builder instance
         */
        public Builder cvssScoreLessThan(Integer cvssScoreLessThan) {
            this.cvssScoreLessThan = cvssScoreLessThan;
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
         * The field to sort libraries. Only one sort order may be provided. If no value is
         * specified _timeLastSeen_ is default.
         */
        private com.oracle.bmc.jms.model.LibrarySortBy sortBy = null;

        /**
         * The field to sort libraries. Only one sort order may be provided. If no value is
         * specified _timeLastSeen_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.LibrarySortBy sortBy) {
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
        public Builder copy(SummarizeLibraryUsageRequest o) {
            fleetId(o.getFleetId());
            serverInstanceKey(o.getServerInstanceKey());
            managedInstanceId(o.getManagedInstanceId());
            applicationKey(o.getApplicationKey());
            libraryKey(o.getLibraryKey());
            libraryNameContains(o.getLibraryNameContains());
            libraryName(o.getLibraryName());
            cvssScoreGreaterThan(o.getCvssScoreGreaterThan());
            cvssScoreLessThan(o.getCvssScoreLessThan());
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
         * Build the instance of SummarizeLibraryUsageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeLibraryUsageRequest
         */
        public SummarizeLibraryUsageRequest build() {
            SummarizeLibraryUsageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeLibraryUsageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeLibraryUsageRequest
         */
        public SummarizeLibraryUsageRequest buildWithoutInvocationCallback() {
            SummarizeLibraryUsageRequest request = new SummarizeLibraryUsageRequest();
            request.fleetId = fleetId;
            request.serverInstanceKey = serverInstanceKey;
            request.managedInstanceId = managedInstanceId;
            request.applicationKey = applicationKey;
            request.libraryKey = libraryKey;
            request.libraryNameContains = libraryNameContains;
            request.libraryName = libraryName;
            request.cvssScoreGreaterThan = cvssScoreGreaterThan;
            request.cvssScoreLessThan = cvssScoreLessThan;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeLibraryUsageRequest(fleetId, serverInstanceKey, managedInstanceId,
            // applicationKey, libraryKey, libraryNameContains, libraryName, cvssScoreGreaterThan,
            // cvssScoreLessThan, timeStart, timeEnd, limit, page, sortOrder, sortBy, opcRequestId);
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
                .serverInstanceKey(serverInstanceKey)
                .managedInstanceId(managedInstanceId)
                .applicationKey(applicationKey)
                .libraryKey(libraryKey)
                .libraryNameContains(libraryNameContains)
                .libraryName(libraryName)
                .cvssScoreGreaterThan(cvssScoreGreaterThan)
                .cvssScoreLessThan(cvssScoreLessThan)
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
        sb.append(",serverInstanceKey=").append(String.valueOf(this.serverInstanceKey));
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(",libraryKey=").append(String.valueOf(this.libraryKey));
        sb.append(",libraryNameContains=").append(String.valueOf(this.libraryNameContains));
        sb.append(",libraryName=").append(String.valueOf(this.libraryName));
        sb.append(",cvssScoreGreaterThan=").append(String.valueOf(this.cvssScoreGreaterThan));
        sb.append(",cvssScoreLessThan=").append(String.valueOf(this.cvssScoreLessThan));
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
        if (!(o instanceof SummarizeLibraryUsageRequest)) {
            return false;
        }

        SummarizeLibraryUsageRequest other = (SummarizeLibraryUsageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.serverInstanceKey, other.serverInstanceKey)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.libraryKey, other.libraryKey)
                && java.util.Objects.equals(this.libraryNameContains, other.libraryNameContains)
                && java.util.Objects.equals(this.libraryName, other.libraryName)
                && java.util.Objects.equals(this.cvssScoreGreaterThan, other.cvssScoreGreaterThan)
                && java.util.Objects.equals(this.cvssScoreLessThan, other.cvssScoreLessThan)
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
                        + (this.serverInstanceKey == null ? 43 : this.serverInstanceKey.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result = (result * PRIME) + (this.libraryKey == null ? 43 : this.libraryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.libraryNameContains == null
                                ? 43
                                : this.libraryNameContains.hashCode());
        result = (result * PRIME) + (this.libraryName == null ? 43 : this.libraryName.hashCode());
        result =
                (result * PRIME)
                        + (this.cvssScoreGreaterThan == null
                                ? 43
                                : this.cvssScoreGreaterThan.hashCode());
        result =
                (result * PRIME)
                        + (this.cvssScoreLessThan == null ? 43 : this.cvssScoreLessThan.hashCode());
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
