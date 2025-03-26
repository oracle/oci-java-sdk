/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/ListEventsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListEventsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class ListEventsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A filter to return only events whose summary matches the given value.
     */
    private String eventSummary;

    /**
     * A filter to return only events whose summary matches the given value.
     */
    public String getEventSummary() {
        return eventSummary;
    }
    /**
     * A filter to return only events with a summary that contains the value provided.
     */
    private String eventSummaryContains;

    /**
     * A filter to return only events with a summary that contains the value provided.
     */
    public String getEventSummaryContains() {
        return eventSummaryContains;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the event.
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the event.
     */
    public String getId() {
        return id;
    }
    /**
     * The eventFingerprint of the KernelEventData.
     */
    private String eventFingerprint;

    /**
     * The eventFingerprint of the KernelEventData.
     */
    public String getEventFingerprint() {
        return eventFingerprint;
    }
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
     * A filter to return only events that match the state provided. The state value is case-insensitive.
     *
     */
    private com.oracle.bmc.osmanagementhub.model.Event.LifecycleState lifecycleState;

    /**
     * A filter to return only events that match the state provided. The state value is case-insensitive.
     *
     */
    public com.oracle.bmc.osmanagementhub.model.Event.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource. This filter returns resources associated with the specified resource.
     */
    private String resourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource. This filter returns resources associated with the specified resource.
     */
    public String getResourceId() {
        return resourceId;
    }
    /**
     * A filter to return only resources whose type matches the given value.
     */
    private java.util.List<com.oracle.bmc.osmanagementhub.model.EventType> type;

    /**
     * A filter to return only resources whose type matches the given value.
     */
    public java.util.List<com.oracle.bmc.osmanagementhub.model.EventType> getType() {
        return type;
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
     * A filter that returns events that occurred on or before the date provided.
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * A filter that returns events that occurred on or before the date provided.
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }
    /**
     * A filter that returns events that occurred on or after the date provided.
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * A filter that returns events that occurred on or after the date provided.
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated, timeOccurredAt and timeUpdated is descending. Default order for eventSummary is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated, timeOccurredAt and timeUpdated is descending. Default order for eventSummary is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        TimeOccurredAt("timeOccurredAt"),
        TimeUpdated("timeUpdated"),
        EventSummary("eventSummary"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated, timeOccurredAt and timeUpdated is descending. Default order for eventSummary is ascending.
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
     * Indicates whether to list only resources managed by the Autonomous Linux service.
     *
     */
    private Boolean isManagedByAutonomousLinux;

    /**
     * Indicates whether to list only resources managed by the Autonomous Linux service.
     *
     */
    public Boolean getIsManagedByAutonomousLinux() {
        return isManagedByAutonomousLinux;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListEventsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * A filter to return only events whose summary matches the given value.
         */
        private String eventSummary = null;

        /**
         * A filter to return only events whose summary matches the given value.
         * @param eventSummary the value to set
         * @return this builder instance
         */
        public Builder eventSummary(String eventSummary) {
            this.eventSummary = eventSummary;
            return this;
        }

        /**
         * A filter to return only events with a summary that contains the value provided.
         */
        private String eventSummaryContains = null;

        /**
         * A filter to return only events with a summary that contains the value provided.
         * @param eventSummaryContains the value to set
         * @return this builder instance
         */
        public Builder eventSummaryContains(String eventSummaryContains) {
            this.eventSummaryContains = eventSummaryContains;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the event.
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the event.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The eventFingerprint of the KernelEventData.
         */
        private String eventFingerprint = null;

        /**
         * The eventFingerprint of the KernelEventData.
         * @param eventFingerprint the value to set
         * @return this builder instance
         */
        public Builder eventFingerprint(String eventFingerprint) {
            this.eventFingerprint = eventFingerprint;
            return this;
        }

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
         * A filter to return only events that match the state provided. The state value is case-insensitive.
         *
         */
        private com.oracle.bmc.osmanagementhub.model.Event.LifecycleState lifecycleState = null;

        /**
         * A filter to return only events that match the state provided. The state value is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.osmanagementhub.model.Event.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource. This filter returns resources associated with the specified resource.
         */
        private String resourceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource. This filter returns resources associated with the specified resource.
         * @param resourceId the value to set
         * @return this builder instance
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * A filter to return only resources whose type matches the given value.
         */
        private java.util.List<com.oracle.bmc.osmanagementhub.model.EventType> type = null;

        /**
         * A filter to return only resources whose type matches the given value.
         * @param type the value to set
         * @return this builder instance
         */
        public Builder type(java.util.List<com.oracle.bmc.osmanagementhub.model.EventType> type) {
            this.type = type;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources whose type matches the given value.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder type(EventType singularValue) {
            return this.type(java.util.Arrays.asList(singularValue));
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
         * A filter that returns events that occurred on or before the date provided.
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * A filter that returns events that occurred on or before the date provided.
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * A filter that returns events that occurred on or after the date provided.
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * A filter that returns events that occurred on or after the date provided.
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
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
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated, timeOccurredAt and timeUpdated is descending. Default order for eventSummary is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated, timeOccurredAt and timeUpdated is descending. Default order for eventSummary is ascending.
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
         * Indicates whether to list only resources managed by the Autonomous Linux service.
         *
         */
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
        public Builder copy(ListEventsRequest o) {
            eventSummary(o.getEventSummary());
            eventSummaryContains(o.getEventSummaryContains());
            id(o.getId());
            eventFingerprint(o.getEventFingerprint());
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            resourceId(o.getResourceId());
            type(o.getType());
            limit(o.getLimit());
            page(o.getPage());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            isManagedByAutonomousLinux(o.getIsManagedByAutonomousLinux());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListEventsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListEventsRequest
         */
        public ListEventsRequest build() {
            ListEventsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListEventsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListEventsRequest
         */
        public ListEventsRequest buildWithoutInvocationCallback() {
            ListEventsRequest request = new ListEventsRequest();
            request.eventSummary = eventSummary;
            request.eventSummaryContains = eventSummaryContains;
            request.id = id;
            request.eventFingerprint = eventFingerprint;
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.resourceId = resourceId;
            request.type = type;
            request.limit = limit;
            request.page = page;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.isManagedByAutonomousLinux = isManagedByAutonomousLinux;
            return request;
            // new ListEventsRequest(eventSummary, eventSummaryContains, id, eventFingerprint, compartmentId, lifecycleState, resourceId, type, limit, page, timeCreatedLessThan, timeCreatedGreaterThanOrEqualTo, sortOrder, sortBy, opcRequestId, isManagedByAutonomousLinux);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .eventSummary(eventSummary)
                .eventSummaryContains(eventSummaryContains)
                .id(id)
                .eventFingerprint(eventFingerprint)
                .compartmentId(compartmentId)
                .lifecycleState(lifecycleState)
                .resourceId(resourceId)
                .type(type)
                .limit(limit)
                .page(page)
                .timeCreatedLessThan(timeCreatedLessThan)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .isManagedByAutonomousLinux(isManagedByAutonomousLinux);
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
        sb.append(",eventSummary=").append(String.valueOf(this.eventSummary));
        sb.append(",eventSummaryContains=").append(String.valueOf(this.eventSummaryContains));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",eventFingerprint=").append(String.valueOf(this.eventFingerprint));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",resourceId=").append(String.valueOf(this.resourceId));
        sb.append(",type=").append(String.valueOf(this.type));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
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
        if (!(o instanceof ListEventsRequest)) {
            return false;
        }

        ListEventsRequest other = (ListEventsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.eventSummary, other.eventSummary)
                && java.util.Objects.equals(this.eventSummaryContains, other.eventSummaryContains)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.eventFingerprint, other.eventFingerprint)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.isManagedByAutonomousLinux, other.isManagedByAutonomousLinux);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.eventSummary == null ? 43 : this.eventSummary.hashCode());
        result =
                (result * PRIME)
                        + (this.eventSummaryContains == null
                                ? 43
                                : this.eventSummaryContains.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.eventFingerprint == null ? 43 : this.eventFingerprint.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isManagedByAutonomousLinux == null
                                ? 43
                                : this.isManagedByAutonomousLinux.hashCode());
        return result;
    }
}
