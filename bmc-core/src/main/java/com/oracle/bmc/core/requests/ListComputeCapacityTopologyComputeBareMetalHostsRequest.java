/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeCapacityTopologyComputeBareMetalHostsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListComputeCapacityTopologyComputeBareMetalHostsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListComputeCapacityTopologyComputeBareMetalHostsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute capacity topology.
     */
    private String computeCapacityTopologyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute capacity topology.
     */
    public String getComputeCapacityTopologyId() {
        return computeCapacityTopologyId;
    }
    /**
     * The name of the availability domain.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    private String availabilityDomain;

    /**
     * The name of the availability domain.
     *
     * <p>Example: {@code Uocm:PHX-AD-1}
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute HPC island.
     */
    private String computeHpcIslandId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute HPC island.
     */
    public String getComputeHpcIslandId() {
        return computeHpcIslandId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute network block.
     */
    private String computeNetworkBlockId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute network block.
     */
    public String getComputeNetworkBlockId() {
        return computeNetworkBlockId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute local block.
     */
    private String computeLocalBlockId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute local block.
     */
    public String getComputeLocalBlockId() {
        return computeLocalBlockId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive.
     *
     * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a single
     * availability domain. If you call one of these "List" operations without specifying an
     * availability domain, the resources are grouped by availability domain, then sorted.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive.
     *
     * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a single
     * availability domain. If you call one of these "List" operations without specifying an
     * availability domain, the resources are grouped by availability domain, then sorted.
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
     * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order for
     * TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The DISPLAYNAME sort
     * order is case sensitive.
     *
     * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let you
     * optionally filter by availability domain if the scope of the resource type is within a single
     * availability domain. If you call one of these "List" operations without specifying an
     * availability domain, the resources are grouped by availability domain, then sorted.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
     * DISPLAYNAME sort order is case sensitive.
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
     * DISPLAYNAME sort order is case sensitive.
     */
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

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
     * DISPLAYNAME sort order is case sensitive.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListComputeCapacityTopologyComputeBareMetalHostsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute capacity topology.
         */
        private String computeCapacityTopologyId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute capacity topology.
         *
         * @param computeCapacityTopologyId the value to set
         * @return this builder instance
         */
        public Builder computeCapacityTopologyId(String computeCapacityTopologyId) {
            this.computeCapacityTopologyId = computeCapacityTopologyId;
            return this;
        }

        /**
         * The name of the availability domain.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         */
        private String availabilityDomain = null;

        /**
         * The name of the availability domain.
         *
         * <p>Example: {@code Uocm:PHX-AD-1}
         *
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute HPC island.
         */
        private String computeHpcIslandId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute HPC island.
         *
         * @param computeHpcIslandId the value to set
         * @return this builder instance
         */
        public Builder computeHpcIslandId(String computeHpcIslandId) {
            this.computeHpcIslandId = computeHpcIslandId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute network block.
         */
        private String computeNetworkBlockId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute network block.
         *
         * @param computeNetworkBlockId the value to set
         * @return this builder instance
         */
        public Builder computeNetworkBlockId(String computeNetworkBlockId) {
            this.computeNetworkBlockId = computeNetworkBlockId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute local block.
         */
        private String computeLocalBlockId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute local block.
         *
         * @param computeLocalBlockId the value to set
         * @return this builder instance
         */
        public Builder computeLocalBlockId(String computeLocalBlockId) {
            this.computeLocalBlockId = computeLocalBlockId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
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
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
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
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The
         * DISPLAYNAME sort order is case sensitive.
         *
         * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let
         * you optionally filter by availability domain if the scope of the resource type is within
         * a single availability domain. If you call one of these "List" operations without
         * specifying an availability domain, the resources are grouped by availability domain, then
         * sorted.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide one sort order ({@code sortOrder}). Default order
         * for TIMECREATED is descending. Default order for DISPLAYNAME is ascending. The
         * DISPLAYNAME sort order is case sensitive.
         *
         * <p>*Note:** In general, some "List" operations (for example, {@code ListInstances}) let
         * you optionally filter by availability domain if the scope of the resource type is within
         * a single availability domain. If you call one of these "List" operations without
         * specifying an availability domain, the resources are grouped by availability domain, then
         * sorted.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
         * DISPLAYNAME sort order is case sensitive.
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). The
         * DISPLAYNAME sort order is case sensitive.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListComputeCapacityTopologyComputeBareMetalHostsRequest o) {
            computeCapacityTopologyId(o.getComputeCapacityTopologyId());
            availabilityDomain(o.getAvailabilityDomain());
            compartmentId(o.getCompartmentId());
            computeHpcIslandId(o.getComputeHpcIslandId());
            computeNetworkBlockId(o.getComputeNetworkBlockId());
            computeLocalBlockId(o.getComputeLocalBlockId());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListComputeCapacityTopologyComputeBareMetalHostsRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListComputeCapacityTopologyComputeBareMetalHostsRequest
         */
        public ListComputeCapacityTopologyComputeBareMetalHostsRequest build() {
            ListComputeCapacityTopologyComputeBareMetalHostsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListComputeCapacityTopologyComputeBareMetalHostsRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListComputeCapacityTopologyComputeBareMetalHostsRequest
         */
        public ListComputeCapacityTopologyComputeBareMetalHostsRequest
                buildWithoutInvocationCallback() {
            ListComputeCapacityTopologyComputeBareMetalHostsRequest request =
                    new ListComputeCapacityTopologyComputeBareMetalHostsRequest();
            request.computeCapacityTopologyId = computeCapacityTopologyId;
            request.availabilityDomain = availabilityDomain;
            request.compartmentId = compartmentId;
            request.computeHpcIslandId = computeHpcIslandId;
            request.computeNetworkBlockId = computeNetworkBlockId;
            request.computeLocalBlockId = computeLocalBlockId;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new
            // ListComputeCapacityTopologyComputeBareMetalHostsRequest(computeCapacityTopologyId,
            // availabilityDomain, compartmentId, computeHpcIslandId, computeNetworkBlockId,
            // computeLocalBlockId, limit, page, opcRequestId, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .computeCapacityTopologyId(computeCapacityTopologyId)
                .availabilityDomain(availabilityDomain)
                .compartmentId(compartmentId)
                .computeHpcIslandId(computeHpcIslandId)
                .computeNetworkBlockId(computeNetworkBlockId)
                .computeLocalBlockId(computeLocalBlockId)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",computeCapacityTopologyId=")
                .append(String.valueOf(this.computeCapacityTopologyId));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",computeHpcIslandId=").append(String.valueOf(this.computeHpcIslandId));
        sb.append(",computeNetworkBlockId=").append(String.valueOf(this.computeNetworkBlockId));
        sb.append(",computeLocalBlockId=").append(String.valueOf(this.computeLocalBlockId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListComputeCapacityTopologyComputeBareMetalHostsRequest)) {
            return false;
        }

        ListComputeCapacityTopologyComputeBareMetalHostsRequest other =
                (ListComputeCapacityTopologyComputeBareMetalHostsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.computeCapacityTopologyId, other.computeCapacityTopologyId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.computeHpcIslandId, other.computeHpcIslandId)
                && java.util.Objects.equals(this.computeNetworkBlockId, other.computeNetworkBlockId)
                && java.util.Objects.equals(this.computeLocalBlockId, other.computeLocalBlockId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.computeCapacityTopologyId == null
                                ? 43
                                : this.computeCapacityTopologyId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeHpcIslandId == null
                                ? 43
                                : this.computeHpcIslandId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeNetworkBlockId == null
                                ? 43
                                : this.computeNetworkBlockId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeLocalBlockId == null
                                ? 43
                                : this.computeLocalBlockId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
