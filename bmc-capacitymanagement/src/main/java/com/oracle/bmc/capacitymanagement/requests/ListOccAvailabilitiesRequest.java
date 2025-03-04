/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.requests;

import com.oracle.bmc.capacitymanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/capacitymanagement/ListOccAvailabilitiesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListOccAvailabilitiesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
public class ListOccAvailabilitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the availability catalog. */
    private String occAvailabilityCatalogId;

    /** The OCID of the availability catalog. */
    public String getOccAvailabilityCatalogId() {
        return occAvailabilityCatalogId;
    }
    /**
     * The capacity handover date of the capacity constraint to filter the list of capacity
     * constraints.
     */
    private String dateExpectedCapacityHandover;

    /**
     * The capacity handover date of the capacity constraint to filter the list of capacity
     * constraints.
     */
    public String getDateExpectedCapacityHandover() {
        return dateExpectedCapacityHandover;
    }
    /** The name of the resource to filter the list of capacity constraints. */
    private String resourceName;

    /** The name of the resource to filter the list of capacity constraints. */
    public String getResourceName() {
        return resourceName;
    }
    /**
     * Resource type using which the capacity constraints of an availability catalog can be
     * filtered.
     */
    private String resourceType;

    /**
     * Resource type using which the capacity constraints of an availability catalog can be
     * filtered.
     */
    public String getResourceType() {
        return resourceType;
    }
    /** Workload type using the resources in an availability catalog can be filtered. */
    private String workloadType;

    /** Workload type using the resources in an availability catalog can be filtered. */
    public String getWorkloadType() {
        return workloadType;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. The only valid characters for request IDs are letters,
     * numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.capacitymanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. The default order for resource
     * name is ascending. The default order for date of capacity handover is descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. The default order for resource
     * name is ascending. The default order for date of capacity handover is descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        DateExpectedCapacityHandover("dateExpectedCapacityHandover"),
        ResourceName("resourceName"),
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
     * The field to sort by. Only one sort order may be provided. The default order for resource
     * name is ascending. The default order for date of capacity handover is descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListOccAvailabilitiesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the availability catalog. */
        private String occAvailabilityCatalogId = null;

        /**
         * The OCID of the availability catalog.
         *
         * @param occAvailabilityCatalogId the value to set
         * @return this builder instance
         */
        public Builder occAvailabilityCatalogId(String occAvailabilityCatalogId) {
            this.occAvailabilityCatalogId = occAvailabilityCatalogId;
            return this;
        }

        /**
         * The capacity handover date of the capacity constraint to filter the list of capacity
         * constraints.
         */
        private String dateExpectedCapacityHandover = null;

        /**
         * The capacity handover date of the capacity constraint to filter the list of capacity
         * constraints.
         *
         * @param dateExpectedCapacityHandover the value to set
         * @return this builder instance
         */
        public Builder dateExpectedCapacityHandover(String dateExpectedCapacityHandover) {
            this.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
            return this;
        }

        /** The name of the resource to filter the list of capacity constraints. */
        private String resourceName = null;

        /**
         * The name of the resource to filter the list of capacity constraints.
         *
         * @param resourceName the value to set
         * @return this builder instance
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * Resource type using which the capacity constraints of an availability catalog can be
         * filtered.
         */
        private String resourceType = null;

        /**
         * Resource type using which the capacity constraints of an availability catalog can be
         * filtered.
         *
         * @param resourceType the value to set
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /** Workload type using the resources in an availability catalog can be filtered. */
        private String workloadType = null;

        /**
         * Workload type using the resources in an availability catalog can be filtered.
         *
         * @param workloadType the value to set
         * @return this builder instance
         */
        public Builder workloadType(String workloadType) {
            this.workloadType = workloadType;
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
         * A token representing the position at which to start retrieving results. This must come
         * from {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. The only valid characters for request IDs are letters,
         * numbers, underscore, and dash.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.capacitymanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. The default order for resource
         * name is ascending. The default order for date of capacity handover is descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. The default order for resource
         * name is ascending. The default order for date of capacity handover is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListOccAvailabilitiesRequest o) {
            occAvailabilityCatalogId(o.getOccAvailabilityCatalogId());
            dateExpectedCapacityHandover(o.getDateExpectedCapacityHandover());
            resourceName(o.getResourceName());
            resourceType(o.getResourceType());
            workloadType(o.getWorkloadType());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListOccAvailabilitiesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListOccAvailabilitiesRequest
         */
        public ListOccAvailabilitiesRequest build() {
            ListOccAvailabilitiesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListOccAvailabilitiesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListOccAvailabilitiesRequest
         */
        public ListOccAvailabilitiesRequest buildWithoutInvocationCallback() {
            ListOccAvailabilitiesRequest request = new ListOccAvailabilitiesRequest();
            request.occAvailabilityCatalogId = occAvailabilityCatalogId;
            request.dateExpectedCapacityHandover = dateExpectedCapacityHandover;
            request.resourceName = resourceName;
            request.resourceType = resourceType;
            request.workloadType = workloadType;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListOccAvailabilitiesRequest(occAvailabilityCatalogId,
            // dateExpectedCapacityHandover, resourceName, resourceType, workloadType, limit, page,
            // opcRequestId, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .occAvailabilityCatalogId(occAvailabilityCatalogId)
                .dateExpectedCapacityHandover(dateExpectedCapacityHandover)
                .resourceName(resourceName)
                .resourceType(resourceType)
                .workloadType(workloadType)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",occAvailabilityCatalogId=")
                .append(String.valueOf(this.occAvailabilityCatalogId));
        sb.append(",dateExpectedCapacityHandover=")
                .append(String.valueOf(this.dateExpectedCapacityHandover));
        sb.append(",resourceName=").append(String.valueOf(this.resourceName));
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(",workloadType=").append(String.valueOf(this.workloadType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListOccAvailabilitiesRequest)) {
            return false;
        }

        ListOccAvailabilitiesRequest other = (ListOccAvailabilitiesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.occAvailabilityCatalogId, other.occAvailabilityCatalogId)
                && java.util.Objects.equals(
                        this.dateExpectedCapacityHandover, other.dateExpectedCapacityHandover)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.workloadType, other.workloadType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.occAvailabilityCatalogId == null
                                ? 43
                                : this.occAvailabilityCatalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.dateExpectedCapacityHandover == null
                                ? 43
                                : this.dateExpectedCapacityHandover.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.workloadType == null ? 43 : this.workloadType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
