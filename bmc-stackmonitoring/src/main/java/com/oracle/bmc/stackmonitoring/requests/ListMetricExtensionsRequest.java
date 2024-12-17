/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/ListMetricExtensionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMetricExtensionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class ListMetricExtensionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for resources is ascending.
     */
    private com.oracle.bmc.stackmonitoring.model.MetricExtensionSortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for resources is ascending.
     */
    public com.oracle.bmc.stackmonitoring.model.MetricExtensionSortBy getSortBy() {
        return sortBy;
    }
    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder;

    /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
    public com.oracle.bmc.stackmonitoring.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /** The ID of the compartment in which data is listed. */
    private String compartmentId;

    /** The ID of the compartment in which data is listed. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** A filter to return resources based on resource type. */
    private String resourceType;

    /** A filter to return resources based on resource type. */
    public String getResourceType() {
        return resourceType;
    }
    /** A filter to return resources based on name. */
    private String name;

    /** A filter to return resources based on name. */
    public String getName() {
        return name;
    }
    /** A filter to return resources based on status e.g. Draft or Published */
    private com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleDetails status;

    /** A filter to return resources based on status e.g. Draft or Published */
    public com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleDetails getStatus() {
        return status;
    }
    /** A filter to return metric extensions based on Lifecycle State */
    private com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates lifecycleState;

    /** A filter to return metric extensions based on Lifecycle State */
    public com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates getLifecycleState() {
        return lifecycleState;
    }
    /**
     * A filter to return metric extensions based on input resource Id on which metric extension is
     * enabled
     */
    private String enabledOnResourceId;

    /**
     * A filter to return metric extensions based on input resource Id on which metric extension is
     * enabled
     */
    public String getEnabledOnResourceId() {
        return enabledOnResourceId;
    }
    /** Identifier for the metric extension */
    private String metricExtensionId;

    /** Identifier for the metric extension */
    public String getMetricExtensionId() {
        return metricExtensionId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMetricExtensionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for resources is ascending.
         */
        private com.oracle.bmc.stackmonitoring.model.MetricExtensionSortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for resources is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(com.oracle.bmc.stackmonitoring.model.MetricExtensionSortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}). */
        private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The ID of the compartment in which data is listed. */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which data is listed.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** A filter to return resources based on resource type. */
        private String resourceType = null;

        /**
         * A filter to return resources based on resource type.
         *
         * @param resourceType the value to set
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /** A filter to return resources based on name. */
        private String name = null;

        /**
         * A filter to return resources based on name.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /** A filter to return resources based on status e.g. Draft or Published */
        private com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleDetails status = null;

        /**
         * A filter to return resources based on status e.g. Draft or Published
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(
                com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleDetails status) {
            this.status = status;
            return this;
        }

        /** A filter to return metric extensions based on Lifecycle State */
        private com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates lifecycleState =
                null;

        /**
         * A filter to return metric extensions based on Lifecycle State
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.stackmonitoring.model.MetricExtensionLifeCycleStates
                        lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * A filter to return metric extensions based on input resource Id on which metric extension
         * is enabled
         */
        private String enabledOnResourceId = null;

        /**
         * A filter to return metric extensions based on input resource Id on which metric extension
         * is enabled
         *
         * @param enabledOnResourceId the value to set
         * @return this builder instance
         */
        public Builder enabledOnResourceId(String enabledOnResourceId) {
            this.enabledOnResourceId = enabledOnResourceId;
            return this;
        }

        /** Identifier for the metric extension */
        private String metricExtensionId = null;

        /**
         * Identifier for the metric extension
         *
         * @param metricExtensionId the value to set
         * @return this builder instance
         */
        public Builder metricExtensionId(String metricExtensionId) {
            this.metricExtensionId = metricExtensionId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
        public Builder copy(ListMetricExtensionsRequest o) {
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            compartmentId(o.getCompartmentId());
            resourceType(o.getResourceType());
            name(o.getName());
            status(o.getStatus());
            lifecycleState(o.getLifecycleState());
            enabledOnResourceId(o.getEnabledOnResourceId());
            metricExtensionId(o.getMetricExtensionId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMetricExtensionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMetricExtensionsRequest
         */
        public ListMetricExtensionsRequest build() {
            ListMetricExtensionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMetricExtensionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMetricExtensionsRequest
         */
        public ListMetricExtensionsRequest buildWithoutInvocationCallback() {
            ListMetricExtensionsRequest request = new ListMetricExtensionsRequest();
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.compartmentId = compartmentId;
            request.resourceType = resourceType;
            request.name = name;
            request.status = status;
            request.lifecycleState = lifecycleState;
            request.enabledOnResourceId = enabledOnResourceId;
            request.metricExtensionId = metricExtensionId;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListMetricExtensionsRequest(limit, page, sortBy, sortOrder, compartmentId,
            // resourceType, name, status, lifecycleState, enabledOnResourceId, metricExtensionId,
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
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .compartmentId(compartmentId)
                .resourceType(resourceType)
                .name(name)
                .status(status)
                .lifecycleState(lifecycleState)
                .enabledOnResourceId(enabledOnResourceId)
                .metricExtensionId(metricExtensionId)
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
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",enabledOnResourceId=").append(String.valueOf(this.enabledOnResourceId));
        sb.append(",metricExtensionId=").append(String.valueOf(this.metricExtensionId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMetricExtensionsRequest)) {
            return false;
        }

        ListMetricExtensionsRequest other = (ListMetricExtensionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.enabledOnResourceId, other.enabledOnResourceId)
                && java.util.Objects.equals(this.metricExtensionId, other.metricExtensionId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.enabledOnResourceId == null
                                ? 43
                                : this.enabledOnResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.metricExtensionId == null ? 43 : this.metricExtensionId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
