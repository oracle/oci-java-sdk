/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.requests;

import com.oracle.bmc.goldengate.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/goldengate/ListConnectionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListConnectionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
public class ListConnectionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource the work request affects. If the work request concerns
     * multiple resources, and those resources are not in the same compartment, it is up to the
     * service team to pick the primary resource whose compartment should be used.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment that contains the work request. Work requests should be scoped to
     * the same compartment as the resource the work request affects. If the work request concerns
     * multiple resources, and those resources are not in the same compartment, it is up to the
     * service team to pick the primary resource whose compartment should be used.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The array of technology types. */
    private java.util.List<com.oracle.bmc.goldengate.model.TechnologyType> technologyType;

    /** The array of technology types. */
    public java.util.List<com.oracle.bmc.goldengate.model.TechnologyType> getTechnologyType() {
        return technologyType;
    }
    /** The array of connection types. */
    private java.util.List<com.oracle.bmc.goldengate.model.ConnectionType> connectionType;

    /** The array of connection types. */
    public java.util.List<com.oracle.bmc.goldengate.model.ConnectionType> getConnectionType() {
        return connectionType;
    }
    /** The OCID of the deployment which for the connection must be assigned. */
    private String assignedDeploymentId;

    /** The OCID of the deployment which for the connection must be assigned. */
    public String getAssignedDeploymentId() {
        return assignedDeploymentId;
    }
    /**
     * Filters for compatible connections which can be, but currently not assigned to the deployment
     * specified by its id.
     */
    private String assignableDeploymentId;

    /**
     * Filters for compatible connections which can be, but currently not assigned to the deployment
     * specified by its id.
     */
    public String getAssignableDeploymentId() {
        return assignableDeploymentId;
    }
    /**
     * Filters for connections which can be assigned to the latest version of the specified
     * deployment type.
     */
    private com.oracle.bmc.goldengate.model.DeploymentType assignableDeploymentType;

    /**
     * Filters for connections which can be assigned to the latest version of the specified
     * deployment type.
     */
    public com.oracle.bmc.goldengate.model.DeploymentType getAssignableDeploymentType() {
        return assignableDeploymentType;
    }
    /** A filter to return only connections having the 'lifecycleState' given. */
    private com.oracle.bmc.goldengate.model.Connection.LifecycleState lifecycleState;

    /** A filter to return only connections having the 'lifecycleState' given. */
    public com.oracle.bmc.goldengate.model.Connection.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only the resources that match the entire 'displayName' given. */
    private String displayName;

    /** A filter to return only the resources that match the entire 'displayName' given. */
    public String getDisplayName() {
        return displayName;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'asc' or 'desc'. */
    private com.oracle.bmc.goldengate.model.SortOrder sortOrder;

    /** The sort order to use, either 'asc' or 'desc'. */
    public com.oracle.bmc.goldengate.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order can be provided. Default order for 'timeCreated' is
     * descending. Default order for 'displayName' is ascending. If no value is specified
     * timeCreated is the default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order can be provided. Default order for 'timeCreated' is
     * descending. Default order for 'displayName' is ascending. If no value is specified
     * timeCreated is the default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The field to sort by. Only one sort order can be provided. Default order for 'timeCreated' is
     * descending. Default order for 'displayName' is ascending. If no value is specified
     * timeCreated is the default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListConnectionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment that contains the work request. Work requests should be
         * scoped to the same compartment as the resource the work request affects. If the work
         * request concerns multiple resources, and those resources are not in the same compartment,
         * it is up to the service team to pick the primary resource whose compartment should be
         * used.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment that contains the work request. Work requests should be
         * scoped to the same compartment as the resource the work request affects. If the work
         * request concerns multiple resources, and those resources are not in the same compartment,
         * it is up to the service team to pick the primary resource whose compartment should be
         * used.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The array of technology types. */
        private java.util.List<com.oracle.bmc.goldengate.model.TechnologyType> technologyType =
                null;

        /**
         * The array of technology types.
         *
         * @param technologyType the value to set
         * @return this builder instance
         */
        public Builder technologyType(
                java.util.List<com.oracle.bmc.goldengate.model.TechnologyType> technologyType) {
            this.technologyType = technologyType;
            return this;
        }

        /**
         * Singular setter. The array of technology types.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder technologyType(TechnologyType singularValue) {
            return this.technologyType(java.util.Arrays.asList(singularValue));
        }

        /** The array of connection types. */
        private java.util.List<com.oracle.bmc.goldengate.model.ConnectionType> connectionType =
                null;

        /**
         * The array of connection types.
         *
         * @param connectionType the value to set
         * @return this builder instance
         */
        public Builder connectionType(
                java.util.List<com.oracle.bmc.goldengate.model.ConnectionType> connectionType) {
            this.connectionType = connectionType;
            return this;
        }

        /**
         * Singular setter. The array of connection types.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder connectionType(ConnectionType singularValue) {
            return this.connectionType(java.util.Arrays.asList(singularValue));
        }

        /** The OCID of the deployment which for the connection must be assigned. */
        private String assignedDeploymentId = null;

        /**
         * The OCID of the deployment which for the connection must be assigned.
         *
         * @param assignedDeploymentId the value to set
         * @return this builder instance
         */
        public Builder assignedDeploymentId(String assignedDeploymentId) {
            this.assignedDeploymentId = assignedDeploymentId;
            return this;
        }

        /**
         * Filters for compatible connections which can be, but currently not assigned to the
         * deployment specified by its id.
         */
        private String assignableDeploymentId = null;

        /**
         * Filters for compatible connections which can be, but currently not assigned to the
         * deployment specified by its id.
         *
         * @param assignableDeploymentId the value to set
         * @return this builder instance
         */
        public Builder assignableDeploymentId(String assignableDeploymentId) {
            this.assignableDeploymentId = assignableDeploymentId;
            return this;
        }

        /**
         * Filters for connections which can be assigned to the latest version of the specified
         * deployment type.
         */
        private com.oracle.bmc.goldengate.model.DeploymentType assignableDeploymentType = null;

        /**
         * Filters for connections which can be assigned to the latest version of the specified
         * deployment type.
         *
         * @param assignableDeploymentType the value to set
         * @return this builder instance
         */
        public Builder assignableDeploymentType(
                com.oracle.bmc.goldengate.model.DeploymentType assignableDeploymentType) {
            this.assignableDeploymentType = assignableDeploymentType;
            return this;
        }

        /** A filter to return only connections having the 'lifecycleState' given. */
        private com.oracle.bmc.goldengate.model.Connection.LifecycleState lifecycleState = null;

        /**
         * A filter to return only connections having the 'lifecycleState' given.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.goldengate.model.Connection.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** A filter to return only the resources that match the entire 'displayName' given. */
        private String displayName = null;

        /**
         * A filter to return only the resources that match the entire 'displayName' given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'asc' or 'desc'. */
        private com.oracle.bmc.goldengate.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.goldengate.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order can be provided. Default order for
         * 'timeCreated' is descending. Default order for 'displayName' is ascending. If no value is
         * specified timeCreated is the default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order can be provided. Default order for
         * 'timeCreated' is descending. Default order for 'displayName' is ascending. If no value is
         * specified timeCreated is the default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListConnectionsRequest o) {
            compartmentId(o.getCompartmentId());
            technologyType(o.getTechnologyType());
            connectionType(o.getConnectionType());
            assignedDeploymentId(o.getAssignedDeploymentId());
            assignableDeploymentId(o.getAssignableDeploymentId());
            assignableDeploymentType(o.getAssignableDeploymentType());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
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
         * Build the instance of ListConnectionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
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
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListConnectionsRequest
         */
        public ListConnectionsRequest buildWithoutInvocationCallback() {
            ListConnectionsRequest request = new ListConnectionsRequest();
            request.compartmentId = compartmentId;
            request.technologyType = technologyType;
            request.connectionType = connectionType;
            request.assignedDeploymentId = assignedDeploymentId;
            request.assignableDeploymentId = assignableDeploymentId;
            request.assignableDeploymentType = assignableDeploymentType;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListConnectionsRequest(compartmentId, technologyType, connectionType,
            // assignedDeploymentId, assignableDeploymentId, assignableDeploymentType,
            // lifecycleState, displayName, limit, page, sortOrder, sortBy, opcRequestId);
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
                .technologyType(technologyType)
                .connectionType(connectionType)
                .assignedDeploymentId(assignedDeploymentId)
                .assignableDeploymentId(assignableDeploymentId)
                .assignableDeploymentType(assignableDeploymentType)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",technologyType=").append(String.valueOf(this.technologyType));
        sb.append(",connectionType=").append(String.valueOf(this.connectionType));
        sb.append(",assignedDeploymentId=").append(String.valueOf(this.assignedDeploymentId));
        sb.append(",assignableDeploymentId=").append(String.valueOf(this.assignableDeploymentId));
        sb.append(",assignableDeploymentType=")
                .append(String.valueOf(this.assignableDeploymentType));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
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
        if (!(o instanceof ListConnectionsRequest)) {
            return false;
        }

        ListConnectionsRequest other = (ListConnectionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.technologyType, other.technologyType)
                && java.util.Objects.equals(this.connectionType, other.connectionType)
                && java.util.Objects.equals(this.assignedDeploymentId, other.assignedDeploymentId)
                && java.util.Objects.equals(
                        this.assignableDeploymentId, other.assignableDeploymentId)
                && java.util.Objects.equals(
                        this.assignableDeploymentType, other.assignableDeploymentType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
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
                        + (this.technologyType == null ? 43 : this.technologyType.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionType == null ? 43 : this.connectionType.hashCode());
        result =
                (result * PRIME)
                        + (this.assignedDeploymentId == null
                                ? 43
                                : this.assignedDeploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.assignableDeploymentId == null
                                ? 43
                                : this.assignableDeploymentId.hashCode());
        result =
                (result * PRIME)
                        + (this.assignableDeploymentType == null
                                ? 43
                                : this.assignableDeploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
