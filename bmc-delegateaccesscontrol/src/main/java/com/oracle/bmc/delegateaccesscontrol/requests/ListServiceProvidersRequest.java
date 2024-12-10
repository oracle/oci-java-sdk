/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.requests;

import com.oracle.bmc.delegateaccesscontrol.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/delegateaccesscontrol/ListServiceProvidersExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListServiceProvidersRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
public class ListServiceProvidersRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * A filter to return only Service Provider resources whose lifecycleState matches the given Service Provider lifecycle state.
     */
    private com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState
            lifecycleState;

    /**
     * A filter to return only Service Provider resources whose lifecycleState matches the given Service Provider lifecycle state.
     */
    public com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState
            getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return Service Provider resources that match the given name.
     */
    private String name;

    /**
     * A filter to return Service Provider resources that match the given name.
     */
    public String getName() {
        return name;
    }
    /**
     * A filter to return only Service Provider resources whose supported resource type matches the given resource type.
     */
    private com.oracle.bmc.delegateaccesscontrol.model.DelegationControlResourceType
            supportedResourceType;

    /**
     * A filter to return only Service Provider resources whose supported resource type matches the given resource type.
     */
    public com.oracle.bmc.delegateaccesscontrol.model.DelegationControlResourceType
            getSupportedResourceType() {
        return supportedResourceType;
    }
    /**
     * A filter to return only Service Provider resources whose provider type matches the given provider type.
     */
    private com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.ServiceProviderType
            serviceProviderType;

    /**
     * A filter to return only Service Provider resources whose provider type matches the given provider type.
     */
    public com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.ServiceProviderType
            getServiceProviderType() {
        return serviceProviderType;
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
    private com.oracle.bmc.delegateaccesscontrol.model.SortOrders sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     */
    public com.oracle.bmc.delegateaccesscontrol.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending. If no value is specified, timeCreated is default.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending. If no value is specified, timeCreated is default.
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending. If no value is specified, timeCreated is default.
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListServiceProvidersRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * A filter to return only Service Provider resources whose lifecycleState matches the given Service Provider lifecycle state.
         */
        private com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState
                lifecycleState = null;

        /**
         * A filter to return only Service Provider resources whose lifecycleState matches the given Service Provider lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.LifecycleState
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return Service Provider resources that match the given name.
         */
        private String name = null;

        /**
         * A filter to return Service Provider resources that match the given name.
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A filter to return only Service Provider resources whose supported resource type matches the given resource type.
         */
        private com.oracle.bmc.delegateaccesscontrol.model.DelegationControlResourceType
                supportedResourceType = null;

        /**
         * A filter to return only Service Provider resources whose supported resource type matches the given resource type.
         * @param supportedResourceType the value to set
         * @return this builder instance
         */
        public Builder supportedResourceType(
                com.oracle.bmc.delegateaccesscontrol.model.DelegationControlResourceType
                        supportedResourceType) {
            this.supportedResourceType = supportedResourceType;
            return this;
        }

        /**
         * A filter to return only Service Provider resources whose provider type matches the given provider type.
         */
        private com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.ServiceProviderType
                serviceProviderType = null;

        /**
         * A filter to return only Service Provider resources whose provider type matches the given provider type.
         * @param serviceProviderType the value to set
         * @return this builder instance
         */
        public Builder serviceProviderType(
                com.oracle.bmc.delegateaccesscontrol.model.ServiceProvider.ServiceProviderType
                        serviceProviderType) {
            this.serviceProviderType = serviceProviderType;
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
        private com.oracle.bmc.delegateaccesscontrol.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.delegateaccesscontrol.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending. If no value is specified, timeCreated is default.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated is descending. Default order for name is ascending. If no value is specified, timeCreated is default.
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
        public Builder copy(ListServiceProvidersRequest o) {
            compartmentId(o.getCompartmentId());
            lifecycleState(o.getLifecycleState());
            name(o.getName());
            supportedResourceType(o.getSupportedResourceType());
            serviceProviderType(o.getServiceProviderType());
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
         * Build the instance of ListServiceProvidersRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListServiceProvidersRequest
         */
        public ListServiceProvidersRequest build() {
            ListServiceProvidersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListServiceProvidersRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListServiceProvidersRequest
         */
        public ListServiceProvidersRequest buildWithoutInvocationCallback() {
            ListServiceProvidersRequest request = new ListServiceProvidersRequest();
            request.compartmentId = compartmentId;
            request.lifecycleState = lifecycleState;
            request.name = name;
            request.supportedResourceType = supportedResourceType;
            request.serviceProviderType = serviceProviderType;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListServiceProvidersRequest(compartmentId, lifecycleState, name, supportedResourceType, serviceProviderType, limit, page, sortOrder, sortBy, opcRequestId);
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
                .name(name)
                .supportedResourceType(supportedResourceType)
                .serviceProviderType(serviceProviderType)
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
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",supportedResourceType=").append(String.valueOf(this.supportedResourceType));
        sb.append(",serviceProviderType=").append(String.valueOf(this.serviceProviderType));
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
        if (!(o instanceof ListServiceProvidersRequest)) {
            return false;
        }

        ListServiceProvidersRequest other = (ListServiceProvidersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.supportedResourceType, other.supportedResourceType)
                && java.util.Objects.equals(this.serviceProviderType, other.serviceProviderType)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedResourceType == null
                                ? 43
                                : this.supportedResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceProviderType == null
                                ? 43
                                : this.serviceProviderType.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
