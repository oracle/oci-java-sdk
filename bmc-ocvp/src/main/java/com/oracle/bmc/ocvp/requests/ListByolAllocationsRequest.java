/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.requests;

import com.oracle.bmc.ocvp.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/ListByolAllocationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListByolAllocationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
public class ListByolAllocationsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL Allocation.
     */
    private String byolAllocationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL Allocation.
     */
    public String getByolAllocationId() {
        return byolAllocationId;
    }
    /**
     * A filter to return only resources whose lifecycle state matches the given value.
     */
    private com.oracle.bmc.ocvp.model.ByolAllocation.LifecycleState lifecycleState;

    /**
     * A filter to return only resources whose lifecycle state matches the given value.
     */
    public com.oracle.bmc.ocvp.model.ByolAllocation.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources whose softwareType matches the given value.
     */
    private com.oracle.bmc.ocvp.model.ByolAllocation.SoftwareType softwareType;

    /**
     * A filter to return only resources whose softwareType matches the given value.
     */
    public com.oracle.bmc.ocvp.model.ByolAllocation.SoftwareType getSoftwareType() {
        return softwareType;
    }
    /**
     * A filter to return only resources whose availableUnits greater than or equal to the given value.
     */
    private Float availableUnitsGreaterThanOrEqualTo;

    /**
     * A filter to return only resources whose availableUnits greater than or equal to the given value.
     */
    public Float getAvailableUnitsGreaterThanOrEqualTo() {
        return availableUnitsGreaterThanOrEqualTo;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL.
     */
    private String byolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL.
     */
    public String getByolId() {
        return byolId;
    }
    /**
     * A filter to return only resources that match the given display name exactly.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the given display name exactly.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated
     * "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
     * call. For important details about how pagination works, see
     * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
     * is case sensitive.
     *
     */
    private com.oracle.bmc.ocvp.model.SortOrders sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
     * is case sensitive.
     *
     */
    public com.oracle.bmc.ocvp.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * {@code timeTermStart} is descending. Default order for {@code timeCreated} is descending.
     * Default order for {@code displayName} is ascending. The {@code displayName}
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these "List" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * {@code timeTermStart} is descending. Default order for {@code timeCreated} is descending.
     * Default order for {@code displayName} is ascending. The {@code displayName}
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these "List" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     **/
    public enum SortBy {
        DisplayName("displayName"),
        TimeCreated("timeCreated"),
        TimeTermStart("timeTermStart"),
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
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * {@code timeTermStart} is descending. Default order for {@code timeCreated} is descending.
     * Default order for {@code displayName} is ascending. The {@code displayName}
     * sort order is case sensitive.
     * <p>
     **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a
     * single availability domain. If you call one of these "List" operations without specifying
     * an availability domain, the resources are grouped by availability domain, then sorted.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular
     * request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular
     * request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListByolAllocationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL Allocation.
         */
        private String byolAllocationId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL Allocation.
         * @param byolAllocationId the value to set
         * @return this builder instance
         */
        public Builder byolAllocationId(String byolAllocationId) {
            this.byolAllocationId = byolAllocationId;
            return this;
        }

        /**
         * A filter to return only resources whose lifecycle state matches the given value.
         */
        private com.oracle.bmc.ocvp.model.ByolAllocation.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources whose lifecycle state matches the given value.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.ocvp.model.ByolAllocation.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only resources whose softwareType matches the given value.
         */
        private com.oracle.bmc.ocvp.model.ByolAllocation.SoftwareType softwareType = null;

        /**
         * A filter to return only resources whose softwareType matches the given value.
         * @param softwareType the value to set
         * @return this builder instance
         */
        public Builder softwareType(
                com.oracle.bmc.ocvp.model.ByolAllocation.SoftwareType softwareType) {
            this.softwareType = softwareType;
            return this;
        }

        /**
         * A filter to return only resources whose availableUnits greater than or equal to the given value.
         */
        private Float availableUnitsGreaterThanOrEqualTo = null;

        /**
         * A filter to return only resources whose availableUnits greater than or equal to the given value.
         * @param availableUnitsGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder availableUnitsGreaterThanOrEqualTo(
                Float availableUnitsGreaterThanOrEqualTo) {
            this.availableUnitsGreaterThanOrEqualTo = availableUnitsGreaterThanOrEqualTo;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL.
         */
        private String byolId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the BYOL.
         * @param byolId the value to set
         * @return this builder instance
         */
        public Builder byolId(String byolId) {
            this.byolId = byolId;
            return this;
        }

        /**
         * A filter to return only resources that match the given display name exactly.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated
         * "List" call. For important details about how pagination works, see
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
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
         * call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List"
         * call. For important details about how pagination works, see
         * [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
         * is case sensitive.
         *
         */
        private com.oracle.bmc.ocvp.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The DISPLAYNAME sort order
         * is case sensitive.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.ocvp.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
         * {@code timeTermStart} is descending. Default order for {@code timeCreated} is descending.
         * Default order for {@code displayName} is ascending. The {@code displayName}
         * sort order is case sensitive.
         * <p>
         **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
         * optionally filter by availability domain if the scope of the resource type is within a
         * single availability domain. If you call one of these "List" operations without specifying
         * an availability domain, the resources are grouped by availability domain, then sorted.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
         * {@code timeTermStart} is descending. Default order for {@code timeCreated} is descending.
         * Default order for {@code displayName} is ascending. The {@code displayName}
         * sort order is case sensitive.
         * <p>
         **Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
         * optionally filter by availability domain if the scope of the resource type is within a
         * single availability domain. If you call one of these "List" operations without specifying
         * an availability domain, the resources are grouped by availability domain, then sorted.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(ListByolAllocationsRequest o) {
            compartmentId(o.getCompartmentId());
            byolAllocationId(o.getByolAllocationId());
            lifecycleState(o.getLifecycleState());
            softwareType(o.getSoftwareType());
            availableUnitsGreaterThanOrEqualTo(o.getAvailableUnitsGreaterThanOrEqualTo());
            byolId(o.getByolId());
            displayName(o.getDisplayName());
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
         * Build the instance of ListByolAllocationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListByolAllocationsRequest
         */
        public ListByolAllocationsRequest build() {
            ListByolAllocationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListByolAllocationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListByolAllocationsRequest
         */
        public ListByolAllocationsRequest buildWithoutInvocationCallback() {
            ListByolAllocationsRequest request = new ListByolAllocationsRequest();
            request.compartmentId = compartmentId;
            request.byolAllocationId = byolAllocationId;
            request.lifecycleState = lifecycleState;
            request.softwareType = softwareType;
            request.availableUnitsGreaterThanOrEqualTo = availableUnitsGreaterThanOrEqualTo;
            request.byolId = byolId;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListByolAllocationsRequest(compartmentId, byolAllocationId, lifecycleState, softwareType, availableUnitsGreaterThanOrEqualTo, byolId, displayName, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .byolAllocationId(byolAllocationId)
                .lifecycleState(lifecycleState)
                .softwareType(softwareType)
                .availableUnitsGreaterThanOrEqualTo(availableUnitsGreaterThanOrEqualTo)
                .byolId(byolId)
                .displayName(displayName)
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
        sb.append(",byolAllocationId=").append(String.valueOf(this.byolAllocationId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",softwareType=").append(String.valueOf(this.softwareType));
        sb.append(",availableUnitsGreaterThanOrEqualTo=")
                .append(String.valueOf(this.availableUnitsGreaterThanOrEqualTo));
        sb.append(",byolId=").append(String.valueOf(this.byolId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
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
        if (!(o instanceof ListByolAllocationsRequest)) {
            return false;
        }

        ListByolAllocationsRequest other = (ListByolAllocationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.byolAllocationId, other.byolAllocationId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.softwareType, other.softwareType)
                && java.util.Objects.equals(
                        this.availableUnitsGreaterThanOrEqualTo,
                        other.availableUnitsGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.byolId, other.byolId)
                && java.util.Objects.equals(this.displayName, other.displayName)
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
        result =
                (result * PRIME)
                        + (this.byolAllocationId == null ? 43 : this.byolAllocationId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.softwareType == null ? 43 : this.softwareType.hashCode());
        result =
                (result * PRIME)
                        + (this.availableUnitsGreaterThanOrEqualTo == null
                                ? 43
                                : this.availableUnitsGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.byolId == null ? 43 : this.byolId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
