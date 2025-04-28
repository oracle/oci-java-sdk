/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListEventsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListEventsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class ListEventsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Instance Oracle Cloud identifier (ocid) */
    private String managedInstanceId;

    /** Instance Oracle Cloud identifier (ocid) */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Unique event identifier (OCID) */
    private String eventId;

    /** Unique event identifier (OCID) */
    public String getEventId() {
        return eventId;
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
    private SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either 'asc' or 'desc'. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** A filter to return only event of given type. */
    private com.oracle.bmc.osmanagement.model.EventType eventType;

    /** A filter to return only event of given type. */
    public com.oracle.bmc.osmanagement.model.EventType getEventType() {
        return eventType;
    }
    /**
     * filter event occurrence. Selecting only those last occurred before given date in ISO 8601
     * format Example: 2017-07-14T02:40:00.000Z
     */
    private java.util.Date latestTimestampLessThan;

    /**
     * filter event occurrence. Selecting only those last occurred before given date in ISO 8601
     * format Example: 2017-07-14T02:40:00.000Z
     */
    public java.util.Date getLatestTimestampLessThan() {
        return latestTimestampLessThan;
    }
    /**
     * filter event occurrence. Selecting only those last occurred on or after given date in ISO
     * 8601 format Example: 2017-07-14T02:40:00.000Z
     */
    private java.util.Date latestTimestampGreaterThanOrEqualTo;

    /**
     * filter event occurrence. Selecting only those last occurred on or after given date in ISO
     * 8601 format Example: 2017-07-14T02:40:00.000Z
     */
    public java.util.Date getLatestTimestampGreaterThanOrEqualTo() {
        return latestTimestampGreaterThanOrEqualTo;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListEventsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Instance Oracle Cloud identifier (ocid) */
        private String managedInstanceId = null;

        /**
         * Instance Oracle Cloud identifier (ocid)
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

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

        /** Unique event identifier (OCID) */
        private String eventId = null;

        /**
         * Unique event identifier (OCID)
         *
         * @param eventId the value to set
         * @return this builder instance
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
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
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED
         * is descending. Default order for DISPLAYNAME is ascending. If no value is specified
         * TIMECREATED is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED
         * is descending. Default order for DISPLAYNAME is ascending. If no value is specified
         * TIMECREATED is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
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

        /** A filter to return only event of given type. */
        private com.oracle.bmc.osmanagement.model.EventType eventType = null;

        /**
         * A filter to return only event of given type.
         *
         * @param eventType the value to set
         * @return this builder instance
         */
        public Builder eventType(com.oracle.bmc.osmanagement.model.EventType eventType) {
            this.eventType = eventType;
            return this;
        }

        /**
         * filter event occurrence. Selecting only those last occurred before given date in ISO 8601
         * format Example: 2017-07-14T02:40:00.000Z
         */
        private java.util.Date latestTimestampLessThan = null;

        /**
         * filter event occurrence. Selecting only those last occurred before given date in ISO 8601
         * format Example: 2017-07-14T02:40:00.000Z
         *
         * @param latestTimestampLessThan the value to set
         * @return this builder instance
         */
        public Builder latestTimestampLessThan(java.util.Date latestTimestampLessThan) {
            this.latestTimestampLessThan = latestTimestampLessThan;
            return this;
        }

        /**
         * filter event occurrence. Selecting only those last occurred on or after given date in ISO
         * 8601 format Example: 2017-07-14T02:40:00.000Z
         */
        private java.util.Date latestTimestampGreaterThanOrEqualTo = null;

        /**
         * filter event occurrence. Selecting only those last occurred on or after given date in ISO
         * 8601 format Example: 2017-07-14T02:40:00.000Z
         *
         * @param latestTimestampGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder latestTimestampGreaterThanOrEqualTo(
                java.util.Date latestTimestampGreaterThanOrEqualTo) {
            this.latestTimestampGreaterThanOrEqualTo = latestTimestampGreaterThanOrEqualTo;
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
        public Builder copy(ListEventsRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            compartmentId(o.getCompartmentId());
            eventId(o.getEventId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            eventType(o.getEventType());
            latestTimestampLessThan(o.getLatestTimestampLessThan());
            latestTimestampGreaterThanOrEqualTo(o.getLatestTimestampGreaterThanOrEqualTo());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListEventsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListEventsRequest
         */
        public ListEventsRequest build() {
            ListEventsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListEventsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListEventsRequest
         */
        public ListEventsRequest buildWithoutInvocationCallback() {
            ListEventsRequest request = new ListEventsRequest();
            request.managedInstanceId = managedInstanceId;
            request.compartmentId = compartmentId;
            request.eventId = eventId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.eventType = eventType;
            request.latestTimestampLessThan = latestTimestampLessThan;
            request.latestTimestampGreaterThanOrEqualTo = latestTimestampGreaterThanOrEqualTo;
            return request;
            // new ListEventsRequest(managedInstanceId, compartmentId, eventId, limit, page,
            // sortOrder, sortBy, opcRequestId, eventType, latestTimestampLessThan,
            // latestTimestampGreaterThanOrEqualTo);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .compartmentId(compartmentId)
                .eventId(eventId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .eventType(eventType)
                .latestTimestampLessThan(latestTimestampLessThan)
                .latestTimestampGreaterThanOrEqualTo(latestTimestampGreaterThanOrEqualTo);
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",eventId=").append(String.valueOf(this.eventId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",eventType=").append(String.valueOf(this.eventType));
        sb.append(",latestTimestampLessThan=").append(String.valueOf(this.latestTimestampLessThan));
        sb.append(",latestTimestampGreaterThanOrEqualTo=")
                .append(String.valueOf(this.latestTimestampGreaterThanOrEqualTo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListEventsRequest)) {
            return false;
        }

        ListEventsRequest other = (ListEventsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.eventId, other.eventId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.eventType, other.eventType)
                && java.util.Objects.equals(
                        this.latestTimestampLessThan, other.latestTimestampLessThan)
                && java.util.Objects.equals(
                        this.latestTimestampGreaterThanOrEqualTo,
                        other.latestTimestampGreaterThanOrEqualTo);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.eventId == null ? 43 : this.eventId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.eventType == null ? 43 : this.eventType.hashCode());
        result =
                (result * PRIME)
                        + (this.latestTimestampLessThan == null
                                ? 43
                                : this.latestTimestampLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.latestTimestampGreaterThanOrEqualTo == null
                                ? 43
                                : this.latestTimestampGreaterThanOrEqualTo.hashCode());
        return result;
    }
}
