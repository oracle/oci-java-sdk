/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.requests;

import com.oracle.bmc.fleetappsmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/fleetappsmanagement/ListSchedulerJobsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSchedulerJobsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
public class ListSchedulerJobsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only resources whose lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState lifecycleState;

    /** A filter to return only resources whose lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /** unique Fleet identifier */
    private String fleetId;

    /** unique Fleet identifier */
    public String getFleetId() {
        return fleetId;
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
    /** Fetch next remediation Job */
    private Boolean isRemediationJobNeeded;

    /** Fetch next remediation Job */
    public Boolean getIsRemediationJobNeeded() {
        return isRemediationJobNeeded;
    }
    /** A filter to return only resources their subState matches the given subState. */
    private String subState;

    /** A filter to return only resources their subState matches the given subState. */
    public String getSubState() {
        return subState;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** unique SchedulerJob identifier */
    private String id;

    /** unique SchedulerJob identifier */
    public String getId() {
        return id;
    }
    /** SchedulerJob Definition identifier */
    private String defintionId;

    /** SchedulerJob Definition identifier */
    public String getDefintionId() {
        return defintionId;
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
     * timeScheduled is descending. Default order for displayName is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated and
     * timeScheduled is descending. Default order for displayName is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        TimeScheduled("timeScheduled"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated and
     * timeScheduled is descending. Default order for displayName is ascending.
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
                    ListSchedulerJobsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The ID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only resources whose lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.fleetappsmanagement.model.SchedulerJob.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** unique Fleet identifier */
        private String fleetId = null;

        /**
         * unique Fleet identifier
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
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

        /** Fetch next remediation Job */
        private Boolean isRemediationJobNeeded = null;

        /**
         * Fetch next remediation Job
         *
         * @param isRemediationJobNeeded the value to set
         * @return this builder instance
         */
        public Builder isRemediationJobNeeded(Boolean isRemediationJobNeeded) {
            this.isRemediationJobNeeded = isRemediationJobNeeded;
            return this;
        }

        /** A filter to return only resources their subState matches the given subState. */
        private String subState = null;

        /**
         * A filter to return only resources their subState matches the given subState.
         *
         * @param subState the value to set
         * @return this builder instance
         */
        public Builder subState(String subState) {
            this.subState = subState;
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

        /** unique SchedulerJob identifier */
        private String id = null;

        /**
         * unique SchedulerJob identifier
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** SchedulerJob Definition identifier */
        private String defintionId = null;

        /**
         * SchedulerJob Definition identifier
         *
         * @param defintionId the value to set
         * @return this builder instance
         */
        public Builder defintionId(String defintionId) {
            this.defintionId = defintionId;
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
         * and timeScheduled is descending. Default order for displayName is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * and timeScheduled is descending. Default order for displayName is ascending.
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
        public Builder copy(ListSchedulerJobsRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            fleetId(o.getFleetId());
            timeScheduledGreaterThanOrEqualTo(o.getTimeScheduledGreaterThanOrEqualTo());
            timeScheduledLessThan(o.getTimeScheduledLessThan());
            isRemediationJobNeeded(o.getIsRemediationJobNeeded());
            subState(o.getSubState());
            displayName(o.getDisplayName());
            id(o.getId());
            defintionId(o.getDefintionId());
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
         * Build the instance of ListSchedulerJobsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSchedulerJobsRequest
         */
        public ListSchedulerJobsRequest build() {
            ListSchedulerJobsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSchedulerJobsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSchedulerJobsRequest
         */
        public ListSchedulerJobsRequest buildWithoutInvocationCallback() {
            ListSchedulerJobsRequest request = new ListSchedulerJobsRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.fleetId = fleetId;
            request.timeScheduledGreaterThanOrEqualTo = timeScheduledGreaterThanOrEqualTo;
            request.timeScheduledLessThan = timeScheduledLessThan;
            request.isRemediationJobNeeded = isRemediationJobNeeded;
            request.subState = subState;
            request.displayName = displayName;
            request.id = id;
            request.defintionId = defintionId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSchedulerJobsRequest(compartmentId, lifecycleState, fleetId,
            // timeScheduledGreaterThanOrEqualTo, timeScheduledLessThan, isRemediationJobNeeded,
            // subState, displayName, id, defintionId, limit, page, sortOrder, sortBy,
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
                .lifecycleState(lifecycleState)
                .fleetId(fleetId)
                .timeScheduledGreaterThanOrEqualTo(timeScheduledGreaterThanOrEqualTo)
                .timeScheduledLessThan(timeScheduledLessThan)
                .isRemediationJobNeeded(isRemediationJobNeeded)
                .subState(subState)
                .displayName(displayName)
                .id(id)
                .defintionId(defintionId)
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
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",timeScheduledGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeScheduledGreaterThanOrEqualTo));
        sb.append(",timeScheduledLessThan=").append(String.valueOf(this.timeScheduledLessThan));
        sb.append(",isRemediationJobNeeded=").append(String.valueOf(this.isRemediationJobNeeded));
        sb.append(",subState=").append(String.valueOf(this.subState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",defintionId=").append(String.valueOf(this.defintionId));
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
        if (!(o instanceof ListSchedulerJobsRequest)) {
            return false;
        }

        ListSchedulerJobsRequest other = (ListSchedulerJobsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(
                        this.timeScheduledGreaterThanOrEqualTo,
                        other.timeScheduledGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeScheduledLessThan, other.timeScheduledLessThan)
                && java.util.Objects.equals(
                        this.isRemediationJobNeeded, other.isRemediationJobNeeded)
                && java.util.Objects.equals(this.subState, other.subState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.defintionId, other.defintionId)
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
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
                        + (this.isRemediationJobNeeded == null
                                ? 43
                                : this.isRemediationJobNeeded.hashCode());
        result = (result * PRIME) + (this.subState == null ? 43 : this.subState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.defintionId == null ? 43 : this.defintionId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
