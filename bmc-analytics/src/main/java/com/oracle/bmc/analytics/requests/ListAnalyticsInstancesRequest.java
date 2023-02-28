/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.requests;

import com.oracle.bmc.analytics.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/analytics/ListAnalyticsInstancesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListAnalyticsInstancesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class ListAnalyticsInstancesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment. */
    private String compartmentId;

    /** The OCID of the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** A filter to return only resources that match the given name exactly. */
    private String name;

    /** A filter to return only resources that match the given name exactly. */
    public String getName() {
        return name;
    }
    /**
     * A filter to only return resources matching the capacity type enum. Values are
     * case-insensitive.
     */
    private com.oracle.bmc.analytics.model.CapacityType capacityType;

    /**
     * A filter to only return resources matching the capacity type enum. Values are
     * case-insensitive.
     */
    public com.oracle.bmc.analytics.model.CapacityType getCapacityType() {
        return capacityType;
    }
    /** A filter to only return resources matching the feature set. Values are case-insensitive. */
    private com.oracle.bmc.analytics.model.FeatureSet featureSet;

    /** A filter to only return resources matching the feature set. Values are case-insensitive. */
    public com.oracle.bmc.analytics.model.FeatureSet getFeatureSet() {
        return featureSet;
    }
    /**
     * A filter to only return resources matching the lifecycle state. The state value is
     * case-insensitive.
     */
    private com.oracle.bmc.analytics.model.AnalyticsInstanceLifecycleState lifecycleState;

    /**
     * A filter to only return resources matching the lifecycle state. The state value is
     * case-insensitive.
     */
    public com.oracle.bmc.analytics.model.AnalyticsInstanceLifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     * <p>Example: {@code 50}
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the previous
     * "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by (one column only). Default sort order is ascending exception of {@code
     * timeCreated} column (descending).
     */
    private com.oracle.bmc.analytics.model.SortBy sortBy;

    /**
     * The field to sort by (one column only). Default sort order is ascending exception of {@code
     * timeCreated} column (descending).
     */
    public com.oracle.bmc.analytics.model.SortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.analytics.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.analytics.model.SortOrder getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAnalyticsInstancesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** A filter to return only resources that match the given name exactly. */
        private String name = null;

        /**
         * A filter to return only resources that match the given name exactly.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A filter to only return resources matching the capacity type enum. Values are
         * case-insensitive.
         */
        private com.oracle.bmc.analytics.model.CapacityType capacityType = null;

        /**
         * A filter to only return resources matching the capacity type enum. Values are
         * case-insensitive.
         *
         * @param capacityType the value to set
         * @return this builder instance
         */
        public Builder capacityType(com.oracle.bmc.analytics.model.CapacityType capacityType) {
            this.capacityType = capacityType;
            return this;
        }

        /**
         * A filter to only return resources matching the feature set. Values are case-insensitive.
         */
        private com.oracle.bmc.analytics.model.FeatureSet featureSet = null;

        /**
         * A filter to only return resources matching the feature set. Values are case-insensitive.
         *
         * @param featureSet the value to set
         * @return this builder instance
         */
        public Builder featureSet(com.oracle.bmc.analytics.model.FeatureSet featureSet) {
            this.featureSet = featureSet;
            return this;
        }

        /**
         * A filter to only return resources matching the lifecycle state. The state value is
         * case-insensitive.
         */
        private com.oracle.bmc.analytics.model.AnalyticsInstanceLifecycleState lifecycleState =
                null;

        /**
         * A filter to only return resources matching the lifecycle state. The state value is
         * case-insensitive.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.analytics.model.AnalyticsInstanceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * <p>Example: {@code 50}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by (one column only). Default sort order is ascending exception of
         * {@code timeCreated} column (descending).
         */
        private com.oracle.bmc.analytics.model.SortBy sortBy = null;

        /**
         * The field to sort by (one column only). Default sort order is ascending exception of
         * {@code timeCreated} column (descending).
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.analytics.model.SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private com.oracle.bmc.analytics.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.analytics.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
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
        public Builder copy(ListAnalyticsInstancesRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            name(o.getName());
            capacityType(o.getCapacityType());
            featureSet(o.getFeatureSet());
            lifecycleState(o.getLifecycleState());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAnalyticsInstancesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAnalyticsInstancesRequest
         */
        public ListAnalyticsInstancesRequest build() {
            ListAnalyticsInstancesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAnalyticsInstancesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAnalyticsInstancesRequest
         */
        public ListAnalyticsInstancesRequest buildWithoutInvocationCallback() {
            ListAnalyticsInstancesRequest request = new ListAnalyticsInstancesRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.name = name;
            request.capacityType = capacityType;
            request.featureSet = featureSet;
            request.lifecycleState = lifecycleState;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListAnalyticsInstancesRequest(compartmentId, opcRequestId, name, capacityType,
            // featureSet, lifecycleState, limit, page, sortBy, sortOrder);
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
                .opcRequestId(opcRequestId)
                .name(name)
                .capacityType(capacityType)
                .featureSet(featureSet)
                .lifecycleState(lifecycleState)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",capacityType=").append(String.valueOf(this.capacityType));
        sb.append(",featureSet=").append(String.valueOf(this.featureSet));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListAnalyticsInstancesRequest)) {
            return false;
        }

        ListAnalyticsInstancesRequest other = (ListAnalyticsInstancesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.capacityType, other.capacityType)
                && java.util.Objects.equals(this.featureSet, other.featureSet)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.capacityType == null ? 43 : this.capacityType.hashCode());
        result = (result * PRIME) + (this.featureSet == null ? 43 : this.featureSet.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
