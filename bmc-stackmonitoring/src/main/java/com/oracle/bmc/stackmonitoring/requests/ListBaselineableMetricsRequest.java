/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/ListBaselineableMetricsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListBaselineableMetricsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class ListBaselineableMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * Resource Group
     */
    private String resourceGroup;

    /**
     * Resource Group
     */
    public String getResourceGroup() {
        return resourceGroup;
    }
    /**
     * Resource Type
     */
    private String resourceType;

    /**
     * Resource Type
     */
    public String getResourceType() {
        return resourceType;
    }
    /**
     * Is the baseline enabled metric defined out of box by Oracle or by end-user
     *
     */
    private Boolean isOutOfBox;

    /**
     * Is the baseline enabled metric defined out of box by Oracle or by end-user
     *
     */
    public Boolean getIsOutOfBox() {
        return isOutOfBox;
    }
    /**
     * Metric Name
     */
    private String name;

    /**
     * Metric Name
     */
    public String getName() {
        return name;
    }
    /**
     * A filter to return monitored resource types that has the matching namespace.
     *
     */
    private String metricNamespace;

    /**
     * A filter to return monitored resource types that has the matching namespace.
     *
     */
    public String getMetricNamespace() {
        return metricNamespace;
    }
    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of results per page, or items to return in a
     * paginated "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the
     * previous "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    private String page;

    /**
     * For list pagination. The value of the {@code opc-next-page} response header from the
     * previous "List" call. For important details about how pagination works, see
     * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The ID of the compartment in which data is listed.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which data is listed.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Identifier for the metric
     */
    private String baselineableMetricId;

    /**
     * Identifier for the metric
     */
    public String getBaselineableMetricId() {
        return baselineableMetricId;
    }
    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    private com.oracle.bmc.stackmonitoring.model.SortOrder sortOrder;

    /**
     * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
     *
     */
    public com.oracle.bmc.stackmonitoring.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order is ascending.
     *
     **/
    public enum SortBy {
        Name("name"),
        Namespace("namespace"),
        ResourceGroup("resourceGroup"),
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
     * The field to sort by. Only one sort order may be provided. Default order is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListBaselineableMetricsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
         * Resource Group
         */
        private String resourceGroup = null;

        /**
         * Resource Group
         * @param resourceGroup the value to set
         * @return this builder instance
         */
        public Builder resourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * Resource Type
         */
        private String resourceType = null;

        /**
         * Resource Type
         * @param resourceType the value to set
         * @return this builder instance
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * Is the baseline enabled metric defined out of box by Oracle or by end-user
         *
         */
        private Boolean isOutOfBox = null;

        /**
         * Is the baseline enabled metric defined out of box by Oracle or by end-user
         *
         * @param isOutOfBox the value to set
         * @return this builder instance
         */
        public Builder isOutOfBox(Boolean isOutOfBox) {
            this.isOutOfBox = isOutOfBox;
            return this;
        }

        /**
         * Metric Name
         */
        private String name = null;

        /**
         * Metric Name
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * A filter to return monitored resource types that has the matching namespace.
         *
         */
        private String metricNamespace = null;

        /**
         * A filter to return monitored resource types that has the matching namespace.
         *
         * @param metricNamespace the value to set
         * @return this builder instance
         */
        public Builder metricNamespace(String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of results per page, or items to return in a
         * paginated "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
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
         * previous "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         */
        private String page = null;

        /**
         * For list pagination. The value of the {@code opc-next-page} response header from the
         * previous "List" call. For important details about how pagination works, see
         * [List Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The ID of the compartment in which data is listed.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which data is listed.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Identifier for the metric
         */
        private String baselineableMetricId = null;

        /**
         * Identifier for the metric
         * @param baselineableMetricId the value to set
         * @return this builder instance
         */
        public Builder baselineableMetricId(String baselineableMetricId) {
            this.baselineableMetricId = baselineableMetricId;
            return this;
        }

        /**
         * The sort order to use, either ascending ({@code ASC}) or descending ({@code DESC}).
         *
         */
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

        /**
         * The field to sort by. Only one sort order may be provided. Default order is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListBaselineableMetricsRequest o) {
            opcRequestId(o.getOpcRequestId());
            resourceGroup(o.getResourceGroup());
            resourceType(o.getResourceType());
            isOutOfBox(o.getIsOutOfBox());
            name(o.getName());
            metricNamespace(o.getMetricNamespace());
            limit(o.getLimit());
            page(o.getPage());
            compartmentId(o.getCompartmentId());
            baselineableMetricId(o.getBaselineableMetricId());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListBaselineableMetricsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListBaselineableMetricsRequest
         */
        public ListBaselineableMetricsRequest build() {
            ListBaselineableMetricsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListBaselineableMetricsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListBaselineableMetricsRequest
         */
        public ListBaselineableMetricsRequest buildWithoutInvocationCallback() {
            ListBaselineableMetricsRequest request = new ListBaselineableMetricsRequest();
            request.opcRequestId = opcRequestId;
            request.resourceGroup = resourceGroup;
            request.resourceType = resourceType;
            request.isOutOfBox = isOutOfBox;
            request.name = name;
            request.metricNamespace = metricNamespace;
            request.limit = limit;
            request.page = page;
            request.compartmentId = compartmentId;
            request.baselineableMetricId = baselineableMetricId;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListBaselineableMetricsRequest(opcRequestId, resourceGroup, resourceType, isOutOfBox, name, metricNamespace, limit, page, compartmentId, baselineableMetricId, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .opcRequestId(opcRequestId)
                .resourceGroup(resourceGroup)
                .resourceType(resourceType)
                .isOutOfBox(isOutOfBox)
                .name(name)
                .metricNamespace(metricNamespace)
                .limit(limit)
                .page(page)
                .compartmentId(compartmentId)
                .baselineableMetricId(baselineableMetricId)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(",resourceType=").append(String.valueOf(this.resourceType));
        sb.append(",isOutOfBox=").append(String.valueOf(this.isOutOfBox));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",metricNamespace=").append(String.valueOf(this.metricNamespace));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",baselineableMetricId=").append(String.valueOf(this.baselineableMetricId));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListBaselineableMetricsRequest)) {
            return false;
        }

        ListBaselineableMetricsRequest other = (ListBaselineableMetricsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.resourceGroup, other.resourceGroup)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.isOutOfBox, other.isOutOfBox)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.metricNamespace, other.metricNamespace)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.baselineableMetricId, other.baselineableMetricId)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.isOutOfBox == null ? 43 : this.isOutOfBox.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.metricNamespace == null ? 43 : this.metricNamespace.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.baselineableMetricId == null
                                ? 43
                                : this.baselineableMetricId.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
