/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListScheduledJobsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListScheduledJobsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListScheduledJobsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment that contains the resources to list.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the resources to list.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * <p>
     * Example: {@code My new resource}
     *
     */
    private String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * <p>
     * Example: {@code My new resource}
     *
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
     * A filter to return only resources their lifecycleState matches the given lifecycleState.
     */
    private com.oracle.bmc.osmanagementhub.model.ScheduledJob.LifecycleState lifecycleState;

    /**
     * A filter to return only resources their lifecycleState matches the given lifecycleState.
     */
    public com.oracle.bmc.osmanagementhub.model.ScheduledJob.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The OCID of the managed instance for which to list resources.
     */
    private String managedInstanceId;

    /**
     * The OCID of the managed instance for which to list resources.
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * The OCID of the managed instance group for which to list resources.
     */
    private String managedInstanceGroupId;

    /**
     * The OCID of the managed instance group for which to list resources.
     */
    public String getManagedInstanceGroupId() {
        return managedInstanceGroupId;
    }
    /**
     * The OCID of the managed compartment for which to list resources.
     */
    private String managedCompartmentId;

    /**
     * The OCID of the managed compartment for which to list resources.
     */
    public String getManagedCompartmentId() {
        return managedCompartmentId;
    }
    /**
     * The OCID of the lifecycle stage for which to list resources.
     */
    private String lifecycleStageId;

    /**
     * The OCID of the lifecycle stage for which to list resources.
     */
    public String getLifecycleStageId() {
        return lifecycleStageId;
    }
    /**
     * The operation type for which to list resources.
     */
    private com.oracle.bmc.osmanagementhub.model.OperationTypes operationType;

    /**
     * The operation type for which to list resources.
     */
    public com.oracle.bmc.osmanagementhub.model.OperationTypes getOperationType() {
        return operationType;
    }
    /**
     * The schedule type for which to list resources.
     */
    private com.oracle.bmc.osmanagementhub.model.ScheduleTypes scheduleType;

    /**
     * The schedule type for which to list resources.
     */
    public com.oracle.bmc.osmanagementhub.model.ScheduleTypes getScheduleType() {
        return scheduleType;
    }
    /**
     * The start time after which to list all schedules, in ISO 8601 format.
     * <p>
     * Example: 2017-07-14T02:40:00.000Z
     *
     */
    private java.util.Date timeStart;

    /**
     * The start time after which to list all schedules, in ISO 8601 format.
     * <p>
     * Example: 2017-07-14T02:40:00.000Z
     *
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * The cut-off time before which to list all upcoming schedules, in ISO 8601 format.
     * <p>
     * Example: 2017-07-14T02:40:00.000Z
     *
     */
    private java.util.Date timeEnd;

    /**
     * The cut-off time before which to list all upcoming schedules, in ISO 8601 format.
     * <p>
     * Example: 2017-07-14T02:40:00.000Z
     *
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 50}
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     * <p>
     * Example: {@code 3}
     *
     */
    public String getPage() {
        return page;
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
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
     * If true, will only filter out restricted scheduled job.
     */
    private Boolean isRestricted;

    /**
     * If true, will only filter out restricted scheduled job.
     */
    public Boolean getIsRestricted() {
        return isRestricted;
    }
    /**
     * The OCID of the scheduled job.
     */
    private String id;

    /**
     * The OCID of the scheduled job.
     */
    public String getId() {
        return id;
    }
    /**
     * Default is false. When set to true ,returns results from {compartmentId} or any of its subcompartment.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true ,returns results from {compartmentId} or any of its subcompartment.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListScheduledJobsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment that contains the resources to list.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the resources to list.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * <p>
         * Example: {@code My new resource}
         *
         */
        private String displayName = null;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * <p>
         * Example: {@code My new resource}
         *
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
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.osmanagementhub.model.ScheduledJob.LifecycleState lifecycleState =
                null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.osmanagementhub.model.ScheduledJob.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The OCID of the managed instance for which to list resources.
         */
        private String managedInstanceId = null;

        /**
         * The OCID of the managed instance for which to list resources.
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * The OCID of the managed instance group for which to list resources.
         */
        private String managedInstanceGroupId = null;

        /**
         * The OCID of the managed instance group for which to list resources.
         * @param managedInstanceGroupId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceGroupId(String managedInstanceGroupId) {
            this.managedInstanceGroupId = managedInstanceGroupId;
            return this;
        }

        /**
         * The OCID of the managed compartment for which to list resources.
         */
        private String managedCompartmentId = null;

        /**
         * The OCID of the managed compartment for which to list resources.
         * @param managedCompartmentId the value to set
         * @return this builder instance
         */
        public Builder managedCompartmentId(String managedCompartmentId) {
            this.managedCompartmentId = managedCompartmentId;
            return this;
        }

        /**
         * The OCID of the lifecycle stage for which to list resources.
         */
        private String lifecycleStageId = null;

        /**
         * The OCID of the lifecycle stage for which to list resources.
         * @param lifecycleStageId the value to set
         * @return this builder instance
         */
        public Builder lifecycleStageId(String lifecycleStageId) {
            this.lifecycleStageId = lifecycleStageId;
            return this;
        }

        /**
         * The operation type for which to list resources.
         */
        private com.oracle.bmc.osmanagementhub.model.OperationTypes operationType = null;

        /**
         * The operation type for which to list resources.
         * @param operationType the value to set
         * @return this builder instance
         */
        public Builder operationType(
                com.oracle.bmc.osmanagementhub.model.OperationTypes operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * The schedule type for which to list resources.
         */
        private com.oracle.bmc.osmanagementhub.model.ScheduleTypes scheduleType = null;

        /**
         * The schedule type for which to list resources.
         * @param scheduleType the value to set
         * @return this builder instance
         */
        public Builder scheduleType(
                com.oracle.bmc.osmanagementhub.model.ScheduleTypes scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * The start time after which to list all schedules, in ISO 8601 format.
         * <p>
         * Example: 2017-07-14T02:40:00.000Z
         *
         */
        private java.util.Date timeStart = null;

        /**
         * The start time after which to list all schedules, in ISO 8601 format.
         * <p>
         * Example: 2017-07-14T02:40:00.000Z
         *
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * The cut-off time before which to list all upcoming schedules, in ISO 8601 format.
         * <p>
         * Example: 2017-07-14T02:40:00.000Z
         *
         */
        private java.util.Date timeEnd = null;

        /**
         * The cut-off time before which to list all upcoming schedules, in ISO 8601 format.
         * <p>
         * Example: 2017-07-14T02:40:00.000Z
         *
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 50}
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a paginated "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         * <p>
         * Example: {@code 3}
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending.
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
         * If true, will only filter out restricted scheduled job.
         */
        private Boolean isRestricted = null;

        /**
         * If true, will only filter out restricted scheduled job.
         * @param isRestricted the value to set
         * @return this builder instance
         */
        public Builder isRestricted(Boolean isRestricted) {
            this.isRestricted = isRestricted;
            return this;
        }

        /**
         * The OCID of the scheduled job.
         */
        private String id = null;

        /**
         * The OCID of the scheduled job.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Default is false. When set to true ,returns results from {compartmentId} or any of its subcompartment.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true ,returns results from {compartmentId} or any of its subcompartment.
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
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
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListScheduledJobsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
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
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
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
            return request;
            // new ListScheduledJobsRequest(compartmentId, displayName, displayNameContains, lifecycleState, managedInstanceId, managedInstanceGroupId, managedCompartmentId, lifecycleStageId, operationType, scheduleType, timeStart, timeEnd, limit, page, sortOrder, sortBy, opcRequestId, isRestricted, id, compartmentIdInSubtree);
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
                .compartmentIdInSubtree(compartmentIdInSubtree);
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
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree);
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
        return result;
    }
}
