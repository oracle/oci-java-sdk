/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListJmsPluginsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListJmsPluginsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class ListJmsPluginsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Flag to determine whether the info should be gathered only in the compartment or in the
     * compartment and its subcompartments.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Flag to determine whether the info should be gathered only in the compartment or in the
     * compartment and its subcompartments.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * JmsPlugin.
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * JmsPlugin.
     */
    public String getId() {
        return id;
    }
    /** The ID of the Fleet. */
    private String fleetId;

    /** The ID of the Fleet. */
    public String getFleetId() {
        return fleetId;
    }
    /**
     * The ManagementAgent (OMA) or Instance (OCA)
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that identifies
     * the Agent.
     */
    private String agentId;

    /**
     * The ManagementAgent (OMA) or Instance (OCA)
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that identifies
     * the Agent.
     */
    public String getAgentId() {
        return agentId;
    }
    /** Filter JmsPlugin with its lifecycle state. */
    private com.oracle.bmc.jms.model.JmsPluginLifecycleState lifecycleState;

    /** Filter JmsPlugin with its lifecycle state. */
    public com.oracle.bmc.jms.model.JmsPluginLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** Filter JmsPlugin with its availability status. */
    private com.oracle.bmc.jms.model.JmsPluginAvailabilityStatus availabilityStatus;

    /** Filter JmsPlugin with its availability status. */
    public com.oracle.bmc.jms.model.JmsPluginAvailabilityStatus getAvailabilityStatus() {
        return availabilityStatus;
    }
    /** Filter JmsPlugin with agent type. */
    private com.oracle.bmc.jms.model.AgentType agentType;

    /** Filter JmsPlugin with agent type. */
    public com.oracle.bmc.jms.model.AgentType getAgentType() {
        return agentType;
    }
    /**
     * If present, only plugins with a registration time before this parameter are searched
     * (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeRegisteredLessThanOrEqualTo;

    /**
     * If present, only plugins with a registration time before this parameter are searched
     * (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeRegisteredLessThanOrEqualTo() {
        return timeRegisteredLessThanOrEqualTo;
    }
    /**
     * If present, only plugins with a last seen time before this parameter are searched (formatted
     * according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    private java.util.Date timeLastSeenLessThanOrEqualTo;

    /**
     * If present, only plugins with a last seen time before this parameter are searched (formatted
     * according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    public java.util.Date getTimeLastSeenLessThanOrEqualTo() {
        return timeLastSeenLessThanOrEqualTo;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. The token is
     * usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. The token is
     * usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order, either 'asc' or 'desc'. */
    private com.oracle.bmc.jms.model.SortOrder sortOrder;

    /** The sort order, either 'asc' or 'desc'. */
    public com.oracle.bmc.jms.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort JmsPlugin. Only one sort order may be provided. Default order is
     * **descending**. If no value is specified _timeLastSeen_ is default.
     */
    private com.oracle.bmc.jms.model.JmsPluginSortBy sortBy;

    /**
     * The field to sort JmsPlugin. Only one sort order may be provided. Default order is
     * **descending**. If no value is specified _timeLastSeen_ is default.
     */
    public com.oracle.bmc.jms.model.JmsPluginSortBy getSortBy() {
        return sortBy;
    }
    /** Filter the list with hostname contains the given value. */
    private String hostnameContains;

    /** Filter the list with hostname contains the given value. */
    public String getHostnameContains() {
        return hostnameContains;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListJmsPluginsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Flag to determine whether the info should be gathered only in the compartment or in the
         * compartment and its subcompartments.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Flag to determine whether the info should be gathered only in the compartment or in the
         * compartment and its subcompartments.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * JmsPlugin.
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * JmsPlugin.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** The ID of the Fleet. */
        private String fleetId = null;

        /**
         * The ID of the Fleet.
         *
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /**
         * The ManagementAgent (OMA) or Instance (OCA)
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * identifies the Agent.
         */
        private String agentId = null;

        /**
         * The ManagementAgent (OMA) or Instance (OCA)
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * identifies the Agent.
         *
         * @param agentId the value to set
         * @return this builder instance
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /** Filter JmsPlugin with its lifecycle state. */
        private com.oracle.bmc.jms.model.JmsPluginLifecycleState lifecycleState = null;

        /**
         * Filter JmsPlugin with its lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.jms.model.JmsPluginLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** Filter JmsPlugin with its availability status. */
        private com.oracle.bmc.jms.model.JmsPluginAvailabilityStatus availabilityStatus = null;

        /**
         * Filter JmsPlugin with its availability status.
         *
         * @param availabilityStatus the value to set
         * @return this builder instance
         */
        public Builder availabilityStatus(
                com.oracle.bmc.jms.model.JmsPluginAvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            return this;
        }

        /** Filter JmsPlugin with agent type. */
        private com.oracle.bmc.jms.model.AgentType agentType = null;

        /**
         * Filter JmsPlugin with agent type.
         *
         * @param agentType the value to set
         * @return this builder instance
         */
        public Builder agentType(com.oracle.bmc.jms.model.AgentType agentType) {
            this.agentType = agentType;
            return this;
        }

        /**
         * If present, only plugins with a registration time before this parameter are searched
         * (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeRegisteredLessThanOrEqualTo = null;

        /**
         * If present, only plugins with a registration time before this parameter are searched
         * (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeRegisteredLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeRegisteredLessThanOrEqualTo(
                java.util.Date timeRegisteredLessThanOrEqualTo) {
            this.timeRegisteredLessThanOrEqualTo = timeRegisteredLessThanOrEqualTo;
            return this;
        }

        /**
         * If present, only plugins with a last seen time before this parameter are searched
         * (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        private java.util.Date timeLastSeenLessThanOrEqualTo = null;

        /**
         * If present, only plugins with a last seen time before this parameter are searched
         * (formatted according to [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeLastSeenLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLastSeenLessThanOrEqualTo(java.util.Date timeLastSeenLessThanOrEqualTo) {
            this.timeLastSeenLessThanOrEqualTo = timeLastSeenLessThanOrEqualTo;
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
         * The page token representing the page at which to start retrieving results. The token is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. The token is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order, either 'asc' or 'desc'. */
        private com.oracle.bmc.jms.model.SortOrder sortOrder = null;

        /**
         * The sort order, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.jms.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort JmsPlugin. Only one sort order may be provided. Default order is
         * **descending**. If no value is specified _timeLastSeen_ is default.
         */
        private com.oracle.bmc.jms.model.JmsPluginSortBy sortBy = null;

        /**
         * The field to sort JmsPlugin. Only one sort order may be provided. Default order is
         * **descending**. If no value is specified _timeLastSeen_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.JmsPluginSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** Filter the list with hostname contains the given value. */
        private String hostnameContains = null;

        /**
         * Filter the list with hostname contains the given value.
         *
         * @param hostnameContains the value to set
         * @return this builder instance
         */
        public Builder hostnameContains(String hostnameContains) {
            this.hostnameContains = hostnameContains;
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
        public Builder copy(ListJmsPluginsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            id(o.getId());
            fleetId(o.getFleetId());
            agentId(o.getAgentId());
            lifecycleState(o.getLifecycleState());
            availabilityStatus(o.getAvailabilityStatus());
            agentType(o.getAgentType());
            timeRegisteredLessThanOrEqualTo(o.getTimeRegisteredLessThanOrEqualTo());
            timeLastSeenLessThanOrEqualTo(o.getTimeLastSeenLessThanOrEqualTo());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            hostnameContains(o.getHostnameContains());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListJmsPluginsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListJmsPluginsRequest
         */
        public ListJmsPluginsRequest build() {
            ListJmsPluginsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListJmsPluginsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListJmsPluginsRequest
         */
        public ListJmsPluginsRequest buildWithoutInvocationCallback() {
            ListJmsPluginsRequest request = new ListJmsPluginsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.id = id;
            request.fleetId = fleetId;
            request.agentId = agentId;
            request.lifecycleState = lifecycleState;
            request.availabilityStatus = availabilityStatus;
            request.agentType = agentType;
            request.timeRegisteredLessThanOrEqualTo = timeRegisteredLessThanOrEqualTo;
            request.timeLastSeenLessThanOrEqualTo = timeLastSeenLessThanOrEqualTo;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.hostnameContains = hostnameContains;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListJmsPluginsRequest(compartmentId, compartmentIdInSubtree, id, fleetId,
            // agentId, lifecycleState, availabilityStatus, agentType,
            // timeRegisteredLessThanOrEqualTo, timeLastSeenLessThanOrEqualTo, limit, page,
            // sortOrder, sortBy, hostnameContains, opcRequestId);
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
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .id(id)
                .fleetId(fleetId)
                .agentId(agentId)
                .lifecycleState(lifecycleState)
                .availabilityStatus(availabilityStatus)
                .agentType(agentType)
                .timeRegisteredLessThanOrEqualTo(timeRegisteredLessThanOrEqualTo)
                .timeLastSeenLessThanOrEqualTo(timeLastSeenLessThanOrEqualTo)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .hostnameContains(hostnameContains)
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
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",agentId=").append(String.valueOf(this.agentId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",availabilityStatus=").append(String.valueOf(this.availabilityStatus));
        sb.append(",agentType=").append(String.valueOf(this.agentType));
        sb.append(",timeRegisteredLessThanOrEqualTo=")
                .append(String.valueOf(this.timeRegisteredLessThanOrEqualTo));
        sb.append(",timeLastSeenLessThanOrEqualTo=")
                .append(String.valueOf(this.timeLastSeenLessThanOrEqualTo));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",hostnameContains=").append(String.valueOf(this.hostnameContains));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListJmsPluginsRequest)) {
            return false;
        }

        ListJmsPluginsRequest other = (ListJmsPluginsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.availabilityStatus, other.availabilityStatus)
                && java.util.Objects.equals(this.agentType, other.agentType)
                && java.util.Objects.equals(
                        this.timeRegisteredLessThanOrEqualTo, other.timeRegisteredLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeLastSeenLessThanOrEqualTo, other.timeLastSeenLessThanOrEqualTo)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.hostnameContains, other.hostnameContains)
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
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityStatus == null
                                ? 43
                                : this.availabilityStatus.hashCode());
        result = (result * PRIME) + (this.agentType == null ? 43 : this.agentType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRegisteredLessThanOrEqualTo == null
                                ? 43
                                : this.timeRegisteredLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSeenLessThanOrEqualTo == null
                                ? 43
                                : this.timeLastSeenLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.hostnameContains == null ? 43 : this.hostnameContains.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
