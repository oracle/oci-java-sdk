/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.requests;

import com.oracle.bmc.delegateaccesscontrol.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/delegateaccesscontrol/ListDelegatedResourceAccessRequestsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDelegatedResourceAccessRequestsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class ListDelegatedResourceAccessRequestsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * unique Delegation Control identifier
     */
    private String delegationControlId;

    /**
     * unique Delegation Control identifier
     */
    public String getDelegationControlId() {
        return delegationControlId;
    }
    /**
     * A filter to return only Delegated Resource Access Requests for the given resource identifier.
     */
    private String resourceId;

    /**
     * A filter to return only Delegated Resource Access Requests for the given resource identifier.
     */
    public String getResourceId() {
        return resourceId;
    }
    /**
     * A filter to return only Delegated Resource Access Requests whose lifecycleState matches the given Delegated Resource Access Request lifecycleState.
     */
    private com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest.LifecycleState
            lifecycleState;

    /**
     * A filter to return only Delegated Resource Access Requests whose lifecycleState matches the given Delegated Resource Access Request lifecycleState.
     */
    public com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only Delegated Resource Access Requests whose status matches the given Delegated Resource Access Request status.
     */
    private com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestStatus
            requestStatus;

    /**
     * A filter to return only Delegated Resource Access Requests whose status matches the given Delegated Resource Access Request status.
     */
    public com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestStatus
            getRequestStatus() {
        return requestStatus;
    }
    /**
     * Query start time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd parameters cannot be used together.
     *
     */
    private java.util.Date timeStart;

    /**
     * Query start time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd parameters cannot be used together.
     *
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }
    /**
     * Query end time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd parameters cannot be used together.
     *
     */
    private java.util.Date timeEnd;

    /**
     * Query end time in UTC in ISO 8601 format(inclusive).
     * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
     * timeIntervalStart and timeIntervalEnd parameters cannot be used together.
     *
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.delegateaccesscontrol.model.SortOrders sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.delegateaccesscontrol.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified, default is timeCreated.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified, default is timeCreated.
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified, default is timeCreated.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDelegatedResourceAccessRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * unique Delegation Control identifier
         */
        private String delegationControlId = null;

        /**
         * unique Delegation Control identifier
         * @param delegationControlId the value to set
         * @return this builder instance
         */
        public Builder delegationControlId(String delegationControlId) {
            this.delegationControlId = delegationControlId;
            return this;
        }

        /**
         * A filter to return only Delegated Resource Access Requests for the given resource identifier.
         */
        private String resourceId = null;

        /**
         * A filter to return only Delegated Resource Access Requests for the given resource identifier.
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * A filter to return only Delegated Resource Access Requests whose lifecycleState matches the given Delegated Resource Access Request lifecycleState.
         */
        private com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest
                        .LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only Delegated Resource Access Requests whose lifecycleState matches the given Delegated Resource Access Request lifecycleState.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequest
                                .LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only Delegated Resource Access Requests whose status matches the given Delegated Resource Access Request status.
         */
        private com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestStatus
                requestStatus = null;

        /**
         * A filter to return only Delegated Resource Access Requests whose status matches the given Delegated Resource Access Request status.
         * @param requestStatus the value to set
         * @return this builder instance
         */
        public Builder requestStatus(
                com.oracle.bmc.delegateaccesscontrol.model.DelegatedResourceAccessRequestStatus
                        requestStatus) {
            this.requestStatus = requestStatus;
            return this;
        }

        /**
         * Query start time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd parameters cannot be used together.
         *
         */
        private java.util.Date timeStart = null;

        /**
         * Query start time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd parameters cannot be used together.
         *
         * @param timeStart the value to set
         * @return this builder instance
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            return this;
        }

        /**
         * Query end time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd parameters cannot be used together.
         *
         */
        private java.util.Date timeEnd = null;

        /**
         * Query end time in UTC in ISO 8601 format(inclusive).
         * Example 2019-10-30T00:00:00Z (yyyy-MM-ddThh:mm:ssZ).
         * timeIntervalStart and timeIntervalEnd parameters cannot be used together.
         *
         * @param timeEnd the value to set
         * @return this builder instance
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         */
        private com.oracle.bmc.delegateaccesscontrol.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.delegateaccesscontrol.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified, default is timeCreated.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for displayName is ascending. If no value is specified, default is timeCreated.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(ListDelegatedResourceAccessRequestsRequest o) {
            compartmentId(o.getCompartmentId());
            delegationControlId(o.getDelegationControlId());
            resourceId(o.getResourceId());
            lifecycleState(o.getLifecycleState());
            requestStatus(o.getRequestStatus());
            timeStart(o.getTimeStart());
            timeEnd(o.getTimeEnd());
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
         * Build the instance of ListDelegatedResourceAccessRequestsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDelegatedResourceAccessRequestsRequest
         */
        public ListDelegatedResourceAccessRequestsRequest build() {
            ListDelegatedResourceAccessRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDelegatedResourceAccessRequestsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDelegatedResourceAccessRequestsRequest
         */
        public ListDelegatedResourceAccessRequestsRequest buildWithoutInvocationCallback() {
            ListDelegatedResourceAccessRequestsRequest request =
                    new ListDelegatedResourceAccessRequestsRequest();
            request.compartmentId = compartmentId;
            request.delegationControlId = delegationControlId;
            request.resourceId = resourceId;
            request.lifecycleState = lifecycleState;
            request.requestStatus = requestStatus;
            request.timeStart = timeStart;
            request.timeEnd = timeEnd;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListDelegatedResourceAccessRequestsRequest(compartmentId, delegationControlId, resourceId, lifecycleState, requestStatus, timeStart, timeEnd, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .delegationControlId(delegationControlId)
                .resourceId(resourceId)
                .lifecycleState(lifecycleState)
                .requestStatus(requestStatus)
                .timeStart(timeStart)
                .timeEnd(timeEnd)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId);
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
        sb.append(",delegationControlId=").append(String.valueOf(this.delegationControlId));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",requestStatus=").append(String.valueOf(this.requestStatus));
        sb.append(",timeStart=").append(String.valueOf(this.timeStart));
        sb.append(",timeEnd=").append(String.valueOf(this.timeEnd));
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
        if (!(o instanceof ListDelegatedResourceAccessRequestsRequest)) {
            return false;
        }

        ListDelegatedResourceAccessRequestsRequest other =
                (ListDelegatedResourceAccessRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.delegationControlId, other.delegationControlId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.requestStatus, other.requestStatus)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
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
                        + (this.delegationControlId == null
                                ? 43
                                : this.delegationControlId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.requestStatus == null ? 43 : this.requestStatus.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
