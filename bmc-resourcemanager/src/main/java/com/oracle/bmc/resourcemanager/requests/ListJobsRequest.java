/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.requests;

import com.oracle.bmc.resourcemanager.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/resourcemanager/ListJobsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJobsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
public class ListJobsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /**
     * A filter to return only resources that exist in the compartment, identified by [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    private String compartmentId;

    /**
     * A filter to return only resources that exist in the compartment, identified by [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The stack [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on which to filter.
     *
     */
    private String stackId;

    /**
     * The stack [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on which to filter.
     *
     */
    public String getStackId() {
        return stackId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on which to query for jobs.
     *
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on which to query for jobs.
     *
     */
    public String getId() {
        return id;
    }
    /**
     * A filter that returns all resources that match the specified lifecycle state.
     * The state value is case-insensitive.
     * <p>
     * Allowable values:
     * - ACCEPTED
     * - IN_PROGRESS
     * - FAILED
     * - SUCCEEDED
     * - CANCELING
     * - CANCELED
     *
     */
    private com.oracle.bmc.resourcemanager.model.Job.LifecycleState lifecycleState;

    /**
     * A filter that returns all resources that match the specified lifecycle state.
     * The state value is case-insensitive.
     * <p>
     * Allowable values:
     * - ACCEPTED
     * - IN_PROGRESS
     * - FAILED
     * - SUCCEEDED
     * - CANCELING
     * - CANCELED
     *
     */
    public com.oracle.bmc.resourcemanager.model.Job.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the given display name exactly.
     * Use this filter to list a resource by name.
     * Requires {@code sortBy} set to {@code DISPLAYNAME}.
     * Alternatively, when you know the resource OCID, use the related Get operation.
     *
     */
    private String displayName;

    /**
     * A filter to return only resources that match the given display name exactly.
     * Use this filter to list a resource by name.
     * Requires {@code sortBy} set to {@code DISPLAYNAME}.
     * Alternatively, when you know the resource OCID, use the related Get operation.
     *
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The field to use when sorting returned resources.
     * By default, {@code TIMECREATED} is ordered descending.
     * By default, {@code DISPLAYNAME} is ordered ascending. Note that you can sort only on one field.
     *
     */
    private SortBy sortBy;

    /**
     * The field to use when sorting returned resources.
     * By default, {@code TIMECREATED} is ordered descending.
     * By default, {@code DISPLAYNAME} is ordered ascending. Note that you can sort only on one field.
     *
     **/
    public enum SortBy {
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
     * The field to use when sorting returned resources.
     * By default, {@code TIMECREATED} is ordered descending.
     * By default, {@code DISPLAYNAME} is ordered ascending. Note that you can sort only on one field.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending ({@code DESC}).
     *
     **/
    public enum SortOrder {
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

    /**
     * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The number of items returned in a paginated {@code List} call. For information about pagination, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * The number of items returned in a paginated {@code List} call. For information about pagination, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
     * For information about pagination, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<ListJobsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
         * A filter to return only resources that exist in the compartment, identified by [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         */
        private String compartmentId = null;

        /**
         * A filter to return only resources that exist in the compartment, identified by [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The stack [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on which to filter.
         *
         */
        private String stackId = null;

        /**
         * The stack [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on which to filter.
         *
         * @param stackId the value to set
         * @return this builder instance
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on which to query for jobs.
         *
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on which to query for jobs.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * A filter that returns all resources that match the specified lifecycle state.
         * The state value is case-insensitive.
         * <p>
         * Allowable values:
         * - ACCEPTED
         * - IN_PROGRESS
         * - FAILED
         * - SUCCEEDED
         * - CANCELING
         * - CANCELED
         *
         */
        private com.oracle.bmc.resourcemanager.model.Job.LifecycleState lifecycleState = null;

        /**
         * A filter that returns all resources that match the specified lifecycle state.
         * The state value is case-insensitive.
         * <p>
         * Allowable values:
         * - ACCEPTED
         * - IN_PROGRESS
         * - FAILED
         * - SUCCEEDED
         * - CANCELING
         * - CANCELED
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.resourcemanager.model.Job.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only resources that match the given display name exactly.
         * Use this filter to list a resource by name.
         * Requires {@code sortBy} set to {@code DISPLAYNAME}.
         * Alternatively, when you know the resource OCID, use the related Get operation.
         *
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly.
         * Use this filter to list a resource by name.
         * Requires {@code sortBy} set to {@code DISPLAYNAME}.
         * Alternatively, when you know the resource OCID, use the related Get operation.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The field to use when sorting returned resources.
         * By default, {@code TIMECREATED} is ordered descending.
         * By default, {@code DISPLAYNAME} is ordered ascending. Note that you can sort only on one field.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to use when sorting returned resources.
         * By default, {@code TIMECREATED} is ordered descending.
         * By default, {@code DISPLAYNAME} is ordered ascending. Note that you can sort only on one field.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use when sorting returned resources. Ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The number of items returned in a paginated {@code List} call. For information about pagination, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private Integer limit = null;

        /**
         * The number of items returned in a paginated {@code List} call. For information about pagination, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
         * For information about pagination, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the preceding {@code List} call.
         * For information about pagination, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
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
        public Builder copy(ListJobsRequest o) {
            opcRequestId(o.getOpcRequestId());
            compartmentId(o.getCompartmentId());
            stackId(o.getStackId());
            id(o.getId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            limit(o.getLimit());
            page(o.getPage());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJobsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListJobsRequest
         */
        public ListJobsRequest build() {
            ListJobsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJobsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJobsRequest
         */
        public ListJobsRequest buildWithoutInvocationCallback() {
            ListJobsRequest request = new ListJobsRequest();
            request.opcRequestId = opcRequestId;
            request.compartmentId = compartmentId;
            request.stackId = stackId;
            request.id = id;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.limit = limit;
            request.page = page;
            return request;
            // new ListJobsRequest(opcRequestId, compartmentId, stackId, id, lifecycleState, displayName, sortBy, sortOrder, limit, page);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .compartmentId(compartmentId)
                .stackId(stackId)
                .id(id)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .limit(limit)
                .page(page);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",stackId=").append(String.valueOf(this.stackId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListJobsRequest)) {
            return false;
        }

        ListJobsRequest other = (ListJobsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.stackId, other.stackId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.stackId == null ? 43 : this.stackId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        return result;
    }
}
