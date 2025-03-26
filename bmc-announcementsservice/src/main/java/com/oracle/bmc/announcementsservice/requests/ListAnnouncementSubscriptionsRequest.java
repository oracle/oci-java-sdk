/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.requests;

import com.oracle.bmc.announcementsservice.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/announcementsservice/ListAnnouncementSubscriptionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAnnouncementSubscriptionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
public class ListAnnouncementSubscriptionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment.
     *
     */
    private String compartmentId;

    /**
     * The OCID of the compartment.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only announcement subscriptions that match the given lifecycle state.
     */
    private com.oracle.bmc.announcementsservice.model.AnnouncementSubscription.LifecycleState
            lifecycleState;

    /**
     * A filter to return only announcement subscriptions that match the given lifecycle state.
     */
    public com.oracle.bmc.announcementsservice.model.AnnouncementSubscription.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The OCID of the announcement subscription.
     */
    private String id;

    /**
     * The OCID of the announcement subscription.
     */
    public String getId() {
        return id;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated "List" call.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, whether ascending ('ASC') or descending ('DESC').
     */
    private com.oracle.bmc.announcementsservice.model.SortOrder sortOrder;

    /**
     * The sort order to use, whether ascending ('ASC') or descending ('DESC').
     */
    public com.oracle.bmc.announcementsservice.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The criteria to sort by. You can specify only one sort order. The default sort order for the creation date of resources is descending. The default sort order for display names is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The criteria to sort by. You can specify only one sort order. The default sort order for the creation date of resources is descending. The default sort order for display names is ascending.
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
     * The criteria to sort by. You can specify only one sort order. The default sort order for the creation date of resources is descending. The default sort order for display names is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the complete request ID.
     *
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the complete request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAnnouncementSubscriptionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment.
         *
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only announcement subscriptions that match the given lifecycle state.
         */
        private com.oracle.bmc.announcementsservice.model.AnnouncementSubscription.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only announcement subscriptions that match the given lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.announcementsservice.model.AnnouncementSubscription.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The OCID of the announcement subscription.
         */
        private String id = null;

        /**
         * The OCID of the announcement subscription.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated "List" call.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, whether ascending ('ASC') or descending ('DESC').
         */
        private com.oracle.bmc.announcementsservice.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, whether ascending ('ASC') or descending ('DESC').
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.announcementsservice.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The criteria to sort by. You can specify only one sort order. The default sort order for the creation date of resources is descending. The default sort order for display names is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The criteria to sort by. You can specify only one sort order. The default sort order for the creation date of resources is descending. The default sort order for display names is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the complete request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the complete request ID.
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
        public Builder copy(ListAnnouncementSubscriptionsRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            id(o.getId());
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
         * Build the instance of ListAnnouncementSubscriptionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAnnouncementSubscriptionsRequest
         */
        public ListAnnouncementSubscriptionsRequest build() {
            ListAnnouncementSubscriptionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAnnouncementSubscriptionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAnnouncementSubscriptionsRequest
         */
        public ListAnnouncementSubscriptionsRequest buildWithoutInvocationCallback() {
            ListAnnouncementSubscriptionsRequest request =
                    new ListAnnouncementSubscriptionsRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.id = id;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAnnouncementSubscriptionsRequest(compartmentId, lifecycleState, displayName, id, limit, page, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .id(id)
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
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
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
        if (!(o instanceof ListAnnouncementSubscriptionsRequest)) {
            return false;
        }

        ListAnnouncementSubscriptionsRequest other = (ListAnnouncementSubscriptionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
