/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListCloudDbSystemsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCloudDbSystemsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListCloudDbSystemsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * dbaas parent infrastructure of the cloud DB system.
     */
    private String dbaasParentInfrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * dbaas parent infrastructure of the cloud DB system.
     */
    public String getDbaasParentInfrastructureId() {
        return dbaasParentInfrastructureId;
    }
    /** A filter to return cloud DB systems of the specified deployment type. */
    private com.oracle.bmc.databasemanagement.model.CloudDbSystemDeploymentType deploymentType;

    /** A filter to return cloud DB systems of the specified deployment type. */
    public com.oracle.bmc.databasemanagement.model.CloudDbSystemDeploymentType getDeploymentType() {
        return deploymentType;
    }
    /** A filter to only return the resources that match the entire display name. */
    private String displayName;

    /** A filter to only return the resources that match the entire display name. */
    public String getDisplayName() {
        return displayName;
    }
    /** The lifecycle state of a resource. */
    private LifecycleState lifecycleState;

    /** The lifecycle state of a resource. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Inactive("INACTIVE"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };

    /** The lifecycle state of a resource. */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The maximum number of records returned in the paginated response. */
    private Integer limit;

    /** The maximum number of records returned in the paginated response. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * {@code TIMECREATED} is descending and the default sort order for {@code DISPLAYNAME} is
     * ascending. The {@code DISPLAYNAME} sort order is case-sensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * {@code TIMECREATED} is descending and the default sort order for {@code DISPLAYNAME} is
     * ascending. The {@code DISPLAYNAME} sort order is case-sensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Displayname("DISPLAYNAME"),
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
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * {@code TIMECREATED} is descending and the default sort order for {@code DISPLAYNAME} is
     * ascending. The {@code DISPLAYNAME} sort order is case-sensitive.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCloudDbSystemsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * dbaas parent infrastructure of the cloud DB system.
         */
        private String dbaasParentInfrastructureId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * dbaas parent infrastructure of the cloud DB system.
         *
         * @param dbaasParentInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder dbaasParentInfrastructureId(String dbaasParentInfrastructureId) {
            this.dbaasParentInfrastructureId = dbaasParentInfrastructureId;
            return this;
        }

        /** A filter to return cloud DB systems of the specified deployment type. */
        private com.oracle.bmc.databasemanagement.model.CloudDbSystemDeploymentType deploymentType =
                null;

        /**
         * A filter to return cloud DB systems of the specified deployment type.
         *
         * @param deploymentType the value to set
         * @return this builder instance
         */
        public Builder deploymentType(
                com.oracle.bmc.databasemanagement.model.CloudDbSystemDeploymentType
                        deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        /** A filter to only return the resources that match the entire display name. */
        private String displayName = null;

        /**
         * A filter to only return the resources that match the entire display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The lifecycle state of a resource. */
        private LifecycleState lifecycleState = null;

        /**
         * The lifecycle state of a resource.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of records returned in the paginated response. */
        private Integer limit = null;

        /**
         * The maximum number of records returned in the paginated response.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for {@code TIMECREATED} is descending and the default sort order for {@code DISPLAYNAME}
         * is ascending. The {@code DISPLAYNAME} sort order is case-sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for {@code TIMECREATED} is descending and the default sort order for {@code DISPLAYNAME}
         * is ascending. The {@code DISPLAYNAME} sort order is case-sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Ascending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Ascending order is the default order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListCloudDbSystemsRequest o) {
            compartmentId(o.getCompartmentId());
            dbaasParentInfrastructureId(o.getDbaasParentInfrastructureId());
            deploymentType(o.getDeploymentType());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCloudDbSystemsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCloudDbSystemsRequest
         */
        public ListCloudDbSystemsRequest build() {
            ListCloudDbSystemsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCloudDbSystemsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCloudDbSystemsRequest
         */
        public ListCloudDbSystemsRequest buildWithoutInvocationCallback() {
            ListCloudDbSystemsRequest request = new ListCloudDbSystemsRequest();
            request.compartmentId = compartmentId;
            request.dbaasParentInfrastructureId = dbaasParentInfrastructureId;
            request.deploymentType = deploymentType;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListCloudDbSystemsRequest(compartmentId, dbaasParentInfrastructureId,
            // deploymentType, displayName, lifecycleState, page, limit, sortBy, sortOrder,
            // opcRequestId);
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
                .dbaasParentInfrastructureId(dbaasParentInfrastructureId)
                .deploymentType(deploymentType)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
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
        sb.append(",dbaasParentInfrastructureId=")
                .append(String.valueOf(this.dbaasParentInfrastructureId));
        sb.append(",deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
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
        if (!(o instanceof ListCloudDbSystemsRequest)) {
            return false;
        }

        ListCloudDbSystemsRequest other = (ListCloudDbSystemsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.dbaasParentInfrastructureId, other.dbaasParentInfrastructureId)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
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
                        + (this.dbaasParentInfrastructureId == null
                                ? 43
                                : this.dbaasParentInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
