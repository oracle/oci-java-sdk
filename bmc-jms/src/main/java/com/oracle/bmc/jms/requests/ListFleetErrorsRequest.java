/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.requests;

import com.oracle.bmc.jms.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/jms/ListFleetErrorsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListFleetErrorsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
public class ListFleetErrorsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     *
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Flag to determine whether the info should be gathered only in the compartment or in the compartment and its subcompartments.
     *
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Flag to determine whether the info should be gathered only in the compartment or in the compartment and its subcompartments.
     *
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * The ID of the Fleet.
     */
    private String fleetId;

    /**
     * The ID of the Fleet.
     */
    public String getFleetId() {
        return fleetId;
    }
    /**
     * If specified, only errors with a first seen time earlier than this parameter will be included in the search (formatted according to RFC3339).
     */
    private java.util.Date timeFirstSeenLessThanOrEqualTo;

    /**
     * If specified, only errors with a first seen time earlier than this parameter will be included in the search (formatted according to RFC3339).
     */
    public java.util.Date getTimeFirstSeenLessThanOrEqualTo() {
        return timeFirstSeenLessThanOrEqualTo;
    }
    /**
     * If specified, only errors with a first seen time later than this parameter will be included in the search (formatted according to RFC3339).
     */
    private java.util.Date timeFirstSeenGreaterThanOrEqualTo;

    /**
     * If specified, only errors with a first seen time later than this parameter will be included in the search (formatted according to RFC3339).
     */
    public java.util.Date getTimeFirstSeenGreaterThanOrEqualTo() {
        return timeFirstSeenGreaterThanOrEqualTo;
    }
    /**
     * If specified, only errors with a last seen time earlier than this parameter will be included in the search (formatted according to RFC3339).
     */
    private java.util.Date timeLastSeenLessThanOrEqualTo;

    /**
     * If specified, only errors with a last seen time earlier than this parameter will be included in the search (formatted according to RFC3339).
     */
    public java.util.Date getTimeLastSeenLessThanOrEqualTo() {
        return timeLastSeenLessThanOrEqualTo;
    }
    /**
     * If specified, only errors with a last seen time later than this parameter will be included in the search (formatted according to RFC3339).
     */
    private java.util.Date timeLastSeenGreaterThanOrEqualTo;

    /**
     * If specified, only errors with a last seen time later than this parameter will be included in the search (formatted according to RFC3339).
     */
    public java.util.Date getTimeLastSeenGreaterThanOrEqualTo() {
        return timeLastSeenGreaterThanOrEqualTo;
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
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort FleetError. Only one sort order may be provided.
     * Default order is **descending**.
     * If no value is specified _timeLastSeen_ is default.
     *
     */
    private com.oracle.bmc.jms.model.FleetErrorSortBy sortBy;

    /**
     * The field to sort FleetError. Only one sort order may be provided.
     * Default order is **descending**.
     * If no value is specified _timeLastSeen_ is default.
     *
     */
    public com.oracle.bmc.jms.model.FleetErrorSortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order, either 'asc' or 'desc'.
     */
    private com.oracle.bmc.jms.model.SortOrder sortOrder;

    /**
     * The sort order, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.jms.model.SortOrder getSortOrder() {
        return sortOrder;
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
                    ListFleetErrorsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         *
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Flag to determine whether the info should be gathered only in the compartment or in the compartment and its subcompartments.
         *
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Flag to determine whether the info should be gathered only in the compartment or in the compartment and its subcompartments.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * The ID of the Fleet.
         */
        private String fleetId = null;

        /**
         * The ID of the Fleet.
         * @param fleetId the value to set
         * @return this builder instance
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            return this;
        }

        /**
         * If specified, only errors with a first seen time earlier than this parameter will be included in the search (formatted according to RFC3339).
         */
        private java.util.Date timeFirstSeenLessThanOrEqualTo = null;

        /**
         * If specified, only errors with a first seen time earlier than this parameter will be included in the search (formatted according to RFC3339).
         * @param timeFirstSeenLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeFirstSeenLessThanOrEqualTo(
                java.util.Date timeFirstSeenLessThanOrEqualTo) {
            this.timeFirstSeenLessThanOrEqualTo = timeFirstSeenLessThanOrEqualTo;
            return this;
        }

        /**
         * If specified, only errors with a first seen time later than this parameter will be included in the search (formatted according to RFC3339).
         */
        private java.util.Date timeFirstSeenGreaterThanOrEqualTo = null;

        /**
         * If specified, only errors with a first seen time later than this parameter will be included in the search (formatted according to RFC3339).
         * @param timeFirstSeenGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeFirstSeenGreaterThanOrEqualTo(
                java.util.Date timeFirstSeenGreaterThanOrEqualTo) {
            this.timeFirstSeenGreaterThanOrEqualTo = timeFirstSeenGreaterThanOrEqualTo;
            return this;
        }

        /**
         * If specified, only errors with a last seen time earlier than this parameter will be included in the search (formatted according to RFC3339).
         */
        private java.util.Date timeLastSeenLessThanOrEqualTo = null;

        /**
         * If specified, only errors with a last seen time earlier than this parameter will be included in the search (formatted according to RFC3339).
         * @param timeLastSeenLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLastSeenLessThanOrEqualTo(java.util.Date timeLastSeenLessThanOrEqualTo) {
            this.timeLastSeenLessThanOrEqualTo = timeLastSeenLessThanOrEqualTo;
            return this;
        }

        /**
         * If specified, only errors with a last seen time later than this parameter will be included in the search (formatted according to RFC3339).
         */
        private java.util.Date timeLastSeenGreaterThanOrEqualTo = null;

        /**
         * If specified, only errors with a last seen time later than this parameter will be included in the search (formatted according to RFC3339).
         * @param timeLastSeenGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLastSeenGreaterThanOrEqualTo(
                java.util.Date timeLastSeenGreaterThanOrEqualTo) {
            this.timeLastSeenGreaterThanOrEqualTo = timeLastSeenGreaterThanOrEqualTo;
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
         * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. The token is usually retrieved from a previous list call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort FleetError. Only one sort order may be provided.
         * Default order is **descending**.
         * If no value is specified _timeLastSeen_ is default.
         *
         */
        private com.oracle.bmc.jms.model.FleetErrorSortBy sortBy = null;

        /**
         * The field to sort FleetError. Only one sort order may be provided.
         * Default order is **descending**.
         * If no value is specified _timeLastSeen_ is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.jms.model.FleetErrorSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order, either 'asc' or 'desc'.
         */
        private com.oracle.bmc.jms.model.SortOrder sortOrder = null;

        /**
         * The sort order, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.jms.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListFleetErrorsRequest o) {
            compartmentId(o.getCompartmentId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            fleetId(o.getFleetId());
            timeFirstSeenLessThanOrEqualTo(o.getTimeFirstSeenLessThanOrEqualTo());
            timeFirstSeenGreaterThanOrEqualTo(o.getTimeFirstSeenGreaterThanOrEqualTo());
            timeLastSeenLessThanOrEqualTo(o.getTimeLastSeenLessThanOrEqualTo());
            timeLastSeenGreaterThanOrEqualTo(o.getTimeLastSeenGreaterThanOrEqualTo());
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
         * Build the instance of ListFleetErrorsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListFleetErrorsRequest
         */
        public ListFleetErrorsRequest build() {
            ListFleetErrorsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListFleetErrorsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListFleetErrorsRequest
         */
        public ListFleetErrorsRequest buildWithoutInvocationCallback() {
            ListFleetErrorsRequest request = new ListFleetErrorsRequest();
            request.compartmentId = compartmentId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.fleetId = fleetId;
            request.timeFirstSeenLessThanOrEqualTo = timeFirstSeenLessThanOrEqualTo;
            request.timeFirstSeenGreaterThanOrEqualTo = timeFirstSeenGreaterThanOrEqualTo;
            request.timeLastSeenLessThanOrEqualTo = timeLastSeenLessThanOrEqualTo;
            request.timeLastSeenGreaterThanOrEqualTo = timeLastSeenGreaterThanOrEqualTo;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListFleetErrorsRequest(compartmentId, compartmentIdInSubtree, fleetId, timeFirstSeenLessThanOrEqualTo, timeFirstSeenGreaterThanOrEqualTo, timeLastSeenLessThanOrEqualTo, timeLastSeenGreaterThanOrEqualTo, limit, page, sortBy, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .fleetId(fleetId)
                .timeFirstSeenLessThanOrEqualTo(timeFirstSeenLessThanOrEqualTo)
                .timeFirstSeenGreaterThanOrEqualTo(timeFirstSeenGreaterThanOrEqualTo)
                .timeLastSeenLessThanOrEqualTo(timeLastSeenLessThanOrEqualTo)
                .timeLastSeenGreaterThanOrEqualTo(timeLastSeenGreaterThanOrEqualTo)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",fleetId=").append(String.valueOf(this.fleetId));
        sb.append(",timeFirstSeenLessThanOrEqualTo=")
                .append(String.valueOf(this.timeFirstSeenLessThanOrEqualTo));
        sb.append(",timeFirstSeenGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeFirstSeenGreaterThanOrEqualTo));
        sb.append(",timeLastSeenLessThanOrEqualTo=")
                .append(String.valueOf(this.timeLastSeenLessThanOrEqualTo));
        sb.append(",timeLastSeenGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeLastSeenGreaterThanOrEqualTo));
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
        if (!(o instanceof ListFleetErrorsRequest)) {
            return false;
        }

        ListFleetErrorsRequest other = (ListFleetErrorsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(
                        this.timeFirstSeenLessThanOrEqualTo, other.timeFirstSeenLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeFirstSeenGreaterThanOrEqualTo,
                        other.timeFirstSeenGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeLastSeenLessThanOrEqualTo, other.timeLastSeenLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeLastSeenGreaterThanOrEqualTo,
                        other.timeLastSeenGreaterThanOrEqualTo)
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
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSeenLessThanOrEqualTo == null
                                ? 43
                                : this.timeFirstSeenLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSeenGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeFirstSeenGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSeenLessThanOrEqualTo == null
                                ? 43
                                : this.timeLastSeenLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSeenGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeLastSeenGreaterThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
