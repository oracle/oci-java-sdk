/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.requests;

import com.oracle.bmc.multicloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/multicloud/ListResourceAnchorsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListResourceAnchorsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
public class ListResourceAnchorsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * compartment linked to the resource.
     */
    private String linkedCompartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment linked to the resource.
     */
    public String getLinkedCompartmentId() {
        return linkedCompartmentId;
    }
    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState lifecycleState;

    /**
     * A filter to return only resources that match the given lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** A filter to return only resources that match the given display name exactly. */
    private String displayName;

    /** A filter to return only resources that match the given display name exactly. */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnchor.
     */
    private String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnchor.
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
    /** Check the sub-compartments of a given compartmentId */
    private Boolean isCompartmentIdInSubtree;

    /** Check the sub-compartments of a given compartmentId */
    public Boolean getIsCompartmentIdInSubtree() {
        return isCompartmentIdInSubtree;
    }
    /**
     * Whether to fetch and include the compartment name, setting this field to yes may introduce
     * additional latency.
     */
    private Boolean shouldFetchCompartmentName;

    /**
     * Whether to fetch and include the compartment name, setting this field to yes may introduce
     * additional latency.
     */
    public Boolean getShouldFetchCompartmentName() {
        return shouldFetchCompartmentName;
    }
    /** The subscription service name of the Cloud Service Provider. */
    private com.oracle.bmc.multicloud.model.SubscriptionType subscriptionServiceName;

    /** The subscription service name of the Cloud Service Provider. */
    public com.oracle.bmc.multicloud.model.SubscriptionType getSubscriptionServiceName() {
        return subscriptionServiceName;
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
                    ListResourceAnchorsRequest, java.lang.Void> {
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
         * compartment linked to the resource.
         */
        private String linkedCompartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment linked to the resource.
         *
         * @param linkedCompartmentId the value to set
         * @return this builder instance
         */
        public Builder linkedCompartmentId(String linkedCompartmentId) {
            this.linkedCompartmentId = linkedCompartmentId;
            return this;
        }

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         */
        private com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources that match the given lifecycle state. The state value
         * is case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.multicloud.model.ResourceAnchor.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
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

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnchor.
         */
        private String id = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnchor.
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

        /** Check the sub-compartments of a given compartmentId */
        private Boolean isCompartmentIdInSubtree = null;

        /**
         * Check the sub-compartments of a given compartmentId
         *
         * @param isCompartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder isCompartmentIdInSubtree(Boolean isCompartmentIdInSubtree) {
            this.isCompartmentIdInSubtree = isCompartmentIdInSubtree;
            return this;
        }

        /**
         * Whether to fetch and include the compartment name, setting this field to yes may
         * introduce additional latency.
         */
        private Boolean shouldFetchCompartmentName = null;

        /**
         * Whether to fetch and include the compartment name, setting this field to yes may
         * introduce additional latency.
         *
         * @param shouldFetchCompartmentName the value to set
         * @return this builder instance
         */
        public Builder shouldFetchCompartmentName(Boolean shouldFetchCompartmentName) {
            this.shouldFetchCompartmentName = shouldFetchCompartmentName;
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
        public Builder copy(ListResourceAnchorsRequest o) {
            compartmentId(o.getCompartmentId());
            linkedCompartmentId(o.getLinkedCompartmentId());
            lifecycleState(o.getLifecycleState());
            displayName(o.getDisplayName());
            id(o.getId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            isCompartmentIdInSubtree(o.getIsCompartmentIdInSubtree());
            shouldFetchCompartmentName(o.getShouldFetchCompartmentName());
            subscriptionServiceName(o.getSubscriptionServiceName());
            subscriptionId(o.getSubscriptionId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListResourceAnchorsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListResourceAnchorsRequest
         */
        public ListResourceAnchorsRequest build() {
            ListResourceAnchorsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListResourceAnchorsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListResourceAnchorsRequest
         */
        public ListResourceAnchorsRequest buildWithoutInvocationCallback() {
            ListResourceAnchorsRequest request = new ListResourceAnchorsRequest();
            request.compartmentId = compartmentId;
            request.linkedCompartmentId = linkedCompartmentId;
            request.lifecycleState = lifecycleState;
            request.displayName = displayName;
            request.id = id;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.isCompartmentIdInSubtree = isCompartmentIdInSubtree;
            request.shouldFetchCompartmentName = shouldFetchCompartmentName;
            request.subscriptionServiceName = subscriptionServiceName;
            request.subscriptionId = subscriptionId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListResourceAnchorsRequest(compartmentId, linkedCompartmentId, lifecycleState,
            // displayName, id, limit, page, sortOrder, sortBy, isCompartmentIdInSubtree,
            // shouldFetchCompartmentName, subscriptionServiceName, subscriptionId, opcRequestId);
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
                .linkedCompartmentId(linkedCompartmentId)
                .lifecycleState(lifecycleState)
                .displayName(displayName)
                .id(id)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .isCompartmentIdInSubtree(isCompartmentIdInSubtree)
                .shouldFetchCompartmentName(shouldFetchCompartmentName)
                .subscriptionServiceName(subscriptionServiceName)
                .subscriptionId(subscriptionId)
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
        sb.append(",linkedCompartmentId=").append(String.valueOf(this.linkedCompartmentId));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",isCompartmentIdInSubtree=")
                .append(String.valueOf(this.isCompartmentIdInSubtree));
        sb.append(",shouldFetchCompartmentName=")
                .append(String.valueOf(this.shouldFetchCompartmentName));
        sb.append(",subscriptionServiceName=").append(String.valueOf(this.subscriptionServiceName));
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListResourceAnchorsRequest)) {
            return false;
        }

        ListResourceAnchorsRequest other = (ListResourceAnchorsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.linkedCompartmentId, other.linkedCompartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(
                        this.isCompartmentIdInSubtree, other.isCompartmentIdInSubtree)
                && java.util.Objects.equals(
                        this.shouldFetchCompartmentName, other.shouldFetchCompartmentName)
                && java.util.Objects.equals(
                        this.subscriptionServiceName, other.subscriptionServiceName)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
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
                        + (this.linkedCompartmentId == null
                                ? 43
                                : this.linkedCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.isCompartmentIdInSubtree == null
                                ? 43
                                : this.isCompartmentIdInSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldFetchCompartmentName == null
                                ? 43
                                : this.shouldFetchCompartmentName.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionServiceName == null
                                ? 43
                                : this.subscriptionServiceName.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
