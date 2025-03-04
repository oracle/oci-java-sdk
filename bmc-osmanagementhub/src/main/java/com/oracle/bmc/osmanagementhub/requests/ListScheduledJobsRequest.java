/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListScheduledJobsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListScheduledJobsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListScheduledJobsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** A filter to return resources that match the given user-friendly name. */
    private String displayName;

    /** A filter to return resources that match the given user-friendly name. */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return resources that may partially match the given display name. */
    private String displayNameContains;

    /** A filter to return resources that may partially match the given display name. */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /** A filter to return only scheduled jobs currently in the given state. */
    private com.oracle.bmc.osmanagementhub.model.ScheduledJob.LifecycleState lifecycleState;

    /** A filter to return only scheduled jobs currently in the given state. */
    public com.oracle.bmc.osmanagementhub.model.ScheduledJob.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance. This filter returns resources associated with this managed instance.
     */
    private String managedInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed instance. This filter returns resources associated with this managed instance.
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
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
     * managed compartment. This filter returns resources associated with this compartment.
     */
    private String managedCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * managed compartment. This filter returns resources associated with this compartment.
     */
    public String getManagedCompartmentId() {
        return managedCompartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * lifecycle stage. This resource returns resources associated with this lifecycle stage.
     */
    private String lifecycleStageId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * lifecycle stage. This resource returns resources associated with this lifecycle stage.
     */
    public String getLifecycleStageId() {
        return lifecycleStageId;
    }
    /** A filter to return only scheduled jobs with the given operation type. */
    private com.oracle.bmc.osmanagementhub.model.OperationTypes operationType;

    /** A filter to return only scheduled jobs with the given operation type. */
    public com.oracle.bmc.osmanagementhub.model.OperationTypes getOperationType() {
        return operationType;
    }
    /**
     * A filter to return only scheduled jobs of the given scheduling type (one-time or recurring).
     */
    private com.oracle.bmc.osmanagementhub.model.ScheduleTypes scheduleType;

    /**
     * A filter to return only scheduled jobs of the given scheduling type (one-time or recurring).
     */
    public com.oracle.bmc.osmanagementhub.model.ScheduleTypes getScheduleType() {
        return scheduleType;
    }
    /**
     * A filter to return only resources with a date on or after the given value, in ISO 8601
     * format.
     *
     * <p>Example: 2017-07-14T02:40:00.000Z
     */
    private java.util.Date timeStart;

    /**
     * A filter to return only resources with a date on or after the given value, in ISO 8601
     * format.
     *
     * <p>Example: 2017-07-14T02:40:00.000Z
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * A filter to return only resources with a date on or before the given value, in ISO 8601
     * format.
     *
     * <p>Example: 2017-07-14T02:40:00.000Z
     */
    private java.util.Date timeEnd;

    /**
     * A filter to return only resources with a date on or before the given value, in ISO 8601
     * format.
     *
     * <p>Example: 2017-07-14T02:40:00.000Z
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
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
    /** A filter to return only restricted scheduled jobs. */
    private Boolean isRestricted;

    /** A filter to return only restricted scheduled jobs. */
    public Boolean getIsRestricted() {
        return isRestricted;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * scheduled job. A filter to return the specified job.
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * scheduled job. A filter to return the specified job.
     */
    public String getId() {
        return id;
    }
    /** Indicates whether to include subcompartments in the returned results. Default is false. */
    private Boolean compartmentIdInSubtree;

    /** Indicates whether to include subcompartments in the returned results. Default is false. */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListScheduledJobsRequest, java.lang.Void> {
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

        /** A filter to return resources that match the given user-friendly name. */
        private String displayName = null;

        /**
         * A filter to return resources that match the given user-friendly name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
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

        /** A filter to return only scheduled jobs currently in the given state. */
        private com.oracle.bmc.osmanagementhub.model.ScheduledJob.LifecycleState lifecycleState =
                null;

        /**
         * A filter to return only scheduled jobs currently in the given state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.osmanagementhub.model.ScheduledJob.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance. This filter returns resources associated with this managed instance.
         */
        private String managedInstanceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed instance. This filter returns resources associated with this managed instance.
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
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
         * managed compartment. This filter returns resources associated with this compartment.
         */
        private String managedCompartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * managed compartment. This filter returns resources associated with this compartment.
         *
         * @param managedCompartmentId the value to set
         * @return this builder instance
         */
        public Builder managedCompartmentId(String managedCompartmentId) {
            this.managedCompartmentId = managedCompartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * lifecycle stage. This resource returns resources associated with this lifecycle stage.
         */
        private String lifecycleStageId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * lifecycle stage. This resource returns resources associated with this lifecycle stage.
         *
         * @param lifecycleStageId the value to set
         * @return this builder instance
         */
        public Builder lifecycleStageId(String lifecycleStageId) {
            this.lifecycleStageId = lifecycleStageId;
            return this;
        }

        /** A filter to return only scheduled jobs with the given operation type. */
        private com.oracle.bmc.osmanagementhub.model.OperationTypes operationType = null;

        /**
         * A filter to return only scheduled jobs with the given operation type.
         *
         * @param operationType the value to set
         * @return this builder instance
         */
        public Builder operationType(
                com.oracle.bmc.osmanagementhub.model.OperationTypes operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * A filter to return only scheduled jobs of the given scheduling type (one-time or
         * recurring).
         */
        private com.oracle.bmc.osmanagementhub.model.ScheduleTypes scheduleType = null;

        /**
         * A filter to return only scheduled jobs of the given scheduling type (one-time or
         * recurring).
         *
         * @param scheduleType the value to set
         * @return this builder instance
         */
        public Builder scheduleType(
                com.oracle.bmc.osmanagementhub.model.ScheduleTypes scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * A filter to return only resources with a date on or after the given value, in ISO 8601
         * format.
         *
         * <p>Example: 2017-07-14T02:40:00.000Z
         */
        private java.util.Date timeStart = null;

        /**
         * A filter to return only resources with a date on or after the given value, in ISO 8601
         * format.
         *
         * <p>Example: 2017-07-14T02:40:00.000Z
         *
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * A filter to return only resources with a date on or before the given value, in ISO 8601
         * format.
         *
         * <p>Example: 2017-07-14T02:40:00.000Z
         */
        private java.util.Date timeEnd = null;

        /**
         * A filter to return only resources with a date on or before the given value, in ISO 8601
         * format.
         *
         * <p>Example: 2017-07-14T02:40:00.000Z
         *
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
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

        /** A filter to return only restricted scheduled jobs. */
        private Boolean isRestricted = null;

        /**
         * A filter to return only restricted scheduled jobs.
         *
         * @param isRestricted the value to set
         * @return this builder instance
         */
        public Builder isRestricted(Boolean isRestricted) {
            this.isRestricted = isRestricted;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * scheduled job. A filter to return the specified job.
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * scheduled job. A filter to return the specified job.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Indicates whether to include subcompartments in the returned results. Default is false.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Indicates whether to include subcompartments in the returned results. Default is false.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
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
        public Builder copy(ListScheduledJobsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            lifecycleState(o.getLifecycleState());
            managedInstanceId(o.getManagedInstanceId());
            managedInstanceGroupId(o.getManagedInstanceGroupId());
            managedCompartmentId(o.getManagedCompartmentId());
            lifecycleStageId(o.getLifecycleStageId());
            operationType(o.getOperationType());
            scheduleType(o.getScheduleType());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            isRestricted(o.getIsRestricted());
            id(o.getId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            location(o.getLocation());
            locationNotEqualTo(o.getLocationNotEqualTo());
            isManagedByAutonomousLinux(o.getIsManagedByAutonomousLinux());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListScheduledJobsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListScheduledJobsRequest
         */
        public ListScheduledJobsRequest build() {
            ListScheduledJobsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListScheduledJobsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListScheduledJobsRequest
         */
        public ListScheduledJobsRequest buildWithoutInvocationCallback() {
            ListScheduledJobsRequest request = new ListScheduledJobsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.lifecycleState = lifecycleState;
            request.managedInstanceId = managedInstanceId;
            request.managedInstanceGroupId = managedInstanceGroupId;
            request.managedCompartmentId = managedCompartmentId;
            request.lifecycleStageId = lifecycleStageId;
            request.operationType = operationType;
            request.scheduleType = scheduleType;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.isRestricted = isRestricted;
            request.id = id;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.location = location;
            request.locationNotEqualTo = locationNotEqualTo;
            request.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            return request;
            // new ListScheduledJobsRequest(compartmentId, displayName, displayNameContains,
            // lifecycleState, managedInstanceId, managedInstanceGroupId, managedCompartmentId,
            // lifecycleStageId, operationType, scheduleType, timeStart, timeEnd, limit, page,
            // sortOrder, sortBy, opcRequestId, isRestricted, id, compartmentIdInSubtree, location,
            // locationNotEqualTo, isManagedByAutonomousLinux);
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
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .lifecycleState(lifecycleState)
                .managedInstanceId(managedInstanceId)
                .managedInstanceGroupId(managedInstanceGroupId)
                .managedCompartmentId(managedCompartmentId)
                .lifecycleStageId(lifecycleStageId)
                .operationType(operationType)
                .scheduleType(scheduleType)
                .timeStart(timeStart)
                .timeEnd(timeEnd)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .isRestricted(isRestricted)
                .id(id)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .location(location)
                .locationNotEqualTo(locationNotEqualTo)
                .isManagedByAutonomousLinux(isManagedByAutonomousLinux);
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",managedInstanceGroupId=").append(String.valueOf(this.managedInstanceGroupId));
        sb.append(",managedCompartmentId=").append(String.valueOf(this.managedCompartmentId));
        sb.append(",lifecycleStageId=").append(String.valueOf(this.lifecycleStageId));
        sb.append(",operationType=").append(String.valueOf(this.operationType));
        sb.append(",scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isRestricted=").append(String.valueOf(this.isRestricted));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",location=").append(String.valueOf(this.location));
        sb.append(",locationNotEqualTo=").append(String.valueOf(this.locationNotEqualTo));
        sb.append(",isManagedByAutonomousLinux=")
                .append(String.valueOf(this.isManagedByAutonomousLinux));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListScheduledJobsRequest)) {
            return false;
        }

        ListScheduledJobsRequest other = (ListScheduledJobsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(
                        this.managedInstanceGroupId, other.managedInstanceGroupId)
                && java.util.Objects.equals(this.managedCompartmentId, other.managedCompartmentId)
                && java.util.Objects.equals(this.lifecycleStageId, other.lifecycleStageId)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isRestricted, other.isRestricted)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.locationNotEqualTo, other.locationNotEqualTo)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux);
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
        result =
                (result * PRIME)
                        + (this.managedInstanceGroupId == null
                                ? 43
                                : this.managedInstanceGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedCompartmentId == null
                                ? 43
                                : this.managedCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStageId == null ? 43 : this.lifecycleStageId.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.isRestricted == null ? 43 : this.isRestricted.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
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
        return result;
    }
}
