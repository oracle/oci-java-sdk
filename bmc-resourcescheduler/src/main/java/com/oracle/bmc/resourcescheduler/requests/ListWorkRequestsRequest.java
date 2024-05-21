/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.requests;

import com.oracle.bmc.resourcescheduler.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcescheduler/ListWorkRequestsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListWorkRequestsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
public class ListWorkRequestsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request.
     */
    private String workRequestId;

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request.
     */
    public String getWorkRequestId() {
        return workRequestId;
    }
    /**
     * This is a filter to return only the resources that match the given lifecycle state.
     */
    private com.oracle.bmc.resourcescheduler.model.OperationStatus status;

    /**
     * This is a filter to return only the resources that match the given lifecycle state.
     */
    public com.oracle.bmc.resourcescheduler.model.OperationStatus getStatus() {
        return status;
    }
    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource affected by the work request.
     */
    private String resourceId;

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource affected by the work request.
     */
    public String getResourceId() {
        return resourceId;
    }
    /**
     * This used for list pagination. The value of the opc-next-page response header from the previous
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * This used for list pagination. The value of the opc-next-page response header from the previous
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public Integer getLimit() {
        return limit;
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
     * This is the field to sort by. Only one sort order may be provided. Default order for {@code timeAccepted} is descending.
     *
     */
    private SortBy sortBy;

    /**
     * This is the field to sort by. Only one sort order may be provided. Default order for {@code timeAccepted} is descending.
     *
     **/
    public enum SortBy {
        TimeAccepted("timeAccepted"),
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
     * This is the field to sort by. Only one sort order may be provided. Default order for {@code timeAccepted} is descending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
     */
    private String scheduleId;

    /**
     * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
     */
    public String getScheduleId() {
        return scheduleId;
    }
    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    private String opcRequestId;

    /**
     * This is a unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     * The only valid characters for request IDs are letters, numbers,
     * underscore, and dash.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListWorkRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request.
         */
        private String workRequestId = null;

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the asynchronous work request.
         * @param workRequestId the value to set
         * @return this builder instance
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            return this;
        }

        /**
         * This is a filter to return only the resources that match the given lifecycle state.
         */
        private com.oracle.bmc.resourcescheduler.model.OperationStatus status = null;

        /**
         * This is a filter to return only the resources that match the given lifecycle state.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(com.oracle.bmc.resourcescheduler.model.OperationStatus status) {
            this.status = status;
            return this;
        }

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource affected by the work request.
         */
        private String resourceId = null;

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource affected by the work request.
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * This used for list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * This used for list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * paginated "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * This is the sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         */
        private com.oracle.bmc.resourcescheduler.model.SortOrder sortOrder = null;

        /**
         * This is the sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.resourcescheduler.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * This is the field to sort by. Only one sort order may be provided. Default order for {@code timeAccepted} is descending.
         *
         */
        private SortBy sortBy = null;

        /**
         * This is the field to sort by. Only one sort order may be provided. Default order for {@code timeAccepted} is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
         */
        private String scheduleId = null;

        /**
         * This is the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the schedule.
         * @param scheduleId the value to set
         * @return this builder instance
         */
        public Builder scheduleId(String scheduleId) {
            this.scheduleId = scheduleId;
            return this;
        }

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
         *
         */
        private String opcRequestId = null;

        /**
         * This is a unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         * The only valid characters for request IDs are letters, numbers,
         * underscore, and dash.
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
        public Builder copy(ListWorkRequestsRequest o) {
            compartmentId(o.getCompartmentId());
            workRequestId(o.getWorkRequestId());
            status(o.getStatus());
            resourceId(o.getResourceId());
            page(o.getPage());
            limit(o.getLimit());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            scheduleId(o.getScheduleId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListWorkRequestsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListWorkRequestsRequest
         */
        public ListWorkRequestsRequest build() {
            ListWorkRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListWorkRequestsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListWorkRequestsRequest
         */
        public ListWorkRequestsRequest buildWithoutInvocationCallback() {
            ListWorkRequestsRequest request = new ListWorkRequestsRequest();
            request.compartmentId = compartmentId;
            request.workRequestId = workRequestId;
            request.status = status;
            request.resourceId = resourceId;
            request.page = page;
            request.limit = limit;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.scheduleId = scheduleId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListWorkRequestsRequest(compartmentId, workRequestId, status, resourceId, page, limit, sortOrder, sortBy, scheduleId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .workRequestId(workRequestId)
                .status(status)
                .resourceId(resourceId)
                .page(page)
                .limit(limit)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .scheduleId(scheduleId)
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
        sb.append(",workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",scheduleId=").append(String.valueOf(this.scheduleId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListWorkRequestsRequest)) {
            return false;
        }

        ListWorkRequestsRequest other = (ListWorkRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.scheduleId, other.scheduleId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
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
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.scheduleId == null ? 43 : this.scheduleId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
