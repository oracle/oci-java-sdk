/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.requests;

import com.oracle.bmc.multicloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/multicloud/ListNetworkAnchorsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListNetworkAnchorsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class ListNetworkAnchorsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud base compartment or sub-compartment in which to list resources. A Multicloud base
     * compartment is an OCI compartment that maps to a subscription in a Cloud Service Provider
     * (such as Azure, AWS, or Google Cloud).
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud base compartment or sub-compartment in which to list resources. A Multicloud base
     * compartment is an OCI compartment that maps to a subscription in a Cloud Service Provider
     * (such as Azure, AWS, or Google Cloud).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud subscription in which to list resources.
     */
    private String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud subscription in which to list resources.
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /** The subscription service name of the Cloud Service Provider. */
    private com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName;

    /** The subscription service name of the Cloud Service Provider. */
    public com.oracle.bmc.multicloud.model.SubscriptionType getSubscriptionServiceName() {
        return subscriptionServiceName;
    }
    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.multicloud.model.NetworkAnchor.NetworkAnchorLifecycleState
            networkAnchorLifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.multicloud.model.NetworkAnchor.NetworkAnchorLifecycleState
            getNetworkAnchorLifecycleState() {
        return networkAnchorLifecycleState;
    }
    /** A filter to return only resources that match the given display name exactly. */
    private String displayName;

    /** A filter to return only resources that match the given display name exactly. */
    public String getDisplayName() {
        return displayName;
    }
    /** The Cloud Service Provider region. */
    private String externalLocation;

    /** The Cloud Service Provider region. */
    public String getExternalLocation() {
        return externalLocation;
    }
    /** A filter to return only NetworkAnchor resources that match the given OCI subnet Id. */
    private String networkAnchorOciSubnetId;

    /** A filter to return only NetworkAnchor resources that match the given OCI subnet Id. */
    public String getNetworkAnchorOciSubnetId() {
        return networkAnchorOciSubnetId;
    }
    /**
     * If set to true, a list operation will return NetworkAnchors from all child compartments in
     * the provided compartmentId parameter.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * If set to true, a list operation will return NetworkAnchors from all child compartments in
     * the provided compartmentId parameter.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /** A filter to return only NetworkAnchor resources that match the given OCI Vcn Id. */
    private String networkAnchorOciVcnId;

    /** A filter to return only NetworkAnchor resources that match the given OCI Vcn Id. */
    public String getNetworkAnchorOciVcnId() {
        return networkAnchorOciVcnId;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * NetworkAnchor.
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * NetworkAnchor.
     */
    public String getId() {
        return id;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the opc-next-page response header from the previous "List"
     * call. For important details about how pagination works, see [List
     * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * Whether to fetch and include the vcn display name, which may introduce additional latency.
     */
    private Boolean shouldFetchVcnName;

    /**
     * Whether to fetch and include the vcn display name, which may introduce additional latency.
     */
    public Boolean getShouldFetchVcnName() {
        return shouldFetchVcnName;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.multicloud.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.multicloud.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can provide only one sort order. Default order for {@code
     * timeCreated} is descending. Default order for {@code displayName} is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can provide only one sort order. Default order for {@code
     * timeCreated} is descending. Default order for {@code displayName} is ascending.
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
     * The field to sort by. You can provide only one sort order. Default order for {@code
     * timeCreated} is descending. Default order for {@code displayName} is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID. The only valid characters for request IDs
     * are letters, numbers, underscore, and dash.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListNetworkAnchorsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud base compartment or sub-compartment in which to list resources. A Multicloud
         * base compartment is an OCI compartment that maps to a subscription in a Cloud Service
         * Provider (such as Azure, AWS, or Google Cloud).
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud base compartment or sub-compartment in which to list resources. A Multicloud
         * base compartment is an OCI compartment that maps to a subscription in a Cloud Service
         * Provider (such as Azure, AWS, or Google Cloud).
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
         * Multicloud subscription in which to list resources.
         */
        private String subscriptionId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud subscription in which to list resources.
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /** The subscription service name of the Cloud Service Provider. */
        private com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName = null;

        /**
         * The subscription service name of the Cloud Service Provider.
         *
         * @param subscriptionServiceName the value to set
         * @return this builder instance
         */
        public Builder subscriptionServiceName(
                com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName) {
            this.subscriptionServiceName = subscriptionServiceName;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         */
        private com.oracle.bmc.multicloud.model.NetworkAnchor.NetworkAnchorLifecycleState
                networkAnchorLifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         *
         * @param networkAnchorLifecycleState the value to set
         * @return this builder instance
         */
        public Builder networkAnchorLifecycleState(
                com.oracle.bmc.multicloud.model.NetworkAnchor.NetworkAnchorLifecycleState
                        networkAnchorLifecycleState) {
            this.networkAnchorLifecycleState = networkAnchorLifecycleState;
            return this;
        }

        /** A filter to return only resources that match the given display name exactly. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the given display name exactly.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /** The Cloud Service Provider region. */
        private String externalLocation = null;

        /**
         * The Cloud Service Provider region.
         *
         * @param externalLocation the value to set
         * @return this builder instance
         */
        public Builder externalLocation(String externalLocation) {
            this.externalLocation = externalLocation;
            return this;
        }

        /** A filter to return only NetworkAnchor resources that match the given OCI subnet Id. */
        private String networkAnchorOciSubnetId = null;

        /**
         * A filter to return only NetworkAnchor resources that match the given OCI subnet Id.
         *
         * @param networkAnchorOciSubnetId the value to set
         * @return this builder instance
         */
        public Builder networkAnchorOciSubnetId(String networkAnchorOciSubnetId) {
            this.networkAnchorOciSubnetId = networkAnchorOciSubnetId;
            return this;
        }

        /**
         * If set to true, a list operation will return NetworkAnchors from all child compartments
         * in the provided compartmentId parameter.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * If set to true, a list operation will return NetworkAnchors from all child compartments
         * in the provided compartmentId parameter.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /** A filter to return only NetworkAnchor resources that match the given OCI Vcn Id. */
        private String networkAnchorOciVcnId = null;

        /**
         * A filter to return only NetworkAnchor resources that match the given OCI Vcn Id.
         *
         * @param networkAnchorOciVcnId the value to set
         * @return this builder instance
         */
        public Builder networkAnchorOciVcnId(String networkAnchorOciVcnId) {
            this.networkAnchorOciVcnId = networkAnchorOciVcnId;
            return this;
        }

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * NetworkAnchor.
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * NetworkAnchor.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the opc-next-page response header from the previous
         * "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Whether to fetch and include the vcn display name, which may introduce additional
         * latency.
         */
        private Boolean shouldFetchVcnName = null;

        /**
         * Whether to fetch and include the vcn display name, which may introduce additional
         * latency.
         *
         * @param shouldFetchVcnName the value to set
         * @return this builder instance
         */
        public Builder shouldFetchVcnName(Boolean shouldFetchVcnName) {
            this.shouldFetchVcnName = shouldFetchVcnName;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private com.oracle.bmc.multicloud.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.multicloud.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code
         * timeCreated} is descending. Default order for {@code displayName} is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can provide only one sort order. Default order for {@code
         * timeCreated} is descending. Default order for {@code displayName} is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID. The only valid characters for request
         * IDs are letters, numbers, underscore, and dash.
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
        public Builder copy(ListNetworkAnchorsRequest o) {
            compartmentId(o.getCompartmentId());
            subscriptionId(o.getSubscriptionId());
            subscriptionServiceName(o.getSubscriptionServiceName());
            networkAnchorLifecycleState(o.getNetworkAnchorLifecycleState());
            displayName(o.getDisplayName());
            externalLocation(o.getExternalLocation());
            networkAnchorOciSubnetId(o.getNetworkAnchorOciSubnetId());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            networkAnchorOciVcnId(o.getNetworkAnchorOciVcnId());
            id(o.getId());
            limit(o.getLimit());
            page(o.getPage());
            shouldFetchVcnName(o.getShouldFetchVcnName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListNetworkAnchorsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListNetworkAnchorsRequest
         */
        public ListNetworkAnchorsRequest build() {
            ListNetworkAnchorsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListNetworkAnchorsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListNetworkAnchorsRequest
         */
        public ListNetworkAnchorsRequest buildWithoutInvocationCallback() {
            ListNetworkAnchorsRequest request = new ListNetworkAnchorsRequest();
            request.compartmentId = compartmentId;
            request.subscriptionId = subscriptionId;
            request.subscriptionServiceName = subscriptionServiceName;
            request.networkAnchorLifecycleState = networkAnchorLifecycleState;
            request.displayName = displayName;
            request.externalLocation = externalLocation;
            request.networkAnchorOciSubnetId = networkAnchorOciSubnetId;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.networkAnchorOciVcnId = networkAnchorOciVcnId;
            request.id = id;
            request.limit = limit;
            request.page = page;
            request.shouldFetchVcnName = shouldFetchVcnName;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListNetworkAnchorsRequest(compartmentId, subscriptionId, subscriptionServiceName,
            // networkAnchorLifecycleState, displayName, externalLocation, networkAnchorOciSubnetId,
            // compartmentIdInSubtree, networkAnchorOciVcnId, id, limit, page, shouldFetchVcnName,
            // sortOrder, sortBy, opcRequestId);
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
                .subscriptionId(subscriptionId)
                .subscriptionServiceName(subscriptionServiceName)
                .networkAnchorLifecycleState(networkAnchorLifecycleState)
                .displayName(displayName)
                .externalLocation(externalLocation)
                .networkAnchorOciSubnetId(networkAnchorOciSubnetId)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .networkAnchorOciVcnId(networkAnchorOciVcnId)
                .id(id)
                .limit(limit)
                .page(page)
                .shouldFetchVcnName(shouldFetchVcnName)
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
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",subscriptionServiceName=").append(String.valueOf(this.subscriptionServiceName));
        sb.append(",networkAnchorLifecycleState=")
                .append(String.valueOf(this.networkAnchorLifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",externalLocation=").append(String.valueOf(this.externalLocation));
        sb.append(",networkAnchorOciSubnetId=")
                .append(String.valueOf(this.networkAnchorOciSubnetId));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",networkAnchorOciVcnId=").append(String.valueOf(this.networkAnchorOciVcnId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",shouldFetchVcnName=").append(String.valueOf(this.shouldFetchVcnName));
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
        if (!(o instanceof ListNetworkAnchorsRequest)) {
            return false;
        }

        ListNetworkAnchorsRequest other = (ListNetworkAnchorsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(
                        this.subscriptionServiceName, other.subscriptionServiceName)
                && java.util.Objects.equals(
                        this.networkAnchorLifecycleState, other.networkAnchorLifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.externalLocation, other.externalLocation)
                && java.util.Objects.equals(
                        this.networkAnchorOciSubnetId, other.networkAnchorOciSubnetId)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.networkAnchorOciVcnId, other.networkAnchorOciVcnId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.shouldFetchVcnName, other.shouldFetchVcnName)
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
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionServiceName == null
                                ? 43
                                : this.subscriptionServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.networkAnchorLifecycleState == null
                                ? 43
                                : this.networkAnchorLifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.externalLocation == null ? 43 : this.externalLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.networkAnchorOciSubnetId == null
                                ? 43
                                : this.networkAnchorOciSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.networkAnchorOciVcnId == null
                                ? 43
                                : this.networkAnchorOciVcnId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldFetchVcnName == null
                                ? 43
                                : this.shouldFetchVcnName.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
