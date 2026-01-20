/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListContainersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListContainersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class ListContainersRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** The Fleet-unique identifier of the managed instance. */
    private String managedInstanceId;

    /** The Fleet-unique identifier of the managed instance. */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /** The display name. */
    private String displayName;

    /** The display name. */
    public String getDisplayName() {
        return displayName;
    }
    /** The name of the application. */
    private String applicationName;

    /** The name of the application. */
    public String getApplicationName() {
        return applicationName;
    }
    /** The version of the related Java Runtime. */
    private String jreVersion;

    /** The version of the related Java Runtime. */
    public String getJreVersion() {
        return jreVersion;
    }
    /** The security status of the Java Runtime. */
    private com.oracle.bmc.jms.model.JreSecurityStatus jreSecurityStatus;

    /** The security status of the Java Runtime. */
    public com.oracle.bmc.jms.model.JreSecurityStatus getJreSecurityStatus() {
        return jreSecurityStatus;
    }
    /**
     * If specified, only containers with a start time later than or equal to this parameter will be
     * included in the response (formatted according to RFC3339).
     */
    private java.util.Date timeStartedGreaterThanOrEqualTo;

    /**
     * If specified, only containers with a start time later than or equal to this parameter will be
     * included in the response (formatted according to RFC3339).
     */
    public java.util.Date getTimeStartedGreaterThanOrEqualTo() {
        return timeStartedGreaterThanOrEqualTo;
    }
    /**
     * If specified, only containers with a start time earlier than or equal to this parameter will
     * be included in the response (formatted according to RFC3339).
     */
    private java.util.Date timeStartedLessThanOrEqualTo;

    /**
     * If specified, only containers with a start time earlier than or equal to this parameter will
     * be included in the response (formatted according to RFC3339).
     */
    public java.util.Date getTimeStartedLessThanOrEqualTo() {
        return timeStartedLessThanOrEqualTo;
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
     * The field to sort the containers. Only one sort order can be provided. Default order for
     * _displayName_, _namespace_, _podName_, _applicationName_, or _jreVersion_ is **ascending**.
     * Default order for _timeStarted_ is **descending**. If no value is specified _timeStarted_ is
     * default.
     */
    private com.oracle.bmc.jms.model.ContainerSortBy sortBy;

    /**
     * The field to sort the containers. Only one sort order can be provided. Default order for
     * _displayName_, _namespace_, _podName_, _applicationName_, or _jreVersion_ is **ascending**.
     * Default order for _timeStarted_ is **descending**. If no value is specified _timeStarted_ is
     * default.
     */
    public com.oracle.bmc.jms.model.ContainerSortBy getSortBy() {
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
                    ListContainersRequest, java.lang.Void> {
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

        /** The display name. */
        private String displayName = null;

        /**
         * The display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The name of the application. */
        private String applicationName = null;

        /**
         * The name of the application.
         *
         * @param applicationName the value to set
         * @return this builder instance
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /** The version of the related Java Runtime. */
        private String jreVersion = null;

        /**
         * The version of the related Java Runtime.
         *
         * @param jreVersion the value to set
         * @return this builder instance
         */
        public Builder jreVersion(String jreVersion) {
            this.jreVersion = jreVersion;
            return this;
        }

        /** The security status of the Java Runtime. */
        private com.oracle.bmc.jms.model.JreSecurityStatus jreSecurityStatus = null;

        /**
         * The security status of the Java Runtime.
         *
         * @param jreSecurityStatus the value to set
         * @return this builder instance
         */
        public Builder jreSecurityStatus(
                com.oracle.bmc.jms.model.JreSecurityStatus jreSecurityStatus) {
            this.jreSecurityStatus = jreSecurityStatus;
            return this;
        }

        /**
         * If specified, only containers with a start time later than or equal to this parameter
         * will be included in the response (formatted according to RFC3339).
         */
        private java.util.Date timeStartedGreaterThanOrEqualTo = null;

        /**
         * If specified, only containers with a start time later than or equal to this parameter
         * will be included in the response (formatted according to RFC3339).
         *
         * @param timeStartedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeStartedGreaterThanOrEqualTo(
                java.util.Date timeStartedGreaterThanOrEqualTo) {
            this.timeStartedGreaterThanOrEqualTo = timeStartedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * If specified, only containers with a start time earlier than or equal to this parameter
         * will be included in the response (formatted according to RFC3339).
         */
        private java.util.Date timeStartedLessThanOrEqualTo = null;

        /**
         * If specified, only containers with a start time earlier than or equal to this parameter
         * will be included in the response (formatted according to RFC3339).
         *
         * @param timeStartedLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeStartedLessThanOrEqualTo(java.util.Date timeStartedLessThanOrEqualTo) {
            this.timeStartedLessThanOrEqualTo = timeStartedLessThanOrEqualTo;
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
         * The field to sort the containers. Only one sort order can be provided. Default order for
         * _displayName_, _namespace_, _podName_, _applicationName_, or _jreVersion_ is
         * **ascending**. Default order for _timeStarted_ is **descending**. If no value is
         * specified _timeStarted_ is default.
         */
        private com.oracle.bmc.jms.model.ContainerSortBy sortBy = null;

        /**
         * The field to sort the containers. Only one sort order can be provided. Default order for
         * _displayName_, _namespace_, _podName_, _applicationName_, or _jreVersion_ is
         * **ascending**. Default order for _timeStarted_ is **descending**. If no value is
         * specified _timeStarted_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.ContainerSortBy sortBy) {
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
        public Builder copy(ListContainersRequest o) {
            fleetId(o.getFleetId());
            managedInstanceId(o.getManagedInstanceId());
            displayName(o.getDisplayName());
            applicationName(o.getApplicationName());
            jreVersion(o.getJreVersion());
            jreSecurityStatus(o.getJreSecurityStatus());
            timeStartedGreaterThanOrEqualTo(o.getTimeStartedGreaterThanOrEqualTo());
            timeStartedLessThanOrEqualTo(o.getTimeStartedLessThanOrEqualTo());
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
         * Build the instance of ListContainersRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListContainersRequest
         */
        public ListContainersRequest build() {
            ListContainersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListContainersRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListContainersRequest
         */
        public ListContainersRequest buildWithoutInvocationCallback() {
            ListContainersRequest request = new ListContainersRequest();
            request.fleetId = fleetId;
            request.managedInstanceId = managedInstanceId;
            request.displayName = displayName;
            request.applicationName = applicationName;
            request.jreVersion = jreVersion;
            request.jreSecurityStatus = jreSecurityStatus;
            request.timeStartedGreaterThanOrEqualTo = timeStartedGreaterThanOrEqualTo;
            request.timeStartedLessThanOrEqualTo = timeStartedLessThanOrEqualTo;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListContainersRequest(fleetId, managedInstanceId, displayName, applicationName,
            // jreVersion, jreSecurityStatus, timeStartedGreaterThanOrEqualTo,
            // timeStartedLessThanOrEqualTo, limit, page, sortOrder, sortBy, opcRequestId);
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
                .managedInstanceId(managedInstanceId)
                .displayName(displayName)
                .applicationName(applicationName)
                .jreVersion(jreVersion)
                .jreSecurityStatus(jreSecurityStatus)
                .timeStartedGreaterThanOrEqualTo(timeStartedGreaterThanOrEqualTo)
                .timeStartedLessThanOrEqualTo(timeStartedLessThanOrEqualTo)
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",applicationName=").append(String.valueOf(this.applicationName));
        sb.append(",jreVersion=").append(String.valueOf(this.jreVersion));
        sb.append(",jreSecurityStatus=").append(String.valueOf(this.jreSecurityStatus));
        sb.append(",timeStartedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeStartedGreaterThanOrEqualTo));
        sb.append(",timeStartedLessThanOrEqualTo=")
                .append(String.valueOf(this.timeStartedLessThanOrEqualTo));
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
        if (!(o instanceof ListContainersRequest)) {
            return false;
        }

        ListContainersRequest other = (ListContainersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.jreVersion, other.jreVersion)
                && java.util.Objects.equals(this.jreSecurityStatus, other.jreSecurityStatus)
                && java.util.Objects.equals(
                        this.timeStartedGreaterThanOrEqualTo, other.timeStartedGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeStartedLessThanOrEqualTo, other.timeStartedLessThanOrEqualTo)
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
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result = (result * PRIME) + (this.jreVersion == null ? 43 : this.jreVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.jreSecurityStatus == null ? 43 : this.jreSecurityStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeStartedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartedLessThanOrEqualTo == null
                                ? 43
                                : this.timeStartedLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
