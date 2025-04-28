/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/ListScheduledJobsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListScheduledJobsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class ListScheduledJobsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The ID of the compartment in which to list resources. */
    private String compartmentId;

    /** The ID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * <p>Example: {@code My new resource}
     */
    private String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * <p>Example: {@code My new resource}
     */
    public String getDisplayName() {
        return displayName;
    }
    /** The ID of the managed instance for which to list resources. */
    private String managedInstanceId;

    /** The ID of the managed instance for which to list resources. */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /** The ID of the managed instace group for which to list resources. */
    private String managedInstanceGroupId;

    /** The ID of the managed instace group for which to list resources. */
    public String getManagedInstanceGroupId() {
        return managedInstanceGroupId;
    }
    /** The operation type for which to list resources */
    private com.oracle.bmc.osmanagement.model.OperationTypes operationType;

    /** The operation type for which to list resources */
    public com.oracle.bmc.osmanagement.model.OperationTypes getOperationType() {
        return operationType;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'asc' or 'desc'. */
    private SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
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

    /** The sort order to use, either 'asc' or 'desc'. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
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
     * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED is
     * descending. Default order for DISPLAYNAME is ascending. If no value is specified TIMECREATED
     * is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The current lifecycle state for the object. */
    private com.oracle.bmc.osmanagement.model.LifecycleStates lifecycleState;

    /** The current lifecycle state for the object. */
    public com.oracle.bmc.osmanagement.model.LifecycleStates getLifecycleState() {
        return lifecycleState;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** The OS family for which to list resources. */
    private com.oracle.bmc.osmanagement.model.OsFamilies osFamily;

    /** The OS family for which to list resources. */
    public com.oracle.bmc.osmanagement.model.OsFamilies getOsFamily() {
        return osFamily;
    }
    /** If true, will only filter out restricted Autonomous Linux Scheduled Job */
    private Boolean isRestricted;

    /** If true, will only filter out restricted Autonomous Linux Scheduled Job */
    public Boolean getIsRestricted() {
        return isRestricted;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListScheduledJobsRequest, java.lang.Void> {
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
         * A user-friendly name. Does not have to be unique, and it's changeable.
         *
         * <p>Example: {@code My new resource}
         */
        private String displayName = null;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         *
         * <p>Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The ID of the managed instance for which to list resources. */
        private String managedInstanceId = null;

        /**
         * The ID of the managed instance for which to list resources.
         *
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /** The ID of the managed instace group for which to list resources. */
        private String managedInstanceGroupId = null;

        /**
         * The ID of the managed instace group for which to list resources.
         *
         * @param managedInstanceGroupId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceGroupId(String managedInstanceGroupId) {
            this.managedInstanceGroupId = managedInstanceGroupId;
            return this;
        }

        /** The operation type for which to list resources */
        private com.oracle.bmc.osmanagement.model.OperationTypes operationType = null;

        /**
         * The operation type for which to list resources
         *
         * @param operationType the value to set
         * @return this builder instance
         */
        public Builder operationType(
                com.oracle.bmc.osmanagement.model.OperationTypes operationType) {
            this.operationType = operationType;
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
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'asc' or 'desc'. */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED
         * is descending. Default order for DISPLAYNAME is ascending. If no value is specified
         * TIMECREATED is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for TIMECREATED
         * is descending. Default order for DISPLAYNAME is ascending. If no value is specified
         * TIMECREATED is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The current lifecycle state for the object. */
        private com.oracle.bmc.osmanagement.model.LifecycleStates lifecycleState = null;

        /**
         * The current lifecycle state for the object.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.osmanagement.model.LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
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

        /** The OS family for which to list resources. */
        private com.oracle.bmc.osmanagement.model.OsFamilies osFamily = null;

        /**
         * The OS family for which to list resources.
         *
         * @param osFamily the value to set
         * @return this builder instance
         */
        public Builder osFamily(com.oracle.bmc.osmanagement.model.OsFamilies osFamily) {
            this.osFamily = osFamily;
            return this;
        }

        /** If true, will only filter out restricted Autonomous Linux Scheduled Job */
        private Boolean isRestricted = null;

        /**
         * If true, will only filter out restricted Autonomous Linux Scheduled Job
         *
         * @param isRestricted the value to set
         * @return this builder instance
         */
        public Builder isRestricted(Boolean isRestricted) {
            this.isRestricted = isRestricted;
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
            managedInstanceId(o.getManagedInstanceId());
            managedInstanceGroupId(o.getManagedInstanceGroupId());
            operationType(o.getOperationType());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            lifecycleState(o.getLifecycleState());
            opcRequestId(o.getOpcRequestId());
            osFamily(o.getOsFamily());
            isRestricted(o.getIsRestricted());
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
            request.managedInstanceId = managedInstanceId;
            request.managedInstanceGroupId = managedInstanceGroupId;
            request.operationType = operationType;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.lifecycleState = lifecycleState;
            request.opcRequestId = opcRequestId;
            request.osFamily = osFamily;
            request.isRestricted = isRestricted;
            return request;
            // new ListScheduledJobsRequest(compartmentId, displayName, managedInstanceId,
            // managedInstanceGroupId, operationType, limit, page, sortOrder, sortBy,
            // lifecycleState, opcRequestId, osFamily, isRestricted);
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
                .managedInstanceId(managedInstanceId)
                .managedInstanceGroupId(managedInstanceGroupId)
                .operationType(operationType)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .lifecycleState(lifecycleState)
                .opcRequestId(opcRequestId)
                .osFamily(osFamily)
                .isRestricted(isRestricted);
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",managedInstanceGroupId=").append(String.valueOf(this.managedInstanceGroupId));
        sb.append(",operationType=").append(String.valueOf(this.operationType));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",osFamily=").append(String.valueOf(this.osFamily));
        sb.append(",isRestricted=").append(String.valueOf(this.isRestricted));
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
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(
                        this.managedInstanceGroupId, other.managedInstanceGroupId)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.isRestricted, other.isRestricted);
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
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceGroupId == null
                                ? 43
                                : this.managedInstanceGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.isRestricted == null ? 43 : this.isRestricted.hashCode());
        return result;
    }
}
