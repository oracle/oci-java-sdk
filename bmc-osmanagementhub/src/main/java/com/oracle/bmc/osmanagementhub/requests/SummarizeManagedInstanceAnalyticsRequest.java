/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/SummarizeManagedInstanceAnalyticsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeManagedInstanceAnalyticsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class SummarizeManagedInstanceAnalyticsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** A filter to return only metrics whose name matches the given metric names. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.MetricName> metricNames;

    /** A filter to return only metrics whose name matches the given metric names. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.MetricName> getMetricNames() {
        return metricNames;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment. This filter returns only resources contained within the specified
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment. This filter returns only resources contained within the specified
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the managed instance group. This filter returns resources associated with this group.
     */
    private String managedInstanceGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the managed instance group. This filter returns resources associated with this group.
     */
    public String getManagedInstanceGroupId() {
        return managedInstanceGroupId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the lifecycle environment. This filter returns only resource contained with the specified
     * lifecycle environment.
     */
    private String lifecycleEnvironmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the lifecycle environment. This filter returns only resource contained with the specified
     * lifecycle environment.
     */
    public String getLifecycleEnvironmentId() {
        return lifecycleEnvironmentId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the lifecycle stage. This resource returns resources associated with this lifecycle stage.
     */
    private String lifecycleStageId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the lifecycle stage. This resource returns resources associated with this lifecycle stage.
     */
    public String getLifecycleStageId() {
        return lifecycleStageId;
    }
    /** A filter to return only managed instances whose status matches the status provided. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status;

    /** A filter to return only managed instances whose status matches the status provided. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> getStatus() {
        return status;
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
    /** A filter to return only resources that match the given operating system family. */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.OsFamily> osFamily;

    /** A filter to return only resources that match the given operating system family. */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.OsFamily> getOsFamily() {
        return osFamily;
    }
    /** Indicates whether to list only resources managed by the Autonomous Linux service. */
    private Boolean isManagedByAutonomousLinux;

    /** Indicates whether to list only resources managed by the Autonomous Linux service. */
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
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
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 3}
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 3}
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by. Only one sort order may be provided. The default is to sort in
     * ascending order by metricName (previously name, which is now depricated). You can also sort
     * by displayName (default is ascending order).
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. The default is to sort in
     * ascending order by metricName (previously name, which is now depricated). You can also sort
     * by displayName (default is ascending order).
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Name("name"),
        MetricName("metricName"),
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
     * The field to sort by. Only one sort order may be provided. The default is to sort in
     * ascending order by metricName (previously name, which is now depricated). You can also sort
     * by displayName (default is ascending order).
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.osmanagementhub.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.osmanagementhub.model.SortOrder getSortOrder() {
        return sortOrder;
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
                    SummarizeManagedInstanceAnalyticsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** A filter to return only metrics whose name matches the given metric names. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.MetricName> metricNames = null;

        /**
         * A filter to return only metrics whose name matches the given metric names.
         *
         * @param metricNames the value to set
         * @return this builder instance
         */
        public Builder metricNames(
                java.util.List<com.oracle.bmc.osmanagementhub.model.MetricName> metricNames) {
            this.metricNames = metricNames;
            return this;
        }

        /**
         * Singular setter. A filter to return only metrics whose name matches the given metric
         * names.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder metricNames(MetricName singularValue) {
            return this.metricNames(java.util.Arrays.asList(singularValue));
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment. This filter returns only resources contained within the specified
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment. This filter returns only resources contained within the specified
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the managed instance group. This filter returns resources associated with this group.
         */
        private String managedInstanceGroupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the managed instance group. This filter returns resources associated with this group.
         *
         * @param managedInstanceGroupId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceGroupId(String managedInstanceGroupId) {
            this.managedInstanceGroupId = managedInstanceGroupId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the lifecycle environment. This filter returns only resource contained with the
         * specified lifecycle environment.
         */
        private String lifecycleEnvironmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the lifecycle environment. This filter returns only resource contained with the
         * specified lifecycle environment.
         *
         * @param lifecycleEnvironmentId the value to set
         * @return this builder instance
         */
        public Builder lifecycleEnvironmentId(String lifecycleEnvironmentId) {
            this.lifecycleEnvironmentId = lifecycleEnvironmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the lifecycle stage. This resource returns resources associated with this lifecycle
         * stage.
         */
        private String lifecycleStageId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the lifecycle stage. This resource returns resources associated with this lifecycle
         * stage.
         *
         * @param lifecycleStageId the value to set
         * @return this builder instance
         */
        public Builder lifecycleStageId(String lifecycleStageId) {
            this.lifecycleStageId = lifecycleStageId;
            return this;
        }

        /** A filter to return only managed instances whose status matches the status provided. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status =
                null;

        /**
         * A filter to return only managed instances whose status matches the status provided.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                java.util.List<com.oracle.bmc.osmanagementhub.model.ManagedInstanceStatus> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to return only managed instances whose status matches the
         * status provided.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(ManagedInstanceStatus singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
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

        /** A filter to return only resources that match the given operating system family. */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.OsFamily> osFamily = null;

        /**
         * A filter to return only resources that match the given operating system family.
         *
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(
                java.util.List<com.oracle.bmc.osmanagementhub.model.OsFamily> osFamily) {
            this.osFamily = osFamily;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the given operating system
         * family.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder osFamily(OsFamily singularValue) {
            return this.osFamily(java.util.Arrays.asList(singularValue));
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

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 3}
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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

        /**
         * The field to sort by. Only one sort order may be provided. The default is to sort in
         * ascending order by metricName (previously name, which is now depricated). You can also
         * sort by displayName (default is ascending order).
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. The default is to sort in
         * ascending order by metricName (previously name, which is now depricated). You can also
         * sort by displayName (default is ascending order).
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(SummarizeManagedInstanceAnalyticsRequest o) {
            metricNames(o.getMetricNames());
            compartmentId(o.getCompartmentId());
            managedInstanceGroupId(o.getManagedInstanceGroupId());
            lifecycleEnvironmentId(o.getLifecycleEnvironmentId());
            lifecycleStageId(o.getLifecycleStageId());
            status(o.getStatus());
            location(o.getLocation());
            locationNotEqualTo(o.getLocationNotEqualTo());
            osFamily(o.getOsFamily());
            isManagedByAutonomousLinux(o.getIsManagedByAutonomousLinux());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeManagedInstanceAnalyticsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeManagedInstanceAnalyticsRequest
         */
        public SummarizeManagedInstanceAnalyticsRequest build() {
            SummarizeManagedInstanceAnalyticsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeManagedInstanceAnalyticsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeManagedInstanceAnalyticsRequest
         */
        public SummarizeManagedInstanceAnalyticsRequest buildWithoutInvocationCallback() {
            SummarizeManagedInstanceAnalyticsRequest request =
                    new SummarizeManagedInstanceAnalyticsRequest();
            request.metricNames = metricNames;
            request.compartmentId = compartmentId;
            request.managedInstanceGroupId = managedInstanceGroupId;
            request.lifecycleEnvironmentId = lifecycleEnvironmentId;
            request.lifecycleStageId = lifecycleStageId;
            request.status = status;
            request.location = location;
            request.locationNotEqualTo = locationNotEqualTo;
            request.osFamily = osFamily;
            request.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new SummarizeManagedInstanceAnalyticsRequest(metricNames, compartmentId,
            // managedInstanceGroupId, lifecycleEnvironmentId, lifecycleStageId, status, location,
            // locationNotEqualTo, osFamily, isManagedByAutonomousLinux, displayName,
            // displayNameContains, limit, page, sortBy, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .metricNames(metricNames)
                .compartmentId(compartmentId)
                .managedInstanceGroupId(managedInstanceGroupId)
                .lifecycleEnvironmentId(lifecycleEnvironmentId)
                .lifecycleStageId(lifecycleStageId)
                .status(status)
                .location(location)
                .locationNotEqualTo(locationNotEqualTo)
                .osFamily(osFamily)
                .isManagedByAutonomousLinux(isManagedByAutonomousLinux)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",metricNames=").append(String.valueOf(this.metricNames));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",managedInstanceGroupId=").append(String.valueOf(this.managedInstanceGroupId));
        sb.append(",lifecycleEnvironmentId=").append(String.valueOf(this.lifecycleEnvironmentId));
        sb.append(",lifecycleStageId=").append(String.valueOf(this.lifecycleStageId));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",location=").append(String.valueOf(this.location));
        sb.append(",locationNotEqualTo=").append(String.valueOf(this.locationNotEqualTo));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeManagedInstanceAnalyticsRequest)) {
            return false;
        }

        SummarizeManagedInstanceAnalyticsRequest other =
                (SummarizeManagedInstanceAnalyticsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.metricNames, other.metricNames)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.managedInstanceGroupId, other.managedInstanceGroupId)
                && java.util.Objects.equals(
                        this.lifecycleEnvironmentId, other.lifecycleEnvironmentId)
                && java.util.Objects.equals(this.lifecycleStageId, other.lifecycleStageId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.locationNotEqualTo, other.locationNotEqualTo)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.metricNames == null ? 43 : this.metricNames.hashCode());
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
                        + (this.lifecycleEnvironmentId == null
                                ? 43
                                : this.lifecycleEnvironmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStageId == null ? 43 : this.lifecycleStageId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.locationNotEqualTo == null
                                ? 43
                                : this.locationNotEqualTo.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
