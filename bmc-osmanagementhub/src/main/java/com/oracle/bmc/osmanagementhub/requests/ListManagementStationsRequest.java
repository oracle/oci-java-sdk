/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagementStationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListManagementStationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListManagementStationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return resources that match the given user-friendly name.
     */
    private String displayName;

    /**
     * A filter to return resources that match the given user-friendly name.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * A filter to return resources that may partially match the given display name.
     */
    private String displayNameContains;

    /**
     * A filter to return resources that may partially match the given display name.
     */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /**
     * A filter that returns information for management stations in the specified state.
     */
    private com.oracle.bmc.osmanagementhub.model.ManagementStation.LifecycleState lifecycleState;

    /**
     * A filter that returns information for management stations in the specified state.
     */
    public com.oracle.bmc.osmanagementhub.model.ManagementStation.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance. This filter returns resources associated with this managed instance.
     */
    private String managedInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance. This filter returns resources associated with this managed instance.
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * A filter to return only resources whose location matches the given value.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation> location;

    /**
     * A filter to return only resources whose location matches the given value.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            getLocation() {
        return location;
    }
    /**
     * A filter to return only resources whose location does not match the given value.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            locationNotEqualTo;

    /**
     * A filter to return only resources whose location does not match the given value.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            getLocationNotEqualTo() {
        return locationNotEqualTo;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.osmanagementhub.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station. A filter that returns information about the specified management station.
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station. A filter that returns information about the specified management station.
     */
    public String getId() {
        return id;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListManagementStationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only resources contained within the specified compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return resources that match the given user-friendly name.
         */
        private String displayName = null;

        /**
         * A filter to return resources that match the given user-friendly name.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return resources that may partially match the given display name.
         */
        private String displayNameContains = null;

        /**
         * A filter to return resources that may partially match the given display name.
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /**
         * A filter that returns information for management stations in the specified state.
         */
        private com.oracle.bmc.osmanagementhub.model.ManagementStation.LifecycleState
                lifecycleState = null;

        /**
         * A filter that returns information for management stations in the specified state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.osmanagementhub.model.ManagementStation.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance. This filter returns resources associated with this managed instance.
         */
        private String managedInstanceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the managed instance. This filter returns resources associated with this managed instance.
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 3}
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 3}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * A filter to return only resources whose location matches the given value.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                location = null;

        /**
         * A filter to return only resources whose location matches the given value.
         * @param location the value to set
         * @return this builder instance
         */
        public Builder location(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                        location) {
            this.location = location;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose location matches the given value.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder location(ManagedInstanceLocation singularValue) {
            return this.location(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only resources whose location does not match the given value.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                locationNotEqualTo = null;

        /**
         * A filter to return only resources whose location does not match the given value.
         * @param locationNotEqualTo the value to set
         * @return this builder instance
         */
        public Builder locationNotEqualTo(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                        locationNotEqualTo) {
            this.locationNotEqualTo = locationNotEqualTo;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose location does not match the given value.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder locationNotEqualTo(ManagedInstanceLocation singularValue) {
            return this.locationNotEqualTo(java.util.Arrays.asList(singularValue));
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified timeCreated is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station. A filter that returns information about the specified management station.
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the management station. A filter that returns information about the specified management station.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
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
        public Builder copy(ListManagementStationsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            lifecycleState(o.getLifecycleState());
            managedInstanceId(o.getManagedInstanceId());
            limit(o.getLimit());
            page(o.getPage());
            location(o.getLocation());
            locationNotEqualTo(o.getLocationNotEqualTo());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            id(o.getId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListManagementStationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListManagementStationsRequest
         */
        public ListManagementStationsRequest build() {
            ListManagementStationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListManagementStationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListManagementStationsRequest
         */
        public ListManagementStationsRequest buildWithoutInvocationCallback() {
            ListManagementStationsRequest request = new ListManagementStationsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.lifecycleState = lifecycleState;
            request.managedInstanceId = managedInstanceId;
            request.limit = limit;
            request.page = page;
            request.location = location;
            request.locationNotEqualTo = locationNotEqualTo;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.id = id;
            return request;
            // new ListManagementStationsRequest(compartmentId, displayName, displayNameContains, lifecycleState, managedInstanceId, limit, page, location, locationNotEqualTo, sortOrder, sortBy, opcRequestId, id);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .lifecycleState(lifecycleState)
                .managedInstanceId(managedInstanceId)
                .limit(limit)
                .page(page)
                .location(location)
                .locationNotEqualTo(locationNotEqualTo)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .id(id);
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",location=").append(String.valueOf(this.location));
        sb.append(",locationNotEqualTo=").append(String.valueOf(this.locationNotEqualTo));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListManagementStationsRequest)) {
            return false;
        }

        ListManagementStationsRequest other = (ListManagementStationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.locationNotEqualTo, other.locationNotEqualTo)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.locationNotEqualTo == null
                                ? 43
                                : this.locationNotEqualTo.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        return result;
    }
}
