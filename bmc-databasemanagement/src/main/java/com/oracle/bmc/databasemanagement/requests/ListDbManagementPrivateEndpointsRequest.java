/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/ListDbManagementPrivateEndpointsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListDbManagementPrivateEndpointsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class ListDbManagementPrivateEndpointsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return only resources that match the entire name. */
    private String name;

    /** A filter to return only resources that match the entire name. */
    public String getName() {
        return name;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VCN.
     */
    private String vcnId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * VCN.
     */
    public String getVcnId() {
        return vcnId;
    }
    /**
     * The option to filter Database Management private endpoints that can used for Oracle Databases
     * in a cluster. This should be used along with the vcnId query parameter.
     */
    private Boolean isCluster;

    /**
     * The option to filter Database Management private endpoints that can used for Oracle Databases
     * in a cluster. This should be used along with the vcnId query parameter.
     */
    public Boolean getIsCluster() {
        return isCluster;
    }
    /**
     * The option to filter Database Management private endpoints which are endbled with DNS proxy
     * server. This should be used along with the vcnId query parameter. Only one of this parameter
     * and IsClusterDbManagementPrivateEndpointQueryParam should be set to true at one time.
     */
    private Boolean isDnsResolutionEnabled;

    /**
     * The option to filter Database Management private endpoints which are endbled with DNS proxy
     * server. This should be used along with the vcnId query parameter. Only one of this parameter
     * and IsClusterDbManagementPrivateEndpointQueryParam should be set to true at one time.
     */
    public Boolean getIsDnsResolutionEnabled() {
        return isDnsResolutionEnabled;
    }
    /** The lifecycle state of a resource. */
    private com.oracle.bmc.databasemanagement.model.LifecycleStates lifecycleState;

    /** The lifecycle state of a resource. */
    public com.oracle.bmc.databasemanagement.model.LifecycleStates getLifecycleState() {
        return lifecycleState;
    }
    /** The maximum number of records returned in the paginated response. */
    private Integer limit;

    /** The maximum number of records returned in the paginated response. */
    public Integer getLimit() {
        return limit;
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
    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     */
    private SortBy sortBy;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order for
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Timecreated("TIMECREATED"),
        Name("NAME"),
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
     * \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is
     * ascending. The \u2018NAME\u2019 sort order is case-sensitive.
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
                    ListDbManagementPrivateEndpointsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return only resources that match the entire name. */
        private String name = null;

        /**
         * A filter to return only resources that match the entire name.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VCN.
         */
        private String vcnId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * VCN.
         *
         * @param vcnId the value to set
         * @return this builder instance
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            return this;
        }

        /**
         * The option to filter Database Management private endpoints that can used for Oracle
         * Databases in a cluster. This should be used along with the vcnId query parameter.
         */
        private Boolean isCluster = null;

        /**
         * The option to filter Database Management private endpoints that can used for Oracle
         * Databases in a cluster. This should be used along with the vcnId query parameter.
         *
         * @param isCluster the value to set
         * @return this builder instance
         */
        public Builder isCluster(Boolean isCluster) {
            this.isCluster = isCluster;
            return this;
        }

        /**
         * The option to filter Database Management private endpoints which are endbled with DNS
         * proxy server. This should be used along with the vcnId query parameter. Only one of this
         * parameter and IsClusterDbManagementPrivateEndpointQueryParam should be set to true at one
         * time.
         */
        private Boolean isDnsResolutionEnabled = null;

        /**
         * The option to filter Database Management private endpoints which are endbled with DNS
         * proxy server. This should be used along with the vcnId query parameter. Only one of this
         * parameter and IsClusterDbManagementPrivateEndpointQueryParam should be set to true at one
         * time.
         *
         * @param isDnsResolutionEnabled the value to set
         * @return this builder instance
         */
        public Builder isDnsResolutionEnabled(Boolean isDnsResolutionEnabled) {
            this.isDnsResolutionEnabled = isDnsResolutionEnabled;
            return this;
        }

        /** The lifecycle state of a resource. */
        private com.oracle.bmc.databasemanagement.model.LifecycleStates lifecycleState = null;

        /**
         * The lifecycle state of a resource.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.databasemanagement.model.LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
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

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019
         * is ascending. The \u2018NAME\u2019 sort order is case-sensitive.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019
         * is ascending. The \u2018NAME\u2019 sort order is case-sensitive.
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
        public Builder copy(ListDbManagementPrivateEndpointsRequest o) {
            compartmentId(o.getCompartmentId());
            name(o.getName());
            vcnId(o.getVcnId());
            isCluster(o.getIsCluster());
            isDnsResolutionEnabled(o.getIsDnsResolutionEnabled());
            lifecycleState(o.getLifecycleState());
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
         * Build the instance of ListDbManagementPrivateEndpointsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListDbManagementPrivateEndpointsRequest
         */
        public ListDbManagementPrivateEndpointsRequest build() {
            ListDbManagementPrivateEndpointsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDbManagementPrivateEndpointsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDbManagementPrivateEndpointsRequest
         */
        public ListDbManagementPrivateEndpointsRequest buildWithoutInvocationCallback() {
            ListDbManagementPrivateEndpointsRequest request =
                    new ListDbManagementPrivateEndpointsRequest();
            request.compartmentId = compartmentId;
            request.name = name;
            request.vcnId = vcnId;
            request.isCluster = isCluster;
            request.isDnsResolutionEnabled = isDnsResolutionEnabled;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListDbManagementPrivateEndpointsRequest(compartmentId, name, vcnId, isCluster,
            // isDnsResolutionEnabled, lifecycleState, limit, page, sortOrder, sortBy,
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
                .name(name)
                .vcnId(vcnId)
                .isCluster(isCluster)
                .isDnsResolutionEnabled(isDnsResolutionEnabled)
                .lifecycleState(lifecycleState)
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
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",vcnId=").append(String.valueOf(this.vcnId));
        sb.append(",isCluster=").append(String.valueOf(this.isCluster));
        sb.append(",isDnsResolutionEnabled=").append(String.valueOf(this.isDnsResolutionEnabled));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof ListDbManagementPrivateEndpointsRequest)) {
            return false;
        }

        ListDbManagementPrivateEndpointsRequest other = (ListDbManagementPrivateEndpointsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.isCluster, other.isCluster)
                && java.util.Objects.equals(
                        this.isDnsResolutionEnabled, other.isDnsResolutionEnabled)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.isCluster == null ? 43 : this.isCluster.hashCode());
        result =
                (result * PRIME)
                        + (this.isDnsResolutionEnabled == null
                                ? 43
                                : this.isDnsResolutionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
