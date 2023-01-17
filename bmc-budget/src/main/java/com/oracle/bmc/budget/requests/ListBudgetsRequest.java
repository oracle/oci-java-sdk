/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.budget.requests;

import com.oracle.bmc.budget.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/budget/ListBudgetsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListBudgetsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
public class ListBudgetsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    private com.oracle.bmc.budget.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.budget.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. If not specified, the default is timeCreated.
     * The default sort order for timeCreated is DESC.
     * The default sort order for displayName is ASC in alphanumeric order.
     *
     */
    private com.oracle.bmc.budget.model.SortBy sortBy;

    /**
     * The field to sort by. If not specified, the default is timeCreated.
     * The default sort order for timeCreated is DESC.
     * The default sort order for displayName is ASC in alphanumeric order.
     *
     */
    public com.oracle.bmc.budget.model.SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The current state of the resource to filter by.
     */
    private com.oracle.bmc.budget.model.LifecycleState lifecycleState;

    /**
     * The current state of the resource to filter by.
     */
    public com.oracle.bmc.budget.model.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A user-friendly name. This does not have to be unique, and it's changeable.
     * <p>
     * Example: {@code My new resource}
     *
     */
    private String displayName;

    /**
     * A user-friendly name. This does not have to be unique, and it's changeable.
     * <p>
     * Example: {@code My new resource}
     *
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The type of target to filter by:
     *   * ALL - List all budgets
     *   * COMPARTMENT - List all budgets with targetType == "COMPARTMENT"
     *   * TAG - List all budgets with targetType == "TAG"
     *
     */
    private TargetType targetType;

    /**
     * The type of target to filter by:
     *   * ALL - List all budgets
     *   * COMPARTMENT - List all budgets with targetType == "COMPARTMENT"
     *   * TAG - List all budgets with targetType == "TAG"
     *
     **/
    public enum TargetType {
        All("ALL"),
        Compartment("COMPARTMENT"),
        Tag("TAG"),
        ;

        private final String value;
        private static java.util.Map<String, TargetType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetType v : TargetType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TargetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TargetType: " + key);
        }
    };

    /**
     * The type of target to filter by:
     *   * ALL - List all budgets
     *   * COMPARTMENT - List all budgets with targetType == "COMPARTMENT"
     *   * TAG - List all budgets with targetType == "TAG"
     *
     */
    public TargetType getTargetType() {
        return targetType;
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
                    ListBudgetsRequest, java.lang.Void> {
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
        private com.oracle.bmc.budget.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.budget.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. If not specified, the default is timeCreated.
         * The default sort order for timeCreated is DESC.
         * The default sort order for displayName is ASC in alphanumeric order.
         *
         */
        private com.oracle.bmc.budget.model.SortBy sortBy = null;

        /**
         * The field to sort by. If not specified, the default is timeCreated.
         * The default sort order for timeCreated is DESC.
         * The default sort order for displayName is ASC in alphanumeric order.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.budget.model.SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The current state of the resource to filter by.
         */
        private com.oracle.bmc.budget.model.LifecycleState lifecycleState = null;

        /**
         * The current state of the resource to filter by.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(com.oracle.bmc.budget.model.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A user-friendly name. This does not have to be unique, and it's changeable.
         * <p>
         * Example: {@code My new resource}
         *
         */
        private String displayName = null;

        /**
         * A user-friendly name. This does not have to be unique, and it's changeable.
         * <p>
         * Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The type of target to filter by:
         *   * ALL - List all budgets
         *   * COMPARTMENT - List all budgets with targetType == "COMPARTMENT"
         *   * TAG - List all budgets with targetType == "TAG"
         *
         */
        private TargetType targetType = null;

        /**
         * The type of target to filter by:
         *   * ALL - List all budgets
         *   * COMPARTMENT - List all budgets with targetType == "COMPARTMENT"
         *   * TAG - List all budgets with targetType == "TAG"
         *
         * @param targetType the value to set
         * @return this builder instance
         */
        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
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
        public Builder copy(ListBudgetsRequest o) {
            compartmentId(o.getCompartmentId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            targetType(o.getTargetType());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListBudgetsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListBudgetsRequest
         */
        public ListBudgetsRequest build() {
            ListBudgetsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListBudgetsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListBudgetsRequest
         */
        public ListBudgetsRequest buildWithoutInvocationCallback() {
            ListBudgetsRequest request = new ListBudgetsRequest();
            request.compartmentId = compartmentId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.targetType = targetType;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListBudgetsRequest(compartmentId, limit, page, sortOrder, sortBy, lifecycleState, displayName, targetType, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .targetType(targetType)
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
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",targetType=").append(String.valueOf(this.targetType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListBudgetsRequest)) {
            return false;
        }

        ListBudgetsRequest other = (ListBudgetsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
