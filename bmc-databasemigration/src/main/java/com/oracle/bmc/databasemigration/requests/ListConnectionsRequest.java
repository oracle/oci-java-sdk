/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.requests;

import com.oracle.bmc.databasemigration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListConnectionsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListConnectionsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public class ListConnectionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The ID of the compartment in which to list resources.
     *
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The array of technology types.
     */
    private java.util.List<com.oracle.bmc.databasemigration.model.TechnologyType> technologyType;

    /**
     * The array of technology types.
     */
    public java.util.List<com.oracle.bmc.databasemigration.model.TechnologyType>
            getTechnologyType() {
        return technologyType;
    }
    /**
     * The array of connection types.
     */
    private java.util.List<com.oracle.bmc.databasemigration.model.ConnectionType> connectionType;

    /**
     * The array of connection types.
     */
    public java.util.List<com.oracle.bmc.databasemigration.model.ConnectionType>
            getConnectionType() {
        return connectionType;
    }
    /**
     * The OCID of the source database connection.
     */
    private String sourceConnectionId;

    /**
     * The OCID of the source database connection.
     */
    public String getSourceConnectionId() {
        return sourceConnectionId;
    }
    /**
     * A filter to return only resources that match the entire display name given.
     *
     */
    private String displayName;

    /**
     * A filter to return only resources that match the entire display name given.
     *
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The maximum number of items to return.
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     *
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
     * Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
     * Default order for displayName is ascending. If no value is specified timeCreated is default.
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
     * Default order for displayName is ascending. If no value is specified timeCreated is default.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
     */
    private com.oracle.bmc.databasemigration.model.SortOrders sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
     */
    public com.oracle.bmc.databasemigration.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The current state of the Database Migration Deployment.
     *
     */
    private com.oracle.bmc.databasemigration.model.LifecycleStates lifecycleState;

    /**
     * The current state of the Database Migration Deployment.
     *
     */
    public com.oracle.bmc.databasemigration.model.LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListConnectionsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The array of technology types.
         */
        private java.util.List<com.oracle.bmc.databasemigration.model.TechnologyType>
                technologyType = null;

        /**
         * The array of technology types.
         * @param technologyType the value to set
         * @return this builder instance
         */
        public Builder technologyType(
                java.util.List<com.oracle.bmc.databasemigration.model.TechnologyType>
                        technologyType) {
            this.technologyType = technologyType;
            return this;
        }

        /**
         * Singular setter. The array of technology types.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder technologyType(TechnologyType singularValue) {
            return this.technologyType(java.util.Arrays.asList(singularValue));
        }

        /**
         * The array of connection types.
         */
        private java.util.List<com.oracle.bmc.databasemigration.model.ConnectionType>
                connectionType = null;

        /**
         * The array of connection types.
         * @param connectionType the value to set
         * @return this builder instance
         */
        public Builder connectionType(
                java.util.List<com.oracle.bmc.databasemigration.model.ConnectionType>
                        connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Singular setter. The array of connection types.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder connectionType(ConnectionType singularValue) {
            return this.connectionType(java.util.Arrays.asList(singularValue));
        }

        /**
         * The OCID of the source database connection.
         */
        private String sourceConnectionId = null;

        /**
         * The OCID of the source database connection.
         * @param sourceConnectionId the value to set
         * @return this builder instance
         */
        public Builder sourceConnectionId(String sourceConnectionId) {
            this.sourceConnectionId = sourceConnectionId;
            return this;
        }

        /**
         * A filter to return only resources that match the entire display name given.
         *
         */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The maximum number of items to return.
         *
         */
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
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         *
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
         * Default order for displayName is ascending. If no value is specified timeCreated is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending.
         * Default order for displayName is ascending. If no value is specified timeCreated is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         */
        private com.oracle.bmc.databasemigration.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemigration.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The current state of the Database Migration Deployment.
         *
         */
        private com.oracle.bmc.databasemigration.model.LifecycleStates lifecycleState = null;

        /**
         * The current state of the Database Migration Deployment.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.databasemigration.model.LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
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
        public Builder copy(ListConnectionsRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            technologyType(o.getTechnologyType());
            connectionType(o.getConnectionType());
            sourceConnectionId(o.getSourceConnectionId());
            displayName(o.getDisplayName());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            lifecycleState(o.getLifecycleState());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListConnectionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListConnectionsRequest
         */
        public ListConnectionsRequest build() {
            ListConnectionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListConnectionsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListConnectionsRequest
         */
        public ListConnectionsRequest buildWithoutInvocationCallback() {
            ListConnectionsRequest request = new ListConnectionsRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.technologyType = technologyType;
            request.connectionType = connectionType;
            request.sourceConnectionId = sourceConnectionId;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.lifecycleState = lifecycleState;
            return request;
            // new ListConnectionsRequest(compartmentId, opcRequestId, technologyType, connectionType, sourceConnectionId, displayName, limit, page, sortBy, sortOrder, lifecycleState);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .technologyType(technologyType)
                .connectionType(connectionType)
                .sourceConnectionId(sourceConnectionId)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .lifecycleState(lifecycleState);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",technologyType=").append(String.valueOf(this.technologyType));
        sb.append(",connectionType=").append(String.valueOf(this.connectionType));
        sb.append(",sourceConnectionId=").append(String.valueOf(this.sourceConnectionId));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListConnectionsRequest)) {
            return false;
        }

        ListConnectionsRequest other = (ListConnectionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.connectionType, other.connectionType)
                && java.util.Objects.equals(this.sourceConnectionId, other.sourceConnectionId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionType == null ? 43 : this.connectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceConnectionId == null
                                ? 43
                                : this.sourceConnectionId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }
}
