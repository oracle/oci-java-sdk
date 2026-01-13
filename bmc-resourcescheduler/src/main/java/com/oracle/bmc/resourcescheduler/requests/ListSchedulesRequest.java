/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.requests;

import com.oracle.bmc.resourcescheduler.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcescheduler/ListSchedulesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSchedulesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class ListSchedulesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * This is a filter to return only resources that match the given lifecycle state. The state
     * value is case-insensitive.
     */
    private com.oracle.bmc.resourcescheduler.model.Schedule.LifecycleState lifecycleState;

    /**
     * This is a filter to return only resources that match the given lifecycle state. The state
     * value is case-insensitive.
     */
    public com.oracle.bmc.resourcescheduler.model.Schedule.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** This is a filter to return only resources that match the given display name exactly. */
    private String displayName;

    /** This is a filter to return only resources that match the given display name exactly. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the schedule.
     */
    private String scheduleId;

    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the schedule.
     */
    public String getScheduleId() {
        return scheduleId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * This used for list pagination. The value of the opc-next-page response header from the
     * previous "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * This used for list pagination. The value of the opc-next-page response header from the
     * previous "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * This is the field to sort by. You can provide only one sort order. The default order for
     * {@code timeCreated} is descending. The default order for {@code displayName} is ascending.
     */
    private SortBy sortBy;

    /**
     * This is the field to sort by. You can provide only one sort order. The default order for
     * {@code timeCreated} is descending. The default order for {@code displayName} is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        LifecycleState("lifecycleState"),
        State("state"),
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
     * This is the field to sort by. You can provide only one sort order. The default order for
     * {@code timeCreated} is descending. The default order for {@code displayName} is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * This is the sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    private com.oracle.bmc.resourcescheduler.model.SortOrder sortOrder;

    /**
     * This is the sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    public com.oracle.bmc.resourcescheduler.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact Oracle
     * about a particular request, please provide the request ID. The only valid characters for
     * request IDs are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact Oracle
     * about a particular request, please provide the request ID. The only valid characters for
     * request IDs are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resource affected by the work request.
     */
    private String resourceId;

    /**
     * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the resource affected by the work request.
     */
    public String getResourceId() {
        return resourceId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSchedulesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * This is a filter to return only resources that match the given lifecycle state. The state
         * value is case-insensitive.
         */
        private com.oracle.bmc.resourcescheduler.model.Schedule.LifecycleState lifecycleState =
                null;

        /**
         * This is a filter to return only resources that match the given lifecycle state. The state
         * value is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.resourcescheduler.model.Schedule.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** This is a filter to return only resources that match the given display name exactly. */
        private String displayName = null;

        /**
         * This is a filter to return only resources that match the given display name exactly.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the schedule.
         */
        private String scheduleId = null;

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the schedule.
         *
         * @param scheduleId the value to set
         * @return this builder instance
         */
        public Builder scheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * This used for list pagination. The value of the opc-next-page response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * This used for list pagination. The value of the opc-next-page response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * This is the field to sort by. You can provide only one sort order. The default order for
         * {@code timeCreated} is descending. The default order for {@code displayName} is
         * ascending.
         */
        private SortBy sortBy = null;

        /**
         * This is the field to sort by. You can provide only one sort order. The default order for
         * {@code timeCreated} is descending. The default order for {@code displayName} is
         * ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * This is the sort order to use, either ascending ({@code ASC}) or descending ({@code
         * DESC}).
         */
        private com.oracle.bmc.resourcescheduler.model.SortOrder sortOrder = null;

        /**
         * This is the sort order to use, either ascending ({@code ASC}) or descending ({@code
         * DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.resourcescheduler.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID. The only valid
         * characters for request IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID. The only valid
         * characters for request IDs are letters, numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the resource affected by the work request.
         */
        private String resourceId = null;

        /**
         * This is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the resource affected by the work request.
         *
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
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
        public Builder copy(ListSchedulesRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            scheduleId(o.getScheduleId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            resourceId(o.getResourceId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSchedulesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSchedulesRequest
         */
        public ListSchedulesRequest build() {
            ListSchedulesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSchedulesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSchedulesRequest
         */
        public ListSchedulesRequest buildWithoutInvocationCallback() {
            ListSchedulesRequest request = new ListSchedulesRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.scheduleId = scheduleId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.resourceId = resourceId;
            return request;
            // new ListSchedulesRequest(compartmentId, lifecycleState, displayName, scheduleId,
            // limit, page, sortBy, sortOrder, opcRequestId, resourceId);
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
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .scheduleId(scheduleId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .resourceId(resourceId);
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
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",scheduleId=").append(String.valueOf(this.scheduleId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSchedulesRequest)) {
            return false;
        }

        ListSchedulesRequest other = (ListSchedulesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.scheduleId, other.scheduleId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.resourceId, other.resourceId);
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.scheduleId == null ? 43 : this.scheduleId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        return result;
    }
}
