/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ListDbSystemUpgradeHistoryEntriesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDbSystemUpgradeHistoryEntriesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ListDbSystemUpgradeHistoryEntriesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String dbSystemId;

    /**
     * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /**
     * The maximum number of items to return per page.
     */
    private Integer limit;

    /**
     * The maximum number of items to return per page.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The pagination token to continue listing from.
     */
    private String page;

    /**
     * The pagination token to continue listing from.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
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
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is ascending.
     *
     **/
    public enum SortBy {
        Timestarted("TIMESTARTED"),
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
     * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * A filter to return only upgradeHistoryEntries that match the specified Upgrade Action.
     */
    private com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.Action upgradeAction;

    /**
     * A filter to return only upgradeHistoryEntries that match the specified Upgrade Action.
     */
    public com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.Action
            getUpgradeAction() {
        return upgradeAction;
    }
    /**
     * A filter to return only upgrade history entries that match the given lifecycle state exactly.
     */
    private com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.LifecycleState
            lifecycleState;

    /**
     * A filter to return only upgrade history entries that match the given lifecycle state exactly.
     */
    public com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDbSystemUpgradeHistoryEntriesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String dbSystemId = null;

        /**
         * The DB system [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /**
         * The maximum number of items to return per page.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return per page.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token to continue listing from.
         */
        private String page = null;

        /**
         * The pagination token to continue listing from.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by.  You can provide one sort order ({@code sortOrder}).  Default order for TIMECREATED is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * A filter to return only upgradeHistoryEntries that match the specified Upgrade Action.
         */
        private com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.Action
                upgradeAction = null;

        /**
         * A filter to return only upgradeHistoryEntries that match the specified Upgrade Action.
         * @param upgradeAction the value to set
         * @return this builder instance
         */
        public Builder upgradeAction(
                com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.Action
                        upgradeAction) {
            this.upgradeAction = upgradeAction;
            return this;
        }

        /**
         * A filter to return only upgrade history entries that match the given lifecycle state exactly.
         */
        private com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only upgrade history entries that match the given lifecycle state exactly.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.database.model.DbSystemUpgradeHistoryEntrySummary.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(ListDbSystemUpgradeHistoryEntriesRequest o) {
            dbSystemId(o.getDbSystemId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            upgradeAction(o.getUpgradeAction());
            lifecycleState(o.getLifecycleState());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDbSystemUpgradeHistoryEntriesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDbSystemUpgradeHistoryEntriesRequest
         */
        public ListDbSystemUpgradeHistoryEntriesRequest build() {
            ListDbSystemUpgradeHistoryEntriesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDbSystemUpgradeHistoryEntriesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDbSystemUpgradeHistoryEntriesRequest
         */
        public ListDbSystemUpgradeHistoryEntriesRequest buildWithoutInvocationCallback() {
            ListDbSystemUpgradeHistoryEntriesRequest request =
                    new ListDbSystemUpgradeHistoryEntriesRequest();
            request.dbSystemId = dbSystemId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.upgradeAction = upgradeAction;
            request.lifecycleState = lifecycleState;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListDbSystemUpgradeHistoryEntriesRequest(dbSystemId, limit, page, sortOrder, sortBy, upgradeAction, lifecycleState, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbSystemId(dbSystemId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .upgradeAction(upgradeAction)
                .lifecycleState(lifecycleState)
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
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",upgradeAction=").append(String.valueOf(this.upgradeAction));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDbSystemUpgradeHistoryEntriesRequest)) {
            return false;
        }

        ListDbSystemUpgradeHistoryEntriesRequest other =
                (ListDbSystemUpgradeHistoryEntriesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.upgradeAction, other.upgradeAction)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeAction == null ? 43 : this.upgradeAction.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
