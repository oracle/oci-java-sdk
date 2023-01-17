/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.requests;

import com.oracle.bmc.tenantmanagercontrolplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/tenantmanagercontrolplane/ListSenderInvitationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSenderInvitationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
public class ListSenderInvitationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The tenancy that the invitation is addressed to.
     */
    private String recipientTenancyId;

    /**
     * The tenancy that the invitation is addressed to.
     */
    public String getRecipientTenancyId() {
        return recipientTenancyId;
    }
    /**
     * The lifecycle state of the resource.
     */
    private com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState;

    /**
     * The lifecycle state of the resource.
     */
    public com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The status of the sender invitation.
     */
    private com.oracle.bmc.tenantmanagercontrolplane.model.SenderInvitationStatus status;

    /**
     * The status of the sender invitation.
     */
    public com.oracle.bmc.tenantmanagercontrolplane.model.SenderInvitationStatus getStatus() {
        return status;
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
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
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
     * The field to sort by. Only one sort order can be provided.
     * * The default order for timeCreated is descending.
     * * The default order for displayName is ascending.
     * * If no value is specified, timeCreated is the default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order can be provided.
     * * The default order for timeCreated is descending.
     * * The default order for displayName is ascending.
     * * If no value is specified, timeCreated is the default.
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
     * The field to sort by. Only one sort order can be provided.
     * * The default order for timeCreated is descending.
     * * The default order for displayName is ascending.
     * * If no value is specified, timeCreated is the default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, whether 'asc' or 'desc'.
     */
    private com.oracle.bmc.tenantmanagercontrolplane.model.SortOrder sortOrder;

    /**
     * The sort order to use, whether 'asc' or 'desc'.
     */
    public com.oracle.bmc.tenantmanagercontrolplane.model.SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSenderInvitationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The tenancy that the invitation is addressed to.
         */
        private String recipientTenancyId = null;

        /**
         * The tenancy that the invitation is addressed to.
         * @param recipientTenancyId the value to set
         * @return this builder instance
         */
        public Builder recipientTenancyId(String recipientTenancyId) {
            this.recipientTenancyId = recipientTenancyId;
            return this;
        }

        /**
         * The lifecycle state of the resource.
         */
        private com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState = null;

        /**
         * The lifecycle state of the resource.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.tenantmanagercontrolplane.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The status of the sender invitation.
         */
        private com.oracle.bmc.tenantmanagercontrolplane.model.SenderInvitationStatus status = null;

        /**
         * The status of the sender invitation.
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.tenantmanagercontrolplane.model.SenderInvitationStatus status) {
            this.status = status;
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
         * The field to sort by. Only one sort order can be provided.
         * * The default order for timeCreated is descending.
         * * The default order for displayName is ascending.
         * * If no value is specified, timeCreated is the default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order can be provided.
         * * The default order for timeCreated is descending.
         * * The default order for displayName is ascending.
         * * If no value is specified, timeCreated is the default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, whether 'asc' or 'desc'.
         */
        private com.oracle.bmc.tenantmanagercontrolplane.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, whether 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(
                com.oracle.bmc.tenantmanagercontrolplane.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListSenderInvitationsRequest o) {
            compartmentId(o.getCompartmentId());
            recipientTenancyId(o.getRecipientTenancyId());
            lifecycleState(o.getLifecycleState());
            status(o.getStatus());
            displayName(o.getDisplayName());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSenderInvitationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSenderInvitationsRequest
         */
        public ListSenderInvitationsRequest build() {
            ListSenderInvitationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSenderInvitationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSenderInvitationsRequest
         */
        public ListSenderInvitationsRequest buildWithoutInvocationCallback() {
            ListSenderInvitationsRequest request = new ListSenderInvitationsRequest();
            request.compartmentId = compartmentId;
            request.recipientTenancyId = recipientTenancyId;
            request.lifecycleState = lifecycleState;
            request.status = status;
            request.displayName = displayName;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListSenderInvitationsRequest(compartmentId, recipientTenancyId, lifecycleState, status, displayName, opcRequestId, page, limit, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .recipientTenancyId(recipientTenancyId)
                .lifecycleState(lifecycleState)
                .status(status)
                .displayName(displayName)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",recipientTenancyId=").append(String.valueOf(this.recipientTenancyId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSenderInvitationsRequest)) {
            return false;
        }

        ListSenderInvitationsRequest other = (ListSenderInvitationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.recipientTenancyId, other.recipientTenancyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
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
                        + (this.recipientTenancyId == null
                                ? 43
                                : this.recipientTenancyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
