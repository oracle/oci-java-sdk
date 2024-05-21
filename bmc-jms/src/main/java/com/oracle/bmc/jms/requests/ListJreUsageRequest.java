/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListJreUsageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJreUsageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class ListJreUsageRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     *
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The host [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the managed instance.
     */
    private String hostId;

    /**
     * The host [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the managed instance.
     */
    public String getHostId() {
        return hostId;
    }
    /**
     * The Fleet-unique identifier of the application.
     */
    private String applicationId;

    /**
     * The Fleet-unique identifier of the application.
     */
    public String getApplicationId() {
        return applicationId;
    }
    /**
     * The name of the application.
     */
    private String applicationName;

    /**
     * The name of the application.
     */
    public String getApplicationName() {
        return applicationName;
    }
    /**
     * The start of the time period during which resources are searched (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeStart;

    /**
     * The start of the time period during which resources are searched (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * The end of the time period during which resources are searched (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeEnd;

    /**
     * The end of the time period during which resources are searched (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.jms.model.SortOrder sortOrder;

    /**
     * The sort order, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.jms.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort JRE usages. Only one sort order may be provided.
     * Default order for _timeFirstSeen_, _timeLastSeen_, and _version_ is **descending**.
     * Default order for _timeFirstSeen_, _timeLastSeen_, _version_, _approximateInstallationCount_,
     * _approximateApplicationCount_ and _approximateManagedInstanceCount_  is **descending**.
     * Default order for _distribution_, _vendor_, and _osName_ is **ascending**.
     * If no value is specified _timeLastSeen_ is default.
     *
     */
    private com.oracle.bmc.jms.model.JreSortBy sortBy;

    /**
     * The field to sort JRE usages. Only one sort order may be provided.
     * Default order for _timeFirstSeen_, _timeLastSeen_, and _version_ is **descending**.
     * Default order for _timeFirstSeen_, _timeLastSeen_, _version_, _approximateInstallationCount_,
     * _approximateApplicationCount_ and _approximateManagedInstanceCount_  is **descending**.
     * Default order for _distribution_, _vendor_, and _osName_ is **ascending**.
     * If no value is specified _timeLastSeen_ is default.
     *
     */
    public com.oracle.bmc.jms.model.JreSortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListJreUsageRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         *
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The host [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the managed instance.
         */
        private String hostId = null;

        /**
         * The host [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the managed instance.
         * @param hostId the value to set
         * @return this builder instance
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

        /**
         * The Fleet-unique identifier of the application.
         */
        private String applicationId = null;

        /**
         * The Fleet-unique identifier of the application.
         * @param applicationId the value to set
         * @return this builder instance
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * The name of the application.
         */
        private String applicationName = null;

        /**
         * The name of the application.
         * @param applicationName the value to set
         * @return this builder instance
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The start of the time period during which resources are searched (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeStart = null;

        /**
         * The start of the time period during which resources are searched (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * The end of the time period during which resources are searched (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeEnd = null;

        /**
         * The end of the time period during which resources are searched (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order, either 'asc' or 'desc'.
         */
        private com.oracle.bmc.jms.model.SortOrder sortOrder = null;

        /**
         * The sort order, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.jms.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort JRE usages. Only one sort order may be provided.
         * Default order for _timeFirstSeen_, _timeLastSeen_, and _version_ is **descending**.
         * Default order for _timeFirstSeen_, _timeLastSeen_, _version_, _approximateInstallationCount_,
         * _approximateApplicationCount_ and _approximateManagedInstanceCount_  is **descending**.
         * Default order for _distribution_, _vendor_, and _osName_ is **ascending**.
         * If no value is specified _timeLastSeen_ is default.
         *
         */
        private com.oracle.bmc.jms.model.JreSortBy sortBy = null;

        /**
         * The field to sort JRE usages. Only one sort order may be provided.
         * Default order for _timeFirstSeen_, _timeLastSeen_, and _version_ is **descending**.
         * Default order for _timeFirstSeen_, _timeLastSeen_, _version_, _approximateInstallationCount_,
         * _approximateApplicationCount_ and _approximateManagedInstanceCount_  is **descending**.
         * Default order for _distribution_, _vendor_, and _osName_ is **ascending**.
         * If no value is specified _timeLastSeen_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.JreSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(ListJreUsageRequest o) {
            compartmentId(o.getCompartmentId());
            hostId(o.getHostId());
            applicationId(o.getApplicationId());
            applicationName(o.getApplicationName());
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
         * Build the instance of ListJreUsageRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJreUsageRequest
         */
        public ListJreUsageRequest build() {
            ListJreUsageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJreUsageRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJreUsageRequest
         */
        public ListJreUsageRequest buildWithoutInvocationCallback() {
            ListJreUsageRequest request = new ListJreUsageRequest();
            request.compartmentId = compartmentId;
            request.hostId = hostId;
            request.applicationId = applicationId;
            request.applicationName = applicationName;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJreUsageRequest(compartmentId, hostId, applicationId, applicationName, timeStart, timeEnd, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .hostId(hostId)
                .applicationId(applicationId)
                .applicationName(applicationName)
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
        sb.append(",hostId=").append(String.valueOf(this.hostId));
        sb.append(",applicationId=").append(String.valueOf(this.applicationId));
        sb.append(",applicationName=").append(String.valueOf(this.applicationName));
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
        if (!(o instanceof ListJreUsageRequest)) {
            return false;
        }

        ListJreUsageRequest other = (ListJreUsageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.hostId, other.hostId)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.hostId == null ? 43 : this.hostId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
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
