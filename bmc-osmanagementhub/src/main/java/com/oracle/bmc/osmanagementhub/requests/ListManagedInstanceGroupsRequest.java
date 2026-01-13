/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListManagedInstanceGroupsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListManagedInstanceGroupsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListManagedInstanceGroupsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only
     * resources contained within the specified compartment.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the resources to list. This filter returns only
     * resources contained within the specified compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance group. This filter returns resources associated with this group.
     */
    private String managedInstanceGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance group. This filter returns resources associated with this group.
     */
    public String getManagedInstanceGroupId() {
        return managedInstanceGroupId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * software source. This filter returns resources associated with this software source.
     */
    private String softwareSourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * software source. This filter returns resources associated with this software source.
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }
    /** A filter to return resources that match the given display names. */
    private java.util.List<String> displayName;

    /** A filter to return resources that match the given display names. */
    public java.util.List<String> getDisplayName() {
        return displayName;
    }
    /** A filter to return resources that may partially match the given display name. */
    private String displayNameContains;

    /** A filter to return resources that may partially match the given display name. */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /** A filter to return only profiles that match the given archType. */
    private com.oracle.bmc.osmanagementhub.model.ArchType archType;

    /** A filter to return only profiles that match the given archType. */
    public com.oracle.bmc.osmanagementhub.model.ArchType getArchType() {
        return archType;
    }
    /** A filter to return only resources that match the given operating system family. */
    private com.oracle.bmc.osmanagementhub.model.OsFamily osFamily;

    /** A filter to return only resources that match the given operating system family. */
    public com.oracle.bmc.osmanagementhub.model.OsFamily getOsFamily() {
        return osFamily;
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
     *
     * <p>Example: {@code 3}
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 3}
     */
    public String getPage() {
        return page;
    }
    /** A filter to return only managed instance groups that are in the specified state. */
    private com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.LifecycleState lifecycleState;

    /** A filter to return only managed instance groups that are in the specified state. */
    public com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only resources whose location matches the given value. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation> location;

    /** A filter to return only resources whose location matches the given value. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            getLocation() {
        return location;
    }
    /** A filter to return only resources whose location does not match the given value. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            locationNotEqualTo;

    /** A filter to return only resources whose location does not match the given value. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
            getLocationNotEqualTo() {
        return locationNotEqualTo;
    }
    /** Indicates whether to list only resources managed by the Autonomous Linux service. */
    private Boolean isManagedByAutonomousLinux;

    /** Indicates whether to list only resources managed by the Autonomous Linux service. */
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.osmanagementhub.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListManagedInstanceGroupsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only
         * resources contained within the specified compartment.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the resources to list. This filter returns only
         * resources contained within the specified compartment.
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
         * managed instance group. This filter returns resources associated with this group.
         */
        private String managedInstanceGroupId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance group. This filter returns resources associated with this group.
         *
         * @param managedInstanceGroupId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceGroupId(String managedInstanceGroupId) {
            this.managedInstanceGroupId = managedInstanceGroupId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * software source. This filter returns resources associated with this software source.
         */
        private String softwareSourceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * software source. This filter returns resources associated with this software source.
         *
         * @param softwareSourceId the value to set
         * @return this builder instance
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            return this;
        }

        /** A filter to return resources that match the given display names. */
        private java.util.List<String> displayName = null;

        /**
         * A filter to return resources that match the given display names.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(java.util.List<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Singular setter. A filter to return resources that match the given display names.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder displayName(String singularValue) {
            return this.displayName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return resources that may partially match the given display name. */
        private String displayNameContains = null;

        /**
         * A filter to return resources that may partially match the given display name.
         *
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /** A filter to return only profiles that match the given archType. */
        private com.oracle.bmc.osmanagementhub.model.ArchType archType = null;

        /**
         * A filter to return only profiles that match the given archType.
         *
         * @param archType the value to set
         * @return this builder instance
         */
        public Builder archType(com.oracle.bmc.osmanagementhub.model.ArchType archType) {
            this.archType = archType;
            return this;
        }

        /** A filter to return only resources that match the given operating system family. */
        private com.oracle.bmc.osmanagementhub.model.OsFamily osFamily = null;

        /**
         * A filter to return only resources that match the given operating system family.
         *
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(com.oracle.bmc.osmanagementhub.model.OsFamily osFamily) {
            this.osFamily = osFamily;
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
         *
         * <p>Example: {@code 3}
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 3}
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** A filter to return only managed instance groups that are in the specified state. */
        private com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only managed instance groups that are in the specified state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.osmanagementhub.model.ManagedInstanceGroup.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only resources whose location matches the given value. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                location = null;

        /**
         * A filter to return only resources whose location matches the given value.
         *
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
         * Singular setter. A filter to return only resources whose location matches the given
         * value.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder location(ManagedInstanceLocation singularValue) {
            return this.location(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only resources whose location does not match the given value. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceLocation>
                locationNotEqualTo = null;

        /**
         * A filter to return only resources whose location does not match the given value.
         *
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
         * Singular setter. A filter to return only resources whose location does not match the
         * given value.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder locationNotEqualTo(ManagedInstanceLocation singularValue) {
            return this.locationNotEqualTo(java.util.Arrays.asList(singularValue));
        }

        /** Indicates whether to list only resources managed by the Autonomous Linux service. */
        private Boolean isManagedByAutonomousLinux = null;

        /**
         * Indicates whether to list only resources managed by the Autonomous Linux service.
         *
         * @param isManagedByAutonomousLinux the value to set
         * @return this builder instance
         */
        public Builder isManagedByAutonomousLinux(Boolean isManagedByAutonomousLinux) {
            this.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(ListManagedInstanceGroupsRequest o) {
            compartmentId(o.getCompartmentId());
            managedInstanceGroupId(o.getManagedInstanceGroupId());
            softwareSourceId(o.getSoftwareSourceId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            archType(o.getArchType());
            osFamily(o.getOsFamily());
            limit(o.getLimit());
            page(o.getPage());
            lifecycleState(o.getLifecycleState());
            location(o.getLocation());
            locationNotEqualTo(o.getLocationNotEqualTo());
            isManagedByAutonomousLinux(o.getIsManagedByAutonomousLinux());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListManagedInstanceGroupsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListManagedInstanceGroupsRequest
         */
        public ListManagedInstanceGroupsRequest build() {
            ListManagedInstanceGroupsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListManagedInstanceGroupsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListManagedInstanceGroupsRequest
         */
        public ListManagedInstanceGroupsRequest buildWithoutInvocationCallback() {
            ListManagedInstanceGroupsRequest request = new ListManagedInstanceGroupsRequest();
            request.compartmentId = compartmentId;
            request.managedInstanceGroupId = managedInstanceGroupId;
            request.softwareSourceId = softwareSourceId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.archType = archType;
            request.osFamily = osFamily;
            request.limit = limit;
            request.page = page;
            request.lifecycleState = lifecycleState;
            request.location = location;
            request.locationNotEqualTo = locationNotEqualTo;
            request.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListManagedInstanceGroupsRequest(compartmentId, managedInstanceGroupId,
            // softwareSourceId, displayName, displayNameContains, archType, osFamily, limit, page,
            // lifecycleState, location, locationNotEqualTo, isManagedByAutonomousLinux, sortOrder,
            // sortBy, opcRequestId);
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
                .managedInstanceGroupId(managedInstanceGroupId)
                .softwareSourceId(softwareSourceId)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .archType(archType)
                .osFamily(osFamily)
                .limit(limit)
                .page(page)
                .lifecycleState(lifecycleState)
                .location(location)
                .locationNotEqualTo(locationNotEqualTo)
                .isManagedByAutonomousLinux(isManagedByAutonomousLinux)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",managedInstanceGroupId=").append(String.valueOf(this.managedInstanceGroupId));
        sb.append(",softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",archType=").append(String.valueOf(this.archType));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",location=").append(String.valueOf(this.location));
        sb.append(",locationNotEqualTo=").append(String.valueOf(this.locationNotEqualTo));
        sb.append(",isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
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
        if (!(o instanceof ListManagedInstanceGroupsRequest)) {
            return false;
        }

        ListManagedInstanceGroupsRequest other = (ListManagedInstanceGroupsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.managedInstanceGroupId, other.managedInstanceGroupId)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.locationNotEqualTo, other.locationNotEqualTo)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
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
                        + (this.managedInstanceGroupId == null
                                ? 43
                                : this.managedInstanceGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.locationNotEqualTo == null
                                ? 43
                                : this.locationNotEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
