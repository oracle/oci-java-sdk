/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.requests;

import com.oracle.bmc.managementagent.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/managementagent/ListManagementAgentPluginsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListManagementAgentPluginsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
public class ListManagementAgentPluginsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment to which a request will be scoped.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment to which a request will be scoped.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Filter to return only Management Agent Plugins having the particular display name.
     */
    private String displayName;

    /**
     * Filter to return only Management Agent Plugins having the particular display name.
     */
    public String getDisplayName() {
        return displayName;
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
    private SortOrder sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     **/
    public enum SortOrder {
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
     * The sort order to use, either 'asc' or 'desc'.
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Default order for displayName is ascending. If no value is specified displayName is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Default order for displayName is ascending. If no value is specified displayName is default.
     *
     **/
    public enum SortBy {
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
     * The field to sort by. Default order for displayName is ascending. If no value is specified displayName is default.
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
    /**
     * Filter to return only Management Agents in the particular lifecycle state.
     */
    private com.oracle.bmc.managementagent.model.LifecycleStates lifecycleState;

    /**
     * Filter to return only Management Agents in the particular lifecycle state.
     */
    public com.oracle.bmc.managementagent.model.LifecycleStates getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Filter to return only results having the particular platform type.
     */
    private java.util.List<com.oracle.bmc.managementagent.model.PlatformTypes> platformType;

    /**
     * Filter to return only results having the particular platform type.
     */
    public java.util.List<com.oracle.bmc.managementagent.model.PlatformTypes> getPlatformType() {
        return platformType;
    }
    /**
     * The ManagementAgentID of the agent from which the Management Agents to be filtered.
     */
    private String agentId;

    /**
     * The ManagementAgentID of the agent from which the Management Agents to be filtered.
     */
    public String getAgentId() {
        return agentId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListManagementAgentPluginsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment to which a request will be scoped.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment to which a request will be scoped.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Filter to return only Management Agent Plugins having the particular display name.
         */
        private String displayName = null;

        /**
         * Filter to return only Management Agent Plugins having the particular display name.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Default order for displayName is ascending. If no value is specified displayName is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Default order for displayName is ascending. If no value is specified displayName is default.
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
         * Filter to return only Management Agents in the particular lifecycle state.
         */
        private com.oracle.bmc.managementagent.model.LifecycleStates lifecycleState = null;

        /**
         * Filter to return only Management Agents in the particular lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.managementagent.model.LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Filter to return only results having the particular platform type.
         */
        private java.util.List<com.oracle.bmc.managementagent.model.PlatformTypes> platformType =
                null;

        /**
         * Filter to return only results having the particular platform type.
         * @param platformType the value to set
         * @return this builder instance
         */
        public Builder platformType(
                java.util.List<com.oracle.bmc.managementagent.model.PlatformTypes> platformType) {
            this.platformType = platformType;
            return this;
        }

        /**
         * Singular setter. Filter to return only results having the particular platform type.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder platformType(PlatformTypes singularValue) {
            return this.platformType(java.util.Arrays.asList(singularValue));
        }

        /**
         * The ManagementAgentID of the agent from which the Management Agents to be filtered.
         */
        private String agentId = null;

        /**
         * The ManagementAgentID of the agent from which the Management Agents to be filtered.
         * @param agentId the value to set
         * @return this builder instance
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
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
        public Builder copy(ListManagementAgentPluginsRequest o) {
            compartmentId(o.getCompartmentId());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            lifecycleState(o.getLifecycleState());
            platformType(o.getPlatformType());
            agentId(o.getAgentId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListManagementAgentPluginsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListManagementAgentPluginsRequest
         */
        public ListManagementAgentPluginsRequest build() {
            ListManagementAgentPluginsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListManagementAgentPluginsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListManagementAgentPluginsRequest
         */
        public ListManagementAgentPluginsRequest buildWithoutInvocationCallback() {
            ListManagementAgentPluginsRequest request = new ListManagementAgentPluginsRequest();
            request.compartmentId = compartmentId;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            request.lifecycleState = lifecycleState;
            request.platformType = platformType;
            request.agentId = agentId;
            return request;
            // new ListManagementAgentPluginsRequest(compartmentId, displayName, limit, page, sortOrder, sortBy, opcRequestId, lifecycleState, platformType, agentId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .opcRequestId(opcRequestId)
                .lifecycleState(lifecycleState)
                .platformType(platformType)
                .agentId(agentId);
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
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",platformType=").append(String.valueOf(this.platformType));
        sb.append(",agentId=").append(String.valueOf(this.agentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListManagementAgentPluginsRequest)) {
            return false;
        }

        ListManagementAgentPluginsRequest other = (ListManagementAgentPluginsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.platformType, other.platformType)
                && java.util.Objects.equals(this.agentId, other.agentId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.platformType == null ? 43 : this.platformType.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        return result;
    }
}
