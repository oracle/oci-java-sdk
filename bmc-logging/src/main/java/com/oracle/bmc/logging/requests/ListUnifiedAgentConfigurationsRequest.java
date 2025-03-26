/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.requests;

import com.oracle.bmc.logging.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/logging/ListUnifiedAgentConfigurationsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListUnifiedAgentConfigurationsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
public class ListUnifiedAgentConfigurationsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Compartment OCID to list resources in. See compartmentIdInSubtree
     *      for nested compartments traversal.
     *
     */
    private String compartmentId;

    /**
     * Compartment OCID to list resources in. See compartmentIdInSubtree
     *      for nested compartments traversal.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Custom log OCID to list resources with the log as destination.
     *
     */
    private String logId;

    /**
     * Custom log OCID to list resources with the log as destination.
     *
     */
    public String getLogId() {
        return logId;
    }
    /**
     * Specifies whether or not nested compartments should be traversed. Defaults to false.
     */
    private Boolean isCompartmentIdInSubtree;

    /**
     * Specifies whether or not nested compartments should be traversed. Defaults to false.
     */
    public Boolean getIsCompartmentIdInSubtree() {
        return isCompartmentIdInSubtree;
    }
    /**
     * The OCID of a group or a dynamic group.
     */
    private String groupId;

    /**
     * The OCID of a group or a dynamic group.
     */
    public String getGroupId() {
        return groupId;
    }
    /**
     * Resource name.
     */
    private String displayName;

    /**
     * Resource name.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Lifecycle state of the log object
     */
    private com.oracle.bmc.logging.model.LogLifecycleState lifecycleState;

    /**
     * Lifecycle state of the log object
     */
    public com.oracle.bmc.logging.model.LogLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return in a paginated "List" call.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} or {@code opc-previous-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} or {@code opc-previous-page} response header from the previous "List" call.
     * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by (one column only). Default sort order is
     * ascending exception of {@code timeCreated} and {@code timeLastModified} columns (descending).
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by (one column only). Default sort order is
     * ascending exception of {@code timeCreated} and {@code timeLastModified} columns (descending).
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
     * The field to sort by (one column only). Default sort order is
     * ascending exception of {@code timeCreated} and {@code timeLastModified} columns (descending).
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, whether 'asc' or 'desc'.
     *
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, whether 'asc' or 'desc'.
     *
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
     * The sort order to use, whether 'asc' or 'desc'.
     *
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
     * a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListUnifiedAgentConfigurationsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Compartment OCID to list resources in. See compartmentIdInSubtree
         *      for nested compartments traversal.
         *
         */
        private String compartmentId = null;

        /**
         * Compartment OCID to list resources in. See compartmentIdInSubtree
         *      for nested compartments traversal.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Custom log OCID to list resources with the log as destination.
         *
         */
        private String logId = null;

        /**
         * Custom log OCID to list resources with the log as destination.
         *
         * @param logId the value to set
         * @return this builder instance
         */
        public Builder logId(String logId) {
            this.logId = logId;
            return this;
        }

        /**
         * Specifies whether or not nested compartments should be traversed. Defaults to false.
         */
        private Boolean isCompartmentIdInSubtree = null;

        /**
         * Specifies whether or not nested compartments should be traversed. Defaults to false.
         * @param isCompartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder isCompartmentIdInSubtree(Boolean isCompartmentIdInSubtree) {
            this.isCompartmentIdInSubtree = isCompartmentIdInSubtree;
            return this;
        }

        /**
         * The OCID of a group or a dynamic group.
         */
        private String groupId = null;

        /**
         * The OCID of a group or a dynamic group.
         * @param groupId the value to set
         * @return this builder instance
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * Resource name.
         */
        private String displayName = null;

        /**
         * Resource name.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Lifecycle state of the log object
         */
        private com.oracle.bmc.logging.model.LogLifecycleState lifecycleState = null;

        /**
         * Lifecycle state of the log object
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.logging.model.LogLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} or {@code opc-previous-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} or {@code opc-previous-page} response header from the previous "List" call.
         * For important details about how pagination works, see [List Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by (one column only). Default sort order is
         * ascending exception of {@code timeCreated} and {@code timeLastModified} columns (descending).
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by (one column only). Default sort order is
         * ascending exception of {@code timeCreated} and {@code timeLastModified} columns (descending).
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
         *
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, whether 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about
         * a particular request, please provide the request ID.
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
        public Builder copy(ListUnifiedAgentConfigurationsRequest o) {
            compartmentId(o.getCompartmentId());
            logId(o.getLogId());
            isCompartmentIdInSubtree(o.getIsCompartmentIdInSubtree());
            groupId(o.getGroupId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
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
         * Build the instance of ListUnifiedAgentConfigurationsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListUnifiedAgentConfigurationsRequest
         */
        public ListUnifiedAgentConfigurationsRequest build() {
            ListUnifiedAgentConfigurationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListUnifiedAgentConfigurationsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListUnifiedAgentConfigurationsRequest
         */
        public ListUnifiedAgentConfigurationsRequest buildWithoutInvocationCallback() {
            ListUnifiedAgentConfigurationsRequest request =
                    new ListUnifiedAgentConfigurationsRequest();
            request.compartmentId = compartmentId;
            request.logId = logId;
            request.isCompartmentIdInSubtree = isCompartmentIdInSubtree;
            request.groupId = groupId;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListUnifiedAgentConfigurationsRequest(compartmentId, logId, isCompartmentIdInSubtree, groupId, displayName, lifecycleState, limit, page, sortBy, sortOrder, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .logId(logId)
                .isCompartmentIdInSubtree(isCompartmentIdInSubtree)
                .groupId(groupId)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
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
        sb.append(",logId=").append(String.valueOf(this.logId));
        sb.append(",isCompartmentIdInSubtree=")
                .append(String.valueOf(this.isCompartmentIdInSubtree));
        sb.append(",groupId=").append(String.valueOf(this.groupId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListUnifiedAgentConfigurationsRequest)) {
            return false;
        }

        ListUnifiedAgentConfigurationsRequest other = (ListUnifiedAgentConfigurationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.logId, other.logId)
                && java.util.Objects.equals(
                        this.isCompartmentIdInSubtree, other.isCompartmentIdInSubtree)
                && java.util.Objects.equals(this.groupId, other.groupId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.logId == null ? 43 : this.logId.hashCode());
        result =
                (result * PRIME)
                        + (this.isCompartmentIdInSubtree == null
                                ? 43
                                : this.isCompartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.groupId == null ? 43 : this.groupId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
