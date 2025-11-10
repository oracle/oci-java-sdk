/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListSchedulerExecutionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListSchedulerExecutionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
public class ListSchedulerExecutionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources. Empty only if the resource OCID query
     * param is not specified.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources. Empty only if the resource OCID query
     * param is not specified.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** Scheduled Time */
    private java.util.Date timeScheduledGreaterThanOrEqualTo;

    /** Scheduled Time */
    public java.util.Date getTimeScheduledGreaterThanOrEqualTo() {
        return timeScheduledGreaterThanOrEqualTo;
    }
    /** Scheduled Time */
    private java.util.Date timeScheduledLessThan;

    /** Scheduled Time */
    public java.util.Date getTimeScheduledLessThan() {
        return timeScheduledLessThan;
    }
    /** SchedulerDefinition identifier */
    private String schedulerDefintionId;

    /** SchedulerDefinition identifier */
    public String getSchedulerDefintionId() {
        return schedulerDefintionId;
    }
    /** SchedulerJob identifier filter */
    private String schedulerJobId;

    /** SchedulerJob identifier filter */
    public String getSchedulerJobId() {
        return schedulerJobId;
    }
    /** ResourceId filter (Example FleetId) */
    private String resourceId;

    /** ResourceId filter (Example FleetId) */
    public String getResourceId() {
        return resourceId;
    }
    /**
     * A filter to return only schedule definitions whose associated runbookId matches the given
     * runbookId.
     */
    private String runbookId;

    /**
     * A filter to return only schedule definitions whose associated runbookId matches the given
     * runbookId.
     */
    public String getRunbookId() {
        return runbookId;
    }
    /** RunbookVersion Name filter */
    private String runbookVersionName;

    /** RunbookVersion Name filter */
    public String getRunbookVersionName() {
        return runbookVersionName;
    }
    /** A filter to return only resources their subState matches the given subState. */
    private String substate;

    /** A filter to return only resources their subState matches the given subState. */
    public String getSubstate() {
        return substate;
    }
    /**
     * A filter to return only resources their lifecycleOperation matches the given
     * lifecycleOperation.
     */
    private String lifecycleOperation;

    /**
     * A filter to return only resources their lifecycleOperation matches the given
     * lifecycleOperation.
     */
    public String getLifecycleOperation() {
        return lifecycleOperation;
    }
    /**
     * If set to true, resources will be returned for not only the provided compartment, but all
     * compartments which descend from it. Which resources are returned and their field contents
     * depends on the value of accessLevel.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * If set to true, resources will be returned for not only the provided compartment, but all
     * compartments which descend from it. Which resources are returned and their field contents
     * depends on the value of accessLevel.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.fleetappsmanagement.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated and
     * timeScheduled is descending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated and
     * timeScheduled is descending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        TimeScheduled("timeScheduled"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated and
     * timeScheduled is descending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSchedulerExecutionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources. Empty only if the resource OCID
         * query param is not specified.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources. Empty only if the resource OCID
         * query param is not specified.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return only resources that match the entire display name given. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** Scheduled Time */
        private java.util.Date timeScheduledGreaterThanOrEqualTo = null;

        /**
         * Scheduled Time
         *
         * @param timeScheduledGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeScheduledGreaterThanOrEqualTo(
                java.util.Date timeScheduledGreaterThanOrEqualTo) {
            this.timeScheduledGreaterThanOrEqualTo = timeScheduledGreaterThanOrEqualTo;
            return this;
        }

        /** Scheduled Time */
        private java.util.Date timeScheduledLessThan = null;

        /**
         * Scheduled Time
         *
         * @param timeScheduledLessThan the value to set
         * @return this builder instance
         */
        public Builder timeScheduledLessThan(java.util.Date timeScheduledLessThan) {
            this.timeScheduledLessThan = timeScheduledLessThan;
            return this;
        }

        /** SchedulerDefinition identifier */
        private String schedulerDefintionId = null;

        /**
         * SchedulerDefinition identifier
         *
         * @param schedulerDefintionId the value to set
         * @return this builder instance
         */
        public Builder schedulerDefintionId(String schedulerDefintionId) {
            this.schedulerDefintionId = schedulerDefintionId;
            return this;
        }

        /** SchedulerJob identifier filter */
        private String schedulerJobId = null;

        /**
         * SchedulerJob identifier filter
         *
         * @param schedulerJobId the value to set
         * @return this builder instance
         */
        public Builder schedulerJobId(String schedulerJobId) {
            this.schedulerJobId = schedulerJobId;
            return this;
        }

        /** ResourceId filter (Example FleetId) */
        private String resourceId = null;

        /**
         * ResourceId filter (Example FleetId)
         *
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * A filter to return only schedule definitions whose associated runbookId matches the given
         * runbookId.
         */
        private String runbookId = null;

        /**
         * A filter to return only schedule definitions whose associated runbookId matches the given
         * runbookId.
         *
         * @param runbookId the value to set
         * @return this builder instance
         */
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            return this;
        }

        /** RunbookVersion Name filter */
        private String runbookVersionName = null;

        /**
         * RunbookVersion Name filter
         *
         * @param runbookVersionName the value to set
         * @return this builder instance
         */
        public Builder runbookVersionName(String runbookVersionName) {
            this.runbookVersionName = runbookVersionName;
            return this;
        }

        /** A filter to return only resources their subState matches the given subState. */
        private String substate = null;

        /**
         * A filter to return only resources their subState matches the given subState.
         *
         * @param substate the value to set
         * @return this builder instance
         */
        public Builder substate(String substate) {
            this.substate = substate;
            return this;
        }

        /**
         * A filter to return only resources their lifecycleOperation matches the given
         * lifecycleOperation.
         */
        private String lifecycleOperation = null;

        /**
         * A filter to return only resources their lifecycleOperation matches the given
         * lifecycleOperation.
         *
         * @param lifecycleOperation the value to set
         * @return this builder instance
         */
        public Builder lifecycleOperation(String lifecycleOperation) {
            this.lifecycleOperation = lifecycleOperation;
            return this;
        }

        /**
         * If set to true, resources will be returned for not only the provided compartment, but all
         * compartments which descend from it. Which resources are returned and their field contents
         * depends on the value of accessLevel.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * If set to true, resources will be returned for not only the provided compartment, but all
         * compartments which descend from it. Which resources are returned and their field contents
         * depends on the value of accessLevel.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
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
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.fleetappsmanagement.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * and timeScheduled is descending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * and timeScheduled is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
        public Builder copy(ListSchedulerExecutionsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            timeScheduledGreaterThanOrEqualTo(o.getTimeScheduledGreaterThanOrEqualTo());
            timeScheduledLessThan(o.getTimeScheduledLessThan());
            schedulerDefintionId(o.getSchedulerDefintionId());
            schedulerJobId(o.getSchedulerJobId());
            resourceId(o.getResourceId());
            runbookId(o.getRunbookId());
            runbookVersionName(o.getRunbookVersionName());
            substate(o.getSubstate());
            lifecycleOperation(o.getLifecycleOperation());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
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
         * Build the instance of ListSchedulerExecutionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSchedulerExecutionsRequest
         */
        public ListSchedulerExecutionsRequest build() {
            ListSchedulerExecutionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSchedulerExecutionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSchedulerExecutionsRequest
         */
        public ListSchedulerExecutionsRequest buildWithoutInvocationCallback() {
            ListSchedulerExecutionsRequest request = new ListSchedulerExecutionsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.timeScheduledGreaterThanOrEqualTo = timeScheduledGreaterThanOrEqualTo;
            request.timeScheduledLessThan = timeScheduledLessThan;
            request.schedulerDefintionId = schedulerDefintionId;
            request.schedulerJobId = schedulerJobId;
            request.resourceId = resourceId;
            request.runbookId = runbookId;
            request.runbookVersionName = runbookVersionName;
            request.substate = substate;
            request.lifecycleOperation = lifecycleOperation;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSchedulerExecutionsRequest(compartmentId, displayName,
            // timeScheduledGreaterThanOrEqualTo, timeScheduledLessThan, schedulerDefintionId,
            // schedulerJobId, resourceId, runbookId, runbookVersionName, substate,
            // lifecycleOperation, compartmentIdInSubtree, limit, page, sortOrder, sortBy,
            // opcRequestId);
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
                .timeScheduledGreaterThanOrEqualTo(timeScheduledGreaterThanOrEqualTo)
                .timeScheduledLessThan(timeScheduledLessThan)
                .schedulerDefintionId(schedulerDefintionId)
                .schedulerJobId(schedulerJobId)
                .resourceId(resourceId)
                .runbookId(runbookId)
                .runbookVersionName(runbookVersionName)
                .substate(substate)
                .lifecycleOperation(lifecycleOperation)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .limit(limit)
                .page(page)
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",timeScheduledGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeScheduledGreaterThanOrEqualTo));
        sb.append(",timeScheduledLessThan=").append(String.valueOf(this.timeScheduledLessThan));
        sb.append(",schedulerDefintionId=").append(String.valueOf(this.schedulerDefintionId));
        sb.append(",schedulerJobId=").append(String.valueOf(this.schedulerJobId));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(",runbookId=").append(String.valueOf(this.runbookId));
        sb.append(",runbookVersionName=").append(String.valueOf(this.runbookVersionName));
        sb.append(",substate=").append(String.valueOf(this.substate));
        sb.append(",lifecycleOperation=").append(String.valueOf(this.lifecycleOperation));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
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
        if (!(o instanceof ListSchedulerExecutionsRequest)) {
            return false;
        }

        ListSchedulerExecutionsRequest other = (ListSchedulerExecutionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.timeScheduledGreaterThanOrEqualTo,
                        other.timeScheduledGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeScheduledLessThan, other.timeScheduledLessThan)
                && java.util.Objects.equals(this.schedulerDefintionId, other.schedulerDefintionId)
                && java.util.Objects.equals(this.schedulerJobId, other.schedulerJobId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.runbookVersionName, other.runbookVersionName)
                && java.util.Objects.equals(this.substate, other.substate)
                && java.util.Objects.equals(this.lifecycleOperation, other.lifecycleOperation)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduledGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeScheduledGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduledLessThan == null
                                ? 43
                                : this.timeScheduledLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulerDefintionId == null
                                ? 43
                                : this.schedulerDefintionId.hashCode());
        result =
                (result * PRIME)
                        + (this.schedulerJobId == null ? 43 : this.schedulerJobId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result =
                (result * PRIME)
                        + (this.runbookVersionName == null
                                ? 43
                                : this.runbookVersionName.hashCode());
        result = (result * PRIME) + (this.substate == null ? 43 : this.substate.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleOperation == null
                                ? 43
                                : this.lifecycleOperation.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
