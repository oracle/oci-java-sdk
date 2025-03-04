/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ListInstanceMaintenanceEventsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListInstanceMaintenanceEventsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListInstanceMaintenanceEventsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /** The OCID of the instance. */
    private String instanceId;

    /** The OCID of the instance. */
    public String getInstanceId() {
        return instanceId;
    }
    /** A filter to only return resources that match the given lifecycle state. */
    private com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState lifecycleState;

    /** A filter to only return resources that match the given lifecycle state. */
    public com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to only return resources that have a matching correlationToken. */
    private String correlationToken;

    /** A filter to only return resources that have a matching correlationToken. */
    public String getCorrelationToken() {
        return correlationToken;
    }
    /** A filter to only return resources that match the given instance action. */
    private String instanceAction;

    /** A filter to only return resources that match the given instance action. */
    public String getInstanceAction() {
        return instanceAction;
    }
    /**
     * Starting range to return the maintenances which are not completed (date-time is in
     * [RFC3339](https://tools.ietf.org/html/rfc3339) format).
     */
    private java.util.Date timeWindowStartGreaterThanOrEqualTo;

    /**
     * Starting range to return the maintenances which are not completed (date-time is in
     * [RFC3339](https://tools.ietf.org/html/rfc3339) format).
     */
    public java.util.Date getTimeWindowStartGreaterThanOrEqualTo() {
        return timeWindowStartGreaterThanOrEqualTo;
    }
    /**
     * Ending range to return the maintenances which are not completed (date-time is in
     * [RFC3339](https://tools.ietf.org/html/rfc3339) format).
     */
    private java.util.Date timeWindowStartLessThanOrEqualTo;

    /**
     * Ending range to return the maintenances which are not completed (date-time is in
     * [RFC3339](https://tools.ietf.org/html/rfc3339) format).
     */
    public java.util.Date getTimeWindowStartLessThanOrEqualTo() {
        return timeWindowStartLessThanOrEqualTo;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListInstanceMaintenanceEventsRequest, java.lang.Void> {
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

        /** The OCID of the instance. */
        private String instanceId = null;

        /**
         * The OCID of the instance.
         *
         * @param instanceId the value to set
         * @return this builder instance
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /** A filter to only return resources that match the given lifecycle state. */
        private com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState lifecycleState =
                null;

        /**
         * A filter to only return resources that match the given lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.core.model.InstanceMaintenanceEvent.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to only return resources that have a matching correlationToken. */
        private String correlationToken = null;

        /**
         * A filter to only return resources that have a matching correlationToken.
         *
         * @param correlationToken the value to set
         * @return this builder instance
         */
        public Builder correlationToken(String correlationToken) {
            this.correlationToken = correlationToken;
            return this;
        }

        /** A filter to only return resources that match the given instance action. */
        private String instanceAction = null;

        /**
         * A filter to only return resources that match the given instance action.
         *
         * @param instanceAction the value to set
         * @return this builder instance
         */
        public Builder instanceAction(String instanceAction) {
            this.instanceAction = instanceAction;
            return this;
        }

        /**
         * Starting range to return the maintenances which are not completed (date-time is in
         * [RFC3339](https://tools.ietf.org/html/rfc3339) format).
         */
        private java.util.Date timeWindowStartGreaterThanOrEqualTo = null;

        /**
         * Starting range to return the maintenances which are not completed (date-time is in
         * [RFC3339](https://tools.ietf.org/html/rfc3339) format).
         *
         * @param timeWindowStartGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeWindowStartGreaterThanOrEqualTo(
                java.util.Date timeWindowStartGreaterThanOrEqualTo) {
            this.timeWindowStartGreaterThanOrEqualTo = timeWindowStartGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Ending range to return the maintenances which are not completed (date-time is in
         * [RFC3339](https://tools.ietf.org/html/rfc3339) format).
         */
        private java.util.Date timeWindowStartLessThanOrEqualTo = null;

        /**
         * Ending range to return the maintenances which are not completed (date-time is in
         * [RFC3339](https://tools.ietf.org/html/rfc3339) format).
         *
         * @param timeWindowStartLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeWindowStartLessThanOrEqualTo(
                java.util.Date timeWindowStartLessThanOrEqualTo) {
            this.timeWindowStartLessThanOrEqualTo = timeWindowStartLessThanOrEqualTo;
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
        public Builder copy(ListInstanceMaintenanceEventsRequest o) {
            compartmentId(o.getCompartmentId());
            instanceId(o.getInstanceId());
            lifecycleState(o.getLifecycleState());
            correlationToken(o.getCorrelationToken());
            instanceAction(o.getInstanceAction());
            timeWindowStartGreaterThanOrEqualTo(o.getTimeWindowStartGreaterThanOrEqualTo());
            timeWindowStartLessThanOrEqualTo(o.getTimeWindowStartLessThanOrEqualTo());
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
         * Build the instance of ListInstanceMaintenanceEventsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListInstanceMaintenanceEventsRequest
         */
        public ListInstanceMaintenanceEventsRequest build() {
            ListInstanceMaintenanceEventsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListInstanceMaintenanceEventsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListInstanceMaintenanceEventsRequest
         */
        public ListInstanceMaintenanceEventsRequest buildWithoutInvocationCallback() {
            ListInstanceMaintenanceEventsRequest request =
                    new ListInstanceMaintenanceEventsRequest();
            request.compartmentId = compartmentId;
            request.instanceId = instanceId;
            request.lifecycleState = lifecycleState;
            request.correlationToken = correlationToken;
            request.instanceAction = instanceAction;
            request.timeWindowStartGreaterThanOrEqualTo = timeWindowStartGreaterThanOrEqualTo;
            request.timeWindowStartLessThanOrEqualTo = timeWindowStartLessThanOrEqualTo;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListInstanceMaintenanceEventsRequest(compartmentId, instanceId, lifecycleState,
            // correlationToken, instanceAction, timeWindowStartGreaterThanOrEqualTo,
            // timeWindowStartLessThanOrEqualTo, limit, page, sortBy, sortOrder, opcRequestId);
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
                .instanceId(instanceId)
                .lifecycleState(lifecycleState)
                .correlationToken(correlationToken)
                .instanceAction(instanceAction)
                .timeWindowStartGreaterThanOrEqualTo(timeWindowStartGreaterThanOrEqualTo)
                .timeWindowStartLessThanOrEqualTo(timeWindowStartLessThanOrEqualTo)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",instanceId=").append(String.valueOf(this.instanceId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",correlationToken=").append(String.valueOf(this.correlationToken));
        sb.append(",instanceAction=").append(String.valueOf(this.instanceAction));
        sb.append(",timeWindowStartGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeWindowStartGreaterThanOrEqualTo));
        sb.append(",timeWindowStartLessThanOrEqualTo=")
                .append(String.valueOf(this.timeWindowStartLessThanOrEqualTo));
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
        if (!(o instanceof ListInstanceMaintenanceEventsRequest)) {
            return false;
        }

        ListInstanceMaintenanceEventsRequest other = (ListInstanceMaintenanceEventsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.correlationToken, other.correlationToken)
                && java.util.Objects.equals(this.instanceAction, other.instanceAction)
                && java.util.Objects.equals(
                        this.timeWindowStartGreaterThanOrEqualTo,
                        other.timeWindowStartGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeWindowStartLessThanOrEqualTo,
                        other.timeWindowStartLessThanOrEqualTo)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.correlationToken == null ? 43 : this.correlationToken.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceAction == null ? 43 : this.instanceAction.hashCode());
        result =
                (result * PRIME)
                        + (this.timeWindowStartGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeWindowStartGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeWindowStartLessThanOrEqualTo == null
                                ? 43
                                : this.timeWindowStartLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
