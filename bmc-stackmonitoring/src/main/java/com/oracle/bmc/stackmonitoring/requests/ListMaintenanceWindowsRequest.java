/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/ListMaintenanceWindowsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMaintenanceWindowsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class ListMaintenanceWindowsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which data is listed.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which data is listed.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return maintenance windows that match exact resource name.
     */
    private String name;

    /**
     * A filter to return maintenance windows that match exact resource name.
     */
    public String getName() {
        return name;
    }
    /**
     * A filter to return maintenance windows with matching lifecycleDetails.
     */
    private com.oracle.bmc.stackmonitoring.model.MaintenanceWindowLifecycleDetails lifecycleDetails;

    /**
     * A filter to return maintenance windows with matching lifecycleDetails.
     */
    public com.oracle.bmc.stackmonitoring.model.MaintenanceWindowLifecycleDetails
            getLifecycleDetails() {
        return lifecycleDetails;
    }
    /**
     * A filter to return only maintenance windows with matching lifecycleState.
     */
    private com.oracle.bmc.stackmonitoring.model.MaintenanceWindowLifecycleState status;

    /**
     * A filter to return only maintenance windows with matching lifecycleState.
     */
    public com.oracle.bmc.stackmonitoring.model.MaintenanceWindowLifecycleState getStatus() {
        return status;
    }
    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending. Default order for mainteance window name is ascending.
     *
     */
    private com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for timeCreated is descending. Default order for mainteance window name is ascending.
     *
     */
    public com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public com.oracle.bmc.stackmonitoring.model.SortOrder getSortOrder() {
        return sortOrder;
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
     * For list pagination. The value of the {@code opc-next-page} response header from the
     * previous "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the
     * previous "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMaintenanceWindowsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which data is listed.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which data is listed.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return maintenance windows that match exact resource name.
         */
        private String name = null;

        /**
         * A filter to return maintenance windows that match exact resource name.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A filter to return maintenance windows with matching lifecycleDetails.
         */
        private com.oracle.bmc.stackmonitoring.model.MaintenanceWindowLifecycleDetails
                lifecycleDetails = null;

        /**
         * A filter to return maintenance windows with matching lifecycleDetails.
         * @param lifecycleDetails the value to set
         * @return this builder instance
         */
        public Builder lifecycleDetails(
                com.oracle.bmc.stackmonitoring.model.MaintenanceWindowLifecycleDetails
                        lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * A filter to return only maintenance windows with matching lifecycleState.
         */
        private com.oracle.bmc.stackmonitoring.model.MaintenanceWindowLifecycleState status = null;

        /**
         * A filter to return only maintenance windows with matching lifecycleState.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.stackmonitoring.model.MaintenanceWindowLifecycleState status) {
            this.status = status;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for timeCreated is descending. Default order for mainteance window name is ascending.
         *
         */
        private com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for timeCreated is descending. Default order for mainteance window name is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.stackmonitoring.model.MaintenanceWindowSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
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
        public Builder copy(ListMaintenanceWindowsRequest o) {
            compartmentId(o.getCompartmentId());
            name(o.getName());
            lifecycleDetails(o.getLifecycleDetails());
            status(o.getStatus());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMaintenanceWindowsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListMaintenanceWindowsRequest
         */
        public ListMaintenanceWindowsRequest build() {
            ListMaintenanceWindowsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMaintenanceWindowsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMaintenanceWindowsRequest
         */
        public ListMaintenanceWindowsRequest buildWithoutInvocationCallback() {
            ListMaintenanceWindowsRequest request = new ListMaintenanceWindowsRequest();
            request.compartmentId = compartmentId;
            request.name = name;
            request.lifecycleDetails = lifecycleDetails;
            request.status = status;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListMaintenanceWindowsRequest(compartmentId, name, lifecycleDetails, status, sortBy, sortOrder, limit, page, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .name(name)
                .lifecycleDetails(lifecycleDetails)
                .status(status)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page)
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
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMaintenanceWindowsRequest)) {
            return false;
        }

        ListMaintenanceWindowsRequest other = (ListMaintenanceWindowsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
