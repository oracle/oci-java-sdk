/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListComputeHostsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListComputeHostsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListComputeHostsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** A filter to return only resources that match the given display name exactly. */
    private String displayName;

    /** A filter to return only resources that match the given display name exactly. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute host network resoruce. - Customer-unique HPC island ID - Customer-unique network
     * block ID - Customer-unique local block ID
     */
    private String networkResourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute host network resoruce. - Customer-unique HPC island ID - Customer-unique network
     * block ID - Customer-unique local block ID
     */
    public String getNetworkResourceId() {
        return networkResourceId;
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
    /**
     * A filter to return only ComputeHostSummary resources that match the given Compute Host
     * lifecycle State OCID exactly.
     */
    private String computeHostLifecycleState;

    /**
     * A filter to return only ComputeHostSummary resources that match the given Compute Host
     * lifecycle State OCID exactly.
     */
    public String getComputeHostLifecycleState() {
        return computeHostLifecycleState;
    }
    /**
     * A filter to return only ComputeHostSummary resources that match the given Compute Host health
     * State OCID exactly.
     */
    private String computeHostHealth;

    /**
     * A filter to return only ComputeHostSummary resources that match the given Compute Host health
     * State OCID exactly.
     */
    public String getComputeHostHealth() {
        return computeHostHealth;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute host group.
     */
    private String computeHostGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute host group.
     */
    public String getComputeHostGroupId() {
        return computeHostGroupId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListComputeHostsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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

        /** A filter to return only resources that match the given display name exactly. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute host network resoruce. - Customer-unique HPC island ID - Customer-unique network
         * block ID - Customer-unique local block ID
         */
        private String networkResourceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute host network resoruce. - Customer-unique HPC island ID - Customer-unique network
         * block ID - Customer-unique local block ID
         *
         * @param networkResourceId the value to set
         * @return this builder instance
         */
        public Builder networkResourceId(String networkResourceId) {
            this.networkResourceId = networkResourceId;
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
         * A filter to return only ComputeHostSummary resources that match the given Compute Host
         * lifecycle State OCID exactly.
         */
        private String computeHostLifecycleState = null;

        /**
         * A filter to return only ComputeHostSummary resources that match the given Compute Host
         * lifecycle State OCID exactly.
         *
         * @param computeHostLifecycleState the value to set
         * @return this builder instance
         */
        public Builder computeHostLifecycleState(String computeHostLifecycleState) {
            this.computeHostLifecycleState = computeHostLifecycleState;
            return this;
        }

        /**
         * A filter to return only ComputeHostSummary resources that match the given Compute Host
         * health State OCID exactly.
         */
        private String computeHostHealth = null;

        /**
         * A filter to return only ComputeHostSummary resources that match the given Compute Host
         * health State OCID exactly.
         *
         * @param computeHostHealth the value to set
         * @return this builder instance
         */
        public Builder computeHostHealth(String computeHostHealth) {
            this.computeHostHealth = computeHostHealth;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute host group.
         */
        private String computeHostGroupId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute host group.
         *
         * @param computeHostGroupId the value to set
         * @return this builder instance
         */
        public Builder computeHostGroupId(String computeHostGroupId) {
            this.computeHostGroupId = computeHostGroupId;
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
        public Builder copy(ListComputeHostsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            availabilityDomain(o.getAvailabilityDomain());
            displayName(o.getDisplayName());
            networkResourceId(o.getNetworkResourceId());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            computeHostLifecycleState(o.getComputeHostLifecycleState());
            computeHostHealth(o.getComputeHostHealth());
            computeHostGroupId(o.getComputeHostGroupId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListComputeHostsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListComputeHostsRequest
         */
        public ListComputeHostsRequest build() {
            ListComputeHostsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListComputeHostsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListComputeHostsRequest
         */
        public ListComputeHostsRequest buildWithoutInvocationCallback() {
            ListComputeHostsRequest request = new ListComputeHostsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.availabilityDomain = availabilityDomain;
            request.displayName = displayName;
            request.networkResourceId = networkResourceId;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.computeHostLifecycleState = computeHostLifecycleState;
            request.computeHostHealth = computeHostHealth;
            request.computeHostGroupId = computeHostGroupId;
            return request;
            // new ListComputeHostsRequest(compartmentId, opcRequestId, availabilityDomain,
            // displayName, networkResourceId, limit, page, sortBy, sortOrder,
            // computeHostLifecycleState, computeHostHealth, computeHostGroupId);
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
                .opcRequestId(opcRequestId)
                .availabilityDomain(availabilityDomain)
                .displayName(displayName)
                .networkResourceId(networkResourceId)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .computeHostLifecycleState(computeHostLifecycleState)
                .computeHostHealth(computeHostHealth)
                .computeHostGroupId(computeHostGroupId);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",networkResourceId=").append(String.valueOf(this.networkResourceId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",computeHostLifecycleState=")
                .append(String.valueOf(this.computeHostLifecycleState));
        sb.append(",computeHostHealth=").append(String.valueOf(this.computeHostHealth));
        sb.append(",computeHostGroupId=").append(String.valueOf(this.computeHostGroupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListComputeHostsRequest)) {
            return false;
        }

        ListComputeHostsRequest other = (ListComputeHostsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.networkResourceId, other.networkResourceId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(
                        this.computeHostLifecycleState, other.computeHostLifecycleState)
                && java.util.Objects.equals(this.computeHostHealth, other.computeHostHealth)
                && java.util.Objects.equals(this.computeHostGroupId, other.computeHostGroupId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.networkResourceId == null ? 43 : this.networkResourceId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.computeHostLifecycleState == null
                                ? 43
                                : this.computeHostLifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.computeHostHealth == null ? 43 : this.computeHostHealth.hashCode());
        result =
                (result * PRIME)
                        + (this.computeHostGroupId == null
                                ? 43
                                : this.computeHostGroupId.hashCode());
        return result;
    }
}
